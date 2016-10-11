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
 * 
 * @Title: PoolSummary.java
 * @Package com.ronglian.sdk.xtao.beans.pool
 * @date 2016年10月10日 下午8:14:10
 */
package com.ronglian.sdk.xtao.beans.pool;

import com.alibaba.fastjson.annotation.JSONField;
import com.ronglian.sdk.xtao.beans.BaseBean;

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
public class PoolSummary extends BaseBean {

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
	private static final long serialVersionUID = 6642747127715193113L;

	@JSONField(name = "num_evict")
	private String NumEvict;

	@JSONField(name = "num_evict_kb")
	private String NumEvictKb;

	@JSONField(name = "num_bytes_hit_set_archive")
	private String NumBytesHitSetArchive;

	@JSONField(name = "num_whiteouts")
	private String NumWhiteouts;

	@JSONField(name = "num_objects_pinned")
	private String NumObjectsPinned;

	@JSONField(name = "num_scrub_errors")
	private String NumScrubErrors;

	@JSONField(name = "num_evict_mode_full")
	private String NumEvictModeFull;

	@JSONField(name = "num_read")
	private String NumRead;

	@JSONField(name = "num_objects_recovered")
	private String NumObjectsRecovered;

	@JSONField(name = "num_objects_omap")
	private String NumObjectsOmap;

	@JSONField(name = "num_objects_missing_on_primary")
	private String NumObjectsMissingOnPrimary;

	@JSONField(name = "num_write")
	private String NumWrite;

	@JSONField(name = "num_object_clones")
	private String NumObjectClones;

	@JSONField(name = "num_objects")
	private String NumObjects;

	@JSONField(name = "num_deep_scrub_errors")
	private String NumDeepScrubErrors;

	@JSONField(name = "num_shallow_scrub_errors")
	private String NumShallowScrubErrors;

	@JSONField(name = "num_read_kb")
	private String NumReadKb;

	@JSONField(name = "num_objects_missing")
	private String NumObjectsMissing;

	@JSONField(name = "num_flush_kb")
	private String NumFlushKb;

	@JSONField(name = "num_flush_mode_high")
	private String NumFlushModeHigh;

	@JSONField(name = "num_write_kb")
	private String NumWriteKb;

	@JSONField(name = "num_evict_mode_some")
	private String NumEvictModeSome;

	@JSONField(name = "num_objects_degraded")
	private String NumObjectsDegraded;

	@JSONField(name = "num_flush")
	private String NumFlush;

	@JSONField(name = "num_objects_misplaced")
	private String NumObjectsMisplaced;

	@JSONField(name = "num_bytes_recovered")
	private String NumBytesRecovered;

	@JSONField(name = "num_objects_hit_set_archive")
	private String NumObjectsHitSetArchive;

	@JSONField(name = "num_keys_recovered")
	private String NumKeysRecovered;

	@JSONField(name = "num_flush_mode_low")
	private String NumFlushModeLow;

	@JSONField(name = "num_objects_unfound")
	private String NumObjectsUnfound;

	@JSONField(name = "num_promote")
	private String NumPromote;

	@JSONField(name = "num_object_copies")
	private String NumObjectCopies;

	@JSONField(name = "num_bytes")
	private String NumBytes;

	@JSONField(name = "num_objects_dirty")
	private String NumObjectsDirty;
	
	/**
	 * <br/>Description:
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public PoolSummary() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * return numEvict
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumEvict() {
		return NumEvict;
	}

	/**
	 * param numEvict 要设置的 numEvict
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumEvict(String numEvict) {
		NumEvict = numEvict;
	}

	/**
	 * return numEvictKb
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumEvictKb() {
		return NumEvictKb;
	}

	/**
	 * param numEvictKb 要设置的 numEvictKb
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumEvictKb(String numEvictKb) {
		NumEvictKb = numEvictKb;
	}

	/**
	 * return numBytesHitSetArchive
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumBytesHitSetArchive() {
		return NumBytesHitSetArchive;
	}

	/**
	 * param numBytesHitSetArchive 要设置的 numBytesHitSetArchive
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumBytesHitSetArchive(String numBytesHitSetArchive) {
		NumBytesHitSetArchive = numBytesHitSetArchive;
	}

	/**
	 * return numWhiteouts
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumWhiteouts() {
		return NumWhiteouts;
	}

	/**
	 * param numWhiteouts 要设置的 numWhiteouts
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumWhiteouts(String numWhiteouts) {
		NumWhiteouts = numWhiteouts;
	}

	/**
	 * return numObjectsPinned
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumObjectsPinned() {
		return NumObjectsPinned;
	}

	/**
	 * param numObjectsPinned 要设置的 numObjectsPinned
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjectsPinned(String numObjectsPinned) {
		NumObjectsPinned = numObjectsPinned;
	}

	/**
	 * return numScrubErrors
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumScrubErrors() {
		return NumScrubErrors;
	}

	/**
	 * param numScrubErrors 要设置的 numScrubErrors
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumScrubErrors(String numScrubErrors) {
		NumScrubErrors = numScrubErrors;
	}

	/**
	 * return numEvictModeFull
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumEvictModeFull() {
		return NumEvictModeFull;
	}

	/**
	 * param numEvictModeFull 要设置的 numEvictModeFull
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumEvictModeFull(String numEvictModeFull) {
		NumEvictModeFull = numEvictModeFull;
	}

	/**
	 * return numRead
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumRead() {
		return NumRead;
	}

	/**
	 * param numRead 要设置的 numRead
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumRead(String numRead) {
		NumRead = numRead;
	}

	/**
	 * return numObjectsRecovered
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumObjectsRecovered() {
		return NumObjectsRecovered;
	}

	/**
	 * param numObjectsRecovered 要设置的 numObjectsRecovered
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjectsRecovered(String numObjectsRecovered) {
		NumObjectsRecovered = numObjectsRecovered;
	}

	/**
	 * return numObjectsOmap
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumObjectsOmap() {
		return NumObjectsOmap;
	}

	/**
	 * param numObjectsOmap 要设置的 numObjectsOmap
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjectsOmap(String numObjectsOmap) {
		NumObjectsOmap = numObjectsOmap;
	}

	/**
	 * return numObjectsMissingOnPrimary
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumObjectsMissingOnPrimary() {
		return NumObjectsMissingOnPrimary;
	}

	/**
	 * param numObjectsMissingOnPrimary 要设置的 numObjectsMissingOnPrimary
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjectsMissingOnPrimary(String numObjectsMissingOnPrimary) {
		NumObjectsMissingOnPrimary = numObjectsMissingOnPrimary;
	}

	/**
	 * return numWrite
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumWrite() {
		return NumWrite;
	}

	/**
	 * param numWrite 要设置的 numWrite
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumWrite(String numWrite) {
		NumWrite = numWrite;
	}

	/**
	 * return numObjectClones
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumObjectClones() {
		return NumObjectClones;
	}

	/**
	 * param numObjectClones 要设置的 numObjectClones
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjectClones(String numObjectClones) {
		NumObjectClones = numObjectClones;
	}

	/**
	 * return numObjects
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumObjects() {
		return NumObjects;
	}

	/**
	 * param numObjects 要设置的 numObjects
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjects(String numObjects) {
		NumObjects = numObjects;
	}

	/**
	 * return numDeepScrubErrors
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumDeepScrubErrors() {
		return NumDeepScrubErrors;
	}

	/**
	 * param numDeepScrubErrors 要设置的 numDeepScrubErrors
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumDeepScrubErrors(String numDeepScrubErrors) {
		NumDeepScrubErrors = numDeepScrubErrors;
	}

	/**
	 * return numShallowScrubErrors
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumShallowScrubErrors() {
		return NumShallowScrubErrors;
	}

	/**
	 * param numShallowScrubErrors 要设置的 numShallowScrubErrors
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumShallowScrubErrors(String numShallowScrubErrors) {
		NumShallowScrubErrors = numShallowScrubErrors;
	}

	/**
	 * return numReadKb
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumReadKb() {
		return NumReadKb;
	}

	/**
	 * param numReadKb 要设置的 numReadKb
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumReadKb(String numReadKb) {
		NumReadKb = numReadKb;
	}

	/**
	 * return numObjectsMissing
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumObjectsMissing() {
		return NumObjectsMissing;
	}

	/**
	 * param numObjectsMissing 要设置的 numObjectsMissing
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjectsMissing(String numObjectsMissing) {
		NumObjectsMissing = numObjectsMissing;
	}

	/**
	 * return numFlushKb
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumFlushKb() {
		return NumFlushKb;
	}

	/**
	 * param numFlushKb 要设置的 numFlushKb
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumFlushKb(String numFlushKb) {
		NumFlushKb = numFlushKb;
	}

	/**
	 * return numFlushModeHigh
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumFlushModeHigh() {
		return NumFlushModeHigh;
	}

	/**
	 * param numFlushModeHigh 要设置的 numFlushModeHigh
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumFlushModeHigh(String numFlushModeHigh) {
		NumFlushModeHigh = numFlushModeHigh;
	}

	/**
	 * return numWriteKb
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumWriteKb() {
		return NumWriteKb;
	}

	/**
	 * param numWriteKb 要设置的 numWriteKb
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumWriteKb(String numWriteKb) {
		NumWriteKb = numWriteKb;
	}

	/**
	 * return numEvictModeSome
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumEvictModeSome() {
		return NumEvictModeSome;
	}

	/**
	 * param numEvictModeSome 要设置的 numEvictModeSome
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumEvictModeSome(String numEvictModeSome) {
		NumEvictModeSome = numEvictModeSome;
	}

	/**
	 * return numObjectsDegraded
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumObjectsDegraded() {
		return NumObjectsDegraded;
	}

	/**
	 * param numObjectsDegraded 要设置的 numObjectsDegraded
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjectsDegraded(String numObjectsDegraded) {
		NumObjectsDegraded = numObjectsDegraded;
	}

	/**
	 * return numFlush
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumFlush() {
		return NumFlush;
	}

	/**
	 * param numFlush 要设置的 numFlush
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumFlush(String numFlush) {
		NumFlush = numFlush;
	}

	/**
	 * return numObjectsMisplaced
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumObjectsMisplaced() {
		return NumObjectsMisplaced;
	}

	/**
	 * param numObjectsMisplaced 要设置的 numObjectsMisplaced
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjectsMisplaced(String numObjectsMisplaced) {
		NumObjectsMisplaced = numObjectsMisplaced;
	}

	/**
	 * return numBytesRecovered
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumBytesRecovered() {
		return NumBytesRecovered;
	}

	/**
	 * param numBytesRecovered 要设置的 numBytesRecovered
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumBytesRecovered(String numBytesRecovered) {
		NumBytesRecovered = numBytesRecovered;
	}

	/**
	 * return numObjectsHitSetArchive
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumObjectsHitSetArchive() {
		return NumObjectsHitSetArchive;
	}

	/**
	 * param numObjectsHitSetArchive 要设置的 numObjectsHitSetArchive
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjectsHitSetArchive(String numObjectsHitSetArchive) {
		NumObjectsHitSetArchive = numObjectsHitSetArchive;
	}

	/**
	 * return numKeysRecovered
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumKeysRecovered() {
		return NumKeysRecovered;
	}

	/**
	 * param numKeysRecovered 要设置的 numKeysRecovered
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumKeysRecovered(String numKeysRecovered) {
		NumKeysRecovered = numKeysRecovered;
	}

	/**
	 * return numFlushModeLow
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumFlushModeLow() {
		return NumFlushModeLow;
	}

	/**
	 * param numFlushModeLow 要设置的 numFlushModeLow
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumFlushModeLow(String numFlushModeLow) {
		NumFlushModeLow = numFlushModeLow;
	}

	/**
	 * return numObjectsUnfound
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumObjectsUnfound() {
		return NumObjectsUnfound;
	}

	/**
	 * param numObjectsUnfound 要设置的 numObjectsUnfound
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjectsUnfound(String numObjectsUnfound) {
		NumObjectsUnfound = numObjectsUnfound;
	}

	/**
	 * return numPromote
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumPromote() {
		return NumPromote;
	}

	/**
	 * param numPromote 要设置的 numPromote
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumPromote(String numPromote) {
		NumPromote = numPromote;
	}

	/**
	 * return numObjectCopies
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumObjectCopies() {
		return NumObjectCopies;
	}

	/**
	 * param numObjectCopies 要设置的 numObjectCopies
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjectCopies(String numObjectCopies) {
		NumObjectCopies = numObjectCopies;
	}

	/**
	 * return numBytes
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumBytes() {
		return NumBytes;
	}

	/**
	 * param numBytes 要设置的 numBytes
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumBytes(String numBytes) {
		NumBytes = numBytes;
	}

	/**
	 * return numObjectsDirty
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getNumObjectsDirty() {
		return NumObjectsDirty;
	}

	/**
	 * param numObjectsDirty 要设置的 numObjectsDirty
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjectsDirty(String numObjectsDirty) {
		NumObjectsDirty = numObjectsDirty;
	}
}
