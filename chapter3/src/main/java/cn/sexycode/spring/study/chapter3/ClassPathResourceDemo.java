package cn.sexycode.spring.study.chapter3;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.Date;

/**
 * ClassPathResource 示例
 * @author qinzaizhen
 */
public class ClassPathResourceDemo {
    public static void main(String[] args) throws IOException {
        ClassPathResource resource = new ClassPathResource("app.xml");
        System.out.println("资源文件是否存在：" + resource.exists());
        System.out.println("资源文件是否是文件：" + resource.isFile());
        System.out.println("资源文件是否可读：" + resource.isReadable());
        System.out.println("资源文件名称：" + resource.getFilename());
        System.out.println("资源文件：" + resource.getFile());
        System.out.println("资源文件描述：" + resource.getDescription());
        System.out.println("资源文件URL：" + resource.getURL());
        System.out.println("资源文件URI：" + resource.getURI());
        System.out.println("资源文件长度：" + resource.contentLength());
        System.out.println("资源文件最后修改时间：" + new Date(resource.lastModified()));
        System.out.println("资源文件数据：" + new String(resource.getInputStream().readAllBytes()));
        Resource resourceRelative = resource.createRelative("relative.xml");
        System.out.println("相对路径资源：" + resourceRelative);
        System.out.println("相对路径资源是否存在：" + resourceRelative.exists());
        System.out.println("相对路径资源文件：" + resourceRelative.getFile());
    }
}
