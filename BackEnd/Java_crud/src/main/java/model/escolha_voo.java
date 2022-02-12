package model;

import java.util.Date;

public class escolha_voo {
	
	private int id;
	private String embarque;
	private String Desembarque;
	private String horario;
	private Date datavoo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmbarque() {
		return embarque;
	}
	public void setEmbarque(String embarque) {
		this.embarque = embarque;
	}
	public String getDesembarque() {
		return Desembarque;
	}
	public void setDesembarque(String desembarque) {
		Desembarque = desembarque;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Date getDatavoo() {
		return datavoo;
	}
	public void setDatavoo(Date datavoo) {
		this.datavoo = datavoo;
	}
	
	@Override
	public String toString() {
		return "escolha_voo [id=" + id + ", embarque=" + embarque + ", Desembarque=" + Desembarque + ", horario="
				+ horario + ", datavoo=" + datavoo + "]";
	}
	
	

}
