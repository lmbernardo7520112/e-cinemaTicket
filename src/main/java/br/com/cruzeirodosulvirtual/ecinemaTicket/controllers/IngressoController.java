package br.com.cruzeirodosulvirtual.ecinemaTicket.controllers;

import br.com.cruzeirodosulvirtual.ecinemaTicket.models.Ingresso;
import br.com.cruzeirodosulvirtual.ecinemaTicket.repositories.IngressoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin/ingressos")
public class IngressoController {

    @Autowired
    private IngressoRepository repository;

    @GetMapping
    public ModelAndView listar() {
        var ModelAndView  = new ModelAndView("/admin/ingressos/listar");

        ModelAndView.addObject("ingressos", repository.findAll());

        return ModelAndView;
    }

    @GetMapping("/comprar")
    public ModelAndView comprar() {
        var ModelAndView  = new ModelAndView("/admin/ingressos/form");

        ModelAndView.addObject("ingresso", new Ingresso());

        return ModelAndView;
    }

    @PostMapping("/comprar")
    public String comprar(Ingresso ingresso) {
        repository.save(ingresso);

        return "redirect:/admin/ingressos";

    }

}
