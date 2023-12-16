package X;

import java.io.File;

/* renamed from: X.7a7  reason: invalid class name and case insensitive filesystem */
public class C152787a7 {
    public String A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final C152527Zf A0E;
    public final C158667kM A0F;
    public final C142366x5 A0G;
    public final File A0H;
    public final boolean A0I;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C152787a7(android.media.MediaFormat r8, X.C152527Zf r9, X.C158667kM r10, X.C158247jf r11, X.C142366x5 r12, java.io.File r13, int r14, int r15, long r16, long r18, long r20, long r22, boolean r24) {
        /*
            r7 = this;
            r4 = -1
            r2 = -1
            r7.<init>()
            r7.A0H = r13
            r0 = r16
            r7.A09 = r0
            r0 = r18
            r7.A0A = r0
            r7.A02 = r14
            r7.A01 = r15
            r0 = r20
            r7.A0B = r0
            r5 = r22
            r7.A0D = r5
            r5 = r24
            r7.A0I = r5
            r7.A0G = r12
            boolean r5 = r10.A0T
            if (r5 == 0) goto L_0x0055
            r7.A08 = r14
            r7.A06 = r15
            r7.A0C = r0
        L_0x002c:
            r7.A05 = r4
            r7.A07 = r4
        L_0x0030:
            r7.A0F = r10
            r7.A0E = r9
            if (r8 == 0) goto L_0x0053
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0053
            java.lang.String r1 = "color-standard"
            boolean r0 = r8.containsKey(r1)
            if (r0 == 0) goto L_0x0053
            int r0 = r8.getInteger(r1)
            r7.A03 = r0
            java.lang.String r0 = "color-transfer"
            int r0 = r8.getInteger(r0)
        L_0x0050:
            r7.A04 = r0
            return
        L_0x0053:
            r0 = 0
            goto L_0x0050
        L_0x0055:
            if (r11 != 0) goto L_0x005e
            r7.A08 = r4
            r7.A06 = r4
            r7.A0C = r2
            goto L_0x002c
        L_0x005e:
            int r0 = r11.A0A
            r7.A08 = r0
            int r0 = r11.A08
            r7.A06 = r0
            int r0 = r11.A00()
            long r0 = (long) r0
            r7.A0C = r0
            int r0 = r11.A01
            r7.A05 = r0
            int r0 = r11.A09
            r7.A07 = r0
            X.7YY r0 = r11.A0E
            if (r0 == 0) goto L_0x0030
            X.6xU r0 = r0.A02
            java.lang.String r0 = r0.name()
            r7.A00 = r0
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152787a7.<init>(android.media.MediaFormat, X.7Zf, X.7kM, X.7jf, X.6x5, java.io.File, int, int, long, long, long, long, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C152787a7 r7 = (C152787a7) obj;
            if (this.A09 != r7.A09 || this.A0A != r7.A0A || this.A02 != r7.A02 || this.A01 != r7.A01 || this.A0B != r7.A0B || this.A08 != r7.A08 || this.A06 != r7.A06 || this.A0C != r7.A0C || this.A05 != r7.A05 || this.A07 != r7.A07 || this.A0D != r7.A0D || Double.compare(0.0d, 0.0d) != 0 || this.A0I != r7.A0I || this.A0G.mValue != r7.A0G.mValue || !this.A0H.equals(r7.A0H) || !this.A0F.equals(r7.A0F)) {
                return false;
            }
            C152527Zf r1 = this.A0E;
            C152527Zf r0 = r7.A0E;
            if (r1 == null) {
                if (r0 != null) {
                    return false;
                }
            } else if (r0 == null || !r1.equals(r0)) {
                return false;
            }
            String str = this.A00;
            String str2 = r7.A00;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (str2 == null || !str.equals(str2)) {
                return false;
            }
            if (!(this.A04 == r7.A04 && this.A03 == r7.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[23];
        objArr[0] = this.A0H;
        AnonymousClass001.A1Q(objArr, this.A09);
        AnonymousClass0x2.A1U(objArr, this.A0A);
        AnonymousClass000.A1O(objArr, this.A02);
        C18280x3.A1P(objArr, this.A01);
        objArr[5] = Long.valueOf(this.A0B);
        C18290x4.A1U(objArr, -1);
        objArr[7] = Integer.valueOf(this.A08);
        objArr[8] = Integer.valueOf(this.A06);
        objArr[9] = Long.valueOf(this.A0C);
        objArr[10] = Integer.valueOf(this.A05);
        objArr[11] = Integer.valueOf(this.A07);
        objArr[12] = Long.valueOf(this.A0D);
        objArr[13] = AnonymousClass6C8.A0Z();
        objArr[14] = Boolean.valueOf(this.A0I);
        objArr[15] = Integer.valueOf(this.A0G.mValue);
        objArr[16] = this.A0F;
        objArr[17] = this.A0E;
        objArr[18] = -1L;
        objArr[19] = this.A00;
        objArr[20] = false;
        objArr[21] = Integer.valueOf(this.A03);
        return C18310x6.A08(Integer.valueOf(this.A04), objArr, 22);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VideoResizeResult{outputFile=");
        A0o.append(this.A0H);
        A0o.append(", originalFileSize=");
        A0o.append(this.A09);
        A0o.append(", outputFileSize=");
        A0o.append(this.A0A);
        A0o.append(", sourceWidth=");
        A0o.append(this.A02);
        A0o.append(", sourceHeight=");
        A0o.append(this.A01);
        A0o.append(", sourceBitRate=");
        A0o.append(this.A0B);
        A0o.append(", sourceFrameRate=");
        A0o.append(-1);
        A0o.append(", targetWidth=");
        A0o.append(this.A08);
        A0o.append(", targetHeight=");
        A0o.append(this.A06);
        A0o.append(", targetRotationDegreesClockwise=");
        A0o.append(this.A07);
        A0o.append(", targetBitRate=");
        A0o.append(this.A0C);
        A0o.append(", targetFrameRate=");
        A0o.append(this.A05);
        A0o.append(", videoTime=");
        A0o.append(this.A0D);
        A0o.append(", frameDropPercent=");
        A0o.append(0.0d);
        A0o.append(", mediaResizeStatus=");
        A0o.append(this.A0F);
        A0o.append(", mIsLastSegment=");
        A0o.append(this.A0I);
        A0o.append(", mTrackType=");
        A0o.append(this.A0G);
        A0o.append(", mediaDemuxerStats=");
        A0o.append(this.A0E);
        A0o.append(", mOutputIndex=");
        A0o.append(0);
        A0o.append(", framePts=");
        A0o.append(-1);
        A0o.append(", targetCodec=");
        A0o.append(this.A00);
        AnonymousClass6C8.A1F(A0o, ", useHLGHdrTranscode=");
        A0o.append(", targetColorTransfer=");
        A0o.append(this.A04);
        A0o.append(", targetColorSpace=");
        A0o.append(this.A03);
        return AnonymousClass000.A0d(A0o);
    }
}
