# Maze Solver

Es soll ein rekursiver Algorithmus entwickelt werden, der ein Labyrinth lösen kann.

```
#######
#   # E
# #   #
#  ####
## ####
#  ####
#S#####
```

S: Start
E: Ende
#: Wand

Folgende Restriktionen gelten für das Labyrinth:

- Man kann nur horizontal oder vertikal navigieren. Nicht diagonal.
- Zurückgegeben werden soll ein Pfad (Array von Punkten)

## Datenstrukturen

### Point

besteht aus einer x und y coordinate

### Maze

Ein zweidimensionales quadratisches Array bestehend aus einzelnen Zeichen (char).

### Path

Eine ArrayList, welche die Punkte von Start nach Ende enthält.
