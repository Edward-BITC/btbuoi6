public class ArrayBT {
    public int SumEvenNumberArrays(int[] array) {
        int sum = 0;
        for (int list : array) {
            if (list % 2 == 0) {
                sum += list;
        }
    }
    return sum;
    }
    public int maxInArray(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public int CountOccurrences(int[] array, int elementToFind) {
        int count = 0;
        for (int num : array) {
            if (num == elementToFind) {
                count++;
            }
        }
        return count;
    }
}
