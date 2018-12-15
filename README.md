# jdk源码阅读
    记录阅读源码的心得体会
        
## 内容介绍        
  * OpenJDK-8 源码, 阅读学习使用
  * src/目录放置OpenJDK-8 源码,注释记录心得体会<br>
  * src/test目录放置阅读过程中的测试代码文件<br>

## 阅读顺序 参考
#### [阅读顺序参考](https://blog.csdn.net/qq_21033663/article/details/79571506)
## 已阅读清单
### java.lang
* native关键字<br>
* private static native void registerNatives()方法<br>
* clone()方法: native方法,具体的实现是由C/C++完成的;<br>
* getClass()方法: native方法,返回的是此对象的类对象/运行时的类对象Class<br>
* 类对象概念: 在Java中.类是对具有一组相同特征或行为的实例的抽象并进行描述,对象则是此类所描述的特征或行为的具体实例.<br>
             作为概念层次的类,其本身也有某些共同的特征,如都具有类名称、由类加载器加载、都具有包、具有父类,属性和方法等.于是Java<br>
             中专门定义了一个类,去描述其他的类的这些特性,因此从角度上看,类本身也是属于Class类的对象.为了与经常意义上的对象相区别,<br>
  称之为类对象<br>
* toString()方法: 由对象的类型和hashCode()返回的哈希值唯一确定,由于哈希值有可能相同,所以同一类型但不相等的两个对象分别<br>
                  调用toString()方法返回的结果可能相同 
* wait()方法 和 notify()/notifyAll() 一般在线程操作使用,且成对出现,都是native方法
* finalize()方法: 垃圾收集器在垃圾收集时调用对象<br>
                     * 确定不再存在对该对象的引用<br>
                     * 不是由我们主动调用的<br>
                     * 调用时机: JVM对此对象所占用的内存空间进行垃圾回收前将被调用<br>

### java.util

