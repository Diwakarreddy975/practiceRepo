Feature:
search products in amazon


Scenario:search hair drier on search box0
Given type "hairdrier" on search field with price 350
When click on the search icon
Then product will show

@smoke @sanity
Scenario:search hair drier on search box1
Given type "hairdrier" on search field with price 240
When click on the search icon
Then product will show

@sanity
Scenario:search hair drier on search box2
Given type "hairdrier" on search field with price 544
When click on the search icon
Then product will show
