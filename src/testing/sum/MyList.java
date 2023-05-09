package sum;

import com.sun.jdi.InternalException;

import java.util.ArrayList;
import java.util.List;

public class MyList {



    public int sum(ArrayList<Integer> list) {
        if (list == null) {
            throw new InternalException("List is null!");
        }
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }
}
