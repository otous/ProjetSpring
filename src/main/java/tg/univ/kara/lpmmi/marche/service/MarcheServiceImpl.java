package tg.univ.kara.lpmmi.marche.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tg.univ.kara.lpmmi.marche.model.Marche;
import tg.univ.kara.lpmmi.marche.repository.MarcheRepository;

import java.util.ArrayList;
import java.util.List;
@Component
public class MarcheServiceImpl implements MarcheService
{
    @Autowired

    private MarcheRepository marcheRepository;
    @Override
    public List<Marche> getMarches() {
        List<Marche> marche = marcheRepository.findAll();
        return marche;
    }
}
