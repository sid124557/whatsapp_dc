package X;

import com.whatsapp.stickers.WebpUtils;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: X.1fk  reason: invalid class name and case insensitive filesystem */
public class C28131fk extends C56482s3 {
    public static final AnonymousClass5ZC A07 = AnonymousClass0x9.A0T(1, 60, 200);
    public final C55682qk A00;
    public final AnonymousClass2VS A01;
    public final C64393Dh A02;
    public final WebpUtils A03;
    public final AnonymousClass4FS A04;
    public final Executor A05;
    public final Executor A06;

    public C28131fk(C55682qk r3, AnonymousClass2VS r4, C64393Dh r5, C69263Wi r6, WebpUtils webpUtils, AnonymousClass4FS r8) {
        super(C72333dY.A05(r8, 23));
        this.A00 = r3;
        this.A04 = r8;
        this.A03 = webpUtils;
        this.A02 = r5;
        this.A01 = r4;
        Objects.requireNonNull(r6);
        this.A05 = new C86044Ip(r6, 2);
        Objects.requireNonNull(r8);
        this.A06 = new C86044Ip(r8, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0107, code lost:
        if (r1 != 2) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.AnonymousClass4EV r51, X.C633138t r52, X.C84134Bd r53, X.C84134Bd r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, byte[] r61, int r62, int r63, int r64, int r65, long r66) {
        /*
            r50 = this;
            r3 = r56
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r9 = 0
            r0 = r50
            r1 = r62
            r2 = r61
            if (r4 != 0) goto L_0x010a
            if (r61 == 0) goto L_0x010a
            r33 = r65
            r21 = r57
            r23 = r59
            if (r65 != 0) goto L_0x0097
            boolean r4 = android.text.TextUtils.isEmpty(r23)
            if (r4 != 0) goto L_0x0025
            boolean r4 = android.text.TextUtils.isEmpty(r21)
            if (r4 == 0) goto L_0x0097
        L_0x0025:
            X.5ZC r2 = A07
            boolean r2 = r2.A00()
            if (r2 == 0) goto L_0x005f
            X.2qk r8 = r0.A00
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r2 = ", createMediaDownloadRequestDataForFile/direct_path is "
            r7.append(r2)
            boolean r6 = android.text.TextUtils.isEmpty(r23)
            java.lang.String r5 = "null"
            java.lang.String r4 = "not null"
            r2 = r4
            if (r6 == 0) goto L_0x0046
            r2 = r5
        L_0x0046:
            r7.append(r2)
            java.lang.String r2 = " encHash is "
            r7.append(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r21)
            if (r2 != 0) goto L_0x0055
            r5 = r4
        L_0x0055:
            java.lang.String r5 = X.AnonymousClass000.A0X(r5, r7)
            r4 = 1
            java.lang.String r2 = "FileDownloadManager/createMediaDownloadForFMessage"
            r8.A0A(r2, r4, r5)
        L_0x005f:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "FileDownloadManager/queueFileDownload auto download documentType "
            r4.append(r2)
            r11 = r64
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            java.lang.String r2 = X.C18270x1.A0T(r2)
            r4.append(r2)
            java.lang.String r2 = ", fileDownloadRequestData is "
            r4.append(r2)
            if (r9 != 0) goto L_0x0093
            java.lang.String r2 = "null"
        L_0x007f:
            X.C18260x0.A1L(r4, r2)
            r5 = r51
            if (r9 != 0) goto L_0x011d
            java.util.concurrent.Executor r2 = r0.A05
            r1 = 24
            X.3cG r0 = new X.3cG
            r0.<init>((java.lang.Object) r5, (int) r1)
            r2.execute(r0)
            return
        L_0x0093:
            java.lang.String r2 = "no null"
            goto L_0x007f
        L_0x0097:
            X.3Dh r5 = r0.A02
            r4 = 1
            if (r1 != r4) goto L_0x00fd
            X.20h r13 = X.C369320h.ACCOUNT
        L_0x009e:
            r40 = 0
        L_0x00a0:
            r12 = r52
            r17 = r58
            r6 = r12
            r7 = r13
            r8 = r21
            r9 = r3
            r10 = r17
            r11 = r40
            java.io.File r16 = r5.A0L(r6, r7, r8, r9, r10, r11)
            r28 = 0
            r4 = r5
            r5 = r12
            r6 = r13
            r7 = r3
            r8 = r10
            r9 = r11
            r10 = r28
            java.io.File r15 = r4.A0M(r5, r6, r7, r8, r9, r10)
            r10 = 0
            r36 = 0
            java.lang.String r20 = X.C18280x3.A0Y()
            r30 = 2
            r32 = 1
            X.2dc r9 = new X.2dc
            r14 = r10
            r24 = r10
            r25 = r10
            r26 = r10
            r38 = r28
            r39 = r28
            r41 = r28
            r42 = r28
            r43 = r28
            r44 = r28
            r45 = r28
            r46 = r28
            r47 = r28
            r48 = r28
            r49 = r28
            r31 = r63
            r34 = r66
            r19 = r55
            r22 = r60
            r11 = r10
            r18 = r3
            r27 = r2
            r29 = r28
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            goto L_0x005f
        L_0x00fd:
            r4 = 5
            if (r1 != r4) goto L_0x0103
            X.20h r13 = X.C369320h.NEWSLETTER
            goto L_0x009e
        L_0x0103:
            r13 = 0
            r4 = 2
            r40 = 1
            if (r1 == r4) goto L_0x00a0
            goto L_0x009e
        L_0x010a:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "FileDownloadManager/createMediaDownloadForFMessage/unable to download due to missing media data; mediaKey="
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = ", fileHash="
            X.C18260x0.A0r(r2, r3, r5)
            goto L_0x005f
        L_0x011d:
            X.2kO r4 = new X.2kO
            r4.<init>(r1, r3)
            X.2VS r7 = r0.A01
            r8 = 0
            r10 = 1
            r12 = 1
            r14 = 0
            X.1I7 r3 = r7.A00(r8, r9, r10, r11, r12, r14)
            r3.AwR(r5)
            r5 = r53
            if (r53 == 0) goto L_0x013b
            java.util.concurrent.Executor r2 = r0.A06
            X.3XB r1 = r3.A0G
            r1.A04(r5, r2)
        L_0x013b:
            r5 = r54
            if (r54 == 0) goto L_0x0146
            java.util.concurrent.Executor r2 = r0.A05
            X.3XB r1 = r3.A0H
            r1.A04(r5, r2)
        L_0x0146:
            r0.A02(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28131fk.A08(X.4EV, X.38t, X.4Bd, X.4Bd, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, byte[], int, int, int, int, long):void");
    }
}
