package com.example.myopendoor.data.model;

import java.util.ArrayList;

public class Visiteur {
    private Integer Id;
    private String Nom;
    private String Prenom;
    private String Mail;
    private String Etablissement;
    private Specialite uneSpecialite ;
    private Bac unBac;
    private ArrayList<Annee> listeAnnees;


    public void setId(Integer Id)
    {
        this.Id = Id;
    }

    public Integer getId()
    {
        return Id;
    }

    public void setNom(String Nom)
    {
        this.Nom = Nom;
    }

    public String getNom()
    {
        return Nom;
    }

    public void setPrenom(String Prenom)
    {
        this.Prenom = Prenom;
    }

    public String getPrenom()
    {
        return Prenom;
    }

    public void setMail(String Mail)
    {
        this.Mail = Mail;
    }

    public String getMail()
    {
        return Mail;
    }

    public void setEtablissement(String Etablissement)
    {
        this.Etablissement = Etablissement;
    }

    public String getEtablissement()
    {
        return Etablissement;
    }

    public Specialite getUneSpecialite()
    {
        return uneSpecialite;
    }

    public void setUneSpecialite(Specialite uneSpecialite)
    {
        this.uneSpecialite = uneSpecialite;
    }

    public Bac getUnBac()
    {
        return unBac;
    }

    public void setUnBac(Bac unBac)
    {
        this.unBac = unBac;
    }

    public ArrayList<Annee> getListeAnnees()
    {
        return listeAnnees;
    }

    public void setListeAnnees(ArrayList<Annee> pListeProjets)
    {
        this.listeAnnees = pListeProjets;
    }

    public void addAnnee(Annee uneAnnee){
        if (this.listeAnnees == null){
            this.listeAnnees = new ArrayList<Annee>();
        }
        listeAnnees.add(uneAnnee);
    }



}
