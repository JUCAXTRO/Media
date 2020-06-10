/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;
import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nt1, nt2, exame, media, med;
        Scanner mediaa = new Scanner(System.in);
        
        System.out.println("Digite uma nota");
        nt1 = mediaa.nextDouble();
        System.out.println("Digite outra nota");
        nt2 = mediaa.nextDouble();
        
        media = (nt1+nt2)/2;
        
        if (media>=7)
            System.out.println("Aprovado, nota:" +media);
        else
            if(media<7)
                System.out.println("Digite a nota do exame");
                exame = mediaa.nextDouble();
                med = (media+exame)/2;
                if (med>=5)
                    System.out.println("Aprovado por exame, nota:" + med);
                else
                    System.out.println("não aprovado");
                
        
    }
    
}
