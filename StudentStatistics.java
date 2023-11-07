public class StudentStatistics {
public static void main(String[] args) {
String studentData = "amjad:85, azhar:90, Aftab:78, akmal:80, umair:88, kamran:79, yaseen:90";
String[] studentRecords = studentData.split(", ");
String[] studentNames = new String[studentRecords.length];
 int[] studentScores = new int[studentRecords.length];
int totalStudents = studentRecords.length; 
int totalScore = 0;
int highestScore = Integer.MIN_VALUE;
 int lowestScore = Integer.MAX_VALUE;
String highestScorer = " "; 
String lowestScorer = " ";
for (int i = 0; i < studentRecords.length; i++) { 
String[] record = studentRecords[i].split(":"); 
studentNames[i] = record[0];
studentScores[i] = Integer.parseInt(record[1]);
totalScore += studentScores[i];
if (studentScores[i] > highestScore) {
 highestScore = studentScores[i];
 highestScorer =studentNames[i];
}
if (studentScores[i] < lowestScore) { 
lowestScore =studentScores[i];
 lowestScorer =studentNames[i];
}
}
double averageScore = (double) totalScore / totalStudents;
System.out.println("Total number of students: " + totalStudents);
System.out.println("Average score of all students: " + averageScore);
System.out.println("Highest score: " + highestScore + " by " + highestScorer);
System.out.println("Lowest score: " + lowestScore + " by " + lowestScorer);
}
}
