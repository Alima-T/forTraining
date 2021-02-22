package lessons.lesson2;

public class Operators {
    public static void main(String[] args) {

        // % Returns the division remainder (5/2 = 2 and 1- remainder)
        int x = 5;
        int y = 2;
        System.out.println(x % y);

        x = 5;
        x |= 2;                     // %=  x %= same x = x % 3
        System.out.println(x);

        x = 5;
        ++x;                        // ++   Increment   Increases the value of a variable by 1
        System.out.println(x);

        --x;                        // --   Decrement 	Decreases the value of a variable by 1
        System.out.println(x);

        x += 5;                     // +=	x += 5 same	x = x + 5
        System.out.println(x);
        x -= 5;                     // +=	x -= 5 same	x = x - 5
        x *= 5;                     // *=	x *= 5 same	x = x * 5
        x /= 5;                     // /=	x /= 5 same	x = x / 5


    }
}
