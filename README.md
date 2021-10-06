# TMPS - Laboratory work 1
### Topic: Electric Cars Manufacturer
Author: FAF-191, Caragiu Victor

### Theory
The cars manufacturer have 3 different systems:
- to generate car designs;
- to generate the desigh of a specific car type;
- to make a shopping list;
The car desgn represents its specifications: maximum speed, mileage, mass, automation level, price.

## Implementation

### Prototype Design Pattern
I made an abstract class _Car_ which can clone itself:<br/>
<image src="/examples/Proto_clone.png"><br/>
I implemented different types of cars:<br/>
<image src="/examples/Proto_car_types.png"><br/>
Then I made a Designer class which can build and store the instances and return their clones:<br/>	
<image src="/examples/Proto_designer.png"><br/>
The usage:<br/>
<image src="/examples/Proto_usage.png"><br/>
Output:<br/>
<image src="/examples/Proto_run.png"><br/>
<br/>
### Factory Method Design Pattern
I made an abstract class _Car_<br/>
<image src="/examples/Factory_car.png"><br/>
I implemented different types of cars. Then I made a car creator which returns a Car instance of specific type.<br/>
<image src="/examples/Factory_creator.png"><br/>
The usage:<br/>
<image src="/examples/Factory_usage.png"><br/>
Output:<br/>
<image src="/examples/Factory_run.png"><br/>
<br/>
### Builder Method Design Pattern
I made an interface _Pilot_:<br/>
<image src="/examples/Builder_pilot.png"><br/>
And two types of autopilots with different levels of automation, which implemet the _Pilot_ interface: LevelTwo, LevelThree.<br/>
I made a _Car_ interface:<br/>
<image src="/examples/Builder_car.png"><br/>
And made two abstract classes which implemet the _Car_ interface, and represent cars with different types of automation: PartialAutomation, ConditionalAutomation.<br/>
These classes for car types, have methods which return different automation level instances.<br/>
<image src="/examples/Builder_po.png"><br/>
<image src="/examples/Builder_co.png"><br/>
Then I created the concrete car types, with specific names and prices, taht extend an automation car type, as PowerfulCar for example:<br/>
<image src="/examples/Builder_powerful.png"><br/>
The class PackBuilder:<br/>
<image src="/examples/Builder_pack.png"><br/>
The usage:<br/>
<image src="/examples/Builder_usage.png"><br/>
The ouput:<br/>
<image src="/examples/Builder_run.png"><br/>

