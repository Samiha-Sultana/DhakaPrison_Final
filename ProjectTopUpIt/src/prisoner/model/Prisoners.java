package prisoner.model;

public class Prisoners{

private String National_ID;
private String Prisoner_ID;
private String Prisoner_Name;
private String Entry_Date;
private String Release_Date;
private String Address;
private String Crime_Name;
private String Cell_No;
public Prisoners(){
	super();
}

public Prisoners(String national_ID, String prisoner_ID, String prisoner_Name, String entry_Date,
			String release_Date, String address, String crime_Name,String Cell_No) {
		super();
		this.National_ID = national_ID;
		this.Prisoner_ID = prisoner_ID;
		this.Prisoner_Name = prisoner_Name;
		this.Entry_Date = entry_Date;
		this.Release_Date = release_Date;
		this.Address = address;
		this.Crime_Name = crime_Name;
		this.Cell_No=Cell_No;
	}

public String getNational_ID() {
	return National_ID;
}

public void setNational_ID(String national_ID) {
	National_ID = national_ID;
}

public String getPrisoner_ID() {
	return Prisoner_ID;
}

public void setPrisoner_ID(String prisoner_ID) {
	Prisoner_ID = prisoner_ID;
}

public String getPrisoner_Name() {
	return Prisoner_Name;
}

public void setPrisoner_Name(String prisoner_Name) {
	Prisoner_Name = prisoner_Name;
}

public String getEntry_Date() {
	return Entry_Date;
}

public void setEntry_Date(String entry_Date) {
	Entry_Date = entry_Date;
}

public String getRelease_Date() {
	return Release_Date;
}

public void setRelease_Date(String release_Date) {
	Release_Date = release_Date;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	Address = address;
}

public String getCrime_Name() {
	return Crime_Name;
}

public void setCrime_Name(String crime_Name) {
	Crime_Name = crime_Name;
}

public String getCell_No() {
	return Cell_No;
}

public void setCell_No(String cell_No) {
	Cell_No = cell_No;
}

}