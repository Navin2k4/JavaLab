package Program3.package2;
import Program3.package1.ParentClass;

public class ChildClass extends ParentClass {
    public void accessProperties() {
        System.out.println(protectedProperty);
        // System.out.println(defaultProperty); // This will cause a compile error
    }
}
