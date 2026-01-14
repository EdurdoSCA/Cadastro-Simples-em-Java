import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    String nome, resp;
    int idade;
    
    System.out.println("|------------- CADASTRO DO DUDU -------------|");
    
    do {
        System.out.print("Informe seu nome: ");
        nome = sc.nextLine();
        System.out.print("Informe sua idade: ");
        idade = sc.nextInt();
        sc.nextLine();
    
        do {
            System.out.print("\nO nome informado foi: " + nome + 
                             "\nE a idade da pessoa informada é de " + idade + " anos" + 
                             "\nCorreto? (s/n): ");
            resp = sc.nextLine();
            
            if(!resp.equalsIgnoreCase("s") &&
               !resp.equalsIgnoreCase("n")) {
                    System.out.print("Resposta inválida, tente novamente.\n");
               }
        } while(!resp.equalsIgnoreCase("s") &&
                !resp.equalsIgnoreCase("n"));
            if(resp.equalsIgnoreCase("n")) {
                System.out.println("Vamos tentar de novo.\n");
            }
            
    } while(!resp.equalsIgnoreCase("s")); 
    
    System.out.println("\n=================================");
    System.out.println("|       CADASTRO REALIZADO      |");
    System.out.println("=================================");
    sc.close();
  }
}