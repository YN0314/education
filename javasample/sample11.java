// Author : k.koiso
// 穴埋め（隣接交換ソート）
// ★の箇所に適切なコードを記述しましょう

class sample11
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{5, 3, 15, 0, 23, 30, 3, 8};

		Sort(arr);
		for(int i : arr){
			System.out.println(i);
		}
	}

	private static void Sort(int[] arr)
	{
		int tmp;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<(arr.length - i - 1); j++){
				if(/* ★ */){
					tmp = arr[j];
					// ★
					arr[j+1] = tmp;
				}
			}
		}
	}
};
