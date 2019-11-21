/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eroicontromostri;

/**
 *
 * @author matteo
 * 
 */
interface Personaggio {
    String getForza();
} 

interface Umano extends Personaggio {
    void combatti();
}

 interface Mostro extends Personaggio {
    void azzanna();
}

class Vampiro implements Mostro
{
    protected int forza;
    
    Vampiro() {
        forza=15;
    }

    @Override
    public void azzanna() {
        forza =forza-2;
     }
    
    @Override
    public String getForza() {
        return "vampiro (Forza rimanente) : " + forza;
     }
}

class Eroe implements Umano {
    protected int forza;
    
    Eroe() {
        forza=15;
    }

    @Override
    public void combatti() {
        forza =forza-2;
     }
    
    @Override
    public String getForza() {
        return "Eroe (Forza rimanente): " + forza;
     }
}

class Licantropo implements Mostro, Umano
{
     private boolean lunaPiena;
     protected int forzaUmano = 10, forzaMostro = 15;

    Licantropo(boolean lunaPiena) {
         this.lunaPiena = lunaPiena;
    }
    
    void setLunaPiena(boolean lunaPiena) {
         this.lunaPiena = lunaPiena;
    }

     public void azzanna() { 
        if (lunaPiena) forzaMostro=forzaMostro-2;
        else System.out.println("Errore: la luna non e' piena e Licantropo e' al momento un Uomo");
     }
     
     public void combatti () { 
         if (!lunaPiena) forzaUmano=forzaUmano-3;
         else System.out.println("Errore: la luna e' piena e Licantropo e' al momento un Mostro");
     }

     public String getForza () {
        return "Licantropo (Forza rimanente): come umano: " + forzaUmano + ", come mostro: " + forzaMostro;
      }

}

public class EroiControMostri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Eroe e = new Eroe();
         Licantropo l = new Licantropo(true);
         Vampiro v = new Vampiro();
         for (int i =0; i<3;i++)
             e.combatti();
         v.azzanna();
         l.azzanna();
         l.azzanna();
         l.setLunaPiena(false);
         l.combatti();
         System.out.println(v.getForza());
         System.out.println(l.getForza());
         System.out.println(e.getForza());     
    }
    
}