# springmvc_day01_start1
博客地址 ：https://blog.csdn.net/weixin_45397785/article/details/121304761?spm=1001.2014.3001.5502


入门案例的执行过程分析
1. 入门案例的执行流程
1. 当启动Tomcat服务器的时候，因为配置了load-on-startup标签，所以会创建DispatcherServlet对象，
就会加载springmvc.xml配置文件
2. 开启了注解扫描，那么HelloController对象就会被创建
3. 从index.jsp发送请求，请求会先到达DispatcherServlet核心控制器，根据配置@RequestMapping注解
找到执行的具体方法
4. 根据执行方法的返回值，再根据配置的视图解析器，去指定的目录下查找指定名称的JSP文件
5. Tomcat服务器渲染页面，做出响应
2. SpringMVC官方提供图形
package cn.itcast.controller; import org.springframework.stereotype.Controller; import org.springframework.web.bind.annotation.RequestMapping; /*** 控制器 * @author rt */ @Controller public class HelloController { /*** 接收请求 * @return */ @RequestMapping(path="/hello") public String sayHello() { System.out.println("Hello SpringMVC!!"); return "success"; } } <body><h3>入门成功！！</h3> </body>
3. 入门案例中的组件分析
1. 前端控制器（DispatcherServlet） 2. 处理器映射器（HandlerMapping） 3. 处理器（Handler） 4. 处理器适配器（HandlAdapter） 5. 视图解析器（View Resolver） 6. 视图（View）
请求参数的绑定
1. 请求参数的绑定说明
1. 绑定机制
1. 表单提交的数据都是k=v格式的 username=haha&password=123
2. SpringMVC的参数绑定过程是把表单提交的请求参数，作为控制器中方法的参数进行绑定的
3. 要求：提交表单的name和参数的名称是相同的
2. 支持的数据类型
1. 基本数据类型和字符串类型
2. 实体类型（JavaBean） 3. 集合数据类型（List、map集合等）
2. 基本数据类型和字符串类型
1. 提交表单的name和参数的名称是相同的
2. 区分大小写
3. 实体类型（JavaBean） 1. 提交表单的name和JavaBean中的属性名称需要一致
2. 如果一个JavaBean类中包含其他的引用类型，那么表单的name属性需要编写成：对象.属性 例如：
address.name
4. 给集合属性数据封装
1. JSP页面编写方式：list[0].属性
5. 请求参数中文乱码的解决
6. 自定义类型转换器
1. 表单提交的任何数据类型全部都是字符串类型，但是后台定义Integer类型，数据也可以封装上，说明
Spring框架内部会默认进行数据类型转换。
2. 如果想自定义数据类型转换，可以实现Converter的接口
