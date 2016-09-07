import java.util.Scanner;


public class GradeBook 
{
	
	public static void main(String[] args)
	{
		double score[] = new double[100];
		double males[] = new double[100];
		double females[] = new double[100];
		double mds[] = new double[100];
		double dcs[] = new double[100];
		double vas[] = new double[100];
		double eeg[] = new double[100];
		double ecn[] = new double[100];
		double csc[] = new double[100];
		int c,m,f,md,va,dc,ee,ec,cs;
		c =0;
		m =0;
		f =0;
		md =0;
		va =0;
		dc =0;
		ee =0;
		ec =0;
		cs =0;
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<100; i++)
		{
			System.out.println("Enter Name,Grade,Gender,Major,State of Origin,Score");
				sc.next();
				sc.next();
				String Gender = sc.next();
				String Major = sc.next();
				String State = sc.next();
				score[i] = sc.nextDouble();
				c++;
				if (Gender.equals("M"))
				{
					males[m] = score[i];
					m++;
				}
				if (Gender.equals("F"))
				{
					females[f] = score[i];
					f++;
				} 
				if (Major.equals("Econ"))
				{
					ecn[ec] = score[i];
					ec++;
				}
				if (Major.equals("CompSci"))
				{
					csc[cs] = score[i];
					cs++;
				}
				if (Major.equals("EE"))
				{
					eeg[ee] = score[i];
					ee++;
				}
				if (State.equals("MD"))
				{
					mds[md] = score[i];
					md++;
				}
				if (State.equals("DC"))
				{
					dcs[dc] = score[i];
					dc++;
				}
				if (State.equals("VA"))
				{
					vas[va] = score[i];
					va++;
				}
				sc.nextLine();
				System.out.println("DO you want to continue - \"yes\" or \"no\"");
				String t = sc.next();
				if (t.equals("no"))
					break;
				sc.nextLine();
				
		}
		System.out.printf("Number of Students\t %d\n", c);
		int i;
		double sum;
		
		sum =0;;
		for ( i=0;i<c ;i++ )
		{
			sum = sum + score[i];
		}
		sum = sum/i;
		
		System.out.printf("Overall Average\t %.02f\n", sum);
		
		sum =0;;
		for ( i=0;i<m ;i++ )
		{
			sum = sum + males[i];
		}
		sum = sum/i;
		
		System.out.printf("Average for Gender M\t %.02f\n", sum);
		
		sum =0;;
		for ( i=0;i<f ;i++ )
		{
			sum = sum + females[i];
		}
		sum = sum/i;
		
		System.out.printf("Average for Gender F\t %.02f\n", sum);
		
		sum =0;;
		for ( i=0;i<ec ;i++ )
		{
			sum = sum + ecn[i];
		}
		sum = sum/i;
		
		System.out.printf("Avg for Major Econ\t %.02f\n", sum);
		
		sum =0;;
		for ( i=0;i<cs ;i++ )
		{
			sum = sum + csc[i];
		}
		sum = sum/i;
		
		System.out.printf("Avg for Major CompSci\t %.02f\n", sum);
		
		sum =0;;
		for ( i=0;i<ee ;i++ )
		{
			sum = sum + eeg[i];
		}
		sum = sum/i;
		
		System.out.printf("Avg for Major EE\t %.02f\n", sum);
		
		sum =0;;
		for ( i=0;i<md ;i++ )
		{
			sum = sum + mds[i];
		}
		sum = sum/i;
		
		System.out.printf("Average for State MD\t %.02f\n", sum);
		
		sum =0;;
		for ( i=0;i<dc ;i++ )
		{
			sum = sum + dcs[i];
		}
		sum = sum/i;
		
		System.out.printf("Average for State DC\t %.02f\n", sum);
		
		sum =0;;
		for ( i=0;i<va ;i++ )
		{
			sum = sum + vas[i];
		}
		sum = sum/i;
		
		System.out.printf("Average for State VA\t %.02f\n", sum);
		
		sc.close();
	}

}
