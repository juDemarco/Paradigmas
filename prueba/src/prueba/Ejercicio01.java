package prueba;

public class Ejercicio01 {
	
	public static void main(String[] args) {
		int[][] matriz = {
	            {0,2,3},
	            {4,0,8},
	            {2,3,1}
	      };
		
		System.out.println(matriz.length);
	      
		diagonal(matriz);
	}

	
	
	private static void diagonal(int[][] matriz) {
		boolean esValido=true;
        
        if(matriz[0][0] != matriz[1][1]){
            esValido=true;
        }
        
        for(int i = 2; i < matriz.length && esValido; i++){
            if (matriz[i - 1][i-1] * 2 != matriz[i][i])
                esValido=false;
        }
        
        System.out.println(esValido);
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