package DataAccessLayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Decorations {
    private int decoID;
    private String decoName;
    private int decoQuant;

    public Decorations(){
		// Code here
	}

    public List<Decorations> getDecorations(ArrayList<String> ID){

        // Temporary - used instead of "null"
        return Collections.emptyList();
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
