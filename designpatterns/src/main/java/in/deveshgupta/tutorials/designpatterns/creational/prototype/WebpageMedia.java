package in.deveshgupta.tutorials.designpatterns.creational.prototype;

public class WebpageMedia implements Cloneable {

	private String mediaUrl;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getMediaUrl() {
		return mediaUrl;
	}

	public void setMediaUrl(String mediaUrl) {
		this.mediaUrl = mediaUrl;
	}

	@Override
	public String toString() {
		return "WebpageMedia [mediaUrl=" + mediaUrl + "]";
	}

}
