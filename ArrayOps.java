public class ArrayOps {
    public static void main(String[] args) {
		boolean result = containsTheSameElements(new int[] {1, 2, 1, 1, 2}, new int[] {2, 1});
		System.out.println(result);

		int r = secondMaxValue(new int[] {-202, 48, 13, 7, 8});
		System.out.println(r);
    }
    
    public static int findMissingInt (int [] array) {
		if (array.length == 1) {
			return 1;
		}

		int[] sortedArr = sortArr(array);
		for(int i = 0 ; i < array.length ; i++){
			if(sortedArr[i] != i) {
				return i;
			}
		}
		return -1;
    }


    public static int secondMaxValue(int [] array) {
		int[] sortedArr = sortArr(array);
		return sortedArr[sortedArr.length - 2];
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
		if (array1.length != array2.length) {
			return false;
		}

		int[] array1Sort = sortArr(array1);
		int[] array2Sort = sortArr(array2);

		for (int i = 0; i < array1Sort.length; i++) {
			if (array1Sort[i] != array2Sort[i]) {
				return false;
			}
		}
		return true;
	}

    public static boolean isSorted(int [] array) {
		int[] sortedArr = sortArr(array);
		for(int i = 0; i < array.length ; i++){
			if (sortedArr[i] != array[i]){
				return false;
			}	
		}
        return true;
    }
				
	public static int[] sortArr(int[] inputArr) {
		// temp is for swapping elements when needed.
		int temp;
		for(int i = 0; i < inputArr.length; i++){
			for(int j = 0; j < inputArr.length - 1 - i; j++){
				if(inputArr[j] > inputArr[j + 1]){
					temp = inputArr[j + 1];
					inputArr[j + 1] = inputArr[j];
					inputArr[j] = temp;
				}
			}
		}
		return inputArr; // supposed to work but there may be a problem
	}
}
