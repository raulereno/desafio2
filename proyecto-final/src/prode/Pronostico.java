package prode;

public class Pronostico {

	private String equipo1;
	private String equipo2;
	
	private String ganador;
	
	
	public String getPronostico() {
		return "Pronostico -->"+this.equipo1+" vs "+this.equipo2+" Ganador:"+this.ganador;
	}
	
	public String getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(String equipo2) {
		this.equipo2 = equipo2;
	}

	public String getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(String equipo1) {
		this.equipo1 = equipo1;
	}

	public String getGanador() {
		return ganador;
	}

	public void setGanador(String ganador) {
		this.ganador = ganador;
	}
	
	
	
	
}
