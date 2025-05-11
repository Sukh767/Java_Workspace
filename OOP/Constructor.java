class Display{
    int a=9;
    int b= 0;
    Display(){

    }

    void show(){
        System.out.println("value of a is : " + a);
    }
}

class Constructor{
    public static void main(String[] args){
        Display d = new Display();

        d.show();
    }
}