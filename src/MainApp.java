
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dmorenoar
 */
public class MainApp {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        /*LEER CON FILEWRITER Y FILEREADER*/
        try {

            //Escribir en el fichero
            //Creamos el fichero
            File fichero = new File("apuntes");
            
            if(fichero.exists()){
                System.out.println("El archivo existe");
            }else{
                System.out.println("El archivo no existe y lo creo");
                BufferedWriter buffWriter = new BufferedWriter(new FileWriter(fichero));
            }
        
            FileWriter writer = new FileWriter(fichero.getAbsoluteFile(), true);
            
            writer.write("Primer intro asdasd\n");
            writer.flush();
            writer.close();
            
            
            //LEER DEL FICHERO
            String cadena;
            BufferedReader buffReader = new BufferedReader(new FileReader(fichero));

            while ((cadena = buffReader.readLine()) != null) {
                System.out.println(cadena);
            }
            
            buffReader.close();

        } catch (IOException ex) {
            System.out.println("Error en la lectura" + ex.getMessage());
        }

        
        
        
        /*LECTURA CON SERIALIZACIÓN*/
        ArrayList<Videojuego> videojuegos = new ArrayList();
        Videojuego v1 = new Videojuego("Pikmin", "Estrategia", 1999);
        Videojuego v2 = new Videojuego("Metal Gear", "Acción", 2000);
        
        videojuegos.add(v1);
        videojuegos.add(v2);
        
        File archivo = new File("videojuegosClub");
        
        //Escribimos en el archivo
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));
        oos.writeObject(videojuegos);
        oos.close();
        
        
        //Leer del fichero
        ArrayList<Videojuego> listaVideojuegos = new ArrayList();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo));
        listaVideojuegos = (ArrayList<Videojuego>) ois.readObject();
        ois.close();
        
        
        System.out.println("Vamos a leer de listaVideojuegos");
        for(Videojuego v: listaVideojuegos){
            System.out.println(v);
        }
    }

}
