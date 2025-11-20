public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to " + n + ":");
        boolean[] arr = new boolean[n+1];
        for (int i=2; i<=n; i++) {
            arr[i] = true;
        }
        for (int i=2; i*i<=n; i++) {
            if (arr[i] == true) {
                for (int j = i*i; j<=n; j+=i)
                    arr[j] = false;
            }}
        int count = 0;
        for (int i=2; i<=n; i++) {
            if (arr[i] == true) {
                System.out.println(i);
                count++;

            }
            
    }   System.out.println("There are " + count + " primes between " + 2 + " and " + n + " (" + (int)((double)((double)count/n)*100) + "% are primes)");

        }
    
}