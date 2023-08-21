/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.util.LinkedList;

/** @author Fernando Ariel Acevedo
 *  Se Creo una Clase para la lista, de esta manera todos clases pueden acceder a la lista
 *  a travez de sus metodos de carga.
 *
 */
public class listaContacto {

    LinkedList<Contacto> listaContactos;

    public listaContacto() {
        listaContactos = new LinkedList();
    }
    public void agregaContacto(Contacto nuevo){
            listaContactos.add(nuevo);
            }
    
    public void eliminarContacto(Contacto eliminar){
        listaContactos.remove(eliminar);
    }
    /**
     * Retorna un Vector con la totalidad de los elementos de la lista.-
     * @return 
     */
    public Contacto[] listarContactos(){
        int tamaño = listaContactos.size();
        Contacto[] lista = new Contacto[tamaño];
        for (int i = 0; i < tamaño; i++) {
            lista[i]=listaContactos.get(i);
        }
        return lista;
    }
    public LinkedList<Contacto> getLista(){
        return listaContactos;
    }
    public LinkedList<Contacto> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(LinkedList<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }

}
