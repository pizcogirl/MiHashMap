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
     * @param clave La clave a introducir
     * @param valor El valor asociado a la clave
     * @return Si la clave no existia, retorna -1. Si ya
     *          existia sobreescribe el valor y lo retorna
     */
    public int put(String clave, int valor)
    {
        // Creamos el entero a retornar y una celdilla
        // que tomaremos con un metodo interno que comprueba claves
        // y devuelve el objeto asociado a esa clave.
        Celdilla temp = comprobarClave(clave);
        int retornar = -1;
        // Si la clave ya existia, sobreescribo el valor y guardo el valor
        // anterior para devolverlo
        if(temp != null)
        {
            retornar = temp.getValor();
            temp.set(clave, valor);
        }
        // Si no existia añado una nueva celdilla al diccionario
        else
        {
            diccionario.add(new Celdilla(clave, valor));
        }
        return retornar;
    }

    /**
     * Metodo que devuelve el valor asociado a una clave
     * @param clave, La clave para buscar
     * @return El valor asociado a la clave, o -1 si no existe la clave
     */
    public int get(String clave)
    {
        // Creamos el entero a retornar y una celdilla
        // que tomaremos con un metodo interno que comprueba claves
        // y devuelve el objeto asociado a esa clave.
        Celdilla temp = comprobarClave(clave);
        int retornar = -1;
        // Si la clave ya existia, devuelvo el valor asociado
        if(temp != null)
        {
            retornar = temp.getValor();
        }
        return retornar;
    }

    /**
     * Metodo para comprobar si una clave ya existe en el hashmap
     * @param clave La clave a comprobar si ya existe
     * @return La celdilla si la encuentra, sino devolvera null
     */
    private Celdilla comprobarClave(String clave)
    {
        // Creamos una boolean y un indice, asi como la celdilla a devolver
        boolean encontrada = false;
        int indice = 0;
        Celdilla devolver = null;
        // Recorremos la coleccion, si existe guardamos la celdilla correspondiente
        // a esa clave y cambiamos el valor de la boolean
        while (indice < diccionario.size() && !(encontrada))
        {
            Celdilla temp = diccionario.get(indice);
            if( clave == temp.getClave())
            {
                devolver = temp;
                encontrada = true;
            }
        }
        return devolver;
    }

}
