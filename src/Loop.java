import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);
        double averageRating = 0;
        double note = 0;

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Informe a sua avaliação para o filme: ");
            note = reading.nextDouble();
            averageRating += note;
        }

        System.out.println(String.format ("Média de avaliações: %.2f",averageRating/3 ));

    }
}
