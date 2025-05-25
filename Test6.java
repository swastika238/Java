class Test6{
public static void main(String[] args) {
    int numbers[]={1,2,3,4,5};
    for(int num:numbers)
 {
    if(num==2)
    {
        System.out.println("hi");
        continue;
    }
    System.out.println(num);
 }   
 System.out.println("Bye");
}
}