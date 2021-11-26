# TMPS - Laboratory work 1/2

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#Topic-:-Electric-Cars-Manufacturer">About The Topic</a>
    </li>
    <li>
      <a href="#vision-of-os">Vision of OS</a>
    </li>
  </ol>
</details>

### Topic: Electric Cars Manufacturer
Author: FAF-191, Evstafiev Nicolae

### Theory
The cars manufacturer have 3 different systems:
- to generate car designs;
- to generate the desigh of a specific car type;
- to make a shopping list;
  The car desgn represents its specifications: maximum speed, mileage, mass, automation level, price.

## Implementation

### Prototype Design Pattern
Here is an abstract class _Car_ which can clone itself:<br/>
<image src="/examples/Proto_clone.png"><br/>
Implementation different types of cars:<br/>
<image src="/examples/Proto_car_types.png"><br/>
Designer class which can build and store the instances and return their clones:<br/>
<image src="/examples/Proto_designer.png"><br/>
The usage:<br/>
<image src="/examples/Proto_usage.png"><br/>
Output:<br/>
<image src="/examples/Proto_run.png"><br/>
<br/>
### Factory Method Design Pattern
Abstract class _Car_<br/>
<image src="/examples/Factory_car.png"><br/>
Implementation different types of cars. Then here is car creator which returns a Car instance of specific type.<br/>
<image src="/examples/Factory_creator.png"><br/>
The usage:<br/>
<image src="/examples/Factory_usage.png"><br/>
Output:<br/>
<image src="/examples/Factory_run.png"><br/>
<br/>
### Builder Method Design Pattern
Interface _Pilot_:<br/>
<image src="/examples/Builder_pilot.png"><br/>
And two types of autopilots with different levels of automation, which implemet the _Pilot_ interface: LevelTwo, LevelThree.<br/>
Here is a _Car_ interface:<br/>
<image src="/examples/Builder_car.png"><br/>
And also two abstract classes which implemet the _Car_ interface, and represent cars with different types of automation: PartialAutomation, ConditionalAutomation.<br/>
These classes for car types, have methods which return different automation level instances.<br/>
<image src="/examples/Builder_po.png"><br/>
<image src="/examples/Builder_co.png"><br/>
 Also here are created  the concrete car types, with specific names and prices, taht extend an automation car type, as PowerfulCar for example:<br/>
<image src="/examples/Builder_powerful.png"><br/>
The class PackBuilder:<br/>
<image src="/examples/Builder_pack.png"><br/>
The usage:<br/>
<image src="/examples/Builder_usage.png"><br/>
The ouput:<br/>
<image src="/examples/Builder_run.png"><br/>

# Lab Nr 2
# Structural Design Patterns

----

## Objectives:

* Get familiar with the Structural DPs;
* Choose a specific domain;
* Implement at least 3 SDPs for the specific domain;


## Used Design Patterns:

* Adapter
* Decorator
* Facade


## Implementation

* About 2-3 sentences to explain the implementation.

For the adapter pattern, we have 2 different types of batteries. The 2019 type battery contains info about its capacity directly in Wh, but the 2020 model' capacity should be computed. For that we overridden the getWh() method.
<image src="/examples/Adapter.png"><br/>

we used the decorator pattern to add new properties to a class and overridden the function that shows the class properties.
```
@Override
    public void optionsList()
    {
        this.component.optionsList();
        System.out.println(luxuryOptions);
    }
```
<image src="/examples/Decorator.png"><br/>

For the facade pattern, we implemented different methods to get some specific items, in this case 3 methods, for listing civil, industrial and all car models. And the facade class has members which contain the data separately.
<image src="/examples/Facade.png"><br/>

