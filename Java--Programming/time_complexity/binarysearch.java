class Demo{
	public static void main (String[]args){
			int [] arr = {10,20,30,40,50,60,70};
			int Target = 70;
		int low = 0;
		int high = arr.length-1;
		boolean Found = false;
	while(low <= high){
		int mid = low + (high-low)/2;
	if(arr[mid]==Target){
		Found = true;
		break;
	}else if (arr[mid]<Target){
		low=mid+1;
	
	}else{
		high=mid-1;
	}
	}
		System.out.println(Found ? "Sapadal":"nahiye bro!try another logic");
	}
}