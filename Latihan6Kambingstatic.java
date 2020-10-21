/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10116415.latihan6.kambingstatic;

/**
 *
 * @author Frda
 */
public class Latihan6Kambingstatic {
 //Nama_Kambing sebagai konstanta
    public static final String Nama_Kambing = "Mbek";
    
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(Mamalia.jumlahKambing +
                Nama_Kambing  + " memiliki kambing sebanyak ");
    }
 
}