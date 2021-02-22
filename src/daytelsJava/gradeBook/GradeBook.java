package daytelsJava.gradeBook;

public class GradeBook {

    public void displayMessage(){

        System.out.println("\n Welcome to the Grade Book!");

        String path = System.getenv("Path");
    }
}


//int maxCarbon = 1000;
//long  sysTime = now();
//long beepStartedTime = 0;
//long beepEndTime = 0;
//
//void init(){

//}
//
//void loop(){
//    int carbon = readCarbon();
//    writeToDisaply(carbon);
//    sleep(1000);
//
//    if(carbon > maxCarbon) {
//        long timeFromEnd = now() - beepEndTime;
//        boolean notStartedYet = beepStartedTime == 0;
//        if (notStartedYet && timeFromEnd >= 1000) {
//            beepOn();
//            beepStartedTime = now();
//        }
//        long timeFromStart = now() - beepStartedTime;
//        boolean isAlreadyOn = beepStartedTime != 0;
//        if(isAlreadyOn && timeFromStart >= 200) {
//            beepOff();
//            beepStartedTime = 0;
//            beepEndTime = now();
//        }
//    }
//}
