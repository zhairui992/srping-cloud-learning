# Fegin

有了 Eureka、RestTemplate、Ribbon已经可以完成服务之间的相互调用了，但是每次都使用RestTemplate调用很不方便。

```java
	@GetMapping("/info")
	public String getInfo() {
		return this.restTemplate.getForEntity("http://SERVERPROVIDER/hello", String.class).getBody();
	}
```

我们希望想调用源代码一样，调用服务中的接口，Fegin就可以完成这个功能；

## maven 引入
```xml
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-openfeign</artifactId>
		</dependency>
```

## java程序
```java
@FeignClient("SERVERPROVIDER")
public interface Testservice {

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	String hello(); 
}

public class TestController {
	
	@Autowired
	private Testservice testservice;

	@GetMapping("/info")
	public String getInfo() {
		return testservice.hello();
	}
}

```
如此我们就可以完成对远程服务的调用了。