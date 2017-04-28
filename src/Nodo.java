import java.util.*;

public class Nodo {
		private int valor;	
		private int distancia;
		private Nodo sig;

		public Nodo (int v, int dis) {
			valor = v;
			distancia = dis;
		}


		/**
		 * Get valor
		 * @return
		 */
		public int getValor() {
			return valor;
		}

		/**
		 * Set valor
		 * @param v
		 */
		public void setValor (int v) {
			valor = v;
		}

		public void setSig(Nodo n) {
			sig = n;
		}

		public Nodo getSig() {
			return sig;
		}
		
		public int getDistancia (){
			return distancia;
		}
		
		public void setDistancia (int d) {
			distancia = d;
		}
	}