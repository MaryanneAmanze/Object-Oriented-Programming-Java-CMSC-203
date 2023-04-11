import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwoDimRaggedArrayUtilitySTUDENT_Test {

	//STUDENT fill in dataSetSTUDENT with values, it must be a ragged array
		private double[][] dataSetSTUDENT = null;
		
		private File inputFile,outputFile;

		@BeforeEach
		public void setUp() throws Exception {
			outputFile = new File("TestOut.txt");
		}

		@AfterEach
		public void tearDown() throws Exception {
			dataSetSTUDENT = null;
			inputFile = outputFile = null;
		}

		/**
		 * Student Test getTotal method
		 * Return the total of all the elements in the two dimensional array
		 */
		@Test
		public void testGetTotal() {
			fail("Student testGetTotal not implemented");	
		}

		/**
		 * Student Test getAverage method
		 * Return the average of all the elements in the two dimensional array
		 */
		@Test
		public void testGetAverage() {
			fail("Student testGetAverage not implemented");	
		}

		/**
		 * Student Test getRowTotal method
		 * Return the total of all the elements of the row.
		 * Row 0 refers to the first row in the two dimensional array
		 */
		@Test
		public void testGetRowTotal() {
			fail("Student testGetRowTotal not implemented");	
		}


		/**
		 * Student Test getColumnTotal method
		 * Return the total of all the elements in the column. If a row in the two dimensional array
		 * doesn't have this column index, it is not an error, it doesn't participate in this method.
		 * Column 0 refers to the first column in the two dimensional array
		 */
		@Test
		public void testGetColumnTotal() {
			fail("Student testGetColumnTotal not implemented");	
		}


		/**
		 * Student Test getHighestInArray method
		 * Return the largest of all the elements in the two dimensional array.
		 */
		@Test
		public void testGetHighestInArray() {
			fail("Student testGetHighestInArray not implemented");	
		}
		

		/**
		 * Test the writeToFile method
		 * write the array to the outputFile File
		 * then read it back to make sure formatted correctly to read
		 * 
		 */
		@Test
		public void testWriteToFile() {
			double[][] array=null;
			fail("Student testWriteToFile not implemented");	
		}

}
