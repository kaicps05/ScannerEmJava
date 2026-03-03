package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Digite um valor :");
            int a = sc.nextInt();

            System.out.println("Digite outro valor");
            int b = sc.nextInt();

            int Resultado = a / b ;

            System.out.println("Resultado : " + Resultado);

        } catch (ArithmeticException e){
            System.out.println("Erro nao da pra divir por zero....");

        }catch (InputMismatchException ex){
            System.out.println("Erro nao pode colocar letras ...");

        }catch (Exception ex2){
            System.out.println("Erro" + ex2.getMessage());

        }
    }
}