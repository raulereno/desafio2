package prode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Resultados {
	
	private ArrayList<Resultado> resultados = new ArrayList<Resultado>();

	public Resultados(String path) {
		this.setResultados(path);
	}

	public void setResultados(String path) {
		Path file = Paths.get(path);
		List<String> lines;
		boolean primeraLinea = true;
		
		try {
			lines = Files.readAllLines(file.toAbsolutePath());
			
			for (String line : lines) {
				
				if(primeraLinea) {
					primeraLinea=false;
					continue;
				}
				String[] partido = line.split(";");
				Resultado resultado = new Resultado(partido[0],partido[3],Integer.parseInt(partido[1]),Integer.parseInt(partido[2]));
				
				if(resultado.getCantGoles1() > resultado.getCantGoles2()) {
					resultado.setGanador(resultado.getEquipo1());
				}
				else if(resultado.getCantGoles1() == resultado.getCantGoles2()) {
					resultado.setGanador("empate");
				}
				else if(resultado.getCantGoles1() < resultado.getCantGoles2()) {
					resultado.setGanador(resultado.getEquipo2());
				}
				
				
				this.resultados.add(resultado);
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Resultado> getResultados() {
		return this.resultados;
	}
	
}
