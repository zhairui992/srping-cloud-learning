# CONFIG

spring cloud 中可以存在很多服务，每个服务都有自己的配置，维护和更新配置文件是一个非常复杂的事情。

简单的来说，Spring Cloud Config 就是能将各个 应用/系统/模块 的配置文件存放到 统一的地方然后进行管理(Git 或者 SVN)。

可以用config + bus 的模式更新微服务集群中的配置。
