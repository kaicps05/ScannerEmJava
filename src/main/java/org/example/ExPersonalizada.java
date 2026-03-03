package org.example;

public class ExPersonalizada {

    static void sacar(double saldo, double valor) throws

        SaldoInsuficinteException {
            if (valor > saldo){
                throw new SaldoInsuficinteException("Saldo insuficiente ! Saldo :"+ saldo);
            }
        }

    public static void main(String[] args) {
        try{
            sacar(100,500);

        }catch(SaldoInsuficinteException e){
            System.out.printf("Erro :"+ e.getMessage());
        }
    }
}
