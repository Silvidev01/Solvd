package Hospital;

public class XRay extends MedicalPractice{
    private double Xraycost
    protected XRay(double mpcost, String mpname) {
        super(mpcost, mpname);
    }

    @Override
    public void calculatempCost() { System.out.println ("The XRay cost is"+Xraycost)};

    }

}
