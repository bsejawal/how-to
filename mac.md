
## Flycut (Clipboard manager)
Flycut allows multiple entries on the clipboard.

#### Install with Homebrew
- brew install --cask flycut
##### Configuration
- Open "System Setting" in Mac -> Privacy & Security -> Accessibility -> enable "Flycut" (You may have to have admin access)
- Open Flycut -> Preferences
  - Check Sticky Bezel (Unckeck if you want to paste text on releasing command(⌘) key)
  - Check Launch Flycut on login
#### Basics
- Copy the same way as always. (**cmd(⌘)** + **C**)
- Press the Main Hotkey ((**shift(⇧)** + **cmd(⌘)** + **V**) by default) to access your clipboard history. Or just use the Flycut menu (that little red locker, like the one you see above.
- Paste the same way as always. (**cmd(⌘)** + **V**) for most recent

## Mac Terminal Autocomplete from History
Install:
```
brew install atuin
```
Then run:
```
atuin init zsh >> ~/.zshrc
```

Then Reload:
```
source ~/.zshrc
```
Now Press **ctrl(^)** + **R** -> interactive, searchable, ranked history with timestamps


### Mac Shortcut Key
| SN | Description | Shortcut Key | Note |
| -- | ----------- | ----------- | --------------- |
| 1 | Enter/Exit Full-Screen Mode | **ctrl(^)** + **cmd(⌘)** + **F** |  |
| 2 | Minimize the front window (But Not Fullscreen) to the Dock | **cmd(⌘)** + **M** |  |
| 3 | Minimize all front windows (But Not Fullscreens)  to the Dock  | **option(⌥)** + **cmd(⌘)** + **M** |  |

### Chrome Shortcut Key
| SN | Description | Shortcut Key | Note |
| -- | ----------- | ----------- | --------------- |
| 1 | Change Tab | **option(⌥)** + **cmd(⌘)** + **left arrow / right arrow** |  |
| 2 | Close Tab | **cmd(⌘)** + **W** |  |
| 3 | New Tab | **cmd(⌘)** + **T** |  |
| 3 | Recently Closed Tab Re-Open | **shift(⇧)** + **cmd(⌘)** + **T** |  |


## How to open files in TextEdit from the Terminal in Mac OS X
``
open -a TextEdit <filename>
``
