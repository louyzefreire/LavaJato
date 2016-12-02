package br.com.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.sistema.dao.ClienteDao;
import br.com.sistema.dao.ServicoDao;
import br.com.sistema.dao.VeiculoDao;
import br.com.sistema.entidades.Servico;
import br.com.sistema.entidades.Veiculo;

@Controller
public class ServicosController {

	@Autowired
	ServicoDao servicodao;
	@Autowired
	VeiculoDao veiculodao;
	@Autowired
	ClienteDao clientedao;
	
	@RequestMapping("/novo-servico")
	public String nova(){
		return ("cadastro/pre_cadastro_servico");
	}
	
	@RequestMapping("/lista-servicos")
	public String listar(Model model){
		model.addAttribute("servicos", servicodao.todos());
		return("listagem/lista_servico");
	}
	
	@RequestMapping("pre-busca-veiculo")
	public ModelAndView cad_servico_etapa2(Veiculo veiculo) {	
		veiculo = veiculodao.porPlaca(veiculo.getPlaca());
		if(veiculo == null){
			String mensagem = "O veículo ainda não foi cadastrado!";
			ModelAndView mv = new ModelAndView("cadastro/pre_cadastro_servico");
			mv.addObject("erro",mensagem);
			return mv;
		}else{
			ModelAndView mv = new ModelAndView("cadastro/cadastro_servico");
			mv.addObject("veiculo",veiculo);
			return (mv);
		}
	}
	
	@Transactional
	@RequestMapping("salvar-servico")
	public String cadastra(Servico servico, String placa){
		servico.setVeiculo(veiculodao.porPlaca(placa));
		servicodao.adiciona(servico);
		return("index");
	}
	
}
