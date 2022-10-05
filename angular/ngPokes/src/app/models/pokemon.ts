//This is just a standard class, like one you'd see in java
//Why might we use these? say you're getting reimbursement data from the back end
//You can create a reimbursement class that parallels the java reimbursement response class
//So that you can throw that data straight into an existing class on the front end
export class Pokemon {

    //This constructor will initialize this pokemon's fields based on pokeAPI data.
    constructor(
        public name: string,
        public types: any,
        public sprites: any
    ){}

}
