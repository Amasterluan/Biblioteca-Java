package Sistema;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SistemaLivro {

	private ArrayList<Livro> livros;

	public SistemaLivro() {

		this.livros = new ArrayList<Livro>();

	}

	public void addLivro(Livro livros) {
		this.livros.add(livros);
		System.out.println("Livro adicionado!");
	}

	public void removeLivro(int codigo) {
		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).getCod() == codigo) {
				this.livros.remove(i);
			}
		}
	}

	public static void ListAllLivros(ArrayList<Livro> list) {
		sort(list);
		for (Livro obj : list) {
			System.out.println(obj.getTitulo());
		}
	}

	public static void sort(ArrayList<Livro> list) {

		list.sort((o1, o2) -> o1.getTitulo().compareTo(o2.getTitulo()));
	}

	public void listLivroEspefico(int codigo) {
		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).getCod() == codigo) {
				livros.get(i).exibirLivro();
			}
		}
	}

	public Livro livroByCode(int codigo) {
		Livro retorno = null;

		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).getCod() == codigo) {
				retorno = livros.get(i);
			}
		}
		return retorno;
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}

}
