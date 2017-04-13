package in.deveshgupta.tutorials.designpatterns.creational.prototype;

public class Webpage implements Cloneable {

	private int id;
	private String url;
	private String title;
	private WebpageContent content = new WebpageContent();

	@Override
	public Webpage clone() {
		try {
			Webpage clone = (Webpage) super.clone();
			/* deep copy */
			clone.setContent(clone.getContent().clone());
			return clone;

		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public WebpageContent getContent() {
		return content;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getUrl() {
		return url;
	}

	public void setContent(WebpageContent content) {
		this.content = content;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Webpage [id=" + id + ", url=" + url + ", title=" + title + ", content=" + content + "]";
	}

}
