package test.com.region;

public class RegionVO {
	private int ragion_id;
	private String region_name;

	public RegionVO(int ragion_id, String region_name) {
		super();
		this.ragion_id = ragion_id;
		this.region_name = region_name;
	}

	public RegionVO() {
		super();
	}

	public int getRagionId() {
		return ragion_id;
	}

	public void setRagionId(int ragion_id) {
		this.ragion_id = ragion_id;
	}

	public String getRegionName() {
		return region_name;
	}

	public void setRegionName(String region_name) {
		this.region_name = region_name;
	}

	@Override
	public String toString() {
		return "RegionVO [ragion_id=" + ragion_id + ", region_name=" + region_name + "]";
	}

}
