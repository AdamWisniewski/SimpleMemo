package adamWisniewski.simpleMemo.model;

public class FlashCard {
	
	private String word1;
	private String word2;
	private String knowlege;
	private String comment;
	
	@Override
	public String toString() {
		return word1 + ", " + word2 + ", " + knowlege + ", " + comment;
	}
	public FlashCard() {
		super();
	}
	public FlashCard(String word1, String word2, String knowlege, String comment) {
		super();
		this.word1 = word1;
		this.word2 = word2;
		this.knowlege = knowlege;
		this.comment = comment;
	}
	public String getWord1() {
		return word1;
	}
	public void setWord1(String word1) {
		this.word1 = word1;
	}
	public String getWord2() {
		return word2;
	}
	public void setWord2(String word2) {
		this.word2 = word2;
	}
	public String getKnowlege() {
		return knowlege;
	}
	public void setKnowlege(String knowlege) {
		this.knowlege = knowlege;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

}
