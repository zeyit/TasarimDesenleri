package factory;

public class PcOlustur {
	IRam _ram;
	IHdd _hdd;
	IFabrika pc;
	public PcOlustur(IFabrika pc) {
		_hdd=pc.CreateHdd();
		_ram=pc.CreateRam();
		this.pc =pc;
	}
	
	public void birlestir(){
		System.out.println("Ram marka "+_ram.RamTur());
		_ram.islem();
		System.out.println("hdd Marka "+_hdd.HddTur());
		_hdd.islem();
	}
}
