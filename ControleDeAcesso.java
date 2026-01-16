
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class ControleDeAcesso {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("""
                           
                           
                           Bem vindo ao controle de acesso da sua conta.
                           
                           - Voce tera ate 3 tentativas
                           - Lembrando que essa senha e numerica 
                           
                           
                           """);
     
        
        int senhaCorreta=1234;
        int senhaDigitada;
        int tentativas=0; //contador
        
        while(tentativas<3){
            System.out.println("Digite a senha : ");
            senhaDigitada=sc.nextInt();
            
            if(senhaDigitada==senhaCorreta){
                System.out.println("Acesso liberado! ");
                break; // break pra quebrar o loop caso a senha esteja correta
            }else{
                tentativas++;// incremento
                System.out.println("Senha incorreta! ");
                
            }
        }
        
        if(tentativas==3){ // condicao de tres tentativas pra bloquear o acesso
            System.out.println(" Acesso bloqueado! ");
        }
        
        
        sc.close();
    }
}
