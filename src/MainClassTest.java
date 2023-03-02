import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    MainClass Main = new MainClass();
    @Test
    public void testGetClassString(){
        String a = Main.getClassString();

        System.out.println(a);
        if (a.contains("Hello"))
        {
            System.out.println("word is found");
        } else if (a.contains("hello")){
            System.out.println("word is found");
        } else
        {
            Assert.fail("word is not found");
        }
    }
}