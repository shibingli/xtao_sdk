# XTao SDK for Java
极道存储 API，Java SDK 实现。

<b>例子：</b>

##获取极道存储SDK主函数

<pre>
<code>
IXTaoClient client= new XTaoClient("http://127.0.0.1:8888/api/v1", "admin", "nasadmin");
</code>
</pre>

##操作Node对象

<pre>
<code>
NodeListResult nodeListResult = client.GetNode().Lists();
if (nodeListResult.getStatus()) {
	nodeListResult.getResult().forEach((n) -> System.out
			.println(n.getNodeName() + "==>" + n.getHostDiskCount() + "==>" + n.getHostNicCount()));
} else {
	System.out.println(nodeListResult.getErrmsg());
}
</code>
</pre>

##操作Disk对象

<pre>
<code>
DiskListResult diskListResult = client.GetDisk().Lists("xt1");
if (diskListResult.getStatus()) {
	diskListResult.getResult().forEach((d) -> System.out.println(d.getUUID() + "==>" + d.getHCTL()));
} else {
	System.out.println(diskListResult.getErrmsg());
}
</code>
</pre>

##其它对象同上