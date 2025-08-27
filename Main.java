import java.util.Scanner;

class Main {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três números inteiros separados por espaço:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        long produto = (long) a * b * c;
        System.out.println("O produto dos três números é: " + produto);

        sc.close();
    }
}
