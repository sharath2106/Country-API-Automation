# Country-API-Automation

For this project, the link provided to access the services are down. And they are not working since the start of this task. 
So, for execution purposes I've created a new Country API service using Springboot. 

## **Steps to run the tests**

- Clone the repo - https://github.com/sharath2106/SpringBoot-API.git
```sh
# Get into the repo
$  cd SpringBoot-API

# Run Springboot services using maven
$ mvn spring-boot:run

```

- Check for the services up and running in - http://localhost:8080/

- Now, clone the current repo - https://github.com/sharath2106/Country-API-Automation.git

```sh
# Get into the repo
$ cd Country-API-Automation

# Execute tests using maven
$ mvn clean test

```
- Now, the tests are up and running against the API.

### Test cases to be covered

Please create the following automated test scenarios:
- Get all countries and validate that US, DE and GB were returned in the response - DONE
- Get each country (US, DE and GB) individually and validate the response  - DONE
- Try to get information for inexistent countries and validate the response - DONE (API returns 500 instead of 404, it's intentionally made so that we can witness the test failing for the assertion)
- This API has not a POST method at the moment, but it is being developed. Write a test that would validate new country addition using POST(it will not work now, but no worries). - DONE 
