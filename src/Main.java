


public class Main {
    public static void main(String[] args) {
        char[] testeChar = {'a', 'b', 'g', 't', 'r'};
        int[] numstest = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 8};
        RemoveDuplicates rm = new RemoveDuplicates();
        System.out.println(rm.removeDuplicates(numstest));
        PrintArray.printArrayInt(numstest);
        PrintArray.printArrayChar(testeChar);
    }
}
