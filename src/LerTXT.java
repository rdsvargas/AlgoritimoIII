import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

import javax.swing.JOptionPane;

//import java.io.BufferedReader;



public class LerTXT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Scanner sc = new Scanner(new FileReader("D:\\Google Drive\\ADS\\2017_1\\Algoritimos e Programacao III\\Aula03\\example_4.txt"));
			int col = sc.nextInt();
			int lin = sc.nextInt();
			int[][] arBinario = new int[lin][col];
			int index = 0;
			while (sc.hasNext()){
				arBinario[index] = stringToArray(sc.next());
				index++;
			}

		
			printMatriz(arBinario);
			int[][] copia1 = new int[lin][col];
			int[][] copia2 = new int[lin][col];

			copiaDados(arBinario, copia1);
			copiaDados(arBinario, copia2);
			
			substValores(copia1, 1, 2);
			substValores(copia2, 0, 2);
			
			System.out.println("");
			System.out.println("");
			
			printMatriz(copia1);
			System.out.println("");
			System.out.println("");
			printMatriz(copia2);
		
		} catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            System.exit(0);
        }	
	}

	static int[] stringToArray(String str){
		int[] array = new int[str.length()];
			for (int i=0; i < str.length(); i++){
				array[i] = Integer.parseInt(str.substring(i, i+1));
			}
		return array;
	}
	
	static void printMatriz(int[][] matriz){
		for(int index = 0; index < matriz.length; index ++){
			System.out.print("|");
			for (int i = 0; i< matriz[index].length; i++){
				System.out.print(matriz[index][i] + "|");
			}
			System.out.println("");
		}
	}
	
	static void substValores(int[][] matriz, int valAtual, int novoValor){
		for(int index = 0; index < matriz.length; index ++){
			for (int i = 0; i< matriz[index].length; i++){
				if (matriz[index][i] == valAtual ){
					matriz[index][i] = novoValor;
				}
			}
		}
	}
	
	static void copiaDados(int[][] origem, int[][] destino){
		for(int index = 0; index < origem.length; index ++){
			for (int i = 0; i< origem[index].length; i++){
				destino[index][i] = origem[index][i];
			}
		}
	}
	
}
