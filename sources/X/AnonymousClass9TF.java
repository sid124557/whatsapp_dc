package X;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.modelmanager.metadataloader.ARModelMetadataDownloader;
import com.facebook.cameracore.common.exception.EffectsFrameworkException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9TF  reason: invalid class name */
public class AnonymousClass9TF {
    public final AnonymousClass9W5 A00;
    public final AnonymousClass9SI A01 = new AnonymousClass9SI();
    public final ARModelMetadataDownloader A02;
    public final C192559Ko A03;
    public final C104855Sp A04;
    public final Map A05;

    public final synchronized void A01(AnonymousClass9SI r6, VersionedCapability versionedCapability, int i) {
        try {
            C203259nN r0 = (C203259nN) this.A05.get(versionedCapability);
            if (r0 == null) {
                Object[] A0L = AnonymousClass002.A0L();
                A0L[0] = versionedCapability.toServerValue();
                C162477s9.A0G("DefaultARModelFetcher", "Trying to load model from unsupported capability: %s", A0L);
            } else if (r0.BJt(r6, versionedCapability, i)) {
                AnonymousClass9SI r02 = this.A01;
                ModelPathsHolder A002 = r6.A00(versionedCapability);
                if (A002 != null) {
                    r02.A00.put(versionedCapability, A002);
                }
            }
        } catch (EffectsFrameworkException e) {
            throw new AnonymousClass9KP((Exception) e);
        }
    }

    public final synchronized boolean A02(C195349Xk r6, VersionedCapability versionedCapability) {
        boolean z;
        try {
            C203259nN r1 = (C203259nN) this.A05.get(versionedCapability);
            if (r1 == null) {
                Object[] A0L = AnonymousClass002.A0L();
                z = false;
                A0L[0] = versionedCapability.toServerValue();
                C162477s9.A0G("DefaultARModelFetcher", "Trying to load model from unsupported capability: %s", A0L);
            } else {
                z = r1.AwO(r6.A02, versionedCapability);
            }
        } catch (EffectsFrameworkException e) {
            throw new AnonymousClass9KP((Exception) e);
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("Capability not found, Requested fetching unsupported capability: ");
        r1 = new X.AnonymousClass9KP(X.AnonymousClass000.A0R(r11.mCapability, r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass9RQ r19, X.C202259le r20, X.AnonymousClass32L r21, java.util.List r22) {
        /*
            r18 = this;
            r6 = r18
            r14 = 0
            X.9qA r0 = new X.9qA
            r0.<init>(r6, r14)
            r3 = 0
            r17 = r20
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()     // Catch:{ 9KP -> 0x018d }
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()     // Catch:{ 9KP -> 0x018d }
            java.util.Iterator r16 = r22.iterator()     // Catch:{ 9KP -> 0x018d }
        L_0x0017:
            boolean r0 = r16.hasNext()     // Catch:{ 9KP -> 0x018d }
            r7 = r21
            if (r0 == 0) goto L_0x010e
            java.lang.Object r11 = r16.next()     // Catch:{ 9KP -> 0x018d }
            com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest r11 = (com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest) r11     // Catch:{ 9KP -> 0x018d }
            java.util.Map r13 = r6.A05     // Catch:{ 9KP -> 0x018d }
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r11.mCapability     // Catch:{ 9KP -> 0x018d }
            boolean r0 = r13.containsKey(r0)     // Catch:{ 9KP -> 0x018d }
            if (r0 == 0) goto L_0x00f6
            int r10 = r11.mMinVersion     // Catch:{ 9KP -> 0x018d }
            int r8 = r11.mPreferredVersion     // Catch:{ 9KP -> 0x018d }
            java.lang.String r1 = "DefaultARModelFetcher.addCachedModelsAndReturnMissing"
            X.5Sp r5 = r6.A04     // Catch:{ 9KP -> 0x018d }
            boolean r0 = r5.A02(r7)     // Catch:{ 9KP -> 0x018d }
            if (r0 != 0) goto L_0x0088
            X.4fa r4 = r5.A02     // Catch:{ 9KP -> 0x018d }
            java.lang.String r0 = r7.A01     // Catch:{ 9KP -> 0x018d }
            java.lang.Object[] r15 = X.C18310x6.A1b(r0, r14)     // Catch:{ 9KP -> 0x018d }
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r11.mCapability     // Catch:{ 9KP -> 0x018d }
            java.lang.String r2 = r0.name()     // Catch:{ 9KP -> 0x018d }
            r0 = 1
            r15[r0] = r2     // Catch:{ 9KP -> 0x018d }
            int r2 = java.util.Arrays.hashCode(r15)     // Catch:{ 9KP -> 0x018d }
            X.8JP r15 = r4.A01     // Catch:{ 9KP -> 0x018d }
            r0 = 22413317(0x1560005, float:3.9305606E-38)
            r15.BKl(r0, r2, r14)     // Catch:{ 9KP -> 0x018d }
            r4.A04(r7, r2)     // Catch:{ 9KP -> 0x018d }
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r11.mCapability     // Catch:{ 9KP -> 0x018d }
            java.lang.String r15 = r0.name()     // Catch:{ 9KP -> 0x018d }
            java.lang.String r0 = "model_type"
            r4.A02(r2, r0, r15)     // Catch:{ 9KP -> 0x018d }
            int r0 = r11.mMinVersion     // Catch:{ 9KP -> 0x018d }
            java.lang.String r15 = java.lang.String.valueOf(r0)     // Catch:{ 9KP -> 0x018d }
            java.lang.String r0 = "min_version"
            r4.A02(r2, r0, r15)     // Catch:{ 9KP -> 0x018d }
            java.lang.String r0 = "model_cache_check_call_site"
            r4.A02(r2, r0, r1)     // Catch:{ 9KP -> 0x018d }
            boolean r0 = r11.mIsMinVersionTranslatedToNmlml     // Catch:{ 9KP -> 0x018d }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ 9KP -> 0x018d }
            java.lang.String r0 = "is_min_version_translated_to_nmlml"
            r4.A02(r2, r0, r1)     // Catch:{ 9KP -> 0x018d }
            java.lang.String r0 = "model_cache_check_start"
            r4.A01(r2, r0)     // Catch:{ 9KP -> 0x018d }
        L_0x0088:
            boolean r0 = r11.mForceDownload     // Catch:{ 9KP -> 0x018d }
            if (r0 != 0) goto L_0x00ea
            com.facebook.cameracore.ardelivery.model.VersionedCapability r4 = r11.mCapability     // Catch:{ 9KP -> 0x018d }
            monitor-enter(r6)     // Catch:{ 9KP -> 0x018d }
            java.lang.Object r0 = r13.get(r4)     // Catch:{ EffectsFrameworkException -> 0x00ef }
            X.9nN r0 = (X.C203259nN) r0     // Catch:{ EffectsFrameworkException -> 0x00ef }
            if (r0 != 0) goto L_0x00a9
            java.lang.String r5 = "DefaultARModelFetcher"
            java.lang.String r2 = "Trying to load model from unsupported capability: %s"
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()     // Catch:{ EffectsFrameworkException -> 0x00ef }
            java.lang.String r0 = r4.toServerValue()     // Catch:{ EffectsFrameworkException -> 0x00ef }
            r1[r14] = r0     // Catch:{ EffectsFrameworkException -> 0x00ef }
            X.C162477s9.A0G(r5, r2, r1)     // Catch:{ EffectsFrameworkException -> 0x00ef }
            goto L_0x00e9
        L_0x00a9:
            X.9SI r2 = new X.9SI     // Catch:{ EffectsFrameworkException -> 0x00ef }
            r2.<init>()     // Catch:{ EffectsFrameworkException -> 0x00ef }
            boolean r0 = r0.BJq(r2, r4)     // Catch:{ EffectsFrameworkException -> 0x00ef }
            if (r0 == 0) goto L_0x00e9
            X.9SI r0 = r6.A01     // Catch:{ EffectsFrameworkException -> 0x00ef }
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r1 = r2.A00(r4)     // Catch:{ EffectsFrameworkException -> 0x00ef }
            if (r1 == 0) goto L_0x00c1
            java.util.Map r0 = r0.A00     // Catch:{ EffectsFrameworkException -> 0x00ef }
            r0.put(r4, r1)     // Catch:{ EffectsFrameworkException -> 0x00ef }
        L_0x00c1:
            monitor-exit(r6)     // Catch:{ 9KP -> 0x018d }
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r11.mCapability     // Catch:{ 9KP -> 0x018d }
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r0 = r2.A00(r0)     // Catch:{ 9KP -> 0x018d }
            if (r0 == 0) goto L_0x00ea
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r11.mCapability     // Catch:{ 9KP -> 0x018d }
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r0 = r2.A00(r0)     // Catch:{ 9KP -> 0x018d }
            int r0 = r0.mVersion     // Catch:{ 9KP -> 0x018d }
            if (r0 < r10) goto L_0x00ea
            if (r0 > r8) goto L_0x00ea
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r11.mCapability     // Catch:{ 9KP -> 0x018d }
            r12.add(r0)     // Catch:{ 9KP -> 0x018d }
            r1 = 1
            boolean r0 = r5.A02(r7)     // Catch:{ 9KP -> 0x018d }
            if (r0 != 0) goto L_0x0017
            X.4fa r0 = r5.A02     // Catch:{ 9KP -> 0x018d }
            r0.A05(r11, r7, r8, r1)     // Catch:{ 9KP -> 0x018d }
            goto L_0x0017
        L_0x00e9:
            monitor-exit(r6)     // Catch:{ 9KP -> 0x018d }
        L_0x00ea:
            r9.add(r11)     // Catch:{ 9KP -> 0x018d }
            goto L_0x0017
        L_0x00ef:
            r1 = move-exception
            X.9KP r0 = new X.9KP     // Catch:{ all -> 0x010b }
            r0.<init>((java.lang.Exception) r1)     // Catch:{ all -> 0x010b }
            throw r0     // Catch:{ all -> 0x010b }
        L_0x00f6:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 9KP -> 0x018d }
            java.lang.String r0 = "Capability not found, Requested fetching unsupported capability: "
            r1.append(r0)     // Catch:{ 9KP -> 0x018d }
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r11.mCapability     // Catch:{ 9KP -> 0x018d }
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r1)     // Catch:{ 9KP -> 0x018d }
            X.9KP r1 = new X.9KP     // Catch:{ 9KP -> 0x018d }
            r1.<init>((java.lang.String) r0)     // Catch:{ 9KP -> 0x018d }
            goto L_0x010d
        L_0x010b:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ 9KP -> 0x018d }
        L_0x010d:
            throw r1     // Catch:{ 9KP -> 0x018d }
        L_0x010e:
            X.9SI r8 = r6.A01     // Catch:{ 9KP -> 0x018d }
            X.9SI r5 = new X.9SI     // Catch:{ 9KP -> 0x018d }
            r5.<init>()     // Catch:{ 9KP -> 0x018d }
            java.util.Iterator r4 = r12.iterator()     // Catch:{ 9KP -> 0x018d }
        L_0x0119:
            boolean r0 = r4.hasNext()     // Catch:{ 9KP -> 0x018d }
            if (r0 == 0) goto L_0x0131
            java.lang.Object r2 = r4.next()     // Catch:{ 9KP -> 0x018d }
            com.facebook.cameracore.ardelivery.model.VersionedCapability r2 = (com.facebook.cameracore.ardelivery.model.VersionedCapability) r2     // Catch:{ 9KP -> 0x018d }
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r1 = r8.A00(r2)     // Catch:{ 9KP -> 0x018d }
            if (r1 == 0) goto L_0x0119
            java.util.Map r0 = r5.A00     // Catch:{ 9KP -> 0x018d }
            r0.put(r2, r1)     // Catch:{ 9KP -> 0x018d }
            goto L_0x0119
        L_0x0131:
            X.0PJ r0 = X.AnonymousClass0x9.A0G(r9, r5)     // Catch:{ 9KP -> 0x018d }
            java.lang.Object r5 = r0.A00
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r0.A01
            X.9SI r4 = (X.AnonymousClass9SI) r4
            int r0 = r5.size()
            r9 = r19
            if (r0 != 0) goto L_0x0152
            if (r19 == 0) goto L_0x014c
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r9.A00(r0)
        L_0x014c:
            r0 = r17
            r0.BPO(r4, r3)
            return
        L_0x0152:
            java.util.concurrent.atomic.AtomicReference r14 = new java.util.concurrent.atomic.AtomicReference
            r14.<init>()
            int r1 = r22.size()
            int r0 = r5.size()
            int r1 = r1 - r0
            double r2 = (double) r1
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 * r0
            int r0 = r22.size()
            double r0 = (double) r0
            double r2 = r2 / r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>(r0)
            if (r19 == 0) goto L_0x017c
            double r0 = X.C1899593h.A00(r2)
            r9.A00(r0)
        L_0x017c:
            com.facebook.cameracore.ardelivery.modelmanager.metadataloader.ARModelMetadataDownloader r0 = r6.A02
            X.9Yd r8 = new X.9Yd
            r10 = r4
            r11 = r6
            r12 = r17
            r13 = r7
            r15 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0.downloadModelMetadata(r5, r7, r8)
            return
        L_0x018d:
            r1 = move-exception
            r0 = r17
            r0.BPO(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9TF.A00(X.9RQ, X.9le, X.32L, java.util.List):void");
    }

    public AnonymousClass9TF(AnonymousClass9W5 r5, AnonymousClass9Yb r6, AnonymousClass9Yc r7, ARModelMetadataDownloader aRModelMetadataDownloader, C192559Ko r9, C104855Sp r10) {
        this.A00 = r5;
        this.A02 = aRModelMetadataDownloader;
        this.A04 = r10;
        this.A03 = r9;
        this.A05 = AnonymousClass001.A0t();
        Iterator it = C129586aY.of(VersionedCapability.Facetracker, VersionedCapability.Segmentation, VersionedCapability.HairSegmentation, VersionedCapability.MSuggestionsCore).iterator();
        while (it.hasNext()) {
            this.A05.put(it.next(), r7);
        }
        C172878Nf it2 = r6.A00.A01.iterator();
        while (it2.hasNext()) {
            this.A05.put(it2.next(), r6);
        }
    }
}
