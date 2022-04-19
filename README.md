# DesignPatterns

## DP - Strategy

Catégorie : Comportement
#####
Objectifs :
Définir une famille d’algorithmes, et encapsuler chacun et les rendre interchangeables 
tout en assurant que chaque algorithme puisse évoluer 
indépendamment des clients qui l’utilisent.

## DP - Observer 
Catégorie : Comportement
#####
Définition : Le pattern Observer définit une relation entre 
les objets de types un à plusieurs, de façon que, 
lorsqu’un objet change d’état, tous ce qui en dépendent 
en soient informés et soient mis à jour automatiquement.

On peut faire sa manipulation avec deux techniques:
#### Méthode POP
L'update pourra être sans paramètre, et fait un getState pour récuperer la valeur du state.

#### Méthode PUSH
On met le state comme paramètre de la méthode update et sans faire du getState(), on aura directement la valeur de state depuis update.
