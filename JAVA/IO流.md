# IO流概述
- 通过FTP客户端程序，将文件读取至内存中（输入流）
- 通过FTP客户端程序，将内存中的文件信息写出至FTP服务器（输出流）

- 输入输出都已内存为基准，将信息往内存中写属于输入，将信息从内存往外流属于输出

# File类
- java通过File类来操作文件，文件的创建、删除、重命名、移动等功能
```java
File file = new File();
// 只能创建一级
file.mkdir()

// 可创建多级
file.mkdirs()
```

# 字符流
- 字符流用于读取文本文档，不适合读取音视频、多媒体文件，如果用于读取多媒体文件会导致文件失效，打不开
- 任何文字都代表一个字符
- 字符流读取数据以字符为单位，字节流读取数据以字节为单位

```java
// 刷新缓冲区数据至磁盘
flush()
```

# 对象流
- 序列化：把对象数据进行持久化保存到磁盘或进行网络传输
- 序列化对象：可以将对象保存到磁盘，也可以在网络中传输对象数据

- 序列化要求：
    - 被序列化对象要实现序列化接口Serializable
    - 开始对象序列化：使用ObjectOutputStream，将对象序列化成文件
- 反序列化对象：
    - 将序列化文件解析成对象
    - 反序列化对象，对象依然需要实现序列化接口Serializable
    - 使用ObjectInputStream将序列化文件输入到内存中来解析

# 面试问题
- 读写原始数据，采用什么流
（InputStream， OutputStream）
- 为了提高读写性能，采用什么流
（BufferedReader、BufferedInputStream、BufferedOutputStream）
- 对各种基本数据类型和String类型的读写，采用什么流
（DataInputStream、DataOutputStream）
- 能指定字符编码的I/O流类型
（InputStreamReader、OutputStreamWriter）
- File类型中定义了什么方法来判断一个文件是否存在
（exists）
- File类型中定义了创建多级目录的方法
（mkdirs）
- 对文本文件操作的I/O流
（FileReader、FileWriter）

