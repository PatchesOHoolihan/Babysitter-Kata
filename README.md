# Babysitter Kata
**[Description of how to download/clone and run the code will go here.]**

## Description of kata
Taken from https://gist.github.com/jameskbride/5482722 :

This kata simulates a babysitter working and getting paid for one night.  The rules are pretty straight forward:

The babysitter 
- starts no earlier than 5:00PM
- leaves no later than 4:00AM
- gets paid $12/hour from start-time to bedtime
- gets paid $8/hour from bedtime to midnight
- gets paid $16/hour from midnight to end of job
- gets paid for full hours (no fractional hours)

Feature:
As a babysitter
In order to get paid for 1 night of work
I want to calculate my nightly charge

## Pre-coding notes
- The goal of this exercise is to create a method that will output a single value that is the amount of money paid to a babysitter after the completion of one shift.
- The method that we need to create that will output this value will require three inputs: 
	- The starting time of the babysitter's shift.
	- The ending time of the babysitter's shift.
	- The bedtime.
- Because there are three different rates at which the babysitter can be paid, we need to break down the problem by finding how many hours are worked under each pay rate. (This is the "real" challenge of the exercise; calculating the amount to be paid is a simple arithmetic problem of multiplication and addition once we have calculated the amount of individual sub-shift hours.)
- We can see that any hour worked after midnight has a pay rate that supersedes all other pay rates. We'll call these hours the "midnight shift".
	- Note here that even though the bedtime can be set after midnight, there won't be any hours paid at the bedtime rate because they will be superseded by the midnight shift rate. This holds true also if the start time is after midnight.
- We can see that any hour worked before midnight and after bedtime (the "bedtime shift") has a pay rate that supersedes any hour worked before midnight that is also before bedtime (the "regular shift").
- The hours worked by the set consisting of the regular, bedtime, and midnight shifts are mutually exclusive (the hours do not overlap) and collectively exhaustive (there are no hours worked not accounted for) with respect to the total shift.
	- Alternately worded --and more to the point for the purpose of this exercise-- given a pay rate for each sub-shift, calculating the hours in each sub-shift is necessary and sufficient for calculating the total pay.
- Some constraints and observations on our inputs:
	- The end time must be after the start time.
	- The bedtime must not be before the start time.
	- The bedtime must not be after the end time.
	- The bedtime *can* be the same as either the start or end time.
- The inputs are in the form of times of the day and are constrained by the kata to be from 5pm to 4am, excluding partial hours. Therefore there are a total of 12 possible values that can be used as inputs (ignoring the constraints mentioned in the previouse bullet point).
- To make the calculations easier, we can make a method to covert the times to integers (e.g. 5pm becomes 0, 4am becomes 11).

## Basic walkthrough of what our method will do
- It will take three inputs: the start time, end time, and bedtime.
- Convert them to the 0-11 integer scale.
- Make sure inputs don't violate constraints (i.e. that the inputs "make sense" with respect to one another).
- Calculate the amount of hours worked during each sub-shift in order of precedence:
	1. Midnight shift.
	2. Bedtime shift.
	3. Regular shift.
- Multiply each shift by its pay rate then add those and return the total pay amount.

## Methods needed (not necessarily a complete list)
- A method to convert the input from times without am/pm (i.e. 5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3, 4) to a 12-integer scale.
	- Interestingly, since the only purpose of this method is to help calculate the difference between two values, any continuous sequence of 12 integers could be used, but we'll keep it simple and use 0-11.
- A method to validate the inputs.
	- To check start time against end time.
	- To check bed time against both start time and end time.
- A method to calculate the amount of hours in the midnight shift.
- A method to calculate the amount of hours in the bedtime shift.
- A method to calculate the amount of hours in the regular shift.
- A method to calculate the pay for the midnight shift.
- A method to calculate the pay for the bedtime shift.
- A method to calculate the pay for the regular shift.
- A method to add and return the pay for the total shift.

## Test ideas
(This is a "scratchpad" area.)
- Should return each input type.
- Should convert inputs to 0-11 scale.
- Should <?> if end time is before start time.
- Should <?> if bedtime is before start time.
- Should <?> if bedtime is after end time.
- Start time must be before 4am.


## The actual tests I implemented
- 


