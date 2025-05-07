class Local {
    public void pupAge() {
        int age = 5;
        age = age + 7;
        System.out.println("Puppy age is: " + age);
    }
}
public class Example2{
    public static void main(String[] args) {
        Local mil = new Local();
        mil.pupAge();
    }
}

