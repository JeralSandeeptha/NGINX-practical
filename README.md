# NGINX-practical

# SETUP NGINX
1. First we need to setup NGINX server correctly. For that we need to go to NGINX website and download the proejct files.Then extract into c folder like this
   cd C:\nginx -----> folder name can be changed

2. First we should start the server by clicking or cmd commands. For cmd commands we should add the path in environment path variables.
   for start  -> nginx start
   for stop   -> nginx stop
   for version   -> nginx -v
   for reload server   -> nginx -s reload
   
4. For setup the server we needed to change nginx.conf file. We can edit that file using VSCode editor.

5. Then we need to reload the server.To change the settings.
   nginx -s reload

6. Then we can work / access and see the newly changes.

# CREATE API GATEWAY

#user  nobody;
worker_processes  1;

#error_log  logs/error.log;
#error_log  logs/error.log  notice;
#error_log  logs/error.log  info;

#pid        logs/nginx.pid;


events {
    worker_connections  1024;
}


http {
    server {
        listen 80;

        location /service1/ {
            proxy_pass http://localhost:5050/;
            proxy_set_header Host $host;
            proxy_set_header X-Real-IP $remote_addr;
            proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
            proxy_set_header X-Forwarded-Proto $scheme;
        }

        location /service2/ {
            proxy_pass http://localhost:8080/;
            proxy_set_header Host $host;
            proxy_set_header X-Real-IP $remote_addr;
            proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
            proxy_set_header X-Forwarded-Proto $scheme;
        }
    }
}
