package ashma181508;

class Student{
    private String name;
    private int roll;
    private static String collage = "ncit";
    private static int count = 0;

    public void setName(String name, int roll) {
        this.name = name;
        this.roll = roll;
        Student.count++;
    }
      
    public static void total(){
        System.out.println("total student: " + count);
    }
    public void getName() {
        System.out.println("name of student: " + name);
        System.out.println("Roll : " + roll);
        System.out.println("Collage: " + collage);
        
    }


}
class Ask{
    public static void main(String[] args){

            Student obj = new Student();
            obj.setName("Ashma", 181508);
            obj.getName();

            Student obj1 = new Student();
            obj1.setName("akshita", 181550);
            obj1.getName();
        
            Student.total();
    }
}