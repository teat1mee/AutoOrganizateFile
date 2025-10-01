AutoOrganizateFile — Автоматический организатор файлов 

Описание:
Простая Java-программа, которая сортирует файлы из папки "Загрузки" (Downloads) 
по категориям: изображения, документы и архивы, и перемещает их в соответствующие 
системные папки. Работает на Windows, Linux и macOS. 

Поддерживаемые форматы: 

    Изображения: .png, .jpg, .jpeg, .gif
    Документы: .doc, .txt
    Архивы: .zip, .tar, .jar, .rpm
     

Важно для Linux-пользователей:
Если у вас русская локализация системы, системные папки могут называться 
по-русски: "Загрузки", "Изображения", "Документы". 
Убедитесь, что пути в коде соответствуют реальным именам папок на вашем компьютере. 

Как запустить: 

    Убедитесь, что установлен Java (версия 8 или новее).
    Откройте терминал в папке с файлом AutoOrganizateFile.java.
    Скомпилируйте программу:
       javac AutoOrganizateFile.java
    Запустите программу (обратите внимание — без расширения .java!):
       java AutoOrganizateFile
    Следуйте инструкциям в консоли. Программа предложит создать недостающие папки.
     

Структура папок (пример для Linux с русской локалью):
/home/ваше_имя/
├── Загрузки/        ← отсюда берутся файлы
├── Изображения/     ← сюда перемещаются картинки
├── Документы/       ← сюда — документы
└── Архивы/          ← сюда — архивы 

Советы: 

    Не запускайте программу как "java AutoOrganizateFile.java" — это неверно.
    Правильно: "java AutoOrganizateFile".
    Если программа пишет "folder not found", проверьте реальное имя папки 
    с помощью команды: ls /home/ваше_имя/
    Для автоматического запуска можно использовать cron (Linux/macOS) 
    или Планировщик заданий (Windows).
     

Лицензия: Open Source — используйте и модифицируйте свободно. 

----------------------------------------------------------------------------

AutoOrganizateFile — Automatic File Organizer 

Description:
A simple Java program that sorts files from the Downloads folder
into categories: images, documents, and archives, and moves them to the appropriate
system folders. It runs on Windows, Linux and macOS. 

Supported formats: 

    Images: .png, .jpg, .jpeg, .gif
Documents: .doc, .txt
Archives: .zip, .tar, .jar, .rpm
     

Important for Linux users:
If you have a Russian localization of the system, the system folders can be called 
in Russian: "Downloads", "Images", "Documents". 
Make sure that the paths in the code correspond to the actual folder names on your computer. 

How to launch: 

    Make sure that Java (version 8 or later) is installed.
    Open the terminal in the file folder AutoOrganizateFile.java .
    Compile the program:
javac AutoOrganizateFile.java
    Run the program (please note — without the extension .java!):
       java AutoOrganizateFile
    Follow the instructions in the console. The program will prompt you to create the missing folders.
     

Folder structure (example for Linux with a Russian locale):
/home/your_name/
├── Downloads/        , this is where the files come from
,── Images/     , images are moved here
,── Documents/       , here are the documents
,── Archives/          , here — archives 

Recommendations: 

    Do not run the program as "java AutoOrganizateFile.java" is incorrect.
    That's right: "java AutoOrganizateFile".
    If the program says "folder not found", check the real folder name. 
    using the command: ls /home/your_name/
    You can use cron (Linux/macOS)
or the Task Scheduler (Windows) to start automatically.
     

License: Open Source — use and modify freely.
