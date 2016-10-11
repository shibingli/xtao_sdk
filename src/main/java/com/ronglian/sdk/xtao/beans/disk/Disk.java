/**
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p>
 * <p>Author:Eric Shi/史丙利</p>
 * @Title: Disk.java
 * @Package com.ronglian.sdk.xtao.beans
 * @date 2016年9月24日 下午3:24:06 
 */
package com.ronglian.sdk.xtao.beans.disk;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.annotation.JSONField;
import com.ronglian.sdk.xtao.SDKUtils;
import com.ronglian.sdk.xtao.beans.BaseBean;
import com.ronglian.sdk.xtao.beans.PublicResult;
import com.ronglian.sdk.xtao.beans.user.User;
import com.ronglian.sdk.xtao.exception.AuthException;
import com.ronglian.sdk.xtao.exception.HttpException;

/**
 * <p>
 * Copyright: All Rights Reserved
 * </p>
 * <p>
 * Company: 北京荣之联科技股份有限公司 http://www.ronglian.com
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Author:Eric Shi/史丙利
 * </p>
 */
public class Disk extends BaseBean {

	/**
	 * <p>
	 * Description:
	 * </p>
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 * 
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = 3182834081887368629L;

	public static enum CACHE_MODE {
		writeback, readonly;
	}

	public static enum USER_CACHE {
		yes, no;
	}

	/**
	 * <br/>
	 * Description:
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public Disk() {
	}

	@JSONField(name = "status")
	private String Status;

	@JSONField(name = "capacity")
	private String Capacity;

	@JSONField(name = "UUID")
	private String UUID;

	@JSONField(name = "HCTL")
	private String HCTL;

	@JSONField(name = "journal")
	private String Journal;

	@JSONField(name = "cluster")
	private String Cluster;

	@JSONField(name = "state")
	private String State;

	@JSONField(name = "usage")
	private String Usage;

	@JSONField(name = "disk_type")
	private String DiskType;

	@JSONField(name = "used")
	private String Used;

	@JSONField(name = "weight")
	private String Weight;

	@JSONField(name = "commit")
	private String Commit;

	@JSONField(name = "OSD")
	private String OSD;

	@JSONField(name = "minor")
	private String Minor;

	@JSONField(name = "latency")
	private String Latency;

	@JSONField(name = "size")
	private String Size;

	public Disk(String endpoint, User user) {
		this.setUser(user);
		this.setEndpoint(endpoint);
	}

	/**
	 * <br/>
	 * Description:获取机器的磁盘列表
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public List<Disk> Lists(String nodeName) throws IOException, AuthException, HttpException {

		Map<String, String> maps = new HashMap<>();
		maps.put("node_name", nodeName);

		DiskListResult diskResult = Post(this.getEndpoint(), "/nodes/disk/list_disks", this.GetUserToken(), maps,
				DiskListResult.class);

		if (!SDKUtils.ParseBoolean(diskResult.getStatus())) {
			throw new HttpException(diskResult.getErrmsg());
		}

		return diskResult.getResult();
	}

	/**
	 * <br/>
	 * Description:查看某张磁盘的详细信息
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public Disk Status(String nodeName, String hctl) throws IOException, AuthException, HttpException {

		Map<String, String> maps = new HashMap<>();
		maps.put("node_name", nodeName);
		maps.put("HCTL", hctl);

		DiskStatusResult diskStatusResult = Post(this.getEndpoint(), "/nodes/disk/status_disk", this.GetUserToken(),
				maps, DiskStatusResult.class);

		if (!SDKUtils.ParseBoolean(diskStatusResult.getStatus())) {
			throw new HttpException(diskStatusResult.getErrmsg());
		}

		return diskStatusResult.getResult();
	}

	/**
	 * <br/>
	 * Description:点亮/熄灭某张磁盘的LED灯(定位磁盘)
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String Locate(String nodeName, String hctl) throws IOException, AuthException, HttpException {

		Map<String, String> maps = new HashMap<>();
		maps.put("node_name", nodeName);
		maps.put("HCTL", hctl);

		PublicResult publicResult = Post(this.getEndpoint(), "/nodes/disk/locate_disk", this.GetUserToken(), maps,
				PublicResult.class);

		if (!SDKUtils.ParseBoolean(publicResult.getStatus())) {
			throw new HttpException(publicResult.getErrmsg());
		}

		return publicResult.getResult();
	}

	/**
	 * <br/>
	 * Description:清理某张盘的分区和数据
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String Clear(String nodeName, String hctl, String FSType)
			throws IOException, AuthException, HttpException {

		Map<String, String> maps = new HashMap<>();
		maps.put("node_name", nodeName);
		maps.put("HCTL", hctl);
		maps.put("fs_type", FSType);

		PublicResult publicResult = Post(this.getEndpoint(), "/nodes/disk/clear_disk", this.GetUserToken(), maps,
				PublicResult.class);

		if (!SDKUtils.ParseBoolean(publicResult.getStatus())) {
			throw new HttpException(publicResult.getErrmsg());
		}

		return publicResult.getResult();
	}

	/**
	 * <br/>
	 * Description:获取FileSystem类型
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String[] FSTypes() throws IOException, AuthException, HttpException {

		DiskFSTypesResult diskFSTypesResult = Post(this.getEndpoint(), "/nodes/disk/get_disk_fs_type",
				this.GetUserToken(), new HashMap<>(), DiskFSTypesResult.class);

		if (!SDKUtils.ParseBoolean(diskFSTypesResult.getStatus())) {
			throw new HttpException(diskFSTypesResult.getErrmsg());
		}

		return diskFSTypesResult.getResult();
	}

	/**
	 * <br/>
	 * Description:在清理完某张磁盘后，将它初始化，为加入存储集群做准备
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String Init(String nodeName, String hctl, boolean userCache)
			throws IOException, AuthException, HttpException {

		Map<String, String> maps = new HashMap<>();
		maps.put("node_name", nodeName);
		maps.put("HCTL", hctl);
		maps.put("use_cache", SDKUtils.BooleanToYes(userCache));

		PublicResult publicResult = Post(this.getEndpoint(), "/nodes/disk/init_disk", this.GetUserToken(), maps,
				PublicResult.class);

		if (!SDKUtils.ParseBoolean(publicResult.getStatus())) {
			throw new HttpException(publicResult.getErrmsg());
		}

		return publicResult.getResult();
	}

	/**
	 * <br/>
	 * Description:将初始化后的磁盘加入存储集群
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String Join(String nodeName, String hctl) throws IOException, AuthException, HttpException {

		Map<String, String> maps = new HashMap<>();
		maps.put("node_name", nodeName);
		maps.put("HCTL", hctl);

		PublicResult publicResult = Post(this.getEndpoint(), "/nodes/disk/join_disk", this.GetUserToken(), maps,
				PublicResult.class);

		if (!SDKUtils.ParseBoolean(publicResult.getStatus())) {
			throw new HttpException(publicResult.getErrmsg());
		}

		return publicResult.getResult();
	}

	/**
	 * <br/>
	 * Description:将磁盘从存储集群中退出
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String Leave(String nodeName, String hctl) throws IOException, AuthException, HttpException {

		Map<String, String> maps = new HashMap<>();
		maps.put("node_name", nodeName);
		maps.put("HCTL", hctl);

		PublicResult publicResult = Post(this.getEndpoint(), "/nodes/disk/leave_disk", this.GetUserToken(), maps,
				PublicResult.class);

		if (!SDKUtils.ParseBoolean(publicResult.getStatus())) {
			throw new HttpException(publicResult.getErrmsg());
		}

		return publicResult.getResult();
	}

	/**
	 * <br/>
	 * Description:创建专门的Journal盘
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String CreateCache(String nodeName, String hctl, int slices)
			throws IOException, AuthException, HttpException {

		Map<String, String> maps = new HashMap<>();
		maps.put("node_name", nodeName);
		maps.put("HCTL", hctl);
		maps.put("slices", String.valueOf(slices));

		PublicResult publicResult = Post(this.getEndpoint(), "/nodes/disk/create_cache", this.GetUserToken(), maps,
				PublicResult.class);

		if (!SDKUtils.ParseBoolean(publicResult.getStatus())) {
			throw new HttpException(publicResult.getErrmsg());
		}

		return publicResult.getResult();
	}

	/**
	 * <br/>
	 * Description:查看磁盘的Journal信息
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public List<Disk> CacheInfo(String nodeName, String hctl) throws IOException, AuthException, HttpException {

		Map<String, String> maps = new HashMap<>();
		maps.put("node_name", nodeName);
		maps.put("HCTL", hctl);

		DiskListResult diskListResult = Post(this.getEndpoint(), "/nodes/disk/cache_info", this.GetUserToken(), maps,
				DiskListResult.class);

		if (!SDKUtils.ParseBoolean(diskListResult.getStatus())) {
			throw new HttpException(diskListResult.getErrmsg());
		}

		return diskListResult.getResult();
	}

	/**
	 * return status
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getStatus() {
		return Status;
	}

	/**
	 * param status 要设置的 status
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setStatus(String status) {
		Status = status;
	}

	/**
	 * return capacity
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getCapacity() {
		return Capacity;
	}

	/**
	 * param capacity 要设置的 capacity
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setCapacity(String capacity) {
		Capacity = capacity;
	}

	/**
	 * return uUID
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getUUID() {
		return UUID;
	}

	/**
	 * param uUID 要设置的 uUID
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setUUID(String uUID) {
		UUID = uUID;
	}

	/**
	 * return hCTL
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getHCTL() {
		return HCTL;
	}

	/**
	 * param hCTL 要设置的 hCTL
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setHCTL(String hCTL) {
		HCTL = hCTL;
	}

	/**
	 * return journal
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getJournal() {
		return Journal;
	}

	/**
	 * param journal 要设置的 journal
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setJournal(String journal) {
		Journal = journal;
	}

	/**
	 * return cluster
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getCluster() {
		return Cluster;
	}

	/**
	 * param cluster 要设置的 cluster
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setCluster(String cluster) {
		Cluster = cluster;
	}

	/**
	 * return state
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getState() {
		return State;
	}

	/**
	 * param state 要设置的 state
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setState(String state) {
		State = state;
	}

	/**
	 * return usage
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getUsage() {
		return Usage;
	}

	/**
	 * param usage 要设置的 usage
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setUsage(String usage) {
		Usage = usage;
	}

	/**
	 * return diskType
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getDiskType() {
		return DiskType;
	}

	/**
	 * param diskType 要设置的 diskType
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setDiskType(String diskType) {
		DiskType = diskType;
	}

	/**
	 * return used
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getUsed() {
		return Used;
	}

	/**
	 * param used 要设置的 used
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setUsed(String used) {
		Used = used;
	}

	/**
	 * return weight
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getWeight() {
		return Weight;
	}

	/**
	 * param weight 要设置的 weight
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setWeight(String weight) {
		Weight = weight;
	}

	/**
	 * return oSD
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getOSD() {
		return OSD;
	}

	/**
	 * param oSD 要设置的 oSD
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setOSD(String oSD) {
		OSD = oSD;
	}

	/**
	 * return minor
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getMinor() {
		return Minor;
	}

	/**
	 * param minor 要设置的 minor
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setMinor(String minor) {
		Minor = minor;
	}

	/**
	 * return latency
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getLatency() {
		return Latency;
	}

	/**
	 * param latency 要设置的 latency
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setLatency(String latency) {
		Latency = latency;
	}

	/**
	 * return commit
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getCommit() {
		return Commit;
	}

	/**
	 * param commit 要设置的 commit
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setCommit(String commit) {
		Commit = commit;
	}

	/**
	 * return size
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getSize() {
		return Size;
	}

	/**
	 * param size 要设置的 size
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setSize(String size) {
		Size = size;
	}
}
