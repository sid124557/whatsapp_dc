package X;

import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Ny  reason: invalid class name and case insensitive filesystem */
public class C67093Ny implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final C55682qk A00;
    public final C59542x5 A01;

    public void AyD(C55032pg r8, C624134x r9) {
        AnonymousClass22k r0;
        if (r9 instanceof C30821nD) {
            C30821nD r92 = (C30821nD) r9;
            AnonymousClass1A4 r2 = r8.A00;
            C22001Dz r02 = ((AnonymousClass1EU) r2.A00).orderMessage_;
            if (r02 == null) {
                r02 = C22001Dz.DEFAULT_INSTANCE;
            }
            C130546c9 A0H = r02.A0H();
            String str = r92.A07;
            if (str != null) {
                C22001Dz r1 = (C22001Dz) C18320x8.A0C(A0H);
                r1.bitField0_ |= 1;
                r1.orderId_ = str;
            }
            String str2 = r92.A08;
            if (str2 != null) {
                C22001Dz r12 = (C22001Dz) C18320x8.A0C(A0H);
                r12.bitField0_ |= 64;
                r12.orderTitle_ = str2;
            }
            int i = r92.A00;
            C22001Dz r13 = (C22001Dz) C18320x8.A0C(A0H);
            r13.bitField0_ |= 4;
            r13.itemCount_ = i;
            String str3 = r92.A06;
            if (str3 != null) {
                C22001Dz r14 = (C22001Dz) C18320x8.A0C(A0H);
                r14.bitField0_ |= 32;
                r14.message_ = str3;
            }
            int i2 = r92.A01;
            C22001Dz r15 = (C22001Dz) C18320x8.A0C(A0H);
            r15.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
            r15.messageVersion_ = i2;
            int i3 = r92.A02;
            if (i3 != 1) {
                if (i3 == 2) {
                    r0 = AnonymousClass22k.ACCEPTED;
                } else if (i3 != 3) {
                    this.A00.A0A("FMessageOrder/setOrderStatus: Unexpected status", true, AnonymousClass000.A0Y("status=", AnonymousClass001.A0o(), i3));
                } else {
                    r0 = AnonymousClass22k.DECLINED;
                }
                C22001Dz r16 = (C22001Dz) C18320x8.A0C(A0H);
                r16.status_ = r0.value;
                r16.bitField0_ |= 8;
            } else {
                r0 = AnonymousClass22k.INQUIRY;
                C22001Dz r162 = (C22001Dz) C18320x8.A0C(A0H);
                r162.status_ = r0.value;
                r162.bitField0_ |= 8;
            }
            int i4 = r92.A03;
            if (i4 != 1) {
                this.A00.A0A("FMessageOrder/setOrderSurface: Unexpected surface", true, AnonymousClass000.A0Y("surface=", AnonymousClass001.A0o(), i4));
            } else {
                AnonymousClass22R r03 = AnonymousClass22R.A01;
                C22001Dz r17 = (C22001Dz) C18320x8.A0C(A0H);
                r17.surface_ = r03.value;
                r17.bitField0_ |= 16;
            }
            UserJid userJid = r92.A04;
            if (userJid != null) {
                String A0g = C18300x5.A0g(A0H, userJid);
                C22001Dz r18 = (C22001Dz) A0H.A00;
                A0g.getClass();
                r18.bitField0_ |= 128;
                r18.sellerJid_ = A0g;
            }
            String str4 = r92.A09;
            if (str4 != null) {
                C22001Dz r19 = (C22001Dz) C18320x8.A0C(A0H);
                r19.bitField0_ |= 256;
                r19.token_ = str4;
            }
            if (!TextUtils.isEmpty(r92.A05) && r92.A0A != null) {
                String str5 = r92.A05;
                C22001Dz r110 = (C22001Dz) C18320x8.A0C(A0H);
                str5.getClass();
                r110.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                r110.totalCurrencyCode_ = str5;
                long longValue = r92.A0A.multiply(C57952uT.A00).longValue();
                C22001Dz r5 = (C22001Dz) C18320x8.A0C(A0H);
                r5.bitField0_ |= 512;
                r5.totalAmount1000_ = longValue;
            }
            C614630w A0y = r92.A0y();
            if (!(A0y == null || A0y.A09() == null)) {
                C172548Lq A09 = C18270x1.A09(A0H, A0y.A09());
                C22001Dz r111 = (C22001Dz) A0H.A00;
                r111.bitField0_ |= 2;
                r111.thumbnail_ = A09;
            }
            AnonymousClass3Z2 r4 = r8.A01;
            byte[] bArr = r8.A09;
            if (C59542x5.A01(r4, r92, bArr)) {
                AnonymousClass1EF A002 = C55032pg.A00(this.A01, r8, r4, r92, bArr);
                C22001Dz r112 = (C22001Dz) C18320x8.A0C(A0H);
                A002.getClass();
                r112.contextInfo_ = A002;
                r112.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
            }
            AnonymousClass1EU A0T = C18290x4.A0T(r2);
            C22001Dz r04 = (C22001Dz) A0H.A06();
            r04.getClass();
            A0T.orderMessage_ = r04;
            A0T.bitField0_ |= 536870912;
            return;
        }
        throw AnonymousClass001.A0c("FMessageOrderProtobuf/not supported message");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0097 A[SYNTHETIC, Splitter:B:28:0x0097] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C624134x BgW(X.C55962rC r6) {
        /*
            r5 = this;
            X.1EU r2 = r6.A0B
            int r1 = r2.bitField0_
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00ab
            X.1Dz r4 = r2.orderMessage_
            if (r4 != 0) goto L_0x000f
            X.1Dz r4 = X.C22001Dz.DEFAULT_INSTANCE
        L_0x000f:
            X.C626936e.A06(r4)
            X.2z0 r2 = r6.A0D
            long r0 = r6.A05
            X.1nD r3 = new X.1nD
            r3.<init>(r2, r0)
            X.33C r0 = new X.33C
            r0.<init>()
            r3.A01 = r0
            java.lang.String r0 = r4.orderId_
            r3.A07 = r0
            java.lang.String r0 = r4.orderTitle_
            r3.A08 = r0
            int r0 = r4.itemCount_
            r3.A00 = r0
            java.lang.String r0 = r4.message_
            r3.A06 = r0
            int r1 = r4.status_
            r0 = 1
            if (r1 == r0) goto L_0x0051
            r0 = 2
            if (r1 == r0) goto L_0x004e
            r0 = 3
            if (r1 != r0) goto L_0x0051
            X.22k r0 = X.AnonymousClass22k.DECLINED
        L_0x003f:
            int r0 = r0.value
            r3.A02 = r0
            X.22R r0 = X.AnonymousClass22R.A01
            int r0 = r0.value
            r3.A03 = r0
            int r0 = r4.messageVersion_
            r3.A01 = r0
            goto L_0x0054
        L_0x004e:
            X.22k r0 = X.AnonymousClass22k.ACCEPTED
            goto L_0x003f
        L_0x0051:
            X.22k r0 = X.AnonymousClass22k.INQUIRY
            goto L_0x003f
        L_0x0054:
            java.lang.String r0 = r4.sellerJid_     // Catch:{ 24P -> 0x005d }
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A09(r0)     // Catch:{ 24P -> 0x005d }
            r3.A04 = r0     // Catch:{ 24P -> 0x005d }
            goto L_0x0070
        L_0x005d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageOrder/FMessageOrder invalid seller jid <"
            r1.append(r0)
            java.lang.String r0 = r4.sellerJid_
            r1.append(r0)
            java.lang.String r0 = ">"
            X.C18260x0.A1M(r1, r0)
        L_0x0070:
            java.lang.String r0 = r4.token_
            r3.A09 = r0
            X.8Lq r0 = r4.thumbnail_
            if (r0 == 0) goto L_0x008d
            byte[] r2 = r0.A07()
            boolean r1 = r6.A0O
            int r0 = r2.length
            if (r0 <= 0) goto L_0x008d
            r0 = 1
            r3.A02 = r0
            X.30w r0 = r3.A0y()
            if (r0 == 0) goto L_0x008d
            r0.A04(r2, r1)
        L_0x008d:
            java.lang.String r0 = r4.totalCurrencyCode_
            r3.A05 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ac
            java.lang.String r0 = r3.A05     // Catch:{ IllegalArgumentException -> 0x00a7 }
            X.7ny r2 = new X.7ny     // Catch:{ IllegalArgumentException -> 0x00a7 }
            r2.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x00a7 }
            long r0 = r4.totalAmount1000_     // Catch:{ IllegalArgumentException -> 0x00a7 }
            java.math.BigDecimal r0 = X.C57952uT.A00(r2, r0)     // Catch:{ IllegalArgumentException -> 0x00a7 }
            r3.A0A = r0     // Catch:{ IllegalArgumentException -> 0x00a7 }
            return r3
        L_0x00a7:
            r0 = 0
            r3.A05 = r0
            return r3
        L_0x00ab:
            r3 = 0
        L_0x00ac:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67093Ny.BgW(X.2rC):X.34x");
    }

    public C67093Ny(C55682qk r1, C59542x5 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
