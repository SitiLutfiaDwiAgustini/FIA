class program_pemilik_kendaraan
{
	public static void main (String [] args)
	{
		pemilik_kendaraan Pemilik_kendaraan = new pemilik_kendaraan( "00107","fia","bekasi","toyota","21","jj", "fii", "2015", "2", "2", "33", "hitam", "solar","biru","2005", "12345678", "2020");
		Pemilik_kendaraan.stnk();
		Pemilik_kendaraan.pengguna();
		Pemilik_kendaraan.pengguna("pengguna siapa aja");
	}
	
	
}