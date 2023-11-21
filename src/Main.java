import com.workintech.*;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Wall wallRight = new Wall("right");
        Wall wallLeft = new Wall("left");
        Wall wallFront = new Wall("front");
        Wall wallBack = new Wall("back");
        Wall[] walls = {wallBack, wallFront, wallRight, wallLeft};

        Bedroom bedroom = new Bedroom("bedroom", walls, new Ceiling(6, PaintColor.WHITE),
                new Bed("base", 2, 70, 2, 1),
                new Lamp(LampType.LAMPSHADE, true, 60), new Wardrobe(3, 3, 60),
                new Carpet(3, 3, PaintColor.WHITE));

        System.out.println(bedroom);
        bedroom.getCarpet().lying();
        bedroom.getBed().make();
        bedroom.getCeiling().create();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();



    }
}