package Calculadora.App;


import Calculadora.Dominio.Operaciones;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class AppCalculadora {
    public static final int SUMAR=0;
    public static final int RESTAR=1;
    public static final int MULTIPLICAR=2;
    public static final int DIVIDIR=3;

    /*public static final int CERRAR = -1;*/


    public static boolean seguirOperando =true;
    public static void main(String[] args) {



        JCheckBox checkBox=new JCheckBox("Redondear?");


        List<Object> opciones = Arrays.asList("Sumar", "Restar", "Multiplicar", "Dividir", checkBox);
        while(seguirOperando) {

            int Operacion = JOptionPane.showOptionDialog(null, "Que quier4es hacer?", "Calculadora POO", 0, JOptionPane.QUESTION_MESSAGE, null, opciones.toArray(), null);
            int cantidad=0;
            if(Operacion!=-1){
                while(cantidad==0){
                    try {
                        cantidad= Integer.parseInt(JOptionPane.showInputDialog("Que cantidad de numeros quieres operar?"));
                    }
                    catch (NumberFormatException e){
                        mostrarMensaje("Valor Invalida");
                    }


                }
            }

            switch (Operacion){
                case SUMAR: {
                    double a=0;
                    for(int i=0; i<cantidad;i++){
                        double b=Double.parseDouble(JOptionPane.showInputDialog("Escriba un numero: "));
                        a= Operaciones.sumar(a, b);
                    }
                    mostrarMensaje("El resultado de la operacion es: "+ pruebaRedondear(checkBox, a));
                    break;
                }


                case RESTAR: {
                    double a = 0;
                    for (int i = 0; i < cantidad; i++) {
                        double b = Double.parseDouble(JOptionPane.showInputDialog("Escriba el numero:"));
                        if (i == 0) {
                            a = b;
                        } else{
                            a = Operaciones.restar(a, b);
                        }
                    }
                    mostrarMensaje("El resultado de la operacion es: "+ pruebaRedondear(checkBox, a));
                    break;
                }


                case MULTIPLICAR:{
                    double a=1;
                    for(int i=0; i<cantidad;i++){
                        double b=Double.parseDouble(JOptionPane.showInputDialog("Escriba el numero"));
                        a= Operaciones.multiplicar(a, b);
                    }
                    mostrarMensaje("El resultado de la operacion es: "+ pruebaRedondear(checkBox, a));
                    break;
                }


                case DIVIDIR:{
                    double a=0;
                    for(int i=0; i<cantidad;i++){
                        double b=Double.parseDouble(JOptionPane.showInputDialog("Escriba el numero: "));
                        if(i==0){
                            a=b;
                        }
                        else{
                            a= Operaciones.dividir(a, b);
                        }
                    }

                    mostrarMensaje("El resultado de la operacion es: "+ pruebaRedondear(checkBox, a));
                    break;
                }
                default:{
                    mostrarMensaje("Adios");
                    seguirOperando =false;
                }
            }
        }
    }
    /*if(checkbox.isSelected()) {
        int redondear = (int) Math.round(numero);*/

    public static double pruebaRedondear(JCheckBox checkBox, double num){
        if(checkBox.isSelected()){
            return Math.round(num);
        }
        return num;
    }
    public static void mostrarMensaje(String mensaje){

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
