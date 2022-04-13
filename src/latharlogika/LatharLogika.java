/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latharlogika;
import java.util.Scanner;
/**
 *
 * @author INDAH
 */
public class LatharLogika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int pertama, kedua, terbesar;
     Scanner scan = new Scanner(System.in);
  
       System.out.print("Masukkan bilangan pertama = ");
       pertama = scan.nextInt();
  
       System.out.print("Masukkan bilangan kedua = ");
       kedua = scan.nextInt();
  
         if(pertama>kedua){
             System.out.println("Nilai terbesar adalah "+pertama);
         }else{
                System.out.println("Nilai terbesar adalah "+kedua);
         }
         }
  
 //System.out.println("Bilangan terbesar adalah "+terbesar);
  
 }
 


