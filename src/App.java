public class App {
    public static void main(String[] args) {
        System.out.println("The 45 sequence of fibonancci:");
        int b=0, a=1; 
        for(int i=0; i<44; i++){
            System.out.print(b + ", " );
            int c=b+a;
            b=a;
            a=c;
        }
        
        
    }
}

