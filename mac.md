# macOS Tips & Shortcuts Cheat Sheet

Useful macOS productivity tips, terminal setup commands, and shortcut keys.

## 1) Flycut (Clipboard Manager)

Flycut keeps a history of copied text so you can paste older clipboard entries.

### Install (Homebrew)
```bash
brew install --cask flycut
```

### Required macOS Permission
1. Open **System Settings** → **Privacy & Security** → **Accessibility**.
2. Enable **Flycut**.

### Recommended Flycut Preferences
- Enable **Sticky Bezel** *(disable if you prefer paste on ⌘ key release behavior)*.
- Enable **Launch Flycut on login**.

### Basic Usage
- Copy as usual: **⌘C**
- Open clipboard history (default): **⇧⌘V**
- Paste latest item as usual: **⌘V**

---

## 2) Terminal Autocomplete from History (Zsh Plugins)

### Install plugins
```bash
brew install zsh-autosuggestions zsh-syntax-highlighting
```

### Add to `~/.zshrc`
```bash
source $(brew --prefix)/share/zsh-autosuggestions/zsh-autosuggestions.zsh
source $(brew --prefix)/share/zsh-syntax-highlighting/zsh-syntax-highlighting.zsh
```

### Reload shell config
```bash
source ~/.zshrc
```

---

## 3) macOS Window Shortcuts

| # | Action | Shortcut |
|---|---|---|
| 1 | Enter/Exit Full Screen | **⌃⌘F** |
| 2 | Minimize front window to Dock | **⌘M** |
| 3 | Minimize all windows of current app | **⌥⌘M** |

---

## 4) Chrome Shortcuts (macOS)

| # | Action | Shortcut |
|---|---|---|
| 1 | Switch tab (next/previous) | **⌥⌘→ / ⌥⌘←** |
| 2 | Close current tab | **⌘W** |
| 3 | Open new tab | **⌘T** |
| 4 | Reopen last closed tab | **⇧⌘T** |

---

## 5) Open File in TextEdit from Terminal

```bash
open -a TextEdit <filename>
```
