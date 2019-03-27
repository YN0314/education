// Author : k.koiso
// a～zまで表示したいのですが表示されません。
// 原因を考えてみましょう

class sample2
{
	public static void main(String[] args)
	{
		for(int i = 'a'; i < 'z'; i++)
		{
			char c = (char)i;
			System.out.print(c);
		}
		System.out.print('\n');
	}
};
