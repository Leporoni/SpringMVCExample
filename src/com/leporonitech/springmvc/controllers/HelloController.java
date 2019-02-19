package com.leporonitech.springmvc.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping("/message")
	public String message() {
		return "hello";
	}

	@RequestMapping("/serverMessage")
	public String mensagemDoServidor(Model model) {
		model.addAttribute("mensagem", new Date().toString());
		return "mensagemDoServidor";
	}

	@RequestMapping("/serverMessageV2")
	public ModelAndView mensagemDoServidor2() {
		ModelAndView resultado = new ModelAndView("mensagemDoServidor", "mensagem", "Olha a versão 2.0 aí galera!!!");
		return resultado;
	}

	@RequestMapping("/recieveMessage/{mensagem}")
	public String receberMensagem(Model model, @PathVariable("mensagem") String msg) {
		model.addAttribute("mensagem", msg);
		return "mensagemDoServidor";
	}

	@RequestMapping("/recieveMessage2")
	public String receberMensagem2(Model model,
			@RequestParam(value = "mensagem", required = false, defaultValue = "Rygar") String msg) {
		model.addAttribute("mensagem", msg);
		return "mensagemDoServidor";
	}

}
