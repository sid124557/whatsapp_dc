package X;

import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod;
import com.facebook.cameracore.ardelivery.model.EffectAssetType;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.nio.ByteBuffer;

/* renamed from: X.9WL  reason: invalid class name */
public class AnonymousClass9WL {
    public VersionedCapability A00;
    public final int A01;
    public final ARAssetType A02;
    public final ARRequestAsset$CompressionMethod A03;
    public final EffectAssetType A04;
    public final C192449Ju A05;
    public final C192479Jx A06;
    public final Boolean A07;
    public final Boolean A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;

    public static void A01(String str, ByteBuffer byteBuffer) {
        if (str == null) {
            byteBuffer.putInt(-1);
            return;
        }
        byteBuffer.putInt(str.getBytes().length);
        byteBuffer.put(str.getBytes());
    }

    public int A02() {
        if (AnonymousClass000.A1Y(this.A02, ARAssetType.SUPPORT)) {
            return this.A01;
        }
        throw AnonymousClass001.A0e("Cannot get Version from Effect Asset");
    }

    public VersionedCapability A03() {
        if (AnonymousClass000.A1Y(this.A02, ARAssetType.SUPPORT)) {
            return this.A00;
        }
        throw AnonymousClass001.A0e("Cannot get VersionedCapability from Effect Asset");
    }

    public String A04() {
        ARAssetType aRAssetType = this.A02;
        int ordinal = aRAssetType.ordinal();
        if (ordinal == 0) {
            EffectAssetType effectAssetType = this.A04;
            if (effectAssetType == null) {
                return null;
            }
            return effectAssetType.name();
        } else if (ordinal == 1) {
            VersionedCapability versionedCapability = this.A00;
            versionedCapability.getClass();
            return versionedCapability.toServerValue();
        } else if (ordinal == 2 || ordinal == 3) {
            C192449Ju r0 = this.A05;
            r0.getClass();
            return r0.toString();
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18270x1.A1H(A0o, "Unsupported asset type: ", aRAssetType);
            throw AnonymousClass001.A0e(A0o.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0137, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0138, code lost:
        r4 = r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x009c */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0137 A[ExcHandler: IllegalArgumentException | IllegalStateException | BufferUnderflowException (e java.lang.Throwable), PHI: r2 
      PHI: (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v7 java.lang.String), (r2v6 java.lang.String), (r2v6 java.lang.String) binds: [B:9:0x0031, B:49:0x00c1, B:24:0x0068, B:39:0x009c] A[DONT_GENERATE, DONT_INLINE], Splitter:B:9:0x0031] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9WL(java.nio.ByteBuffer r9) {
        /*
            r8 = this;
            r8.<init>()
            int r5 = r9.remaining()
            r4 = 0
            long r2 = r9.getLong()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x014c }
            r6 = 7310021016723351138(0x65726962726f6662, double:4.774966457081997E180)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x013d
            java.lang.String r1 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x014c }
            r1.getClass()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x014c }
            r8.A0A = r1     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x013a }
            java.lang.String r3 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x013a }
            r8.A0B = r3     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x014f }
            java.lang.String r3 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x014f }
            r8.A0C = r3     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x014f }
            java.lang.String r2 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x014f }
            r2.getClass()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x014f }
            com.facebook.cameracore.ardelivery.model.ARAssetType r6 = com.facebook.cameracore.ardelivery.model.ARAssetType.valueOf(r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            r8.A02 = r6     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            java.lang.String r2 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            int r3 = r6.ordinal()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            r0 = 0
            if (r3 == r0) goto L_0x00a3
            r0 = 1
            if (r3 == r0) goto L_0x0068
            r0 = 2
            if (r3 == r0) goto L_0x005d
            r0 = 3
            if (r3 == r0) goto L_0x005d
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            java.lang.String r0 = "Illegal asset type: "
            X.C18270x1.A1H(r3, r0, r6)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            java.lang.String r0 = r3.toString()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            throw r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
        L_0x005d:
            if (r2 != 0) goto L_0x0063
            r6 = r4
        L_0x0060:
            r3 = r4
            r0 = r4
            goto L_0x00ae
        L_0x0063:
            X.9Ju r6 = X.C192449Ju.valueOf(r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            goto L_0x0060
        L_0x0068:
            X.9JR r6 = X.AnonymousClass9JR.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x009c, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            int r0 = r6.ordinal()     // Catch:{ IllegalArgumentException -> 0x009c, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            switch(r0) {
                case 0: goto L_0x007e;
                case 1: goto L_0x008a;
                case 2: goto L_0x0081;
                case 3: goto L_0x0084;
                case 4: goto L_0x0087;
                case 5: goto L_0x008d;
                case 6: goto L_0x0090;
                case 7: goto L_0x0093;
                case 8: goto L_0x0096;
                case 9: goto L_0x0099;
                default: goto L_0x0073;
            }     // Catch:{ IllegalArgumentException -> 0x009c, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
        L_0x0073:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x009c, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            java.lang.String r0 = "VersionedCapability is not set up for the given SupportAssetType:"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0E(r6, r0, r3)     // Catch:{ IllegalArgumentException -> 0x009c, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x009c, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
        L_0x007e:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r3 = com.facebook.cameracore.ardelivery.model.VersionedCapability.Facetracker     // Catch:{ IllegalArgumentException -> 0x009c, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            goto L_0x00a0
        L_0x0081:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r3 = com.facebook.cameracore.ardelivery.model.VersionedCapability.Segmentation     // Catch:{ IllegalArgumentException -> 0x009c, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            goto L_0x00a0
        L_0x0084:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r3 = com.facebook.cameracore.ardelivery.model.VersionedCapability.HairSegmentation     // Catch:{ IllegalArgumentException -> 0x009c, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            goto L_0x00a0
        L_0x0087:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r3 = com.facebook.cameracore.ardelivery.model.VersionedCapability.HandTracker     // Catch:{ IllegalArgumentException -> 0x009c, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            goto L_0x00a0
        L_0x008a:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r3 = com.facebook.cameracore.ardelivery.model.VersionedCapability.TargetRecognition     // Catch:{ IllegalArgumentException -> 0x009c, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            goto L_0x00a0
        L_0x008d:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r3 = com.facebook.cameracore.ardelivery.model.VersionedCapability.XRay     // Catch:{ IllegalArgumentException -> 0x009c, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            goto L_0x00a0
        L_0x0090:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r3 = com.facebook.cameracore.ardelivery.model.VersionedCapability.MSuggestionsCore     // Catch:{ IllegalArgumentException -> 0x009c, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            goto L_0x00a0
        L_0x0093:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r3 = com.facebook.cameracore.ardelivery.model.VersionedCapability.FaceExpressionFitting     // Catch:{ IllegalArgumentException -> 0x009c, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            goto L_0x00a0
        L_0x0096:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r3 = com.facebook.cameracore.ardelivery.model.VersionedCapability.GazeCorrection     // Catch:{ IllegalArgumentException -> 0x009c, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            goto L_0x00a0
        L_0x0099:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r3 = com.facebook.cameracore.ardelivery.model.VersionedCapability.BiBytedoc     // Catch:{ IllegalArgumentException -> 0x009c, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            goto L_0x00a0
        L_0x009c:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r3 = com.facebook.cameracore.ardelivery.model.VersionedCapability.fromServerValue(r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
        L_0x00a0:
            r6 = r4
            r0 = r4
            goto L_0x00ae
        L_0x00a3:
            if (r2 != 0) goto L_0x00a8
            com.facebook.cameracore.ardelivery.model.EffectAssetType r0 = com.facebook.cameracore.ardelivery.model.EffectAssetType.NORMAL_EFFECT     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            goto L_0x00ac
        L_0x00a8:
            com.facebook.cameracore.ardelivery.model.EffectAssetType r0 = com.facebook.cameracore.ardelivery.model.EffectAssetType.valueOf(r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
        L_0x00ac:
            r3 = r4
            r6 = r4
        L_0x00ae:
            r8.A04 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            r8.A00 = r3     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            r8.A05 = r6     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            java.lang.String r3 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            r8.A0D = r3     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x014f }
            java.lang.String r2 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x014f }
            r2.getClass()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x014f }
            com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod r0 = com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod.valueOf(r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            r8.A03 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            int r0 = r9.getInt()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            r8.A01 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            boolean r0 = r9.hasRemaining()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            if (r0 == 0) goto L_0x00ff
            java.lang.String r2 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            r8.A09 = r2     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
        L_0x00d9:
            boolean r0 = r9.hasRemaining()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            r8.A08 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
        L_0x00ed:
            boolean r0 = r9.hasRemaining()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            if (r0 == 0) goto L_0x0104
            java.lang.String r2 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            if (r2 != 0) goto L_0x0107
            goto L_0x0102
        L_0x00fa:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            r8.A08 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            goto L_0x00ed
        L_0x00ff:
            r8.A09 = r4     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            goto L_0x00d9
        L_0x0102:
            r0 = r4
            goto L_0x010b
        L_0x0104:
            r8.A06 = r4     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            goto L_0x010d
        L_0x0107:
            X.9Jx r0 = X.C192479Jx.valueOf(r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
        L_0x010b:
            r8.A06 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
        L_0x010d:
            boolean r0 = r9.hasRemaining()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            if (r0 == 0) goto L_0x012e
            java.lang.String r0 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            r8.A07 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
        L_0x0121:
            boolean r0 = r9.hasRemaining()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            if (r0 == 0) goto L_0x0134
            java.lang.String r0 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            r8.A0E = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            goto L_0x0133
        L_0x012e:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            r8.A07 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            goto L_0x0121
        L_0x0133:
            return
        L_0x0134:
            r8.A0E = r4     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x0137 }
            return
        L_0x0137:
            r0 = move-exception
            r4 = r1
            goto L_0x0152
        L_0x013a:
            r0 = move-exception
            r4 = r1
            goto L_0x014d
        L_0x013d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x014c }
            java.lang.String r0 = "Invalid data: "
            java.lang.String r0 = X.AnonymousClass000.A0Z(r0, r1, r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x014c }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x014c }
            throw r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x014c }
        L_0x014c:
            r0 = move-exception
        L_0x014d:
            r2 = r4
            goto L_0x0152
        L_0x014f:
            r0 = move-exception
            r4 = r1
            r2 = r3
        L_0x0152:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = " -- ByteBuffer size:"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", effect id:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", error string:"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9WL.<init>(java.nio.ByteBuffer):void");
    }

    public static String A00(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i == -1) {
            return null;
        }
        if (i < 0) {
            throw AnonymousClass001.A0e("read the wrong cache");
        } else if (i == 0) {
            throw AnonymousClass001.A0e("the number of bytes shouldn't be 0");
        } else if (i <= 4096) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return new String(bArr);
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("trying to allocate ");
            A0o.append(i);
            throw AnonymousClass000.A0I(" bytes which exceeds the buffer limit.", A0o);
        }
    }

    public AnonymousClass9WL(ARAssetType aRAssetType, ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod, EffectAssetType effectAssetType, C192449Ju r6, C192479Jx r7, VersionedCapability versionedCapability, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        switch (aRAssetType.ordinal()) {
            case 0:
                str2.getClass();
                break;
            case 1:
                if (str2 == null) {
                    versionedCapability.getClass();
                    if (str4 != null) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
                break;
            case 2:
            case 3:
                r6.getClass();
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                throw AnonymousClass000.A0E(aRAssetType, "Got unsupported type: ", AnonymousClass001.A0o());
        }
        str5.getClass();
        this.A0A = str;
        this.A0B = str2;
        this.A0C = str3;
        this.A02 = aRAssetType;
        this.A00 = versionedCapability;
        if (aRAssetType != ARAssetType.EFFECT) {
            effectAssetType = null;
        } else if (effectAssetType == null) {
            effectAssetType = EffectAssetType.NORMAL_EFFECT;
        }
        this.A04 = effectAssetType;
        this.A0D = str4;
        this.A03 = aRRequestAsset$CompressionMethod;
        this.A01 = i;
        this.A09 = str5;
        this.A08 = bool;
        this.A06 = r7;
        this.A05 = r6;
        this.A07 = bool2;
        this.A0E = str6;
    }
}
