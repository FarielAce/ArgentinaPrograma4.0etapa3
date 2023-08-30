/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.util.ArrayList;
import DBase.controlContacto;
/** @author Fernando Ariel Acevedo
 *  Se Creo una Clase para la lista, de esta manera todos clases pueden acceder a la lista
 *  a travez de sus metodos de carga.
 *
 */
public class listaContacto {

    controlContacto DBase;

    public listaContacto() {
        DBase = new controlContacto();
    }
    public void agregaContacto(Contacto nuevo){
            DBase.insertContacto(nuevo);
            }
    
    public void eliminarContacto(Contacto eliminar){
        DBase.deleteContacto(eliminar);
    }
    /**
     * Retorna un Vector con la totalidad de los elementos de la lista.-
     * @return 
     */
    public Contacto[] listarContactos(){
        int tamaño = DBase.selectContactos().size();
        Contacto[] lista = new Contacto[tamaño];
        for (int i = 0; i < tamaño; i++) {
            lista[i]=DBase.selectContactos().get(i);
        }
        return lista;
    }
    public ArrayList<Contacto> getLista(){
        return DBase.selectContactos();
    }
    public ArrayList<Contacto> getListaContactos() {
        return DBase.selectContactos();
    }

    

}
