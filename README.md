# WordCounter — Compteur de Mots

> Exercice 3 — Chapitre 06 : Programmation Orientée Objet en Java  
> LPRGL3B

---

## Description

Programme Java qui **lit un fichier texte** et affiche des statistiques :
nombre total de mots, de lignes, de lignes vides, et la moyenne de mots par ligne.

---

## Fonctionnalités

- Lecture d'un fichier texte via `Scanner` + `File`
- Comptage des mots par ligne avec `split("\\s+")`
- Gestion des lignes vides (ignorées dans le comptage)
- Calcul de la moyenne de mots par ligne non vide
- Gestion robuste de l'exception `FileNotFoundException`

---

## Structure du projet

```
WordCounter/
├── src/
│   └── Main.java   # Programme principal
├── texte.txt       # ← Placez ici le fichier à analyser
└── README.md
```

> **Important** : le fichier `texte.txt` doit être à la racine du projet,  
> **pas** dans le dossier `src`.

---

## Prérequis

| Outil    | Version minimale |
|----------|-----------------|
| Java JDK | 21              |
| IntelliJ | toute version   |

---

## Comment exécuter

### Avec IntelliJ IDEA
1. Ouvrir IntelliJ → **File > Open** → sélectionner `WordCounter`
2. Placer votre fichier texte à la **racine du projet** (pas dans `src`)
3. Clic droit sur `Main.java` → **Run 'Main.main()'**

### Avec le terminal
```bash
# Depuis la racine du projet (là où se trouve texte.txt)
cd src
javac Main.java
cd ..
java -cp src Main
```

---

## Exemple de sortie

```
=== Compteur de mots ===
Fichier analysé : texte.txt
------------------------
Lignes totales    : 13
Lignes non vides  : 11
Lignes vides      : 2
------------------------
TOTAL DE MOTS     : 97
Mots / ligne      : 8.8
```

---

## Pourquoi `split("\\s+")` plutôt que `split(" ")` ?

| Délimiteur  | Comportement                                      |
|-------------|--------------------------------------------------|
| `" "`       | Coupe uniquement sur **un seul** espace → crée des mots vides si plusieurs espaces consécutifs |
| `"\\s+"`    | Coupe sur **un ou plusieurs** espaces/tabulations → résultat propre dans tous les cas |

---

## Tests effectués

| Fichier de test          | Résultat attendu         |
|--------------------------|--------------------------|
| Fichier normal           | Compte correct           |
| Lignes avec doubles espaces | Pas de mots vides     |
| Lignes vides             | Ignorées dans le compte  |
| Fichier inexistant       | Message d'erreur clair   |

---

## Auteur

Étudiant AKAKPO CHRISTIAN LPRGL3B
