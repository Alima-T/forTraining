package Fedor.les02_13Objects;

public class Cat {
    CatGenus genus;
    String name;
    int gender;
    int weight;
    int age;
}

class CatGenus {
    CatSubfamily subFamily;
    String name;
}

class CatSubfamily {
    String name;
    String size;
}

class CatTest {
    String name;

    public void someMethod(String str, int i) { // если не static мы можем использовать this. Если static, то this вызвать невозможно
        this.name = str; //сначала cat1, потом cat2 и cat3
    }
// this - текущий экземпляр - это экземпляр, на котором вызывается метод,

    public static void changeSomeInnerData(CatTest cat){
        cat.name  = "nameFromStaticMethod";
    }


    public static void main(String[] args) {
        final CatTest cat1 = new CatTest();
        final CatTest cat2 = new CatTest();
        final CatTest cat3 = new CatTest();
        final String cat3Name = "3";
        cat1.someMethod("1",1);
        cat2.someMethod("2",2);
        cat3.someMethod(cat3Name,3);

        cat1.name = "1";
        cat2.name = "2";
        cat3.name = "3";

        changeSomeInnerData(cat1);

        System.out.println(cat1.name);

//
//        final CatSubfamily pantheraSubFamily = new CatSubfamily();
//        pantheraSubFamily.name = "Линия пантеры";
//        pantheraSubFamily.size = "Крупные";
//
//        final CatGenus panthera = new CatGenus();
//        panthera.name = "пантеры";
//        panthera.subFamily = pantheraSubFamily;
//
//        final CatGenus neofelis = new CatGenus();
//        neofelis.name = "дымчатые леопарды";
//        neofelis.subFamily = pantheraSubFamily;
//
//        final Cat cat1 = new Cat();
//        cat1.genus = panthera;
//        cat1.name = "Leo1";
//        cat1.age = 12;
//        cat1.weight = 120;
//        cat1.gender = 1;
//
//        final Cat cat2 = new Cat();
//        cat2.genus = panthera;
//        cat2.name = "Leo2";
//        cat2.age = 12;
//        cat2.weight = 120;
//        cat2.gender = 1;
//
//        final Cat cat3 = new Cat();
//        cat3.genus = neofelis;
//        cat3.name = "Pard1";
//        cat3.age = 12;
//        cat3.weight = 120;
//        cat3.gender = 1;
//
//        new Cat();
    }
}