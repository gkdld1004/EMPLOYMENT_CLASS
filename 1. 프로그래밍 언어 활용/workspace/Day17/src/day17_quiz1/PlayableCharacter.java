package day17_quiz1;

public class PlayableCharacter {
	
	private String name;
	private int atk;
	private int hp;

	public PlayableCharacter(String name, int atk, int hp){
		this.name = name;
		this.atk = atk;
		this.hp = hp;
	}
	
	@Override
	public String toString() {
		return String.format("%s ) 공격력 : %d, 체력 : %d\n", name, atk, hp);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
}
