# Sistema de Gestión de Vehículos y Propietarios - DGT

## Descripción
Este programa implementa un sistema básico de gestión de vehículos y propietarios, simulando una estructura organizativa de la Dirección General de Tráfico (DGT). Permite registrar vehículos, asignarlos a propietarios y gestionar la información de una oficina de tráfico.

## Estructura del Proyecto
El código está organizado en los siguientes paquetes:

### **DGTMODEL**
- **Vehiculo**: Clase base que representa un vehículo con atributos como matrícula, marca, kilómetros, año de fabricación y propietario.
- **Moto**: Clase que hereda de `Vehiculo` e incorpora atributos específicos como `potencia` y `tipo`.
- **Coche**: Clase que hereda de `Vehiculo` e incluye atributos como `numAsientos` y `tieneAirbags`.
- **Propietario**: Clase que representa a un propietario de un vehículo, con datos como DNI, nombre, apellidos y puntos del carnet.
- **Oficina**: Clase que gestiona una oficina de tráfico, almacenando vehículos y propietarios, y permitiendo búsquedas por DNI y matrícula.

### **CONTROLER**
- **Main**: Clase principal que inicia la aplicación, crea una oficina, añade propietarios y vehículos, y realiza búsquedas en la base de datos simulada.

## Funcionalidades
1. **Registrar un propietario** con su DNI, nombre, apellidos y puntos del carnet.
2. **Registrar vehículos** (coches y motos) asociados a propietarios.
3. **Consultar un propietario** por su DNI.
4. **Buscar vehículos** por su matrícula.
5. **Consultar la edad de un vehículo** a partir del año actual.
6. **Gestionar una oficina de tráfico**, almacenando la información de propietarios y vehículos.

## Ejemplo de Uso
```java
OFICINA.Oficina oficina = new OFICINA.Oficina("Valencia", "46001", "Calle Mayor, 12", true, "Limpiezas S.A.");

PROPIETARIO.Propietario p1 = new PROPIETARIO.Propietario("12345678A", "Juan", "Perez", 12);
oficina.agregarPropietario(p1);

COCHE.Coche coche1 = new COCHE.Coche("1234ABC", "Toyota", 50000, 2018, p1, 5, true);
oficina.agregarVehiculo(coche1);

System.out.println(oficina.buscarPropietarioPorDni("12345678A"));
System.out.println(oficina.buscarVehiculoPorMatricula("1234ABC"));
```

## Requisitos
- JDK 8 o superior
- Un entorno de desarrollo como IntelliJ IDEA o Eclipse

## Autores
Desarrollado por [Tu Nombre] como parte de un proyecto educativo.

## Licencia
Este proyecto es de código abierto y se puede modificar y distribuir libremente bajo la licencia MIT.

