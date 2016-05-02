package Model;

import java.util.Date;

public class Saude {
	private int idSaude;
	private int idAnimal;
	private String sintomas;
	private String medicamentos;
	private Date dataInicio;
	private String complemento;
	private Double custo;
	
	
	
	public Saude() {
		super();
		this.idSaude = 0;
		this.idAnimal = 0;
		this.sintomas = "";
		this.medicamentos = "";
		this.dataInicio = null;
		this.complemento = "";
		this.custo = 0.0;
	}
	public int getIdSaude() {
		return idSaude;
	}
	public void setIdSaude(int idSaude) {
		this.idSaude = idSaude;
	}
	public int getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}
	public String getSintomas() {
		return sintomas;
	}
	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	public String getMedicamentos() {
		return medicamentos;
	}
	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public Double getCusto() {
		return custo;
	}
	public void setCusto(Double custo) {
		this.custo = custo;
	}
	
	
}
