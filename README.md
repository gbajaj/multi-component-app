# Multi Components

An Android application demonstrating a modular UI component system built with Jetpack Compose and Dagger Hilt.

## 📱 Overview

This project showcases a flexible architecture where UI components can be dynamically enabled/disabled and reordered. The app features a toggleable component system that allows users to control which components are displayed on the main screen.

## ✨ Screenshots

<p float="left">
	<img width="300" alt="all" src="https://github.com/user-attachments/assets/fd7a2bb1-6984-4fb5-a5b7-2b089e5c2672" />
	<img width="300"  alt="no-footer" src="https://github.com/user-attachments/assets/c98f1bc5-482b-4ee9-8bda-8e53dde841c2" />
	<img width="300" alt="no-header" src="https://github.com/user-attachments/assets/29e76bd1-e24b-448d-bf7f-ab9f199be5ff" />
	<img width="300"  alt="no-news" src="https://github.com/user-attachments/assets/7a1bdff6-2391-4de9-9936-a3fe931e6c7e" />
	<img width="300"  alt="no-profile" src="https://github.com/user-attachments/assets/a1640f96-df8c-4b32-a85c-57c82e9518b4" />
	<img width="300"  alt="no-stats" src="https://github.com/user-attachments/assets/d13288d1-b910-458d-a76a-d26a8da4b362" />
</p>

## ✨ Features

- **Dynamic Component System**: Toggle UI components on/off using filter chips
- **Ordered Components**: Components are displayed in a predefined order  
- **Modular Architecture**: Clean separation of concerns with dependency injection
- **Modern UI**: Built with Jetpack Compose and Material 3 design

## 🏗️ Architecture

The project follows a clean architecture pattern with:

- **UI Components**: Modular components implementing the `UIComponent` interface
- **Dependency Injection**: Dagger Hilt for managing dependencies
- **MVVM Pattern**: ViewModel for managing UI state and business logic
- **Compose Navigation**: Modern navigation setup

## 🧩 Components

The app includes several pluggable components:

- Header Component
- Profile Component  
- Stats Component
- News Component
- Footer Component

Each component implements the `UIComponent` interface with:

- `name`: Component identifier
- `order`: Display order priority
- `Content()`: Composable UI function

## 🛠️ Tech Stack

- **Kotlin** - Programming language
- **Jetpack Compose** - Modern UI toolkit
- **Dagger Hilt** - Dependency injection
- **Android Architecture Components** - ViewModel, etc.
- **Material 3** - Design system

## 🚀 Getting Started

### Prerequisites

- Android Studio Arctic Fox or newer
- JDK 8 or higher
- Android SDK 21+

### Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```

2. Open the project in Android Studio

3. Sync project dependencies

4. Run the app on an Android device or emulator

## 📁 Package Structure

```
com.gauravbajaj.pluggableComponents/
├── di/                  # Dependency injection modules
├── ui/
│   ├── components/      # UI components
│   ├── screens/         # Screen composables
│   ├── theme/           # App theming
│   └── viewmodel/       # ViewModels
└── MainActivity.kt      # Entry point
```

## 🎯 Usage

1. Launch the app
2. Use the filter chips at the top to toggle components on/off
3. Selected components will be displayed in the main screen area
4. Components maintain their predefined order when enabled

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

1. Fork the project
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

## 📞 Contact

Gaurav Bajaj - [@gbajaj](https://github.com/gbajaj)

Project Link: [https://github.com/gbajaj/multi-component-app](https://github.com/gbajaj/multi-component-app)