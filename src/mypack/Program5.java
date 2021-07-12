package mypack;

public class Program5 {
	
	static int countDivisibles(int A, int B, int M)
    {
        
        int counter = 0;
        for (int i = A; i <= B; i++)
                if (i % M == 0)
                counter++;
                return counter;
        
    }
	public static void main(String[] args) 
	{
		 int A = 30, B = 100, M = 30;
        System.out.println(countDivisibles(A, B, M));
	}

}
