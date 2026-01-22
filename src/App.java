public class App {
    public static void main(String[] args) {
        int b=0, a=1; 
        for(int i=0; i<45; i++){
            System.out.println(b + ' ');
            int c=b+a;
            b=a;
            a=c;
        }
        
        System.out.println("Hello, World!");
    }
}

