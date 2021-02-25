package DataAccessLayer;

import java.util.List;

public class Decorations {
    private int decoID;
    private String decoName;
    private int decoQuant;

    public Decorations(){}

    public void setDecoID(int DecoID){
        this.decoID = DecoID;
    }

    public void setDecoName(String DecoName){
        this.decoName= DecoName;
    }

    public void setDecoQant(int DecoQuant){
        this.decoQuant = DecoQuant;
    }

    public List<Decorations> getDecorations(){

        return null;
    }
}
