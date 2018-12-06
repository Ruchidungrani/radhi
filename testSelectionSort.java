import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	private SelectionSort temp1;
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

	public testSelectionSort() {
    }
    
    public void testPositive(){
    	
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
       // int maxValue= arr[0];
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        /** add tests to check for this unit test **/
       //assertEquals("testPositive is False",10,maxValue);
       SelectionSort temp1 = new SelectionSort();
       int[] values = temp1.SelectionSort(arr);
       int maxValue = values[Sortedarr.length-1];
       assertEquals("testPositive is False",10,maxValue);  
    }
    
  public void testNegative(){
        
        /** Test data contains negative values only **/
    	 int[] arr = new int[5];
         arr[0] = -2;
         arr[1] = -9;
         arr[2] = -6;
         arr[3] = -7;
         arr[4] = -5;
         //int maxValue= arr[0];
         int[] Sortedarr = new int[5];
         Sortedarr[0] = -9;
         Sortedarr[1] = -7;
         Sortedarr[2] = -6;
         Sortedarr[3] = -5;
         Sortedarr[4] = -2;
         SelectionSort temp1 = new SelectionSort();
         int[] values = temp1.SelectionSort(arr);
         int maxValue = values[Sortedarr.length-1];
         assertEquals("testNegative is False",-2,maxValue); 
    }
    
    public void testMixed(){
        
        /** Test data contains with both positive, negative and zeros **/
    	 int[] arr = new int[5];
         arr[0] = -8;
         arr[1] = 0;
         arr[2] = 7;
         arr[3] = -10;
         arr[4] = 2;
        // int maxValue= arr[0];
         int[] Sortedarr = new int[5];
         Sortedarr[0] = -10;
         Sortedarr[1] = -8;
         Sortedarr[2] = 0;
         Sortedarr[3] = 2;
         Sortedarr[4] = 7;
         SelectionSort temp1 = new SelectionSort();
         int[] values = temp1.SelectionSort(arr);
         int maxValue = values[Sortedarr.length-1];
         assertEquals("testMixed is False",7,maxValue); 
    }
    
    public void testDuplicates(){
        
        /** Test data contains duplicates **/
    	 int[] arr = new int[5];
         arr[0] = 8;
         arr[1] = 9;
         arr[2] = 7;
         arr[3] = 10;
         arr[4] = 2;
        // int maxValue= arr[0];
         int[] Sortedarr = new int[5];
         Sortedarr[0] = 2;
         Sortedarr[1] = 7;
         Sortedarr[2] = 8;
         Sortedarr[3] = 9;
         Sortedarr[4] = 10;
         SelectionSort temp1 = new SelectionSort();
         int[] values = temp1.SelectionSort(arr);
         int maxValue = values[Sortedarr.length-1];
         assertEquals("testMixed is False",10,maxValue); 
    }


}
