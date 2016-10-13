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
	private long NumEvict;

	@JSONField(name = "num_evict_kb")
	private long NumEvictKb;

	@JSONField(name = "num_bytes_hit_set_archive")
	private long NumBytesHitSetArchive;

	@JSONField(name = "num_whiteouts")
	private long NumWhiteouts;

	@JSONField(name = "num_objects_pinned")
	private long NumObjectsPinned;

	@JSONField(name = "num_scrub_errors")
	private long NumScrubErrors;

	@JSONField(name = "num_evict_mode_full")
	private long NumEvictModeFull;

	@JSONField(name = "num_read")
	private long NumRead;

	@JSONField(name = "num_objects_recovered")
	private long NumObjectsRecovered;

	@JSONField(name = "num_objects_omap")
	private long NumObjectsOmap;

	@JSONField(name = "num_objects_missing_on_primary")
	private long NumObjectsMissingOnPrimary;

	@JSONField(name = "num_write")
	private long NumWrite;

	@JSONField(name = "num_object_clones")
	private long NumObjectClones;

	@JSONField(name = "num_objects")
	private long NumObjects;

	@JSONField(name = "num_deep_scrub_errors")
	private long NumDeepScrubErrors;

	@JSONField(name = "num_shallow_scrub_errors")
	private long NumShallowScrubErrors;

	@JSONField(name = "num_read_kb")
	private long NumReadKb;

	@JSONField(name = "num_objects_missing")
	private long NumObjectsMissing;

	@JSONField(name = "num_flush_kb")
	private long NumFlushKb;

	@JSONField(name = "num_flush_mode_high")
	private long NumFlushModeHigh;

	@JSONField(name = "num_write_kb")
	private long NumWriteKb;

	@JSONField(name = "num_evict_mode_some")
	private long NumEvictModeSome;

	@JSONField(name = "num_objects_degraded")
	private long NumObjectsDegraded;

	@JSONField(name = "num_flush")
	private long NumFlush;

	@JSONField(name = "num_objects_misplaced")
	private long NumObjectsMisplaced;

	@JSONField(name = "num_bytes_recovered")
	private long NumBytesRecovered;

	@JSONField(name = "num_objects_hit_set_archive")
	private long NumObjectsHitSetArchive;

	@JSONField(name = "num_keys_recovered")
	private long NumKeysRecovered;

	@JSONField(name = "num_flush_mode_low")
	private long NumFlushModeLow;

	@JSONField(name = "num_objects_unfound")
	private long NumObjectsUnfound;

	@JSONField(name = "num_promote")
	private long NumPromote;

	@JSONField(name = "num_object_copies")
	private long NumObjectCopies;

	@JSONField(name = "num_bytes")
	private long NumBytes;

	@JSONField(name = "num_objects_dirty")
	private long NumObjectsDirty;
	
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
	public long getNumEvict() {
		return NumEvict;
	}

	/**
	 * param numEvict 要设置的 numEvict
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumEvict(long numEvict) {
		NumEvict = numEvict;
	}

	/**
	 * return numEvictKb
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumEvictKb() {
		return NumEvictKb;
	}

	/**
	 * param numEvictKb 要设置的 numEvictKb
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumEvictKb(long numEvictKb) {
		NumEvictKb = numEvictKb;
	}

	/**
	 * return numBytesHitSetArchive
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumBytesHitSetArchive() {
		return NumBytesHitSetArchive;
	}

	/**
	 * param numBytesHitSetArchive 要设置的 numBytesHitSetArchive
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumBytesHitSetArchive(long numBytesHitSetArchive) {
		NumBytesHitSetArchive = numBytesHitSetArchive;
	}

	/**
	 * return numWhiteouts
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumWhiteouts() {
		return NumWhiteouts;
	}

	/**
	 * param numWhiteouts 要设置的 numWhiteouts
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumWhiteouts(long numWhiteouts) {
		NumWhiteouts = numWhiteouts;
	}

	/**
	 * return numObjectsPinned
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumObjectsPinned() {
		return NumObjectsPinned;
	}

	/**
	 * param numObjectsPinned 要设置的 numObjectsPinned
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjectsPinned(long numObjectsPinned) {
		NumObjectsPinned = numObjectsPinned;
	}

	/**
	 * return numScrubErrors
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumScrubErrors() {
		return NumScrubErrors;
	}

	/**
	 * param numScrubErrors 要设置的 numScrubErrors
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumScrubErrors(long numScrubErrors) {
		NumScrubErrors = numScrubErrors;
	}

	/**
	 * return numEvictModeFull
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumEvictModeFull() {
		return NumEvictModeFull;
	}

	/**
	 * param numEvictModeFull 要设置的 numEvictModeFull
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumEvictModeFull(long numEvictModeFull) {
		NumEvictModeFull = numEvictModeFull;
	}

	/**
	 * return numRead
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumRead() {
		return NumRead;
	}

	/**
	 * param numRead 要设置的 numRead
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumRead(long numRead) {
		NumRead = numRead;
	}

	/**
	 * return numObjectsRecovered
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumObjectsRecovered() {
		return NumObjectsRecovered;
	}

	/**
	 * param numObjectsRecovered 要设置的 numObjectsRecovered
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjectsRecovered(long numObjectsRecovered) {
		NumObjectsRecovered = numObjectsRecovered;
	}

	/**
	 * return numObjectsOmap
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumObjectsOmap() {
		return NumObjectsOmap;
	}

	/**
	 * param numObjectsOmap 要设置的 numObjectsOmap
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjectsOmap(long numObjectsOmap) {
		NumObjectsOmap = numObjectsOmap;
	}

	/**
	 * return numObjectsMissingOnPrimary
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumObjectsMissingOnPrimary() {
		return NumObjectsMissingOnPrimary;
	}

	/**
	 * param numObjectsMissingOnPrimary 要设置的 numObjectsMissingOnPrimary
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjectsMissingOnPrimary(long numObjectsMissingOnPrimary) {
		NumObjectsMissingOnPrimary = numObjectsMissingOnPrimary;
	}

	/**
	 * return numWrite
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumWrite() {
		return NumWrite;
	}

	/**
	 * param numWrite 要设置的 numWrite
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumWrite(long numWrite) {
		NumWrite = numWrite;
	}

	/**
	 * return numObjectClones
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumObjectClones() {
		return NumObjectClones;
	}

	/**
	 * param numObjectClones 要设置的 numObjectClones
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjectClones(long numObjectClones) {
		NumObjectClones = numObjectClones;
	}

	/**
	 * return numObjects
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumObjects() {
		return NumObjects;
	}

	/**
	 * param numObjects 要设置的 numObjects
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjects(long numObjects) {
		NumObjects = numObjects;
	}

	/**
	 * return numDeepScrubErrors
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumDeepScrubErrors() {
		return NumDeepScrubErrors;
	}

	/**
	 * param numDeepScrubErrors 要设置的 numDeepScrubErrors
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumDeepScrubErrors(long numDeepScrubErrors) {
		NumDeepScrubErrors = numDeepScrubErrors;
	}

	/**
	 * return numShallowScrubErrors
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumShallowScrubErrors() {
		return NumShallowScrubErrors;
	}

	/**
	 * param numShallowScrubErrors 要设置的 numShallowScrubErrors
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumShallowScrubErrors(long numShallowScrubErrors) {
		NumShallowScrubErrors = numShallowScrubErrors;
	}

	/**
	 * return numReadKb
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumReadKb() {
		return NumReadKb;
	}

	/**
	 * param numReadKb 要设置的 numReadKb
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumReadKb(long numReadKb) {
		NumReadKb = numReadKb;
	}

	/**
	 * return numObjectsMissing
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumObjectsMissing() {
		return NumObjectsMissing;
	}

	/**
	 * param numObjectsMissing 要设置的 numObjectsMissing
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjectsMissing(long numObjectsMissing) {
		NumObjectsMissing = numObjectsMissing;
	}

	/**
	 * return numFlushKb
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumFlushKb() {
		return NumFlushKb;
	}

	/**
	 * param numFlushKb 要设置的 numFlushKb
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumFlushKb(long numFlushKb) {
		NumFlushKb = numFlushKb;
	}

	/**
	 * return numFlushModeHigh
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumFlushModeHigh() {
		return NumFlushModeHigh;
	}

	/**
	 * param numFlushModeHigh 要设置的 numFlushModeHigh
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumFlushModeHigh(long numFlushModeHigh) {
		NumFlushModeHigh = numFlushModeHigh;
	}

	/**
	 * return numWriteKb
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumWriteKb() {
		return NumWriteKb;
	}

	/**
	 * param numWriteKb 要设置的 numWriteKb
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumWriteKb(long numWriteKb) {
		NumWriteKb = numWriteKb;
	}

	/**
	 * return numEvictModeSome
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumEvictModeSome() {
		return NumEvictModeSome;
	}

	/**
	 * param numEvictModeSome 要设置的 numEvictModeSome
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumEvictModeSome(long numEvictModeSome) {
		NumEvictModeSome = numEvictModeSome;
	}

	/**
	 * return numObjectsDegraded
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumObjectsDegraded() {
		return NumObjectsDegraded;
	}

	/**
	 * param numObjectsDegraded 要设置的 numObjectsDegraded
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjectsDegraded(long numObjectsDegraded) {
		NumObjectsDegraded = numObjectsDegraded;
	}

	/**
	 * return numFlush
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumFlush() {
		return NumFlush;
	}

	/**
	 * param numFlush 要设置的 numFlush
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumFlush(long numFlush) {
		NumFlush = numFlush;
	}

	/**
	 * return numObjectsMisplaced
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumObjectsMisplaced() {
		return NumObjectsMisplaced;
	}

	/**
	 * param numObjectsMisplaced 要设置的 numObjectsMisplaced
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjectsMisplaced(long numObjectsMisplaced) {
		NumObjectsMisplaced = numObjectsMisplaced;
	}

	/**
	 * return numBytesRecovered
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumBytesRecovered() {
		return NumBytesRecovered;
	}

	/**
	 * param numBytesRecovered 要设置的 numBytesRecovered
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumBytesRecovered(long numBytesRecovered) {
		NumBytesRecovered = numBytesRecovered;
	}

	/**
	 * return numObjectsHitSetArchive
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumObjectsHitSetArchive() {
		return NumObjectsHitSetArchive;
	}

	/**
	 * param numObjectsHitSetArchive 要设置的 numObjectsHitSetArchive
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjectsHitSetArchive(long numObjectsHitSetArchive) {
		NumObjectsHitSetArchive = numObjectsHitSetArchive;
	}

	/**
	 * return numKeysRecovered
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumKeysRecovered() {
		return NumKeysRecovered;
	}

	/**
	 * param numKeysRecovered 要设置的 numKeysRecovered
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumKeysRecovered(long numKeysRecovered) {
		NumKeysRecovered = numKeysRecovered;
	}

	/**
	 * return numFlushModeLow
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumFlushModeLow() {
		return NumFlushModeLow;
	}

	/**
	 * param numFlushModeLow 要设置的 numFlushModeLow
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumFlushModeLow(long numFlushModeLow) {
		NumFlushModeLow = numFlushModeLow;
	}

	/**
	 * return numObjectsUnfound
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumObjectsUnfound() {
		return NumObjectsUnfound;
	}

	/**
	 * param numObjectsUnfound 要设置的 numObjectsUnfound
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjectsUnfound(long numObjectsUnfound) {
		NumObjectsUnfound = numObjectsUnfound;
	}

	/**
	 * return numPromote
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumPromote() {
		return NumPromote;
	}

	/**
	 * param numPromote 要设置的 numPromote
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumPromote(long numPromote) {
		NumPromote = numPromote;
	}

	/**
	 * return numObjectCopies
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumObjectCopies() {
		return NumObjectCopies;
	}

	/**
	 * param numObjectCopies 要设置的 numObjectCopies
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjectCopies(long numObjectCopies) {
		NumObjectCopies = numObjectCopies;
	}

	/**
	 * return numBytes
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumBytes() {
		return NumBytes;
	}

	/**
	 * param numBytes 要设置的 numBytes
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumBytes(long numBytes) {
		NumBytes = numBytes;
	}

	/**
	 * return numObjectsDirty
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getNumObjectsDirty() {
		return NumObjectsDirty;
	}

	/**
	 * param numObjectsDirty 要设置的 numObjectsDirty
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setNumObjectsDirty(long numObjectsDirty) {
		NumObjectsDirty = numObjectsDirty;
	}
}
