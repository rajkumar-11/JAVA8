public class Report {
    String reportKey;
    String studentNo;
    String classNo;

    public String getReportKey() {
        return reportKey;
    }

    public Report(String reportKey, String studentNo, String classNo) {
        this.reportKey = reportKey;
        this.studentNo = studentNo;
        this.classNo = classNo;
    }

    public void setReportKey(String reportKey) {
        this.reportKey = reportKey;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }
}
