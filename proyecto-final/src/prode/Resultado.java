package prode;

public class Resultado {
	private String equipo1;
	private String equipo2;
	private Integer cantGoles1;
	private Integer cantGoles2;
	private String ganador;
	
	public Resultado(String equipo1,String equipo2,Integer cantGoles1,Integer cantGoles2) {
		this.setEquipo1(equipo1);
		this.setEquipo2(equipo2);
		this.setCantGoles1(cantGoles1);
		this.setCantGoles2(cantGoles2);
	}

	public String getResult() {
		return "Resultados -->"+this.getEquipo1()+" vs "+this.getEquipo2()+ " Ganador:"+this.getGanador();
	}
	
	public String getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(String equipo1) {
		this.equipo1 = equipo1;
	}

	public String getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(String equipo2) {
		this.equipo2 = equipo2;
	}

	public Integer getCantGoles1() {
		return cantGoles1;
	}

	public void setCantGoles1(Integer cantGoles1) {
		this.cantGoles1 = cantGoles1;
	}

	public Integer getCantGoles2() {
		return cantGoles2;
	}

	public void setCantGoles2(Integer cantGoles2) {
		this.cantGoles2 = cantGoles2;
	}

	public String getGanador() {
		return ganador;
	}

	public void setGanador(String ganador) {
		this.ganador = ganador;
	}
}
