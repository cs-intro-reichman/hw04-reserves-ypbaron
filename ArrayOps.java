public class ArrayOps {
    public static void main(String[] args) {
   
    }
    
    public static int findMissingInt (int [] array) {
		int[] sortedArr = sortArr(array);
		for(int i = 0 ; i < array.length ; i++){
			if(sortedArr[i] != i){
				return i;
			}
		}
        return -1;
    }


    public static int secondMaxValue(int [] array) {
		int[] sortedArr = sortArr(array);
		return sortedArr[sortedArr.length - 2];
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        int[] sortArray1 = sortArr(array1);
		int[] sortArray2 = sortArr(array2); ///need to continue from here... maybe create a new array where you delete duplicates
		
		for (int i = 0; i <= length.sortArray1; i++) {
			
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
				
	public static int[] sortArr(int[] inputArr){
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
