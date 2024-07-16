public class App {
    public static void main(String[] args) throws Exception {
        ArrayBT arrayBT = new ArrayBT();
        int[] array = {5, 1, 6, 7, 8, 3, 10, 15, 21};
        // int sum = arrayBT.SumEvenNumberArrays(array);
        // System.out.println("Tong cac so chan la : " + sum);
        
        int max = arrayBT.maxInArray(array);
        System.out.println("So lon nhat la : " + max);

        int count1 = arrayBT.CountOccurrences(array, 5);
        System.out.println("Phan tu 5 xuat hien " + count1 + " lan trong mang");

        int count2 = arrayBT.CountOccurrences(array, 6);
        System.out.println("Phan tu 6 xuat hien " + count2 + " lan trong mang");
    }
    
}
