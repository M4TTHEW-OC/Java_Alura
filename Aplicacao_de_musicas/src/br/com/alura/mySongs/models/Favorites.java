package br.com.alura.mySongs.models;

public class Favorites {
    public void includes (Audios audio){
        if (audio.getClassification() >= 9){
            System.out.println(audio.getTitle() + "é considerado  sucesso absoluto e preferido pro todos !!!");

        }else{

            System.out.println(audio.getTitle() + " ótima opção para ser ouvida em sequencia");

        }



    }
}
