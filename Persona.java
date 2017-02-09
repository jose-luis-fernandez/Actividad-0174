
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private String nombre;
    
    private boolean hombre;
    
    private int peso;
    
    private int altura;
    
    private int edad;
    
    private int caloriasIngeridas;

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombre, boolean hombre, int peso, int altura, int edad)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.hombre = hombre;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        caloriasIngeridas = 0;
    }
    
    public int comer(Comida comida)
    {
        int caloriasIngeridasEnEstaComida = -1;
        if (hombre && caloriasIngeridas > ((10 * peso) + (6 * altura) + (5 * edad) + 5)){
            System.out.println("La ingesta de calorías de " + nombre + " supera su metabolismo basal");
        }
        else if (hombre == false && caloriasIngeridas > ((10 * peso) + (6 * altura) + (5 * edad) - 161)){
            System.out.println("La ingesta de calorías de " + nombre + " supera su metabolismo basal");
        }
        else{
            caloriasIngeridasEnEstaComida = comida.getCalorias();
            this.caloriasIngeridas += caloriasIngeridasEnEstaComida;
        }
        return caloriasIngeridasEnEstaComida;
    }
    
    public int getCaloriasIngeridas()
    {
        return caloriasIngeridas;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


}
