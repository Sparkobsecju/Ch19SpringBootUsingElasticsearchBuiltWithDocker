
This is a prototype to show Spring Boot using dependency of Elasticsearch.<br>

Step:<br>

go to project root folder and execute<br>
  ```docker-compose up -d```<br>
And run the project<br>
  ```curl localhost:9200```<br>

Then you'll see the description like below.<br>
```
{
  "name" : "4c6477d19f9e",
  "cluster_name" : "docker-cluster",
  "cluster_uuid" : "pqBe64YaRg6OsV4FGPjOXA",
  "version" : {
    "number" : "8.14.1",
    "build_flavor" : "default",
    "build_type" : "docker",
    "build_hash" : "93a57a1a76f556d8aee6a90d1a95b06187501310",
    "build_date" : "2024-06-10T23:35:17.114581191Z",
    "build_snapshot" : false,
    "lucene_version" : "9.10.0",
    "minimum_wire_compatibility_version" : "7.17.0",
    "minimum_index_compatibility_version" : "7.0.0"
  },
  "tagline" : "You Know, for Search"
}
```
<br>
you can CRUD book RESTfully<br>


To see the GUI like below, make sure download elasticsearch-head tool.<br>

![截圖 2024-07-07 下午3 55 04](https://github.com/Sparkobsecju/Ch19SpringBootUsingElasticsearchBuiltWithDocker/assets/160079818/236048f3-6d17-438f-a1b2-5c09b16be271)
