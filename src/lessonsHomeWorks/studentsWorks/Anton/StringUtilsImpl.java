package lessonsHomeWorks.studentsWorks.Anton;

import lessons.lesson15Exceptions.CustomException;
import lessons.lesson15Exceptions.StringUtils;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class StringUtilsImpl implements StringUtils {

        @Override
        public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
            if (number1 == null || number2 == null) {
                throw new NullPointerException("number1 or number2 is empty");
            }
            double num1 = 0;
            double num2 = 0;

            try {
                num1 = Double.parseDouble(number1);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("number1 in not a number");
            }
            try {
                num2 = Double.parseDouble(number2);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("number2 in not a number");
            }
            if (num2 == 0) {
                throw new ArithmeticException("number2 is 0");
            }
            return num1 / num2;
        }

        @Override
        public int[] findWord(String text, String word) throws NullPointerException {


            String[] words = text.replaceAll("[^а-яА-Я ]", "").split(" ");
            ArrayList<Integer> indexes = new ArrayList<>();
            for (int i = 0; i < words.length; i++){
                if (words[i].equals(word)){
                    indexes.add(i);
                }
            }
            if (indexes.isEmpty()){
                throw new NullPointerException("Insufficient input parameters");
            }
            int[] index = new int[indexes.size()];
            for(int i = 0; i < index.length; i++) {
                index[i] = indexes.get(i);
            }

            return  index;

        }

        @Override
        public double[] findNumbers(String text) throws CustomException {
            String regex = "[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(text);
            ArrayList<Double> doubles = new ArrayList<>();
            while (m.find()){
                doubles.add(Double.parseDouble(m.group()));
            }
            double[] result = new double[doubles.size()];
            for(int i = 0; i < result.length; i++){
                result[i] = doubles.get(i);
            }
            return result;
        }


        public static void main(String[] args) {

        StringUtilsImpl utils = new StringUtilsImpl();
        try {
            double result = utils.div("4", "2");
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        }


        try {
            double[] numbers = utils.findNumbers("scscscscsc");
            for (double num : numbers) {
                System.out.print(num + "  ");
            }

        } catch (CustomException e) {
            System.out.println("  ");
        }
        System.out.println();


        String text = "Интересно, должно ли понимание, что Unicode быть «практикой по умолчанию» что ";
        String word = "что";
        try {
            int[] index = utils.findWord(text, word);
            for (int i : index) {
                System.out.print(i + "  ");
            }
        } catch (NullPointerException e) {
            System.out.println("Not found");
        }


//     try {
//            double[] numbers = utils.findNumbers("scscscscsc8c68689698s6cscs.scscscsc896966.998cssc44.444dscscrwrwrw5w5.555");
//            for (double num : numbers) {
//                System.out.print(num + "  ");
//            }
//
//        } catch (CustomException e) {
//            System.out.println("  ");
//        }
//        System.out.println();
//
//
//        String text1 = "Интересно, должно ли понимание Unicode быть «практикой по умолчанию» " +
//                "для большинства начинающих программистов? Я имею в виду, что американским / " +
//                "индонезийским программистам никогда не приходилось иметь дело со странными персонажами " +
//                "в их «реальной» жизни. Так что их код, вероятно, отражает это, поэтому, хотя они используют " +
//                "UTF8, есть непреднамеренное предположение, что буквы - это AZ. Турецкий или арабский программист" +
//                "OTOH в первую очередь распознает этот сценарий и будет искать решение Unicode. Что вы думаете? " +
//                "(Это всего лишь побочное обсуждение)";
//        String word1 = "я";
//        try {
//            int[] index = utils.findWord(text1, word1);
//            for (int i : index) {
//                System.out.print(i + "  ");
//            }
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        }

    }
}
