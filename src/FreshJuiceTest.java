import com.sun.javafx.image.BytePixelSetter;
import com.sun.org.apache.xpath.internal.SourceTreeManager;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class FreshJuiceTest {

    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.SMALL;

        System.out.println(juice.size);

        ArrayList list = new ArrayList();

        System.out.println("helloworld!");
        int num = 10;
        System.out.println("num = " + num);
        System.out.println(num);




    }
}


class FreshJuice {

    enum FreshJuiceSize {SMALL, MEDIUM, LARGE}

    FreshJuiceSize size;

}

