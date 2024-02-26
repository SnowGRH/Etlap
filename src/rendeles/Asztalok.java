
package rendeles;

import java.util.ArrayList;


public class Asztalok {
    private String szin;
    private ArrayList<Etel> rendelesek;

    public Asztalok(String szin, ArrayList<Etel> rendelesek) {
        this.szin = szin;
        this.rendelesek = rendelesek;
    }

    public String getSzin() {
        return szin;
    }

    public ArrayList<Etel> getRendelesek() {
        return rendelesek;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public void setRendelesek(ArrayList<Etel> rendelesek) {
        this.rendelesek = rendelesek;
    }
    
    
    
}
