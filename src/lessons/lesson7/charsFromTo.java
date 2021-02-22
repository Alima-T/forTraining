package lessons.lesson7;

public class charsFromTo {
    public static void main(String[] args) {
        char[] charsFrom= {'q','w','e','f'};
        char[] charsTo= {'Q','W','E','F'};
        String text = "I am a programmer, qwerty";
        char[] charsText = text.toCharArray();
        for (int i=0; i<charsText.length;i++){
            for (int j=0; j<charsFrom.length; j++){
                if (charsText[i]==charsFrom[j]){
                    charsText[i]=charsTo[j];
                }
            }  System.out.print(charsText[i]);
        }
    }
}
