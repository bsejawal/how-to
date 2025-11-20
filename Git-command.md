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
## git add
Add all files
```
git add .
```
Add except one file(s)
```
git add . ':!file1.txt' ':!file2.txt' ':!path/to/file3.txt'
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
#### How to list all files in a commit in git
```
git show --name-only [commit_hash]
```
## Git Commands for Merge/Pull Request File Tracking

### 1. Identify Merge Commits Related to Swagger Documentation
```bash
git log --merges --oneline | grep branch-name
```
Lists all merge commits containing `branch-name` in the message.

---

### 2. Show Details of a Specific Merge Commit
```bash
git show --name-status <commit-hash>
```
Replace `<commit-hash>` with the commit ID (e.g., `031c47a`). Displays files changed in that merge.

---

### 3. Export List of Modified Files Between Two Commits
```bash
git diff --name-status <old-commit> <new-commit> > ~/Desktop/modified-file-list.txt
```
Replace `<old-commit>` and `<new-commit>` with commit IDs (e.g., `9c104ba` and `02ecag7`). Saves the list of modified files to `modified-file-list.txt`.



## Remove a git commit which has not been pushed(for only one commit)
```
git reset HEAD~1
```
(to get a commit_hash use following [git log](#showing-git-log-history))

## Rename branch
```
git branch -m old-branch-name new-branch-name
git push origin :old-branch-name new-branch-name
git push --set-upstream origin new-branch-name
git branch -vv //to verify
```
