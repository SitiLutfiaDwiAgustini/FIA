class pemilik_kendaraan extends STNK
{
	public pemilik_kendaraan(String no_registrasi, String nm_pemilik, String alamat, String merk, String type, String jenis, String model, String thn_pembuatan, String isi_silinder, String no_rangkaNIK, String no_mesin, String warna, String bahan_bakar, String warna_TNKB, String thn_registrasi, String no_bpkb, String berlaku_sampai)
	{
		super(no_registrasi, nm_pemilik, alamat, merk, type, jenis, model, thn_pembuatan, isi_silinder, no_rangkaNIK, no_mesin, warna, bahan_bakar, warna_TNKB, thn_registrasi, no_bpkb, berlaku_sampai);
		
	}
	
	public void pengguna ()
	{
		System.out.println("pengguna : jojo"); 
	}
}

