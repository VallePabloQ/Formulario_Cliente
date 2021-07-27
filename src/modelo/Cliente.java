/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Lenovo FX
 */
public class Cliente extends Persona {
    private String nit;

    public Cliente(){}
    public Cliente(String nit, String nombres, String apellidos, String direccion, String telefono, String f_nacimiento) {
        super(nombres, apellidos, direccion, telefono, f_nacimiento);
        this.nit = nit;
    }


    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    @Override
    public void agregar(){
        System.out.println("Nit: " + getNit());
        System.out.println("Nombre: " + getNombres());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Telefono: " + getTelefono());
        System.out.println("F Nacimiento: " + getF_nacimiento());
        System.out.println("____________________________________");
    }
    @Override
    public void modificar() {
        System.out.println("Metodo modificar");
    }
    @Override
    public void eliminar() {
        System.out.println("Metodo eliminar");
    }
    
}
