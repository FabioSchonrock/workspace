import javax.swing.JOptionPane;

import com.sun.tools.javac.util.Convert;

import java.time.LocalDate;

public class Cadastro {
	private String nome = JOptionPane.showInputDialog("Por favor digite o seu nome:");
	private String nasc = JOptionPane.showInputDialog("Por favor digite a sua data de nascimento");
	private float alt = Float.parseFloat(JOptionPane.showInputDialog("Por favor digite a sua altura: "));

	public Cadastro(String nome, String nasc, float alt) {
		this.nome = nome;
		this.nasc = nasc;
		this.alt = alt;
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public String getnasc() {
		return nasc;
	}

	public void setnasc() {
		this.nasc = nasc;

	}

	public double getalt() {
		return alt;
	}

	public void setalt() {
		this.alt = alt;
	}

	public void apresentaDados() {
		System.out.println("Nome: " + this.getnome());
		System.out.println("Data de nascimento: " + this.getnasc());
		System.out.println("Altura: " + this.getalt());
	}
	
	public static void main(String[] args) {
	    LocalDate myObj = LocalDate.now(); // Create a date object
	    System.out.println(myObj); // Display the current date
	  }
	
	public void calculaIdade() {
		
		
	}

}
