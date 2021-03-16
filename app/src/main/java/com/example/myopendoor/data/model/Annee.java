package com.example.myopendoor.data.model;
import java.util.ArrayList;

public class Annee {
    private Integer Id;
    private String Libelle;
    private ArrayList<Visiteur> listeVisiteurs;


    public void setId(Integer Id)
    {
        this.Id = Id;
    }

    public Integer getId()
    {
        return Id;
    }

    public void setLibelle(String Libelle)
    {
        this.Libelle = Libelle;
    }

    public String getLibelle()
    {
        return Libelle;
    }

    public ArrayList<Visiteur> getListeVisiteurs()
    {
        return listeVisiteurs;
    }

    public void setListeVisiteurs(ArrayList<Visiteur> pListeProjets)
    {
        this.listeVisiteurs = pListeProjets;
    }

    public void addVisiteur(Visiteur unVisiteur){
        if (this.listeVisiteurs == null){
            this.listeVisiteurs = new ArrayList<Visiteur>();
        }
        listeVisiteurs.add(unVisiteur);
    }

}
