public class Main {
    public static void main(String[] args) {
        Contas conta = new Contas();

        int sums = conta.sum(1, 2);
        int subtracts = conta.subtract(4, 3);
        int multiplys = conta.multiply(2, 3);
        int divides = conta.divide(6, 3);

        System.out.println(sums);//should print 3
        System.out.println(subtracts);//should print 1
        System.out.println(multiplys); //should print 6
        System.out.println(divides); //should print 2


    }
}
