# Datasets de la PoC

La carpeta `sql` contiene scripts para precargar merchants y payment methods de demo en PostgreSQL.

Con Docker Compose, los scripts se montan automáticamente en `/docker-entrypoint-initdb.d` la primera vez que se crea el volumen/contenedor de PostgreSQL.

Datos precargados:

| Tipo | Valor |
|---|---|
| Merchant activo | `mrc_demo_001` |
| Merchant inactivo | `mrc_inactive_001` |
| Método VISA activo | `tok_visa_4242` |
| Método Mastercard activo | `tok_mc_5555` |
| Método deshabilitado | `tok_disabled_0000` |

Si ya habías levantado PostgreSQL y quieres recargar todo:

```bash
docker compose -f infraestructura/docker-compose.yml down -v
docker compose -f infraestructura/docker-compose.yml up -d
```
