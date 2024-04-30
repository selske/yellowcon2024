# Triathlon Registration Service
## Use Case
Create a web service to register an athlete to an event.  An event is, for simplicity, just defined by its name (eg Yellowcon Triathlon). Each event can have multiple race distances: full, half, quarter and sprint.  An athlete can register for only one of these events.

The information we need for athlete is: name, date of birth, country of origin and email address.

To be able to register, an athlete needs to have a license from the triathlon federation.  Pro athletes will always have a license number, which will need to be checked.  Amateurs usually do not have one and will need to register for a "day license" specifically for that race.  The triathlon federation exposes a rest service that has endpoints to retrieve a licence by its licence number and register a day licence.

Due to practical reasons, only a limited amount of entries is allowed per distance per event.

Once all these conditions are met, a pending entry will be created.

Once payment is received, this entry will be finalized, and a race number will be generated.

## Optional cases to consider
* Once registrations are closed, an order is placed for timing chips, on timing chip for each entry will be needed.
* Race numbers will be in separate ranges for each distance:
  * 0-9999 -> full distance
  * 10000-19999 -> half distance
  * 20000-29999 -> quarter distance
  * 30000-39999 -> sprint
* On race day, an athlete will have to have his equipment checked and approved, after which his timing chip will be activated and only then he can start the race.