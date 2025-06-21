🎨 Color Matching Game (ColoringApp)
A fun and simple Java-based color-matching game originally created in 2020. This app challenges players to match colors with illustrated objects, reinforcing quick recognition and memorization.

🧩 Features
Color-to-image matching mechanics: Users select a color and attempt to match it with the correct area in an image.

GUI using Swing: Interactive interface with clickable buttons and visual feedback.

Progress tracking: Marks correct and incorrect matches to keep the user informed.

Lightweight and extensible: Designed for easy modification or theme expansion.

📁 Project Structure
pgsql
Copy
Edit
├── app/
│   ├── src/
│   │   ├── Main.java           # Entry point, initializes the game window
│   │   ├── GamePanel.java      # Main game logic and rendering
│   │   ├── ColorTile.java      # Represents a colored tile user can choose
│   │   └── TargetImage.java    # Loads image and checks click vs. tile color
├── build.gradle               # Build configuration
├── gradle/…                   # Gradle wrapper files
├── gradlew / gradlew.bat      # Build/run scripts
└── settings.gradle            # Gradle project settings
🚀 Getting Started
Prerequisites
Java JDK 8 or higher

Gradle (or you can use the provided gradlew wrapper)

Running the Game
From the project root:

bash
Copy
Edit
./gradlew run
This command will compile and launch the game.

🎯 How to Play
A series of colored tiles appear at the bottom of the window.

The main image on the panel shows areas that need coloring.

Select a tile and click on a matching area in the image.

If you're correct, the area highlights; if not, try again.

Continue until all areas are correctly filled.

🛠 Customization & Extensions
Add new color palettes: Modify ColorTile.java or resource lists.

Use different images: See how TargetImage.java loads and processes image assets.

Add scoring/timer: Extend GamePanel.java to track progress and time.

Refactor GUI: Switch from Swing to JavaFX or another toolkit for enhanced visuals.

🧩 Development Notes
All classes use Swing components (JFrame, JPanel, etc.).

Coordinates and image masks define clickable areas—check pixel color detection logic in TargetImage.java.

You can modify the src/ package structure as you scale the game.

📜 License
Distributed under the MIT License. Feel free to fork and enhance!

✉️ Contact
Created by Snafuzila in 2020. Have questions or feedback? Open an issue or submit a pull request!

