
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
    
    private Comida alimentoMasCalorico;

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
        alimentoMasCalorico = null;
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
            if (alimentoMasCalorico == null || comida.getCalorias() >= alimentoMasCalorico.getCalorias()){
                alimentoMasCalorico = comida;
            }
        }
        return caloriasIngeridasEnEstaComida;
    }
    
    public int getCaloriasIngeridas()
    {
        return caloriasIngeridas;
    }
    
    public String contestar(String pregunta)
    {
        String textoADevolver = null;
        if (hombre && caloriasIngeridas <= ((10 * peso) + (6 * altura) + (5 * edad) + 5) && pregunta.length() % 3 == 0){
            System.out.println("SI");
            textoADevolver = "SI";
        }
        else if(hombre && caloriasIngeridas <= ((10 * peso) + (6 * altura) + (5 * edad) + 5) && pregunta.length() % 3 != 0){
            System.out.println("NO");
            textoADevolver = "NO";
        }
        if (hombre == false && caloriasIngeridas <= ((10 * peso) + (6 * altura) + (5 * edad) - 161) && (pregunta.length() % 3) == 0){
            System.out.println("SI");
            textoADevolver = "SI";
        }
        else if (hombre == false && caloriasIngeridas <= ((10 * peso) + (6 * altura) + (5 * edad) - 161) && (pregunta.length() % 3) != 0){
            System.out.println("NO");
            textoADevolver = "NO";
        }
        if (hombre && caloriasIngeridas > ((10 * peso) + (6 * altura) + (5 * edad) + 5) || pregunta.contains(this.nombre)){
            System.out.println(pregunta.toUpperCase());
            textoADevolver = pregunta.toUpperCase();
        }
        else if (hombre == false && caloriasIngeridas > ((10 * peso) + (6 * altura) + (5 * edad) - 161)){
            System.out.println(pregunta.toUpperCase());
            textoADevolver = pregunta.toUpperCase();
        }
        return textoADevolver;
    }
    
    public String getAlimentoMasCaloricoConsumido()
    {
        String nombreAlimentoMasCalorico = null;
        if (alimentoMasCalorico == null){
            System.out.println(nombre + " no ha comido nada aún");
        }
        else{
            System.out.println(alimentoMasCalorico.getNombre());
            nombreAlimentoMasCalorico = alimentoMasCalorico.getNombre();
        }
        return nombreAlimentoMasCalorico;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


}
