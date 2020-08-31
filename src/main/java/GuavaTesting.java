import com.google.common.base.Splitter;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GuavaTesting {
    public static void main(String[] args) {
        double num = Math.PI;
        double butInt = 7;

        System.out.println(num);

        System.out.println(DoubleMath.isMathematicalInteger(num));
        System.out.println(DoubleMath.isMathematicalInteger(butInt));

        int largeNum = Integer.MAX_VALUE;
        System.out.println(largeNum + 1);
        try {} catch(ArithmeticException e) {
            System.err.println("That number is too big, genius.");
        }

        String nameTag = "Hello,, ,My, Name,,, is,,, Joe!";
//        String[] cutUpTag = nameTag.split(",");
//        ArrayList<String> cutUpTag = new ArrayList<>();
        Iterable<String> list =  Splitter.on(",").trimResults().omitEmptyStrings().split(nameTag);

        System.out.println(list);

        for (String name : list) {
            System.out.println(name);
        }
    }
}
