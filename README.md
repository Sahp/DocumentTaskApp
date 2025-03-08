# Document and Task Management Web App

A simple web application built with Java, JavaScript, jQuery, HTML, and CSS to manage documents and tasks. This is a demo based on my 8-year experience developing similar systems for government agencies and companies.

## Features
- Upload documents (simulated).
- Assign tasks (simulated).
- Display lists of documents and tasks.

## Technologies
- **Backend**: Java (Servlet)
- **Frontend**: HTML, CSS, JavaScript, jQuery
- **Database**: Simulated (replaceable with Oracle in production)

## How to Run
1. Deploy `DocumentTaskServlet.java` on a server like Tomcat.
2. Open `index.html` via the server URL (e.g., `http://localhost:8080/DocumentTaskServlet`).
3. Use the forms to upload documents and assign tasks.

## Notes
In a real project, I connect to an Oracle database using JDBC for storing data.