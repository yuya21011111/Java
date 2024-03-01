package sample;

class Referee {
	String name;
	
	Referee(){
		name = "未登録";
	}
	
	public Referee(String name) {
		this();
		this.name = name;
	}
}
