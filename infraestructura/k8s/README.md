# Kubernetes

```bash
kubectl apply -f namespace.yml
kubectl apply -f postgres.yml
kubectl apply -f redpanda.yml
kubectl apply -f configmap.yml
kubectl apply -f secret.yml
kubectl apply -f payment-service.yml
kubectl -n payment-poc port-forward svc/payment-native-poc 8080:8080
```

Para Minikube:

```bash
eval $(minikube docker-env)
docker build -f infraestructura/Dockerfile.native -t payment-native-poc:0.1.0-native .
kubectl apply -f infraestructura/k8s/
```
