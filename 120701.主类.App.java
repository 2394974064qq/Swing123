public class App {
        public static void main(String[] args) {
            int array2d[][]={
                    {1,2,3,4,5,6},
                    {7,8,9,10,0,12},
                    {7,8,9,10,11,12},
                    {7,8,9,10,11,12},
                    {88,66,92,102,151,999}
            };
            Find find= new Find();
            find.findZero(array2d);
            int x = find.R_zero_x;
            int y = find.R_zero_y;
            find.findLeft(x,y);
            find.findRight(x,y,array2d);
            find.findUp(x,y);
            find.findDown(x,y,array2d);
        }
    }
