package Model;

import java.util.Date;

public class Prenhez {
	private int idPrenhez;
	private int idAnimal;
	private Date dataInicio;
	private Date dataPrevista;
	private String complemento;
	
	
	
	
	public Prenhez() {
		super();
		this.idPrenhez = 0;
		this.idAnimal = 0;
		this.dataInicio = null;
		this.dataPrevista = null;
		this.complemento = "";
	}
	
	public int getIdPrenhez() {
		return idPrenhez;
	}
	public void setIdPrenhez(int idPrenhez) {
		this.idPrenhez = idPrenhez;
	}
	public int getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataPrevista() {
		return dataPrevista;
	}
	public void setDataPrevista(Date dataPrevista) {
		this.dataPrevista = dataPrevista;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
}
