public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {9, 1, 4, 2, 8};
        int n = array.length;

        for (int i = 0; i < n-1; i++) {
             boolean sorted = true;
            for (int j = 0; j < n-1-i; j++) {
                if(array[j+1]<array[j]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;

                    sorted = false; 
                }
            }
            if(sorted) break;
        }

        for(int item: array){
            System.out.print(item+ "  ");
        }

    }

}
