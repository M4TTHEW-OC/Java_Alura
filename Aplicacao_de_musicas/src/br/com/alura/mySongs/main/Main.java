package br.com.alura.mySongs.main;

import br.com.alura.mySongs.models.Favorites;
import br.com.alura.mySongs.models.Music;
import br.com.alura.mySongs.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music tankGod = new Music();
        tankGod.setArtist("Travis Scott");
        tankGod.setTitle("Tank God");
        tankGod.setGender("Rap");

        for (int i = 0; i < 1000 ; i++) {
            tankGod.reproduction();
            
        }

        for (int i = 0; i < 50 ; i++) {
            tankGod.like();

        }

        Podcast theJoeRoganExperience = new Podcast();
        theJoeRoganExperience.setTitle("The Joe Rogan Experience");
        theJoeRoganExperience.setHost("Joe Rogan");

        for (int i = 0; i < 5000 ; i++) {
            theJoeRoganExperience.reproduction();

        }

        for (int i = 0; i < 1000 ; i++) {
            theJoeRoganExperience.like();

        }

        Favorites favorites = new Favorites();
        favorites.includes(theJoeRoganExperience);
        favorites.includes(tankGod);

    }
}
