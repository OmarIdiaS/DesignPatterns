# DesignPatterns

## DP - Strategy

    Catégorie : Comportement
#####
    Objectifs :
- Définir une famille d’algorithmes, et encapsuler chacun et les rendre interchangeables 
tout en assurant que chaque algorithme puisse évoluer 
indépendamment des clients qui l’utilisent.

## DP - Observer 
    Catégorie : Comportement
#####
    Définition : 
- Le pattern Observer définit une relation entre 
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
    Définition: 
- Le pattern Décorateur attache dynamiquement des responsabilités supplémentaires (Ingrédients) à un objet (Desset/Boisson).
Il fournit une altérnative souple à la dérivation, pour étendre les fonctionnalités.

/!\ On peut résoudre le problème seulement avec l'héritage, mais ce dernier est statique.
#####  
    Résultat: 
- Le Dessign pattern permet d'isoler les responsabilités d'un objet.


## DP - Composite
    Catégorie: Structure
#####
    Objectif:
 - Organiser les objets en structure arborescente afin de présenter une hiérarchie.
 - Permettre à la partie cliente de manipuler un objet unique et un objet composé de la même manière.
 ####
    Résultat:
- Le design pattern permet d'isoler l'appartenance à un agrégat.
####
    Exemples:
- Un dossier peut contenir des fichiers ou des dossiers.
- Une forme peut être soit un rectangle, un cercle, une ligne ou un groupe de formes.


## DP - Adapter
    Catégorie: Structure
#####
    Objectif:
- Convertir l'interface d'une classe dans une autre interface comprise par la partie cliente.
- Permettre à des classes de fonctionner ensemble, ce qui n'auraient pas été possibles à cause de leurs interfaces incompatibles.
#####
    Résultat:
- Le Design pattern permet d'isoler l'adaptation d'un sous-système.
#####
    /!\ Ce pettern peut être utiliser soit par héritage (non recomandé) soit par composition.
#####
    Exemple:
- Imaginez que vous arrivez le jour de votre présentation de thèse, 
et vous trouvez que le projecteur (Client) n'as qu'un port vga (OldImplementation), 
alors que votre ordinateur il as de l'usb-c comme port, donc vous aurez besoin d'utiliser un Adaptateur (Adapter) afin de valider votre matière :) . 

## DP - Template Method
    Catégorie: Comportement
#####
    Objectif du pattern:
- Définir la squelette d'un algorithme en délégant certaines étapes à des sous-classes.
#####
    Résultat: 
- Le DP permet d'isoler les parties variables d'un algorithmes.
#####
    Raison d'utilisation:
- Une classe possède un fonctionnement global, mais les détails de son algorithmes doivent être spécifiques à des sous-classes.
