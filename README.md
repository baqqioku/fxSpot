# fxSpot
1）* Initially,Please create an entity class for an FXSpot, including the following attributes to represent the fx spot rate of a given currency pair as of the specified point in time:
* Currency 1(a string), e.g. USD
* Currency 2(a string), e.g. CNY
* FxRate value (a decimal), e.g. 100.32
* date and time of when the value is observed, e.g. 2022.12.14 15:18:03 GMT
* A list of additional text labels, e.g. latest,updated,important
  2） Then create interface class FxSpotRepository and implementation class FxSpotRepositoryImpl to store the data(assuming in the future we might need to change the data storage to a db or a file.).
* create a method to add instances of the FXSpot to the structure
* create a method to retrieve a list of values for a given currency pair