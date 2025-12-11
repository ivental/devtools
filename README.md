## Quick Start
1. Открыть View → Tool Windows → Gradle.
2. В дереве задач выбрать Tasks → application → run, Tasks → build → build или Tasks → verification → test, запускать двойным кликом.
3. Альтернативно можно использовать Ctrl + Ctrl (Run Anything) и ввести gradle run или gradle test — IDEA выполнит команду без терминала.

## Packages и для чего они нужны

без пакетов два класса с одинаковым именем
столкнутся при импорте, и компилятор не сможет различить их. 
Пакет создаёт уникальную область видимости; 
правило обратного доменного имени 
гарантирует глобальную уникальность, 
так как доменное имя зарегистрировано владельцем.

## Таблица переменных/полей

String menteeName - имя студена.

int sprintNumber - номер спринта.

int plannedHoursPerWeek - запланированное количество часов на спринт в неделю.

public boolean readyForSprint() - метод-ответ "готов ли студент к спринту?", возвращает "true/false(правда ложь)".

## Ссылка на урок
https://mentee-power.xl.ru/learn/MCIneBj4KkyH-GIRCspFvA/tasks


## Git локальный цикл
Проверить интеграцию Git: IntelliJ IDEA → VCS → Enable Version Control Integration → Git. Settings Ctrl+Alt+S → Version Control → Git → указать путь к исполняемому файлу → Test.
Настроить пользователя: в терминале выполнить 
git config --global user.name "Имя Фамилия", 
git config --global user.email "student@example.com". 
Для проверки — git config --list | grep user..
Инициализировать репозиторий и правило веток: 
Project → правый клик по корню → Git → Initialize Repository.
Добавить .gitignore. 

## Правило веток: feature/DVT-X
Создать ветку feature/DVT-Х: 
Git Branches popup → New Branch → feature/DVT-3 → «Checkout». 
Для проверки выполнить git branch --show-current (ожидаем feature/DVT-Х).

## Чек поинты

Remote настроен: git remote -v совпадает с тем, что указано в IDE.

Master опубликован: ветка origin/master показывается в IDE и на GitHub.

PR feature/DVT-3 смёржен: статус merged, ссылка/скрин приложены.

Локальный master синхронизирован: git fetch --all --prune + git pull --ff-only origin master.

Фича‑ветка опубликована: origin/feature/DVT-4 существует; база ветки = origin/master.

PR оформлен: описание + чек‑лист + Evidence Pack; Checks отображаются или задекларированы ручные проверки.


## Чистый Git‑репозиторий

Перед push: git status clean
status clean вводить в терминале.

## Сценарий ручной проверки DVT-7

### Запуск приложения
1. Откройте Gradle Tool Window (View → Tool Windows → Gradle)
2. Выполните: devtools → Tasks → application → run
3. Ожидаемый вывод в Run Tool Window:
   Суммарно: пройдено 25 из 36 уроков, осталось 11 уроков

### Запуск тестов
1. Откройте Gradle Tool Window
2. Выполните: devtools → Tasks → verification → test
3. Ожидаемый вывод: BUILD SUCCESSFUL, все тесты зелёные

### Отладка через Debug
1. Установите breakpoint на строке цикла while в ProgressTracker.calculateProgress
2. Запустите Debug: кликните правой кнопкой на main → Debug 'ProgressTracker.main()'
3. Используйте Step Over (F8) для прохождения итераций
4. Проверьте Variables: counter, remainingHours должны изменяться корректно
5. Используйте Evaluate Expression (Alt+F8): вычислите remainingLessons * 2
6. Ожидаемый результат Evaluate: 14 (для completedLessons=5, totalLessons=12)

### Что делать при ошибках
- Если вывод некорректен: проверьте логику цикла через Debug
- Если тесты красные: откройте вывод теста, найдите AssertionError, скорректируйте метод
- Если Debug не останавливается: убедитесь, что breakpoint установлен (красный кружок)
