package APP;

public class Artista {

	private String nome;
	private String album;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAlbum() {
		return album;

	}

	public void setAlbum(String album) {

		this.album = album;

	}

	@Override

	public String toString() {
		return "\nArtista: " + this.nome + "\n";
	}
}