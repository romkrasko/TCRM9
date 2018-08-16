public class CatCafe {

    private String adress;
    private Cat[] cats;
    private String timeOfWork;
    private int catCounter;

    public CatCafe(String adress,Cat[] cats, String timeOfWork, int catCounter) {
        this.adress = adress;
        this.cats = cats;
        this.timeOfWork = timeOfWork;
        this.catCounter = catCounter;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTimeOfWork() {
        return timeOfWork;
    }

    public void setTimeOfWork(String timeOfWork) {
        this.timeOfWork = timeOfWork;
    }

    public int getCatCounter() {
        return catCounter;
    }

    public void setCatCounter(int catCounter) {
        this.catCounter = catCounter;
    }

    public void printCatsInCafe(String breed) {
        for (Cat cat : cats) {
            try {
                String breedCat = new String(cat.getBreed());
                if ((cat.isInCafe()) && (breedCat.equals(breed))) {
                    System.out.println(cat.getName() + " " + cat.getSex() + " " + cat.getBreed());
                }
            } catch (NullPointerException ex) {
            }
        }
    }
}