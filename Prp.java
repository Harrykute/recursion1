public class Prp {
    
    public static int fun(int x, int y){

        if(x==0){
            return y;
        }

        return fun(x-1,x+y);
    }

        public static void main(String[] args) {
            
         int x=4;
         int y=3;
         System.out.println(fun(x, y));
           

        }




    }




