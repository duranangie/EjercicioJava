package ejercicio.main;

import ejercicio.logica.VideoJuego;
import java.util.ArrayList;
import java.util.List;

public class EjercicioJava {

    public static void main(String[] args) {

        List<VideoJuego> listavideojuego = new ArrayList<VideoJuego>();

        VideoJuego video1 = new VideoJuego(1, "Banjo Kazooie", "nintendo64", "4", "plataforma");

        VideoJuego video2 = new VideoJuego(2, "Star Fox", "nintendo64", "3", "plataforma");

        VideoJuego video3 = new VideoJuego(3, "Drill Dozer", "wii", "4", "pc");

        VideoJuego video4 = new VideoJuego(4, "Advance Wars", "wii", "2", "pc");

        VideoJuego video5 = new VideoJuego(5, "Metroid", "nintendo64", "4", "platafoma");

        listavideojuego.add(video1);
        listavideojuego.add(video2);
        listavideojuego.add(video3);
        listavideojuego.add(video4);
        listavideojuego.add(video5);
        
        //punto 3 recorrido
        for(VideoJuego list : listavideojuego ){
            System.out.println("titulo: "+list.getTitulo()+" consola: "+list.getConsola()+ " jugadores: "+list.getJugadores());
            
        }
        
        //punto 4 --cambio nombre y jugadores
        
        video3.setTitulo("mario bros");
        video3.setJugadores("4");
        
        
        video1.setTitulo("detroit2");
        video1.setJugadores("2");
        
        
        //punto5  buscar solo consola nintendo64 con for each
        
        for(VideoJuego nintendo: listavideojuego){
            if(nintendo.getConsola().equals("nintendo64")){
                System.out.println(nintendo.toString());
                
            }
        }
        
        
        
        

    }
}
