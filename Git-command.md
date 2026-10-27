# Git Commands Cheat Sheet

A clean and practical set of commonly used Git commands.

## 1) Repository Setup & Sync

```bash
git init
git clone <repo-url>
git remote -v
git fetch
git pull
git push
```

## 2) Branching

```bash
git branch
git checkout <branch-name>
git checkout -b <new-branch-name>
```

### Rename a branch
```bash
git branch -m <old-branch-name> <new-branch-name>
git push origin :<old-branch-name> <new-branch-name>
git push --set-upstream origin <new-branch-name>
git branch -vv
```

### Delete a branch
```bash
git branch -d <branch-name>
git branch -D <branch-name>  # force delete
```

## 3) Staging & Commits

### Add files
```bash
git add .
```

### Add all except specific files
```bash
git add . ':!file1.txt' ':!file2.txt' ':!path/to/file3.txt'
```

### Commit
```bash
git commit -m "<message>"
git commit --amend
```

## 4) Inspecting Changes & History

```bash
git status
git diff
git log
git log --oneline
git reflog
```

### List files changed in a specific commit
```bash
git show --name-only <commit-hash>
```

## 5) Stash Operations

```bash
git stash
git stash list
git stash pop
git stash drop stash@{<index>}
git stash clear
```

## 6) Merge / Rebase

```bash
git merge <branch-name>
git rebase <branch-name>
```

## 7) Reset / Cleanup (Use with Caution)

> ⚠️ These commands can permanently remove local changes.

```bash
git reset
git reset --hard
git clean -fd
```

## 8) Remove Last Local Commit (Not Pushed)

```bash
git reset HEAD~1
```

## 9) Merge / Pull Request File Tracking

### 1. Identify related merge commits
```bash
git log --merges --oneline | grep <branch-name>
```

### 2. Show files changed in a specific merge commit
```bash
git show --name-status <commit-hash>
```

### 3. Export modified files between two commits
```bash
git diff --name-status <old-commit> <new-commit> > ~/Desktop/modified-file-list.txt
```

## 10) Reset Local Branch to Match Remote Exactly

> ⚠️ Warning: This will permanently remove:
> - local uncommitted changes
> - local commits not pushed
> - untracked files (and optionally ignored files)

### Step 1: Switch to the target branch
```bash
git checkout <branch-name>
```

### Step 2: Fetch latest remote state
```bash
git fetch origin
```

### Step 3: Reset local branch to remote branch
```bash
git reset --hard origin/<branch-name>
```

### Step 4: Remove untracked files and directories
```bash
git clean -fd
```

### Step 5 (Optional): Also remove ignored files (build/cache files)
```bash
git clean -fdx
```

### Step 6: Verify clean status
```bash
git status
```

You should now see a clean working tree fully aligned with remote.
