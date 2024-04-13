package org.example.class20;

public interface Washable {
    void wash();

}
class Dog implements Washable {
    @Override
    public  void  wash(){
        System.out.println("You can wash a dog");
    }
}
class Sofa implements Washable{
    @Override
    public void wash() {
        System.out.println("You can wash sofa as well");
        }
    }
    class WashTester{
        public static void main(String[] args) {
            Dog d=new Dog();
            d.wash();
            Sofa s=new Sofa();
            s.wash();
            Washable[] washables={new Dog(),new Sofa()};
            for (Washable w:washables){
                w.wash();
            }
        }
    }
