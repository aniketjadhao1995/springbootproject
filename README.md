# springbootproject

Endpoint 1: POST – http://localhost:8082/employees
Working - Adds new employee in database with details
Request Body example - 
{
    "employeeFirstName": "Aniket",
    "employeeLastName": "Jadhao",
    "employeeEmail": "aniket@gmail.com",
    "employeeAge": "27"
}

Endpoint 2: GET – http://localhost:8082/employees
Working - Fetch list of all employees present in database

Endpoint 3:  PUT – http://localhost:8082/employees/{id}
Working - Update employee details mentioned by id {id}
Request Body Example - 
{
    "employeeFirstName": "Aniket",
    "employeeLastName": "Jadhao",
    "employeeEmail": "aniketjadhao@gmail.com",
    "employeeAge": "27"
}
Endpoint 4: DELETE – http://localhost:8082/employees/{id}
Working - Delete employee from the database with the mentioned employee id {id}
