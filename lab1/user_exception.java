

    class SwastikaException extends Error{
        public SwastikaException(String str)
        {
            super(str);
        }
            
        }
    public class user_exception{
        public static void main(String[] args) {
            
            int i=20;
            int j=0;
            try {
                j=18/i;
                if(j==0)
                throw new SwastikaException("I dont want to print zero");
                
            } catch (SwastikaException e) 
            {
                j=0;
                System.out.println("thats the default value" +e);
            }
            System.out.println(j);
            System.out.println("Bye");
        }
    }



