package Hospital;

public class Patient extends Person {
        private int medicalrecordID;
        private String medicalinsurance;

    public Patient(int medicalrecordID) {
        this.medicalrecordID = medicalrecordID;
    }

    public int getMedicalrecordID(){
        return medicalrecordID;
    }

    public Patient(String medicalinsurance) {
        this.medicalinsurance = medicalinsurance;
    }

    public void setmedicalrecordID(int medicalrecordID) {
            this.medicalrecordID = medicalrecordID;
        }

    @Override
    public String print(){
        return medicalinsurance;
    }

}
