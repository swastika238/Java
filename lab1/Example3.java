class Instance {
    private int age=5;

    public void pupAge() {
       
        age = age + 7;
        System.out.println("Puppy age is: " + age);
    }
}
public class Example3{
    public static void main(String[] args) {
        Instance I1 = new Instance();
        I1.pupAge();
    }
}
