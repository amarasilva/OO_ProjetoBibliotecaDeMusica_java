package APP;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Artista> artistas;

	public Biblioteca() {

		artistas = new ArrayList<Artista>();
	}

	public ArrayList<Artista> getArtistas() {
		return artistas;
	}

	public void setArtistas(ArrayList<Artista> artistas) {
		this.artistas = artistas;
	}

	public void cadastrarArtista(Artista al) {
		artistas.add(al);
	}

	public void buscaArtista(String nome) {
		for (int i = 0; i < artistas.size(); i++) {
			Artista temp = artistas.get(1);
			if (temp.getNome().equals(nome)) {// nome que retorna artista e album
				System.out.println("Nome do artista:" + temp.getNome() + "\nNome do Album:" + temp.getAlbum());
			}
		}
	}

	public int quantidadeDeArtistas() {
		return this.artistas.size();
	}

	public void apagarTudo() {
		this.artistas.clear();
	}

	public void exibirTudo() {
		for (int i = 0; i < artistas.size(); i++) {
			Artista temp = artistas.get(i);

			System.out.println("Nome: " + temp.getNome());
			System.out.println("Album: " + temp.getAlbum() + "\n");
		}
	}
}
