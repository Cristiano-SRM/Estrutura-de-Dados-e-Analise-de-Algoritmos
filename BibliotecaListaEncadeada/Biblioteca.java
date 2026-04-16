package BibliotecaListaEncadeada;

public class Biblioteca {
	
	private String titulo;
	private String autor;
	private int ISBN;
	private boolean disponibilidade;
	
	public Biblioteca(String titulo, String autor, int ISBN, boolean disponibilidade) {
		this.titulo = titulo;
		this.autor = autor;
		this.ISBN = ISBN;
		this.disponibilidade = disponibilidade;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getISBN() {
		return ISBN;
	}
	
	public boolean getDisponibilidade() {
		return disponibilidade;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	

}
