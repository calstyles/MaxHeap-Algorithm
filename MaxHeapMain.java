
public class MaxHeapMain {

	public static void main(String[] args) {
		System.out.println("========================");
		System.out.println("Heap 1");
		System.out.println("========================");
		int[] arr1 = {10, 20, 25, 6, 12, 15, 4, 16};
		MaxHeap m1 = new MaxHeap(arr1);
		System.out.println();
		System.out.println("Before Sort");
		m1.printMaxHeap();
		m1.heapSort();
		System.out.println("After Sort");
		m1.printMaxHeap();
		
		System.out.println("========================");
		System.out.println("Heap 2");
		System.out.println("========================");
		int[] arr2 = {30, 29, 43, 64, 46, 32, 75, 34};
		MaxHeap m2 = new MaxHeap(arr2);
		System.out.println();
		System.out.println("Before Sort");
		m2.printMaxHeap();
		m2.heapSort();
		System.out.println("After Sort");
		m2.printMaxHeap();
		
		System.out.println("=========");
		System.out.println("Heap 3");
		System.out.println("=========");
		int[] arr3 = {20, 15, 10, 11, 12};
		MaxHeap m3 = new MaxHeap(arr3);
		System.out.println();
		System.out.println("Before Sort");
		m3.printMaxHeap();
		m3.heapSort();
		System.out.println("After Sort");
		m3.printMaxHeap();
		
		System.out.println("=========");
		System.out.println("Heap 4");
		System.out.println("=========");
		int[] arr4 = {16, 10, 23, 51, 74, 75, 0};
		MaxHeap m4 = new MaxHeap(arr4);
		System.out.println();
		System.out.println("Before Sort");
		m4.printMaxHeap();
		m4.heapSort();
		System.out.println("After Sort");
		m4.printMaxHeap();
		
		System.out.println("=========");
		System.out.println("Heap 5");
		System.out.println("=========");
		int[] arr5 = {9, 3, 5, 6, 8};
		MaxHeap m5 = new MaxHeap(arr5);
		System.out.println();
		System.out.println("Before Sort");
		m5.printMaxHeap();
		m5.heapSort();
		System.out.println("After Sort");
		m5.printMaxHeap();
		
	}

}
