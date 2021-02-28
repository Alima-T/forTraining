package Fedor.les02_26Colsole.tests;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * программа получает название файла с реестром и часть текста (например, номер артикула), после чего выводит на экран все продукты, содержащие данный контекст
 */
public class ProductSearchByContentMethod {

    public void ProductSearchByContent(Path registerPath, String partOfText) throws IOException {
        final String PRODUCT_DELIMITER = "#";
        final String CHARSET = "cp1251";
        final Charset registerCharset = Charset.forName(CHARSET);

        Path pathOfRegister = Path.of(String.valueOf(registerPath));
        String register = Files.readString(pathOfRegister, registerCharset);
        String[] productArray = register.split(PRODUCT_DELIMITER);
        for (int i = 0; i < productArray.length; i = i + 1) {
            String product = productArray[i];
            boolean productMatched = product.contains(partOfText);
            if (productMatched) {
                System.out.println(product);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        ProductSearchByContentMethod product = new ProductSearchByContentMethod();
        product.ProductSearchByContent(Path.of("C:\\Users\\Alina\\Desktop\\register.txt"), "10020005");
    }
}



