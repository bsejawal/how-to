In linux get already running port's process and kill

1. How to find process by port
```
lsof -t -i:<port number>
example : lsof -t -i:3000
```

2. Kill Process
```
kill -9 <process number>
example kill -9 23451
```


3. Kill process by port number directly
```
kill -9 $(lsof -t -i:3000 -sTCP:LISTEN)
```
