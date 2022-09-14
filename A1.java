public class A1 {
    public static void main(String[] args){
        String[] Strin = {"Alpha", "Bravo", "Charlie", "Delta", "Echo"};
        
        for (int count = 0; count < Strin.length; count++) {
            System.out.println(Strin[count]); 
        
        }
        for (int count = 0; count < Strin.length; count++) {
            System.out.print(Strin[count] + " ");
        
        }
        
        int c = 0;
        while (c < Strin.length) {
            
            System.out.print(Strin[c] + " - ");
            c++;
        }
    }
}