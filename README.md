<div align="center">

# 🧱 Brick Breaker

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)](https://www.jetbrains.com/idea/)

*A classic arcade game built from scratch in Java, featuring a custom-coded mathematical collision detection system.*

</div>

## 🎮 Gameplay Preview

<div align="center">
  <img width="50%" height="50%" alt="brick_breaker" src="https://github.com/user-attachments/assets/58deee12-2c8b-4848-8181-3e6464f60294" />
</div>

---

## 📖 About The Project

This project is a recreation of the classic "Breakout" or "Arkanoid" style game, developed as a desktop application using Java. The player controls a paddle at the bottom of the screen to bounce a ball upward, aiming to destroy a formation of bricks.

The standout technical feature of this project is its custom physics and collision engine. Instead of relying on a pre-built game engine, the game manually calculates spatial overlaps. 

### ✨ Technical Highlights
*   **Custom Box Colliders:** The game utilizes a mathematical approach to collision detection (Axis-Aligned Bounding Box - AABB). It continuously tracks and compares the X/Y coordinates, width, and height of the ball, paddle, and bricks to determine physical intersections in real-time.
*   **Live Tracking:** The console actively tracks and logs the remaining number of bricks on the board during gameplay.
*   **Smooth Rendering:** Built using standard Java libraries, ensuring smooth movement and immediate response to player inputs.

---

## ⌨️ Controls

*   **Left Arrow (←):** Move the paddle to the left.
*   **Right Arrow (→):** Move the paddle to the right.

---

## ⚙️ Installation & Execution

To run this project locally, you need the **Java Development Kit (JDK)** and **IntelliJ IDEA**.

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/AirNicolas54382/Brick_breaker
    ```
2.  Launch **IntelliJ IDEA**.
3.  Open the downloaded project folder.
4.  Navigate to the `src` folder in the Project Explorer.
5.  Right-click your main class file and select **▶ Run**.

---

## 👤 Author

*   **GitHub:** [AirNicolas54382](https://github.com/AirNicolas54382)
