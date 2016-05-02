package Model;

public class Usuario {
	private int idUser;
	private String nome;
	private String senha;
	
	public Usuario(){
		this.idUser =0;
		this.nome="";
		this.senha="";
	}
	
	public Usuario(Usuario u){
		this.idUser = u.idUser;
		this.nome= u.nome;
		this.senha= u.senha;
	}
	
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public String toString() {
		return "Usuario [idUser=" + idUser + ", nome=" + nome + ", senha=" + senha + "]";
	}
	
	

}
