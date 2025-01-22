# 📖 Proyecto Gutendex: ¡Gestor de Libros! 🌟

¡Bienvenido al **Proyecto Gutendex**! 🎉 Este es un emocionante gestor de libros que utiliza la API de Gutendex para buscar libros, guardar información en una base de datos 📚, y ofrecer varias funcionalidades a través de un menú interactivo. 🚀

---

## 🛠️ **Características del Proyecto**
1⃣ **Buscar libros por título:** Encuentra libros en la API de Gutendex y guárdalos en la base de datos. 🤔🔍  
2⃣ **Listar libros registrados:** Consulta los libros que ya has almacenado. 📋✨  
3⃣ **Listar autores registrados:** Obtén una lista de todos los autores que aparecen en tus libros. ✍️👩‍💻  
4⃣ **Listar autores vivos en un año específico:** Filtra autores por su año de vida. 🎂📆  
5⃣ **Listar libros por idioma:** Explora tus libros organizados por idioma. 🌐📚  
6⃣ **Salir:** Finaliza el programa cuando termines de gestionar tus libros. 👋💻

---

## ⚙️ **Cómo Configurar y Ejecutar**
1. **Clona el repositorio:**  
   ```bash
   git clone https://github.com/tu-usuario/proyecto-gutendex.git
   cd proyecto-gutendex
   ```

2. **Configura las dependencias:**  
   Asegúrate de tener un archivo `pom.xml` con las siguientes dependencias:
   - Spring Boot Starter Data JPA
   - Spring Boot Starter Web
   - Driver de tu base de datos (ejemplo: MySQL, PostgreSQL, H2)

3. **Configura la base de datos:**  
   En `src/main/resources/application.properties`, coloca los detalles de conexión a tu base de datos:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/literatura
   spring.datasource.username=usuario
   spring.datasource.password=contraseña
   spring.jpa.hibernate.ddl-auto=update
   ```

4. **Ejecuta el programa:**  
   Inicia la aplicación desde la clase `BookApplication.java`. 🚀  

5. **Disfruta del menú interactivo:**  
   Sigue las opciones del menú en consola y administra tu biblioteca personal. 🎉

---

## 🔥 **Tecnologías Utilizadas**
- **Java** ☕  
- **Spring Boot** 🌱  
- **API Gutendex** 🔗  
- **JPA/Hibernate** 📊  
- **MySQL (o tu base de datos preferida)** 🟢️  

---

## 🤝 **Contribuciones**
¡Este proyecto siempre está abierto a mejoras! 💡  
Si deseas contribuir:  
1. Haz un fork del repositorio. 🏴  
2. Crea una rama con tu mejora: `git checkout -b mi-mejora`. 🌿  
3. Envía un pull request. 🚀  

---


## 📢 **Licencia**
Este proyecto está bajo la Licencia MIT. 📜  
¡Siéntete libre de usarlo y mejorarlo como prefieras! 🙌  

---

¡Gracias por visitar este repositorio! 💿✨  


¿Te gusta? ¡Pulsa una estrella ⭐ en GitHub para apoyar el proyecto! 🎉

