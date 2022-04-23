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


## DP - Decorator
Catégorie: Structure
#####
Définition: Le pattern Décorateur attache dynamiquement des responsabilités supplémentaires (Ingrédients) à un objet (Desset/Boisson).
Il fournit une altérnative souple à la dérivation, pour étendre les fonctionnalités.

/!\ On peut résoudre le problème seulement avec l'héritage, mais ce dernier est statique.
#####
Résultat: Le Dessign pattern permet d'isoler les responsabilités d'un objet.
