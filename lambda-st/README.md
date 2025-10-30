# System Tests

End-to-end tests against deployed Lambda function via API Gateway.

## Run Tests

```bash
mvn -Dbase_uri/mp-rest/url=https://[GENERATED_ID].execute-api.eu-central-1.amazonaws.com clean test-compile failsafe:integration-test
```

Replace `[GENERATED_ID]` with your API Gateway ID from deployment output.

## Pipeline Execution

```bash
export BASE_URI_MP_REST_URL=https://[GENERATED_ID].execute-api.eu-central-1.amazonaws.com
mvn clean test-compile failsafe:integration-test
```