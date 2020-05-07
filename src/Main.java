public class Main {
    public static void main(String[] args) {
        BmiService person=new BmiService();
        double index=person.calculate(65,1.68);
        System.out.println("Ваш индекс массы тела: "+index);

    }
}
