import javax.swing.JOptionPane;

import java.text.Format;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Cadastro {
	private String nome;
	private String nasc;
	private float alt;

	public Cadastro(String nome, String nasc, float alt) {
		this.nome = nome;
		this.nasc = nasc;
		this.alt = alt;
	}
	
	public String dados() {
		return "Nome: " + nome + "\n Data de nascimento: " + "nasc" + "\n altura";
		
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

}
