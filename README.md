# Vaccine

In this system, a vaccine has the following properties:
number of days between first and second vaccination, number of necessary doses.

Tasks:
1.a) Let's represent the vaccines in the code with an enum 
b) Each vaccine should have a method that, given the time of the first dose (with the LocalDate Java API type), returns the day of the second dose (as the LocalDate type). let's try computeDateOfSecondShot.  Write the second vaccination times to the console.

2.a) Modify computeDateOfSecondShot so that it throws a run-time exception in the event that the given vaccine we are calling for has only one dose!
2.b) Modify the main method in such a way that we can also try the exception throwing in it (if there was no such case in it so far)
