package Week1.Classes;

public class Rectangle {

    // Fields
    private int width;
    private int height;
    private String color;

    // Constructor01
    Rectangle(int width, int height){
        if(width <= 0){
            this.width = 1;
        }else {
            this.width = width;
        }

        if(height <= 0){
            this.height = 1;
        }else {
            this.height = height;
        }

        color = "Blue";
    }

    // Constructor02
    Rectangle(int width, int height, String color){
        if(width <= 0){
            this.width = 1;
        }else {
            this.width = width;
        }

        if(height <= 0){
            this.height = 1;
        }else {
            this.height = height;
        }

        if(!color.substring(0,1).equals(color.substring(0,1).toUpperCase())){
            throw new IllegalArgumentException("The first letter has to be capitalized.");
        }else if(color.length() < 2 || color.length() > 20){
            throw new IllegalArgumentException("The color name has to be more than 2 characters long and less than 20");
        }else {
            this.color = color;
        }
    }

    // Methods
    public void draw(){
        String firstLetter = color.substring(0,1);
        String widthLetter = "";
        String heightLetter =  widthLetter;

        for(int i = 1; i <= width; i++){
            widthLetter += firstLetter;
        }

        for(int i = 1; i <= height; i++){
            System.out.println(widthLetter);
        }
    }

    // Getter
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public String getColor(){
        return color;
    }

    // Setter
    public void setWidth(int w){
        int width = w;
    }
    public void setHeight(int h){
        int height = h;
    }
    public void setHeight(String c){
        String color = c;
    }
}
