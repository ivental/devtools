# Quick Start
1. Открыть View → Tool Windows → Gradle.
2. В дереве задач выбрать Tasks → application → run, Tasks → build → build или Tasks → verification → test, запускать двойным кликом.
3. Альтернативно можно использовать Ctrl + Ctrl (Run Anything) и ввести gradle run или gradle test — IDEA выполнит команду без терминала.

# Packages и для чего они нужны

без пакетов два класса с одинаковым именем
столкнутся при импорте, и компилятор не сможет различить их. 
Пакет создаёт уникальную область видимости; 
правило обратного доменного имени 
гарантирует глобальную уникальность, 
так как доменное имя зарегистрировано владельцем.

# Таблица переменных/полей

String menteeName - имя студена.

int sprintNumber - номер спринта.

int plannedHoursPerWeek - запланированное количество часов на спринт в неделю.

public boolean readyForSprint() - метод-ответ "готов ли студент к спринту?", возвращает "true/false(правда ложь)".

# Ссылка на урок
https://mentee-power.xl.ru/learn/MCIneBj4KkyH-GIRCspFvA/tasks


# Git локальный цикл
Проверить интеграцию Git: IntelliJ IDEA → VCS → Enable Version Control Integration → Git. Settings Ctrl+Alt+S → Version Control → Git → указать путь к исполняемому файлу → Test.
Настроить пользователя: в терминале выполнить 
git config --global user.name "Имя Фамилия", 
git config --global user.email "student@example.com". 
Для проверки — git config --list | grep user..
Инициализировать репозиторий и правило веток: 
Project → правый клик по корню → Git → Initialize Repository.
Добавить .gitignore. 

# Правило веток: feature/DVT-X
Создать ветку feature/DVT-Х: 
Git Branches popup → New Branch → feature/DVT-3 → «Checkout». 
Для проверки выполнить git branch --show-current (ожидаем feature/DVT-Х).

