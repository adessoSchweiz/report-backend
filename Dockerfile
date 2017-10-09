FROM airhacks/glassfish:v5

ADD target/report-backend.war ${DEPLOYMENT_DIR}