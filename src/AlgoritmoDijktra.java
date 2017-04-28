import java.util.*;

public class AlgoritmoDijktra {

	public static List<Nodo> getDistacias (GrafoDirigido grafo, int index) {
		List<Nodo> distancias = new ArrayList<Nodo>();
		List<Lista> vertices = grafo.getVertices();
	
		while (index < vertices.size()) {
			List<Nodo> adyacentes = grafo.getAdyacentes(index);
			Nodo verticeMasCerca = getVerticeMasCerca(adyacentes);
			distancias.add(verticeMasCerca);
			index = verticeMasCerca.getValor();
		}		
		
		return distancias;
	}
	
	
	private static Nodo getVerticeMasCerca(List<Nodo> adyacentes) {
		
		int indexDistanciaMayor = 0;
		
		for (int i = 0; i < adyacentes.size(); i++) {
			if(adyacentes.get(i).getDistancia() < adyacentes.get(indexDistanciaMayor).getDistancia() ) {
				indexDistanciaMayor = i;
			}
		}
		
		return adyacentes.get(indexDistanciaMayor);
	}
}
