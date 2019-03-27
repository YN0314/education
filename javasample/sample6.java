// Author : k.koiso
// どのような出力になるか考えてみましょう

class sample6
{
	public static void main(String[] args)
	{
		short i = 1;

		System.out.println(i <<= 1); // 2
		System.out.println(i <<= 1); // 4
		System.out.println(i <<= 1); // 8
		System.out.println(i <<= 1); // 16
		System.out.println(i <<= 1); // 32
		System.out.println(i <<= 1); // 64
		System.out.println(i <<= 1); // 128
		System.out.println(i <<= 1); // 256
		System.out.println(i <<= 1); // 512
		System.out.println(i <<= 1); // 1024
		System.out.println(i <<= 1); // 2048
		System.out.println(i <<= 1); // 4096
		System.out.println(i <<= 1); // 8192
		System.out.println(i <<= 1); // 16384
		System.out.println(i <<= 1); // ?????
	}
};
