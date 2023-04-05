# Linear Regression using Gradient Descent
The aim of this project is to implement a linear regression algorithm in Java and compare to the result of a Scikit Learn project. The algorithm in Java will be made from scratch, where the Scikit Project will use pre-developed tools.
## <u>Data Set</u>
https://www.kaggle.com/datasets/thedevastator/uncovering-factors-that-affect-used-car-prices

Features:

| # | Column | Dtype | Desc |
|---|--------|-------|------|
|0  |dateCrawled|object|
|1  |name|object|
|2  |seller|object|
|3  |offerType|object|
|4  |price|int64| 
|5  |abtest|object|
|6 |vehicleType|object|
|6  |yearOfRegistration|int64| 
|7  |gearbox|object|
|8 |powerPS|int64| 
|11 |model|object|
|12 |kilometer|int64| 
|13 |monthOfRegistration|int64| 
|14 |fuelType|object|
|15 |brand|object|
|16 |notRepairedDamage|object|
|17 |dateCreated|object|
|18 |nrOfPictures|int64| 
|19 |postalCode|int64| 
|20 |lastSeen|object|

## <u>Goal</u>
Determine the corolation between certain features in the data set, such as type of vehicle or age of the vehicle, and the price of the car.