package com.facebook.cameracore.ardelivery.xplatcache.stash;

import X.AnonymousClass001;
import X.AnonymousClass002;
import android.os.Looper;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCacheEntry;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileInMemoryStatus;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import com.facebook.stash.core.FileStash;
import java.io.File;
import java.util.Map;
import java.util.Set;

public class StashARDFileCache extends ARDFileCache {
    public final FileStash mStash;

    public static native HybridData initHybrid(long j, FileStash fileStash);

    static {
        SoLoader.A06("ardcache-stash");
    }

    public void clear() {
        this.mStash.Bj6();
    }

    public void flush() {
        throw AnonymousClass002.A0G("flush() is not supported in Stash");
    }

    public Map.Entry[] getAllMetas() {
        throw AnonymousClass002.A0G("getAllMetas() is not supported in Stash");
    }

    public ARDFileCacheEntry getCacheEntry(String str) {
        File file = this.mStash.getFile(str);
        if (file != null) {
            return new ARDFileCacheEntry(file.getAbsolutePath());
        }
        return null;
    }

    public ARDFileCacheEntry getCacheEntryWithoutPromotion(String str) {
        if (!this.mStash.BFI(str)) {
            return null;
        }
        return new ARDFileCacheEntry(this.mStash.getFilePath(str).getAbsolutePath());
    }

    public long getSize() {
        return this.mStash.BD6();
    }

    public ARDFileCacheEntry insertAndLock(String str) {
        return new ARDFileCacheEntry(this.mStash.insertFile(str).getAbsolutePath());
    }

    public ARDFileInMemoryStatus memContains(String str) {
        if (this.mStash.BFI(str)) {
            return ARDFileInMemoryStatus.IN_CACHE;
        }
        return ARDFileInMemoryStatus.NOT_IN_CACHE;
    }

    public boolean remove(String str) {
        return this.mStash.Bj4(str);
    }

    public boolean updateExtra(String str, byte[] bArr) {
        throw AnonymousClass002.A0G("updateExtra() is not supported in Stash");
    }

    public StashARDFileCache(long j, FileStash fileStash) {
        this.mStash = fileStash;
        this.mHybridData = initHybrid(j, fileStash);
    }

    public Set getAllKeys() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            return this.mStash.B4Q();
        }
        throw AnonymousClass001.A0e("StashARDFileCache.getAllKeys() shouldn't be called on the main thread.");
    }

    public void commit(String str) {
    }

    public void unlock(String str) {
    }
}
