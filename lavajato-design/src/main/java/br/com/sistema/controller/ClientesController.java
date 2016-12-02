package br.com.sistema.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.sistema.dao.ClienteDao;
import br.com.sistema.entidades.Cliente;

@Controller
public class ClientesController {
	
	@Autowired
	private ClienteDao dao; 
	
	@RequestMapping("/novo-cliente")
	public String form(){
		return "cadastro/cadastro_cliente";
	}
	@Transactional 
	@RequestMapping("cadastrar-cliente")
	public String adiciona(@Valid Cliente cliente,BindingResult result){
		if(result.hasErrors()){
			System.out.println("Erro no cadastro");
			return "cadastro/cadastro_cliente"; 
		}
		dao.adiciona(cliente);
		return "redirect:/lista-clientes";
	}
	
	@RequestMapping("/lista-clientes")
	public String lista(Model model) {
		model.addAttribute("clientes", dao.todos());
		return "listagem/lista_cliente";
	}
	
	@Transactional
	@RequestMapping("remover-cliente")
	public String remove(String telefone){
		dao.remove(dao.porFone(telefone));
		return "redirect:/lista-clientes";
	}
	
	@RequestMapping("form-atualiza-cliente")
	public ModelAndView atualiza_dados(String telefone){
		ModelAndView cliente = new ModelAndView("formulario/atualiza_cliente");
		cliente.addObject("cliente", dao.porFone(telefone));
		return cliente;
	}
	
	@Transactional
	@RequestMapping("atualizar-cliente")
	public String atualizacao_cliente(Cliente cliente,String nome_novo,String telefone_novo){
		if(telefone_novo == cliente.getTelefone()){
			cliente.setNome(nome_novo);
			dao.altera(cliente);
		}
		else{
			cliente = dao.porFone(cliente.getTelefone());
			cliente.setNome(nome_novo);
			cliente.setTelefone(telefone_novo);
			dao.altera(cliente);
		}
		return "redirect:/lista-clientes";
	}	
}


