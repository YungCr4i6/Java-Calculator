//basic czech calculator in java (my first and maybe last java "project")

package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char operator;
        Double cislo1, cislo2, vysledek;

        Scanner input = new Scanner(System.in);

        System.out.println("Vyber operatora:: +, -, *, or /");
        operator = input.next().charAt(0);

        System.out.println("Zadej prvni cislo:");
        cislo1 = input.nextDouble();

        System.out.println("Zadej druhe cislo:");
        cislo2 = input.nextDouble();

        switch (operator) {

            case '+':
                vysledek = cislo1 + cislo2;
                System.out.println(cislo1 + " + " + cislo2 + " = " + vysledek);
                break;

            case '-':
                vysledek = cislo1 - cislo2;
                System.out.println(cislo1 + " - " + cislo2 + " = " + vysledek);
                break;

            case '*':
                vysledek = cislo1 * cislo2;
                System.out.println(cislo1 + " * " + cislo2 + " = " + vysledek);
                break;

            case '/':
                vysledek = cislo1 / cislo2;
                System.out.println(cislo1 + " / " + cislo2 + " = " + vysledek);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}
