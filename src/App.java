public class App {
    public static void main(String[] args) {
        System.out.println("The 45 sequence of fibonancci:");
        int fibo0=0, fibo1=1; 
        for(int i=0; i<43; i++){
            System.out.print(fibo0 + ", " );
            int fibo2=fibo0+fibo1;
            fibo0=fibo1;
            fibo1=fibo2;
        }
        
        System.out.print(fibo0);
    }
}

