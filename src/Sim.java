import java.util.*;

public class Sim {
	public static void main(String[] args) {
		
	
		GrafoDirigido grafo = new GrafoDirigido();
		
		grafo.addVertice();
		grafo.addVertice();
		grafo.addVertice();
		grafo.addVertice();
		grafo.addVertice();
		
		
		grafo.addArco(0, 1, 10); //origen, destino , distancia
		grafo.addArco(0, 3, 30); //origen, destino , distancia
		grafo.addArco(0, 4, 100); //origen, destino , distancia
		
		grafo.addArco(1, 2, 50); //origen, destino , distancia
		
		grafo.addArco(2, 4, 10); //origen, destino , distancia
		
		grafo.addArco(3, 2, 20); //origen, destino , distancia
		grafo.addArco(3, 4, 60); //origen, destino , distancia
		
		
		List<Nodo> distancias = AlgoritmoDijktra.getDistacias(grafo, 0);
		
		for (Nodo nodo : distancias) {
			System.out.println(nodo.getDistancia());
		}
		
	}
}