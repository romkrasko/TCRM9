public class Animal {

    private String speakWord;
    protected String type;

    public Animal(String speakWord) {
        this.speakWord = speakWord;
    }

    public Animal() {
    }

    public String getSpeakWord() {
        return speakWord;
    }

    public void setSpeakWord(String speakWord) {
        this.speakWord = speakWord;
    }

    public void speak(){
        System.out.println(speakWord);
    }

    public void info(){
        System.out.println(Animal.class.getName()+" + "+speakWord);
    }
}