package tg.univ.kara.lpmmi.marche.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Marche {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private Long id;
    private String nom;
    private String emplacement;
    private String heure_ouver;
    private String heure_fermet;
    private Integer nbre_hangars;
    private Categorie categorie_produit;


    public Marche() {
    }

    public Marche(String nom, String emplacement, String heure_ouver, String heure_fermet, int nbre_hangars) {
        this.nom = nom;
        this.emplacement = emplacement;
        this.heure_ouver = heure_ouver;
        this.heure_fermet =heure_fermet;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public String getHeure_ouver() {
        return heure_ouver;
    }

    public void setHeure_ouver(String heure_ouver) {
        this.heure_ouver = heure_ouver;
    }

    public String getHeure_fermet() {
        return heure_fermet;
    }

    public void setHeure_fermet(String heure_fermet) {
        this.heure_fermet = heure_fermet;
    }

    public Integer getNbre_hangars() {
        return nbre_hangars;
    }

    public void setNbre_hangars(Integer nbre_hangars) {
        this.nbre_hangars = nbre_hangars;
    }

    public Categorie getCategorie_produit() {
        return categorie_produit;
    }

    public void setCategorie_produit(Categorie categorie_produit) {
        this.categorie_produit = categorie_produit;
    }
}
