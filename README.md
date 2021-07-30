# Assignment-backend-api

Read assignment instructions provided in pdf file.


# Project Management flow Implementation

	--Added 'maven-compiler-plugin' for maven properties
	--Added Lombok jar 
	--Added mapstruct dependency for conversion of entity into DTO object and vice versa
			-- please do mvn clean install and do maven update project for the mapstruct generation
	
	
#Issues Faced: Used java 11 environment though unable to start the APIs even after completion fo project
	-- Due to time constraint could not debug and fix this issue
	-- Junit test cases did not covered due to time constraint
		-- I will add junit- mockito dependency to write junit test cases for the controller to service classes
		-- With annotations @mock and @test used for the creation of mock classes and the test methods.
		 
#API-URLS

	--GetMapping()-api/projects
	--PostMapping()-api/projects - (json request body)
	--PutMapping()-api/projects/{id}		 