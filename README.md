# Présentation du programme
Calcul de relations spatiales directionnelles à partir de l’histogramme d’angles dans une image en 2D.
# Contexte
- Les relations spatiales directionnelles sont des concepts clés en géométrie et en analyse
multi-dimensionnelle. Elles jouent un rôle crucial dans de nombreux domaines de la recherche,
notamment la reconnaissance d'image où elles sont utilisées pour déterminer la position relative des
objets dans une image. Cela peut inclure la détection d'objets spécifiques dans une image, tels que des
véhicules ou des personnes, et la détermination de leur position relative les uns par rapport aux autres.
Leur compréhension approfondie peut donc aider à résoudre de nombreux problèmes complexes dans
ces domaines. Par conséquent, la connaissance de ces algorithmes et leur fonctionnement est
intéressante pour les programmeurs.
- Le but du projet L2P2 est de créer une simulation permettant de calculer les relations spatiales entre 2
objets flous ou points afin de pouvoir interpréter et analyser des images précises.
Cela sera fait via 2 méthodes qui sont celles du barycentre et une autre qui sera l'étude des angles via
des paires de points des 2 objets de l’image et un dressage d’histogramme de ces angles.
- Ce projet de recherche est basé sur les recherches de Koji Miyajima et Anca Ralescu dans leur article "Spatial
Representation organization in 2D segmented images: and recognition of primitive spatial relations" 
# Méthodes
## La méthode du Barycentre
- La méthode du Barycentre ne prend en compte que le centre de gravité des deux objets.
En effet cette méthode pourrait avoir certains avantages notamment pour des images dans
lesquelles les deux objets sont très éloignés, dans ce cas-là, cette méthode qui est peu
coûteuse pourra nous donner un résultat précis. Cependant, pour des images dans lesquelles
les objets sont très proches ou ont des formes quelconques, le résultat ne sera pas précis, voire
même faussé. On peut par exemple avoir des résultats aberrants pour des objets décomposés
en plusieurs zones séparées. C’est pour cela que nous utilisons la méthode des paires de
points qui nous donnera un résultat précis dans plus de situations
## La méthode des paires de points
- Si l’utilisateur choisit la méthode des paires de points, un histogramme d’angles sera
fourni en plus de l'ensemble des résultats obtenus sur les relations spatiales entre les deux
objets. Ainsi, il pourra choisir le pas de cet histogramme(entre 1 et 360).
Si l’utilisateur choisit la méthode du barycentre, on a juste l’angle entre les 2 objets.
Le résultat sera facilement interprétable en regardant les angles qui ont le plus de
valeurs.
L’histogramme est une collection d’angles allant de 1 à 360 et via une double boucle sur
les angles de chaque point de l’objet. Via cela, on ajoute pour chaque angle dans un point la
valeur dans l’histogramme. Cela va marcher comme un compteur pour chaque indice de
l’histogramme.
Nous utilisons la formule de l'arc tangente à deux arguments, qui est une fonction
mathématique couramment utilisée en programmation pour calculer l'angle entre l'axe des x
positifs et une ligne passant par l'origine et un point donné dans le plan cartésien. Ici on s’en
sert pour calculer les angles entre les points, pour la méthode du barycentre et le calcul de
l’histogramme.
Formule: arctan(y/x)*(180/π)
# Résultats finaux
- Le résultat final du projet est satisfaisant, des options ont même pu être ajoutées telles que le
lancement via un terminal et via des arguments, une création d’un histogramme ainsi que sa
sauvegarde d' un fichier.
Les difficultés résidaient principalement dans les affichages graphiques pour les objets et la création de
l’histogramme, ces affichages sont conformes à ce qui était voulu, en plus de cela le pas de notre
histogramme est modulable.
# Installation du logiciel
## Installation de logiciels tiers nécessaires
- Pour notre projet, nous n'utilisons aucun logiciel spécifique, si ce n’est le cas de l’invite
de commandes (cmd.exe) et le Java Development Kit (JDK) qui permet le lancement
du code JAVA, que vous pouvez installer via le lien suivant qui explique les étapes à
suivre :
https://docs.oracle.com/en/java/javase/19/install/installation-jdk-microsoft-windows-pla
tforms.html#GUID-DAF345BA-B3E7-4CF2-B87A-B6662D691840
Cependant, si vous souhaitez juste ouvrir un exécutable .jar , il vous faut en votre
possession la dernière version du Java Runtime Environment (JRE) que vous
pouvez installer via le lien suivant :
https://www.java.com/fr/download/manual.jsp
À noter qu’il faut avoir au minimum la version:
java version "20" 2023-03-21
Java(TM) SE Runtime Environment (build 20+36-2344)
Java HotSpot(TM) 64-Bit Server VM (build 20+36-2344, mixed mode,
sharing)
## Installation du programme
- Une fois l'application obtenue, il est nécessaire de l'extraire à l'aide d'un logiciel
spécialisé (ex: WinRAR, WinZIP...).
Une fois cela fait, aucune autre action n'est nécessaire, il suffit de lancer l'exécutable le
WindowsLauncher.bat sur Windows ou sinon de lancer directement l’application via
un terminal en étant dans le répertoire de l'application et en tapant “java -jar
Projet_L2P2.jar” directement pour profiter pleinement de l'application.
Veuillez-vous référer au Manuel d’utilisation pour plus de détails sur l’utilisation de
l’application.

# Utilisation du logiciel

- Les étapes pour l'utilisations sont détaillés dans le manuel d'utilisation dans la Documentation utilisateur
