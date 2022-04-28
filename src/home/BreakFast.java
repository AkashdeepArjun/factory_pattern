package home;

import java.util.ArrayList;
import java.util.List;

public class BreakFast extends Food {

    List<String> menu;

    public BreakFast(){

        menu=new ArrayList<String>();
        menu.add("chpaati");
        menu.add("potato vegetable");
        menu.add("ginger tea");
        menu.add("green tea");
        

    }


@Override
public List<String> getMenu() {

    return this.menu;
}

    
}
