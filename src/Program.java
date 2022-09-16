package src;

public class Program {
    public static void main(String[] args) {
        calculadora calculadora= new calculadora();

        System.out.println("Dado os valores 15 e 30 o resultado das seguintes operações são:");
        System.out.println("_______________________________________________________________");
        System.out.println("Soma: "+ calculadora.soma(15, 30));
        System.out.println("Subtração: "+ calculadora.subtracao(15, 30));
        System.out.println("Multiplicação: " + calculadora.multiplicacao(15, 30));
        System.out.println("Divisão: "+ calculadora.divisao(15, 30));

    }
}
