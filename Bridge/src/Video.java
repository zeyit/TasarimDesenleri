
public class Video {
	private IVideoMode vieoMode;

	public IVideoMode getVieoMode() {
		return vieoMode;
	}

	public void setVieoMode(IVideoMode vieoMode) {
		this.vieoMode = vieoMode;
	}
	
	public void ShowScreen()
	{
		
		System.out.println(vieoMode.GetScreen());
	}
	
}
