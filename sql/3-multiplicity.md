# What is Multiplicity?


Technical definition:

**_a specification of the number of possible occurrences of a property, or the number of allowable elements that may participate in a given relationship_**

 

Simplified definition:

**_a concept that tells us the minimum and maximum number of times that two tables in our database can be related to each other_**

 

Minimums

If the relationship is mandatory: 1

If the relationship is optional: 0

 

Maximums

If a relationship is forbidden: 0

If a relationship is only one: 1

If a relationship can be many: *

 

We represent multiplicity in min/max pairs, such as:



*   **_0..1 (zero-to-one relationship)_**
*   **_0..* (zero-to-many relationship)_**
*   **_1..1 (one-to-one relationship)_**
*   **_1..* (one-to-many relationship)_**
*   **_*..* (many-to-many relationship)_**


## Multiplicity vs. Cardinality

 

Two often confused concepts are those of multiplicity and cardinality. Let's look at the definition of cardinality to better understand it, before we start comparing it to multiplicity:

 

##### Cardinality:

**_Denotes the maximum number of possible relationship occurrences in which a certain entity can participate in (in simple terms: at most)._**

 

Let's also define the concept of participation, to help draw the connection:

 

##### Participation:

**_Denotes if all or only some entity occurrences participate in a relationship (in simple terms: at least)._**

 

So, we can think of multiplicity and its relationship to cardinality and participation in this manner:

 

**_MULTIPLICITY = (PARTICIPATION + CARDINALITY)_**
