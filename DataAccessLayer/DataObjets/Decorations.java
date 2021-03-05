package DataAccessLayer.DataObjets;

public class Decorations {
    private int decoID;
    private String decoName;

    public Decorations(){
		// Code here
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

	public Decorations(int decoID, String decoName) {
		this.decoID = decoID;
		this.decoName = decoName;
	}
}
