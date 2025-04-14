package prueba;

public class Ejercicio03 {
	public static void main(String[] args) {
		int mat1[][] = { { 8, 2, -3, 4 }, { 5, -6, -6, 20 }, { 21, 1, -5, 0 } };

		int mat2[][] = sumaAdy(mat1);

		mostrarMatriz(mat1);
		System.out.println();
		mostrarMatriz(mat2);

	}

	private static int[][] sumaAdy(int[][] matriz) {
		//int[][] mat=Arrays.copyOf(matriz, matriz.length);
		int[][] mat = new int[matriz.length][matriz[0].length];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				mat[i][j] = matriz[i][j];

				if (i - 1 >= 0)
					mat[i][j] += matriz[i - 1][j];

				if (i + 1 < matriz.length)
					mat[i][j] += matriz[i + 1][j];

				if (j - 1 >= 0)
					mat[i][j] += matriz[i][j - 1];

				if (j + 1 < matriz[0].length)
					mat[i][j] += matriz[i][j + 1];
			}
		}

		return mat;
	}

	private static void mostrarMatriz(int[][] matriz) {
		int i, j;

		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[0].length - 1; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(matriz[i][j]);
		}
	}
}
//aa
