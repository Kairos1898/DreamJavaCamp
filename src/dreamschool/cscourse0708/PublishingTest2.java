package dreamschool.cscourse0708;

public class PublishingTest2 {

	public static void main(String[] args) {
		Pulication samgook = new Pulication("��ȭ �ﱹ��", 5000, 300);
		Pulication piStory = new Pulication("���� �̾߱�", 8400, 280);
		
		Pulication.printHeader();
		samgook.printBookInfo();
		piStory.printBookInfo();
		

	}

}
