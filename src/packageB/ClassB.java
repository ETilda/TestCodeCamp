package packageB;


public class ClassB {
    public static void main(String[] args) {

        //Create a method in Class B that can only be accessed within a class.

        ClassB privateVariable = new ClassB();
        privateVariable.packageBMethod();

        }
        private void packageBMethod(){
            System.out.println("This method is private and can only be accessed within this class");


        }
        }





