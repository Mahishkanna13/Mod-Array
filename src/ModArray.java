import java.util.Scanner;

public class ModArray {
    public static int ModConversion(int[] array,int divisor)
    {
        int result=0;
        int power=1;
        for(int i=array.length-1;i>=0;i--)
        {
            result=(result+array[i]*power)%divisor;
            power=(power*10)%divisor;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[] Array=new int[size];
        for(int i=0;i<size;i++)
        {
            Array[i]= scanner.nextInt();
        }
        int divisor= scanner.nextInt();
        System.out.println(ModConversion(Array,divisor));
    }
}
