package Exams;
public class Exams {
    public int idExam;
    int idExams;
    int glucoseLevel;

    String getDiagnosis() {
    if (glucoseLevel < 100) {
    return "Normal";

    } else if (glucoseLevel <= 125) {
    return "Prediabetes";

    } else {
	return "Diabetes";

    }
	}
}

