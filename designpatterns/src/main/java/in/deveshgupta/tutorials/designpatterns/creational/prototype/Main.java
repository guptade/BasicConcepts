package in.deveshgupta.tutorials.designpatterns.creational.prototype;

public class Main {

	public static void main(String[] args) {
		PrototypePattern pattern = new PrototypePattern();

		Webpage homePage = pattern.getPrototype();
		setWebpage(homePage, "home", "Home page description");
		Webpage aboutPage = pattern.getPrototype();
		setWebpage(homePage, "about", "About page description");
		Webpage page404 = pattern.getPrototype();

		System.out.println(homePage);
		System.out.println(aboutPage);
		System.out.println(page404);

		/* shallow copy of web page media */
		homePage.getContent().getMedia().setMediaUrl("/no-media");
		System.out.println("Shallow copy");

		System.out.println(homePage);
		System.out.println(aboutPage);
		System.out.println(page404);
		System.out.println(pattern.getPrototype());

	}

	private static void setWebpage(Webpage page, String name, String description) {
		page.setTitle(name);
		page.setUrl("/" + name);
		page.getContent().setDescription(description);
	}

}
