package comp1110.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * COMP1110 Final Exam, Question 1i
 */
public class Q1Even
{
    public static int[] even(int n)
    {
        List<Integer> foo = new ArrayList<>();
        for (int i = 1; i <= n; i++)
        {
            if (i % 2 == 0)
                foo.add(i);
        }
        return foo.stream().mapToInt(i->i).toArray();
        // FIXME Question 1i: complete this function
    }
}
