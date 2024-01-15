import java.util.Random;

public class Driver {
	public static int[][] count()
	{
		int[] arr1 = new int[500];
		int[] arr2 = new int[1000];
		int[] arr3 = new int[1500];
		int[] arr4 = new int[2000];
		int[] arr5 = new int[2500];
		int[] arr6 = new int[3000];
		int[] arr7 = new int[3500];
		int[] arr8 = new int[4000];
		int[] arr9 = new int[4500];
		int[] arr10 = new int[5000];
		int[] arr11 = new int[5500];
		int[] arr12 = new int[6000];
		int[] arr13 = new int[6500];
		int[] arr14= new int[7000];
		int[] arr15 = new int[7500];
		int[] arr16 = new int[8000];
		int[] arr17 = new int[8500];
		int[] arr18 = new int[9000];
		int[] arr19 = new int[9500];
		int[] arr20 = new int[10000];


		arr1 = randomArr(arr1.length);
		arr2 = randomArr(arr2.length);
		arr3 = randomArr(arr3.length);
		arr4 = randomArr(arr4.length);
		arr5 = randomArr(arr5.length);
		arr6 = randomArr(arr6.length);
		arr7 = randomArr(arr7.length);
		arr8 = randomArr(arr8.length);
		arr9 = randomArr(arr9.length);
		arr10 = randomArr(arr10.length);
		arr11 = randomArr(arr11.length);
		arr12 = randomArr(arr12.length);
		arr13 = randomArr(arr13.length);
		arr14 = randomArr(arr14.length);
		arr15 = randomArr(arr15.length);
		arr16 = randomArr(arr16.length);
		arr17 = randomArr(arr17.length);
		arr18 = randomArr(arr18.length);
		arr19 = randomArr(arr19.length);
		arr20 = randomArr(arr20.length);


		int[][] answer = new int[2][20];

		answer[0][0] = Merge.sort(arr1, 0, arr1.length-1);
		answer[0][1] = Merge.sort(arr2, 0, arr1.length-1);
		answer[0][2] = Merge.sort(arr3, 0, arr1.length-1);
		answer[0][3] = Merge.sort(arr4, 0, arr1.length-1);
		answer[0][4] = Merge.sort(arr5, 0, arr1.length-1);
		answer[0][5] = Merge.sort(arr6, 0, arr1.length-1);
		answer[0][6] = Merge.sort(arr7, 0, arr1.length-1);
		answer[0][7] = Merge.sort(arr8, 0, arr1.length-1);
		answer[0][8] = Merge.sort(arr9, 0, arr1.length-1);
		answer[0][9] = Merge.sort(arr10, 0, arr1.length-1);
		answer[0][10] = Merge.sort(arr11, 0, arr1.length-1);
		answer[0][11] = Merge.sort(arr12, 0, arr1.length-1);
		answer[0][12] = Merge.sort(arr13, 0, arr1.length-1);
		answer[0][13] = Merge.sort(arr14, 0, arr1.length-1);
		answer[0][14] = Merge.sort(arr15, 0, arr1.length-1);
		answer[0][15] = Merge.sort(arr16, 0, arr1.length-1);
		answer[0][16] = Merge.sort(arr17, 0, arr1.length-1);
		answer[0][17] = Merge.sort(arr18, 0, arr1.length-1);
		answer[0][18] = Merge.sort(arr19, 0, arr1.length-1);
		answer[0][19] = Merge.sort(arr20, 0, arr1.length-1);


		answer[1][0] = Insertion.insertionSort(arr1);
		answer[1][1] = Insertion.insertionSort(arr2);
		answer[1][2] = Insertion.insertionSort(arr3);
		answer[1][3] = Insertion.insertionSort(arr4);
		answer[1][4] = Insertion.insertionSort(arr5);
		answer[1][5] = Insertion.insertionSort(arr6);
		answer[1][6] = Insertion.insertionSort(arr7);
		answer[1][7] = Insertion.insertionSort(arr8);
		answer[1][8] = Insertion.insertionSort(arr9);
		answer[1][9] = Insertion.insertionSort(arr10);
		answer[1][10] = Insertion.insertionSort(arr11);
		answer[1][11] = Insertion.insertionSort(arr12);
		answer[1][12] = Insertion.insertionSort(arr13);
		answer[1][13] = Insertion.insertionSort(arr14);
		answer[1][14] = Insertion.insertionSort(arr15);
		answer[1][15] = Insertion.insertionSort(arr16);
		answer[1][16] = Insertion.insertionSort(arr17);
		answer[1][17] = Insertion.insertionSort(arr18);
		answer[1][18] = Insertion.insertionSort(arr19);
		answer[1][19] = Insertion.insertionSort(arr20);

		return answer;




		
















	}

	public static int[] randomArr(int n)
    {
        int[] arr = new int[n];
        Random random = new Random();

        for(int i=0;i<n;i++)
        {

            int number = random.nextInt(n);

            arr[i] = number;
        }

        return arr;

    }
	
}
