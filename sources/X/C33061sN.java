package X;

import android.text.TextUtils;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1sN  reason: invalid class name and case insensitive filesystem */
public final class C33061sN extends C626635z {
    public static AnonymousClass1EU A00(C130786cX r1, C43592Ss r2) {
        C130546c9 A0G = AnonymousClass1EU.DEFAULT_INSTANCE.A0G();
        A0G.A08(r1);
        AnonymousClass1A4 r0 = (AnonymousClass1A4) A0G;
        A03(r2, r0);
        return (AnonymousClass1EU) r0.A06();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        if ((r1 & 128) != 0) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0044, code lost:
        if ((r0.bitField0_ & 64) != 0) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0050, code lost:
        if ((1048576 & r1) != 0) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if ((r1 & com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if ((131072 & r2) != 0) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(X.C624034w r8, X.AnonymousClass1VX r9, X.AnonymousClass1EU r10, java.lang.String r11, int r12, int r13) {
        /*
            int r1 = r10.bitField1_
            r0 = r1 & 16
            if (r0 != 0) goto L_0x000b
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            r7 = 0
            if (r0 == 0) goto L_0x000c
        L_0x000b:
            r7 = 1
        L_0x000c:
            int r2 = r10.bitField0_
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r2
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r6 = 0
            if (r0 != 0) goto L_0x001f
            r0 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r2
            r5 = 0
            if (r0 == 0) goto L_0x0020
        L_0x001f:
            r5 = 1
        L_0x0020:
            r0 = r1 & 64
            if (r0 != 0) goto L_0x0034
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0034
            r0 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0034
            r0 = r1 & 128(0x80, float:1.794E-43)
            r4 = 0
            if (r0 == 0) goto L_0x0035
        L_0x0034:
            r4 = 1
        L_0x0035:
            r0 = r2 & 64
            if (r0 == 0) goto L_0x0046
            X.1EB r0 = r10.documentMessage_
            if (r0 != 0) goto L_0x003f
            X.1EB r0 = X.AnonymousClass1EB.DEFAULT_INSTANCE
        L_0x003f:
            int r0 = r0.bitField0_
            r0 = r0 & 64
            r3 = 1
            if (r0 == 0) goto L_0x0047
        L_0x0046:
            r3 = 0
        L_0x0047:
            r0 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0052
            r0 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r1
            r2 = 0
            if (r0 == 0) goto L_0x0053
        L_0x0052:
            r2 = 1
        L_0x0053:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x005d
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x005e
        L_0x005d:
            r6 = 1
        L_0x005e:
            if (r5 == 0) goto L_0x0062
            if (r13 > 0) goto L_0x0096
        L_0x0062:
            if (r8 != 0) goto L_0x0096
            r0 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r0 != 0) goto L_0x0096
            if (r7 == 0) goto L_0x006e
            java.lang.String r2 = "reaction"
        L_0x006d:
            return r2
        L_0x006e:
            if (r4 == 0) goto L_0x0074
            java.lang.String r2 = "poll"
            return r2
        L_0x0074:
            if (r3 == 0) goto L_0x0079
            java.lang.String r2 = "medianotify"
            return r2
        L_0x0079:
            if (r2 == 0) goto L_0x007f
            java.lang.String r2 = "scheduled-call"
            return r2
        L_0x007f:
            java.lang.String r2 = "text"
            if (r6 == 0) goto L_0x0091
            r1 = 6822(0x1aa6, float:9.56E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r9.A0Y(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.String r2 = "event"
            return r2
        L_0x0091:
            if (r11 == 0) goto L_0x006d
            java.lang.String r2 = "media"
            return r2
        L_0x0096:
            java.lang.String r2 = "pay"
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33061sN.A02(X.34w, X.1VX, X.1EU, java.lang.String, int, int):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bf, code lost:
        if (r0 != 0) goto L_0x00c1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C43592Ss r14, X.AnonymousClass1A4 r15) {
        /*
            if (r14 == 0) goto L_0x0103
            X.6cX r0 = r15.A00
            X.1EU r0 = (X.AnonymousClass1EU) r0
            X.1Dk r0 = r0.messageContextInfo_
            if (r0 != 0) goto L_0x000c
            X.1Dk r0 = X.C21851Dk.DEFAULT_INSTANCE
        L_0x000c:
            X.6c9 r3 = r0.A0H()
            X.17V r3 = (X.AnonymousClass17V) r3
            X.6cX r0 = r3.A00
            X.1Dk r0 = (X.C21851Dk) r0
            X.1Dp r0 = r0.deviceListMetadata_
            if (r0 != 0) goto L_0x001c
            X.1Dp r0 = X.C21901Dp.DEFAULT_INSTANCE
        L_0x001c:
            X.6c9 r13 = r0.A0H()
            X.8Lq r8 = r14.A03
            if (r8 == 0) goto L_0x0032
            X.6cX r1 = X.C18320x8.A0C(r13)
            X.1Dp r1 = (X.C21901Dp) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.senderKeyHash_ = r8
        L_0x0032:
            X.239 r2 = r14.A05
            X.239 r0 = X.AnonymousClass239.HOSTED
            if (r2 != r0) goto L_0x0048
            X.6cX r1 = X.C18320x8.A0C(r13)
            X.1Dp r1 = (X.C21901Dp) r1
            int r0 = r2.value
            r1.senderAccountType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
        L_0x0048:
            X.8Lq r7 = r14.A02
            if (r7 == 0) goto L_0x005a
            X.6cX r1 = X.C18320x8.A0C(r13)
            X.1Dp r1 = (X.C21901Dp) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.recipientKeyHash_ = r7
        L_0x005a:
            long r4 = r14.A01
            r11 = 0
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0070
            X.6cX r1 = X.C18320x8.A0C(r13)
            X.1Dp r1 = (X.C21901Dp) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.senderTimestamp_ = r4
        L_0x0070:
            long r1 = r14.A00
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0084
            X.6cX r6 = X.C18320x8.A0C(r13)
            X.1Dp r6 = (X.C21901Dp) r6
            int r0 = r6.bitField0_
            r0 = r0 | 16
            r6.bitField0_ = r0
            r6.recipientTimestamp_ = r1
        L_0x0084:
            java.util.Set r10 = r14.A06
            if (r10 == 0) goto L_0x00a0
            X.6cX r9 = X.C18320x8.A0C(r13)
            X.1Dp r9 = (X.C21901Dp) r9
            X.4Fk r6 = r9.recipientKeyIndexes_
            r0 = r6
            X.8T6 r0 = (X.AnonymousClass8T6) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x009d
            X.4Fk r6 = X.C130786cX.A06(r6)
            r9.recipientKeyIndexes_ = r6
        L_0x009d:
            X.C170208Ch.A05(r10, r6)
        L_0x00a0:
            X.239 r0 = r14.A04
            if (r0 == 0) goto L_0x00b4
            X.6cX r6 = X.C18320x8.A0C(r13)
            X.1Dp r6 = (X.C21901Dp) r6
            int r0 = r0.value
            r6.receiverAccountType_ = r0
            int r0 = r6.bitField0_
            r0 = r0 | 32
            r6.bitField0_ = r0
        L_0x00b4:
            if (r8 != 0) goto L_0x00c1
            if (r7 != 0) goto L_0x00c1
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x00c1
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L_0x00c2
        L_0x00c1:
            r1 = 1
        L_0x00c2:
            java.lang.String r0 = "Invalid adv device metadata"
            X.C626936e.A0F(r1, r0)
            X.6cX r1 = X.C18320x8.A0C(r3)
            X.1Dk r1 = (X.C21851Dk) r1
            X.6cX r0 = r13.A06()
            X.1Dp r0 = (X.C21901Dp) r0
            r0.getClass()
            r1.deviceListMetadata_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            X.6cX r2 = X.C18320x8.A0C(r3)
            X.1Dk r2 = (X.C21851Dk) r2
            r1 = 2
            int r0 = r2.bitField0_
            r0 = r0 | 2
            r2.bitField0_ = r0
            r2.deviceListMetadataVersion_ = r1
            X.1EU r2 = X.C18290x4.A0T(r15)
            X.6cX r0 = r3.A06()
            X.1Dk r0 = (X.C21851Dk) r0
            r0.getClass()
            r2.messageContextInfo_ = r0
            int r1 = r2.bitField0_
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 | r0
            r2.bitField0_ = r1
        L_0x0103:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33061sN.A03(X.2Ss, X.1A4):void");
    }

    public static String A01(C620733j r10, C30411mP r11) {
        int i;
        long j;
        Object[] objArr;
        C149097La A01;
        List A1v = r11.A1v();
        int size = A1v.size() - 1;
        int i2 = 0;
        while (true) {
            if (i2 >= A1v.size() || i2 >= 100) {
                int size2 = A1v.size();
                i = R.plurals.f9nameremoved;
                j = (long) size2;
                objArr = new Object[1];
                AnonymousClass000.A1P(objArr, size2, 0);
            } else {
                String A0n = AnonymousClass001.A0n(A1v, i2);
                if (A0n != null && (A01 = C106705a1.A01(A0n)) != null) {
                    C106705a1 r4 = new C106705a1();
                    Iterator it = A01.A02.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            continue;
                            break;
                        }
                        AnonymousClass5T6 r8 = (AnonymousClass5T6) it.next();
                        String str = r8.A01;
                        if (!TextUtils.isEmpty(r8.A02)) {
                            if (str.equals("N")) {
                                C106705a1.A02(r8.A03, r4.A0A);
                            }
                            C103875Ot r1 = r4.A0A;
                            if (!TextUtils.isEmpty(r1.A02)) {
                                String str2 = r1.A02;
                                if (str2 != null) {
                                    i = R.plurals.f9nameremoved;
                                    j = (long) size;
                                    objArr = C18310x6.A1b(str2, 0);
                                    AnonymousClass000.A1P(objArr, size, 1);
                                    break;
                                }
                            }
                        }
                    }
                }
                i2++;
            }
        }
        return r10.A0L(objArr, i, j);
    }
}
