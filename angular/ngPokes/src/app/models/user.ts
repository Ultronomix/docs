export class User {

    constructor(
        public username:string,
        public password?:string 
        //TWO notes:
        //the ? makes a variable optional (nullable)
        //of course, you won't want you password on the front end
            //The user class in the front end will likely model your UserResponse Class
    ){}

}
