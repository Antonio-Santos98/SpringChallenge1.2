<div align="center">

  <img src="default-logo-darkbg.png" alt="logo"/>
  <h1>Spring Interview Final / Mid-Term Project</h1>
</div>
<!-- About the Project -->

## About the Project
This is a Spring Boot project that is used to assess the skills of a mentee on the MVC architecture. The UI and database are set up for the mentee, and all they have to do is se tup up the business logic to perform CRUD operations.

## Assessment Requirements
You will be expected to perform full CRUD operations depending on time constraints. Make sure to review the code that is already there to get a better understanding of the project and how you need to be handling data on the UI and the backend.

Endpoints manipulate data should be set up based on the following steps. You may also need an additional endpoint to view the `/book/addBook` page. You will need to create a new endpoint for this.

You will also need to create the model for you book entity.

### Book Entity attributes
- ISBN - Primary Key
- Name
- Author

### Steps
#### Get all books
- Returns all books in the database to the UI
- Endpoint: `/book/viewBooks`
- You JSP is `view-books.jsp`

#### Create a new book
- Adds a new book to the database
- Endpoint: `/book/addBook`
- Your JSP is `add-book.jsp`

#### Update a book
- Updates a book in the database by sending the full book params to the backend
- Endpoint: `/book/addBook`
- Your JSP is `edit-book.jsp`

#### Delete a book
- Deletes a book from the database by ISBN
- Endpoint: `/book/deleteBook/{isbn}`
- Your JSP is `edit-book.jsp`

