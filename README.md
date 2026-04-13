# Gestor de Notas

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)

<img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExNm10aWNsMXpxenRhd2Z6bGluY3Q1bHYxYmI4dW5pOWpza3h2aTBrayZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/ZVik7pBtu9dNS/giphy.gif" width="300"/>

**Alumna:** Daftne Abigeyns Gomez Sumoza

---

## ¿De qué va esto?

Una pequeña app de consola en Java para gestionar notas. Nada del otro mundo, pero el objetivo real era practicar Git con ramas, merges y resolución de conflictos — y eso sí se nota en el historial.

---

## Ramas creadas

| Rama                         | Qué se hizo                                                           |
| ---------------------------- | --------------------------------------------------------------------- |
| `main`                       | Rama principal, recibe todas las integraciones                        |
| `feature-estructura`         | Estructura base: clases `Nota`, `GestorNotas` y `Main`                |
| `feature-alta-notas`         | Funcionalidad para crear notas desde consola                          |
| `feature-validacion-alta`    | Mejoras al alta: validaciones de campos vacíos y respuestas inválidas |
| `feature-listado`            | Listar todas las notas con sus datos                                  |
| `feature-filtro-importancia` | Filtrar y mostrar solo las notas marcadas como importantes            |

El flujo fue progresivo: cada rama nació de la anterior o de `main` según tocaba, y se fusionó en orden.

---

## El conflicto

En la fase 11 se modificó la misma línea del menú en dos ramas a la vez (`main` y `feature-listado`), cada una con un texto distinto. Al intentar fusionar, Git no supo cuál quedarse y marcó el conflicto.

La resolución fue manual: se abrió el archivo, se compararon las dos versiones enfrentadas y se eligió una cabecera nueva:

```
=== GESTOR DE NOTAS - VERSION FINAL ===
```

---

## Funcionalidad final

- Crear notas con título, contenido e indicador de importancia
- Validación de campos: no se permiten vacíos ni respuestas fuera de `s/n`
- Listar todas las notas
- Listar solo las notas importantes
