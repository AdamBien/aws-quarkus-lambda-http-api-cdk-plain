# Quarkus Lambda HTTP API

Quarkus application deployed as AWS Lambda function, exposed through API Gateway HTTP API. Infrastructure provisioned with AWS CDK.

## Architecture

- **Runtime**: AWS Lambda with ARM64 architecture
- **API Gateway**: HTTP API for low-latency REST endpoints
- **Framework**: Quarkus with Lambda integration
- **IaC**: AWS CDK for infrastructure deployment

## Prerequisites

- Java 25
- Maven
- AWS CLI configured
- Node.js (for CDK)

## Build

```bash
mvn clean package
```

## Deploy

```bash
./buildAndDeployDontAsk.sh
```

Builds both Lambda function and CDK infrastructure, then deploys without approval prompts.

Alternatively:

```bash
cd lambda && mvn clean package && cd ../cdk && mvn clean package && cdk deploy --all --require-approval=never
```

### References

- [BCE Architecture Design Pattern](https://bce.design/) - This project organizes code using the Boundary-Control-Entity pattern
- This project is a member of [Constructions Cloud](https://constructions.cloud/)


See you at: [airhacks.live](https://airhacks.live)
