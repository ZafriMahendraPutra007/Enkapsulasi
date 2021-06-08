/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

/**
 *
 * @author zafri
 */
public class Mobil {
    
    public static void main (String args[]) {
//membuat objek dari class
  Enkapsulasi data = new Enkapsulasi ();
  data.setMobil ("Lamborgini");
  data.setPlat ("AE 2030 BF");

  System.out.println ("Mobil : "+ data.AmbilMobil ());
  System.out.println("Plat   : "+data.AmbilPlat());
    }
 }
 