// Author : k.koiso
// コンパイルエラーが発生します。
// 原因を考えてみましょう

class sample1
{
	public static void main(string[] args)
	{
		// コマンドラインパラメータを全て標準出力に表示
		for(string s : args)
		{
			System.out.println(s);
		}
	}
};
