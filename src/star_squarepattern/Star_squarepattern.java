/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package star_squarepattern;

/**
 *
 * @author sivakumar.R
 */
import java.util.*;
public class Star_squarepattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows and columns:  ");
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){
          for(int col=1;col<=n;col++){
              System.out.print("*");
          }
            System.out.println();
        }
    }
    
}
