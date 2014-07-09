//project test
//Nhom : Dang Hoang trung
//	 Ninh Van Hanh
public class Beer {
	public static void main (String[] args)
	{
			Beer1 b = new Beer1();
			b.show();
	}
	}
	class Beer1 {
		private String start = "bottles of beer on the wall ";
		private	String end = " bottles of beer";
		private	String add = "take one down, pass it around";
		public void show()
		{
			System.out.print("Ho va ten: Dang Hoang Trung\t");
			System.out.print("MSSV : 09020542\t");
			System.out.print("Lop : Bang kep\t");
			System.out.print("Github account : trungdh\t");
			System.out.print("email : conandoye@gmail.com\t");
			System.out.print("Ho va ten: Ninh Van Hanh\t");
			System.out.print("MSSV : 09020172\t");
			System.out.print("Lop : Bang kep\t");
			System.out.print("Github account : hanhnv-540\t");
			System.out.print("email : hanhnv.ht@gmail.com\n");
			for(int i = 9; i>0 ; i--)
			{
				System.out.println(+i+ start + i +end);
				System.out.println(add);
			}
			System.out.println("No more bottles of beer on the wall");
		}
	}
