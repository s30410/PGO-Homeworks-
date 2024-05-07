public class Studies {
    private String programName;
    private String description;
    private int nOfSemesters;
    private int nOfITNs;

    public Studies(String programName, String description, int numberOfSemesters, int numberOfITNsBeforePromotion) {
        this.programName = programName;
        this.description = description;
        this.nOfSemesters = numberOfSemesters;
        this.nOfITNs = numberOfITNsBeforePromotion;
    }

    // Getters and setters
    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNOfSemesters() {
        return nOfSemesters;
    }

    public void setNOfSemesters(int nOfSemesters) {
        this.nOfSemesters = nOfSemesters;
    }

    public int getNOfITNs() {
        return nOfITNs;
    }

    public void setNOfITNs(int nOfITNs) {
        this.nOfITNs = nOfITNs;
    }
}
