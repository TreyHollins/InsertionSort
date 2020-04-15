package sort.insertion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class junitTest {

	@Test
	void test() {
		int[] testData = {1,2,-1,100,-5,300,-99,212,400,1};
		InsertionSort.Sort(testData);
		for (int i = 0; i < testData.length; i++) {
			System.out.print(testData[i] + " ");
		}
		
		assert(testData[0] == -99 && testData[testData.length-1] == 400);
	}
	
	@Test
	void test2() {
		int test2Length = 100000;
		int[] testData = new int[test2Length];
		int j = 0;
		// Initialize the test data in descending order so it's 'jumbled'.
		for (int i = testData.length - 1; i >= 0; i--) {
			testData[j] = i;
			j++;
		}
		// Sort in ascending order
		long startTime = System.currentTimeMillis();
		InsertionSort.Sort(testData);
		long endTime = System.currentTimeMillis();
		System.out.println("first = " + testData[0] + ", last = " + testData[test2Length-1]);
		System.out.println("Total execution time of test #2 in seconds " + ((double)(endTime - startTime))/1000 );
		
		assert(testData[0] == 0 && testData[testData.length-1] == 99999);
	}
	
	@Test
	void test3() {
		int test3Length = 100000;
		int[] testData = new int[test3Length];
		// Initialize the test data in ascending order: it will be pre-sorted.
		for (int i = 0; i < testData.length; i++) {
			testData[i] = i;
		}
		// Sort in ascending order
		long startTime = System.currentTimeMillis();
		InsertionSort.Sort(testData);
		long endTime = System.currentTimeMillis();
		System.out.println("first = " + testData[0] + ", last = " + testData[test3Length-1]);
		System.out.println("Total execution time of test #3 in seconds " + ((double)(endTime - startTime))/1000 );
		
		assert(testData[0] == 0 && testData[testData.length-1] == 99999);
	}
	
	@Test
	void test4() {
		int[] testDataSrc = {1,2,-1,100,-5,300,-99,212,400,1};
		int test4Length = 100000;
		int[] testData = new int[test4Length];
		// Initialize the test data in ascending order: it will be pre-sorted.
		for (int i = 0; i < testData.length; i++) {
			testData[i] = testDataSrc[i % testDataSrc.length];
		}
		// Sort in ascending order
		long startTime = System.currentTimeMillis();
		InsertionSort.Sort(testData);
		long endTime = System.currentTimeMillis();
		System.out.println("first = " + testData[0] + ", last = " + testData[test4Length-1]);
		System.out.println("Total execution time of test #4 in seconds " + ((double)(endTime - startTime))/1000 );
		
		assert(testData[0] == -99 && testData[testData.length-1] == 400);
	}
}