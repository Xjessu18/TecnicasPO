/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gasideal;

/**
 *
 * @author ALUMNO
 */
public class GasIdeal {
    
    private double Temperatura;
    private double numeroDeMoles;
    private double Volumen;
    public GasIdeal(double pTemperatura,double pnumeroDeMoles,double pVolumen)
    {
      this.Temperatura= pTemperatura;
      this.numeroDeMoles=pnumeroDeMoles;
      this.Volumen=pVolumen;
    }

    public double getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(double pTemperatura) {
        this.Temperatura = pTemperatura;
    }

    public double getNumeroDeMoles() {
        return numeroDeMoles;
    }

    public void setNumeroDeMoles(double pnumeroDeMoles) {
        this.numeroDeMoles = pnumeroDeMoles;
    }

    public double getVolumen() {
        return Volumen;
    }

    public void setVolumen(double pVolumen) {
        this.Volumen = pVolumen;
    }
    public double MetodoPresion (){
        
        return this.Temperatura*this.numeroDeMoles*0.0821/this.Volumen;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GasIdeal objGasIdeal = new GasIdeal(100,20,5);
        System.out.println("La presion es ");
        System.out.println(objGasIdeal.MetodoPresion());
    }
    
}
