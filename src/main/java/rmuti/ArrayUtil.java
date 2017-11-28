package rmuti;

public class ArrayUtil {
private int[] data;

	public ArrayUtil(int[] arr) {
		data = arr;
	}

	public int sumArray() {
		int sum=0;
		
		for (int i = 0; i < data.length; i++) {

			sum = sum+data[i];
		}return sum;
	}

	public int countOne() {
		int x=0;
		for (int i = 0; i < data.length; i++) {
			int data2 = data[i];
			if (data2 == 1) {
				x++;
			}
		}return x;
	}

	public int[] findOne() {
		int n = countOne();
		int arr[] = new int[n];
		for(int i = 0; i<n;i++) {
			arr[i]=1;
		}
		return arr;
	}

	public int[] doubleArray() {
	 int boy = data.length *2;
    int newA[]=new int[boy];
    for(int i=0;i<data.length;i++) {
    	newA[i]=data[i];
    }
	return newA;
	}
	

}
