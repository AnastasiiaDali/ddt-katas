# Domain-Driven Tests Kata

This is a Kata that aims to familiarize people with the concept of Domain-Driven Tests. If you don't know anything about DDTs, refer to [this talk](https://www.youtube.com/watch?v=Fk4rCn4YLLU) or [this document.](https://docs.google.com/document/d/10WuPeP-Ek2UKplnZg9zVp4UxGSejOfMnwPh-5bwxUVU/edit#heading=h.3gx79w623ped)

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