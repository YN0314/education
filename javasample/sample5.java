// Author : k.koiso
// エラーは発生しません。
// どのような出力になるか考えてみましょう

class sample5
{
	public static void main(String[] args)
	{
		int i = 5;

		System.out.println(String.format("i = %d" , ++i));
		System.out.println(String.format("i = %d" , i++));
		System.out.println(String.format("i = %d" , i));
	}
};
