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
public class Enkapsulasi {
    
private String Mobil;
private String Plat;
 
public String AmbilMobil ()
{
return Mobil;
}
 
public String AmbilPlat()
{
return Plat;
}

public void setMobil (String mobilBaru)
{
Mobil = mobilBaru;
}
 
public void setPlat(String platBaru)
{
Plat = platBaru;
 }

}
