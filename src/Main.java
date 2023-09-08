public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao Movie Finder !!!");
        System.out.println("Filme - Top Gun: Maverick");

        int yearOfLaunchTopGun2 = 2022;
        System.out.println("Ano de Lançamento: " + yearOfLaunchTopGun2);

        boolean includedInThePlanTopGun2 = true;
        System.out.println("Está incluído no Plano básico: " + includedInThePlanTopGun2);

        double criticsScoreTopGun2 = 9.6;
        double audienceScoreTopGun2 = 9.9;

        double average = (criticsScoreTopGun2 + audienceScoreTopGun2) / 2;
        System.out.println(String.format ("Média da Nota de todos os espectadores: %.2f",average ));

        String synopsis;

        synopsis = """
               | -----------------------------------------------------------------------------------------------------------------------------------------------------|
               | Top Gun: Maverick                                                                                                                                    |
               |     Ano: %d                                                                                                                                          |                                                                                                                                  |
               |    Sinopse:                                                                                                                                          |
               |  Filme de aventura com o Astro de Hollywood Tom Cruise no papel de Pete "Maverick" Mitchell.                                                         |
               |  Com 30 anos de serviço como um dos principais pilotos da Marinha Norte Americana evitando o seu avanço na sua patente para fazer o que mais ama.    |
               |  Tendo que treinar um grupo com os melhores pilotos graduados do pais. Enfrentando os seu fantasmas de seu passado e seus maiores medos.             |
               |  Para uma realisar um missão impossível para quase Todos, exceto para Ele !!!                                                                        |
               |------------------------------------------------------------------------------------------------------------------------------------------------------|
                """.formatted(yearOfLaunchTopGun2);

        System.out.println(synopsis);

        int  stars = (int) (average / 2);
        System.out.println("Estrelas: " +stars);



    }
}