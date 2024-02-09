package Sistema;

import java.util.ArrayList;

public class EmprestarLivro {

	private ArrayList<Emprestimo> emprestimos;

	public EmprestarLivro() {
		this.emprestimos = new ArrayList<Emprestimo>();
	}

	public void AddEmprestimo(Emprestimo l) {
		if (this.emprestimos.add(l)) {
			System.out.println("Emprestimo feito com sucesso!!");
		}
	}

	public void ListEmprestimos() {
		System.out.println("LISTA DE EMPRESTIMOS");
		for (Emprestimo emprestimo1 : emprestimos) {
			emprestimo1.exibirDadosEmprestimo();
			System.out.println(" - - - - - - - ");
		}
	}

	public void RemoveEmprestimo(int codigo) {
		for (int i = 0; i < this.emprestimos.size(); i++) {
			if (this.emprestimos.get(i).getCodigo_emprestimo() == codigo) {
				this.emprestimos.remove(i);
			}
		}
	}

}
