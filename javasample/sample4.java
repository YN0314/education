// Author : k.koiso
// コンパイルエラーが発生します。
// 原因を考えてみましょう

class sample4
{
	public interface IFunc
	{
		int func();
	};
	
	public static void main(String[] args)
	{
		// ()->{}のような書き方を"ラムダ式"と呼びます
		IFunc f = ()->{return 80};

		System.out.println(f.func());
	}
};
