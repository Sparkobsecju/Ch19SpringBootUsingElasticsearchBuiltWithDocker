
This is a prototype to show Spring Boot using dependency of Elasticsearch.<br>

Step:<br>

go to root folder of project and execute the instruction.<br>
  ```docker-compose up -d```<br>
After running the docker, you can curl to see whether the elasticsearch service opens with compose file.<br>
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
you can CRUD data in RESTful way.<br>


To see the GUI like below, make sure download tools including elasticsearch-head and postman.<br>

![截圖 2024-07-07 下午3 55 04](https://github.com/Sparkobsecju/Ch19SpringBootUsingElasticsearchBuiltWithDocker/assets/160079818/236048f3-6d17-438f-a1b2-5c09b16be271)

![截圖 2024-07-07 下午4 20 25](https://github.com/Sparkobsecju/Ch19SpringBootUsingElasticsearchBuiltWithDocker/assets/160079818/08bd0f92-40d2-4eb5-a137-7198054788ba)

The examples and code snippets in this project are based on the content from the book “Spring Boot” by 孫鑫 <br>https://deepwisdom.com.tw/%e8%b3%87%e6%ba%90%e4%b8%8b%e8%bc%89/.<br> All rights to the original content belong to the author and the publisher. This project aims to provide educational content and share best practices in software development.
