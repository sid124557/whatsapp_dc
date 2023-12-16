package X;

import com.whatsapp.util.Log;
import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: X.30U  reason: invalid class name */
public class AnonymousClass30U {
    public static final byte[] A08 = {69, 68, 0, 1};
    public final C56612sH A00;
    public final C57162tC A01;
    public final AnonymousClass1EN A02;
    public final C44662Wz A03;
    public final InetSocketAddress A04;
    public final C43362Rv A05;
    public final C59202wW A06;
    public final C36741zo A07;

    public final byte[] A05() {
        return new byte[]{87, 65, (byte) 6, 3};
    }

    public final AnonymousClass1CT A00() {
        C59202wW r2 = this.A06;
        byte[] bArr = new byte[3];
        r2.A00(bArr);
        if (!Arrays.equals(C59202wW.A01, bArr)) {
            byte[] bArr2 = new byte[AnonymousClass36A.A00(bArr)];
            r2.A00(bArr2);
            AnonymousClass1CU r1 = (AnonymousClass1CU) C130786cX.A05(AnonymousClass1CU.DEFAULT_INSTANCE, bArr2);
            if ((r1.bitField0_ & 2) != 0) {
                AnonymousClass1CT r0 = r1.serverHello_;
                if (r0 == null) {
                    return AnonymousClass1CT.DEFAULT_INSTANCE;
                }
                return r0;
            }
            throw AnonymousClass002.A0C("Handshake message does not contain server hello!");
        }
        throw new C36761zq();
    }

    public C41992Mj A01() {
        C43362Rv r2 = this.A05;
        Objects.requireNonNull(r2);
        return new C41992Mj(r2, this.A06);
    }

    public AnonymousClass2ZC A02() {
        C43362Rv r2 = this.A05;
        Objects.requireNonNull(r2);
        return new AnonymousClass2ZC(this.A07, r2);
    }

    public final C43362Rv A03(AnonymousClass1CT r11, C72423dh r12, C72423dh r13, C60832zF r14) {
        AnonymousClass1D4 r5;
        AnonymousClass1D4 r1;
        String str;
        try {
            byte[] A072 = r11.ephemeral_.A07();
            r14.A03.A00(A072);
            C72413dg r2 = new C72413dg(A072);
            C72403df r15 = r12.A01;
            C158317jm A002 = C158317jm.A00();
            byte[] bArr = r2.A01;
            byte[] bArr2 = r15.A01;
            r14.A00(A002.A02(bArr, bArr2));
            C72413dg r3 = new C72413dg(r14.A01(r11.static_.A07()));
            C158317jm A003 = C158317jm.A00();
            byte[] bArr3 = r3.A01;
            r14.A00(A003.A02(bArr3, bArr2));
            try {
                AnonymousClass1B3 r0 = (AnonymousClass1B3) C130786cX.A05(AnonymousClass1B3.DEFAULT_INSTANCE, r14.A01(r11.payload_.A07()));
                if (r0 != null) {
                    AnonymousClass1B2 r8 = r0.intermediate_;
                    if (r8 == null) {
                        r8 = AnonymousClass1B2.DEFAULT_INSTANCE;
                    }
                    AnonymousClass1B2 r9 = r0.leaf_;
                    if (!((r9 == null && (r9 = AnonymousClass1B2.DEFAULT_INSTANCE) == null) || r8 == null)) {
                        try {
                            r5 = (AnonymousClass1D4) C130786cX.A05(AnonymousClass1D4.DEFAULT_INSTANCE, r9.details_.A07());
                        } catch (AnonymousClass6u5 e) {
                            Log.e("wa6 certificate details parsing failed", e);
                            r5 = null;
                        }
                        try {
                            r1 = (AnonymousClass1D4) C130786cX.A05(AnonymousClass1D4.DEFAULT_INSTANCE, r8.details_.A07());
                        } catch (AnonymousClass6u5 e2) {
                            Log.e("wa6 certificate details parsing failed", e2);
                            r1 = null;
                        }
                        if (!(r5 == null || r1 == null)) {
                            int i = r1.bitField0_;
                            if (!((i & 1) == 0 || (r5.bitField0_ & 2) == 0 || r1.serial_ != r5.issuerSerial_ || (i & 2) == 0 || r1.issuerSerial_ != 0)) {
                                if (!Arrays.equals(r5.key_.A07(), bArr3)) {
                                    StringBuilder A0o = AnonymousClass001.A0o();
                                    A0o.append("wa6: noise certificate key does not match proposed server static key; issuer=");
                                    str = AnonymousClass000.A0h(A0o, r5.issuerSerial_);
                                } else {
                                    byte[] A073 = r1.key_.A07();
                                    C72413dg r7 = (C72413dg) C39442Bz.A00.get("WhatsAppLongTerm1");
                                    if (r7 == null) {
                                        str = "wa6: intermediate cert key is missing";
                                    } else {
                                        boolean A012 = C158317jm.A00().A01(new C72413dg(A073).A01, r5.A0F(), r9.signature_.A07());
                                        boolean A013 = C158317jm.A00().A01(r7.A01, r8.details_.A07(), r8.signature_.A07());
                                        if (!A012 || !A013) {
                                            str = "wa6: invalid signature on noise certificate";
                                        } else {
                                            byte[] A022 = r14.A02(r13.A02.A01);
                                            r14.A00(C158317jm.A00().A02(bArr, r13.A01.A01));
                                            byte[] A023 = r14.A02(this.A02.A0F());
                                            C130546c9 A0G = C21321Bj.DEFAULT_INSTANCE.A0G();
                                            C172548Lq A0J = C18300x5.A0J(A0G, A022, A022.length);
                                            C21321Bj r16 = (C21321Bj) A0G.A00;
                                            r16.bitField0_ |= 1;
                                            r16.static_ = A0J;
                                            C172548Lq A0H = C18280x3.A0H(A0G, A023);
                                            C21321Bj r17 = (C21321Bj) A0G.A00;
                                            r17.bitField0_ |= 2;
                                            r17.payload_ = A0H;
                                            C21321Bj r52 = (C21321Bj) A0G.A06();
                                            C130546c9 A0K = C18300x5.A0K(AnonymousClass1CU.DEFAULT_INSTANCE);
                                            AnonymousClass1CU r18 = (AnonymousClass1CU) A0K.A00;
                                            r52.getClass();
                                            r18.clientFinish_ = r52;
                                            r18.bitField0_ |= 4;
                                            this.A07.write(A0K.A06().A0F());
                                            byte[][] A032 = AnonymousClass31Q.A03(new byte[0], r14.A02);
                                            return new C43362Rv(r3, A032[0], A032[1]);
                                        }
                                    }
                                }
                                Log.e(str);
                            }
                        }
                    }
                }
            } catch (AnonymousClass6u5 e3) {
                Log.e("wa6 noise certificate parsing failed", e3);
            }
            throw new AnonymousClass24C(this);
        } catch (AnonymousClass24D e4) {
            throw new C36791zt(e4);
        }
    }

    public C72413dg A04() {
        return this.A05.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x01dc, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x01e2, code lost:
        throw new X.C36791zt(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x01e3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x01e4, code lost:
        r3 = r0.serverHello;
        r2 = new X.C60832zF(X.C60832zF.A04, A05());
        r2.A03.A00(r4.A02.A01);
        r2 = A03(r3, r4, r5, r2);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:9:0x007d, B:11:0x00d9] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass30U(X.C56612sH r15, X.C57162tC r16, X.AnonymousClass1EN r17, X.C44662Wz r18, java.io.InputStream r19, java.io.OutputStream r20, java.net.InetSocketAddress r21, X.C72423dh r22, X.C72413dg r23) {
        /*
            r14 = this;
            r14.<init>()
            r14.A00 = r15
            r0 = r16
            r14.A01 = r0
            r0 = r18
            r14.A03 = r0
            X.3dh r4 = X.C72423dh.A00()
            X.2Wz r0 = r14.A03
            X.33p r0 = r0.A00
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "routing_info"
            java.lang.String r2 = X.C18280x3.A0Z(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r3 = r20
            if (r0 != 0) goto L_0x0055
            r1 = 3
            byte[] r6 = android.util.Base64.decode(r2, r1)
            if (r6 == 0) goto L_0x0055
            int r5 = r6.length
            if (r5 <= 0) goto L_0x0055
            java.lang.String r0 = "noisesocket/maybe-send-edge-header sending edge header"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            byte[] r0 = A08
            r3.write(r0)
            byte[] r2 = new byte[r1]
            r1 = 2
            byte r0 = (byte) r5
            r2[r1] = r0
            int r0 = r5 >> 8
            byte r1 = (byte) r0
            r0 = 1
            r2[r0] = r1
            int r0 = r5 >> 16
            byte r1 = (byte) r0
            r0 = 0
            r2[r0] = r1
            r3.write(r2)
            r3.write(r6)
        L_0x0055:
            byte[] r0 = r14.A05()
            r3.write(r0)
            r0 = r17
            X.C626936e.A06(r0)
            r14.A02 = r0
            X.2wW r0 = new X.2wW
            r1 = r19
            r0.<init>(r1)
            r14.A06 = r0
            X.1zo r0 = new X.1zo
            r0.<init>(r3)
            r14.A07 = r0
            r0 = r21
            r14.A04 = r0
            r5 = r22
            r3 = r23
            if (r23 != 0) goto L_0x00d9
            byte[] r1 = X.C60832zF.A05     // Catch:{ 24B -> 0x01e3 }
            byte[] r0 = r14.A05()     // Catch:{ 24B -> 0x01e3 }
            X.2zF r6 = new X.2zF     // Catch:{ 24B -> 0x01e3 }
            r6.<init>(r1, r0)     // Catch:{ 24B -> 0x01e3 }
            X.3dg r0 = r4.A02     // Catch:{ 24B -> 0x01e3 }
            byte[] r1 = r0.A01     // Catch:{ 24B -> 0x01e3 }
            X.2XI r0 = r6.A03     // Catch:{ 24B -> 0x01e3 }
            r0.A00(r1)     // Catch:{ 24B -> 0x01e3 }
            X.1CS r0 = X.AnonymousClass1CS.DEFAULT_INSTANCE     // Catch:{ 24B -> 0x01e3 }
            X.6c9 r3 = r0.A0G()     // Catch:{ 24B -> 0x01e3 }
            X.8Lq r2 = X.C18270x1.A09(r3, r1)     // Catch:{ 24B -> 0x01e3 }
            X.6cX r1 = r3.A00     // Catch:{ 24B -> 0x01e3 }
            X.1CS r1 = (X.AnonymousClass1CS) r1     // Catch:{ 24B -> 0x01e3 }
            int r0 = r1.bitField0_     // Catch:{ 24B -> 0x01e3 }
            r0 = r0 | 1
            r1.bitField0_ = r0     // Catch:{ 24B -> 0x01e3 }
            r1.ephemeral_ = r2     // Catch:{ 24B -> 0x01e3 }
            X.6cX r3 = r3.A06()     // Catch:{ 24B -> 0x01e3 }
            X.1CS r3 = (X.AnonymousClass1CS) r3     // Catch:{ 24B -> 0x01e3 }
            X.1CU r0 = X.AnonymousClass1CU.DEFAULT_INSTANCE     // Catch:{ 24B -> 0x01e3 }
            X.6c9 r2 = X.C18300x5.A0K(r0)     // Catch:{ 24B -> 0x01e3 }
            X.6cX r1 = r2.A00     // Catch:{ 24B -> 0x01e3 }
            X.1CU r1 = (X.AnonymousClass1CU) r1     // Catch:{ 24B -> 0x01e3 }
            r3.getClass()     // Catch:{ 24B -> 0x01e3 }
            r1.clientHello_ = r3     // Catch:{ 24B -> 0x01e3 }
            int r0 = r1.bitField0_     // Catch:{ 24B -> 0x01e3 }
            r0 = r0 | 1
            r1.bitField0_ = r0     // Catch:{ 24B -> 0x01e3 }
            X.6cX r0 = r2.A06()     // Catch:{ 24B -> 0x01e3 }
            X.1zo r1 = r14.A07     // Catch:{ 24B -> 0x01e3 }
            byte[] r0 = r0.A0F()     // Catch:{ 24B -> 0x01e3 }
            r1.write(r0)     // Catch:{ 24B -> 0x01e3 }
            X.1CT r0 = r14.A00()     // Catch:{ 24B -> 0x01e3 }
            X.2Rv r2 = r14.A03(r0, r4, r5, r6)     // Catch:{ 24B -> 0x01e3 }
            goto L_0x01fe
        L_0x00d9:
            byte[] r1 = X.C60832zF.A06     // Catch:{ 24D -> 0x01dc }
            byte[] r0 = r14.A05()     // Catch:{ 24D -> 0x01dc }
            X.2zF r2 = new X.2zF     // Catch:{ 24D -> 0x01dc }
            r2.<init>(r1, r0)     // Catch:{ 24D -> 0x01dc }
            byte[] r0 = r3.A01     // Catch:{ 24D -> 0x01dc }
            byte[] r0 = r2.A01(r0)     // Catch:{ 24D -> 0x01dc }
            X.3dg r3 = new X.3dg     // Catch:{ 24D -> 0x01dc }
            r3.<init>(r0)     // Catch:{ 24D -> 0x01dc }
            X.3dg r0 = r4.A02     // Catch:{ 24D -> 0x01dc }
            byte[] r1 = r0.A01     // Catch:{ 24D -> 0x01dc }
            X.2XI r10 = r2.A03     // Catch:{ 24D -> 0x01dc }
            r10.A00(r1)     // Catch:{ 24D -> 0x01dc }
            X.3df r6 = r4.A01     // Catch:{ 24D -> 0x01dc }
            X.7jm r0 = X.C158317jm.A00()     // Catch:{ 24D -> 0x01dc }
            byte[] r7 = r3.A01     // Catch:{ 24D -> 0x01dc }
            byte[] r9 = r6.A01     // Catch:{ 24D -> 0x01dc }
            byte[] r0 = r0.A02(r7, r9)     // Catch:{ 24D -> 0x01dc }
            r2.A00(r0)     // Catch:{ 24D -> 0x01dc }
            X.3dg r0 = r5.A02     // Catch:{ 24D -> 0x01dc }
            byte[] r0 = r0.A01     // Catch:{ 24D -> 0x01dc }
            byte[] r13 = r2.A02(r0)     // Catch:{ 24D -> 0x01dc }
            X.3df r6 = r5.A01     // Catch:{ 24D -> 0x01dc }
            X.7jm r0 = X.C158317jm.A00()     // Catch:{ 24D -> 0x01dc }
            byte[] r8 = r6.A01     // Catch:{ 24D -> 0x01dc }
            byte[] r0 = r0.A02(r7, r8)     // Catch:{ 24D -> 0x01dc }
            r2.A00(r0)     // Catch:{ 24D -> 0x01dc }
            X.1EN r0 = r14.A02     // Catch:{ 24D -> 0x01dc }
            byte[] r0 = r0.A0F()     // Catch:{ 24D -> 0x01dc }
            byte[] r12 = r2.A02(r0)     // Catch:{ 24D -> 0x01dc }
            X.1CS r0 = X.AnonymousClass1CS.DEFAULT_INSTANCE     // Catch:{ 24D -> 0x01dc }
            X.6c9 r11 = r0.A0G()     // Catch:{ 24D -> 0x01dc }
            int r0 = r1.length     // Catch:{ 24D -> 0x01dc }
            r6 = 0
            X.8Lq r7 = X.C18300x5.A0J(r11, r1, r0)     // Catch:{ 24D -> 0x01dc }
            X.6cX r1 = r11.A00     // Catch:{ 24D -> 0x01dc }
            X.1CS r1 = (X.AnonymousClass1CS) r1     // Catch:{ 24D -> 0x01dc }
            int r0 = r1.bitField0_     // Catch:{ 24D -> 0x01dc }
            r0 = r0 | 1
            r1.bitField0_ = r0     // Catch:{ 24D -> 0x01dc }
            r1.ephemeral_ = r7     // Catch:{ 24D -> 0x01dc }
            X.8Lq r7 = X.C18280x3.A0H(r11, r13)     // Catch:{ 24D -> 0x01dc }
            X.6cX r1 = r11.A00     // Catch:{ 24D -> 0x01dc }
            X.1CS r1 = (X.AnonymousClass1CS) r1     // Catch:{ 24D -> 0x01dc }
            int r0 = r1.bitField0_     // Catch:{ 24D -> 0x01dc }
            r0 = r0 | 2
            r1.bitField0_ = r0     // Catch:{ 24D -> 0x01dc }
            r1.static_ = r7     // Catch:{ 24D -> 0x01dc }
            X.8Lq r7 = X.C18280x3.A0H(r11, r12)     // Catch:{ 24D -> 0x01dc }
            X.6cX r1 = r11.A00     // Catch:{ 24D -> 0x01dc }
            X.1CS r1 = (X.AnonymousClass1CS) r1     // Catch:{ 24D -> 0x01dc }
            int r0 = r1.bitField0_     // Catch:{ 24D -> 0x01dc }
            r0 = r0 | 4
            r1.bitField0_ = r0     // Catch:{ 24D -> 0x01dc }
            r1.payload_ = r7     // Catch:{ 24D -> 0x01dc }
            X.6cX r11 = r11.A06()     // Catch:{ 24D -> 0x01dc }
            X.1CS r11 = (X.AnonymousClass1CS) r11     // Catch:{ 24D -> 0x01dc }
            X.1CU r0 = X.AnonymousClass1CU.DEFAULT_INSTANCE     // Catch:{ 24D -> 0x01dc }
            X.6c9 r7 = X.C18300x5.A0K(r0)     // Catch:{ 24D -> 0x01dc }
            X.6cX r1 = r7.A00     // Catch:{ 24D -> 0x01dc }
            X.1CU r1 = (X.AnonymousClass1CU) r1     // Catch:{ 24D -> 0x01dc }
            r11.getClass()     // Catch:{ 24D -> 0x01dc }
            r1.clientHello_ = r11     // Catch:{ 24D -> 0x01dc }
            int r0 = r1.bitField0_     // Catch:{ 24D -> 0x01dc }
            r0 = r0 | 1
            r1.bitField0_ = r0     // Catch:{ 24D -> 0x01dc }
            X.6cX r0 = r7.A06()     // Catch:{ 24D -> 0x01dc }
            X.1zo r1 = r14.A07     // Catch:{ 24D -> 0x01dc }
            byte[] r0 = r0.A0F()     // Catch:{ 24D -> 0x01dc }
            r1.write(r0)     // Catch:{ 24D -> 0x01dc }
            X.1CT r7 = r14.A00()     // Catch:{ 24D -> 0x01dc }
            int r0 = r7.bitField0_     // Catch:{ 24D -> 0x01dc }
            r0 = r0 & 2
            if (r0 == 0) goto L_0x019a
            X.24B r0 = new X.24B     // Catch:{ 24D -> 0x01dc }
            r0.<init>(r7)     // Catch:{ 24D -> 0x01dc }
            throw r0     // Catch:{ 24D -> 0x01dc }
        L_0x019a:
            X.8Lq r0 = r7.ephemeral_     // Catch:{ 24D -> 0x01dc }
            byte[] r0 = r0.A07()     // Catch:{ 24D -> 0x01dc }
            r10.A00(r0)     // Catch:{ 24D -> 0x01dc }
            X.3dg r1 = new X.3dg     // Catch:{ 24D -> 0x01dc }
            r1.<init>(r0)     // Catch:{ 24D -> 0x01dc }
            X.7jm r0 = X.C158317jm.A00()     // Catch:{ 24D -> 0x01dc }
            byte[] r1 = r1.A01     // Catch:{ 24D -> 0x01dc }
            byte[] r0 = r0.A02(r1, r9)     // Catch:{ 24D -> 0x01dc }
            r2.A00(r0)     // Catch:{ 24D -> 0x01dc }
            X.7jm r0 = X.C158317jm.A00()     // Catch:{ 24D -> 0x01dc }
            byte[] r0 = r0.A02(r1, r8)     // Catch:{ 24D -> 0x01dc }
            r2.A00(r0)     // Catch:{ 24D -> 0x01dc }
            X.8Lq r0 = r7.payload_     // Catch:{ 24D -> 0x01dc }
            byte[] r0 = r0.A07()     // Catch:{ 24D -> 0x01dc }
            r2.A01(r0)     // Catch:{ 24D -> 0x01dc }
            byte[] r1 = new byte[r6]     // Catch:{ 24D -> 0x01dc }
            byte[] r0 = r2.A02     // Catch:{ 24D -> 0x01dc }
            byte[][] r2 = X.AnonymousClass31Q.A03(r1, r0)     // Catch:{ 24D -> 0x01dc }
            r0 = 1
            r1 = r2[r6]     // Catch:{ 24D -> 0x01dc }
            r0 = r2[r0]     // Catch:{ 24D -> 0x01dc }
            X.2Rv r2 = new X.2Rv     // Catch:{ 24D -> 0x01dc }
            r2.<init>(r3, r1, r0)     // Catch:{ 24D -> 0x01dc }
            goto L_0x01fe
        L_0x01dc:
            r1 = move-exception
            X.1zt r0 = new X.1zt     // Catch:{ 24B -> 0x01e3 }
            r0.<init>(r1)     // Catch:{ 24B -> 0x01e3 }
            throw r0     // Catch:{ 24B -> 0x01e3 }
        L_0x01e3:
            r0 = move-exception
            X.1CT r3 = r0.serverHello
            byte[] r1 = X.C60832zF.A04
            byte[] r0 = r14.A05()
            X.2zF r2 = new X.2zF
            r2.<init>(r1, r0)
            X.3dg r0 = r4.A02
            byte[] r1 = r0.A01
            X.2XI r0 = r2.A03
            r0.A00(r1)
            X.2Rv r2 = r14.A03(r3, r4, r5, r2)
        L_0x01fe:
            r14.A05 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30U.<init>(X.2sH, X.2tC, X.1EN, X.2Wz, java.io.InputStream, java.io.OutputStream, java.net.InetSocketAddress, X.3dh, X.3dg):void");
    }
}
