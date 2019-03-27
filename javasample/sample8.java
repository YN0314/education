// Author : k.koiso
// どのような結果になるか考えてみましょう

class sample8
{
	public static class Inner
	{
		private int _data;
		public int getData(){return _data;}
		public void setData(int data){_data = data;}
		public Inner(int data)
		{
			setData(data);
		}
	};

	public static void main(String[] args)
	{
		Inner obj1 = new Inner(20);
		Inner obj2 = obj1;
		
		obj2.setData(obj1.getData() * 2);

		System.out.println(String.format("obj1.data = %d", obj1.getData()));
		System.out.println(String.format("obj2.data = %d", obj2.getData()));
	}
};
