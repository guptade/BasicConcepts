package in.deveshgupta.tutorials.designpatterns.creational.prototype;

public class WebpageContent implements Cloneable {
	public String description;
	private WebpageMedia media;

	public WebpageContent() {

	}

	@Override
	public WebpageContent clone() {
		try {
			WebpageContent clone = (WebpageContent) super.clone();
			/* shallow copy */
			// clone.setMedia((WebpageMedia) clone.getMedia().clone());
			return clone;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public String getDescription() {
		return description;
	}

	public WebpageMedia getMedia() {
		return media;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setMedia(WebpageMedia media) {
		this.media = media;
	}

	@Override
	public String toString() {
		return "WebpageContent [description=" + description + ", media=" + media + "]";
	}

}