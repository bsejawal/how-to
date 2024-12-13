### In linux get already running port process and kill in it

1. How to find process by port
```
lsof -t -i:<port number>
example : lsof -t -i:3000

OR in windows 

netstat -ano | findstr :8080
```

2. Kill Process
```
kill -9 <process number>
example kill -9 23451

OR in windows

taskkill.exe /F /PID <pid>
```

3. Kill process by port number directly
```
kill -9 $(lsof -t -i:3000 -sTCP:LISTEN)
```
### To know java home location in mac
``` /usr/libexec/java_home -v15 ```

### find with regular expression in unix machine
``` egrep -R -s -o --exclude-dir=./Library 37[0-9]{15}|37[0-9]{13}|37[0-9]{11} . ```
it will find all the occurrence in present working directory

### Port Redirect in Unix machine
``` sudo iptables -t nat -A PREROUTING -p tcp --dport 443 -j REDIRECT --to-ports 8443 ```


### to see Redirected ports  
``` sudo  iptables -t nat -L ```

### encrypt ec2 instance
``` cryptsetup create enc-ebs /dev/xvdc --verbose --cipher "aes-cbc-essiv:sha256" ```

### mount EBS volume in EC2 instance in AWS after attaching from web console
``` mount /dev/mapper/enc-ebs /ebs ```

### keytool
``` keytool -importkeystore -srckeystore QR2015.pfx -srcstoretype pkcs12 -destkeystore clientcert.jks -deststoretype JKS ```

