/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author sena
 */
public class Usuario {
    private Deporte deporte1;
    private String id;
    private String nombre;
    private String apellido;
    private String correo;
    private String fecha_Nacimiento;
    private String genero;
    private int telefono;
    
    public void setDeporte1(Deporte deporte1Parametro){
        this.deporte1=deporte1Parametro;    
    }
    public Deporte getDeporte1()
    {
        return this.deporte1;
    }
    
    public void setId(String idParametro){
        this.id=idParametro;    
    }
    
    public String getId()
    {
        return this.id;
    }
    
    
    public void setNombre(String nombreParametro){
        this.nombre=nombreParametro;    
    }
    public String getNombre()
    {
        return this.nombre;
    }
    
    
    public void setApellido(String apellidoParametro){
        this.apellido=apellidoParametro;
    }
    public String getApellido()
    {
        return this.apellido;
    }
    
    
    public void setCorreo(String correoParametro){
        this.correo=correoParametro;   
    }
    public String getCorreo()
    {
        return this.correo;
    }
    
    
    public void setFecha_Nacimiento(String fecha_NacimientoParametro){
        this.fecha_Nacimiento=fecha_NacimientoParametro;    
    }
    public String getFecha_Nacimiento()
    {
        return this.fecha_Nacimiento;
    }
    
    
    public void setGenero(String generoParametro){
        this.genero=generoParametro;    
    }
    public String getGenero()
    {
        return this.genero;
    }
    
    
    public void setTelefono(int telefonoParametro){
        this.telefono=telefonoParametro;
        
    }
    public int getTelefono()
    {
        return this.telefono;
    }
    
    
}
