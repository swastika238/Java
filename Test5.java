class Test5{
public static void main(String[] args) {
    int numbers[]={1,2,3,4,5};
    for(int num:numbers)
 {
    if(num==2)
    {
        System.out.println("hi");
        break;
    }
    System.out.println(num);
 }   
 System.out.println("Bye");
}
}