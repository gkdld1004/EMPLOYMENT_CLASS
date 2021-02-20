package fx10;

import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MemberVO implements Serializable {	// 직렬화 가능한
	
	private static final long serialVersionUID = 20201218L;
	// 직렬화된 객체를 구분할 수 있는 고유번호

	// 이름과 전화번호 속성을 가지는 단위 유닛 클래스
	
	private transient ImageView image;
	private transient SimpleStringProperty name;	// transient : 직렬화 시 대상에서 제외한다
	private transient SimpleStringProperty pnum;	// SimpleStringProperty는 직렬화되지 않는다
	private String name_s;
	private String pnum_s;
	private String image_s;
	
	public MemberVO(String name, String pnum) {
		this("user-icon-64x64.png", name, pnum);
	}
	
	public MemberVO(String image, String name, String pnum) {	// 생성자에서는 일반 문자열을 받아서
		this.image = new ImageView(new Image(getClass().getResource(image).toString()));
		this.name = new SimpleStringProperty(name);
		this.pnum = new SimpleStringProperty(pnum);
		this.image_s = image;
		this.name_s = name;
		this.pnum_s = pnum;
	}

	public SimpleStringProperty getName() {
		return name;
	}

	public void setName(SimpleStringProperty name) {
		this.name = name;
	}

	public SimpleStringProperty getPnum() {
		return pnum;
	}

	public void setPnum(SimpleStringProperty pnum) {
		this.pnum = pnum;
	}

	public String getName_s() {
		return name_s;
	}

	public void setName_s(String name_s) {
		this.name_s = name_s;
	}

	public String getPnum_s() {
		return pnum_s;
	}

	public void setPnum_s(String pnum_s) {
		this.pnum_s = pnum_s;
	}

	public String getImage_s() {
		return image_s;
	}

	public void setImage_s(String image_s) {
		this.image_s = image_s;
	}

	public ImageView getImage() {
		this.image.setFitWidth(32);
		this.image.setFitHeight(32);
		return image;
	}

	public void setImage(ImageView image) {
		this.image = image;
	}
	
	@Override
	public String toString() {
		return String.format("image : %s\nname : %s\npnum : %s\n", 
				image_s, name_s, pnum_s);
	}
	
	
}