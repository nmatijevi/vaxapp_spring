package hr.java.matijevic.vaxapp;

public class Vaccine {

    private String scienceName;
    private String producerName;
    private String typeOfVaccine;
    private Integer necessaryNumOfVaccine;
    private Integer availableVaccine;

    public Vaccine(String scienceName, String producerName, String typeOfVaccine, Integer necessaryNumOfVaccine, Integer availableVaccine) {
        this.scienceName = scienceName;
        this.producerName = producerName;
        this.typeOfVaccine = typeOfVaccine;
        this.necessaryNumOfVaccine = necessaryNumOfVaccine;
        this.availableVaccine = availableVaccine;
    }



    public String getScienceName() {
        return scienceName;
    }

    public void setScienceName(String scienceName) {
        this.scienceName = scienceName;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getTypeOfVaccine() {
        return typeOfVaccine;
    }

    public void setTypeOfVacine(String typeOfVacine) {
        this.typeOfVaccine = typeOfVacine;
    }

    public Integer getNecessaryNumOfVaccine() {
        return necessaryNumOfVaccine;
    }

    public void setNecessaryNumOfVaccine(Integer necessaryNumOfVaccine) {
        this.necessaryNumOfVaccine = necessaryNumOfVaccine;
    }

    public Integer getAvailableVaccine() {
        return availableVaccine;
    }

    public void setAvailableVaccine(Integer availableVaccine) {
        this.availableVaccine = availableVaccine;
    }
}
