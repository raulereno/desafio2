package prode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Pronosticos {

	
	private ArrayList<Pronostico> pronosticos = new ArrayList<Pronostico>();

	public Pronosticos(String path) {
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
				
				
				String[] aux = line.split(";");
				
				Pronostico pronostico = new Pronostico();
				
				for (int i = 0; i < aux.length; i++) {
					
					if(i == 0) {
						pronostico.setEquipo1(aux[i]);
						continue;
					}
					if(aux[i].equals("x") && i == 1 ) {
						pronostico.setGanador(aux[0]);
					}
					else if(aux[i].equals("x") && i == 2) {
						pronostico.setGanador("empate");
					}else if(aux[i].equals("x") && i == 3) {
						pronostico.setGanador(aux[aux.length-1]);
					}
					
				}
				
				pronostico.setEquipo2(aux[aux.length-1]);
				
				this.pronosticos.add(pronostico);
				
			}
	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Pronostico> getPronosticos() {
		return this.pronosticos;
	}
}
