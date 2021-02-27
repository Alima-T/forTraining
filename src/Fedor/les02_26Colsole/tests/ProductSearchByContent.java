package Fedor.les02_26Colsole.tests;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * программа получает название файла с реестром и порядковый номер товара (который с 1, а не с 0), после чего печатает его
 */
public class ProductSearchByContent {

    public static final String PRODUCT_DELIMITER = "#"; //
    public static final String ORDER_ID_NUMBER_TO_FILTER = "10020005";
    public static final String CHARSET = "cp1251";
    public static final String REGISTER_PATH_NAME = "C:\\Users\\Alina\\Desktop\\register.txt";

    public static void main(String[] args) throws IOException {

        Path pathOfRegister = Path.of(REGISTER_PATH_NAME);
        Charset registerCharset = Charset.forName(CHARSET);
        String register = Files.readString(pathOfRegister, registerCharset);
        String[] productArray = register.split(PRODUCT_DELIMITER);

        for (int i = 0; i < productArray.length; i = i + 1) {
            String product = productArray[i];
            boolean productMatched = product.contains(ORDER_ID_NUMBER_TO_FILTER);
            if (productMatched) { // вывод на консоль элемента, который содержит "частьЭлемента"
                System.out.println(product);
            }
        }
    }
}
