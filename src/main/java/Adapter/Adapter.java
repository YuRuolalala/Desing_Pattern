package Adapter;

public class Adapter {
    public static void main(String[] args) {
        System.out.println(new AdapterforTranslator(new Speaker()).translate());
    }
}

class Speaker{
    public String speak(){
        return "China No.1";
    }
}

interface Translator{
    public String translate();
}

class AdapterforTranslator implements Translator{
    private Speaker speaker;
    public AdapterforTranslator(Speaker speaker){
        this.speaker=speaker;
    }

    public String translate() {
        String result=speaker.speak();
        return result;
    }
}