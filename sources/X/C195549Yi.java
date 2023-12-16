package X;

import com.facebook.cameracore.ardelivery.xplatcache.stash.StashARDFileCache;
import com.facebook.stash.core.FileStash;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9Yi  reason: invalid class name and case insensitive filesystem */
public class C195549Yi implements C202279lh {
    public StashARDFileCache A00;
    public final long A01;
    public final FileStash A02;
    public final AtomicReference A03;

    public C195549Yi(FileStash fileStash, AtomicReference atomicReference, long j) {
        this.A02 = fileStash;
        this.A03 = atomicReference;
        this.A01 = j;
    }
}
