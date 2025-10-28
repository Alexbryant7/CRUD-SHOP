# 🌾 Cultivus

Sistema de gestión inteligente de inventario desarrollado con Spring Boot y Thymeleaf.

## 📋 Descripción

Cultivus es una aplicación web que permite gestionar un inventario de productos de forma simple y eficiente. Ofrece funcionalidades completas de CRUD (Crear, Leer, Actualizar, Eliminar) con una interfaz moderna y responsive.

## ✨ Características

- 📦 **Gestión completa de productos**: Agregar, editar, visualizar y eliminar productos
- 🖼️ **Soporte para imágenes**: Cada producto puede tener una imagen mediante URL
- 💰 **Control de precios**: Gestión de precios con formato decimal
- 📱 **Diseño responsive**: Interfaz adaptable a diferentes dispositivos
- 🎨 **UI moderna**: Diseño profesional con paleta de colores atractiva
- ⚡ **Gestión en memoria**: Sistema de almacenamiento temporal sin base de datos

## 🛠️ Tecnologías Utilizadas

- **Backend**:
  - Java
  - Spring Boot
  - Spring MVC
  - Thymeleaf (motor de plantillas)

- **Frontend**:
  - HTML5
  - CSS3
  - JavaScript (mínimo)

## 📁 Estructura del Proyecto

```
demo/
├── src/
│   ├── main/
│   │   ├── java/com/example/demo/
│   │   │   ├── DemoApplication.java          # Clase principal
│   │   │   ├── controller/
│   │   │   │   └── ControllerStock.java      # Controlador MVC
│   │   │   ├── model/
│   │   │   │   └── Producto.java             # Modelo de datos
│   │   │   └── service/
│   │   │       └── ServiceStock.java         # Lógica de negocio
│   │   └── resources/
│   │       ├── static/
│   │       │   └── css/
│   │       │       └── style.css             # Estilos
│   │       └── templates/
│   │           ├── index.html                # Vista principal
│   │           └── productForm.html          # Formulario de productos
```

## 🚀 Instalación y Ejecución

### Requisitos Previos

- Java 11 o superior
- Maven 3.6+

### Pasos para ejecutar

1. **Clonar el repositorio**
   ```bash
   git clone <url-del-repositorio>
   cd demo
   ```

2. **Compilar el proyecto**
   ```bash
   mvn clean install
   ```

3. **Ejecutar la aplicación**
   ```bash
   mvn spring-boot:run
   ```

4. **Acceder a la aplicación**
   
   Abrir el navegador en: `http://localhost:8080`

## 📖 Uso

### Listar Productos
- La página principal muestra todos los productos en formato de tarjetas
- Cada tarjeta incluye imagen, nombre, descripción, precio y acciones

### Agregar Producto
1. Hacer clic en "Agregar Producto"
2. Completar el formulario con los datos del producto:
   - Nombre
   - Descripción
   - Precio
   - URL de la imagen (opcional)
3. Hacer clic en "Crear Producto"

### Editar Producto
1. Hacer clic en "✏️ Editar" en la tarjeta del producto
2. Modificar los campos deseados
3. Hacer clic en "💾 Actualizar Producto"

### Eliminar Producto
1. Hacer clic en "🗑️ Eliminar" en la tarjeta del producto
2. Confirmar la eliminación en el diálogo

## 🎨 Características del Diseño

- **Colores principales**: 
  - Primario: `#C85A3A` (terracota)
  - Secundario: `#6B9F2E` (verde)
- **Tipografía**: Segoe UI, Tahoma, sans-serif
- **Efectos**: Transiciones suaves, hover effects, sombras sutiles
- **Grid responsive**: Adaptación automática según el tamaño de pantalla

## ⚠️ Notas Importantes

- Los datos se almacenan en memoria, por lo que se pierden al reiniciar la aplicación
- El ID inicial de los productos comienza en: `43386442`
- Las imágenes se cargan mediante URLs externas
- Si una imagen no carga, se muestra un placeholder por defecto

## 🔮 Mejoras Futuras

- [ ] Integración con base de datos (MySQL/PostgreSQL)
- [ ] Búsqueda y filtrado de productos
- [ ] Categorización de productos
- [ ] Control de stock/inventario
- [ ] Sistema de autenticación
- [ ] API REST para integración con otros sistemas
- [ ] Subida de imágenes local


## 📄 Licencia

Este proyecto es de código abierto y está disponible bajo la licencia MIT.

---

Desarrollado con ❤️ usando Spring Boot
