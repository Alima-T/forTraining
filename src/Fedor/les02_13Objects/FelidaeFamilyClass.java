package Fedor.les02_13Objects;


public class FelidaeFamilyClass {
    static String familyName = "Felidae (Cats)";                // 8 байтов - отдельно в классе
    String subfamily = "Felinae: small and medium-sized cats";  // 8 байтов "Pantherinae: large cats"
    String lineage;                                             // 8 байтов  родословная
    String genus;                                               // 8 байтов  род
    byte speciesNumber;                                         // 1 байт  количество видов
                                                                //Всего 25 байта


    public static void main(String[] args) {

        final FelidaeFamilyClass cat1 = new FelidaeFamilyClass();
        cat1.subfamily = "Pantherinae: large cats";
        cat1.lineage = "Panthera";
        cat1.genus = "Neofelis";
        cat1.speciesNumber = 2;

        final FelidaeFamilyClass cat2 = new FelidaeFamilyClass();
        cat2.subfamily = "Pantherinae: large cats";
        cat2.lineage = "Panthera";
        cat2.genus = "Panthera";
        cat2.speciesNumber = 5;

        final FelidaeFamilyClass cat3 = new FelidaeFamilyClass();
        cat3.lineage = "Bay Cat";
        cat3.genus = "Catopuma";
        cat3.speciesNumber = 2;

        final FelidaeFamilyClass cat4 = new FelidaeFamilyClass();
        cat4.lineage = "Bay Cat";
        cat4.genus = "Pardofelis";
        cat4.speciesNumber = 1;

        final FelidaeFamilyClass cat5 = new FelidaeFamilyClass();
        cat5.lineage = "Caracal";
        cat5.genus = "Caracal";
        cat5.speciesNumber = 2;

        final FelidaeFamilyClass cat6 = new FelidaeFamilyClass();
        cat6.lineage = "Caracal";
        cat6.genus = "Leptailurus";
        cat6.speciesNumber = 1;

        final FelidaeFamilyClass cat7 = new FelidaeFamilyClass();
        cat7.lineage = "Ocelot";
        cat7.genus = "Leopardus";
        cat7.speciesNumber = 8;

        final FelidaeFamilyClass cat8 = new FelidaeFamilyClass();
        cat8.lineage = "Lynx";
        cat8.genus = "Lynx";
        cat8.speciesNumber = 4;

        final FelidaeFamilyClass cat9 = new FelidaeFamilyClass();
        cat9.lineage = "Puma";
        cat9.genus = "Acinonyx";
        cat9.speciesNumber = 1;

        final FelidaeFamilyClass cat10 = new FelidaeFamilyClass();
        cat10.lineage = "Puma";
        cat10.genus = "Herpailurus";
        cat10.speciesNumber = 1;

        final FelidaeFamilyClass cat11 = new FelidaeFamilyClass();
        cat11.lineage = "Puma";
        cat11.genus = "Puma";
        cat11.speciesNumber = 1;

        final FelidaeFamilyClass cat12 = new FelidaeFamilyClass();
        cat12.lineage = "Leopard Cat";
        cat12.genus = "Otocolobus";
        cat12.speciesNumber = 1;

        final FelidaeFamilyClass cat13 = new FelidaeFamilyClass();
        cat13.lineage = "Leopard Cat";
        cat13.genus = "Prionailurus";
        cat13.speciesNumber = 5;

        final FelidaeFamilyClass cat14 = new FelidaeFamilyClass();
        cat14.lineage = "Domestic Cat";
        cat14.genus = "Felis";
        cat14.speciesNumber = 7;

    }
    /* Структура - это объединение нескольких объектов, возможно различного типа под одним именем,
    которое является типом структуры, В качестве объектов могут выступать переменные,
    массивы, указатели и другие структуры.
    Структуры позволяют трактовать группу связанных между собой объектов, не как множество отдельных элементов, а как единое целое.

?? При объявлении структур, их разрешается вкладывать одну в другую.

Инициализация полей структуры
Инициализация полей структуры может осуществляться двумя способами:

присвоение значений элементам структуры в процессе объявления переменной, относящейся к типу структуры;
присвоение начальных значений элементам структуры с использованием функций ввода-вывода (например, printf() и scanf()).
*/

}
