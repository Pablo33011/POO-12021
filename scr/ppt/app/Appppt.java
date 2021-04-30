package ppt.app;

import ppt.dominio.PiePapTije;
import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Appppt {public static List<Object> entrada = Arrays.asList("Ver Instrucciones", "Jugar", "Ver Resultados");
    public static final Object[] JUGADA = {"Piedra", "Papel", "Tijeras"};
    public static boolean manteneract =true;
    public static void main(String[] args) {
        while(manteneract){
            int entrada= Opciones("Bienvenido. Que quieres hacer?", Appppt.entrada);
            switch(entrada){
                case 0:{
                    Mensaje(PiePapTije.INSTRUCCIONES);
                    break;
                }
                case 1:{
                    int jugadaUsuario=0; int jugadaMaq=(int)Math.round(Math.random()* 2);
                    Object opcionUsuario=JOptionPane.showInputDialog(null,"Jueguemos! Por favor seleccionar una de las opciones: ", "PPT",JOptionPane.QUESTION_MESSAGE,null, JUGADA, JUGADA[0]);

                    if(opcionUsuario=="Piedra"){
                        jugadaUsuario=0;
                    }
                    if(opcionUsuario=="Papel"){
                        jugadaUsuario=1;
                    }
                    if(opcionUsuario=="Tijeras"){
                        jugadaUsuario=2;
                    };
                    int resultado =  PiePapTije.jugar(jugadaUsuario, jugadaMaq);
                    if (resultado == 1){
                        JOptionPane.showMessageDialog(null,"Empate");
                    }
                    if (resultado ==2 ){
                        JOptionPane.showMessageDialog(null,"Gana Usuario");
                    }
                    if (resultado == 3){
                        JOptionPane.showMessageDialog(null,"Gana computador");
                    }

                    break;
                }
                case 2:{
                    Mensaje(PiePapTije.mostrarResultados());
                    break;
                }
                default:{
                    Mensaje("No se ha seleccionado nada");

                    break;
                }
            }

        }

    }
    public static int Opciones(String mensaje, List<Object> lista){
        return JOptionPane.showOptionDialog(null, mensaje, "Piedra Papel o Tijeras", 0, JOptionPane.QUESTION_MESSAGE, null, lista.toArray(), null);


    }
    public static void Mensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

}
