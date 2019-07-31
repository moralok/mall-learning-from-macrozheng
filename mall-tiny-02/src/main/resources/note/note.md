**1. 运行 `MyBatis Generator` 的 Main 函数前关于 `generatorConfig` 的注意事项**
确保该配置文件内引用的文件都存在，如`generator.properties`，`CommentGenerator.java`等。

确保该配置文件内使用的文件路径正确，如`./src/main/resources`，作者使用的是`mall-tiny-01\src\main\java`

**2. 如果不在生成的 `Mapper.java` 文件上加注解，如 `@Repository`，检查时显示未被扫描进上下文，不影响编译运行成功**

**3. 重复`MyBatis Generator`生成步骤，生成的`Mapper.xml`文件会有问题**

作者已经在文档中给出解决方案，如果不修改代码，则删除文件后再执行；否则升级版本并添加配置。

**4. 分页结果不正确**

第一节中，PmsBrandServiceImpl 的 listBrand 方法，return 前多写了一次查询

