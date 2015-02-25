
/**
 * Write a description of class Celdilla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Celdilla
{
    // Clave de la celdilla
    private String clave;
    // Valores de la celdilla
    private int valor;

    /**
     * Constructor de las celdillas
     */
    public Celdilla(String clave, int valor)
    {
        // inicializamos las variables
        this.clave = clave;
        this.valor = valor;
    }

    /**
     * Introduce valores a la celdilla
     */
    public void set(String clave, int valor)
    {
        this.clave = clave;
        this.valor = valor;
    }
    
    /**
     * Devuelve la clave
     * @return La clave
     */
    public String getClave()
    {
        return clave;
    }
    
    /**
     * Devuelve el valor
     * @return El valor
     */
    public int getValor()
    {
        return valor;
    }
}
