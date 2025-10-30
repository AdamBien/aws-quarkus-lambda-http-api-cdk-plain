# Lambda Function

Quarkus application deployed as AWS Lambda, exposed via API Gateway HTTP API.

## Endpoints

- `/greetings` - Greeting service
- `/time` - Current time service

## Build

```bash
mvn clean package
```

Generates `target/function.zip` for Lambda deployment.

## Local Testing

```bash
mvn quarkus:dev
```
