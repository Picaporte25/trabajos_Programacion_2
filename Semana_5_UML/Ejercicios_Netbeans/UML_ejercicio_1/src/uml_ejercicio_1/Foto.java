/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml_ejercicio_1;

/**
 *
 * @author Avernal
 */
public class Foto {
  private  String foto;
  private  String formato;

    public Foto(String foto, String formato) {
        this.foto = foto;
        this.formato = formato;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Foto{" + "foto=" + foto + ", formato=" + formato + '}';
    }

 



}
