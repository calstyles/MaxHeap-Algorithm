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
		for(int i = 0; i < heapSize; ++i) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println();
	}
	
	private void maxHeapify(int i) {
		
		int left = leftChildOf(i);
		int right = rightChildOf(i);
		int large = i;
		if(left < heapSize &&  array[large] < array[left]) {
			large = left;
		}else {
			large = i;
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
		for(int i = heapSize - 1; i > 0; i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			heapSize--;
			maxHeapify(0);
		}
		heapSize = backUp;
	}
}