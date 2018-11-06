
import java.io.Serializable;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dmorenoar
 */
public class Videojuego implements Serializable{
    private String titulo;
    private String tipo;
    private int anyo;

    
    public Videojuego(String titulo, String tipo, int anyo) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.anyo = anyo;
    }


    @Override
    public String toString() {
        return "Videojuego{" + "titulo=" + titulo + ", tipo=" + tipo + ", anyo=" + anyo + '}';
    }

    
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
    
    
    
    
    
    
}
