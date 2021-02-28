package Fedor.les02_26Colsole.tests;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * программа получает название файла с реестром и порядковый номер товара (который с 1, а не с 0), после чего печатает его
 */
public class ProductSearchByNumberMethod {

    public void productSearchByNumber(Path registerPath, int index) throws IOException {
        final String PRODUCT_DELIMITER = "#";
        final String CHARSET = "cp1251";
        final Charset REGISTER_CHARSET = Charset.forName(CHARSET);

        Path pathOfRegister = Path.of(String.valueOf(registerPath));
        String register = Files.readString(pathOfRegister, REGISTER_CHARSET);
        String[] productArray = register.split(PRODUCT_DELIMITER);

        for (String element : productArray) {
        }
        System.out.println(productArray[index]);
    }

    public static void main(String[] args) throws IOException {
        ProductSearchByNumberMethod productByNumber = new ProductSearchByNumberMethod();
        productByNumber.productSearchByNumber(Path.of("C:\\Users\\Alina\\Desktop\\register.txt"), 2);
    }
}
