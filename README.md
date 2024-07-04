# Domain-Driven Tests Kata

To summarize DDTs, its focus is to test the domain logic, leaving implementation details to the last possible moment. They match perfectly with the steel thread/iterative approach, where we anticipate integration by using fakes/dummies, focusing only in the domain logic.

## Scenarios:

1) - Given I'm a manager
- When I log in
- Then I can register new products into the catalog.

2) - Given I'm a customer
- When I log in
- Then I can see the products in the catalog, except the adults-only products.

3) - Given I'm a customer
- When I log in
- And I inform my birthdate
- Then I can see all the products in the catalog, including the adults-only products.

4) - Given I'm a customer
- When I try to buy a product
- And the product has enough stock
- Then I can successfully buy it.

5) - Given I'm a customer
- When I try to buy a product
- And the product has not enough stock
- Then I can't buy it.

## Exercise

Implement each scenario first using the in-memory/domain-only configuration. Then, before jumping to the next scenario, expand it to a CLI implementation.

Some bootstrap code is provided to help you start.

### Extra challenge

Now with all the scenarios implemented in both configurations, expand it to work with http4k.