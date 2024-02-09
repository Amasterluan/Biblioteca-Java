package Sistema;

import java.time.LocalDate;

public class Emprestimo {
	private int codigo_emprestimo;
	private Usuario usuarios;
	private Livro livros;
	private int ano;
	private int mes;
	private int dia;
	private int ano2;
	private int mes2;
	private int dia2; 	
	
	public Emprestimo() {
		super();
		this.codigo_emprestimo = codigo_emprestimo;
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
		this.ano2 = ano2;
		this.mes2 = mes2;
		this.dia2 = dia2;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getAno2() {
		return ano2;
	}

	public void setAno2(int ano2) {
		this.ano2 = ano2;
	}

	public int getMes2() {
		return mes2;
	}

	public void setMes2(int mes2) {
		this.mes2 = mes2;
	}

	public int getDia2() {
		return dia2;
	}

	public void setDia2(int dia2) {
		this.dia2 = dia2;
	}

	public int getCodigo_emprestimo() {
		return codigo_emprestimo;
	}

	public void setCodigo_emprestimo(int codigo_emprestimo) {
		this.codigo_emprestimo = codigo_emprestimo;
	}

	public Usuario getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuario usuarios) {
		this.usuarios = usuarios;
	}

	public Livro getLivros() {
		return livros;
	}

	public void setLivros(Livro livros) {
		this.livros = livros;
	}

	public void exibirDadosEmprestimo() {
		
		LocalDate dataEmprestimo = LocalDate.of(this.getAno(), this.getMes(), this.getDia());
		LocalDate dataDevolução = LocalDate.of(this.getAno2(), this.getMes2(), this.getDia2());
				
		System.out.println("===== EMPRESTIMO =====");

		System.out.println("Código do Emprestimo: " + codigo_emprestimo);
		this.usuarios.exibirUsuario();
		this.livros.exibirLivro();
		System.out.println("Data de Emprestimo: "+ dataEmprestimo);
		System.out.println("Data de Devolução: " + dataDevolução);
	}

}
