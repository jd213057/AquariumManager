package jd.entities;

import java.util.Date;

public class Aquarium {
	
	private int idAquarium;
	
	private Date derniereMaintenance;
	
	private Date prochaineMaintenance = derniereMaintenance;
	
	private String nameRecord;
	
	private boolean nourriture;
	private boolean changementEauBac;
	private boolean filtres;
	private boolean revisionPompe;
	private boolean prefiltre;
	
	private int nitrates;
	private int nitrites;
	private int co2;
	private double pH;
	private int cl;
	private  int gH;
	private int kH;
	
	private String compositionRepas;
	private String commentaire;
	
	public Aquarium() {}
	
	
	public Aquarium(String nameRecord) {
		super();
		this.nameRecord = nameRecord;
	}


	public Aquarium(int idAquarium, Date derniereMaintenance, Date prochaineMaintenance, String nameRecord,
			boolean nourriture, boolean changementEauBac, boolean filtres, boolean revisionPompe, boolean prefiltre,
			int nitrates, int nitrites, int co2, double pH, int cl, int gH, int kH, String compositionRepas,
			String commentaire) {
		super();
		this.idAquarium = idAquarium;
		this.derniereMaintenance = derniereMaintenance;
		this.prochaineMaintenance = prochaineMaintenance;
		this.nameRecord = nameRecord;
		this.nourriture = nourriture;
		this.changementEauBac = changementEauBac;
		this.filtres = filtres;
		this.revisionPompe = revisionPompe;
		this.prefiltre = prefiltre;
		this.nitrates = nitrates;
		this.nitrites = nitrites;
		this.co2 = co2;
		this.pH = pH;
		this.cl = cl;
		this.gH = gH;
		this.kH = kH;
		this.compositionRepas = compositionRepas;
		this.commentaire = commentaire;
	}


	public Aquarium(Date derniereMaintenance, Date prochaineMaintenance, boolean nourriture, boolean changementEauBac,
			boolean filtres, boolean revisionPompe, boolean prefiltre, String compositionRepas, String commentaire) {
		super();
		this.derniereMaintenance = derniereMaintenance;
		this.prochaineMaintenance = prochaineMaintenance;
		this.nourriture = nourriture;
		this.changementEauBac = changementEauBac;
		this.filtres = filtres;
		this.revisionPompe = revisionPompe;
		this.prefiltre = prefiltre;
		this.compositionRepas = compositionRepas;
		this.commentaire = commentaire;
	}


	public Aquarium(int idAquarium, Date derniereMaintenance, Date prochaineMaintenance, int nitrates, int nitrites,
			int co2, double pH, int cl, int gH, int kH) {
		super();
		this.idAquarium = idAquarium;
		this.derniereMaintenance = derniereMaintenance;
		this.prochaineMaintenance = prochaineMaintenance;
		this.nitrates = nitrates;
		this.nitrites = nitrites;
		this.co2 = co2;
		this.pH = pH;
		this.cl = cl;
		this.gH = gH;
		this.kH = kH;
	}

	@Override
	public String toString() {
		return "aquarium [idAquarium=" + idAquarium + ", derniereMaintenance=" + derniereMaintenance
				+ ", prochaineMaintenance=" + prochaineMaintenance + ", nourriture=" + nourriture
				+ ", changementEauBac=" + changementEauBac + ", filtres=" + filtres + ", revisionPompe=" + revisionPompe
				+ ", prefiltre=" + prefiltre + ", nitrates=" + nitrates + ", nitrites=" + nitrites + ", co2=" + co2
				+ ", pH=" + pH + ", cl=" + cl + ", gH=" + gH + ", kH=" + kH + ", compositionRepas=" + compositionRepas
				+ ", commentaire=" + commentaire + "]";
	}


	protected int getIdAquarium() {
		return idAquarium;
	}
	protected void setIdAquarium(int idAquarium) {
		this.idAquarium = idAquarium;
	}
	protected Date getDerniereMaintenance() {
		return derniereMaintenance;
	}
	protected void setDerniereMaintenance(Date derniereMaintenance) {
		this.derniereMaintenance = derniereMaintenance;
	}
	protected Date getProchaineMaintenance() {
		return prochaineMaintenance;
	}
	protected void setProchaineMaintenance(Date prochaineMaintenance) {
		this.prochaineMaintenance = prochaineMaintenance;
	}
	
	
	protected String getNameRecord() {
		return nameRecord;
	}


	protected void setNameRecord(String nameRecord) {
		this.nameRecord = nameRecord;
	}


	protected int getNitrates() {
		return nitrates;
	}


	protected void setNitrates(int nitrates) {
		this.nitrates = nitrates;
	}


	protected boolean isNourriture() {
		return nourriture;
	}
	protected void setNourriture(boolean nourriture) {
		this.nourriture = nourriture;
	}
	protected boolean isChangementEauBac() {
		return changementEauBac;
	}
	protected void setChangementEauBac(boolean changementEauBac) {
		this.changementEauBac = changementEauBac;
	}
	protected boolean isFiltres() {
		return filtres;
	}
	protected void setFiltres(boolean filtres) {
		this.filtres = filtres;
	}
	protected boolean isRevisionPompe() {
		return revisionPompe;
	}
	protected void setRevisionPompe(boolean revisionPompe) {
		this.revisionPompe = revisionPompe;
	}
	protected boolean isPrefiltre() {
		return prefiltre;
	}
	protected void setPrefiltre(boolean prefiltre) {
		this.prefiltre = prefiltre;
	}
	protected int getNitrites() {
		return nitrites;
	}
	protected void setNitrites(int nitrites) {
		this.nitrites = nitrites;
	}
	protected int getCo2() {
		return co2;
	}
	protected void setCo2(int co2) {
		this.co2 = co2;
	}
	protected double getpH() {
		return pH;
	}
	protected void setpH(double pH) {
		this.pH = pH;
	}
	protected int getCl() {
		return cl;
	}
	protected void setCl(int cl) {
		this.cl = cl;
	}
	protected int getgH() {
		return gH;
	}
	protected void setgH(int gH) {
		this.gH = gH;
	}
	protected int getkH() {
		return kH;
	}
	protected void setkH(int kH) {
		this.kH = kH;
	}
	protected String getCompositionRepas() {
		return compositionRepas;
	}
	protected void setCompositionRepas(String compositionRepas) {
		this.compositionRepas = compositionRepas;
	}
	protected String getCommentaire() {
		return commentaire;
	}
	protected void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

}
