# islandExample

This project is based of SpringBoot framework(using Maven). 
Clone the project locally and download maven dependancies using: `mvn clean install`

To run the project, run: `mvn spring-boot:run`

# To test 

Test API using curl:

```
curl --location --request POST 'http://localhost:8082/' \
--header 'Content-Type: application/json' \
--data-raw '{
    "grid": [
            [ 0, 0, 0, 0, 0, 0, 0, 0 ],
            [ 0, 1, 1, 1, 0, 0, 0, 0 ],
            [ 0, 1, 1, 0, 0, 0, 1, 0 ],
            [ 0, 0, 1, 0, 0, 0, 1, 0 ],
            [ 1, 0, 0, 0, 0, 0, 0, 0 ],
            [ 1, 0, 0, 0, 1, 0, 1, 0 ],
            [ 0, 0, 0, 0, 0, 0, 1, 0 ],
            [ 0, 0, 1, 0, 1, 0, 0, 0 ] ],
    "strategy": "omni"
}'
```

Value options for strategy: `omni` and `ortho`

_Note: If no value is provided in strategy, the default strategy used would be `ortho`_