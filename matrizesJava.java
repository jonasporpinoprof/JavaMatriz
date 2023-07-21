public class Main
{
	public static void main(String[] args) {
		String[][]Frutas = new String[4][4]; // 4 colunas e 4 linhas da matriz
		
		Frutas[0][0]="palavra1";
		Frutas[1][1]="palavra2";
		Frutas[3][4]="palavra3";
		
		// leitura da linha da matriz
		for(int linha = 0; linha < Frutas.length; linha++){
		    // leitura da coluna da matriz
		    for(int coluna = 0; coluna < Frutas[0].length; coluna++){
		        System.out.print(Frutas[linha][coluna]+"");
		    }
            System.out.println(" ");
		  }
	}
}
