# Smart Home Design Patterns

## Project Description

This Java project demonstrates several creational design patterns using a Smart Home system.

The project currently contains:

- Assignment #1 — Builder Pattern
- Assignment #2 — Factory Method
- Assignment #2 — Abstract Factory

The Smart Home domain was selected because it contains different devices, configurations, and related product families.

---

# Assignment #1 — Builder Pattern

## Purpose

The Builder Pattern is used to construct complex objects step by step.

A Smart Home can contain many configurable properties, such as:

- Home name
- Smart lighting
- Security cameras
- Smart lock
- Target temperature
- Alarm system
- Voice assistant
- Energy monitoring

Instead of using one large constructor, the Builder Pattern allows these values to be configured step by step.

---

## Builder Structure

The Builder implementation contains:

- `SmartHome` — Product
- `SmartHomeBuilder` — Builder interface
- `SmartHomeObjectBuilder` — Concrete Builder
- `SmartHomeDescriptionBuilder` — Concrete Builder
- `Director` — Defines reusable construction sequences
- `Main` — Client

Structure:

```text
Main
  |
  v
Director
  |
  v
SmartHomeBuilder
  |
  +-- SmartHomeObjectBuilder ------> SmartHome
  |
  +-- SmartHomeDescriptionBuilder -> String description
```

---

## Builder Interface

`SmartHomeBuilder` defines the common construction methods.

Example:

```java
setHomeName(...)
setSmartLighting(...)
setSecurityCameraCount(...)
setSmartLock(...)
setTargetTemperature(...)
setAlarmSystem(...)
setVoiceAssistant(...)
setEnergyMonitoring(...)
```

Both concrete builders implement the same interface.

---

## Different Representations

The same construction process can produce different representations.

Object representation:

```java
SmartHomeObjectBuilder objectBuilder =
        new SmartHomeObjectBuilder();

director.makeSecureHome(objectBuilder);

SmartHome secureHome =
        objectBuilder.getResult();
```

Text representation:

```java
SmartHomeDescriptionBuilder descriptionBuilder =
        new SmartHomeDescriptionBuilder();

director.makeSecureHome(descriptionBuilder);

String description =
        descriptionBuilder.getResult();
```

This demonstrates that the same construction steps can produce different results.

---

## Ready Configurations

The `Director` contains reusable configurations:

```text
makeSecureHome()
makeBasicHome()
```

`makeSecureHome()` creates a Smart Home with more security features.

`makeBasicHome()` creates a simpler configuration.

---

# Assignment #2 — Factory Method & Abstract Factory

## Project Description

Assignment #2 demonstrates two creational design patterns:

- Factory Method
- Abstract Factory

The same Smart Home domain is used.

Factory Method creates individual smart devices.

Abstract Factory creates complete families of compatible Smart Home components.

---

# Part A — Factory Method

## Purpose

The Factory Method Pattern separates object creation from object usage.

Instead of creating concrete devices directly in the client, the client asks a factory to create the required object.

This reduces direct dependency between client code and concrete product classes.

---

## Factory Method Components

The implementation contains:

- `SmartDevice` — Product interface
- `SmartLight` — Concrete Product
- `SecurityCamera` — Concrete Product
- `SmartDeviceFactory` — Creator
- `SmartLightFactory` — Concrete Creator
- `SecurityCameraFactory` — Concrete Creator
- `FactoryMain` — Client/demo

---

## Product Interface

All smart devices implement the same interface.

```java
public interface SmartDevice {

    void turnOn();
}
```

The interface defines common behavior for all smart devices.

Structure:

```text
SmartDevice
    |
    +-- SmartLight
    |
    +-- SecurityCamera
```

---

## Concrete Products

### SmartLight

`SmartLight` implements `SmartDevice`.

It provides its own implementation of:

```java
turnOn()
```

### SecurityCamera

`SecurityCamera` also implements `SmartDevice`.

It provides its own implementation of:

```java
turnOn()
```

Both products can therefore be used through the same `SmartDevice` interface.

---

## Creator

`SmartDeviceFactory` is the abstract Creator.

```java
public abstract SmartDevice createDevice();
```

The Creator defines how a device should be requested but does not decide which concrete device should be created.

---

## Concrete Creators

### SmartLightFactory

`SmartLightFactory` creates a `SmartLight`.

```java
@Override
public SmartDevice createDevice() {
    return new SmartLight();
}
```

### SecurityCameraFactory

`SecurityCameraFactory` creates a `SecurityCamera`.

```java
@Override
public SmartDevice createDevice() {
    return new SecurityCamera();
}
```

---

## Client Usage

The client works with the general factory and product abstractions.

```java
SmartDeviceFactory lightFactory =
        new SmartLightFactory();

SmartDevice light =
        lightFactory.createDevice();

light.turnOn();
```

The same logic can be used for another product:

```java
SmartDeviceFactory cameraFactory =
        new SecurityCameraFactory();

SmartDevice camera =
        cameraFactory.createDevice();

camera.turnOn();
```

The client does not directly create:

```text
new SmartLight()
new SecurityCamera()
```

Object creation is delegated to concrete factories.

---

## Factory Method Structure

```text
                    SmartDevice
                   /           \
                  /             \
         SmartLight       SecurityCamera


             SmartDeviceFactory
              /               \
             /                 \
 SmartLightFactory     SecurityCameraFactory
         |                     |
         v                     v
    SmartLight            SecurityCamera
```

---

## Factory Method Output

Example:

```text
IT IS TRUE
SECURITY CAMERA IS ON
```

---

# Part B — Abstract Factory

## Purpose

The Abstract Factory Pattern creates families of related objects.

In this Smart Home system there are two product families:

- Basic Smart Home
- Premium Smart Home

Each family contains:

- Lighting
- Security System

---

## Abstract Products

Two product interfaces are used:

```text
Lighting
SecuritySystem
```

`Lighting` defines:

```java
turnOn()
```

`SecuritySystem` defines:

```java
activate()
```

---

# Basic Product Family

The Basic family contains:

```text
BasicLighting
BasicSecuritySystem
```

`BasicLighting` implements:

```text
Lighting
```

`BasicSecuritySystem` implements:

```text
SecuritySystem
```

---

# Premium Product Family

The Premium family contains:

```text
PremiumLighting
PremiumSecuritySystem
```

`PremiumLighting` implements:

```text
Lighting
```

`PremiumSecuritySystem` implements:

```text
SecuritySystem
```

---

## Abstract Factory

`SmartHomeFactory` is the Abstract Factory interface.

It defines methods for creating all products in one family.

```java
Lighting createLighting();

SecuritySystem createSecuritySystem();
```

The interface does not specify whether Basic or Premium products are created.

---

## Concrete Factories

### BasicSmartHomeFactory

Creates the Basic product family.

```text
createLighting()
        |
        v
BasicLighting

createSecuritySystem()
        |
        v
BasicSecuritySystem
```

### PremiumSmartHomeFactory

Creates the Premium product family.

```text
createLighting()
        |
        v
PremiumLighting

createSecuritySystem()
        |
        v
PremiumSecuritySystem
```

---

## Client

`SmartHomeClient` works only with abstractions.

It uses:

```text
SmartHomeFactory
Lighting
SecuritySystem
```

Example:

```java
public SmartHomeClient(SmartHomeFactory factory) {

    lighting =
            factory.createLighting();

    securitySystem =
            factory.createSecuritySystem();
}
```

The client does not directly create:

```text
BasicLighting
PremiumLighting
BasicSecuritySystem
PremiumSecuritySystem
```

This allows the client to switch between product families without changing its main logic.

---

## Abstract Factory Structure

```text
                        SmartHomeFactory
                       /                \
                      /                  \
        BasicSmartHomeFactory      PremiumSmartHomeFactory
               |                          |
         +-----+-----+              +-----+-----+
         |           |              |           |
         v           v              v           v
 BasicLighting  BasicSecurity  PremiumLighting  PremiumSecurity
```

---

## Abstract Factory Output

```text
BASIC SMART HOME
BASIC LIGHTING IS ON
BASIC SECURITY SYSTEM IS ACTIVE

PREMIUM SMART HOME
PREMIUM LIGHTING IS ON
PREMIUM SECURITY SYSTEM IS ACTIVE
```

---

# Factory Method vs Abstract Factory

| Factory Method | Abstract Factory |
|---|---|
| Creates one product type | Creates a family of related products |
| Uses Creator and Concrete Creators | Uses Abstract Factory and Concrete Factories |
| Concrete Creator chooses the product | Concrete Factory creates a full family |
| Example: SmartLight or SecurityCamera | Example: Basic or Premium Smart Home |

---

# Clean Code Principles

## 1. Meaningful and Intention-Revealing Names

Class and method names clearly describe their purpose.

Bad example:

```java
Factory f;
Device d;
```

Improved version:

```java
SmartDeviceFactory lightFactory;
SmartDevice light;
```

Other meaningful names used in the project:

```text
SmartDeviceFactory
SecurityCameraFactory
BasicSmartHomeFactory
PremiumSmartHomeFactory
createDevice()
createLighting()
createSecuritySystem()
```

The improved names make the code easier to understand without additional comments.

---

## 2. Small Methods That Do One Thing

Methods contain only the logic required for one task.

Example:

```java
@Override
public SmartDevice createDevice() {
    return new SmartLight();
}
```

This method has one responsibility:

```text
Create and return a SmartLight.
```

Another example:

```java
@Override
public Lighting createLighting() {
    return new BasicLighting();
}
```

It only creates the Basic lighting product.

No unrelated logic is included.

---

## 3. Single Responsibility Principle

Each class has one main responsibility.

Examples:

```text
SmartLight
// Contains Smart Light behavior.

SmartLightFactory
// Creates Smart Light objects.

SecurityCamera
// Contains Security Camera behavior.

SecurityCameraFactory
// Creates Security Camera objects.

SmartHomeClient
// Uses products created by SmartHomeFactory.
```

Before separation, creation logic and product behavior could exist in the same client class.

After applying the patterns:

```text
Product class  -> contains product behavior
Factory class  -> creates products
Client class   -> uses products
```

This keeps responsibilities separated.

---

## 4. Depend on Abstractions

Client code works with interfaces and abstract classes instead of depending directly on concrete product classes.

Factory Method example:

```java
SmartDeviceFactory lightFactory =
        new SmartLightFactory();

SmartDevice light =
        lightFactory.createDevice();
```

The variables use:

```text
SmartDeviceFactory
SmartDevice
```

instead of concrete product types.

Abstract Factory example:

```java
private final Lighting lighting;

private final SecuritySystem securitySystem;

public SmartHomeClient(SmartHomeFactory factory) {

    lighting =
            factory.createLighting();

    securitySystem =
            factory.createSecuritySystem();
}
```

The client does not depend directly on Basic or Premium concrete products.

---

## 5. Small and Focused Classes

Each class has a limited and clear purpose.

Examples:

```text
BasicLighting
// Basic lighting behavior.

PremiumLighting
// Premium lighting behavior.

BasicSmartHomeFactory
// Creates Basic-family products.

PremiumSmartHomeFactory
// Creates Premium-family products.
```

Instead of placing all creation logic inside one large class, the implementation separates responsibilities into small focused classes.

This makes the code easier to:

- Read
- Maintain
- Test
- Extend

---

# Project Structure

```text
src
│
├── Factory
│   ├── FactoryMain.java
│   ├── SmartDevice.java
│   ├── SmartDeviceFactory.java
│   ├── SmartLight.java
│   ├── SmartLightFactory.java
│   ├── SecurityCamera.java
│   └── SecurityCameraFactory.java
│
├── abstractfactory
│   ├── AbstractFactoryMain.java
│   ├── Lighting.java
│   ├── SecuritySystem.java
│   ├── BasicLighting.java
│   ├── BasicSecuritySystem.java
│   ├── PremiumLighting.java
│   ├── PremiumSecuritySystem.java
│   ├── SmartHomeFactory.java
│   ├── BasicSmartHomeFactory.java
│   ├── PremiumSmartHomeFactory.java
│   └── SmartHomeClient.java
│
└── smartHome
    ├── Director.java
    ├── Main.java
    ├── SmartHome.java
    ├── SmartHomeBuilder.java
    ├── SmartHomeObjectBuilder.java
    └── SmartHomeDescriptionBuilder.java
```

---

# Technologies

- Java
- IntelliJ IDEA
- Git
- GitHub

---

# Assignment #2 Summary

The Factory Method Pattern is used to create individual Smart Home devices through specialized factory classes.

The Abstract Factory Pattern extends this concept by creating complete families of compatible Smart Home components.

The project demonstrates:

- Product interfaces
- Concrete Products
- Creator
- Concrete Creators
- Abstract Products
- Abstract Factory
- Concrete Factories
- Client working with abstractions
- Two product families
- Clean Code principles

---

# Course

Software Design Patterns

## Assignments

- Assignment #1 — Builder Pattern
- Assignment #2 — Factory Method & Abstract Factory