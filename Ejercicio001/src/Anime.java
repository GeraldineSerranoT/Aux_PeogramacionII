

public class Anime {
	public String nombre;
	public String genero;
	private int nroEpisodios;
	private String episodios;
	public Anime(String nombre, String genero, int nroEpisodios) {
		this.nombre = nombre;
		this.genero = genero;
		this.nroEpisodios = nroEpisodios;
		this.episodios="44";
	}
	public String mostrar() {
		return "Anime [nombre=" + nombre + ", genero=" + genero + ", nroEpisodios=" + nroEpisodios + ", episodios="
				+ episodios + "]";
		}
	
}
