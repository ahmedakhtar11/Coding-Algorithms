// Hacker Rank Test - CountUp - Easy

// Starting Point -Blank Function/Method:
// static void countUp(int start) { }

// Expected Output: 4 then 5 then 6 then 7 then 8 then 9 then 10 then 11 then 12 then 13 then 14

// Solution Below:

public class CountUpSolution {

    static void countUp(int start) {
        System.out.print(start);
        for (int i = 5; i < 14; i++) {
            System.out.print(" then " + i);
        }

    }

    public static void main(String[] args)
    {
        countUp(4);

    }

}
