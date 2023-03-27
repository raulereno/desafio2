package prode;

import java.util.ArrayList;


public class Prode {

	public static void main(String[] args) {

	
		int puntos = 0;
		
		ArrayList<Pronostico> pronosticos = new Pronosticos(args[0]).getPronosticos();
		ArrayList<Resultado> resultados= new Resultados(args[1]).getResultados();
		
		for (int i = 0; i < resultados.size(); i++) {
			Resultado resultado = resultados.get(i);
			Pronostico pronostico = pronosticos.get(i);
			
			
			System.out.println(resultado.getResult());
			System.out.println(pronostico.getPronostico());
			if(resultado.getGanador().equals(pronostico.getGanador())) {
				puntos++;
				System.out.println("Sumas +1");
			}
		}
		
		System.out.println("Puntaje: "+puntos);
		
	}
}
