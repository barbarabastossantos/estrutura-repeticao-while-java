
import java.util.Locale;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class CaixaEletronico {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        double saldo=1000;
        
        
        while(true){
            System.out.println("""
                               
                               
                               1 -> Consultar saldo
                               2 -> Depsoitar
                               3 -> Sacar
                               4 -> sair
                               
                               
                               """);
       int opcao=sc.nextInt();
       
       if(opcao==4){
           System.out.println(" Saindo...");
           break;
       }else if(opcao==1){
           System.out.println(" Consultando saldo...");
           System.out.println( " Saldo R$ "+saldo);
       }else if(opcao ==2){
           System.out.println( " Qual valor deseja despositar -> ");
           double deposito=sc.nextDouble();
           System.out.println(" Deposito realizado com sucesso! ");
           saldo+=deposito;
       }else if(opcao==3){
           System.out.println(" Qual valor deseja sacar -> ");
           double saque=sc.nextDouble();
           System.out.println(" Saque realizado com sucesso! ");
           saldo-=saque;
       }else{
           System.out.println("ERRO! \n Opcao invalida.");
       }
            
            
            
        }
        
        
        
        
        sc.close();
    }
}
