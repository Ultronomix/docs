Our IDE for writing our User Interfaces (UI) is VSCode. Here’s a download link:

<https://code.visualstudio.com/download>

**VSCode Extensions List (feel free to add comments on more)**

-**Live server** (lets us right click an HTML file and open quickly “open with live server”

-**vscode-icons** (lets us see better icons in our vscode)

-**Prettier** (code formatter, makes your code look more sane)

-**Intellicode** (gives us predictive options while writing our files)

# What is HTML?

- **HyperText Markup Language (HTML)** is used to create web pages (User interface!)
  - A markup language (HTML, XML, etc) is **descriptive not programmatic.** In English, HTML is not a programming language. It’s… a markup language!
  - HyperText refers to the ability of HTML to easily “link” to other pages. 
    - **It’s the face, not the brain**. It creates what a web page looks like (along with CSS), whereas **javascript** is what actually gives webpages functionality. 
- HTML is the standard for **displaying web pages on the internet.** 
- **HTML syntax** is broken down into two subsets: **elements and attributes.** 

**Syntax 1.) HTML Elements**

- Elements provide the **structure of the document** and are defined by tags.
  - Eg. `<div> this is a div element, surrounded by the div tag </div>`
- HTML must have it tags **properly nested** in order to be valid
  - Correct: `<div> <p> </p> </div>`
  - Incorrect:  `<div> <p> </div> </p>`

- There are two categories/types of elements: (QC loves to ask about the differences)
  - **Block elements:** These elements will **render as a block on the page**, meaning any following element will render on a new line by default. Basically, block elements take up an entire line for themselves. In other words, it **blocks a line for itself**.**   
  - **Inline elements:** These elements can sit next to each other on the same line when rendered. Can be rendered **in** the same **line** as each other. 

- Common HTML elements (NOT a comprehensive list): 
  - div: defines a “division” of the page. Often contains other elements. (block)
  - h1 through h6: header tags. 1 is the largest 6 is the smallest. (block)
  - p: defines a paragraph (block) 
  - span: standard inline element. 
  - br: line break (does not need a closing tag)  (inline)
  - img: displays an image (does not need closing tag) (inline)
  - a: anchor tag used to make a hyperlink. (inline)

**Syntax 2.) HTML Attributes**

- Attributes are metadata used to **describe the elements**; you can think of them as parameters defining the specific element tag.
- Attributes are defined **within a tag** of an element as a key/value pair.
  - For instance, in an image tag, the browser needs to know the location of the image: `<img src="www.myimage.com/puppy/"/>`
    - src is the attribute in this case, telling the browser where to find the image
    - Btw, you technically don’t need any closing tag for `<img>`, but you can still add it for clarity.
- Global attributes are those that can be applied to any tag. These will be very useful when we start messing with CSS. Some include:
  - class - you can group elements together under a class name
  - id - a good way to uniquely identify an element
  - hidden - used to hide an element
  - style - if you want to use inline styling (not best practice for CSS)
  - title - lets you add text that appears as a popup when you scroll over an element

**HTML Doctype Declaration & Root Tag**

- `<!DOCTYPE html>` 
  - This is the **doctype declaration.**  It informs the browser what type of document we are displaying (HTML) as well as the version if you want. The one above defines an HTML 5 document. 
  - **THIS IS NOT CONSIDERED A TAG!** It’s the doctype declaration.

- The root tag of an HTML document is `<html>`. 
  - **All of your HTML must go in between the opening and closing tags of this element.**
  - The HTML page is then further divided into a **<head>** section, usually for metadata, and the **<body>** section for actual content to be displayed. 

\*We started our HTML/CSS demo here\*


**HTML Lists**

- HTML has built-in functionality for displaying lists of items.
- There are two types of lists: **Ordered and Unordered**
  - **Ordered lists** have a progression such as 1 2 3… etc.
  - **Unordered lists** have no order. They are all represented by the same character - usually a bullet.
- Ordered lists use the `<ol>` tag
- Unordered lists use the `<ul>` tag.
- Items in both types of lists use the `<li>` tag.
- Note: Lists of either type can be nested inside other lists.

**HTML Tables**

- Tables are an easy way to **structure our HTML pages and display information**. There was a time where almost all HTML pages were just giant tables. 
  - We looked at the spacejam website (1996) and she was very table centric and had other fun stuff to look into

- To create a table, we begin with a `<table>` tag
- `<thead>` will define header rows`
  - Inside that, we can have the `<tr>` which creates actual rows
    - `<th>` will then give the actual cell data for that header cell
- `<tbody>` defines the body of a table
  - Each row of the table will have a `<tr>` tag
    - Individual cells in the row will have a `<td>` tag
- `<tfoot>` can be used to add a footer element to your table.

**HTML Forms** 

- **I recommend you don’t use forms for full stack just yet, they’re tricky to work with at the moment. Input boxes are probably your best bet at this stage.**

- HTML has built-in functionality for forms. **Forms take various inputs and submit them to a server or handle them with Javascript etc.**

- **Input elements** include: 
  - Text - general use text input
  - Password - prevents the inputs from being displayed on the screen. 
  - Radio Buttons - select one from a list of options. 
  - Checkboxes - select multiple from a list of options
  - Select Boxes - drop down menu to select an option
  - File select boxes - Allows you to upload a file from your local machine. 
  - Text Area - A multi-line text field. 
  - Reset and Submit buttons. 
- **Attributes** used in forms: 
  - **Type** - type of input you’re creating
  - Action - how (or where) the form data will be processed. 
  - **Name** - each input needs a name value so the data can be labeled/accessed. 
  - Method - What HTTP method the form will use to send the form. GET or POST. 
  - **Value** - the initial value of the field. 
  - **Placeholder** - this is a “hint” that describes what should be entered in the field. 
  - Required - This field must have an input in order for the form to be submitted. 
  - Min and Max - give minimum or maximum values that can be imputed into the field.
- The `<label>` tag can be used to give a text label to an input field. 


# What is CSS? 

- **Cascading Style Sheet** - A language for **styling HTML documents**. 
- It specifies certain rules for layout and display of HTML elements. 
- CSS uses key/value pairs to indicate the styling to apply. 
- Style Sheets are a simple but powerful way of **changing how our HTML document is rendered to make it more pleasant to look at.** 
- CSS is broken down into **selectors and declarations**
  - **Selector**: Defines the HTML element(s) you are styling. 
  - **Declaration**: Defines the style you are imposing on the selector.
    - The sum of a Selector and a Declaration is known as a **Ruleset**.

**Where can we put CSS?**

- There are **three places you can declare CSS styling**
  - **External Style Sheets** (this tends to be best practice)
    - A separate CSS document that you link to in your HTML
  - **Internally in the <head>** (pretty uncommon)
  - **Inline of the actual HTML element tag** (not best practice but easy and ok to do in a pinch) 
- In case of conflicts? What if you’re trying to style the same element in multiple declarations?
  - **The CSS closest to the element will “win”** in conflicts
    - So inline styling beats head styling which beats external style sheets

\*Added CSS to our HTML/CSS demo\*

**CSS Box Model**

- CSS treats each HTML element in the document as a “box”. Each box has its own 4 regions that can all be styled independently of one another.
- ![](https://codinglead.co/images/box-model.png)
- **Margin:** The outermost layer. Useful for separating the element from its neighbors. The dimensions are given by the margin-box width and the margin-box height/width.

- **Border:** The layer between the margin and padding, its dimensions are given by the width and height of the border. This is the element that is often given a |visible border|


- **Padding:** The layer between the content and within the border box. Its dimensions are given by the width and height of the padding box.

- **Content:** This consists of the actual content of the element such as text, images, or any other media. It’s bounded by the content edge and its dimensions are given by content-box width and content-box height.

**CSS Properties**

- There are many, many properties that can be styled with CSS. Some include:
  - **Padding: Gives space between content and its border**
    - We can pad top/right/bottom/left of an element
    - Giving the generic padding with numbers will shorthand the filling out of these options:
      - 1 Number: all four sides {padding:70px;}
      - 2 Numbers: first number is the top and bottom, the second is right and left. {padding:35px 70px;}
      - 3 Numbers: first number is the top, second is left and right, 3rd is the bottom {padding: 25px 45px 70px;}
      - 4 Number: first number is the top, 2nd is right, 3rd is bottom, 4th is left. {padding: 25px 45px 70px 80px;}
  - **Border: Wraps an element with a border between its padding and margin**
    - Border width
    - Border style (dashed, dotted, no border, etc.)
      - Default border style is no border, you have to specify in order to actually see it
    - Border color
  - **Margin: Similar to padding, but outside of the border**
    - Separates an element and its box from neighboring elements
  - **Display:** Determines whether it’s an inline or block element. The display behavior
  - **Position:** Determines where on the page the element is displayed
    - Static - The element’s box is arranged normally. This is the default
    - Relative - Defaults to the normal position, but can change RELATIVE to the other elements’ positioning
    - Absolute - The element’s box is placed in an ABSOLUTE position on the page, such as top right or bottom left. When you scroll, it will follow.
    - Fixed - The element’s box is in a FIXED location in the window, unaffected by user scrolling or other elements.
  - **Color:** Allows you to change the color of an element 
    - Includes simple options like “red” but you can use rbg, hex color codes, or hsl. 
  - **Text Align:** Sets the text inside the content to be of a particular alignment. I.e. left/right justified, or centered 

**CSS Selectors**

- “Selectors are how we choose (hence SELECTors) which HTML element to style.” -Good starting QC line

- **Element Selectors:** Selects all the instances of an HTML element


|<p>**p {**</p><p>`     `**text-align:center;**</p><p>`     `**color:blue;**</p><p>**}**</p>|
| :- |

- **ID Selectors:** Selects elements by the ID attribute. IDs should be unique. **Uses the # to select. Better for individual elements**


|<p>**#div1 {**</p><p>`     `**text-align:center;**</p><p>`     `**color:blue;**</p><p>**}**</p>|
| :- |


- **Class Selectors:** Will style any element with the declared class attribute. **Uses the . to select.** Can be combined with an element selector! **Better for groups of elements.**



|<p>**.intro {**</p><p>`     `**text-align:center;**</p><p>`     `**color:blue;**</p><p>**}**</p>|
| :- |


|<p>**p.intro {**</p><p>`     `**text-align:center;**</p><p>`     `**color:red;**</p><p>**}**</p>|
| :- |







- **Universal selector** - selects everything. Uses the \*

|<p>**\* {**</p><p>`     `**text-align:center;**</p><p>`     `**color:pink;**</p><p>**}**</p>|
| :- |

//FOR QC you can probably just know the above 4 selects and be fine. Just be good on their syntax and use cases. The rest of them below are nice to know if you want more advanced styling


- Attribute Selector - Allows you to select elements that declare a specific attribute. Uses the [] to select.

|<p>**[title] {**</p><p>`     `**text-align:left;**</p><p>`     `**color:blue;**</p><p>**}**</p><p></p><p>**[class=”warning”]{**</p><p>`     `**color:green;**</p><p>**}**</p>|
| :- |


- Grouping Selectors: you can group multiple selectors and apply the same style. Simply declare the selectors and separate them with a comma

|<p>**H1, #para1 {**</p><p>`     `**text-align:left;**</p><p>`     `**color:red;**</p><p>**}**</p>|
| :- |



**Bootstrap 5 (here if anyone wants to check it out, but we’ll see it later)**

- Why write your own CSS when you can **STEAL** someone else’s? Bootstrap basically lets you do this. It’s an open source framework with a “mobile first” design approach. Bootstrap is used pretty much everywhere nowadays
- It uses HTML 5 and CSS3 to **give predefined styling to web pages**. This styling is capable of being resized and displayed on most any sized screen.

- Bootstrap can be added to your webpage in two main ways:
  - You can download it directly from getbootstrap.com
  - You can simply **use a link tag to the bootstrap CDN in your header**
  - **Linked here for your convenience:**
    - **<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">**

**Bootstrap Grid System**

- Bootstrap uses a layout called the grid system. It consists of containers which contain rows, which themselves contain columns. **This layout will be responsive to window size changes.** (If used correctly)
  - **This is how we achieve responsive web design.** It’s RESPONSIVE to window size changes

- **Containers** are the basic layout element used to wrap the content of a web page. There are two container classes:
  - Container - responsive fixed-width container
  - Container-fluid - full width container that spans the entire viewport.
    - A viewport is **a region of the screen used to display a portion of the total image to be shown**. It sizes the screen to match the screen size of the user

- **Rows** are horizontal slices of a container. They are created with the “row” class. Rows have a base size of 12 (the typical width of a webpage)

- **Columns** have a dynamic width determined by their size relative to the size of the row in the container’s view. 
- Columns can be assigned a size. If the size of the columns exceeds 12, the column exceeding the size will be moved below the columns that do not.
  - So we can have a 3, a 3, and a 6, and they’d all print inline
  - class=”col-sm-3” col is for column, the sm (small) represents the default size of the column, and the 3 is the relative size compared to the row’s size of 12. 

**Common Bootstrap Styled Elements**

- Bootstrap has many classes to style all sorts of HTML elements
- **Bootstrap Tables** are predefined styling for tables** that can be declared again by class.
  - class=”table table-dark” creates a table with a dark background
  - Table-bordered = add a border around the table
  - Table-striped = adds zebra striping to the table
- Bootstrap has a bunch of **button classes** that let you color your buttons. E.g. btn-danger will give you a red button.
- Bootstrap has a **navbar** class associated with styling navbars.
- MANY MANY more which I’ll try to show here and there. This is the entire list of them: <https://getbootstrap.com/2.3.2/components.html>

