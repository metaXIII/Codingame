Nous recevons en entrée plusieurs lignes concernant la largeur des lettres, leurs hauteurs, la lettre ou mot à afficher en ASCII puis l'alphabet + le '?' pour l'afficher pour les caractères non imprimables.

Pour la suite, J'ai crée un tableau contenant chacune de mes rows afin de les retrouver plus facilement.

Pour un soucis de praticité, j'ai également décidé de mettre le mot directement en Uppercase

Nous parcourons ensuite selon la longueur du mot, à l'intérieur de chaque ligne pour chaque lettre, nous vérifions son ordre dans le tableau ascii [disponible ici](https://www.asciitable.com/) 

Pour rappel, dans ce tableau, les lettres A ET Z commencent et terminent respectivement par 65 et 90, donc pour retrouver la position de ma lettre en fonction de ma ligne.
Ainsi, le mot 'E' donne le résultat suivant : 

```
char el = 'E';
(int) el ;//69
```
On effectue l'opération : 

```
69 - 65 //4
```

Enfin pour trouver la position de lettre dans le tableau fourni dans la row, il nous suffit d'effectuer une substring de mon élement en démarrant à la position * largueur de ma lettre (pour éviter les lettres précédantes) jusqu'à la position de ma (lettre * la largeur) + la largeur afin de récupérer la fin de mon élément.

Pour le point d'intérrogation pour les caractères non imprimables, il faut utiliser la formule de position - 37 pour aller directement au 27 élement de ma row fourni en paramètres.
