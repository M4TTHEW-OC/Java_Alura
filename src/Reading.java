import java.util.Scanner;

    public class Reading {
        public static void main(String[] args) {
            Scanner reading = new Scanner(System.in);
            System.out.println("Digite o seu filme fvorito: ");
            String filme = reading.nextLine();
            System.out.println("Qual o ano de lançamento:");
            int yearOfLaunch = Integer.parseInt(reading.nextLine());
            System.out.println("Informe a sua avaliação para o filme: ");
            double rating = reading.nextDouble();

            System.out.println(filme);
            System.out.println(yearOfLaunch);
            System.out.println(rating);

        }
    }
