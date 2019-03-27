// Author : k.koiso
// 穴埋め（基本選択法ソート）
// ★の箇所に適切なコードを記述しましょう

class sample10
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
		int min;
		int tmp;
		for(int i=0; i<arr.length; i++){
			min = i;
			// 最小を探す
			for(int j=i+1;j< arr.length; j++){
				if(/* ★ */){
					min = j;
				}
			}
			// 入れ替える
			tmp = arr[i];
			// ★
			arr[min] = tmp;
		}
	}
};
