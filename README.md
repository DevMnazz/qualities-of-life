# Qualities of Life

A Minecraft Forge mod that adds convenient recipe additions to enhance your gameplay experience.

Originally developed for the MnazzMC server, this mod is now available for everyone to use and enjoy.

## Features

This mod currently adds custom recipes for the **Create mod**, providing convenient alternatives for obtaining common crafting materials:

### Current Recipes
- **Snowballs → White Dye**: Crush snowballs in Crushing Wheels to produce white dye
- **Kelp → Green Dye**:  Crush kelp in Crushing Wheels to produce green dye

## Requirements

- **Minecraft**:  1.20.1
- **Mod Loader**: Forge
- **Dependencies**: 
  - Create Mod (required for recipes to function)
  - Flywheel (dependency of Create)

## Installation

### For Players
1. Download and install [Forge for Minecraft 1.20.1](https://files.minecraftforge.net/)
2. Download the [Create mod](https://www.curseforge.com/minecraft/mc-mods/create) (and Flywheel if not included)
3. Download the latest release of Qualities of Life from the [Releases page](https://github.com/DevMnazz/qualities-of-life/releases)
4. Place all mod JAR files in your `.minecraft/mods` folder
5. Launch Minecraft with the Forge profile

### For Developers
1. Clone this repository:
   ```bash
   git clone https://github.com/DevMnazz/qualities-of-life.git
   ```
2. Open the project in IntelliJ IDEA
3. Let Gradle sync and download dependencies
4. Run the `runClient` configuration to test in development

## Building from Source

To build the mod yourself:

```bash
# Windows
gradlew. bat build

# Mac/Linux
./gradlew build
```

The compiled JAR will be located in `build/libs/`

## Usage

Simply install the mod alongside Create, and the new crushing wheel recipes will automatically be available in-game.  Use JEI (Just Enough Items) to view the recipes.

## Roadmap

- [ ] More recipes
- [ ] Compatibility with additional mods
- [ ] Additional quality-of-life improvements

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contributing

Contributions are welcome! Feel free to: 
- Report bugs by opening an issue
- Suggest new recipes or features
- Submit pull requests with improvements

## Links

- **[Modrinth](https://modrinth.com/mod/mqol)**

## Credits

- **Author**: DevMnazz
- **Original Server**: MnazzMC
- Built with [Minecraft Forge](https://minecraftforge.net/)
- Recipe compatibility with [Create Mod](https://github.com/Creators-of-Create/Create)

## Support

If you encounter any issues or have questions:
- Open an issue on the [GitHub Issues page](https://github.com/DevMnazz/qualities-of-life/issues)
- Visit mnazz.com for more information

---

Made with ❤️ for the Minecraft modding community
