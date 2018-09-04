# A simple retail calculator

As a sales person, I want to quickly get the final price of an order. The software to solve this problem, will take inputs and returns output on the command line.

The input is:
* Number of items to be sold
* The price per item
* a 2 letter state code

It does not matter what kind of item this is, this software should just calculate the price of the order.

To each order, there is a discount rate applied:


|Order Value				|	Discount Rate|
| ---                       | --- |
|$0.00 -   $999.99		    |0%|
|$1000.00 -  $4999.99		|3%|
|$5000.00 -  $6999.99		|5%|
|$7000.00 - 	$9999.99	|	7%|
|$10000.00 - $49999.99		|10%|
|$50000.00 - and more		|15%|

To each order, there is a tax rate applied (Discount is applied before taxes):

|State-Code		|Tax-Rate|
| --- | --- |
|UT	|			6.85%|
|NV	|			8.00%|
|TX 	|			6.25%|
|AL          |  	4.00%|
|CA      | 		8.25%|

## Examples:
Input (Format: #items price stateCode):
`100 49.95 UT`
Output:
`4995`
You can find additional examples in the test file.

## Maven:

This is a maven project. So to run it, you can either tell your IDE to run this as a maven project or run it from the 
terminal with the following commands:

* Test: `mvn test`
* Build, test, and package: `mvn package`
* Run the app: `java -cp target/PriceCalculator-1.0-SNAPSHOT.jar me.zyse.App`