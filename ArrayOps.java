public class ArrayOps {
    public static void main(String[] args) {
		boolean result = containsTheSameElements(new int[] {2,2,3,7,8,3,2}, new int[] {8,2,7,7,3});
		System.out.println(result);
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
		for (int i = 0; i < array1.length; i++) {
			boolean containElement = false;
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					containElement = true;
				}
			}
			if (containElement == false) {
				return false;
			}
		}

		for (int i = 0; i < array2.length; i++) {
			boolean containElement = false;
			for (int j = 0; j < array1.length; j++) {
				if (array2[i] == array1[j]) {
					containElement = true;
				}
			}
			if (containElement == false) {
				return false;
			}
		}
		return true;
	}

	public static boolean isIncluded(int [] array, int element) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				return true;
			}
		}
		return false;
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
