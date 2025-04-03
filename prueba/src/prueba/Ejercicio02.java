package prueba;

public class Ejercicio02 {
	public static void main(String[] args) {
		int[][] matriz = {
	            {0,2,3},
	            {4,0,8},
	            {2,3,1}
	      };
		
		if(daCero(matriz))
			System.out.println("da cero");
		else
			System.out.println("No da cero");
}

	private static boolean daCero(int [][]matriz) {
		boolean cero=false;
	
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[0].length && !cero;j++) {
				if(matriz[i][j]==0)
					cero=true;
			}
		return cero;
	}
	
	private static void mostrarMatriz(int[][] matriz) {
		int i,j;
		
		for(i=0;i < matriz.length;i++) {
			for(j=0;j < matriz[0].length-1;j++) {
				 System.out.print(matriz[i][j] + " ");
			}
			System.out.println(matriz[i][j]);
		}
	}
}
