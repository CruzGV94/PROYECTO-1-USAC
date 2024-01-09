package Proyecto1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class SerializarObjeto {
    
    public static boolean serializarObjeto(String direccionArchivo, Serializable objeto){
        boolean Cs = false;
        try (FileOutputStream sld = new FileOutputStream(direccionArchivo);
                ObjectOutputStream salida = new ObjectOutputStream(sld);) {
            salida.writeObject(objeto);
            Cs=true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
        return Cs;
    }
    
    
    public static <E> E deserializarObjeto(String direccionArchivo, Class<E> claseObjetivo) {
        E objeto = null;
        try (FileInputStream sC = new FileInputStream(direccionArchivo);
                ObjectInputStream entrada = new ObjectInputStream(sC);) {
            objeto = (E) entrada.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objeto;
    }

    
}
