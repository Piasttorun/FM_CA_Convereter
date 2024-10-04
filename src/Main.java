public class Main {
    public static void main(String[] args) {
        if (args.length!=0){
            System.out.println(convertCAtoOverall(Float.parseFloat(args[0])));
        }
    }

    public static float convertCAtoOverall(float CA){
        return (float) (CA*0.34+30);
    }
}