HorrorsFromFog - GitHub-ready package
====================================

This archive is prepared so you can upload it to GitHub and let Actions build the mod for you (no Java/Gradle on your PC required).

Steps to get the compiled .jar via GitHub Actions:
1. Create a GitHub account and a new repository (e.g. HorrorsFromFog).
2. Unzip this archive locally and push the contents to your new repo (or upload via web UI):
   git init
   git add .
   git commit -m "Upload HorrorsFromFog"
   git branch -M main
   git remote add origin https://github.com/YOUR-USERNAME/REPO.git
   git push -u origin main
3. On GitHub, open the Actions tab. The workflow "Build Fabric Mod (install Gradle)" will run automatically.
4. When it completes, open the workflow run and download the artifact named 'horrorsfromfog-jar'. Inside the artifact ZIP you'll find the compiled .jar in build/libs/.
5. Copy the .jar to %appdata%\.minecraft\mods and run Minecraft with Fabric 1.20.1 + Fabric API + Mod Menu + Cloth Config installed.

Notes:
- This project contains textures, sounds, and source placeholders. If the build fails on GitHub I will help debug and adjust the code.
