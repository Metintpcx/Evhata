package tpc.metocan.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tpc.metocan.dao.tblkategoridao;
import tpc.metocan.dao.tblkullanicidao;
import tpc.metocan.models.tblkategori;
import tpc.metocan.models.tblkullanici;
import tpc.metocan.modelview.ModelWebSite;
import tpc.metocan.modelview.ModelWebSiteIndex;

@ManagedBean(name = "indexBean")
@SessionScoped
public class IndexBean {
	
	private ModelWebSite webkul;
	private ModelWebSiteIndex model;
	private tblkategoridao Dbkategori;
	private tblkategori kategori;
	private tblkullanici kullanici;
	private tblkullanicidao Dbkullanici;
	// Constructor -> Kurucu method
	public IndexBean()
	{
		webkul = new ModelWebSite();
		model = new ModelWebSiteIndex();
		Dbkategori = new tblkategoridao();
		Dbkullanici = new tblkullanicidao();
		
		kulek();
		Ekleme();
		
		
	}
	
	public void kulek() {
		
		kullanici = new tblkullanici();
		kullanici.setIslem("Hesab�m");
		Dbkullanici.Save(kullanici);

		kullanici = new tblkullanici();
		kullanici.setIslem("Sepetim");
		Dbkullanici.Save(kullanici);
		
		kullanici = new tblkullanici();
		kullanici.setIslem("Sipari�");
		Dbkullanici.Save(kullanici);
		
		kullanici = new tblkullanici();
		kullanici.setIslem("Kartlar�m");
		Dbkullanici.Save(kullanici);
		
		kullanici = new tblkullanici();
		kullanici.setIslem("��k��");
		Dbkullanici.Save(kullanici);
		
		webkul.setListKullanici(Dbkullanici.MyList(new tblkullanici()));
	}
	
	public void Ekleme() {
		kategori = new tblkategori();
		kategori.setAd("Ana Sayfa");
		Dbkategori.Save(kategori);
		
		kategori = new tblkategori();
		kategori.setAd("Kategori");
		Dbkategori.Save(kategori);
		
		kategori = new tblkategori();
		kategori.setAd("En Yeniler");
		Dbkategori.Save(kategori);
		
		kategori = new tblkategori();
		kategori.setAd("Blog");
		Dbkategori.Save(kategori);
		
		kategori = new tblkategori();
		kategori.setAd("Sayfalar�");
		Dbkategori.Save(kategori);
		
		kategori = new tblkategori();
		kategori.setAd("�leti�im");
		Dbkategori.Save(kategori);
		
		model.setListKategori(Dbkategori.MyList(new tblkategori()));
	}
	
	
	public ModelWebSite getWebkul() {
		return webkul;
	}

	public void setWebkul(ModelWebSite webkul) {
		this.webkul = webkul;
	}

	
	public ModelWebSiteIndex getModel() {
		return model;
	}

	public void setModel(ModelWebSiteIndex model) {
		this.model = model;
	}

	
	

}
