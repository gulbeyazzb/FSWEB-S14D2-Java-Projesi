import com.workintech.*;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("bedroom",new Wall("right"),new Wall("left"),
                new Wall("front"),new Wall("back"),new Ceiling(6,PaintColor.RED),
                new Bed("base",2,70,2,1),
                new Lamp(LampType.LAMPSHADE,true,60),new Wardrobe(3,3,60),
                new Carpet(3,3,PaintColor.WHITE));

        System.out.println(bedroom);

    }
}