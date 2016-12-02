package br.com.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.sistema.dao.ClienteDao;
import br.com.sistema.dao.VeiculoDao;
import br.com.sistema.entidades.Cliente;
import br.com.sistema.entidades.Veiculo;


@Controller
public class VeiculosController {

	@Autowired
	private VeiculoDao veiculodao;
	@Autowired
	private ClienteDao clientedao;
	
	@RequestMapping("/novo-veiculo")
	public String form(){
		return "cadastro/pre_cadastro";
	}
	
	@Transactional
	@RequestMapping("cadastrar-veiculo")
	public String cadastrar_veiculo(Veiculo veiculo,Cliente cliente){
		cliente = clientedao.porFone(cliente.getTelefone());
		System.out.println(clientedao.porFone(cliente.getTelefone()).getNome());
		veiculo.setCliente(cliente);
		veiculodao.adiciona(veiculo);
		return "redirect:/lista-veiculos";
	}
	
	@Transactional
	@RequestMapping("remover-veiculo")
	public String remove(String placa){
		veiculodao.remove(veiculodao.porPlaca(placa));
		return "redirect:/lista-veiculos";
	}
	
	@RequestMapping("/lista-veiculos")
	public String lista(Model model) {
		model.addAttribute("veiculos", veiculodao.todos());
		//System.out.println(model);
		return "listagem/lista_veiculo";
	}

	@RequestMapping("pre-busca")
	public ModelAndView cad_veiculo(Cliente cliente) {	
		cliente = clientedao.porFone(cliente.getTelefone());
		if(cliente == null){
			String mensagem = "O cliente ainda não foi cadastrado!";
			ModelAndView mv = new ModelAndView("cadastro/pre_cadastro");
			mv.addObject("erro",mensagem);
			return mv;
		}else{
			ModelAndView mv = new ModelAndView("cadastro/cadastro_veiculo");
			mv.addObject("cliente",cliente);
			return (mv);
		}
	}
	
	@RequestMapping("form-atualiza-veiculo")
	public ModelAndView atualiza_veiculo(String placa){
		ModelAndView cliente = new ModelAndView("formulario/atualiza_veiculo");
		cliente.addObject("veiculo", veiculodao.porPlaca(placa));
		return cliente;
	}
	
	@Transactional
	@RequestMapping("atualizar-veiculo")
	public String atualizacao_veiculo(Veiculo veiculo,String cor_novo, String modelo_novo){
			veiculo = veiculodao.porPlaca(veiculo.getPlaca());
			veiculo.setCor(cor_novo);
			veiculo.setModelo(modelo_novo);
			veiculodao.altera(veiculo);
		return "redirect:/lista-veiculos";
	}	
}
