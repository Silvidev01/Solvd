package Hospital;
// this class is the medical record that is unique for each patient and has all the medical hsitory of the patient, date, consultation and doctor's notes //

public class medicalrecord {
    private Patient name;
    private Patient lastname;
    private int medicalrecordID;
    private String date;
    private String appointmentnotes;

    public medicalrecord(){name="";lastname="";medicalrecordID=0;date="";appointmentnotes=""};

    public Patient getname() {
        return name;
    }
    public void setName(Hospital.Patient name) {
        this.name = name;
    }

    public Patient getLastname() {
        return lastname;
    }

    public void setLastname(Patient lastname) {
        this.lastname = lastname;
    }

    public int getMedicalrecordID() {
        return medicalrecordID;
    }
    public void setMedicalrecordID(medicalrecordID){
        this.medicalrecordID=medicalrecordID;
    }
    public Stringtring getdate(){
        return date;
    }
    public void setDate(){
        this.date=date;
    }
    public Stringtring getAppointmentnotes(){
        return appointmentnotes;
    }
    public void setAppointmentnotes(String appointmentnotes){
        this.appointmentnotes=appointmentnotes;
    }

}
