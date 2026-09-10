# Smart Home Builder Pattern

## Project Description

This project demonstrates the Builder creational design pattern in Java.

The product of this project is a Smart Home configuration. A Smart Home can contain several configurable components, including smart lighting, security cameras, a smart lock, temperature control, an alarm system, a voice assistant, and energy monitoring.

The Builder pattern is suitable for this project because a Smart Home contains many configuration options that can be constructed step by step.

The same construction process can also produce different representations of the same configuration.

## Project Structure

- `SmartHome` - Product class that represents the final Smart Home object.
- `SmartHomeBuilder` - Builder interface that defines the construction steps.
- `SmartHomeObjectBuilder` - Concrete Builder that creates a `SmartHome` object.
- `SmartHomeDescriptionBuilder` - Concrete Builder that creates a text description.
- `Director` - Defines reusable Smart Home configurations.
- `Main` - Client that demonstrates and tests the Builder pattern.

## Builder Pattern Implementation

The `SmartHomeBuilder` interface defines common construction steps.

Both concrete builders implement the same interface:

- `SmartHomeObjectBuilder`
- `SmartHomeDescriptionBuilder`

The `Director` works only with the `SmartHomeBuilder` interface. Therefore, the same construction sequence can be used with different builders.

For example:

```text
SmartHomeObjectBuilder objectBuilder = new SmartHomeObjectBuilder();

director.makeSecureHome(objectBuilder);

SmartHome secureHome = objectBuilder.getResult();
```

The same configuration can be created as a text representation:

```text
SmartHomeDescriptionBuilder descriptionBuilder =
        new SmartHomeDescriptionBuilder();

director.makeSecureHome(descriptionBuilder);

String description = descriptionBuilder.getResult();
```

This demonstrates that the same construction steps can produce different representations.

## Ready Configurations

The `Director` contains two reusable configurations:

```text
makeSecureHome()
makeBasicHome()
```

`makeSecureHome()` creates a Smart Home with more security and smart features.

`makeBasicHome()` creates a simpler Smart Home configuration.

---

# Clean Code Principles

## 1. Meaningful and Intention-Revealing Names

Class, method, and variable names clearly describe their purpose.

Annotated examples:

```text
SmartHomeObjectBuilder
// Clearly shows that this builder creates a SmartHome object.

SmartHomeDescriptionBuilder
// Clearly shows that this builder creates a text description.

setSecurityCameraCount()
// Clearly describes which property is being configured.

makeSecureHome()
// Clearly describes which predefined configuration is created.
```

Using meaningful names makes the code easier to read and understand.

---

## 2. Small Methods That Do One Thing

Builder methods are small and have only one responsibility.

Example:

```text
@Override
public SmartHomeObjectBuilder setHomeName(String homeName) {
    this.homeName = homeName;
    return this;
}
```

This method does only two closely related actions:

1. Stores the home name.
2. Returns the builder for method chaining.

It does not contain unrelated logic.

Another example:

```text
@Override
public SmartHomeObjectBuilder setSmartLock(boolean smartLock) {
    this.smartLock = smartLock;
    return this;
}
```

Each setter handles only one Smart Home property.

---

## 3. Small and Focused Classes

Each class has one main responsibility.

```text
SmartHome
// Stores the final product data.

SmartHomeBuilder
// Defines common construction steps.

SmartHomeObjectBuilder
// Creates the object representation.

SmartHomeDescriptionBuilder
// Creates the text representation.

Director
// Defines reusable construction sequences.

Main
// Demonstrates how the pattern is used.
```

Separating responsibilities makes the project easier to understand, maintain, and extend.

---

## 4. Validated Construction

The builder validates important values before creating the final product.

Example:

```text
if (homeName == null || homeName.isBlank()) {
    throw new IllegalStateException("Home name is required");
}
```

This prevents the creation of a Smart Home without a valid name.

The number of security cameras is also validated:

```text
if (securityCameraCount < 0) {
    throw new IllegalStateException(
            "Security camera count cannot be negative"
    );
}
```

The target temperature is checked as well:

```text
if (targetTemperature < 5 || targetTemperature > 35) {
    throw new IllegalStateException(
            "Target temperature must be between 5 and 35"
    );
}
```

Clear exceptions make invalid states easier to identify and debug.

---

## 5. Consistent Formatting and Code Structure

The project uses consistent naming, indentation, method structure, and class organization.

For example, all Builder methods follow the same structure:

```text
@Override
public SmartHomeObjectBuilder setEnergyMonitoring(boolean energyMonitoring) {
    this.energyMonitoring = energyMonitoring;
    return this;
}
```

Another builder method follows the same format:

```text
@Override
public SmartHomeObjectBuilder setAlarmSystem(boolean alarmSystem) {
    this.alarmSystem = alarmSystem;
    return this;
}
```

Consistent formatting makes the source code predictable and easier to read.

---

# Fluent API

The Builder uses method chaining.

Each construction method returns the builder itself using:

```text
return this;
```

This allows configuration steps to be written in a readable sequence:

```text
builder
        .setHomeName("Secure Home")
        .setSmartLighting(true)
        .setSecurityCameraCount(6)
        .setSmartLock(true)
        .setTargetTemperature(22.0)
        .setAlarmSystem(true)
        .setVoiceAssistant("Alexa")
        .setEnergyMonitoring(true);
```

This makes the object construction process easy to read from top to bottom.

---

# Product Immutability

The final `SmartHome` product uses `final` fields.

Example:

```text
private final String homeName;
private final boolean smartLighting;
private final int securityCameraCount;
private final boolean smartLock;
private final double targetTemperature;
```

The Product does not provide public setter methods.

After a `SmartHome` object is created, its state cannot be changed through setters.

---

# Validation Rules

Before creating a Smart Home object, the builder checks that:

- The home name is not null or empty.
- The security camera count is not negative.
- The target temperature is between 5 and 35 degrees.

If a configuration is invalid, an `IllegalStateException` with a clear message is thrown.

---

# Example Output

```text
=== OBJECT REPRESENTATION ===

SmartHome{
homeName='Secure Home',
smartLighting=true,
securityCameraCount=6,
smartLock=true,
targetTemperature=22.0,
alarmSystem=true,
voiceAssistant='Alexa',
energyMonitoring=true
}

=== TEXT REPRESENTATION ===

=== Smart Home Description ===
Home name: Secure Home
Smart lighting: true
Security cameras: 6
Smart lock: true
Target temperature: 22.0
Alarm system: true
Voice assistant: Alexa
Energy monitoring: true

=== BASIC HOME ===

SmartHome{
homeName='Basic Home',
smartLighting=true,
securityCameraCount=2,
smartLock=false,
targetTemperature=23.0,
alarmSystem=false,
voiceAssistant='Google Assistant',
energyMonitoring=false
}
```

# Technologies

- Java
- IntelliJ IDEA
- Git
- GitHub

# Course

Software Design Patterns

Assignment #1 - Builder Pattern