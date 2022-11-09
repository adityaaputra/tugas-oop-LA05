package learning;

public class Main {
	
	public Main() {
		Persona persona = new Persona("Agus", "Jl Jambu, Bogor", "0812512512", "agus29@gmail.com");
		
		Murid murid = new Murid("ALEX", "Jl Jambu Dua, Bogor", "08139234578", "alex.johnson@yahoo.com",
				"sophomore");
		
		Pegawai pegawai = new Pegawai("salahuddin", "Jl Anggrek, Jakarta", "8299", "salah.huddin3@yahoo.com",
				"Janitor or something", 100000, LocalDateTime.now());
		
		Dosen dosen = new Dosen("Bayu", "Jl. Anggrek, Jakarta", "02110000", "bayu_setiawan@gmail.com",
				"Teacher of science", 1000, LocalDateTime.now(), "07-17", "Aeroengineering Professor");
		
		Staff staff = new Staff("Wanda Joe", "Jl Kasurai, Bandung", "0223547429", "Wandahi@hotmail.com",
				"He works here", 1000, LocalDateTime.now());
		
		System.out.println(staff);
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main()
	}

}
