package airhacks.apigateway.boundary;

import java.util.List;
import java.util.Map;

import airhacks.ConventionalDefaults;
import airhacks.apigateway.control.APIGatewayIntegrations;
import airhacks.lambda.control.QuarkusLambda;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.constructs.Construct;

public class LambdaHttpApiGatewayStack extends Stack {

    public LambdaHttpApiGatewayStack(Construct scope, String appName, String functionName, List<String> allowOrigins,
            StackProps stackProps) {
        super(scope, ConventionalDefaults.stackName(appName, "lambda-http-api"), stackProps);
        var configuration = Map.<String,String>of();
        var quarkusLambda = new QuarkusLambda(this,functionName,configuration);
        var function = quarkusLambda.getFunction();
        APIGatewayIntegrations.integrateWithHTTPApiGateway(this, function, allowOrigins);
    }
}
