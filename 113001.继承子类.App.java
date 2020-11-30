package pack;

public class App extends R {
	public static void main(String[] args) {
		App app=new App();
		 System.out.println(app.boy_filePath);
		 System.out.println(app.girl_filePath);		 
		 
		 for(int i=0;i<app.arr.length;i++) {
			 for(int j=0;j<app.arr[i].length;j++) {
				 System.out.print(app.arr[i][j]+" ");
			 }
			// 换行
			System.out.println();
		}
	}
}
