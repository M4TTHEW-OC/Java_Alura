public class Conditional {
    public static void main(String[] args) {
        int yearOfLaunch = 1986;
        boolean includedInThePlan = true;
        double scoreMovie = 8.1;
        String typeOfPlan = "plus";

        if (yearOfLaunch >= 2022){
            System.out.println("Lançamentos que os clientes estão curtindo !!!");
        }else {
            System.out.println("Filme retrô que vale a pena assitir! ");
        }

        if (includedInThePlan == true && typeOfPlan.equals("plus")) {
            System.out.println("Filme Liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }



}
