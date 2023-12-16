package X;

import android.text.TextUtils;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.modelcache.singlemodelcache.SingleModelCache;
import com.facebook.cameracore.ardelivery.modelcache.versionedmodelcache.VersionedModelCache;
import com.facebook.cameracore.ardelivery.storage.interfaces.StorageCallback;
import com.facebook.cameracore.ardelivery.xplatcache.stash.StashARDFileCache;
import com.facebook.cameracore.common.exception.EffectsFrameworkException;
import java.io.File;

/* renamed from: X.9Yf  reason: invalid class name and case insensitive filesystem */
public abstract class C195519Yf implements C203419nf {
    public final C203419nf A00;
    public final C129586aY A01;
    public final C1001959y A02;
    public final Object A03 = AnonymousClass002.A0D();
    public final AnonymousClass4C1 A04;
    public volatile C203379nb A05;

    public final boolean BH7(AnonymousClass9WL r3, boolean z) {
        return this.A00.BH7(r3, false);
    }

    public C203379nb A00(C202279lh r7) {
        StashARDFileCache stashARDFileCache;
        StashARDFileCache stashARDFileCache2;
        if (this instanceof C1903495k) {
            VersionedCapability versionedCapability = (VersionedCapability) C18290x4.A0k(this.A01);
            C195549Yi r4 = (C195549Yi) r7;
            synchronized (r7) {
                stashARDFileCache2 = r4.A00;
                if (stashARDFileCache2 == null) {
                    stashARDFileCache2 = new StashARDFileCache(r4.A01, r4.A02);
                    r4.A00 = stashARDFileCache2;
                }
            }
            return new SingleModelCache(versionedCapability, stashARDFileCache2);
        }
        C195549Yi r42 = (C195549Yi) r7;
        synchronized (r7) {
            stashARDFileCache = r42.A00;
            if (stashARDFileCache == null) {
                stashARDFileCache = new StashARDFileCache(r42.A01, r42.A02);
                r42.A00 = stashARDFileCache;
            }
        }
        return new VersionedModelCache(stashARDFileCache, this.A01);
    }

    public final boolean A01(AnonymousClass9WL r7, VersionedCapability versionedCapability) {
        StringBuilder A0o;
        String str;
        if (this.A05 != null) {
            String str2 = r7.A09;
            if (TextUtils.isEmpty(str2)) {
                A0o = AnonymousClass001.A0o();
                str = "Model cache key is empty when saving for ";
            } else {
                String str3 = r7.A0C;
                C192479Jx r1 = r7.A06;
                if (!(r1 == null || r1 == C192479Jx.A06)) {
                    str3 = r1.toString();
                }
                if (TextUtils.isEmpty(str3)) {
                    A0o = AnonymousClass001.A0o();
                    str = "Model type is empty when saving for ";
                } else {
                    try {
                        return this.A05.addModelForVersionIfInCache(r7.A02(), str2, str3, versionedCapability);
                    } catch (EffectsFrameworkException e) {
                        C162477s9.A0B("ModelCacheAssetStorage", "Failed to save model to cache", e);
                        return false;
                    }
                }
            }
            A0o.append(str);
            C162457s7.A0J(AnonymousClass000.A0X(r7.A0B, A0o), 1);
        }
        return false;
    }

    public final File B53(AnonymousClass9WL r2, StorageCallback storageCallback) {
        return this.A00.B53(r2, storageCallback);
    }

    public void Bj3(AnonymousClass9WL r2) {
        this.A00.Bj3(r2);
    }

    public final File Bki(AnonymousClass9WL r2, StorageCallback storageCallback, File file) {
        return this.A00.Bki(r2, storageCallback, file);
    }

    public void Bs2(AnonymousClass9WL r2) {
        this.A00.Bs2(r2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|(4:9|10|11|(2:13|(1:15)(2:16|(6:19|20|21|40|39|17)))(2:26|(1:28)(1:29)))(0)|30|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x006f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C195519Yf(X.C203419nf r6, X.C129586aY r7, X.C1001959y r8, X.AnonymousClass4C1 r9) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.Object r0 = X.AnonymousClass002.A0D()
            r5.A03 = r0
            r5.A00 = r6
            r5.A04 = r9
            r5.A02 = r8
            r5.A01 = r7
            X.9nb r0 = r5.A05
            if (r0 != 0) goto L_0x0074
            java.lang.Object r3 = r5.A03
            monitor-enter(r3)
            X.9nb r0 = r5.A05     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x006f
            X.4C1 r0 = r5.A04     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0071 }
            X.9lh r0 = (X.C202279lh) r0     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x006f
            X.9nb r0 = r5.A00(r0)     // Catch:{ all -> 0x0071 }
            r5.A05 = r0     // Catch:{ all -> 0x0071 }
            boolean r0 = r5 instanceof X.C1903595l     // Catch:{ EffectsFrameworkException -> 0x006f }
            if (r0 == 0) goto L_0x005d
            X.9nb r0 = r5.A05     // Catch:{ EffectsFrameworkException -> 0x006f }
            java.lang.String r4 = "MultiModelCacheAssetStorage"
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = "model cache is not initialized before trimming"
            X.C162477s9.A09(r4, r0)     // Catch:{ EffectsFrameworkException -> 0x006f }
            goto L_0x006f
        L_0x003c:
            X.6aY r0 = r5.A01     // Catch:{ EffectsFrameworkException -> 0x006f }
            X.8Nf r2 = r0.iterator()     // Catch:{ EffectsFrameworkException -> 0x006f }
        L_0x0042:
            boolean r0 = r2.hasNext()     // Catch:{ EffectsFrameworkException -> 0x006f }
            if (r0 == 0) goto L_0x006f
            java.lang.Object r1 = r2.next()     // Catch:{ EffectsFrameworkException -> 0x006f }
            com.facebook.cameracore.ardelivery.model.VersionedCapability r1 = (com.facebook.cameracore.ardelivery.model.VersionedCapability) r1     // Catch:{ EffectsFrameworkException -> 0x006f }
            X.9nb r0 = r5.A05     // Catch:{ EffectsFrameworkException -> 0x0056 }
            com.facebook.cameracore.ardelivery.modelcache.versionedmodelcache.VersionedModelCache r0 = (com.facebook.cameracore.ardelivery.modelcache.versionedmodelcache.VersionedModelCache) r0     // Catch:{ EffectsFrameworkException -> 0x0056 }
            r0.trimExceptLatestSavedVersion((com.facebook.cameracore.ardelivery.model.VersionedCapability) r1)     // Catch:{ EffectsFrameworkException -> 0x0056 }
            goto L_0x0042
        L_0x0056:
            r1 = move-exception
            java.lang.String r0 = "Failed call to trimExceptVersion"
            X.C162477s9.A0B(r4, r0, r1)     // Catch:{ EffectsFrameworkException -> 0x006f }
            goto L_0x0042
        L_0x005d:
            X.9nb r0 = r5.A05     // Catch:{ EffectsFrameworkException -> 0x006f }
            if (r0 != 0) goto L_0x0069
            java.lang.String r1 = "ModelCacheAssetStorage"
            java.lang.String r0 = "model cache is not initialized before trimming"
            X.C162477s9.A09(r1, r0)     // Catch:{ EffectsFrameworkException -> 0x006f }
            goto L_0x006f
        L_0x0069:
            X.9nb r1 = r5.A05     // Catch:{ EffectsFrameworkException -> 0x006f }
            r0 = 0
            r1.trimExceptLatestSavedVersion(r0)     // Catch:{ EffectsFrameworkException -> 0x006f }
        L_0x006f:
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            goto L_0x0074
        L_0x0071:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            throw r0
        L_0x0074:
            X.9nb r0 = r5.A05
            if (r0 != 0) goto L_0x007f
            java.lang.String r1 = "ModelCacheAssetStorage"
            java.lang.String r0 = "Model cache could not be initialized"
            X.C162477s9.A09(r1, r0)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195519Yf.<init>(X.9nf, X.6aY, X.59y, X.4C1):void");
    }
}
