import java.util.Arrays;
class employee{
public int employeeId;
public String employeeName;
public employee() {
//System.out.println("0-arg constructor");
}
public employee(int employeeId, String employeeName) {
super();
this.employeeId = employeeId;
this.employeeName = employeeName;
System.out.println("2-arg constructor");
}
public void m1() {}
public void m2() {}
public void m3() {}
}
public class GetClassMethodDemo {
public static void main(String[] args) {
employee p1 = new employee();
Class c = p1.getClass();
System.out.println(c);
System.out.println(c.getName());
System.out.println(Arrays.toString(c.getConstructors()));
System.out.println(Arrays.toString(c.getMethods()));
System.out.println(Arrays.toString(c.getFields()));
}
}