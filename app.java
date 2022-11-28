public class app {
    public static void main(String[] args) throws Exception{
        readinput readF = new readinput();
        // readF.inputReader();
        addanswer ts = new addanswer();

        ts.computing(readF.inputReader("a"),readF.inputReader("b"));
    }
}
