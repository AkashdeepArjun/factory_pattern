package home;

import java.util.ArrayList;
import java.util.List;

public class FastFood extends Food{
List<String> menu;


public FastFood(){
    menu=new ArrayList<String>();
    menu.add("pizza");
    menu.add("pasta");
    menu.add("thumbs up");

}
@Override
public List<String> getMenu() {
    
    return this.menu;
}

    
}
