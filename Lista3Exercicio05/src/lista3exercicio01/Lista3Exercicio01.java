
package lista3exercicio01;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lista3Exercicio01 {

    public static void main(String[] args) {
        // TODO code application logic here
        double[] a = new double[5];
        double soma = 0;
        int numero = 0;
        String [] nome = new String[5];
        
        Scanner leitor =new Scanner(System.in);
         for(int i = 0; i<5;i++){
            
            //System.out.println("Informe o nome do Aluno" +([i]+1) "  :");
            nome[i]=JOptionPane.showInputDialog("Informe o nome do Aluno : ");
           
            
            //int b = 201;
            //a[i]= leitor.nextDouble();
             //a[i]=b+i;
             
        }
        
        
        
        for(int i = 0; i<5;i++){
            
            System.out.println("Informe a nota do Aluno :");
            
            //int b = 201;
            a[i]= leitor.nextDouble();
             //a[i]=b+i;
             
        }
        //Exibir o conteúdo:
        for(int i = 0; i <5 ;i++){
        
        if(a[i] >= 7){
            numero = numero + 1;
        }    
        
        System.out.println("Meu Nota do Alunos " + nome[i]+ ": " + a[i]);
        
        
        
        }
        System.out.println("Notas acima de 7 é : "+numero);
        
        
    }
    
}
