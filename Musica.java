public class Musica {
    String titulo;
    String artista;

    public Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }
     public void tocar() {
        System.out.println("Tocando: " + titulo + " - " + artista);
     }      
}
