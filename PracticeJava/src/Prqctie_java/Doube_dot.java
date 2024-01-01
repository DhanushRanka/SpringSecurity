package Prqctie_java;
import java.util.function.Function;

interface in
{
	public String app();
}

class MyClass {
    private String text;

    public MyClass(String text) {
        this.text = text;
    }

    public String processText() {
        return "Processed " + this.text;
    }
}
public class Doube_dot {
	
	public static void main(String[] args) {
        MyClass myClass = new MyClass("example text");
        in function = myClass::processText;
        String result = function.app();
        System.out.println(result);
    }
}
