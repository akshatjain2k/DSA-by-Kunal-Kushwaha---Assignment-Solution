package Intermediate_Java_Programs;

public class a9_Calculate_Batting_avg {
    public static void main(String arg[])
  {
     int Matches=5,totalruns=200,innings=5,notout=1;
 
     double avg;
 
     avg=totalruns/(innings-notout);
 
     System.out.println("batting average="+avg);
 
  }
}
