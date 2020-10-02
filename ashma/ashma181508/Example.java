package ashma181508;

class Shape {
    private int xaxis;
    private int yaxis;
    private int length;
    private int width;

    public Shape(int x,int y,int l,int w){

        this.xaxis = x;
        this.yaxis = y;
        this.length = l;
        this.width = w;
    }
    public Shape(int l,int w){

        this(0,0,l,w);

    }
    public Shape(){

        this(0,0,1,1);
  
    }
    void display(){
        System.out.println("xaxis =" + xaxis);
        System.out.println("yaxis =" + yaxis);
        System.out.println("length =" + length);
        System.out.println("width =" + width);

    }
}
 class Example {
             
           public static void main(String[] arg){
           Shape S1 = new Shape (1,4,32,10);
           S1.display();
           }

 }
    
