
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class EstatisticaDeNumero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int maior=0;
        int menor=0;
        boolean primeiro=true; // essa variavel inicializa mior/menor pq nao temos um primeiro numero pra comparar
        int numero;
        int contadorNumeros=0;
        int par=0;
        int impar=0;
        
        
        while(true){
            System.out.println("Digite um numero : ");
            numero=sc.nextInt();
            if(numero==-1)break;
            contadorNumeros++;
            
            if(numero%2==0){
                par++;
            }else{
                impar++;
            }
            
            if(primeiro){
                maior=numero;
                menor=numero;
                primeiro=false;
            }else{
                if(numero>maior){
                    maior=numero;
                }
                if(numero<menor){
                    menor=numero;
                }
            }
            
        }
        
        
        System.out.println("temos "+par+" numeros pares , "+impar+" numeros impares ,\n "+ maior+" esse foi o numero maior, "+menor+" esse foi o numero menor e o total de numeros digitados foi de "+contadorNumeros);
        
        
        sc.close();
    }
}
