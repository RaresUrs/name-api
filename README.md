To run the application: <br>
<ul>
    <li>
        Pull the latest image from docker hub: <h4>docker pull raresurs/name-api</h4>
    </li>
    <li>
    Run the image with the following command:
    <h4>
        docker run -p 8080:8080 raresurs/name-api
    </h4>
    </li>
    <l1>
        You should be able to hit the application at
        <h4>    
            http://localhost:8080
        </h4>
    </l1>
</ul>

The following endpoints are available to be hit:

<ul>
    <l1>
        POST
        localhost:8080/addNumber/{numberToBeAdded}
        The response should be 200 and should return back an object containing all the numbers that are in the list so far with their average and their maximum.
    </l1> 
    <br>
    <br>
    <l1>
        GET
        localhost:8080/refresh
        This endpoint is used to refresh the numbers that are currently in use.
    </l1>
</ul>

I have added an <b>API_COLLECTION.json</b> located in the resources directory