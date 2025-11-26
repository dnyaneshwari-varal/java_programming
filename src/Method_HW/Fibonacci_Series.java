package Method_HW;

public class Fibonacci_Series {

	
		public void fib(int n) {
			
			int first=0;
			int second=1;
			System.out.print(first +" "+second +" " );
			
			for(int i=3;i<=n;i++) {
				int next=first+second;
				System.out.print(next +" ");
				first=second;
				second=next;
				
			}
			
			
		}
		public static void main(String[] args) {
			
			Fibonacci_Series obj=new Fibonacci_Series();
			obj.fib(10);
		}
	

}
