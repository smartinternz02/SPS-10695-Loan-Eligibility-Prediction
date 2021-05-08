package pradeep.oracle;
import java.io.IOException;
import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.components.Figure;
import tech.tablesaw.plotly.components.Layout;
import tech.tablesaw.plotly.traces.BoxTrace;
import tech.tablesaw.plotly.traces.HistogramTrace;
public class LoanEligibility {

	public static void main(String[] args) {
		try
		{
			Table Loan_Prediction=Table.read().csv("D:\\pradeep.oracle\\src\\main\\java\\pradeep\\oracle\\train.csv");
			System.out.println(Loan_Prediction.shape());
			System.out.println(Loan_Prediction.first(7));
           	System.out.println(Loan_Prediction.last(7));
			//Loan_Prediction.removeColumns("Dependents");
			System.out.println(Loan_Prediction.structure());
			Loan_Prediction.missingValueCounts();
			//Loan_Prediction.write().csv("D:\\pradeep.oracle\\src\\main\\java\\pradeep\\oracle\\final.csv");
			System.out.println(Loan_Prediction.summary());
////		Histogram
			Layout layout1 = Layout.builder().title("Distribution of  Gender").build();
		    HistogramTrace trace1 = HistogramTrace.builder(Loan_Prediction.nCol("Gender")).build();
		    Plot.show(new Figure(layout1, trace1));
		    
		    Layout layout2 = Layout.builder().title("Distribution of  Married").build();
		    HistogramTrace trace2 = HistogramTrace.builder(Loan_Prediction.nCol("Married")).build();
		    Plot.show(new Figure(layout2, trace2));
		    
		    Layout layout3 = Layout.builder().title("Distribution of  Education").build();
		    HistogramTrace trace3 = HistogramTrace.builder(Loan_Prediction.nCol("Education")).build();
		    Plot.show(new Figure(layout3, trace3));
		    
		    Layout layout4 = Layout.builder().title("Distribution of  Self_Employed").build();
		    HistogramTrace trace4 = HistogramTrace.builder(Loan_Prediction.nCol("Self_Employed")).build();
		    Plot.show(new Figure(layout4, trace4));
		    
		    Layout layout5 = Layout.builder().title("Distribution of  ApplicantIncome").build();
		    HistogramTrace trace5 = HistogramTrace.builder(Loan_Prediction.nCol("ApplicantIncome")).build();
		    Plot.show(new Figure(layout5, trace5));
		    
		    Layout layout6 = Layout.builder().title("Distribution of  CoapplicantIncome").build();
		    HistogramTrace trace6 = HistogramTrace.builder(Loan_Prediction.nCol("CoapplicantIncome")).build();
		    Plot.show(new Figure(layout6, trace6));
		    
		    Layout layout7 = Layout.builder().title("Distribution of  LoanAmount").build();
		    HistogramTrace trace7 = HistogramTrace.builder(Loan_Prediction.nCol("LoanAmount")).build();
		    Plot.show(new Figure(layout7, trace7));
		    
		    Layout layout8 = Layout.builder().title("Distribution of  Loan_Amount_Term").build();
		    HistogramTrace trace8 = HistogramTrace.builder(Loan_Prediction.nCol("Loan_Amount_Term")).build();
		    Plot.show(new Figure(layout8, trace8));
		    
		    Layout layout9 = Layout.builder().title("Distribution of  Credit_History").build();
		    HistogramTrace trace9 = HistogramTrace.builder(Loan_Prediction.nCol("Credit_History")).build();
		    Plot.show(new Figure(layout9, trace9));
		    
		    
		    Layout layout10= Layout.builder().title("Distribution of  Property_Area").build();
		    HistogramTrace trace10 = HistogramTrace.builder(Loan_Prediction.nCol("Property_Area")).build();
		    Plot.show(new Figure(layout10, trace10));
		    
		    Layout layout11 = Layout.builder().title("Distribution of  Loan_Status").build();
		    HistogramTrace trace11 = HistogramTrace.builder(Loan_Prediction.nCol("Loan_Status")).build();
		    Plot.show(new Figure(layout11, trace11));
		  
///BoxTrace		    
		    Layout lay_out1 = Layout.builder().title("Loan Amount vs Loan Amount Term").build();
		    BoxTrace trace_1 =BoxTrace.builder(Loan_Prediction.categoricalColumn("LoanAmount"), Loan_Prediction.nCol("Loan_Amount_Term")).build();
		    Plot.show(new Figure(lay_out1, trace_1));
		   
		    Layout lay_out2 = Layout.builder().title("Self Employement vs Education").build();
		    BoxTrace trace_2 =BoxTrace.builder(Loan_Prediction.categoricalColumn("Self_Employed"), Loan_Prediction.nCol("Education")).build();
		    Plot.show(new Figure(lay_out2, trace_2));
		    
		    Layout lay_out3 = Layout.builder().title("Gender vs Married").build();
		    BoxTrace trace_3 =BoxTrace.builder(Loan_Prediction.categoricalColumn("Gender"), Loan_Prediction.nCol("Married")).build();
		    Plot.show(new Figure(lay_out3, trace_3));
		    
		    Layout lay_out4= Layout.builder().title("Applicant Income vs CoApplicant Income").build();
		    BoxTrace trace_4 =BoxTrace.builder(Loan_Prediction.categoricalColumn("ApplicantIncome"), Loan_Prediction.nCol("CoapplicantIncome")).build();
		    Plot.show(new Figure(lay_out4, trace_4));
		
		    ///test data
		    Table Loan_Prediction1=Table.read().csv("D:\\pradeep.oracle\\src\\main\\java\\pradeep\\oracle\\test.csv");
			System.out.println(Loan_Prediction1.shape());
			System.out.println(Loan_Prediction1.first(7));
           	System.out.println(Loan_Prediction1.last(7));
           	//Loan_Prediction1.removeColumns("Dependents");
			System.out.println(Loan_Prediction1.structure());
			//Loan_Prediction1.write().csv("D:\\pradeep.oracle\\src\\main\\java\\pradeep\\oracle\\TestFinal.csv");

			System.out.println(Loan_Prediction1.summary());
////		Histogram
			Layout layout_2 = Layout.builder().title("Distribution of  LoanAmount").build();
		    HistogramTrace trace_12 = HistogramTrace.builder(Loan_Prediction1.nCol("LoanAmount")).build();
		    Plot.show(new Figure(layout_2, trace_12));
		    
		    Layout layout_4 = Layout.builder().title("Loan Amount vs Loan Amount Term").build();
		    BoxTrace trace_14 =BoxTrace.builder(Loan_Prediction1.categoricalColumn("LoanAmount"), Loan_Prediction1.nCol("Loan_Amount_Term")).build();
		    Plot.show(new Figure(layout_4, trace_14));
		
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}

