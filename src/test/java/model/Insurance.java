package model;

public class Insurance {
    private String provider;
    private int duration;
    private String destination;
    private String policyHolderName;
    private int numberOfTravellers;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public int getNumberOfTravellers() {
        return numberOfTravellers;
    }

    public void setNumberOfTravellers(int numberOfTravellers) {
        this.numberOfTravellers = numberOfTravellers;
    }
}
