package lessonsHomeWorks.lesson15;

public class Main {
    public static void main(String[] args) {
        StringUtilsImpl utils = new StringUtilsImpl();
        //double result = utils.div("2",null); // double result = utils.div("2","0") все рантаймексепшн, никто не перехватил т.к. мы не поставили перехватчика
        //System.out.println(result);
        try {
            double result = utils.div("2", null);
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        }
    }
}
// доделать StringUtils подсказка pattern