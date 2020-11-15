import java.util.*;

public class ArraySample 
{
    public static void main (String[] args) throws Exception
    {
        int arrayA[];
        int arrayB[];
        int arrayC[];
        int sizeA;
        int sizeB;
        int sizeC;
        int index;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many numbers to input: ");
        sizeA = sc.nextInt();
        arrayA = new int[sizeA];

        System.out.print("How many numbers to input: ");
        sizeB = sc.nextInt();
        arrayB = new int[sizeB];

        arrayC = new int[sizeA + sizeB];

        for(int x = 0; x < arrayA.length; x++)
            arrayA[x] = sc.nextInt();
        for(int x = 0; x < arrayB.length; x++)
            arrayB[x] = sc.nextInt();

        sc.close();

        for(index = 0; index < arrayA.length; index++)
            arrayC[index] = arrayA[index];

        for(index = 0; index < arrayC.length; index++) 
            arrayC[index] = arrayB[index];

        sizeC = sizeA + sizeB;
        for(index = 0; index < sizeC; index++)
            System.out.println(arrayC[index] + " ");
    }
}
