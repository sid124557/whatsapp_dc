package X;

import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod;
import com.facebook.cameracore.ardelivery.model.EffectAssetType;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.storage.interfaces.StorageCallback;
import java.io.File;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9Yh  reason: invalid class name and case insensitive filesystem */
public class C195539Yh implements C203419nf {
    public final C1903295i A00;
    public final Map A01;

    public static AnonymousClass9WL A00(AnonymousClass9WL r22, ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod) {
        AnonymousClass9WL r0 = r22;
        ARAssetType aRAssetType = r0.A02;
        ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod2 = aRRequestAsset$CompressionMethod;
        switch (aRAssetType.ordinal()) {
            case 0:
                String str = r0.A0A;
                String str2 = r0.A0B;
                String str3 = r0.A0C;
                ARAssetType aRAssetType2 = ARAssetType.EFFECT;
                if (AnonymousClass000.A1Y(aRAssetType, aRAssetType2)) {
                    EffectAssetType effectAssetType = r0.A04;
                    if (AnonymousClass000.A1Y(aRAssetType, aRAssetType2)) {
                        String str4 = r0.A0D;
                        String str5 = r0.A09;
                        boolean z = false;
                        if (aRAssetType != ARAssetType.SUPPORT) {
                            z = true;
                        }
                        if (z) {
                            String str6 = str4;
                            String str7 = str3;
                            String str8 = str2;
                            String str9 = str;
                            return new AnonymousClass9WL(aRAssetType, aRRequestAsset$CompressionMethod2, effectAssetType, (C192449Ju) null, (C192479Jx) null, (VersionedCapability) null, r0.A08, r0.A07, str9, str8, str7, str6, str5, (String) null, -1);
                        }
                        throw AnonymousClass001.A0e("Cannot get isLoggingDisabled from support asset");
                    }
                    throw AnonymousClass001.A0e("Cannot get required SDK version from support asset");
                }
                throw AnonymousClass001.A0e("Cannot get effect asset type from asset type other than effect");
            case 1:
                String str10 = r0.A0A;
                String str11 = r0.A0C;
                VersionedCapability A03 = r0.A03();
                int A02 = r0.A02();
                String str12 = r0.A09;
                Boolean bool = Boolean.FALSE;
                String str13 = str11;
                String str14 = str10;
                return new AnonymousClass9WL(aRAssetType, aRRequestAsset$CompressionMethod2, (EffectAssetType) null, (C192449Ju) null, r0.A06, A03, bool, r0.A07, str14, (String) null, str13, (String) null, str12, (String) null, A02);
            case 2:
            case 3:
                String str15 = r0.A0A;
                String str16 = r0.A0B;
                String str17 = r0.A0C;
                String str18 = r0.A09;
                boolean z2 = false;
                if (aRAssetType != ARAssetType.SUPPORT) {
                    z2 = true;
                }
                if (z2) {
                    Boolean bool2 = r0.A08;
                    String str19 = str17;
                    String str20 = str16;
                    String str21 = str15;
                    return new AnonymousClass9WL(aRAssetType, aRRequestAsset$CompressionMethod2, (EffectAssetType) null, r0.A05, (C192479Jx) null, (VersionedCapability) null, bool2, r0.A07, str21, str20, str19, (String) null, str18, (String) null, -1);
                }
                throw AnonymousClass001.A0e("Cannot get isLoggingDisabled from support asset");
            case 4:
                String str22 = r0.A0A;
                String str23 = r0.A0B;
                String str24 = r0.A0C;
                ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod3 = r0.A03;
                String str25 = r0.A09;
                boolean z3 = false;
                if (aRAssetType != ARAssetType.SUPPORT) {
                    z3 = true;
                }
                if (z3) {
                    String str26 = str24;
                    String str27 = str23;
                    String str28 = str22;
                    return new AnonymousClass9WL(aRAssetType, aRRequestAsset$CompressionMethod3, (EffectAssetType) null, (C192449Ju) null, (C192479Jx) null, (VersionedCapability) null, r0.A08, r0.A07, str28, str27, str26, (String) null, str25, (String) null, -1);
                }
                throw AnonymousClass001.A0e("Cannot get isLoggingDisabled from support asset");
            case 5:
                String str29 = r0.A0A;
                String str30 = r0.A0C;
                String str31 = r0.A09;
                Boolean bool3 = Boolean.FALSE;
                String str32 = str31;
                String str33 = str30;
                String str34 = str29;
                return new AnonymousClass9WL(aRAssetType, aRRequestAsset$CompressionMethod2, (EffectAssetType) null, (C192449Ju) null, r0.A06, (VersionedCapability) null, bool3, r0.A07, str34, (String) null, str33, (String) null, str32, r0.A0E, -1);
            default:
                throw AnonymousClass001.A0c(MessageFormat.format("Unknown asset type : {0}", AnonymousClass000.A1b(aRAssetType)));
        }
    }

    public final AnonymousClass9MB A01(ARAssetType aRAssetType) {
        AnonymousClass9MB r0 = (AnonymousClass9MB) this.A01.get(aRAssetType);
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass000.A0E(aRAssetType, "unsupported asset type : ", AnonymousClass001.A0o());
    }

    public C1903395j A02() {
        return (C1903395j) this.A00.A00(ARAssetType.SUPPORT);
    }

    public File B53(AnonymousClass9WL r3, StorageCallback storageCallback) {
        A01(r3.A02);
        return this.A00.B53(A00(r3, ARRequestAsset$CompressionMethod.NONE), storageCallback);
    }

    public boolean BH7(AnonymousClass9WL r4, boolean z) {
        A01(r4.A02);
        return this.A00.BH7(A00(r4, ARRequestAsset$CompressionMethod.NONE), false);
    }

    public void Bj3(AnonymousClass9WL r2) {
        this.A00.Bj3(r2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: X.9Uh} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [java.io.File] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ec A[SYNTHETIC, Splitter:B:68:0x00ec] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File Bki(X.AnonymousClass9WL r14, com.facebook.cameracore.ardelivery.storage.interfaces.StorageCallback r15, java.io.File r16) {
        /*
            r13 = this;
            com.facebook.cameracore.ardelivery.model.ARAssetType r11 = r14.A02
            X.9MB r1 = r13.A01(r11)
            X.95i r12 = r13.A00
            java.lang.String r10 = "decompression result is null"
            java.lang.Boolean r0 = r14.A07     // Catch:{ all -> 0x011d }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x011d }
            r9 = 0
            r8 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.String r10 = "Encountered Unexpected Encrypted Asset in Android Delivery"
        L_0x0016:
            r15.onExtractionFinish(r8, r10)     // Catch:{ all -> 0x011d }
            goto L_0x010b
        L_0x001b:
            com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod r3 = r14.A03     // Catch:{ all -> 0x011d }
            com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod r7 = com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod.NONE     // Catch:{ all -> 0x011d }
            r6 = 1
            if (r3 == r7) goto L_0x00f2
            r15.onExtractionStart()     // Catch:{ all -> 0x011d }
            X.4C1 r0 = r1.A00     // Catch:{ all -> 0x00e6 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00e6 }
            X.9Nq r0 = (X.C193229Nq) r0     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x00e6 }
            java.lang.String r5 = r14.A0A     // Catch:{ all -> 0x00e6 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00e6 }
            r1.<init>(r0, r5)     // Catch:{ all -> 0x00e6 }
            if (r16 != 0) goto L_0x0042
            java.lang.String r0 = "file to decompress is null"
            X.9Uh r4 = new X.9Uh     // Catch:{ all -> 0x00e6 }
            r4.<init>((java.lang.String) r0)     // Catch:{ all -> 0x00e6 }
            goto L_0x0083
        L_0x0042:
            X.AnonymousClass9U6.A00(r1)     // Catch:{ all -> 0x00e6 }
            int r2 = r3.ordinal()     // Catch:{ all -> 0x00e1 }
            if (r2 == r6) goto L_0x006b
            r0 = 2
            if (r2 != r0) goto L_0x0060
            X.AnonymousClass9M5.A00()     // Catch:{ all -> 0x00e1 }
            X.9lb r3 = X.AnonymousClass9M5.A00     // Catch:{ all -> 0x00e1 }
            java.lang.String r2 = r16.getPath()     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = r1.getPath()     // Catch:{ all -> 0x00e1 }
            X.9Uh r4 = r3.decompress(r2, r0)     // Catch:{ all -> 0x00e1 }
            goto L_0x007c
        L_0x0060:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = "Got unsupported compression: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0E(r3, r0, r2)     // Catch:{ all -> 0x00e1 }
            throw r0     // Catch:{ all -> 0x00e1 }
        L_0x006b:
            X.AnonymousClass9M5.A00()     // Catch:{ all -> 0x00e1 }
            X.9lb r3 = X.AnonymousClass9M5.A01     // Catch:{ all -> 0x00e1 }
            java.lang.String r2 = r16.getPath()     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = r1.getPath()     // Catch:{ all -> 0x00e1 }
            X.9Uh r4 = r3.decompress(r2, r0)     // Catch:{ all -> 0x00e1 }
        L_0x007c:
            java.io.File r0 = r4.A00     // Catch:{ all -> 0x00e6 }
            if (r0 != 0) goto L_0x0083
            X.AnonymousClass9U6.A00(r1)     // Catch:{ all -> 0x00e6 }
        L_0x0083:
            java.io.File r2 = r4.A00     // Catch:{ all -> 0x00e8 }
            com.facebook.cameracore.ardelivery.model.ARAssetType r0 = com.facebook.cameracore.ardelivery.model.ARAssetType.SUPPORT     // Catch:{ all -> 0x00e8 }
            if (r11 == r0) goto L_0x008d
            com.facebook.cameracore.ardelivery.model.ARAssetType r0 = com.facebook.cameracore.ardelivery.model.ARAssetType.REMOTE     // Catch:{ all -> 0x00e8 }
            if (r11 != r0) goto L_0x00d5
        L_0x008d:
            r3 = 0
            if (r2 == 0) goto L_0x00ae
            boolean r0 = r2.exists()     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r2.isDirectory()     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00ae
            java.lang.String[] r1 = r2.list()     // Catch:{ all -> 0x00e8 }
            if (r1 == 0) goto L_0x00ae
            int r0 = r1.length     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00ae
            if (r0 != r6) goto L_0x00ae
            r0 = r1[r8]     // Catch:{ all -> 0x00e8 }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x00e8 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x00e8 }
        L_0x00ae:
            if (r3 != 0) goto L_0x00d4
            if (r2 == 0) goto L_0x00d4
            boolean r0 = r2.isDirectory()     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00d4
            java.lang.String[] r0 = r2.list()     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00d4
            int r0 = r0.length     // Catch:{ all -> 0x00e8 }
            if (r0 <= r6) goto L_0x00d4
            java.lang.String r2 = "AlwaysUnzipStorageStrategy"
            java.lang.String r1 = "%s [%s] has more than one file in tar."
            java.lang.Object[] r0 = X.AnonymousClass002.A0M()     // Catch:{ all -> 0x00e8 }
            java.lang.String r11 = r11.name()     // Catch:{ all -> 0x00e8 }
            r0[r8] = r11     // Catch:{ all -> 0x00e8 }
            r0[r6] = r5     // Catch:{ all -> 0x00e8 }
            X.C162477s9.A0G(r2, r1, r0)     // Catch:{ all -> 0x00e8 }
        L_0x00d4:
            r2 = r3
        L_0x00d5:
            boolean r1 = X.AnonymousClass9U6.A01(r2)     // Catch:{ all -> 0x00e8 }
            if (r1 != 0) goto L_0x00f5
            java.lang.String r0 = r4.A01     // Catch:{ all -> 0x011d }
            r15.onExtractionFinish(r1, r0)     // Catch:{ all -> 0x011d }
            goto L_0x010b
        L_0x00e1:
            r0 = move-exception
            X.AnonymousClass9U6.A00(r1)     // Catch:{ all -> 0x00e6 }
            throw r0     // Catch:{ all -> 0x00e6 }
        L_0x00e6:
            r0 = move-exception
            goto L_0x00ea
        L_0x00e8:
            r0 = move-exception
            r9 = r4
        L_0x00ea:
            if (r9 == 0) goto L_0x00ee
            java.lang.String r10 = r9.A01     // Catch:{ all -> 0x011d }
        L_0x00ee:
            r15.onExtractionFinish(r8, r10)     // Catch:{ all -> 0x011d }
            goto L_0x011c
        L_0x00f2:
            r2 = r16
            goto L_0x00fa
        L_0x00f5:
            java.lang.String r0 = r4.A01     // Catch:{ all -> 0x011d }
            r15.onExtractionFinish(r1, r0)     // Catch:{ all -> 0x011d }
        L_0x00fa:
            X.9WL r0 = A00(r14, r7)     // Catch:{ all -> 0x011d }
            r15.onCachePutStart()     // Catch:{ all -> 0x011d }
            java.io.File r9 = r12.Bki(r0, r15, r2)     // Catch:{ all -> 0x0118 }
            if (r9 == 0) goto L_0x0108
            r8 = 1
        L_0x0108:
            r15.onCachePutFinish(r8)     // Catch:{ all -> 0x011d }
        L_0x010b:
            boolean r0 = X.AnonymousClass9U6.A01(r16)
            if (r0 == 0) goto L_0x0117
            X.C162457s7.A0H(r16)
            r16.delete()
        L_0x0117:
            return r9
        L_0x0118:
            r0 = move-exception
            r15.onCachePutFinish(r8)     // Catch:{ all -> 0x011d }
        L_0x011c:
            throw r0     // Catch:{ all -> 0x011d }
        L_0x011d:
            r1 = move-exception
            boolean r0 = X.AnonymousClass9U6.A01(r16)
            if (r0 == 0) goto L_0x012a
            X.C162457s7.A0H(r16)
            r16.delete()
        L_0x012a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195539Yh.Bki(X.9WL, com.facebook.cameracore.ardelivery.storage.interfaces.StorageCallback, java.io.File):java.io.File");
    }

    public void Bs2(AnonymousClass9WL r2) {
        this.A00.Bs2(r2);
    }

    public C195539Yh(C1903295i r3, AnonymousClass9MB r4, AnonymousClass9MB r5, AnonymousClass9MB r6, AnonymousClass9MB r7, AnonymousClass9MB r8, AnonymousClass9MB r9) {
        this.A00 = r3;
        HashMap A0t = AnonymousClass001.A0t();
        this.A01 = A0t;
        A0t.put(ARAssetType.EFFECT, r4);
        A0t.put(ARAssetType.SUPPORT, r5);
        A0t.put(ARAssetType.ASYNC, r6);
        A0t.put(ARAssetType.REMOTE, r7);
        A0t.put(ARAssetType.SCRIPTING_PACKAGE, r8);
        A0t.put(ARAssetType.SPARKVISION, r9);
    }
}
