package model;

public class Janela {
	
	private String nome;
	private double altura;
	private double largura;
	
	public static Janela janela = new Janela();
	private Janela() {
		// TODO Auto-generated constructor stub
	}
	
	public static Janela getInstance() {
		if (janela == null) {
			janela = new Janela();
		}
		return janela;
	}
	
	public void abrir() {
		// TODO Auto-generated method stub

	}
	
	public void fechar() {
		// TODO Auto-generated method stub

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
}
