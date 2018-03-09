# springboot-mapper-pagehelper
说明：

1.项目为个人学习springboot，已近完成springboot对通用mapper，pagehelper集成。项目中测试使用的是Idea的rest client，故没有单独写测试代码。

2.项目搭建借鉴了一些博客经验，在这里首先对博主们的无私表示感谢。

3.关于mapper/pagehelper集成：网上博客在集成mapper/pagehelper时，在application.properties中添加了关于通用mapper和pagehelper的配置

        #mapper
        mapper.mappers=tk.mybatis.mapper.common.Mapper
        mapper.not-empty=false
        mapper.identity=MYSQL

        #pagehelper
        pagehelper.helerDialect=mysql
        pagehelper.reasonable=true
        pagehelper.supportMethodsArguments=true
        pagehelper.params=count=countSql

集成mapper时，还添加了3个类

        MybatisAutoConfiguration.java
        MybatisMapperScannerConfig.java
        MybatisProperties.java

   ,个人项目中没有添加这些。

4.项目中目前只做集成测试，故只用到类一张表，sql脚本在resources/sql/file.sql。
