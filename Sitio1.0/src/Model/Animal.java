package Model;

import java.util.Date;

public class Animal {
	private int idAnimal;
	private int idUsuario;
	private String nome;
	private int brinco;
	private Date nascimento;
	private String sexo;
	private String complemento;
	private String imagem;
	private String dirImagem;
	
	
	
	public Animal() {
		super();
		this.idAnimal = 0;
		this.idUsuario = 0;
		this.nome = "";
		this.brinco = 0;
		this.nascimento = null;
		this.sexo = "";
		this.complemento = "";
		this.imagem = "";
		this.dirImagem = "";
	}
	public int getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getBrinco() {
		return brinco;
	}
	public void setBrinco(int brinco) {
		this.brinco = brinco;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public String getDirImagem() {
		return dirImagem;
	}
	public void setDirImagem(String dirImagem) {
		this.dirImagem = dirImagem;
	}
	
	
	
	
}
