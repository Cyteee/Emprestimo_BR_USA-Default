package application;

import model.BrazilInterestService;
import model.InterestService;
import model.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        InterestService bis = new BrazilInterestService();
        InterestService uis = new UsaInterestService();

        System.out.print("Digite a quantia desejada para seu emprestimo: ");
        double amount = sc.nextDouble();
        System.out.print("Digite em quantos meses deseja pagar: ");
        int months = sc.nextInt();

        double paymentBrazil = bis.getPaymentAmount(amount, months);
        double paymentUsa = uis.getPaymentAmount(amount, months);

        System.out.println();
        System.out.println("Valor total a pagar (Taxas Brasil 2%): " + String.format("%.2f", paymentBrazil));
        System.out.println("Valor total a pagar (Taxas EUA 1%): " + String.format("%.2f", paymentUsa));

        sc.close();
    }
}