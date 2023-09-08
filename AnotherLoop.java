import java.util.Scanner;

public class AnotherLoop {

    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);
        double averageRating = 0;
        double note = 0;
        int totalNotes = 0;

        while (note != -1) {
            System.out.println("Informe a sua avaliação para o filme ou -1 para encerrar ");
            note = reading.nextDouble();

            if (note != -1) {
                averageRating += note;
                totalNotes++;
            }
        }

            if (totalNotes == 0) {

                System.out.println("Informe pelo menos uma nota.");

            } else {
                System.out.println(String.format ("Média de avaliações: %.2f",averageRating/ totalNotes ));
            }


    }
}
