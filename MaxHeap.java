
public class MaxHeap {
	private int array[];
	private int heapSize;
	
	public MaxHeap(int[] array) {
		this.array = array;
		this.heapSize = array.length;
		buildMaxHeap();
	}
	
	private int leftChildOf(int i) {
		if( heapSize < i) {
			return -1;
		}else {
			return 2 * i + 1;
		}
	}
	
	private int rightChildOf(int i) {
		if(heapSize < i) {
			return -1;
		}else {
			return 2 * i + 2;
		}
	}
	
	public void printMaxHeap() {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		System.out.println();
	}
	
	private void maxHeapify(int i) {
		
		int left = leftChildOf(i);
		int right = rightChildOf(i);
		int large = i;
		if(left < heapSize &&  array[large] < array[left]) {
			large = left;
		}
		if(right < heapSize && array[large] < array[right]){
			large = right;
		}
		if(large != i){
			int temp = array[i];
			array[i] = array[large];
			array[large] = temp;
			maxHeapify(large);
		}
	}
	
	private void buildMaxHeap() {
		for(int i = (heapSize/2) - 1; i >= 0; i--) {
			maxHeapify(i);
		}
	}
	
	public void heapSort() {
		buildMaxHeap();
		int backUp = heapSize;
		for(int i = heapSize; i < 2; i--) {
			int temp = array[1];
			array[1] = array[i];
			array[i] = temp;
			heapSize--;
			maxHeapify(1);
		}
		heapSize = backUp;
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 20, 25, 6, 12, 15, 4, 16};
		int[] arr1 = {30, 29, 43, 64, 46, 32, 75, 34};
		int[] arr2 = {20, 15, 10, 11, 12};
		MaxHeap m1 = new MaxHeap(arr2);
		m1.printMaxHeap();
		m1.heapSort();
		m1.printMaxHeap();
	}
}
