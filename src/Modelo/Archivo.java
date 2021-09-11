/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.Main;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joseg
 */
public class Archivo {
    
    public Archivo(){}
    
    public void imprimir_archivo(float valor1, String operacion, float valor2, float resultado, int nuevo) throws IOException
    {
        String nombre_archivo="BitacoraCalculadora.txt";
        File archivo=new File(nombre_archivo);
        FileWriter escribir;
        PrintWriter imprimir;
        if(!archivo.exists())
        { 
            try {                
                archivo.createNewFile();
                escribir= new FileWriter(archivo,true);
                imprimir=new PrintWriter(escribir);
                
               if(nuevo==1)
                {
                    imprimir.println("------ NUEVO ------");
                }
                else
                {
                    imprimir.print(valor1);
                    imprimir.print(" "+operacion);
                    imprimir.print(" "+valor2);
                    imprimir.print(" = ");
                    imprimir.println(resultado);
                }
                imprimir.close();
                escribir.close();               
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else
        {
            try {                
                escribir= new FileWriter(archivo,true);
                imprimir=new PrintWriter(escribir);
                if(nuevo==1)
                {
                    imprimir.println("------ NUEVO ------");
                }
                else
                {
                    imprimir.print(valor1);
                    imprimir.print(" "+operacion);
                    imprimir.print(" "+valor2);
                    imprimir.print(" = ");
                    imprimir.println(resultado);
                }
                imprimir.close();
                escribir.close();
            } catch (FileNotFoundException ex) 
            {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) 
            {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
}
