###### made by Ivan Erofeev. M3102
# TextHighlighter

Данный плагин для JetBrains IDEA позволяет раскрашивать выделенный код в красный цвет. 

Пользователь выделяет строку кода или несколько строк, нажимает сочетание клаивш alt+h, затем сразу alt+t, от слов h - higlighted, t - text и выделенный код становиться цвета FF0000 (красный)

### Применение
1. Данный плагин может быть полезным для того, чтобы помечать участки кода, которые требуют доработки, при этом не оставляя постоянные комментарии.
2. Красный цвет сразу бросается в глаза и разработчик понимает, что с этим участком кода есть проблема
3. Легко сделать dehiglighter из исходного плагина. для этого нужно скопировать файл highlighter.java и заменить цвет кода на 000000 (белый). Таким образом если участок кода завершен, то мы можем его вернуть из красного в белый
4. Также можно создать библиотеку комбинаций цветов, например alt+h+p (p = purple) alt+h+g (g = green) и т.д. и расскрашивать нужные участки кода в определенные цвета
