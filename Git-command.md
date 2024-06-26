```
git status
git clone <repo url>
git pull
git push
git checkout <branch name>
git checkout -b <new branchname>
git stash
git stash pop
git merge <branch name>
git clean
git commit -m <message>
git commit --amend
git add
git branch
git config
git fetch
git init
git log
git rebase
git reflog
git remote
git reset
git reset --hard
git diff
git branch -d <branch name>
git branch -D <branch name> //forcefully delete branch
```

## git stash
Stash the changes in a dirty working directory away
```
  git stash
```
Clear all stashes at once
```
  git stash clear
```
List all stashes
```
  git stash list
```
delete specific stash
```
  git stash drop stash@{index}
```
## Showing Git log (history)
```
git log
git log --oneline
```

## Remove a git commit which has not been pushed(for only one commit)
```
git reset HEAD~1
```
## How to list all files in a commit in git
```
git show --name-only [commit_hash]
```
(to get a commit_hash use following [git log](#showing-git-log-history))

## Rename branch
```
git branch -m old-branch-name new-branch-name
git push origin :old-branch-name new-branch-name
git push --set-upstream origin new-branch-name
git branch -vv //to verify
```
