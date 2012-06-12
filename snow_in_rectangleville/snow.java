/**
 * @(#)snow.java
 *
 *
 * @author
 * @version 1.00 2012/6/12
 */

public class snow {

    /**
     * Creates a new instance of <code>snow</code>.
     */
    public snow() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EasyReader reader = new EasyReader("snow.txt");
        int m = reader.readInt(); 			//Read in number of rows
        int n = reader.readInt(); 			//Read in number of columns
        reader.readLine(); 					//Read over newline
        int fallCount = reader.readInt(); 	//Read in number of snowfalls
        reader.readLine(); 					//Read over newline
        int[][] snowfall = new int[m][n];	//Create map of snowfall
        for(int j=0; j<m; j++){				//Initiliaze map to be empty
        	for (int k=0; k<n; k++){
        		snowfall[j][k] = 0;
        	}
        }

		for(int i = 0; i<fallCount; i++){
			int topRow = reader.readInt()-1;	//Read in coordinates of snowfall, followed by endline
			int topCol = reader.readInt()-1;
			int botRow = reader.readInt();
			int botCol = reader.readInt();
			reader.readLine();
			for(int j = topRow; j<botRow; j++){
				for(int k=topCol; k<botCol; k++){
					snowfall[j][k]++;				//Traverse rectangle formed from coordinates and increment snowfall by 1
				}
			}
		}

		printArr(snowfall);
    }

	//Prints out all the elements in the array
    public static void printArr(int[][] arr){
    	for(int j=0; j<arr.length; j++){
			for(int k=0; k<arr[0].length; k++){
				System.out.print(arr[j][k]+" ");
			}
			System.out.println();
		}
    }
}
