# 🎨 Color Matching Game (ColoringApp)

A fun and simple Java-based color-matching game originally created in 2020. This app challenges players to match colors with illustrated objects, reinforcing quick recognition and memorization.

---

## 🧩 Features

- **Color-to-image matching mechanics** – Match color tiles with the correct image area.
- **GUI using Swing** – Built using Java Swing for a lightweight interface.
- **Progress tracking** – Visual feedback for correct and incorrect attempts.
- **Easy to customize** – Modify or expand color palettes, logic, and UI elements.

---

## 📁 Project Structure

```
coloringApp/
├── app/
│   └── src/
│       ├── Main.java           # Entry point, sets up game window
│       ├── GamePanel.java      # Manages game logic and drawing
│       ├── ColorTile.java      # Handles color tile behavior
│       └── TargetImage.java    # Manages image logic and click detection
├── build.gradle                # Gradle build script
├── gradlew / gradlew.bat       # Gradle wrapper scripts
├── settings.gradle             # Gradle settings
└── README.md                   # This file
```

---

## 🚀 Getting Started

### ✅ Prerequisites

- Java JDK 8 or higher
- Gradle (or use the included Gradle wrapper)

### ▶️ Run the Game

To run using the Gradle wrapper:

```bash
./gradlew run
```

Or, if you have Gradle installed:

```bash
gradle run
```

---

## 🎮 How to Play

1. Colored tiles appear at the bottom of the screen.
2. A main image is shown with areas to be filled.
3. Click a tile, then click on a matching area in the image.
4. Correct matches will fill the image; incorrect ones are ignored.
5. Complete the image by matching all colors correctly!

---

## 🛠 Customization

You can modify the game logic or assets:

- 🎨 **Add new colors** in `ColorTile.java`
- 🖼️ **Swap out the main image** in `TargetImage.java`
- 🧠 **Add scoring or timer logic** in `GamePanel.java`
- 🌈 **Enhance visuals** with animations or switch to JavaFX

---

## 🧠 Developer Notes

- Written in pure Java with no external dependencies.
- Uses `JFrame`, `JPanel`, and Java2D for rendering and input.
- Color matching is done via pixel comparison logic in `TargetImage.java`.

---

## 📄 License

This project is open-source and available under the **MIT License**.  
See the [LICENSE](LICENSE) file for details.

---

## 🙋 Contact

Created by **Snafuzila** in 2020.  
Questions, suggestions, or improvements?  
Feel free to [open an issue](https://github.com/Snafuzila/coloringApp/issues) or submit a PR!
