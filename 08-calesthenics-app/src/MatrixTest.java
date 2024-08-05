import java.util.Scanner;

public class MatrixTest {

	public static void main(String[] args) {
	
		int matrix[][]=new int[3][3];
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter matrix elements: ");
		
		createRows(matrix,scanner);	
		
		
		System.out.println("Matrix is: ");
		
		printMatrix(matrix);
		
		

	}
	
	private static void printMatrix(int[][] matrix) {
		
		for(int i=0;i<3;i++)
		{
			printRow(matrix,i);
			System.out.println("");
		}
	}

	private static void printRow(int[][] matrix, int i) {

		for(int j=0;j<3;j++)
		{
			System.out.print(matrix[i][j]+"\t");
		}
		
	}

	private static void createRows(int matrix[][], Scanner scanner)
	{
		for(int i=0;i<3;i++)
		{
			readRowElements(matrix,scanner,i);
			
		}
	}
	
	private static void readRowElements(int matrix[][],Scanner scanner, int row)
	{
		for(int j=0;j<3;j++)
		{
			matrix[row][j]=scanner.nextInt();
		}
	}
	

}
