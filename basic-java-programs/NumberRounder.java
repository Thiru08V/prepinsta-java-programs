//Round Off Number in Java

import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class NumberRounder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal Number:");
        double Num = sc.nextDouble();

        System.out.println(Math.round(Num));
        System.out.println(Math.floor(Num));
        System.out.println(Math.ceil(Num));

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        df.setRoundingMode(RoundingMode.FLOOR);
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println(df.format(Num));
        System.out.println(df.format(Num));
        System.out.println(df.format(Num));

        sc.close();
    }
}

/*
Basic Rounding with Math Class
A. Math.round(Num)
Rounds to the nearest integer using "half-up" rule.

Backend Calculation:

Math.round(3.14159) → (long)(3.14159 + 0.5) → 3
Math.round(3.6) → (long)(3.6 + 0.5) → 4
Output: 3

B. Math.floor(Num)
Rounds down to the nearest integer.

Backend Calculation:

Math.floor(3.14159) → 3.0
Math.floor(-2.7) → -3.0
Output: 3.0

C. Math.ceil(Num)
Rounds up to the nearest integer.

Backend Calculation:

Math.ceil(3.14159) → 4.0
Math.ceil(-2.7) → -2.0
Output: 4.0

Advanced Rounding with DecimalFormat

Key Components:
Pattern #.##:

Rounds to 2 decimal places.

# = optional digit, . = decimal point.

Rounding Modes:

CEILING: Always rounds up.

FLOOR: Always rounds down.

HALF_UP: Standard rounding (default).

CEILING − Rounding mode to round towards positive infinity.
FLOOR − Rounding mode to round towards negative infinity.
HALF_DOWN − Rounding mode to round towards "nearest neighbor" unless both neighbors are equidistant, in which case round down.
*/