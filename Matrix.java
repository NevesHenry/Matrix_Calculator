import java.util.ArrayList;

public class Matrix {
	
	public Matrix(String name) {
		this.name = name;
	}

	private String name;
	
	private ArrayList<ArrayList<Double>> matrix = new ArrayList<ArrayList<Double>>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public ArrayList<ArrayList<Double>> getMatrix() {
		return matrix;
	}
	
	
	@Override
	 public String toString(){
	      String result = "";
	      for(int i = 0; i < matrix.size(); i++){
	          for(int j = 0; j < matrix.get(i).size(); j++){
	              result += matrix.get(i).get(j) + " ";
	          }
	          // System.out.println();
	          result += "\n";
	      }
	      return result;
	  }
	
	public void addRow(String[] s) {
		ArrayList<Double> row = new ArrayList<Double>();
		for (String str : s) {
			Double d = Double.parseDouble(str);
			row.add(d);
		}
		this.matrix.add(row);
	}

	public void populateMatrix(String userInput) {
		for(String row :userInput.split(";")) {
			this.addRow(row.split(" "));
		}
		
	}
	
	
}
