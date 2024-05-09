class myException extends Exception{
    myException(String msg){
        super(msg);
    }
}
class exception{
    public static void main(String args[]){
        float a = 10, b = 0;
        try{
            if(b==0){
                throw new myException(" Division by zero ");
            }
            else{
                float c = a/b;
                System.out.println("Division =  "+ c);
            }
        }
        catch(myException e){
            System.out.println("Arithmetic Exception" + e.getMessage());
        }
            finally{
                System.out.println("This is finally block. ");
            }
    }

}
