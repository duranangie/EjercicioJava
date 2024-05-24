package ejercicio.logica;

public class VideoJuego {

    private int codigo;
    private String titulo;
    private String consola;
    private String jugadores;
    private String categoria;

    public VideoJuego() {

    }

    public VideoJuego(int codigo, String titulo, String consola, String jugadores, String categoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.jugadores = jugadores;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public String getJugadores() {
        return jugadores;
    }

    public void setJugadores(String jugadores) {
        this.jugadores = jugadores;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "VideoJuego{" + "codigo=" + codigo + ", titulo=" + titulo + ", consola=" + consola + ", jugadores=" + jugadores + ", categoria=" + categoria + '}';
    }

}
