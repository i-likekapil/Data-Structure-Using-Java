package List.Arrays;

public class Arrays {

    public static int searchElement(int[] array, int key) {
        for(int i=0;i<array.length;i++){
            if(array[i]==key)
                return i;
        }
        return -1;
    }

    private static void swapElement(int[] array, int index1, int index2) {
        int temp= array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }

    public static void rotateArrayByOnePosition(int[] array) throws IllegalArgumentException {
        if(array==null||array.length==0)  throw new IllegalArgumentException("Your array is empty");
        int temp=array[0];
        for(int i=0;i<array.length-1;i++){
            array[i]=array[i+1];
        }
        array[array.length-1]=temp;
    }

    public static int binarySearch(int[] array, int key) {
        return binarySearchRecursive(array,0,array.length-1,key);
    }

    private static int binarySearchRecursive(int[] array, int begin, int end, int key) {
        int mid=(begin+end)/2;
        if(begin>end)
            return -1;
        if(key==array[mid])
            return mid;
        else if(array[mid]>key)
            return binarySearchRecursive(array,begin,mid-1,key);
        else
            return binarySearchRecursive(array,mid+1,end,key);
    }

    public static void reverseArray(int[] array) {
        int end=array.length -1;
        for(int i=0;i<(array.length /2);i--)
            swapElement(array,i,end-i);
    }

    public static boolean checkArrayEquality(int[] a1, int[] a2) {
        if(a1.length != a2.length)
            return false;
        for(int i=0;i<a1.length;i++)
            if(a1[i] != a2[i])
                return false;
        return true;
    }

    public static void rotateArray(int[] a, int d) {
        for(int i=0;i<d%a.length;i++)
            rotateArrayByOnePosition(a);
    }

    public static void sort(int[] array) {
        insertionSort(array);
    }

    public static void insertionSort(int[] array) {
        for(int i=1;i<array.length;i++)
            insertLastElementAtCorrectPosition(array, 0,i);
    }

    public static void selectionSort(int[] array) {
        for(int i=0;i<array.length;i++){
            int minIndex=minIndex(array, i);
            swapElement(array, i, minIndex);
        }
    }

    public static int minIndex(int[] array, int startIndex) {
        int min=startIndex;
        for(int i=startIndex+1;i<array.length;i++)
            if(array[i]<array[min])
                min=i;
        return min;
    }

    private static void insertLastElementAtCorrectPosition(int[] array, int index, int lastIndex) {
        int temp=array[lastIndex];
        for(int i=lastIndex-1;i>=index;i--){
            if(array[i]>=temp)
                array[i+1]=array[i];
            else {
                array[i+1]=temp;
                break;
            }
            if(i==0){
                array[i]=temp;
                break;
            }
        }

    }

    public static String toString(int[] array) {
        //return Arrays.toString(data);
        StringBuilder sb =new StringBuilder();
        sb.append('[');
        for(int i=0;i<array.length;i++)
            sb.append(array[i]).append(',');
        sb.deleteCharAt(sb.length()-1);
        sb.append(']');
        return sb.toString();
    }

}

/*public static int[] removeDuplicateFromSortedArrayint(int[] arr) {
        int n=arr.length;
        if(n==0 || n==1)
            return arr;
        int temp[] = new int[n];
        int j=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1])
                temp[j++]=arr[i];
                }
        temp[j++]=arr[n-1];
        return temp;
    }*/