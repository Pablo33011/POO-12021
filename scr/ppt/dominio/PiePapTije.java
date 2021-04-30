package ppt.dominio;

public class PiePapTije {

    public static final int PIEDRA=0;
    public static final int PAPEL=1;
    public static final int TIJERAS=2;
    public static int GanadorUsuario =0;
    public static int GanadorMaquina =0;
    public static int Empate =0;


    public static int jugar(int opcionUsuario, int opcionPc){

        if(opcionPc==PIEDRA && opcionUsuario==PIEDRA){
            Empate +=1;
            return 1;
        }
        if(opcionPc==PAPEL && opcionUsuario==PAPEL){
            Empate +=1;
            return 1;
        }
        if(opcionPc==TIJERAS && opcionUsuario==TIJERAS){
            Empate +=1;
            return 1;
        }
        if(opcionPc==PIEDRA && opcionUsuario==PAPEL){
            GanadorUsuario +=1;
            return 2;
        }
        if(opcionPc==PAPEL && opcionUsuario==TIJERAS){
            GanadorUsuario +=1;
            return 2;
        }
        if(opcionPc==TIJERAS && opcionUsuario==PIEDRA){
            GanadorUsuario +=1;
            return 2;
        }
        if(opcionPc==PIEDRA && opcionUsuario==TIJERAS){
            GanadorMaquina +=1;
            return 3;
        }
        if(opcionPc==PAPEL && opcionUsuario==PIEDRA){
            GanadorMaquina +=1;
            return 3;
        }
        if(opcionPc==TIJERAS && opcionUsuario==PAPEL){
            GanadorUsuario +=1;
            return 2;
        }

        return 0;

    }

    public static String mostrarResultados(){
        String mensaje="\n"+"Jugador: "+ GanadorUsuario +"\n"+"Computadora: "+ GanadorMaquina +"\n"+"Empates: "+ Empate;
        return mensaje;
    }
    public static final String INSTRUCCIONES="" +
            "Juego de Piedra, Papel o Tijeras \n" +
            "Elige una de las tres opcines ya sea Piedra, Papel, o Tijera.\n"+
            "Reglas: \n"+
            "Papel gana a piedra \n"+
            "Tijera gana a papel\n"+
            "Piedra gana a tijeras\n"+
            "En el caso que la computadora y el jugador elijan la misma opcion sera empate\n"+
            "";

}
