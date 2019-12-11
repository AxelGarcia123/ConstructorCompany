package modelo;

import java.sql.Date;
import java.sql.Time;

public class DiaHora {
	private int numDiaHora;
	private String diaDiaHora;
	private Time horaEntDiaHora;
	private Time horaSalidaDiaHora;
	private String tipoDiaHora;
	private int folioHora;
	
	public DiaHora() {
		
	}
	
	public DiaHora(int numDiaHora, String diaDiaHora, Time horaEntDiaHora, Time horaSalidaDiaHora, String tipoDiaHora,
			int folioHora) {
		super();
		this.numDiaHora = numDiaHora;
		this.diaDiaHora = diaDiaHora;
		this.horaEntDiaHora = horaEntDiaHora;
		this.horaSalidaDiaHora = horaSalidaDiaHora;
		this.tipoDiaHora = tipoDiaHora;
		this.folioHora = folioHora;
	}

	public int getNumDiaHora() {
		return numDiaHora;
	}

	public void setNumDiaHora(int numDiaHora) {
		this.numDiaHora = numDiaHora;
	}

	public String getDiaDiaHora() {
		return diaDiaHora;
	}

	public void setDiaDiaHora(String diaDiaHora) {
		this.diaDiaHora = diaDiaHora;
	}

	public Time getHoraEntDiaHora() {
		return horaEntDiaHora;
	}

	public void setHoraEntDiaHora(Time horaEntDiaHora) {
		this.horaEntDiaHora = horaEntDiaHora;
	}

	public Time getHoraSalidaDiaHora() {
		return horaSalidaDiaHora;
	}

	public void setHoraSalidaDiaHora(Time horaSalidaDiaHora) {
		this.horaSalidaDiaHora = horaSalidaDiaHora;
	}

	public String getTipoDiaHora() {
		return tipoDiaHora;
	}

	public void setTipoDiaHora(String tipoDiaHora) {
		this.tipoDiaHora = tipoDiaHora;
	}

	public int getFolioHora() {
		return folioHora;
	}

	public void setFolioHora(int folioHora) {
		this.folioHora = folioHora;
	}
}
