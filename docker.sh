CMD_DM restart default
eval "$(CMD_DM env --no-proxy default)"
cd dockerpayaracompose
docker-compose build --build-arg http_proxy=$http_proxy --build-arg https_proxy=$http_proxy payara-full
docker-compose up -d payara-full
cd ..