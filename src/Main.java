import java.lang.instrument.Instrumentation;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static void premain(String agentOps, Instrumentation inst) {
        System.out.println("=========premain方法执行========");
        System.out.println(agentOps);
    }


}
