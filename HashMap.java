import java.util.ArrayList;
/**
 * Write a description of class HashMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HashMap
{
    // Coleccion de celdillas que componen el hashmap
    private ArrayList<Celdilla> diccionario;

    /**
     * Constructor for objects of class HashMap
     */
    public HashMap()
    {
        // initialise instance variables
        diccionario = new ArrayList<Celdilla>();
    }
    
    /**
     * Metodo para introducir un valor al hashmap
     */
    public void put(String clave, int valor)
    {
        if(comprobarClave(clave))
        {
        }
        else
        {
            diccionario.add(new Celdilla(clave, valor));
        }
    }
    
    /**
     * Metodo para comprobar si una clave ya existe en el hashmap
     */
    private int comprobarClave(String clave)
    {
        boolean encontrada = false;
        int indice = 0;
        int devolver = -1;
        while (indice < diccionario.size() && !(encontrada))
        {
            Celdilla temp = diccionario.get(indice);
            if( clave == temp.getClave())
            {
                devolver = temp.get();
                temp.set(clave, valor);
                encontrada = true;
            }
        }
        
    }
}
