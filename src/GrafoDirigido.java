import java.util.*;

public class GrafoDirigido {
	
	List<Lista> vertices;

	public GrafoDirigido () {
		vertices = new ArrayList<Lista>();
	}

	/**
	 * Obtiene todos los adyacentes de un Vertice
	 * @param i
	 * @return
	 */
	public List<Nodo> getAdyacentes (int i) {
		
		List<Nodo> listaAdyacentes = new ArrayList<Nodo>();
		
		for (int j = 0; j < vertices.get(i).getSize(); j++) {
			listaAdyacentes.add(vertices.get(i).getNodo(j));
		}
		
	return listaAdyacentes;
	}
	
	/**
	 * Vertices estan insertados de manera ordenada
	 * @param indexVertice
	 * @return
	 */
	public int getVertice(int indexVertice) {
		return indexVertice;
	}

	/**
	 * Agregar un vertice al arreglo de vertices del Grafo
	 * @param indexVertice
	 */
	public void addVertice() {
	
		
		vertices.add(new Lista());
	
	}

	/**
	 * Agregar un Arco a un vertice
	 * @param origen
	 * @param destino
	 */
	public void addArco (int origen, int destino, int distancia) {
		
		if(origen < vertices.size() && destino < vertices.size()) {
			vertices.get(origen).addNodo(destino, distancia);
		}

	}
	
	/**
	 * Retorna un ArrayList de los vertices
	 * @return
	 */
	public List<Lista> getVertices() {
		return vertices;
	}
	/**
	 * Retorna la cantidad de Vertices - Tamaño del Grafo
	 * @return
	 */
	public int getSize () {
		return vertices.size();
	}
}