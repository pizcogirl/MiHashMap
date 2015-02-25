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
     * Metodo que comprueba si el mapa contiene o no elementos
     * @return True si esta vacia, false si contiene elementos
     */
    public boolean isEmpty()
    {
        return diccionario.isEmpty();
    }

    /**
     * Metodo que devuelve el número de elementos en el mapa
     * @return El número de elementos en el mapa
     */
    public int size()
    {
        return diccionario.size();
    }

    /**
     * Metodo que elimina el elemento de la clave dada
     * @param clave La clave del elemento a eliminar
     * @return Su valor si existia la clave, -1 sino
     */
    public int remove(String clave)
    {
        // Creamos el entero a retornar y una celdilla
        // que tomaremos con un metodo interno que comprueba claves
        // y devuelve el objeto asociado a esa clave.
        Celdilla temp = comprobarClave(clave);
        int retornar = -1;
        // Si la clave ya existia, devuelvo el valor asociado y borro la celdilla del arraylist
        if(temp != null)
        {
            retornar = temp.getValor();
            diccionario.remove(temp);
        }
        return retornar;
    }

    /**
     * Metodo que vacia el mapa de elementos
     */
    public void clear()
    {
        diccionario.clear();
    }

    /**
     * Metodo que comprueba si una clave existe ya en el hashmap
     * @param La clave a buscar
     * @return True si ya existe, false si no
     */
    public boolean containsKey(String clave)
    {
        // Creamos el boolean a retornar inicializado a false y una celdilla
        // que tomaremos con un metodo interno que comprueba claves
        // y devuelve el objeto asociado a esa clave.
        Celdilla temp = comprobarClave(clave);
        boolean retornar = false;
        // Si la clave ya existia, cambio el valor del boolean
        if(temp != null)
        {
            retornar = true;
        }
        return retornar;
    }
    
    /**
     * Metodo para comprobar si un valor ya existe en el hashmap
     * @param valor El valor a comprobar si ya existe
     * @return True si el valor existe, false si no
     */
    public boolean containsValue(int valor)
    {
         // Creamos una boolean y un indice
        boolean encontrada = false;
        int indice = 0;
        // Recorremos la coleccion, si el valor existe cambiamos el valor de la boolean
        while (indice < diccionario.size() && !(encontrada))
        {
            Celdilla temp = diccionario.get(indice);
            if(valor == temp.getValor())
            {
                encontrada = true;
            }
            indice++;
        }
        return encontrada;
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
            indice++;
        }
        return devolver;
    }
    
}
