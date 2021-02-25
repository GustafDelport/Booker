package DataAccessLayer;

import java.util.List;

public class Decorations {
    private int decoID;
    private String decoName;
    private int decoQuant;

    public Decorations(){}

    public List<Decorations> getDecorations(){

        return null;
    }

	public int getDecoID() {
		return decoID;
	}

	public void setDecoID(int decoID) {
		this.decoID = decoID;
	}

	public String getDecoName() {
		return decoName;
	}

	public void setDecoName(String decoName) {
		this.decoName = decoName;
	}

	public int getDecoQuant() {
		return decoQuant;
	}

	public void setDecoQuant(int decoQuant) {
		this.decoQuant = decoQuant;
	}
}
