//Kartu prakerja
//noKartu : int
//noKK : int
//NIK : int
//Nama : string
//Alamat : string
//TTL : string
//Telpon : int
//statusPerkawinan : string
//kecamatan : string
//kabupaten : string
//umur : int
//golDarah : string

public class kartuPrakerja {
	private int noKartu, noKK, noIndukKeluarga, noTelepon, umur;
	private String namaAnggota, alamatAnggota, tempatTanggalLahir, statusPerkawinan, kecamatan, kabupaten, golDarah;	
	public kartuPrakerja (int noKartu,int noKK, int noIndukKeluarga, String namaAnggota, String alamatAnggota, String tempatTanggalLahir, int noTelepon, String statusPerkawinan,String kecamatan, String kabupaten, int umur,String golDarah){
		this.noKartu = noKartu;
		this.noKK = noKK;
		this.noIndukKeluarga = noIndukKeluarga;
		this.namaAnggota = namaAnggota;
		this.alamatAnggota = alamatAnggota;
		this.tempatTanggalLahir = tempatTanggalLahir;
		this.noTelepon = noTelepon;
		this.statusPerkawinan = statusPerkawinan;
		this.kecamatan = kecamatan;
		this.kabupaten = kabupaten;
		this.umur = umur;
		this.golDarah = golDarah;
	}
		public int NoKartu(){
			return noKartu;
		}
		public int NoKK(){
			return noKK;
		}
		public int NoIndukKeluarga(){
			return noIndukKeluarga;
		}
		public String NamaAnggota(){
			return namaAnggota;
		}
		public String AlamatAnggota(){
			return alamatAnggota;
		}
		public String TempatTanggalLahir(){
			return tempatTanggalLahir;
		}
		public int NoTelepon(){
			return noTelepon;
		}
		public String statusPerkawinan(){
			return statusPerkawinan;
		}
		public String kecamatan(){
			return kecamatan;
		}
		public String Kabupaten(){
			return kabupaten;
		}
		public int Umur(){
			return umur;
		}
		public String GolDarah(){
			return golDarah;
		}
		
}