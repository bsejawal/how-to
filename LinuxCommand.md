# Linux Command Cheat Sheet

A clean and practical reference for common Linux/macOS terminal tasks, with a few Windows alternatives where useful.

## 1) Find Process by Port and Kill It

### Find process ID (PID) by port
```bash
lsof -t -i:<port>
# Example
lsof -t -i:3000
```

### Kill process by PID
```bash
kill -9 <pid>
# Example
kill -9 23451
```

### Kill process directly by port
```bash
kill -9 $(lsof -t -i:3000 -sTCP:LISTEN)
# OR
lsof -ti:8080 | xargs kill -9
```

### Windows alternatives
```powershell
netstat -ano | findstr :8080
taskkill /F /PID <pid>
```

---

## 2) Java Home Location (macOS)

```bash
/usr/libexec/java_home -v 15
```

---

## 3) Search with Regular Expression Recursively

```bash
egrep -R -s -o --exclude-dir=./Library '37[0-9]{15}|37[0-9]{13}|37[0-9]{11}' .
```

This searches from the current directory and prints all matches.

---

## 4) Port Redirect (Linux with iptables)

### Redirect port 443 to 8443
```bash
sudo iptables -t nat -A PREROUTING -p tcp --dport 443 -j REDIRECT --to-ports 8443
```

### List redirected NAT rules
```bash
sudo iptables -t nat -L
```

---

## 5) Encrypt EBS Volume (EC2)

```bash
cryptsetup create enc-ebs /dev/xvdc --verbose --cipher "aes-cbc-essiv:sha256"
```

---

## 6) Mount Encrypted EBS Volume (EC2)

```bash
mount /dev/mapper/enc-ebs /ebs
```

---

## 7) keytool: Import .pfx into .jks

```bash
keytool -importkeystore \
  -srckeystore QR2015.pfx \
  -srcstoretype pkcs12 \
  -destkeystore clientcert.jks \
  -deststoretype JKS
```

---

## 8) Alias Example

```bash
alias ll='ls -laG; pwd'
```

---

## 9) Run a Simple Local HTTP Server

### Get private IP address (macOS)
```bash
ipconfig getifaddr en0
```

### Install Python 3 (macOS with Homebrew)
```bash
brew install python
```

### Start server on port 8000
```bash
python3 -m http.server 8000
```

Open in browser:

```text
http://<your-private-ip>:8000/
```
