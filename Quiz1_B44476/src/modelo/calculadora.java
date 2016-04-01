/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author JOCSELY
 */
public class calculadora
{
    String suma;
    String resta;

   String resultado;

    public String getResultado()
    {
        return resultado;
    }

    public void setResultado(String resultado)
    {
        this.resultado = resultado;
    }

    public calculadora(String resultado)
    {
        this.resultado = resultado;
    }
    String multiplicacion;
    public String getSuma()
    {
        return suma;
    }

    public void setSuma(String suma)
    {
        this.suma = suma;
    }

    public String getResta()
    {
        return resta;
    }

    public void setResta(String resta)
    {
        this.resta = resta;
    }

    public String getMultiplicacion()
    {
        return multiplicacion;
    }

    public void setMultiplicacion(String multiplicacion)
    {
        this.multiplicacion = multiplicacion;
    }

    public calculadora(String suma,
            String resta,
            String multiplicacion)
    {
        this.suma = suma;
        this.resta = resta;
        this.multiplicacion = multiplicacion;
    }
}
