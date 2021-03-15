public enum Days {
    MONDAY("monday"), TUESDAY("tuesday"), WEDNESDAY("wednesday"), THURSDAY("thursday"), FRIDAY("fridady"), SATURDAY("saturday"), SUNDAY("sunday");

     public String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    Days(String description) {
        this.description=description;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
