package in.deveshgupta.tutorials.designpatterns.creational.prototype;

public class PrototypePattern {

	private static Webpage getWebpagePrototype() {
		Webpage page = new Webpage();
		page.setId(0);
		page.setTitle("TITLE");
		page.setContent(new WebpageContent());
		page.getContent().setDescription("SAMPLE_DESCRIPTION");
		page.setUrl("/");
		page.getContent().setMedia(new WebpageMedia());
		page.getContent().getMedia().setMediaUrl("/sample-media");
		return page;
	}

	private Webpage prototypePage;

	public PrototypePattern() {
		prototypePage = getWebpagePrototype();
	}

	public Webpage getPrototype() {
		return prototypePage.clone();
	}
}
