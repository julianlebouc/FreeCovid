package com.iutlan.freecovid;

import java.util.Random;

public class IdentifiantSimple implements IIdentifiant{
        public int generer(){
            //Génere un identifiant au hasard
            int min = 100000000;
            int max = 999999999;
            Random random = new Random();
            int randomNumber = random.nextInt(max-min) + min;
            IdEnvoyes.ajoutListe(randomNumber); //ajoute l'identifiant généré à la liste des identifiants envoyés
            return randomNumber;
        }
}