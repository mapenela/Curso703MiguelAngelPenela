package evaluacion.primera;

import java.util.Date;

public class RegionDTO {
	private int region_Id;
	private String region_Name;
	public RegionDTO(int region_Id, String region_Name) {
		this.region_Id = region_Id;
		this.region_Name = region_Name;
}
	public int getregion_Id() {
		return region_Id;
	}
	public String getregion_Name() {
		return region_Name;
	}
	@Override
	public String toString() {
		return region_Id + "\t \t " + region_Name;
	}
}
