package airhacks;

import airhacks.apigateway.boundary.LambdaHttpApiGatewayStack;
import software.amazon.awscdk.App;
import software.amazon.awscdk.Tags;

public interface CDKApp {
    
    String appName = "quarkus-lambda-http-api";

    static void main(String... args) {

        var app = new App();

        Tags.of(app).add("project", "Quarkus on AWS Lambda via HTTP Api");
        Tags.of(app).add("environment", "development");
        Tags.of(app).add("application", appName);
        var functionName = Configuration.functionName(appName);
        var stackProperties = Configuration.stackProperties(appName);
        var allowOrigins = Configuration.allowOrigins(appName);
        new LambdaHttpApiGatewayStack(app, appName,functionName,allowOrigins,stackProperties);
        app.synth();  
    }
}
