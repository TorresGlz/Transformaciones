package Transformaciones;

/**
 *
 * @author Aldair Torres
 */

public class Punto {

    private int x;
    private int y;

    /**
     * Generar un punto en las coordenadas(0,0)
     */
    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Generar un punto en las coordenadas (x,y)
     *
     * @param x Coordenada en x del punto
     * @param y Coordenada en y del punto
     */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Asignar valor de la coordenada x
     *
     * @param x coordenada en x
     *
     */
    public void setX(int x) {
        this.x = x;
    }
    
    /**
     * Obetener el valor de la coordenada en x
     * @return coordenada en x del punto
     */
    public int getX(){
        return this.x;
    }
    
    /**
     * Asignar valor de la coordenada y
     *
     * @param y coordenada en y
     *
     */
    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * Obetener el valor de la coordenada en x
     * @return coordenada en y del punto
     */
    public int getY(){
        return this.y;
    }
    
    
}
