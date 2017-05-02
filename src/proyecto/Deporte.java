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
public class Deporte {
  private String codDeporte;
  private String test;
  private String descripcion;
  
  public void setCodDeporte(String codDeporteP){
  this.codDeporte=codDeporteP;
  } 
  public String getCodDeporte(){
  return this.codDeporte;
  }
  
  public void setTest(String testP){
  this.test=testP;
  } 
  public String getTest(){
  return this.test;
  }
  
  public void setDescripcion(String descripcionP){
  this.descripcion=descripcionP;
  } 
  public String getDescripcion(){
  return this.descripcion;
  }
}

