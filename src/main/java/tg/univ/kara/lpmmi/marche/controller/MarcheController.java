package tg.univ.kara.lpmmi.marche.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tg.univ.kara.lpmmi.marche.model.Marche;
import tg.univ.kara.lpmmi.marche.repository.MarcheRepository;
import tg.univ.kara.lpmmi.marche.service.MarcheService;
import tg.univ.kara.lpmmi.marche.service.MarcheServiceImpl;

import java.util.List;

@RestController
@RequestMapping("api")
public class MarcheController {

    @Autowired
    private MarcheService marcheService;

    @GetMapping("marches")
    public List<Marche> getMarches(){
        var marches= marcheService.getMarches();
        return marches;
    }
}
