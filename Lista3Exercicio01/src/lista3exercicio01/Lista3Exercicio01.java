
package lista3exercicio01;

import java.util.Scanner;

public class Lista3Exercicio01 {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = new int[10];
        
        Scanner leitor =new Scanner(System.in);
        
        for(int i = 0; i<10;i++){
            
            System.out.println("Informe a posição "+i+" do arrya :");
            a[i]= leitor.nextInt();
             
             
        }
        //Exibir o conteúdo:
        for(int i = 9; i > 0;i--){
        System.out.println("Meu array posição ["+i+"] : " + a[i]);
        
        
        
        }
        
        
    }
    
}
