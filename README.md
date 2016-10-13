# XTao SDK for Java
极道存储 API，Java SDK 实现。

例子：

#获取极道存储SDK主函数

<code>
IXTaoClient client= new XTaoClient("http://127.0.0.1:8888/api/v1", "admin", "nasadmin");
</code>

#操作Node对象

<code>
		NodeListResult nodeListResult = client.GetNode().Lists();
		if (nodeListResult.getStatus()) {
			nodeListResult.getResult().forEach((n) -> System.out
					.println(n.getNodeName() + "==>" + n.getHostDiskCount() + "==>" + n.getHostNicCount()));
		} else {
			System.out.println(nodeListResult.getErrmsg());
		}
</code>

#操作Disk对象

<code>
		DiskListResult diskListResult = client.GetDisk().Lists("xt1");
		if (diskListResult.getStatus()) {
			diskListResult.getResult().forEach((d) -> System.out.println(d.getUUID() + "==>" + d.getHCTL()));
		} else {
			System.out.println(diskListResult.getErrmsg());
		}
</code>

#其它对象同上