
package lista3exercicio01;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lista3Exercicio01 {

    public static void main(String[] args) {
        
        Scanner leitor =new Scanner(System.in);
        
        System.out.println("Informe o numero de Alunos que deseja cadastrar");
        int teste=leitor.nextInt();
        double[] a = new double[teste];
        int numero = 0;
        String [] nome = new String[teste];
        for(int i = 0; i<teste;i++)
        {
            
            //System.out.println("Informe o nome do Aluno" +([i]+1) "  :");
            nome[i]=JOptionPane.showInputDialog("Informe o nome do Aluno : ");
            //int b = 201;
            //a[i]= leitor.nextDouble();
             //a[i]=b+i;
             
        }
        for(int i = 0; i<teste;i++){
            
            System.out.println("Informe a nota do Aluno " + nome[i]+" :");
            //int b = 201;
            a[i]= leitor.nextDouble();
             //a[i]=b+i;
             
        }
        //Exibir o conteúdo:
        for(int i = 0; i <teste ;i++){
        
        if(a[i] >= 7){
            numero = numero + 1;
        }    
        
        System.out.println("A Nota do Alunos " + nome[i]+ ": " + a[i]);
        
        }
        System.out.println("Notas acima ou na media é : "+numero);
      
    }
    
}
