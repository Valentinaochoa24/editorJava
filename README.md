# Editor de Texto con Undo/Redo – Pilas en Java

## 📋 Objetivo del Proyecto
Desarrollar un editor de texto simple en consola que permita **escribir texto**, **deshacer (Undo)** y **rehacer (Redo)** utilizando **pilas** implementadas manualmente en Java.  
El proyecto es parte de la actividad EA2 para reforzar el concepto de **estructura de datos tipo pila (Stack)**, así como el trabajo colaborativo con **GitHub**.

---

## 🧠 Características Principales
- **Escribir texto**: Permite ingresar nuevas líneas desde la consola.
- **Deshacer (Undo)**: Revierte la última línea escrita usando una pila principal.
- **Rehacer (Redo)**: Restaura una acción previamente deshecha utilizando una pila secundaria.
- **Visualizar texto actual**: Muestra el contenido en la cima de la pila mediante `peek()`.
- **Menú interactivo en consola**: Fácil navegación con opciones claras.
- **Implementación manual de pila**: Incluye `push()`, `pop()`, `peek()` e `isEmpty()`, sin usar colecciones de Java predefinidas.

---

## 🛠️ Tecnologías Utilizadas
- **Lenguaje:** Java 8+
- **IDE recomendado:** IntelliJ IDEA / Eclipse / VS Code (con extensión de Java)
- **Control de versiones:** Git + GitHub
- **Sistema Operativo:** Multiplataforma (Windows/Linux/Mac)

---

## 🚀 Instrucciones de Ejecución

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/tu-usuario/editor-undo-redo-java.git
   cd editor-undo-redo-java
