package anonymous;

public class PhotoShopApp {

	public static void main(String[] args) {

		PhotoShop ps = new PhotoShop();

		Pen yellow = new Pen() {
			public void draw() {
				System.out.println("노랑");
			}
		};
		
		ps.painting(yellow);
		
		/*
			ps.painting(new Pen());
			↓
			ps.painting(new Pen() {});
			↓
			ps.painting(new Pen() {

			});
			↓
			ps.painting(new Pen() {
				public void draw() {

				}
			});
		*/
		ps.painting(new Pen() {
			public void draw() {
				System.out.println("빨강");
			}
		});
		
		// 람다식
		ps.painting(() -> {System.out.println("파랑");});
	}
}