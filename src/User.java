
    public class User  implements Comparable <User>{//добавляем возможность сравнивать объекты User

        private String name;
        private Integer age;
        private String email;

        public User(String name, int age, String email) {
            this.name = name;
            this.age = age;
            this.email = email;
        }

        @Override
//реализуем метод compareTo интерфейса Comparable
        public int compareTo(User o) {

//используем метод compareTo из класса String для сравнения имен
            int result = this.name.compareTo(o.name);

//если имена одинаковые -  сравниваем возраст,
//            используя метод compareTo из класса Integer

            if (result == 0) {
                result = this.age.compareTo(o.age);
            }
            return result;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", email='" + email + '\'' +
                    '}';
        }
}
