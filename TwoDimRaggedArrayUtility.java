import java.lang.Object;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public final class TwoDimRaggedArrayUtility {
	
// Methods 
	
	
	/**
	   * Returns the average of the elements in the two dimensional array
	   * 
	   * @param data the two dimensional array getting the average of
	   * @return the average of the elements in the two dimensional array 
	   */
	public static double getAverage(double[][] data)
	{
		int arrayNumbers = 0;
	    double total = 0.0;
	    for (int i = 0; i < data.length; i++)
	    { 
	      for (int j = 0; j < data[i].length; j++) 
	      {
	    	  arrayNumbers++;
	        total += data[i][j];
	      }
	    }
	    double average = (double)total / arrayNumbers;
	    return average;
	}
	/**
	   * Returns the total of the selected column in the two dimensional array 
	   * 
	   * @param data the two dimensional array
	   * @param col the column index to take the total 
	   * @return the total of the column
	   */
	public static double getColumnTotal(double[][] data, int col)
	{
		double colTotal = 0.0;
	    for (int i = 0;i < data.length; i++) 
	    {
	      if (col >= data[i].length) 
	      {
	        continue;
	      }
	        colTotal += data[i][col];
	    }
	    return colTotal;
	}
	/**
	   * Returns the largest element in the two dimensional array
	   * 
	   * @param data the two dimensional array
	   * @return the largest element in the two dimensional array
	   */
	public static double getHighestInArray(double[][] data)
	{
		double arrayHighest = -999999.0;
	    for (int i = 0; i < data.length; i++) 
	    { 
	      for (int j = 0; j < data[i].length; j++)
	      {
	        if (data[i][j] > arrayHighest) 
	        {
	          arrayHighest = data[i][j];
	        }
	      }
	    }
	    return arrayHighest;
	}
	/**
	   * Returns the largest element of the selected column in the two dimensional array
	   * 
	   * @param data the two dimensional array
	   * @param col the column index to find the largest element from
	   * @return the largest element of the column
	   */
	public static double getHighestInColumn(double[][] data, int col)
	{
		double colHighest = -999999.0;
	    for (int i = 0; i < data.length; i++) 
	    {
	      if (col >= data[i].length) 
	      {
	        continue;
	      }
	      if (data[i][col] > colHighest) 
	      {
	        colHighest = data[i][col];
	      }
	    }
	    return colHighest;
	}
	/**
	   * Returns index of the largest element of the selected column in the two dimensional array
	   * 
	   * @param data the two dimensional array
	   * @param col the column index to find the largest element from
	   * @return the index of the largest element of the column
	   */
	public static int getHighestInColumnIndex(double[][] data, int col)
	{
		double highest = -999999.0;
	    int val = -1;
	    for (int i = 0; i < data.length; i++) 
	    {
	      if (col >= data[i].length) 
	      {
	        continue;
	      }
	      if (data[i][col] > highest ) 
	      {
	        highest = data[i][col];
	        val = i;
	      }
	    }
	    return val;
	  }
	/**
	   * Returns the largest element of the selected row in the two dimensional array 
	   * 
	   * @param data the two dimensional array
	   * @param row the row index to find the largest element from
	   * @return the largest element of the row
	   */
	public static double getHighestInRow(double[][] data, int row)
	{
		double rowHighest = -999999.0;
	    for (int i = 0;i < data[row].length;i++)
	    {
	      if (data[row][i] > rowHighest) 
	      {
	        rowHighest = data[row][i];
	      }
	    }
	    return rowHighest;
	}
	/**
	   * Returns the largest element of the selected row in the two dimensional array index 
	   * 
	   * @param data the two dimensional array
	   * @param row the row index to find the largest element from
	   * @return the largest element of the row
	   */
	public static int getHighestInRowIndex(double[][] data, int row)
	{
		double highest = -999999.0;
	    int val = -1;
	    for (int i = 0;i < data[row].length;i++) 
	    {
	      if (data[row][i] > highest) 
	      {
	        highest = data[row][i];
	        val = i;
	      }
	    }
	    return val;
	}
	
	/**
	   * Returns the smallest element in the two dimensional array
	   * 
	   * @param data the two dimensional array
	   * @return the smallest element in the two dimensional array
	   */
	public static double getLowestInArray(double[][] data)
	{
		double arrayLowest = 999999.0;
	    for (int i = 0; i < data.length; i++)
	    { 
	      for (int j = 0; j < data[i].length; j++)
	      {
	        if (data[i][j] < arrayLowest) 
	        {
	        	arrayLowest = data[i][j];
	        }
	      }
	    }
	    return arrayLowest;
	}
	/**
	   * Returns the smallest element of the selected column in the two dimensional 
	   * 
	   * @param data the two dimensional array
	   * @param col the column index to find the smallest element of (0 refers to the first column)
	   * @return the smallest element of the column
	   */
	public static double getLowestInColumn(double[][] data, int col)
	{
		double colLowest = 999999.0;
	    for (int i = 0; i < data.length; i++)
	    {
	      if (col >= data[i].length) 
	      {
	        continue;
	      }
	      if (data[i][col] < colLowest)
	      {
	        colLowest = data[i][col];
	      }
	    }
	    return colLowest;
	}
	
	/**
	   * Returns the index of the smallest element of the selected column in the two dimensional array
	   * 
	   * @param data the two dimensional array
	   * @param col the column index to find the smallest element 
	   * @return the index of the smallest element of the column
	   */
	public static int getLowestInColumnIndex(double[][] data, int col)
	{
		double lowest = 999999.0;
	    int val = -1;
	    for (int i = 0; i < data.length; i++)
	    {
	      if (col >= data[i].length) {
	        continue;
	      }
	      if (data[i][col] < lowest)
	      {
	        lowest = data[i][col];
	        val = i;
	      }
	    }
	    return val;
	}
	/**
	   * Returns the lowest element of a specific row in the two dimensional array.
	   *
	   * @param data the two dimensional array
	   * @param row the row index to find the smallest element from
	   * @return the smallest element of the row
	   */
	public static double getLowestInRow(double[][] data, int row)
	{
		double rowLowest = 999999.0;
	    for (int i = 0; i < data[row].length; i++) 
	    {
	      if (data[row][i] < rowLowest) 
	      {
	        rowLowest = data[row][i];
	      }
	    }
	    return rowLowest;
	}
	/**
	   * Returns the index of the smallest element of the selected row in the two dimensional array
	   * index 0 refers to the first row.
	   * 
	   * @param data the two dimensional array
	   * @param row the row index to find the smallest element of 
	   * @return the index of the smallest element of the row
	   */
	public static int getLowestInRowIndex(double[][] data, int row)
	{
		double lowest = 999999.0;
		int val = -1;
		for (int i = 0; i < data[row].length; i++)
		{
			if (data[row][i] < lowest) 
			{
		        lowest = data[row][i];
		        val  = i;
			}
		}
		return val;
	}
	/**
	   * Returns the total of the selected row in the two dimensional array index 0 refers to the first
	   * row.
	   * 
	   * @param data the two dimensional array
	   * @param row the row index to take the total of 
	   * @return the total of the row
	   */
	public static double getRowTotal(double[][] data, int row)
	{
		double total = 0.0;
		for(int i = 0; i < data[row].length; i++)
		{
			total += data[row][i];
		}
		return total;
		
	}
	/**
	   * Returns the total of all the elements of the two dimensional array
	   * 
	   * @param data the two dimensional array getting total of
	   * @return the sum of all the elements in the two dimensional array
	   */
	public static double getTotal(double[][] data)
	{
		double total = 0.0;
		for(int i = 0; i < data.length;i++) {
			for(int j = 0; j < data[i].length;j++) {
				total += data[i][j];
			}
		}
		return total;
	}
	
	
	public static double[][] readFile(File file) throws FileNotFoundException
	{
		// Variables
				double a[][] = null;
				Scanner scanner1, scanner2;
				int rows = 0;
				int currentRow = 0;
				scanner1 = new Scanner(file);

				// Count Rows
				while (scanner1.hasNextLine()) { rows++; scanner1.nextLine(); }
				scanner1.close();

				// Initialize Rows
				a = new double[rows][];
				scanner2 = new Scanner(file);

				// Fetch Row Data
				while (scanner2.hasNextLine()) {
					// Variables
					String line = scanner2.nextLine();
					String columns[] = line.trim().split(" ");
					a[currentRow] = new double[columns.length];

					// Loop (Row => Column Values)
					for (int i = 0; i < columns.length; i++) {
						a[currentRow][i] = Double.parseDouble(columns[i]);
					}
					currentRow++;
				}

				// Close scanner
				scanner2.close();

				return a;
	}
	
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException
	{
		PrintWriter file = new PrintWriter(outputFile);
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				if(j != 0) {
					file.print(" " + data[i][j]);
				}
				else {
					file.print(data[i][j]);
				}
				
			}
			file.println();
		}
		file.close();
	  }
	
}
