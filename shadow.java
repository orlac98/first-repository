public class shadow{
	int x = 1;
	public static void main(String[] args){
		shadow s = new shadow();
		System.out.println("Local x = "+ s.localVar());
		System.out.println("Global x from method = "+ s.globalVar());
		System.out.println("Global x from attribute = "+s.x);
		Index.main(null);
		}
		public int localVar(){
			int x =2;
			return x;
			}

		public int globalVar(){
			return x;
			}
	}