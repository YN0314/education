// Author : k.koiso
// どのような結果になるか考えてみましょう

class sample9
{
	public static class Class1
	{
		private int _data;
		public int getData(){return _data;}

		public Class1(int data){
			_data = data;
		}

		public int func(){
			return getData() * 2;
		}
	};
	
	public static class Class2 extends Class1
	{
		public Class2(int data){
			super(data);
		}
		public int getData(){return super.getData() * 2;}
		
		public int func(){
			return super.func() + 2;
		}
	}

	public static void main(String[] args)
	{
		Class1 c1 = new Class1(3);
		Class1 c2 = new Class2(3);

		System.out.println(String.format("c1.func() = %d", c1.func()));
		System.out.println(String.format("c2.func() = %d", c2.func()));
	}
};
