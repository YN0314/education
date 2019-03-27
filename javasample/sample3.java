// Author : k.koiso
// コンパイルエラーが発生します。
// 原因を考えてみましょう

class sample3
{
	public interface IFunc
	{
		int func();
	};
	
	public static class Inner extends IFunc
	{
		public int func()
		{
			return 10;
		}
	};
	
	public static void main(String[] args)
	{
		Inner o = new Inner();

		System.out.println(o.func());
	}
};
