
package lista3exercicio01;

import java.util.Scanner;

public class Lista3Exercicio01 {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = new int[51];
        
        Scanner leitor =new Scanner(System.in);
        
        for(int i = 0; i<51;i++){
            
            //System.out.println("Informe a posição "+i+" do arrya :");
            
            int b = 201;
            //a[i]= leitor.nextInt();
             a[i]=b+i;
             
        }
        //Exibir o conteúdo:
        for(int i = 0; i <51 ;i++){
        System.out.println("Meu array posição ["+i+"] : " + a[i]);
        
        
        
        }
        
        
    }
    
}
