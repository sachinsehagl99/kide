user=$1
mkdir /project
touch /project/index.js
sed -i s/qwertyuiop/$user/g kide/servers/web/views/editor.html
pm2 start /kide/server.js --name kide
cd /project
python ../kide/terminal/unique.py
