package airhacks;

public interface ConventionalDefaults {

    String functionZip = "../lambda/target/function.zip";
    String quarkusFunctionHandler = "io.quarkus.amazon.lambda.runtime.QuarkusStreamHandler::handleRequest";
    int lambdaTimeout = 10;
    int ONE_CPU = 1700;
    int ram = ONE_CPU;


    static String stackName(String appName,String stackName){
        return "%s-%s-stack".formatted(appName,stackName);
    }

    
}
