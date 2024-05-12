public class Arreglo {
    public static void main(String[] args) {
        int A[] = {3,5,6,8,4,7,8,5,3,1};
        int B[] = {3,4,6,8,9,1,2,3,0,9};

        System.out.println("El resultado de A[3] mod (B[2]/2) es: " + A[3] % (B[2]/2));
        System.out.println("El resultado de B[A[1]] - A[9] es: "+ (B[A[1]] - A[9]) );
        System.out.println("El resultado de A[0] + A[1+2] es: "+ (A[0] + A[1+2]));
        System.out.println("El resultado de A[5] + B[5] es: "+ (A[5] + B[5])); 
        System.out.println("El resultado de (A[3]/B[2])/2 es: "+ (A[3]/(B[2])/2));

    }
    
}
