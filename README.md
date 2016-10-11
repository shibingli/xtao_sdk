# xtao_sdk
极道存储 API，Java SDK 实现。

IXTaoClient xtaoClient= new XTaoClient("http://127.0.0.1:8888/api/v1", "admin", "nasadmin");

例子：

#获取极道存储SDK主函数
IXTaoClient xtaoClient= new XTaoClient("http://127.0.0.1:8888/api/v1", "admin", "nasadmin");

#操作Node对象
client.GetNode().Lists().forEach((n) -> System.out
				.println(n.getNodeName() + "==>" + n.getHostDiskCount() + "==>" + n.getHostNicCount()));

#操作Disk对象
client.GetDisk().Lists("xt1").forEach((d) -> System.out.println(d.getUUID() + "==>" + d.getHCTL()));

#其它对象同上