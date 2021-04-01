package centralOOP.relationships;

public class Maruti extends Car {
/* Maruti extends Car and thus inherits all methods from Car (except final and static)
   Maruti can also define (определить) all its specific functionality.
   Maruti class uses Engine object’s start() method via composition. We can say that Maruti class HAS-A Engine.
 */
    public void marutiStartDemo (){
        Engine engine = new Engine();
    }



}
