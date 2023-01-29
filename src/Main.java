import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String operacion="";
        int op1,op2,resultado;
        System.out.println("Captura operación:");
        operacion= entrada.nextLine();
        if (operacion.equals("SUMA") || operacion.equals("RESTA") ||operacion.equals("MULTIPLICACION") || operacion.equals("DIVISION")) {
            System.out.println("Operando 1");
            op1=entrada.nextInt();
            System.out.println("Operando 2");
            op2=entrada.nextInt();
            System.out.print(op1);
            switch (operacion) {
                case "SUMA" -> {
                    System.out.print(" + ");
                    resultado = op1 + op2;
                }
                case "RESTA" -> {
                    System.out.print(" - ");
                    resultado = op1 - op2;
                }
                case "DIVISION" -> {
                    System.out.print(" / ");
                    resultado = op1 / op2;
                }
                case "MULTIPLICACION" -> {
                    System.out.print(" x ");
                    resultado = op1 * op2;
                }
                default -> throw new IllegalStateException("Valor erroneo");
            }
            System.out.println(op2 + " = " + resultado);
        }else {
            System.out.println("Operación no soportada");
        }

    }
}