package week4Interface;

public class WorkOut {
	private String type;
	private String equipment;
	private String weights;
	private String repetitions;
	private String reason;
	
	
	public WorkOut(String type, String equipment, String weights, String repetitions, String reason) {
		super();
		this.type = type;
		this.equipment = equipment;
		this.weights = weights;
		this.repetitions = repetitions;
		this.reason = reason;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEquipment() {
		return equipment;
	}
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}
	public String getWeights() {
		return weights;
	}
	public void setWeights(String weights) {
		this.weights = weights;
	}
	public String getRepetitions() {
		return repetitions;
	}
	public void setRepetitions(String repetitions) {
		this.repetitions = repetitions;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "WorkOut [type=" + type + ", equipment=" + equipment + ", weights=" + weights + ", repetitions="
				+ repetitions + ", reason=" + reason + "]";
	}
	

}
