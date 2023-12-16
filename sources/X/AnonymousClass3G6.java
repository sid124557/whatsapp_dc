package X;

import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.3G6  reason: invalid class name */
public final class AnonymousClass3G6 implements C836749i {
    public boolean A00;
    public final C55682qk A01;
    public final C69263Wi A02;
    public final C56972sr A03;
    public final AnonymousClass36E A04;
    public final C49712gy A05;
    public final C104205Qb A06;
    public final C52192l2 A07;
    public final C64773Ex A08;
    public final C56422rx A09;
    public final C56612sH A0A;
    public final C54292oU A0B;
    public final C57162tC A0C;
    public final C54562ov A0D;
    public final C621133n A0E;
    public final C56982ss A0F;
    public final C66543Lv A0G;
    public final C53622nO A0H;
    public final AnonymousClass36F A0I;
    public final AnonymousClass311 A0J;
    public final AnonymousClass33Z A0K;
    public final AnonymousClass36Y A0L;
    public final AnonymousClass2GF A0M;
    public final AnonymousClass1VX A0N;
    public final C25811b7 A0O;
    public final C66383Le A0P;
    public final AnonymousClass33A A0Q;
    public final C53202mi A0R;
    public final C95814uZ A0S;
    public final Jid A0T;
    public final C383727h A0U;
    public final C47532dP A0V;
    public final C54202oL A0W;
    public final C54892pS A0X;
    public final AnonymousClass33Y A0Y;
    public final AnonymousClass33S A0Z;
    public final AnonymousClass1gS A0a;
    public final C29251iW A0b;
    public final C620933l A0c;
    public final C29271iY A0d;
    public final C195989a7 A0e;
    public final C1907099n A0f;
    public final AnonymousClass28T A0g;
    public final AnonymousClass4FY A0h;
    public final C50342i1 A0i;
    public final C50222hp A0j;
    public final C45042Yl A0k;
    public final C55832qz A0l;
    public final AnonymousClass4FS A0m;
    public final C53322mu A0n;
    public final C183538qC A0o;
    public final Integer A0p;
    public final boolean A0q;

    public static void A00(C104205Qb r4, C54292oU r5, UserJid userJid, C30791n7 r7) {
        AnonymousClass39E r0;
        AnonymousClass39W r2 = r7.A00;
        if (r2 != null) {
            int i = r2.A00;
            if ((i == 2 || i == 6) && (r0 = r2.A04) != null) {
                ArrayList A0s = AnonymousClass001.A0s();
                for (AnonymousClass396 r02 : r0.A02) {
                    for (AnonymousClass392 r03 : r02.A01) {
                        A0s.add(r03.A00);
                    }
                }
                String valueOf = String.valueOf((int) C54292oU.A00(r5).getDimension(R.dimen.f6nameremoved));
                r4.A01(new C60852zH(userJid, valueOf, valueOf, A0s));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x008a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(X.AnonymousClass1EU r7) {
        /*
            r6 = this;
            X.4FY r4 = r6.A0h
            X.2z0 r0 = r4.B9a()
            X.4uZ r2 = r0.A00
            boolean r0 = r2 instanceof com.whatsapp.jid.UserJid
            r5 = 1
            r1 = 0
            if (r0 == 0) goto L_0x008c
            X.2sr r4 = r6.A03
            com.whatsapp.jid.Jid r0 = r6.A0T
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r0)
            r3 = 0
            if (r1 == 0) goto L_0x008a
            boolean r0 = X.C56972sr.A09(r4, r1)
            if (r0 == 0) goto L_0x008a
            int r2 = r1.getDevice()
            X.2Xu r0 = r4.A09
            X.2og r0 = r0.A01
            android.content.SharedPreferences r1 = r0.A01
            java.lang.String r0 = "registration_device_id"
            int r0 = r1.getInt(r0, r3)
            if (r2 == r0) goto L_0x008a
            int r0 = r7.bitField0_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 == 0) goto L_0x008b
            X.1EM r0 = r7.protocolMessage_
            r1 = r0
            if (r0 != 0) goto L_0x0043
            X.1EM r0 = X.AnonymousClass1EM.DEFAULT_INSTANCE
        L_0x0043:
            int r0 = r0.bitField0_
            r0 = r0 & 32
            if (r0 != 0) goto L_0x008a
            r0 = r1
            if (r1 != 0) goto L_0x004e
            X.1EM r0 = X.AnonymousClass1EM.DEFAULT_INSTANCE
        L_0x004e:
            int r0 = r0.bitField0_
            r0 = r0 & 64
            if (r0 != 0) goto L_0x008a
            r0 = r1
            if (r1 != 0) goto L_0x0059
            X.1EM r0 = X.AnonymousClass1EM.DEFAULT_INSTANCE
        L_0x0059:
            int r0 = r0.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x008a
            r0 = r1
            if (r1 != 0) goto L_0x0064
            X.1EM r0 = X.AnonymousClass1EM.DEFAULT_INSTANCE
        L_0x0064:
            int r0 = r0.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x008a
            r0 = r1
            if (r1 != 0) goto L_0x006f
            X.1EM r0 = X.AnonymousClass1EM.DEFAULT_INSTANCE
        L_0x006f:
            int r0 = r0.bitField0_
            r0 = r0 & 16
            if (r0 != 0) goto L_0x008a
            r0 = r1
            if (r1 != 0) goto L_0x007a
            X.1EM r0 = X.AnonymousClass1EM.DEFAULT_INSTANCE
        L_0x007a:
            int r0 = r0.bitField0_
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 != 0) goto L_0x008a
            if (r1 != 0) goto L_0x0084
            X.1EM r1 = X.AnonymousClass1EM.DEFAULT_INSTANCE
        L_0x0084:
            int r0 = r1.bitField0_
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x008b
        L_0x008a:
            r5 = 0
        L_0x008b:
            return r5
        L_0x008c:
            boolean r0 = r2 instanceof X.C28011fL
            if (r0 == 0) goto L_0x00c3
            com.whatsapp.jid.Jid r0 = r4.BAb()
            com.whatsapp.jid.DeviceJid r2 = com.whatsapp.jid.DeviceJid.of(r0)
            X.2sr r1 = r6.A03
            r3 = 0
            if (r2 == 0) goto L_0x008a
            boolean r0 = X.C56972sr.A09(r1, r2)
            if (r0 == 0) goto L_0x008a
            int r2 = r2.getDevice()
            X.2Xu r0 = r1.A09
            X.2og r0 = r0.A01
            android.content.SharedPreferences r1 = r0.A01
            java.lang.String r0 = "registration_device_id"
            int r0 = r1.getInt(r0, r3)
            if (r2 == r0) goto L_0x008a
            X.2a1 r0 = r4.BCn()
            if (r0 != 0) goto L_0x008a
            X.2a1 r0 = r4.B8J()
            if (r0 == 0) goto L_0x008a
            return r5
        L_0x00c3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3G6.A02(X.1EU):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: X.1mJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: X.34x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v148, resolved type: X.1mD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: X.1n7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v34, resolved type: X.1mJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v35, resolved type: X.1mJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v56, resolved type: X.1mJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v57, resolved type: X.1mJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v38, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02e8, code lost:
        if (r7.A0B(r3, r4) != false) goto L_0x0545;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0424, code lost:
        if (r14 == null) goto L_0x0426;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0456, code lost:
        if (r9 != false) goto L_0x0458;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c3, code lost:
        if (X.C106405Yw.A04(r3.destinationJid_).equals(r17.B9a().A00) != false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0802, code lost:
        if (r10.A03 != r2.A06) goto L_0x0804;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f3, code lost:
        if (((X.AnonymousClass1ER) r3.format_).interactiveMessageCase_ == 7) goto L_0x00f5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x072e A[Catch:{ all -> 0x1553, 24W -> 0x1471, 248 -> 0x1446, Exception -> 0x1611 }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0757 A[SYNTHETIC, Splitter:B:313:0x0757] */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x07b7 A[Catch:{ all -> 0x1553, 24W -> 0x1471, 248 -> 0x1446, Exception -> 0x1611 }] */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x0846 A[Catch:{ all -> 0x1553, 24W -> 0x1471, 248 -> 0x1446, Exception -> 0x1611 }] */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0852 A[Catch:{ all -> 0x1553, 24W -> 0x1471, 248 -> 0x1446, Exception -> 0x1611 }] */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0853 A[Catch:{ all -> 0x1553, 24W -> 0x1471, 248 -> 0x1446, Exception -> 0x1611 }] */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x0949 A[Catch:{ all -> 0x1553, 24W -> 0x1471, 248 -> 0x1446, Exception -> 0x1611 }] */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x0964 A[Catch:{ all -> 0x1553, 24W -> 0x1471, 248 -> 0x1446, Exception -> 0x1611 }] */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0969 A[Catch:{ all -> 0x1553, 24W -> 0x1471, 248 -> 0x1446, Exception -> 0x1611 }] */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0973 A[SYNTHETIC, Splitter:B:415:0x0973] */
    /* JADX WARNING: Removed duplicated region for block: B:487:0x0bd3 A[Catch:{ all -> 0x1553, 24W -> 0x1471, 248 -> 0x1446, Exception -> 0x1611 }] */
    /* JADX WARNING: Removed duplicated region for block: B:915:0x1481 A[Catch:{ all -> 0x1553, 24W -> 0x1471, 248 -> 0x1446, Exception -> 0x1611 }] */
    /* JADX WARNING: Removed duplicated region for block: B:978:0x157d A[Catch:{ all -> 0x1553, 24W -> 0x1471, 248 -> 0x1446, Exception -> 0x1611 }] */
    /* JADX WARNING: Removed duplicated region for block: B:979:0x1588 A[Catch:{ all -> 0x1553, 24W -> 0x1471, 248 -> 0x1446, Exception -> 0x1611 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BF5(byte[] r34) {
        /*
            r33 = this;
            r24 = r34
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DecryptionCallbackV2/handlePlaintext message="
            r2.append(r0)
            r0 = r33
            X.4FY r1 = r0.A0h
            r17 = r1
            r2.append(r1)
            java.lang.String r1 = " sendReceipt="
            r2.append(r1)
            boolean r1 = r0.A0q
            r18 = r1
            X.C18260x0.A1V(r2, r1)
            java.lang.Integer r1 = r0.A0p
            int r2 = r1.intValue()
            r1 = 4
            if (r2 == r1) goto L_0x0033
            X.1b7 r3 = r0.A0O
            X.1gS r2 = r0.A0a
            r1 = r24
            byte[] r24 = X.C615231c.A02(r3, r2, r1)
        L_0x0033:
            if (r24 != 0) goto L_0x004a
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "DecryptionCallbackV2/handlePlaintext axolotl derived invalid plaintext; message.key="
            r2.append(r1)
            X.2z0 r1 = r17.B9a()
            X.C18270x1.A17(r1, r2)
            r3 = 0
        L_0x0046:
            r0.A01(r3)
            return
        L_0x004a:
            X.1EU r6 = X.AnonymousClass1EU.A00(r24)     // Catch:{ 6u5 -> 0x1630 }
            boolean r1 = r0.A02(r6)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0073
            int r2 = r6.bitField0_     // Catch:{ 6u5 -> 0x1630 }
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r2 = r2 & r1
            boolean r1 = X.AnonymousClass000.A1S(r2)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 != 0) goto L_0x0073
            X.36E r3 = r0.A04     // Catch:{ 6u5 -> 0x1630 }
            com.whatsapp.jid.Jid r1 = r0.A0T     // Catch:{ 6u5 -> 0x1630 }
            com.whatsapp.jid.DeviceJid r2 = com.whatsapp.jid.DeviceJid.of(r1)     // Catch:{ 6u5 -> 0x1630 }
            r1 = 2
            r3.A0F(r2, r1)     // Catch:{ 6u5 -> 0x1630 }
            java.lang.String r1 = "Peers must use DeviceSentMessage proto"
            X.6u5 r2 = new X.6u5     // Catch:{ 6u5 -> 0x1630 }
            r2.<init>((java.lang.String) r1)     // Catch:{ 6u5 -> 0x1630 }
        L_0x0072:
            throw r2     // Catch:{ 6u5 -> 0x1630 }
        L_0x0073:
            boolean r1 = r0.A02(r6)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 != 0) goto L_0x0098
            int r2 = r6.bitField0_     // Catch:{ 6u5 -> 0x1630 }
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r2 = r2 & r1
            boolean r1 = X.AnonymousClass000.A1S(r2)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0098
            X.36E r3 = r0.A04     // Catch:{ 6u5 -> 0x1630 }
            com.whatsapp.jid.Jid r1 = r0.A0T     // Catch:{ 6u5 -> 0x1630 }
            com.whatsapp.jid.DeviceJid r2 = com.whatsapp.jid.DeviceJid.of(r1)     // Catch:{ 6u5 -> 0x1630 }
            r1 = 1
            r3.A0F(r2, r1)     // Catch:{ 6u5 -> 0x1630 }
            java.lang.String r1 = "DeviceSentMessage proto only allowed from peer device"
            X.6u5 r2 = new X.6u5     // Catch:{ 6u5 -> 0x1630 }
            r2.<init>((java.lang.String) r1)     // Catch:{ 6u5 -> 0x1630 }
            goto L_0x0072
        L_0x0098:
            int r2 = r6.bitField0_     // Catch:{ 6u5 -> 0x1630 }
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r2 = r2 & r1
            boolean r1 = X.AnonymousClass000.A1S(r2)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x00c5
            X.1C1 r3 = r6.deviceSentMessage_     // Catch:{ 6u5 -> 0x1630 }
            if (r3 != 0) goto L_0x00a9
            X.1C1 r3 = X.AnonymousClass1C1.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x1630 }
        L_0x00a9:
            int r2 = r3.bitField0_     // Catch:{ 6u5 -> 0x1630 }
            r1 = r2 & 2
            if (r1 == 0) goto L_0x0473
            r1 = r2 & 1
            if (r1 == 0) goto L_0x0473
            java.lang.String r1 = r3.destinationJid_     // Catch:{ 6u5 -> 0x1630 }
            X.4uZ r2 = X.C106405Yw.A04(r1)     // Catch:{ 24P -> 0x0473 }
            X.2z0 r1 = r17.B9a()     // Catch:{ 6u5 -> 0x1630 }
            X.4uZ r1 = r1.A00     // Catch:{ 6u5 -> 0x1630 }
            boolean r1 = r2.equals(r1)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0473
        L_0x00c5:
            r1 = r17
            boolean r1 = r1 instanceof X.AnonymousClass3ST     // Catch:{ 6u5 -> 0x1630 }
            r20 = r1
            if (r1 == 0) goto L_0x0545
            r5 = r17
            X.3ST r5 = (X.AnonymousClass3ST) r5     // Catch:{ 6u5 -> 0x1630 }
            boolean r1 = r0.A03(r6, r5)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 != 0) goto L_0x046a
            X.1EU r4 = X.C615231c.A00(r6)     // Catch:{ 6u5 -> 0x1630 }
            boolean r1 = r4.A0M()     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0113
            X.1EI r3 = r4.templateMessage_     // Catch:{ 6u5 -> 0x1630 }
            if (r3 != 0) goto L_0x00e7
            X.1EI r3 = X.AnonymousClass1EI.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x1630 }
        L_0x00e7:
            int r2 = r3.formatCase_     // Catch:{ 6u5 -> 0x1630 }
            r1 = 5
            if (r2 != r1) goto L_0x0113
            java.lang.Object r1 = r3.format_     // Catch:{ 6u5 -> 0x1630 }
            X.1ER r1 = (X.AnonymousClass1ER) r1     // Catch:{ 6u5 -> 0x1630 }
            int r2 = r1.interactiveMessageCase_     // Catch:{ 6u5 -> 0x1630 }
            r1 = 7
            if (r2 != r1) goto L_0x0113
        L_0x00f5:
            X.8qC r1 = r0.A0o     // Catch:{ 6u5 -> 0x1630 }
            java.lang.Object r2 = r1.get()     // Catch:{ 6u5 -> 0x1630 }
            X.30C r2 = (X.AnonymousClass30C) r2     // Catch:{ 6u5 -> 0x1630 }
            X.2sP r1 = r2.A01(r4)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0545
            java.lang.String r8 = r1.A05()     // Catch:{ 6u5 -> 0x1630 }
            if (r8 == 0) goto L_0x0545
            X.2Vs r7 = r2.A02     // Catch:{ 6u5 -> 0x1630 }
            X.1ER r1 = r4.interactiveMessage_     // Catch:{ 6u5 -> 0x1630 }
            if (r1 != 0) goto L_0x01e0
            X.1ER r1 = X.AnonymousClass1ER.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x1630 }
            goto L_0x01e0
        L_0x0113:
            boolean r1 = r17.BH5()     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x012a
            r2 = 4194304(0x400000, float:5.877472E-39)
            int r1 = r5.A03     // Catch:{ 6u5 -> 0x1630 }
            r1 = r1 & r2
            boolean r1 = X.AnonymousClass000.A1U(r1, r2)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x012a
            int r1 = r4.bitField1_     // Catch:{ 6u5 -> 0x1630 }
            r1 = r1 & 8
            if (r1 == 0) goto L_0x00f5
        L_0x012a:
            X.8qC r7 = r0.A0o     // Catch:{ 6u5 -> 0x1630 }
            java.lang.Object r1 = r7.get()     // Catch:{ 6u5 -> 0x1630 }
            X.30C r1 = (X.AnonymousClass30C) r1     // Catch:{ 6u5 -> 0x1630 }
            java.lang.String r3 = r5.A0q     // Catch:{ 6u5 -> 0x1630 }
            X.2sP r1 = r1.A01(r4)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0157
            java.lang.String r2 = r1.A05()     // Catch:{ 6u5 -> 0x1630 }
        L_0x013e:
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x014a
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 != 0) goto L_0x00f5
        L_0x014a:
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 != 0) goto L_0x0159
            boolean r1 = r3.equals(r2)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0159
            goto L_0x00f5
        L_0x0157:
            r2 = 0
            goto L_0x013e
        L_0x0159:
            java.lang.Object r7 = r7.get()     // Catch:{ 6u5 -> 0x1630 }
            X.30C r7 = (X.AnonymousClass30C) r7     // Catch:{ 6u5 -> 0x1630 }
            java.lang.String r3 = r5.A0q     // Catch:{ 6u5 -> 0x1630 }
            X.2sP r1 = r7.A01(r4)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x01de
            java.lang.String r2 = r1.A05()     // Catch:{ 6u5 -> 0x1630 }
        L_0x016b:
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0177
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 != 0) goto L_0x00f5
        L_0x0177:
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 != 0) goto L_0x0193
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 != 0) goto L_0x0193
            java.util.Map r1 = r7.A00     // Catch:{ 6u5 -> 0x1630 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ 6u5 -> 0x1630 }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0193
            boolean r1 = r1.contains(r2)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 != 0) goto L_0x00f5
        L_0x0193:
            java.lang.String r1 = "mixed"
            boolean r1 = r1.equals(r3)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 != 0) goto L_0x01a5
            java.lang.String r1 = "quick_reply"
            boolean r1 = r1.equals(r3)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0461
        L_0x01a5:
            java.lang.String r1 = "cta_url"
            boolean r1 = r1.equals(r2)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 != 0) goto L_0x00f5
            java.lang.String r1 = "cta_call"
            boolean r1 = r1.equals(r2)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 != 0) goto L_0x00f5
            java.lang.String r1 = "voice_call"
            boolean r1 = r1.equals(r2)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 != 0) goto L_0x00f5
            java.lang.String r1 = "cta_copy"
            boolean r1 = r1.equals(r2)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 != 0) goto L_0x00f5
            java.lang.String r1 = "menu_options"
            boolean r1 = r1.equals(r2)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 != 0) goto L_0x00f5
            java.lang.String r1 = "cta_reminder"
            boolean r1 = r1.equals(r2)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 != 0) goto L_0x00f5
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0461
            goto L_0x00f5
        L_0x01de:
            r2 = 0
            goto L_0x016b
        L_0x01e0:
            r3 = 0
            if (r1 == 0) goto L_0x0200
            X.1C7 r1 = r1.A0N()     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0200
            X.8ya r1 = r1.buttons_     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0200
            java.lang.Object r1 = X.C73723fy.A04(r1)     // Catch:{ 6u5 -> 0x1630 }
            X.1BH r1 = (X.AnonymousClass1BH) r1     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0200
            java.lang.String r2 = r1.buttonParamsJson_     // Catch:{ 6u5 -> 0x1630 }
            if (r2 == 0) goto L_0x0200
            int r1 = r2.length()     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0200
            r3 = r2
        L_0x0200:
            X.2sP r7 = r7.A00(r8, r3)     // Catch:{ 6u5 -> 0x1630 }
            if (r7 == 0) goto L_0x0545
            boolean r1 = r7 instanceof X.AnonymousClass1QP     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x03c3
            X.1QP r7 = (X.AnonymousClass1QP) r7     // Catch:{ 6u5 -> 0x1630 }
            com.whatsapp.jid.Jid r2 = r5.A18     // Catch:{ 6u5 -> 0x1630 }
            X.4uZ r1 = X.C627336j.A02(r2)     // Catch:{ 6u5 -> 0x1630 }
            boolean r1 = X.C627336j.A0K(r1)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 != 0) goto L_0x03bb
            X.4uZ r1 = X.C627336j.A02(r2)     // Catch:{ 6u5 -> 0x1630 }
            boolean r1 = r1 instanceof X.AnonymousClass1fS     // Catch:{ 6u5 -> 0x1630 }
            if (r1 != 0) goto L_0x03bb
            X.4uZ r1 = X.C627336j.A02(r2)     // Catch:{ 6u5 -> 0x1630 }
        L_0x0224:
            com.whatsapp.jid.UserJid r8 = X.AnonymousClass32Y.A03(r1)     // Catch:{ 6u5 -> 0x1630 }
            if (r8 == 0) goto L_0x0458
            X.1ER r1 = X.C625235k.A00(r4)     // Catch:{ 6u5 -> 0x1630 }
            X.1C7 r1 = r1.A0N()     // Catch:{ 6u5 -> 0x1630 }
            java.lang.String r1 = X.C18300x5.A0j(r1)     // Catch:{ 6u5 -> 0x1630 }
            java.util.Map r9 = X.AnonymousClass31O.A01(r1)     // Catch:{ 6u5 -> 0x1630 }
            java.lang.String r3 = "flow_message_version"
            boolean r1 = r9.containsKey(r3)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0458
            java.lang.String r2 = "1"
            java.lang.Object r1 = r9.get(r3)     // Catch:{ 6u5 -> 0x1630 }
            boolean r1 = r2.equals(r1)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0294
            java.lang.String r11 = "flow_id"
            boolean r1 = r9.containsKey(r11)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0458
            java.lang.String r10 = "flow_version_id"
            boolean r1 = r9.containsKey(r10)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0458
            java.lang.String r1 = "flow_data_endpoint"
            boolean r1 = r9.containsKey(r1)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0458
            java.lang.String r1 = "flow_token"
            boolean r1 = r9.containsKey(r1)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0458
            java.lang.String r1 = "flow_cta"
            boolean r1 = r9.containsKey(r1)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0458
            java.lang.Object r1 = r9.get(r10)     // Catch:{ 6u5 -> 0x1630 }
            java.lang.String r1 = r1.toString()     // Catch:{ 6u5 -> 0x1630 }
            java.lang.String r10 = "\\d+"
            boolean r1 = r1.matches(r10)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0458
            java.lang.Object r1 = r9.get(r11)     // Catch:{ 6u5 -> 0x1630 }
            java.lang.String r1 = r1.toString()     // Catch:{ 6u5 -> 0x1630 }
            boolean r1 = r1.matches(r10)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0458
        L_0x0294:
            java.lang.Object r1 = r9.get(r3)     // Catch:{ 6u5 -> 0x1630 }
            boolean r1 = r2.equals(r1)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x02ea
            X.1VX r3 = r7.A06     // Catch:{ 6u5 -> 0x1630 }
            r1 = 2999(0xbb7, float:4.202E-42)
            X.2vE r10 = X.C58422vE.A02     // Catch:{ 6u5 -> 0x1630 }
            boolean r1 = r3.A0Y(r10, r1)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 != 0) goto L_0x02e4
            java.lang.String r1 = X.C57142tA.A01(r9)     // Catch:{ 6u5 -> 0x1630 }
            boolean r1 = r2.equals(r1)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x02e4
            java.lang.String r2 = "flow_id"
            boolean r1 = r9.containsKey(r2)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0458
            java.lang.String r9 = X.C18310x6.A0o(r2, r9)     // Catch:{ 6u5 -> 0x1630 }
            if (r9 == 0) goto L_0x0458
            r1 = 1320(0x528, float:1.85E-42)
            java.lang.String r1 = r3.A0R(r10, r1)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 != 0) goto L_0x0359
            java.util.List r10 = java.util.Collections.emptyList()     // Catch:{ 6u5 -> 0x1630 }
        L_0x02ce:
            java.util.Iterator r9 = r10.iterator()     // Catch:{ 6u5 -> 0x1630 }
        L_0x02d2:
            boolean r1 = r9.hasNext()     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0458
            java.lang.String r2 = X.AnonymousClass001.A0m(r9)     // Catch:{ 6u5 -> 0x1630 }
            java.lang.String r1 = r8.user     // Catch:{ 6u5 -> 0x1630 }
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x02d2
        L_0x02e4:
            boolean r1 = r7.A0B(r3, r4)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 != 0) goto L_0x0545
        L_0x02ea:
            boolean r1 = r7 instanceof X.AnonymousClass1QO     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x04c5
            X.1QO r7 = (X.AnonymousClass1QO) r7     // Catch:{ 6u5 -> 0x1630 }
            r16 = 0
            X.1VX r12 = r7.A0D     // Catch:{ 6u5 -> 0x1630 }
            r1 = 3080(0xc08, float:4.316E-42)
            X.2vE r2 = X.C58422vE.A02     // Catch:{ 6u5 -> 0x1630 }
            boolean r1 = r12.A0Y(r2, r1)     // Catch:{ 6u5 -> 0x1630 }
            r3 = 0
            if (r1 == 0) goto L_0x0542
            X.1ER r1 = X.C625235k.A00(r4)     // Catch:{ 6u5 -> 0x1630 }
            X.1C7 r1 = r1.A0N()     // Catch:{ 6u5 -> 0x1630 }
            java.lang.String r1 = X.C18300x5.A0j(r1)     // Catch:{ 6u5 -> 0x1630 }
            java.util.Map r13 = X.AnonymousClass31O.A01(r1)     // Catch:{ 6u5 -> 0x1630 }
            java.lang.String r1 = "flow_id"
            java.lang.String r10 = X.AnonymousClass0x2.A0d(r1, r13)     // Catch:{ 6u5 -> 0x1630 }
            java.lang.String r11 = X.C57142tA.A01(r13)     // Catch:{ 6u5 -> 0x1630 }
            java.lang.String r1 = "mode"
            java.lang.Object r9 = r13.get(r1)     // Catch:{ 6u5 -> 0x1630 }
            java.lang.String r1 = "draft"
            boolean r9 = X.C162457s7.A0P(r9, r1)     // Catch:{ 6u5 -> 0x1630 }
            java.lang.String r1 = r5.A1B     // Catch:{ 6u5 -> 0x1630 }
            r19 = r1
            X.C162457s7.A0D(r19)     // Catch:{ 6u5 -> 0x1630 }
            X.2jC r1 = X.AnonymousClass25c.A00(r1, r10)     // Catch:{ 6u5 -> 0x1630 }
            if (r9 != 0) goto L_0x04c2
            r9 = 5764(0x1684, float:8.077E-42)
            boolean r2 = r12.A0Y(r2, r9)     // Catch:{ 6u5 -> 0x1630 }
            if (r2 == 0) goto L_0x0488
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r15 = r7.A03     // Catch:{ 6u5 -> 0x1630 }
            X.4C6 r14 = r15.A0W     // Catch:{ 6u5 -> 0x1630 }
            r9 = 0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines$fetchEntrypointScreen$1 r2 = new com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines$fetchEntrypointScreen$1     // Catch:{ 6u5 -> 0x1630 }
            r25 = r2
            r26 = r15
            r27 = r8
            r28 = r1
            r29 = r10
            r30 = r19
            r31 = r9
            r25.<init>(r26, r27, r28, r29, r30, r31)     // Catch:{ 6u5 -> 0x1630 }
            r1 = 3
            X.C616131n.A02(r9, r2, r14, r9, r1)     // Catch:{ 6u5 -> 0x1630 }
            goto L_0x04c2
        L_0x0359:
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1H(r1)     // Catch:{ JSONException -> 0x03af }
            java.lang.String r1 = "galaxy_message"
            org.json.JSONObject r2 = r2.optJSONObject(r1)     // Catch:{ JSONException -> 0x03af }
            if (r2 != 0) goto L_0x036b
            java.util.List r10 = java.util.Collections.emptyList()     // Catch:{ JSONException -> 0x03af }
            goto L_0x02ce
        L_0x036b:
            java.lang.String r1 = "flows"
            org.json.JSONObject r1 = r2.optJSONObject(r1)     // Catch:{ JSONException -> 0x03af }
            if (r1 != 0) goto L_0x0379
            java.util.List r10 = java.util.Collections.emptyList()     // Catch:{ JSONException -> 0x03af }
            goto L_0x02ce
        L_0x0379:
            org.json.JSONObject r2 = r1.optJSONObject(r9)     // Catch:{ JSONException -> 0x03af }
            if (r2 != 0) goto L_0x0385
            java.util.List r10 = java.util.Collections.emptyList()     // Catch:{ JSONException -> 0x03af }
            goto L_0x02ce
        L_0x0385:
            java.lang.String r1 = "supported_businesses"
            org.json.JSONArray r9 = r2.optJSONArray(r1)     // Catch:{ JSONException -> 0x03af }
            if (r9 == 0) goto L_0x03a9
            int r1 = r9.length()     // Catch:{ JSONException -> 0x03af }
            if (r1 == 0) goto L_0x03a9
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ JSONException -> 0x03af }
            r2 = 0
        L_0x0399:
            int r1 = r9.length()     // Catch:{ JSONException -> 0x03af }
            if (r2 >= r1) goto L_0x02ce
            java.lang.String r1 = r9.getString(r2)     // Catch:{ JSONException -> 0x03af }
            r10.add(r1)     // Catch:{ JSONException -> 0x03af }
            int r2 = r2 + 1
            goto L_0x0399
        L_0x03a9:
            java.util.List r10 = java.util.Collections.emptyList()     // Catch:{ JSONException -> 0x03af }
            goto L_0x02ce
        L_0x03af:
            r2 = move-exception
            java.lang.String r1 = "ExtensionsLogger/ExtensionsAction/getSupportedBizIdsForFlow() - json parsing exception"
            com.whatsapp.util.Log.w(r1, r2)     // Catch:{ 6u5 -> 0x1630 }
            java.util.List r10 = java.util.Collections.emptyList()     // Catch:{ 6u5 -> 0x1630 }
            goto L_0x02ce
        L_0x03bb:
            com.whatsapp.jid.Jid r1 = r5.A0E     // Catch:{ 6u5 -> 0x1630 }
            X.4uZ r1 = X.C627336j.A02(r1)     // Catch:{ 6u5 -> 0x1630 }
            goto L_0x0224
        L_0x03c3:
            boolean r1 = r7 instanceof X.AnonymousClass1QK     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0545
            X.1QK r7 = (X.AnonymousClass1QK) r7     // Catch:{ 6u5 -> 0x1630 }
            boolean r9 = X.C18290x4.A1W(r5)     // Catch:{ 6u5 -> 0x1630 }
            X.66R r1 = r7.A00     // Catch:{ 6u5 -> 0x1630 }
            java.lang.Object r3 = r1.getValue()     // Catch:{ 6u5 -> 0x1630 }
            X.2sp r3 = (X.C56952sp) r3     // Catch:{ 6u5 -> 0x1630 }
            r2 = 3754(0xeaa, float:5.26E-42)
            X.2vE r1 = X.C58422vE.A02     // Catch:{ 6u5 -> 0x1630 }
            boolean r1 = r3.A0Y(r1, r2)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0456
            X.1ER r3 = X.C625235k.A00(r4)     // Catch:{ 6u5 -> 0x1630 }
            X.C162457s7.A0D(r3)     // Catch:{ 6u5 -> 0x1630 }
            int r2 = r3.interactiveMessageCase_     // Catch:{ 6u5 -> 0x1630 }
            r1 = 6
            boolean r1 = X.AnonymousClass000.A1U(r2, r1)     // Catch:{ 6u5 -> 0x1630 }
            r14 = 0
            if (r1 == 0) goto L_0x0450
            X.1C7 r1 = r3.A0N()     // Catch:{ 6u5 -> 0x1630 }
            X.8ya r1 = r1.buttons_     // Catch:{ 6u5 -> 0x1630 }
            X.C162457s7.A0D(r1)     // Catch:{ 6u5 -> 0x1630 }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ 6u5 -> 0x1630 }
        L_0x03fd:
            boolean r1 = r8.hasNext()     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x044e
            java.lang.Object r3 = r8.next()     // Catch:{ 6u5 -> 0x1630 }
            r1 = r3
            X.1BH r1 = (X.AnonymousClass1BH) r1     // Catch:{ 6u5 -> 0x1630 }
            java.lang.String r2 = r1.name_     // Catch:{ 6u5 -> 0x1630 }
            java.lang.String r1 = "catalog_message"
            boolean r1 = X.C162457s7.A0P(r2, r1)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x03fd
        L_0x0414:
            X.1BH r3 = (X.AnonymousClass1BH) r3     // Catch:{ 6u5 -> 0x1630 }
            if (r3 == 0) goto L_0x0448
            int r1 = r3.bitField0_     // Catch:{ 6u5 -> 0x1630 }
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0448
            java.lang.String r1 = r3.buttonParamsJson_     // Catch:{ 6u5 -> 0x1630 }
            java.lang.String r14 = r7.A0C(r1)     // Catch:{ 6u5 -> 0x1630 }
            if (r14 != 0) goto L_0x042b
        L_0x0426:
            java.lang.String r1 = "ViewCatalogAction/isNeedToDropMessage: phone is null!"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 6u5 -> 0x1630 }
        L_0x042b:
            X.66R r1 = r7.A03     // Catch:{ 6u5 -> 0x1630 }
            java.lang.Object r3 = r1.getValue()     // Catch:{ 6u5 -> 0x1630 }
            X.2Pp r3 = (X.C42812Pp) r3     // Catch:{ 6u5 -> 0x1630 }
            if (r14 != 0) goto L_0x0437
            java.lang.String r14 = ""
        L_0x0437:
            X.4FS r2 = r3.A03     // Catch:{ 6u5 -> 0x1630 }
            r15 = 17
            X.3cN r1 = new X.3cN     // Catch:{ 6u5 -> 0x1630 }
            r10 = r1
            r11 = r5
            r12 = r3
            r13 = r4
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ 6u5 -> 0x1630 }
            r2.BkM(r1)     // Catch:{ 6u5 -> 0x1630 }
            goto L_0x0456
        L_0x0448:
            java.lang.String r1 = "ViewCatalogAction/extractBizPhone: cannot get phone number; either button or params json is not presented"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 6u5 -> 0x1630 }
            goto L_0x0426
        L_0x044e:
            r3 = r14
            goto L_0x0414
        L_0x0450:
            java.lang.String r1 = "ViewCatalogAction/extractBizPhone: cannot get phone number; no native flow message found"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 6u5 -> 0x1630 }
            goto L_0x0426
        L_0x0456:
            if (r9 == 0) goto L_0x0545
        L_0x0458:
            java.lang.String r1 = "Extensions Flow id is not owned by the sender jid"
            X.6u5 r2 = new X.6u5     // Catch:{ 6u5 -> 0x1630 }
            r2.<init>((java.lang.String) r1)     // Catch:{ 6u5 -> 0x1630 }
            goto L_0x0072
        L_0x0461:
            java.lang.String r1 = "Native flow name in envelope and proto must be consistent or an identified pair"
            X.6u5 r2 = new X.6u5     // Catch:{ 6u5 -> 0x1630 }
            r2.<init>((java.lang.String) r1)     // Catch:{ 6u5 -> 0x1630 }
            goto L_0x0072
        L_0x046a:
            java.lang.String r1 = "Message type for list/button/template in envelope and proto must be consistent"
            X.6u5 r2 = new X.6u5     // Catch:{ 6u5 -> 0x1630 }
            r2.<init>((java.lang.String) r1)     // Catch:{ 6u5 -> 0x1630 }
            goto L_0x0072
        L_0x0473:
            X.36E r3 = r0.A04     // Catch:{ 6u5 -> 0x1630 }
            com.whatsapp.jid.Jid r1 = r0.A0T     // Catch:{ 6u5 -> 0x1630 }
            com.whatsapp.jid.DeviceJid r2 = com.whatsapp.jid.DeviceJid.of(r1)     // Catch:{ 6u5 -> 0x1630 }
            r1 = 3
            r3.A0F(r2, r1)     // Catch:{ 6u5 -> 0x1630 }
            java.lang.String r1 = "invalid DeviceSentMessage"
            X.6u5 r2 = new X.6u5     // Catch:{ 6u5 -> 0x1630 }
            r2.<init>((java.lang.String) r1)     // Catch:{ 6u5 -> 0x1630 }
            goto L_0x0072
        L_0x0488:
            X.30j r9 = r7.A02     // Catch:{ 6u5 -> 0x1630 }
            X.2VM r2 = r9.A02     // Catch:{ 6u5 -> 0x1630 }
            X.7pg r2 = r2.A00(r1)     // Catch:{ 6u5 -> 0x1630 }
            r9.A01 = r2     // Catch:{ 6u5 -> 0x1630 }
            if (r10 == 0) goto L_0x04c2
            X.1Ub r14 = r9.A0O     // Catch:{ 6u5 -> 0x1630 }
            int r2 = r10.hashCode()     // Catch:{ 6u5 -> 0x1630 }
            X.21n r26 = X.C372521n.PREFETCH_MESSAGE     // Catch:{ 6u5 -> 0x1630 }
            java.lang.String r1 = r1.A00     // Catch:{ 6u5 -> 0x1630 }
            java.lang.Boolean r28 = java.lang.Boolean.FALSE     // Catch:{ 6u5 -> 0x1630 }
            r29 = r10
            r30 = r19
            r31 = r1
            r32 = r2
            r25 = r14
            r27 = r8
            r25.A0D(r26, r27, r28, r29, r30, r31, r32)     // Catch:{ 6u5 -> 0x1630 }
            X.2fC r1 = r9.A0K     // Catch:{ 6u5 -> 0x1630 }
            X.3XA r14 = r1.A00(r10, r2)     // Catch:{ 6u5 -> 0x1630 }
            r2 = 1
            X.4Jn r1 = new X.4Jn     // Catch:{ 6u5 -> 0x1630 }
            r1.<init>(r2, r10, r9)     // Catch:{ 6u5 -> 0x1630 }
            X.3Wi r2 = r9.A03     // Catch:{ 6u5 -> 0x1630 }
            java.util.concurrent.Executor r2 = r2.A08     // Catch:{ 6u5 -> 0x1630 }
            r14.A04(r1, r2)     // Catch:{ 6u5 -> 0x1630 }
        L_0x04c2:
            if (r11 == 0) goto L_0x0542
            goto L_0x04e2
        L_0x04c5:
            X.1QN r7 = (X.AnonymousClass1QN) r7     // Catch:{ 6u5 -> 0x1630 }
            r1 = 0
            r7.A0F(r8, r4, r5, r1)     // Catch:{ 6u5 -> 0x1630 }
            X.1VX r3 = r7.A0B     // Catch:{ 6u5 -> 0x1630 }
            r2 = 3228(0xc9c, float:4.523E-42)
            X.2vE r1 = X.C58422vE.A02     // Catch:{ 6u5 -> 0x1630 }
            boolean r1 = r3.A0Y(r1, r2)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 != 0) goto L_0x0545
            X.30S r2 = r7.A01     // Catch:{ 6u5 -> 0x1630 }
            X.3E1 r1 = new X.3E1     // Catch:{ 6u5 -> 0x1630 }
            r1.<init>(r7, r8, r4, r5)     // Catch:{ 6u5 -> 0x1630 }
            r2.A06(r1, r8)     // Catch:{ 6u5 -> 0x1630 }
            goto L_0x0545
        L_0x04e2:
            java.lang.String r1 = "flow_action"
            java.lang.Object r2 = r13.get(r1)     // Catch:{ 6u5 -> 0x1630 }
            boolean r1 = r2 instanceof java.lang.String     // Catch:{ 6u5 -> 0x1630 }
            r30 = 0
            if (r1 == 0) goto L_0x0562
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 6u5 -> 0x1630 }
        L_0x04f0:
            boolean r3 = X.C613530j.A00(r11, r2)     // Catch:{ 6u5 -> 0x1630 }
            if (r3 == 0) goto L_0x0542
            X.2rW r9 = r7.A0A     // Catch:{ 6u5 -> 0x1630 }
            r1 = 4849(0x12f1, float:6.795E-42)
            long r1 = X.C56952sp.A05(r12, r1)     // Catch:{ 6u5 -> 0x1630 }
            boolean r1 = r9.A04(r8, r1)     // Catch:{ 6u5 -> 0x1630 }
            if (r1 == 0) goto L_0x0542
            X.1Ud r11 = r7.A0C     // Catch:{ 6u5 -> 0x1630 }
            java.lang.String r1 = "message_receive_integrity_check"
            int r2 = r11.A0C(r8, r1)     // Catch:{ 6u5 -> 0x1630 }
            X.2z0 r1 = r5.A0Q     // Catch:{ 6u5 -> 0x1630 }
            java.lang.String r1 = r1.A01     // Catch:{ 6u5 -> 0x1630 }
            r27 = r11
            r28 = r8
            r29 = r1
            r31 = r10
            r32 = r2
            r27.A07(r28, r29, r30, r31, r32)     // Catch:{ 6u5 -> 0x1630 }
            java.lang.String r10 = "fetch_cache_hit"
            r1 = r16
            r11.A05(r2, r10, r1)     // Catch:{ 6u5 -> 0x1630 }
            java.lang.Integer r29 = java.lang.Integer.valueOf(r2)     // Catch:{ 6u5 -> 0x1630 }
            X.3MG r10 = new X.3MG     // Catch:{ 6u5 -> 0x1630 }
            r10.<init>(r7, r2)     // Catch:{ 6u5 -> 0x1630 }
            X.4FS r2 = r9.A09     // Catch:{ 6u5 -> 0x1630 }
            r32 = 0
            X.3b8 r1 = new X.3b8     // Catch:{ 6u5 -> 0x1630 }
            r31 = r30
            r25 = r1
            r26 = r10
            r27 = r9
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)     // Catch:{ 6u5 -> 0x1630 }
            r2.BkM(r1)     // Catch:{ 6u5 -> 0x1630 }
        L_0x0542:
            r7.A0F(r8, r4, r5, r3)     // Catch:{ 6u5 -> 0x1630 }
        L_0x0545:
            X.1Dk r2 = r6.messageContextInfo_     // Catch:{ 6u5 -> 0x1630 }
            if (r2 != 0) goto L_0x054b
            X.1Dk r2 = X.C21851Dk.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x1630 }
        L_0x054b:
            X.1EU r1 = X.C615231c.A00(r6)     // Catch:{ 6u5 -> 0x1630 }
            android.util.Pair r2 = X.AnonymousClass0x9.A0C(r1, r2)     // Catch:{ 6u5 -> 0x1630 }
            java.lang.Object r1 = r2.first     // Catch:{ 6u5 -> 0x1630 }
            X.1EU r1 = (X.AnonymousClass1EU) r1     // Catch:{ 6u5 -> 0x1630 }
            java.lang.Object r2 = r2.second     // Catch:{ 6u5 -> 0x1630 }
            r19 = r2
            r2 = r19
            X.1Dk r2 = (X.C21851Dk) r2     // Catch:{ 6u5 -> 0x1630 }
            r19 = r2
            goto L_0x0565
        L_0x0562:
            r2 = r30
            goto L_0x04f0
        L_0x0565:
            java.util.List r25 = X.C624835f.A01(r1)
            int r4 = X.C624835f.A00(r1)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "DecryptionCallbackV2/handlePlaintext messageTypes = "
            r3.append(r2)
            r2 = r25
            r3.append(r2)
            java.lang.String r2 = " : numUnknownTags = "
            X.C18260x0.A0y(r2, r3, r4)
            r2 = 2
            if (r4 < r2) goto L_0x059e
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "DecryptionCallbackV2/handlePlaintext axolotl received several unknown tags; message.key="
            r1 = r17
            X.AnonymousClass0x2.A17(r1, r2, r3)
            java.lang.String r1 = " numUnknownTags="
            X.C18260x0.A0z(r1, r3, r4)
            X.1b7 r2 = r0.A0O
            X.1gS r1 = r0.A0a
            r3 = 18
            X.C615231c.A01(r2, r1, r3)
            goto L_0x0046
        L_0x059e:
            X.1VX r2 = r0.A0N
            r27 = r2
            X.2qk r2 = r0.A01
            r26 = r2
            r4 = r2
            r3 = r25
            r2 = r27
            boolean r2 = X.C624835f.A03(r4, r2, r1, r3)
            if (r2 != 0) goto L_0x05c7
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "DecryptionCallbackV2/handlePlaintext received an invalid protobuf; message.key="
            r1 = r17
            X.AnonymousClass0x2.A17(r1, r2, r3)
            java.lang.String r2 = " messageTypes="
            r1 = r25
            X.C18260x0.A1S(r3, r2, r1)
            r3 = 12
            goto L_0x0046
        L_0x05c7:
            if (r20 == 0) goto L_0x145f
            r2 = r17
            X.3ST r2 = (X.AnonymousClass3ST) r2     // Catch:{ Exception -> 0x1611 }
            int r3 = r1.bitField0_     // Catch:{ Exception -> 0x1611 }
            r3 = r3 & 2
            if (r3 != 0) goto L_0x0625
            r5 = 5716(0x1654, float:8.01E-42)
            X.2vE r4 = X.C58422vE.A02     // Catch:{ Exception -> 0x1611 }
            r3 = r27
            boolean r3 = r3.A0Y(r4, r5)     // Catch:{ Exception -> 0x1611 }
            if (r3 == 0) goto L_0x0625
            r3 = r27
            X.1EU r4 = X.C57312tR.A01(r3, r1)     // Catch:{ Exception -> 0x1611 }
            X.36Y r3 = r0.A0L     // Catch:{ Exception -> 0x1611 }
            java.lang.String r7 = X.AnonymousClass368.A07(r3, r4)     // Catch:{ Exception -> 0x1611 }
            X.34w r4 = r2.A0C     // Catch:{ Exception -> 0x1611 }
            int r3 = r2.A03     // Catch:{ Exception -> 0x1611 }
            int r9 = r2.BCI()     // Catch:{ Exception -> 0x1611 }
            r5 = r27
            r6 = r1
            r8 = r3
            java.lang.String r6 = X.C33061sN.A02(r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x1611 }
            java.lang.String r5 = r2.A0v     // Catch:{ Exception -> 0x1611 }
            boolean r3 = r6.equals(r5)     // Catch:{ Exception -> 0x1611 }
            if (r3 != 0) goto L_0x0625
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = "Received type: "
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            r4.append(r5)     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = ", Expected type: "
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            r4.append(r6)     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = ", Media type: "
            java.lang.String r6 = X.AnonymousClass000.A0V(r3, r7, r4)     // Catch:{ Exception -> 0x1611 }
            java.lang.String r5 = "DecryptionCallbackV2/messageTypeMismatch"
            r4 = 0
            r3 = r26
            r3.A0A(r5, r4, r6)     // Catch:{ Exception -> 0x1611 }
        L_0x0625:
            com.whatsapp.jid.Jid r3 = r0.A0T     // Catch:{ Exception -> 0x1611 }
            X.4uZ r16 = X.C627336j.A02(r3)     // Catch:{ Exception -> 0x1611 }
            X.35K r10 = new X.35K     // Catch:{ Exception -> 0x1611 }
            r10.<init>()     // Catch:{ Exception -> 0x1611 }
            r3 = -1
            r10.A03 = r3     // Catch:{ Exception -> 0x1611 }
            int r3 = r2.A06     // Catch:{ Exception -> 0x1611 }
            r10.A01 = r3     // Catch:{ Exception -> 0x1611 }
            com.whatsapp.jid.UserJid r7 = X.AnonymousClass32Y.A03(r16)     // Catch:{ Exception -> 0x1611 }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = "DecryptionCallbackV2/processVerifiedNameData, jid: "
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            r4.append(r7)     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = "incoming vname: "
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            java.lang.Long r3 = r2.A0f     // Catch:{ Exception -> 0x1611 }
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            java.lang.String r6 = ", vlevel: "
            r4.append(r6)     // Catch:{ Exception -> 0x1611 }
            int r3 = r2.A06     // Catch:{ Exception -> 0x1611 }
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            java.lang.String r5 = ", privacyMode: "
            r4.append(r5)     // Catch:{ Exception -> 0x1611 }
            X.3ZC r3 = r2.A0T     // Catch:{ Exception -> 0x1611 }
            r9 = 0
            if (r3 != 0) goto L_0x0666
            r3 = r9
        L_0x0666:
            X.C18260x0.A0o(r3, r4)     // Catch:{ Exception -> 0x1611 }
            java.lang.Long r3 = r2.A0f     // Catch:{ Exception -> 0x1611 }
            if (r3 == 0) goto L_0x0879
            if (r7 == 0) goto L_0x0879
            X.2rx r8 = r0.A09     // Catch:{ Exception -> 0x1611 }
            java.util.Map r3 = r8.A0A     // Catch:{ Exception -> 0x1611 }
            r3.remove(r7)     // Catch:{ Exception -> 0x1611 }
            X.2qS r12 = r8.A01(r7)     // Catch:{ Exception -> 0x1611 }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = "DecryptionCallbackV2/processVerifiedNameData log db value jid = "
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            r4.append(r7)     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = "old vname = "
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            if (r12 != 0) goto L_0x0690
            r3 = r9
            goto L_0x0692
        L_0x0690:
            java.lang.String r3 = r12.A08     // Catch:{ Exception -> 0x1611 }
        L_0x0692:
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            r4.append(r6)     // Catch:{ Exception -> 0x1611 }
            if (r12 != 0) goto L_0x069c
            r3 = r9
            goto L_0x06a2
        L_0x069c:
            int r3 = r12.A03     // Catch:{ Exception -> 0x1611 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x1611 }
        L_0x06a2:
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            r4.append(r5)     // Catch:{ Exception -> 0x1611 }
            if (r12 != 0) goto L_0x06ac
            r3 = r9
            goto L_0x06b0
        L_0x06ac:
            X.3ZC r3 = r12.A01()     // Catch:{ Exception -> 0x1611 }
        L_0x06b0:
            X.C18260x0.A0o(r3, r4)     // Catch:{ Exception -> 0x1611 }
            int r3 = X.C623134n.A00(r12)     // Catch:{ Exception -> 0x1611 }
            r10.A02 = r3     // Catch:{ Exception -> 0x1611 }
            r23 = 0
            r11 = 1
            if (r12 == 0) goto L_0x06f8
            long r3 = r12.A05     // Catch:{ Exception -> 0x1611 }
            java.lang.Long r5 = r2.A0f     // Catch:{ Exception -> 0x1611 }
            long r13 = r5.longValue()     // Catch:{ Exception -> 0x1611 }
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 == 0) goto L_0x06e7
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r5 = "DecryptionCallbackV2/processVerifiedNameData verified name serial changed, requestCert = true; jid="
            X.C18280x3.A1H(r6, r5, r7)     // Catch:{ Exception -> 0x1611 }
            r6.append(r3)     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = " -> "
            r6.append(r3)     // Catch:{ Exception -> 0x1611 }
            java.lang.Long r3 = r2.A0f     // Catch:{ Exception -> 0x1611 }
            X.C18270x1.A17(r3, r6)     // Catch:{ Exception -> 0x1611 }
            X.C55502qS.A00(r12, r10)     // Catch:{ Exception -> 0x1611 }
            r8.A02(r7)     // Catch:{ Exception -> 0x1611 }
            goto L_0x0709
        L_0x06e7:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = "DecryptionCallbackV2 name is in sync but privacy or level may have changed, jid: "
            X.C18260x0.A1R(r4, r3, r7)     // Catch:{ Exception -> 0x1611 }
            r10.A08 = r11     // Catch:{ Exception -> 0x1611 }
            X.C55502qS.A00(r12, r10)     // Catch:{ Exception -> 0x1611 }
            r22 = 0
            goto L_0x070b
        L_0x06f8:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = "DecryptionCallbackV2 oldVerifiedName is null, new cert case, requestCert = true, jid: "
            X.C18260x0.A1R(r4, r3, r7)     // Catch:{ Exception -> 0x1611 }
            r3 = r23
            r10.A03 = r3     // Catch:{ Exception -> 0x1611 }
            r10.A07 = r9     // Catch:{ Exception -> 0x1611 }
            r10.A05 = r9     // Catch:{ Exception -> 0x1611 }
        L_0x0709:
            r22 = 1
        L_0x070b:
            java.lang.Long r6 = r2.A0e     // Catch:{ Exception -> 0x1611 }
            java.lang.Long r4 = r2.A0d     // Catch:{ Exception -> 0x1611 }
            if (r6 == 0) goto L_0x0755
            if (r4 == 0) goto L_0x0755
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = "DecryptionCallbackV2/processVerifiedNameData triggred_block expiration_ts = "
            r5.append(r3)     // Catch:{ Exception -> 0x1611 }
            r5.append(r6)     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = " cooldown = "
            X.C18260x0.A1R(r5, r3, r4)     // Catch:{ Exception -> 0x1611 }
            long r5 = r6.longValue()     // Catch:{ Exception -> 0x1611 }
            r20 = 0
            int r3 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r3 <= 0) goto L_0x0755
            long r13 = r4.longValue()     // Catch:{ Exception -> 0x1611 }
            int r3 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r3 <= 0) goto L_0x0755
            X.2l2 r15 = r0.A07     // Catch:{ Exception -> 0x1611 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r3
            long r3 = r3 * r13
            org.json.JSONObject r14 = r15.A01(r7)     // Catch:{ JSONException -> 0x0755 }
            if (r14 != 0) goto L_0x0746
            org.json.JSONObject r14 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x0755 }
        L_0x0746:
            java.lang.String r13 = "tb_expired_ts"
            r14.put(r13, r5)     // Catch:{ JSONException -> 0x0755 }
            java.lang.String r5 = "tb_cooldown"
            r14.put(r5, r3)     // Catch:{ JSONException -> 0x0755 }
            r15.A02(r7, r14)     // Catch:{ JSONException -> 0x0755 }
        L_0x0755:
            if (r22 == 0) goto L_0x07b7
            byte[] r5 = r2.A15     // Catch:{ Exception -> 0x1611 }
            if (r5 == 0) goto L_0x0840
            if (r12 == 0) goto L_0x078b
            X.3ZC r3 = r12.A01()     // Catch:{ Exception -> 0x1611 }
            X.3ZC r11 = r2.A0T     // Catch:{ Exception -> 0x1611 }
            long r3 = r3.privacyModeTs     // Catch:{ Exception -> 0x1611 }
            r12 = 0
            int r6 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r6 <= 0) goto L_0x078b
            if (r11 == 0) goto L_0x0773
            long r3 = r11.privacyModeTs     // Catch:{ Exception -> 0x1611 }
            int r6 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x078b
        L_0x0773:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = "DecryptionCallbackV2/missing privacy mode. userJid="
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            r4.append(r7)     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = ". id="
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = r2.A1B     // Catch:{ Exception -> 0x1611 }
            X.C18260x0.A1L(r4, r3)     // Catch:{ Exception -> 0x1611 }
            goto L_0x0840
        L_0x078b:
            int r4 = r2.A06     // Catch:{ Exception -> 0x1611 }
            X.3ZC r3 = r2.A0T     // Catch:{ Exception -> 0x1611 }
            boolean r3 = r8.A05(r7, r3, r5, r4)     // Catch:{ Exception -> 0x1611 }
            if (r3 == 0) goto L_0x0840
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = "DecryptionCallbackV2/reset the transition state, jid: "
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            r4.append(r7)     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = "db update called"
            X.C18260x0.A1L(r4, r3)     // Catch:{ Exception -> 0x1611 }
            X.4FS r5 = r0.A0m     // Catch:{ Exception -> 0x1611 }
            r4 = r16
            r3 = r23
            X.C70113Zy.A01(r5, r0, r4, r3)     // Catch:{ Exception -> 0x1611 }
            r10.A03 = r3     // Catch:{ Exception -> 0x1611 }
            r10.A07 = r9     // Catch:{ Exception -> 0x1611 }
            r10.A05 = r9     // Catch:{ Exception -> 0x1611 }
            goto L_0x0842
        L_0x07b7:
            X.3ZC r3 = r10.A05     // Catch:{ Exception -> 0x1611 }
            X.3ZC r12 = r2.A0T     // Catch:{ Exception -> 0x1611 }
            if (r3 == 0) goto L_0x07fe
            long r3 = r3.privacyModeTs     // Catch:{ Exception -> 0x1611 }
            r14 = 0
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x07f4
            if (r12 == 0) goto L_0x07cd
            long r5 = r12.privacyModeTs     // Catch:{ Exception -> 0x1611 }
            int r13 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r13 != 0) goto L_0x07f7
        L_0x07cd:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = "DecryptionCallbackV2/maybe biz removal, requestSyncThoughCertInSync = true, jid: "
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            r4.append(r7)     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = ", old PrivacyMode: "
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            X.3ZC r3 = r10.A05     // Catch:{ Exception -> 0x1611 }
            if (r3 != 0) goto L_0x07e3
            r3 = r9
        L_0x07e3:
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = ", new PrivacyMode: "
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            X.3ZC r3 = r2.A0T     // Catch:{ Exception -> 0x1611 }
            if (r3 != 0) goto L_0x07f0
            r3 = r9
        L_0x07f0:
            X.C18260x0.A0o(r3, r4)     // Catch:{ Exception -> 0x1611 }
            goto L_0x0835
        L_0x07f4:
            if (r12 != 0) goto L_0x07f7
            goto L_0x07fe
        L_0x07f7:
            long r5 = r12.privacyModeTs     // Catch:{ Exception -> 0x1611 }
            int r13 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r13 >= 0) goto L_0x07fe
            goto L_0x0804
        L_0x07fe:
            int r4 = r10.A03     // Catch:{ Exception -> 0x1611 }
            int r3 = r2.A06     // Catch:{ Exception -> 0x1611 }
            if (r4 == r3) goto L_0x0840
        L_0x0804:
            int r3 = r2.A06     // Catch:{ Exception -> 0x1611 }
            boolean r3 = r8.A04(r7, r12, r3, r11)     // Catch:{ Exception -> 0x1611 }
            r11 = r3 ^ 1
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = "DecryptionCallbackV2/new privacy valid and vlevel change, jid: "
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            r4.append(r7)     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = "requestSyncThoughCertInSync = "
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            r4.append(r11)     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = ", old vlevel: "
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            int r3 = r10.A03     // Catch:{ Exception -> 0x1611 }
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = ", new vlevel: "
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            int r3 = r2.A06     // Catch:{ Exception -> 0x1611 }
            X.C18260x0.A1G(r4, r3)     // Catch:{ Exception -> 0x1611 }
        L_0x0835:
            X.2qS r4 = r8.A01(r7)     // Catch:{ Exception -> 0x1611 }
            int r3 = X.C623134n.A00(r4)     // Catch:{ Exception -> 0x1611 }
            r10.A00 = r3     // Catch:{ Exception -> 0x1611 }
            goto L_0x0844
        L_0x0840:
            r23 = r22
        L_0x0842:
            r11 = 0
            goto L_0x0835
        L_0x0844:
            if (r4 == 0) goto L_0x0850
            java.lang.String r3 = r4.A08     // Catch:{ Exception -> 0x1611 }
            r10.A06 = r3     // Catch:{ Exception -> 0x1611 }
            X.3ZC r3 = r4.A01()     // Catch:{ Exception -> 0x1611 }
            r10.A04 = r3     // Catch:{ Exception -> 0x1611 }
        L_0x0850:
            if (r23 == 0) goto L_0x0853
            goto L_0x08c6
        L_0x0853:
            if (r11 == 0) goto L_0x08d9
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = "DecryptionCallbackV2/usync vlevel/privacy mismatch, requestSyncThoughCertInSync=true, start GetVNameCertificateJob. jid="
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            r4.append(r7)     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = " new vlevel="
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            int r3 = r2.A06     // Catch:{ Exception -> 0x1611 }
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = " new privacy mode="
            r4.append(r3)     // Catch:{ Exception -> 0x1611 }
            X.3ZC r3 = r2.A0T     // Catch:{ Exception -> 0x1611 }
            if (r3 == 0) goto L_0x0875
            r9 = r3
        L_0x0875:
            X.C18270x1.A17(r9, r4)     // Catch:{ Exception -> 0x1611 }
            goto L_0x08cf
        L_0x0879:
            X.3Ex r3 = r0.A08     // Catch:{ Exception -> 0x1611 }
            X.3ZH r8 = r3.A07(r7)     // Catch:{ Exception -> 0x1611 }
            if (r8 == 0) goto L_0x08d9
            boolean r3 = r8.A0R()     // Catch:{ Exception -> 0x1611 }
            if (r3 == 0) goto L_0x08d9
            X.2qS r5 = r8.A0E     // Catch:{ Exception -> 0x1611 }
            if (r5 == 0) goto L_0x08b3
            boolean r3 = X.C155477ey.A00(r7)     // Catch:{ Exception -> 0x1611 }
            if (r3 == 0) goto L_0x08b3
            r6 = 6863(0x1acf, float:9.617E-42)
            X.2vE r4 = X.C58422vE.A02     // Catch:{ Exception -> 0x1611 }
            r3 = r27
            boolean r3 = r3.A0Y(r4, r6)     // Catch:{ Exception -> 0x1611 }
            if (r3 == 0) goto L_0x08b3
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = "DecryptionCallbackV2/verified level absent in message, ignore for bot; jid="
            X.C18260x0.A1S(r4, r3, r7)     // Catch:{ Exception -> 0x1611 }
            int r4 = r5.A03     // Catch:{ Exception -> 0x1611 }
            r10.A03 = r4     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = r5.A08     // Catch:{ Exception -> 0x1611 }
            r10.A07 = r3     // Catch:{ Exception -> 0x1611 }
            r10.A01 = r4     // Catch:{ Exception -> 0x1611 }
            r10.A06 = r3     // Catch:{ Exception -> 0x1611 }
            goto L_0x08d9
        L_0x08b3:
            int r3 = r8.A08     // Catch:{ Exception -> 0x1611 }
            r10.A03 = r3     // Catch:{ Exception -> 0x1611 }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = "DecryptionCallbackV2/verified name serial not present on message, clearing state; jid="
            X.C18260x0.A1S(r4, r3, r7)     // Catch:{ Exception -> 0x1611 }
            X.2rx r3 = r0.A09     // Catch:{ Exception -> 0x1611 }
            r3.A02(r7)     // Catch:{ Exception -> 0x1611 }
            goto L_0x08d9
        L_0x08c6:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = "DecryptionCallbackV2/requestCert=true, start GetVNameCertificateJob for jid: "
            X.C18260x0.A1R(r4, r3, r7)     // Catch:{ Exception -> 0x1611 }
        L_0x08cf:
            X.2gy r4 = r0.A05     // Catch:{ Exception -> 0x1611 }
            com.whatsapp.jobqueue.job.GetVNameCertificateJob r3 = new com.whatsapp.jobqueue.job.GetVNameCertificateJob     // Catch:{ Exception -> 0x1611 }
            r3.<init>(r7)     // Catch:{ Exception -> 0x1611 }
            r4.A02(r3)     // Catch:{ Exception -> 0x1611 }
        L_0x08d9:
            X.2i3 r9 = r10.A02()     // Catch:{ Exception -> 0x1611 }
            int r3 = r1.bitField0_     // Catch:{ Exception -> 0x1611 }
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x08f5
            X.1b7 r4 = r0.A0O     // Catch:{ Exception -> 0x1611 }
            java.lang.Integer r3 = X.AnonymousClass0x7.A0g()     // Catch:{ Exception -> 0x1611 }
            r4.A0A = r3     // Catch:{ Exception -> 0x1611 }
            if (r18 == 0) goto L_0x147b
            X.33Y r3 = r0.A0Y     // Catch:{ Exception -> 0x1611 }
            r3.A07(r2)     // Catch:{ Exception -> 0x1611 }
            r2 = 0
            goto L_0x0dfa
        L_0x08f5:
            int r3 = r25.size()     // Catch:{ Exception -> 0x1611 }
            r5 = 1
            if (r3 != r5) goto L_0x0dfe
            int r3 = r2.A01     // Catch:{ Exception -> 0x1611 }
            if (r3 != 0) goto L_0x0dfe
            r4 = 32
            int r3 = r2.A03     // Catch:{ Exception -> 0x1611 }
            r3 = r3 & 32
            boolean r3 = X.AnonymousClass000.A1U(r3, r4)     // Catch:{ Exception -> 0x1611 }
            if (r3 == 0) goto L_0x0dfe
            boolean r3 = r0.A00     // Catch:{ Exception -> 0x1611 }
            r21 = r3
            X.2oL r7 = r0.A0W     // Catch:{ Exception -> 0x1611 }
            X.1b7 r4 = r0.A0O     // Catch:{ Exception -> 0x1611 }
            X.2H9 r11 = new X.2H9     // Catch:{ Exception -> 0x1611 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x1611 }
            r10 = 0
            boolean r12 = r1.A0M()     // Catch:{ Exception -> 0x1611 }
            if (r12 == 0) goto L_0x092e
            X.1EI r3 = r1.templateMessage_     // Catch:{ Exception -> 0x1611 }
            r6 = r3
            if (r3 != 0) goto L_0x0927
            X.1EI r3 = X.AnonymousClass1EI.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x1611 }
        L_0x0927:
            int r3 = r3.bitField0_     // Catch:{ Exception -> 0x1611 }
            r3 = r3 & 16
            if (r3 == 0) goto L_0x092e
            goto L_0x0947
        L_0x092e:
            int r3 = r1.bitField0_     // Catch:{ Exception -> 0x1611 }
            r3 = r3 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x094a
            X.1Dn r3 = r1.highlyStructuredMessage_     // Catch:{ Exception -> 0x1611 }
            r5 = r3
            if (r3 != 0) goto L_0x093b
            X.1Dn r3 = X.C21881Dn.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x1611 }
        L_0x093b:
            int r3 = r3.bitField0_     // Catch:{ Exception -> 0x1611 }
            r3 = r3 & 64
            if (r3 == 0) goto L_0x094a
            if (r5 != 0) goto L_0x0945
            X.1Dn r5 = X.C21881Dn.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x1611 }
        L_0x0945:
            X.1EI r6 = r5.hydratedHsm_     // Catch:{ Exception -> 0x1611 }
        L_0x0947:
            if (r6 != 0) goto L_0x094e
            goto L_0x094c
        L_0x094a:
            r6 = 0
            goto L_0x094e
        L_0x094c:
            X.1EI r6 = X.AnonymousClass1EI.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x1611 }
        L_0x094e:
            com.whatsapp.jid.Jid r3 = r2.A18     // Catch:{ Exception -> 0x1611 }
            r16 = r3
            X.4uZ r3 = X.C627336j.A02(r16)     // Catch:{ Exception -> 0x1611 }
            boolean r3 = X.C627336j.A0K(r3)     // Catch:{ Exception -> 0x1611 }
            if (r3 != 0) goto L_0x0969
            X.4uZ r3 = X.C627336j.A02(r16)     // Catch:{ Exception -> 0x1611 }
            boolean r3 = r3 instanceof X.AnonymousClass1fS     // Catch:{ Exception -> 0x1611 }
            if (r3 != 0) goto L_0x0969
            X.4uZ r8 = X.C627336j.A02(r16)     // Catch:{ Exception -> 0x1611 }
            goto L_0x096f
        L_0x0969:
            com.whatsapp.jid.Jid r3 = r2.A0E     // Catch:{ Exception -> 0x1611 }
            X.4uZ r8 = X.C627336j.A02(r3)     // Catch:{ Exception -> 0x1611 }
        L_0x096f:
            r5 = -1
            r14 = 1
            if (r6 == 0) goto L_0x0bd3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)     // Catch:{ 24W -> 0x0bc5 }
            r4.A0A = r3     // Catch:{ 24W -> 0x0bc5 }
            X.2z0 r3 = X.AnonymousClass3ST.A00(r2)     // Catch:{ 24W -> 0x0bc5 }
            java.lang.String r15 = r3.toString()     // Catch:{ 24W -> 0x0bc5 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)     // Catch:{ 24W -> 0x0bc5 }
            int r3 = r6.bitField0_     // Catch:{ 24W -> 0x0bc5 }
            r3 = r3 & 16
            if (r3 == 0) goto L_0x0a25
            X.1EK r12 = X.AnonymousClass0x9.A0V(r6)     // Catch:{ 24W -> 0x0bc5 }
            X.209 r4 = r12.A0M()     // Catch:{ 24W -> 0x0bc5 }
            X.209 r3 = X.AnonymousClass209.HYDRATED_TITLE_TEXT     // Catch:{ 24W -> 0x0bc5 }
            if (r4 != r3) goto L_0x09ab
            int r4 = r12.titleCase_     // Catch:{ 24W -> 0x0bc5 }
            r3 = 2
            if (r4 == r3) goto L_0x09ab
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 24W -> 0x0bc5 }
            java.lang.String r2 = "MessageUtil/validateHydratedTemplateMessage/error no title with text title, message key="
            X.C18260x0.A0t(r2, r15, r3)     // Catch:{ 24W -> 0x0bc5 }
            X.24W r2 = new X.24W     // Catch:{ 24W -> 0x0bc5 }
            r2.<init>(r13)     // Catch:{ 24W -> 0x0bc5 }
        L_0x09aa:
            throw r2     // Catch:{ 24W -> 0x0bc5 }
        L_0x09ab:
            int r3 = r12.bitField0_     // Catch:{ 24W -> 0x0bc5 }
            r3 = r3 & 32
            if (r3 == 0) goto L_0x0a16
            X.1A4 r13 = X.C18300x5.A0R()     // Catch:{ 24W -> 0x0bc5 }
            X.1EU r4 = X.C18290x4.A0T(r13)     // Catch:{ 24W -> 0x0bc5 }
            r4.templateMessage_ = r6     // Catch:{ 24W -> 0x0bc5 }
            int r3 = r4.bitField0_     // Catch:{ 24W -> 0x0bc5 }
            r12 = 1048576(0x100000, float:1.469368E-39)
            r3 = r3 | r12
            r4.bitField0_ = r3     // Catch:{ 24W -> 0x0bc5 }
            X.1EU r15 = X.AnonymousClass0x9.A0W(r13)     // Catch:{ 24W -> 0x0bc5 }
            X.2z0 r13 = X.AnonymousClass3ST.A00(r2)     // Catch:{ 24W -> 0x0bc5 }
            long r3 = r2.A16     // Catch:{ 24W -> 0x0bc5 }
            X.C18260x0.A0O(r15, r13)     // Catch:{ 24W -> 0x0bc5 }
            X.2dX r12 = new X.2dX     // Catch:{ 24W -> 0x0bc5 }
            r23 = r15
            r24 = r15
            r25 = r13
            r26 = r3
            r22 = r12
            r22.<init>(r23, r24, r25, r26)     // Catch:{ 24W -> 0x0bc5 }
            X.34w r3 = r2.A0C     // Catch:{ 24W -> 0x0bc5 }
            r12.A03 = r3     // Catch:{ 24W -> 0x0bc5 }
            com.whatsapp.jid.Jid r3 = r2.A0E     // Catch:{ 24W -> 0x0bc5 }
            X.4uZ r3 = X.C627336j.A02(r3)     // Catch:{ 24W -> 0x0bc5 }
            r12.A04 = r3     // Catch:{ 24W -> 0x0bc5 }
            r12.A0F = r14     // Catch:{ 24W -> 0x0bc5 }
            java.lang.Integer r3 = r2.A0V     // Catch:{ 24W -> 0x0bc5 }
            if (r3 == 0) goto L_0x0a14
            int r3 = r3.intValue()     // Catch:{ 24W -> 0x0bc5 }
        L_0x09f4:
            X.C47612dX.A00(r12, r2, r3)     // Catch:{ 24W -> 0x0bc5 }
            java.lang.String r3 = r2.A0q     // Catch:{ 24W -> 0x0bc5 }
            r12.A0D = r3     // Catch:{ 24W -> 0x0bc5 }
            java.lang.String r3 = r2.A0p     // Catch:{ 24W -> 0x0bc5 }
            r12.A0B = r3     // Catch:{ 24W -> 0x0bc5 }
            X.2jz r3 = r2.A08     // Catch:{ 24W -> 0x0bc5 }
            r12.A02 = r3     // Catch:{ 24W -> 0x0bc5 }
            java.lang.String r3 = r2.A0j     // Catch:{ 24W -> 0x0bc5 }
            r12.A08 = r3     // Catch:{ 24W -> 0x0bc5 }
            com.whatsapp.jid.UserJid r3 = r2.A0K     // Catch:{ 24W -> 0x0bc5 }
            r12.A05 = r3     // Catch:{ 24W -> 0x0bc5 }
            boolean r3 = r2.A10     // Catch:{ 24W -> 0x0bc5 }
            r12.A0J = r3     // Catch:{ 24W -> 0x0bc5 }
            X.2rC r4 = r12.A01()     // Catch:{ 24W -> 0x0bc5 }
            goto L_0x0a2b
        L_0x0a14:
            r3 = 0
            goto L_0x09f4
        L_0x0a16:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 24W -> 0x0bc5 }
            java.lang.String r2 = "MessageUtil/validateHydratedTemplateMessage/error no content, message key="
            X.C18260x0.A0t(r2, r15, r3)     // Catch:{ 24W -> 0x0bc5 }
            X.24W r2 = new X.24W     // Catch:{ 24W -> 0x0bc5 }
            r2.<init>(r13)     // Catch:{ 24W -> 0x0bc5 }
            goto L_0x09aa
        L_0x0a25:
            X.24W r2 = new X.24W     // Catch:{ 24W -> 0x0bc5 }
            r2.<init>(r13)     // Catch:{ 24W -> 0x0bc5 }
            goto L_0x09aa
        L_0x0a2b:
            X.8qC r3 = r7.A0I     // Catch:{ 24W -> 0x0ae6 }
            java.lang.Object r3 = r3.get()     // Catch:{ 24W -> 0x0ae6 }
            X.3Le r3 = (X.C66383Le) r3     // Catch:{ 24W -> 0x0ae6 }
            X.34x r13 = r3.A00(r4)     // Catch:{ 24W -> 0x0ae6 }
            X.35k r12 = r7.A0F     // Catch:{ 24W -> 0x0bc5 }
            X.1EK r4 = X.AnonymousClass0x9.A0V(r6)     // Catch:{ 24W -> 0x0bc5 }
            X.1VX r3 = r12.A01     // Catch:{ 24W -> 0x0bc5 }
            java.util.List r4 = X.C625235k.A02(r3, r4)     // Catch:{ 24W -> 0x0bc5 }
            if (r4 == 0) goto L_0x0a4a
            java.lang.String r3 = "Receive Time"
            r12.A04(r3, r4)     // Catch:{ 24W -> 0x0bc5 }
        L_0x0a4a:
            X.2z0 r3 = X.AnonymousClass3ST.A00(r2)     // Catch:{ 24W -> 0x0bc5 }
            X.4uZ r15 = r3.A00     // Catch:{ 24W -> 0x0bc5 }
            if (r15 == 0) goto L_0x0a66
            X.1VX r14 = r7.A06     // Catch:{ 24W -> 0x0bc5 }
            r4 = 3609(0xe19, float:5.057E-42)
            X.2vE r3 = X.C58422vE.A02     // Catch:{ 24W -> 0x0bc5 }
            boolean r3 = r14.A0Y(r3, r4)     // Catch:{ 24W -> 0x0bc5 }
            if (r3 == 0) goto L_0x0a66
            X.1EK r3 = r6.hydratedTemplate_     // Catch:{ 24W -> 0x0bc5 }
            if (r3 != 0) goto L_0x0aaa
            X.1EK r3 = X.AnonymousClass1EK.DEFAULT_INSTANCE     // Catch:{ 24W -> 0x0bc5 }
            if (r3 != 0) goto L_0x0aaa
        L_0x0a66:
            com.whatsapp.jid.Jid r3 = r2.A0E     // Catch:{ 24W -> 0x0bc5 }
            X.4uZ r3 = X.C627336j.A02(r3)     // Catch:{ 24W -> 0x0bc5 }
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass32Y.A05(r3)     // Catch:{ 24W -> 0x0bc5 }
            r13.A1J(r3)     // Catch:{ 24W -> 0x0bc5 }
            java.lang.Long r3 = r2.A0f     // Catch:{ 24W -> 0x0bc5 }
            if (r3 == 0) goto L_0x0a79
            r13.A0w = r3     // Catch:{ 24W -> 0x0bc5 }
        L_0x0a79:
            int r3 = r2.A06     // Catch:{ 24W -> 0x0bc5 }
            r13.A0G = r3     // Catch:{ 24W -> 0x0bc5 }
            int r3 = r2.A02     // Catch:{ 24W -> 0x0bc5 }
            r13.A1E(r3)     // Catch:{ 24W -> 0x0bc5 }
            int r3 = r2.A03     // Catch:{ 24W -> 0x0bc5 }
            if (r3 == 0) goto L_0x0a89
            r13.A1B(r3)     // Catch:{ 24W -> 0x0bc5 }
        L_0x0a89:
            long r3 = r2.A07     // Catch:{ 24W -> 0x0bc5 }
            r13.A1O = r3     // Catch:{ 24W -> 0x0bc5 }
            r7.A01(r13)     // Catch:{ 24W -> 0x0bc5 }
            X.3ZC r3 = r9.A05     // Catch:{ 24W -> 0x0bc5 }
            X.3ZC r4 = r9.A04     // Catch:{ 24W -> 0x0bc5 }
            boolean r3 = X.C57642ty.A01(r3, r4)     // Catch:{ 24W -> 0x0bc5 }
            if (r3 == 0) goto L_0x0aa1
            r13.A0n = r4     // Catch:{ 24W -> 0x0bc5 }
            r3 = 4096(0x1000, float:5.74E-42)
            r13.A1B(r3)     // Catch:{ 24W -> 0x0bc5 }
        L_0x0aa1:
            boolean r3 = r9.A08     // Catch:{ 24W -> 0x0bc5 }
            r13.A1G = r3     // Catch:{ 24W -> 0x0bc5 }
            X.2iv r3 = r2.A09     // Catch:{ 24W -> 0x0bc5 }
            if (r3 == 0) goto L_0x0b8f
            goto L_0x0ae2
        L_0x0aaa:
            X.8ya r3 = r3.hydratedButtons_     // Catch:{ 24W -> 0x0bc5 }
            java.util.Iterator r16 = r3.iterator()     // Catch:{ 24W -> 0x0bc5 }
        L_0x0ab0:
            boolean r3 = r16.hasNext()     // Catch:{ 24W -> 0x0bc5 }
            if (r3 == 0) goto L_0x0a66
            java.lang.Object r12 = r16.next()     // Catch:{ 24W -> 0x0bc5 }
            X.1EH r12 = (X.AnonymousClass1EH) r12     // Catch:{ 24W -> 0x0bc5 }
            int r4 = r12.hydratedButtonCase_     // Catch:{ 24W -> 0x0bc5 }
            r3 = 2
            if (r4 != r3) goto L_0x0ab0
            X.1Ch r3 = r12.A0M()     // Catch:{ 24W -> 0x0bc5 }
            java.lang.String r3 = r3.url_     // Catch:{ 24W -> 0x0bc5 }
            boolean r4 = X.C57592tt.A01(r14, r15, r3)     // Catch:{ 24W -> 0x0bc5 }
            if (r4 != 0) goto L_0x0ada
            java.lang.String r4 = "webview"
            java.lang.String r3 = X.C57592tt.A00(r14, r15, r3)     // Catch:{ 24W -> 0x0bc5 }
            boolean r3 = r4.equals(r3)     // Catch:{ 24W -> 0x0bc5 }
            if (r3 == 0) goto L_0x0ab0
        L_0x0ada:
            X.2mo r4 = r7.A0E     // Catch:{ 24W -> 0x0bc5 }
            java.lang.String r3 = "marketing_msg_webview"
            r4.A01(r13, r3, r10)     // Catch:{ 24W -> 0x0bc5 }
            goto L_0x0a66
        L_0x0ae2:
            if (r8 == 0) goto L_0x0b8f
            goto L_0x0b8c
        L_0x0ae6:
            r4 = move-exception
            java.lang.String r3 = "HsmMessageHandler/failed to parse incoming HSM message."
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ 24W -> 0x0bc5 }
            X.1VX r6 = r7.A06     // Catch:{ 24W -> 0x0bc5 }
            r4 = 5537(0x15a1, float:7.759E-42)
            X.2vE r3 = X.C58422vE.A02     // Catch:{ 24W -> 0x0bc5 }
            boolean r3 = r6.A0Y(r3, r4)     // Catch:{ 24W -> 0x0bc5 }
            if (r3 == 0) goto L_0x0b43
            X.33Y r3 = r7.A09     // Catch:{ 24W -> 0x0bc5 }
            java.lang.StringBuilder r6 = X.C18280x3.A0e()     // Catch:{ 24W -> 0x0bc5 }
            java.lang.String r4 = "/sendHSMStructureUnavailableReceipt errorCode=structure-unavailable"
            X.C18260x0.A1J(r6, r4)     // Catch:{ 24W -> 0x0bc5 }
            long r12 = r2.A07     // Catch:{ 24W -> 0x0bc5 }
            X.1VX r4 = r3.A06     // Catch:{ 24W -> 0x0bc5 }
            r29 = r4
            X.2qk r4 = r3.A01     // Catch:{ 24W -> 0x0bc5 }
            r20 = r4
            X.4uZ r23 = X.C627336j.A02(r16)     // Catch:{ 24W -> 0x0bc5 }
            java.lang.String r6 = r2.A1B     // Catch:{ 24W -> 0x0bc5 }
            com.whatsapp.jid.Jid r2 = r2.A0E     // Catch:{ 24W -> 0x0bc5 }
            X.4uZ r24 = X.C627336j.A02(r2)     // Catch:{ 24W -> 0x0bc5 }
            r4 = 0
            java.lang.String r26 = "structure-unavailable"
            X.2RT r2 = new X.2RT     // Catch:{ 24W -> 0x0bc5 }
            r25 = r6
            r27 = r12
            r22 = r2
            r22.<init>(r23, r24, r25, r26, r27)     // Catch:{ 24W -> 0x0bc5 }
            long r15 = r2.A00     // Catch:{ 24W -> 0x0bc5 }
            java.lang.String r24 = "message"
            java.lang.String r25 = "error-receipt"
            r22 = r20
            r23 = r29
            r26 = r15
            r28 = r14
            X.AnonymousClass36N.A0A(r22, r23, r24, r25, r26, r28)     // Catch:{ 24W -> 0x0bc5 }
            r6 = 431(0x1af, float:6.04E-43)
            android.os.Message r2 = android.os.Message.obtain(r4, r10, r6, r10, r2)     // Catch:{ 24W -> 0x0bc5 }
            r3.A03(r2, r12)     // Catch:{ 24W -> 0x0bc5 }
            goto L_0x0bba
        L_0x0b43:
            X.33S r13 = r7.A0A     // Catch:{ 24W -> 0x0bc5 }
            X.4uZ r12 = X.C627336j.A02(r16)     // Catch:{ 24W -> 0x0bc5 }
            java.lang.String r6 = r2.A1B     // Catch:{ 24W -> 0x0bc5 }
            com.whatsapp.jid.Jid r2 = r2.A0E     // Catch:{ 24W -> 0x0bc5 }
            X.4uZ r14 = X.C627336j.A02(r2)     // Catch:{ 24W -> 0x0bc5 }
            r4 = 0
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 24W -> 0x0bc5 }
            java.lang.String r2 = "SendMethods/sendHSMStructureUnavailableReceipt errorCode="
            r3.append(r2)     // Catch:{ 24W -> 0x0bc5 }
            r3.append(r4)     // Catch:{ 24W -> 0x0bc5 }
            java.lang.String r2 = "; type="
            r3.append(r2)     // Catch:{ 24W -> 0x0bc5 }
            r3.append(r4)     // Catch:{ 24W -> 0x0bc5 }
            java.lang.String r2 = "; index="
            X.C18260x0.A0q(r2, r4, r3)     // Catch:{ 24W -> 0x0bc5 }
            X.31C r3 = r13.A04     // Catch:{ 24W -> 0x0bc5 }
            r2 = 117(0x75, float:1.64E-43)
            android.os.Message r10 = android.os.Message.obtain(r4, r10, r2, r10, r12)     // Catch:{ 24W -> 0x0bc5 }
            android.os.Bundle r4 = r10.getData()     // Catch:{ 24W -> 0x0bc5 }
            java.lang.String r2 = "messageKeyId"
            r4.putString(r2, r6)     // Catch:{ 24W -> 0x0bc5 }
            if (r14 == 0) goto L_0x0b88
            android.os.Bundle r4 = r10.getData()     // Catch:{ 24W -> 0x0bc5 }
            java.lang.String r2 = "remoteResource"
            X.AnonymousClass0x2.A0v(r4, r14, r2)     // Catch:{ 24W -> 0x0bc5 }
        L_0x0b88:
            r3.A0J(r10)     // Catch:{ 24W -> 0x0bc5 }
            goto L_0x0bba
        L_0x0b8c:
            r7.A00(r3, r8, r13)     // Catch:{ 24W -> 0x0bc5 }
        L_0x0b8f:
            X.3Lv r3 = r7.A03     // Catch:{ 24W -> 0x0bc5 }
            r3.A08(r13)     // Catch:{ 24W -> 0x0bc5 }
            X.2Y3 r14 = r7.A04     // Catch:{ 24W -> 0x0bc5 }
            X.1EK r3 = X.AnonymousClass0x9.A0V(r6)     // Catch:{ 24W -> 0x0bc5 }
            java.lang.String r12 = r3.templateId_     // Catch:{ 24W -> 0x0bc5 }
            X.2m9 r10 = r14.A00     // Catch:{ 24W -> 0x0bc5 }
            r4 = 40
            X.5sN r3 = new X.5sN     // Catch:{ 24W -> 0x0bc5 }
            r3.<init>(r14, r13, r12, r4)     // Catch:{ 24W -> 0x0bc5 }
            r4 = 48
            r10.A01(r3, r4)     // Catch:{ 24W -> 0x0bc5 }
            X.2eE r4 = r7.A05     // Catch:{ 24W -> 0x0bc5 }
            X.1EK r3 = X.AnonymousClass0x9.A0V(r6)     // Catch:{ 24W -> 0x0bc5 }
            java.lang.String r6 = r3.templateId_     // Catch:{ 24W -> 0x0bc5 }
            java.lang.String r3 = r2.A0p     // Catch:{ 24W -> 0x0bc5 }
            r4.A01(r13, r6, r3)     // Catch:{ 24W -> 0x0bc5 }
            r7.A02(r13, r2)     // Catch:{ 24W -> 0x0bc5 }
        L_0x0bba:
            int r2 = r9.A03     // Catch:{ 24W -> 0x0bc5 }
            if (r2 == r5) goto L_0x0df8
            X.3Lv r2 = r7.A03     // Catch:{ 24W -> 0x0bc5 }
            r2.A0P(r8, r9)     // Catch:{ 24W -> 0x0bc5 }
            goto L_0x0df8
        L_0x0bc5:
            r2 = move-exception
            java.lang.Integer r2 = r2.e2eFailureReason     // Catch:{ Exception -> 0x1611 }
            int r3 = r2.intValue()     // Catch:{ Exception -> 0x1611 }
            X.3G6 r2 = r11.A00     // Catch:{ Exception -> 0x1611 }
            r2.A01(r3)     // Catch:{ Exception -> 0x1611 }
            goto L_0x0df8
        L_0x0bd3:
            if (r12 == 0) goto L_0x0d5c
            X.1EI r3 = r1.templateMessage_     // Catch:{ Exception -> 0x1611 }
            r6 = r3
            if (r3 != 0) goto L_0x0bdc
            X.1EI r3 = X.AnonymousClass1EI.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x1611 }
        L_0x0bdc:
            int r3 = r3.formatCase_     // Catch:{ Exception -> 0x1611 }
            r4 = 5
            if (r3 != r4) goto L_0x0d5c
            if (r6 != 0) goto L_0x0be5
            X.1EI r6 = X.AnonymousClass1EI.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x1611 }
        L_0x0be5:
            int r3 = r6.formatCase_     // Catch:{ Exception -> 0x1611 }
            if (r3 != r4) goto L_0x0bf0
            java.lang.Object r3 = r6.format_     // Catch:{ Exception -> 0x1611 }
            X.1ER r3 = (X.AnonymousClass1ER) r3     // Catch:{ Exception -> 0x1611 }
        L_0x0bed:
            int r4 = r3.interactiveMessageCase_     // Catch:{ Exception -> 0x1611 }
            goto L_0x0bf3
        L_0x0bf0:
            X.1ER r3 = X.AnonymousClass1ER.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x1611 }
            goto L_0x0bed
        L_0x0bf3:
            r3 = 7
            boolean r20 = X.AnonymousClass000.A1U(r4, r3)
            java.lang.String r9 = "carousel_message_receive_tag"
            if (r20 == 0) goto L_0x0c08
            X.2g5 r5 = r7.A0B     // Catch:{ Exception -> 0x1611 }
            java.lang.String r4 = X.C18310x6.A0n(r7)     // Catch:{ Exception -> 0x1611 }
            r3 = 238883000(0xe3d10b8, float:2.3304098E-30)
            r5.A00(r3, r9, r4)     // Catch:{ Exception -> 0x1611 }
        L_0x0c08:
            X.8qC r3 = r7.A0J     // Catch:{ 24W -> 0x0d46 }
            java.lang.Object r3 = r3.get()     // Catch:{ 24W -> 0x0d46 }
            X.30C r3 = (X.AnonymousClass30C) r3     // Catch:{ 24W -> 0x0d46 }
            X.2sP r4 = r3.A01(r1)     // Catch:{ 24W -> 0x0d46 }
            if (r4 == 0) goto L_0x0c1e
            X.1VX r3 = r7.A06     // Catch:{ 24W -> 0x0d46 }
            boolean r3 = r4.A0A(r3)     // Catch:{ 24W -> 0x0d46 }
            if (r3 != 0) goto L_0x0ce3
        L_0x0c1e:
            boolean r3 = r2.A0y     // Catch:{ 24W -> 0x0d46 }
            if (r3 != 0) goto L_0x0ce3
            X.2yJ r6 = r7.A0D     // Catch:{ 24W -> 0x0d46 }
            X.2z0 r24 = X.AnonymousClass3ST.A00(r2)     // Catch:{ 24W -> 0x0d46 }
            long r3 = r2.A16     // Catch:{ 24W -> 0x0d46 }
            java.lang.String r12 = r2.A0q     // Catch:{ 24W -> 0x0d46 }
            r13 = 4194304(0x400000, float:5.877472E-39)
            int r5 = r2.A03     // Catch:{ 24W -> 0x0d46 }
            r5 = r5 & r13
            boolean r30 = X.AnonymousClass000.A1U(r5, r13)     // Catch:{ 24W -> 0x0d46 }
            r29 = r10
            r22 = r6
            r23 = r1
            r25 = r12
            r26 = r3
            r28 = r10
            X.34x r13 = r22.A02(r23, r24, r25, r26, r28, r29, r30)     // Catch:{ 24W -> 0x0d46 }
            boolean r3 = r13 instanceof X.AnonymousClass4DV     // Catch:{ 24W -> 0x0d46 }
            if (r3 == 0) goto L_0x0c68
            boolean r3 = r1.A0M()     // Catch:{ 24W -> 0x0d46 }
            if (r3 == 0) goto L_0x0c68
            X.1EI r4 = r1.templateMessage_     // Catch:{ 24W -> 0x0d46 }
            r3 = r4
            if (r4 != 0) goto L_0x0c56
            X.1EI r4 = X.AnonymousClass1EI.DEFAULT_INSTANCE     // Catch:{ 24W -> 0x0d46 }
        L_0x0c56:
            int r4 = r4.bitField0_     // Catch:{ 24W -> 0x0d46 }
            r4 = r4 & 32
            if (r4 == 0) goto L_0x0c68
            X.39W r4 = X.AnonymousClass0x9.A0Y(r13)     // Catch:{ 24W -> 0x0d46 }
            if (r3 != 0) goto L_0x0c64
            X.1EI r3 = X.AnonymousClass1EI.DEFAULT_INSTANCE     // Catch:{ 24W -> 0x0d46 }
        L_0x0c64:
            java.lang.String r3 = r3.templateId_     // Catch:{ 24W -> 0x0d46 }
            r4.A0A = r3     // Catch:{ 24W -> 0x0d46 }
        L_0x0c68:
            boolean r3 = r1.A0M()     // Catch:{ 24W -> 0x0d46 }
            if (r3 == 0) goto L_0x0cee
            X.1EI r3 = r1.templateMessage_     // Catch:{ 24W -> 0x0d46 }
            r4 = r3
            if (r3 != 0) goto L_0x0c75
            X.1EI r3 = X.AnonymousClass1EI.DEFAULT_INSTANCE     // Catch:{ 24W -> 0x0d46 }
        L_0x0c75:
            int r3 = r3.bitField0_     // Catch:{ 24W -> 0x0d46 }
            r3 = r3 & 8
            if (r3 == 0) goto L_0x0cee
            if (r4 != 0) goto L_0x0c7f
            X.1EI r4 = X.AnonymousClass1EI.DEFAULT_INSTANCE     // Catch:{ 24W -> 0x0d46 }
        L_0x0c7f:
            X.1EF r5 = r4.contextInfo_     // Catch:{ 24W -> 0x0d46 }
            if (r5 != 0) goto L_0x0c85
            X.1EF r5 = X.AnonymousClass1EF.DEFAULT_INSTANCE     // Catch:{ 24W -> 0x0d46 }
        L_0x0c85:
            X.1VX r6 = r6.A02     // Catch:{ 24W -> 0x0d46 }
            r4 = 5869(0x16ed, float:8.224E-42)
            X.2vE r3 = X.C58422vE.A02     // Catch:{ 24W -> 0x0d46 }
            boolean r3 = r6.A0Y(r3, r4)     // Catch:{ 24W -> 0x0d46 }
            if (r3 == 0) goto L_0x0cee
            int r4 = r5.bitField0_     // Catch:{ 24W -> 0x0d46 }
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r4 = r4 & r3
            if (r4 == 0) goto L_0x0cee
            X.1AG r3 = r5.dataSharingContext_     // Catch:{ 24W -> 0x0d46 }
            r4 = r3
            if (r3 != 0) goto L_0x0c9f
            X.1AG r3 = X.AnonymousClass1AG.DEFAULT_INSTANCE     // Catch:{ 24W -> 0x0d46 }
        L_0x0c9f:
            int r3 = r3.bitField0_     // Catch:{ 24W -> 0x0d46 }
            r3 = r3 & 1
            if (r3 == 0) goto L_0x0cee
            if (r4 != 0) goto L_0x0ca9
            X.1AG r4 = X.AnonymousClass1AG.DEFAULT_INSTANCE     // Catch:{ 24W -> 0x0d46 }
        L_0x0ca9:
            boolean r3 = r4.showMmDisclosure_     // Catch:{ 24W -> 0x0d46 }
            X.2jD r12 = new X.2jD     // Catch:{ 24W -> 0x0d46 }
            r12.<init>(r3)     // Catch:{ 24W -> 0x0d46 }
            r13.A1O(r12)     // Catch:{ 24W -> 0x0d46 }
            r5 = 64
            long r3 = r13.A1P     // Catch:{ 24W -> 0x0d46 }
            long r5 = (long) r5     // Catch:{ 24W -> 0x0d46 }
            long r3 = r3 | r5
            r13.A1P = r3     // Catch:{ 24W -> 0x0d46 }
            boolean r3 = r13 instanceof X.C30791n7     // Catch:{ 24W -> 0x0d46 }
            if (r3 == 0) goto L_0x0cee
            r3 = r13
            X.1n7 r3 = (X.C30791n7) r3     // Catch:{ 24W -> 0x0d46 }
            java.util.List r3 = r3.A01     // Catch:{ 24W -> 0x0d46 }
            if (r3 == 0) goto L_0x0cee
            boolean r4 = r3.isEmpty()     // Catch:{ 24W -> 0x0d46 }
            if (r4 != 0) goto L_0x0cee
            java.util.Iterator r16 = r3.iterator()     // Catch:{ 24W -> 0x0d46 }
        L_0x0cd0:
            boolean r3 = r16.hasNext()     // Catch:{ 24W -> 0x0d46 }
            if (r3 == 0) goto L_0x0cee
            X.34x r15 = X.C18300x5.A0T(r16)     // Catch:{ 24W -> 0x0d46 }
            r15.A1O(r12)     // Catch:{ 24W -> 0x0d46 }
            long r3 = r15.A1P     // Catch:{ 24W -> 0x0d46 }
            long r3 = r3 | r5
            r15.A1P = r3     // Catch:{ 24W -> 0x0d46 }
            goto L_0x0cd0
        L_0x0ce3:
            X.2z0 r5 = X.AnonymousClass3ST.A00(r2)     // Catch:{ 24W -> 0x0d46 }
            long r3 = r2.A16     // Catch:{ 24W -> 0x0d46 }
            X.1mJ r13 = X.C30351mJ.A00(r1, r5, r3)     // Catch:{ 24W -> 0x0d46 }
            goto L_0x0d00
        L_0x0cee:
            boolean r3 = r13 instanceof X.C30791n7     // Catch:{ 24W -> 0x0d46 }
            if (r3 == 0) goto L_0x0d00
            com.whatsapp.jid.UserJid r6 = X.AnonymousClass32Y.A05(r8)     // Catch:{ 24W -> 0x0d46 }
            r5 = r13
            X.1n7 r5 = (X.C30791n7) r5     // Catch:{ 24W -> 0x0d46 }
            X.5Qb r4 = r7.A00     // Catch:{ 24W -> 0x0d46 }
            X.2oU r3 = r7.A02     // Catch:{ 24W -> 0x0d46 }
            A00(r4, r3, r6, r5)     // Catch:{ 24W -> 0x0d46 }
        L_0x0d00:
            X.2iv r3 = r2.A09     // Catch:{ 24W -> 0x0d46 }
            if (r3 == 0) goto L_0x0d09
            if (r8 == 0) goto L_0x0d09
            r7.A00(r3, r8, r13)     // Catch:{ 24W -> 0x0d46 }
        L_0x0d09:
            r7.A01(r13)     // Catch:{ 24W -> 0x0d46 }
            X.2dP r3 = r7.A08     // Catch:{ 24W -> 0x0d46 }
            r3.A00(r13, r2)     // Catch:{ 24W -> 0x0d46 }
            X.2Y3 r8 = r7.A04     // Catch:{ 24W -> 0x0d46 }
            X.1EI r3 = r1.templateMessage_     // Catch:{ 24W -> 0x0d46 }
            if (r3 != 0) goto L_0x0d19
            X.1EI r3 = X.AnonymousClass1EI.DEFAULT_INSTANCE     // Catch:{ 24W -> 0x0d46 }
        L_0x0d19:
            java.lang.String r6 = r3.templateId_     // Catch:{ 24W -> 0x0d46 }
            X.2m9 r5 = r8.A00     // Catch:{ 24W -> 0x0d46 }
            r4 = 40
            X.5sN r3 = new X.5sN     // Catch:{ 24W -> 0x0d46 }
            r3.<init>(r8, r13, r6, r4)     // Catch:{ 24W -> 0x0d46 }
            r4 = 48
            r5.A01(r3, r4)     // Catch:{ 24W -> 0x0d46 }
            X.2eE r5 = r7.A05     // Catch:{ 24W -> 0x0d46 }
            X.1EI r3 = r1.templateMessage_     // Catch:{ 24W -> 0x0d46 }
            if (r3 != 0) goto L_0x0d31
            X.1EI r3 = X.AnonymousClass1EI.DEFAULT_INSTANCE     // Catch:{ 24W -> 0x0d46 }
        L_0x0d31:
            java.lang.String r4 = r3.templateId_     // Catch:{ 24W -> 0x0d46 }
            java.lang.String r3 = r2.A0p     // Catch:{ 24W -> 0x0d46 }
            r5.A01(r13, r4, r3)     // Catch:{ 24W -> 0x0d46 }
            if (r20 == 0) goto L_0x0d41
            X.2g5 r4 = r7.A0B     // Catch:{ 24W -> 0x0d46 }
            X.2z0 r3 = r13.A1J     // Catch:{ 24W -> 0x0d46 }
            r4.A01(r3, r9, r14)     // Catch:{ 24W -> 0x0d46 }
        L_0x0d41:
            r7.A02(r13, r2)     // Catch:{ 24W -> 0x0d46 }
            goto L_0x0df8
        L_0x0d46:
            r4 = move-exception
            if (r20 == 0) goto L_0x0d4f
            X.2g5 r3 = r7.A0B     // Catch:{ Exception -> 0x1611 }
            r2 = 0
            r3.A01(r2, r9, r10)     // Catch:{ Exception -> 0x1611 }
        L_0x0d4f:
            java.lang.Integer r2 = r4.e2eFailureReason     // Catch:{ Exception -> 0x1611 }
            int r3 = r2.intValue()     // Catch:{ Exception -> 0x1611 }
            X.3G6 r2 = r11.A00     // Catch:{ Exception -> 0x1611 }
            r2.A01(r3)     // Catch:{ Exception -> 0x1611 }
            goto L_0x0df8
        L_0x0d5c:
            X.4K1 r3 = new X.4K1     // Catch:{ Exception -> 0x1611 }
            r3.<init>(r14)     // Catch:{ Exception -> 0x1611 }
            X.34x r6 = r2.A01(r3)     // Catch:{ Exception -> 0x1611 }
            X.1VX r4 = r7.A06     // Catch:{ Exception -> 0x1611 }
            r2 = 6533(0x1985, float:9.155E-42)
            X.2vE r3 = X.C58422vE.A02     // Catch:{ Exception -> 0x1611 }
            boolean r2 = r4.A0Y(r3, r2)     // Catch:{ Exception -> 0x1611 }
            if (r2 == 0) goto L_0x0d74
            r7.A01(r6)     // Catch:{ Exception -> 0x1611 }
        L_0x0d74:
            X.3Lv r4 = r7.A03     // Catch:{ Exception -> 0x1611 }
            r4.A08(r6)     // Catch:{ Exception -> 0x1611 }
            int r2 = r9.A03     // Catch:{ Exception -> 0x1611 }
            if (r2 == r5) goto L_0x0d80
            r4.A0P(r8, r9)     // Catch:{ Exception -> 0x1611 }
        L_0x0d80:
            X.33Y r10 = r7.A09     // Catch:{ Exception -> 0x1611 }
            byte r4 = r6.A1I     // Catch:{ Exception -> 0x1611 }
            r2 = 19
            if (r4 == r2) goto L_0x0d9e
            java.lang.StringBuilder r3 = X.C18280x3.A0e()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r2 = "/sendHsmEnvelopeMismatchReceipt skipping permanent failure receipt due to wrong type. type="
            r3.append(r2)     // Catch:{ Exception -> 0x1611 }
            r3.append(r4)     // Catch:{ Exception -> 0x1611 }
            java.lang.String r2 = " key="
            X.2z0 r2 = X.C624134x.A08(r6, r2, r3)     // Catch:{ Exception -> 0x1611 }
            X.C18260x0.A0o(r2, r3)     // Catch:{ Exception -> 0x1611 }
            goto L_0x0df8
        L_0x0d9e:
            X.1VX r9 = r10.A06     // Catch:{ Exception -> 0x1611 }
            r2 = 5537(0x15a1, float:7.759E-42)
            boolean r2 = r9.A0Y(r3, r2)     // Catch:{ Exception -> 0x1611 }
            if (r2 == 0) goto L_0x0de2
            long r2 = r6.A1O     // Catch:{ Exception -> 0x1611 }
            X.2qk r8 = r10.A01     // Catch:{ Exception -> 0x1611 }
            X.2z0 r4 = r6.A1J     // Catch:{ Exception -> 0x1611 }
            X.4uZ r5 = r4.A00     // Catch:{ Exception -> 0x1611 }
            java.lang.String r4 = r4.A01     // Catch:{ Exception -> 0x1611 }
            X.4uZ r24 = r6.A0n()     // Catch:{ Exception -> 0x1611 }
            r7 = 0
            java.lang.String r26 = "hsm-envelope-mismatch"
            X.2RT r6 = new X.2RT     // Catch:{ Exception -> 0x1611 }
            r22 = r6
            r23 = r5
            r25 = r4
            r27 = r2
            r22.<init>(r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x1611 }
            long r4 = r6.A00     // Catch:{ Exception -> 0x1611 }
            java.lang.String r24 = "message"
            java.lang.String r25 = "error-receipt"
            r22 = r8
            r23 = r9
            r26 = r4
            r28 = r14
            X.AnonymousClass36N.A0A(r22, r23, r24, r25, r26, r28)     // Catch:{ Exception -> 0x1611 }
            r5 = 0
            r4 = 431(0x1af, float:6.04E-43)
            android.os.Message r4 = android.os.Message.obtain(r7, r5, r4, r5, r6)     // Catch:{ Exception -> 0x1611 }
            r10.A03(r4, r2)     // Catch:{ Exception -> 0x1611 }
            goto L_0x0df8
        L_0x0de2:
            X.2gy r7 = r10.A02     // Catch:{ Exception -> 0x1611 }
            X.2z0 r2 = r6.A1J     // Catch:{ Exception -> 0x1611 }
            X.4uZ r5 = X.AnonymousClass2z0.A01(r2)     // Catch:{ Exception -> 0x1611 }
            X.4uZ r4 = r6.A0n()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = r2.A01     // Catch:{ Exception -> 0x1611 }
            com.whatsapp.jobqueue.job.SendPermanentFailureReceiptJob r2 = new com.whatsapp.jobqueue.job.SendPermanentFailureReceiptJob     // Catch:{ Exception -> 0x1611 }
            r2.<init>(r5, r4, r3)     // Catch:{ Exception -> 0x1611 }
            r7.A02(r2)     // Catch:{ Exception -> 0x1611 }
        L_0x0df8:
            r2 = r21 & 1
        L_0x0dfa:
            r0.A00 = r2     // Catch:{ Exception -> 0x1611 }
            goto L_0x147b
        L_0x0dfe:
            int r3 = r25.size()     // Catch:{ Exception -> 0x1611 }
            if (r3 != r5) goto L_0x147b
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r3 = "DecryptionCallbackV2/regular message, jid: "
            X.C18260x0.A1R(r4, r3, r7)     // Catch:{ Exception -> 0x1611 }
            r2.A0L = r1     // Catch:{ Exception -> 0x1611 }
            r6 = 1
            X.8qC r3 = r0.A0o     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.Object r8 = r3.get()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.30C r8 = (X.AnonymousClass30C) r8     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2ss r5 = r0.A0F     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.4uZ r4 = r0.A0S     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3 = r27
            boolean r3 = X.C624835f.A04(r8, r5, r3, r4, r1)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r8 = 0
            if (r3 != 0) goto L_0x12b8
            boolean r3 = r2.A0y     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 != 0) goto L_0x12b8
            X.2i1 r3 = r0.A0i     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.1EF r10 = r3.A00(r1)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r10 == 0) goto L_0x0e80
            int r3 = r10.bitField0_     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0e80
            X.2z0 r3 = r2.A0Q     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.4uZ r5 = r3.A00     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            boolean r4 = r3.A02     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.1ET r3 = r10.placeholderKey_     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 != 0) goto L_0x0e43
            X.1ET r3 = X.AnonymousClass1ET.DEFAULT_INSTANCE     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x0e43:
            java.lang.String r3 = r3.id_     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2z0 r4 = X.AnonymousClass2z0.A05(r5, r3, r4)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2qz r3 = r0.A0l     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.34x r11 = r3.A05(r4)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r11 == 0) goto L_0x0e80
            byte r5 = r11.A1I     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3 = 31
            if (r5 != r3) goto L_0x0e80
            com.whatsapp.jid.UserJid r5 = r11.A0o()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            com.whatsapp.jid.UserJid r3 = r2.BCo()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            boolean r3 = X.AnonymousClass75J.A00(r5, r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 == 0) goto L_0x0e80
            java.lang.String r3 = "DecryptionCallbackV2/placeholder message"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.String r5 = r4.A01     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 != 0) goto L_0x0e80
            X.2z0 r3 = X.AnonymousClass3ST.A00(r2)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.4uZ r4 = r3.A00     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            boolean r3 = r3.A02     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2z0 r3 = X.AnonymousClass2z0.A05(r4, r5, r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r2.A0R = r3     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x0e80:
            X.2z0 r11 = X.AnonymousClass3ST.A00(r2)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            long r3 = r2.A16     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.C18260x0.A0O(r1, r11)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2dX r5 = new X.2dX     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r22 = r1
            r20 = r5
            r21 = r1
            r23 = r11
            r24 = r3
            r20.<init>(r21, r22, r23, r24)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.34w r3 = r2.A0C     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r5.A03 = r3     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            com.whatsapp.jid.Jid r3 = r2.A0E     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.4uZ r3 = X.C627336j.A02(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r5.A04 = r3     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r5.A0F = r6     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.Integer r3 = r2.A0V     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 == 0) goto L_0x0ef5
            int r3 = r3.intValue()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x0eae:
            X.C47612dX.A00(r5, r2, r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.String r3 = r2.A0q     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r5.A0D = r3     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.String r3 = r2.A0p     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r5.A0B = r3     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2jz r3 = r2.A08     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r5.A02 = r3     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.String r3 = r2.A0j     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r5.A08 = r3     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            com.whatsapp.jid.UserJid r3 = r2.A0K     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r5.A05 = r3     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r4 = 4194304(0x400000, float:5.877472E-39)
            int r3 = r2.A03     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3 = r3 & r4
            boolean r3 = X.AnonymousClass000.A1U(r3, r4)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r5.A0H = r3     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2rC r4 = r5.A01()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.3Le r3 = r0.A0P     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.34x r5 = r3.A00(r4)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r2.A02(r5)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            boolean r3 = r2.A0x     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 == 0) goto L_0x0f98
            X.33A r13 = r0.A0Q     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.String r4 = r2.A0g     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3 = 0
            if (r10 == 0) goto L_0x0ef7
            int r11 = r10.bitField0_     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r11 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x0ef7
            X.8Lq r3 = r10.ephemeralSharedSecret_     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            byte[] r3 = r3.A07()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x0ef7
        L_0x0ef5:
            r3 = 0
            goto L_0x0eae
        L_0x0ef7:
            if (r4 == 0) goto L_0x0f38
            if (r3 == 0) goto L_0x0f31
            int r11 = r2.BCI()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r11 != 0) goto L_0x0f2a
            int r12 = r3.length     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r11 = 32
            if (r12 != r11) goto L_0x12b2
            com.whatsapp.jid.Jid r11 = r2.BCm()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.C162457s7.A0J(r11, r8)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            boolean r12 = X.C627336j.A0L(r11)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2sr r11 = r13.A01     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r12 == 0) goto L_0x0f23
            X.1fH r13 = r11.A0I()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x0f19:
            X.C162457s7.A0D(r13)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            com.whatsapp.jid.Jid r11 = r2.A0E     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            boolean r12 = r11 instanceof X.AnonymousClass1fI     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r12 != 0) goto L_0x0f4a
            goto L_0x0f28
        L_0x0f23:
            com.whatsapp.jid.PhoneUserJid r13 = X.C56972sr.A05(r11)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x0f19
        L_0x0f28:
            r11 = 0
            goto L_0x0f4a
        L_0x0f2a:
            X.248 r3 = new X.248     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3.<init>(r6)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x12b7
        L_0x0f31:
            X.248 r3 = new X.248     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3.<init>(r6)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x12b7
        L_0x0f38:
            if (r3 == 0) goto L_0x0f98
            java.lang.String r5 = "DecryptionCallbackV2/handleBroadcastEphemeralSetting"
            java.lang.String r4 = "broadcast with secret but without ephemeral setting"
            r3 = r26
            r3.A0A(r5, r6, r4)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.248 r3 = new X.248     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3.<init>(r8)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x12b7
        L_0x0f4a:
            X.C626936e.A06(r11)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r24 = 0
            java.lang.String r22 = r13.getRawString()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.String r23 = r7.getRawString()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.String r26 = r11.getRawString()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r25 = r3
            r20 = r6
            r21 = r4
            java.lang.Object r4 = com.whatsapp.wamsys.JniBridge.jvidispatchOOOOOOO(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            com.facebook.simplejni.NativeHolder r4 = (com.facebook.simplejni.NativeHolder) r4     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r4 == 0) goto L_0x12ac
            X.2Ij r3 = new X.2Ij     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3.<init>(r4)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            com.facebook.simplejni.NativeHolder r11 = r3.A00     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3 = 48
            long r3 = (long) r3     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            long r3 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r6, r3, r11)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            int r12 = (int) r3     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3 = 49
            r13 = 2
            long r3 = (long) r3     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            long r3 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r13, r3, r11)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r13 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r13
            X.3Z2 r11 = new X.3Z2     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r11.<init>(r12, r3, r8)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            int r3 = r11.expiration     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r5.A1E(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            long r3 = r11.ephemeralSettingTimestamp     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.C624134x.A0L(r5, r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x0f98:
            X.2iv r12 = r2.A09     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r12 == 0) goto L_0x0fd8
            X.2mu r4 = r0.A0n     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            com.whatsapp.jid.UserJid r3 = r2.BCo()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.34x r11 = r4.A00(r12, r3, r5)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r11 == 0) goto L_0x0fb9
            X.2mi r4 = r0.A0R     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2z0 r3 = r5.A1J     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.4uZ r3 = r3.A00     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            boolean r3 = r4.A02(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 != 0) goto L_0x0fb9
            X.3Lv r3 = r0.A0G     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3.A08(r11)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x0fb9:
            int r3 = r12.A00     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 != r6) goto L_0x0fd8
            X.2mi r4 = r0.A0R     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3 = r16
            boolean r3 = r4.A02(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 == 0) goto L_0x0fd8
            r11 = 5626(0x15fa, float:7.884E-42)
            X.2vE r4 = X.C58422vE.A02     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3 = r27
            boolean r3 = r3.A0Y(r4, r11)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 == 0) goto L_0x0fd8
            r3 = 8388608(0x800000, float:1.17549435E-38)
            r5.A1B(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x0fd8:
            X.2n5 r13 = r2.A0A     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r13 == 0) goto L_0x1013
            java.lang.String r11 = r13.A05     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.String r4 = r13.A03     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r4 == 0) goto L_0x0fef
            int r3 = r4.length()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 == 0) goto L_0x0fef
            int r3 = r4.hashCode()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            switch(r3) {
                case 3314326: goto L_0x1066;
                case 97440432: goto L_0x1071;
                case 100355670: goto L_0x107d;
                default: goto L_0x0fef;
            }     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x0fef:
            X.21Q r4 = X.AnonymousClass21Q.FULL     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x0ff1:
            X.2kf r3 = new X.2kf     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3.<init>(r4, r11)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r5.A1K(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2pS r12 = r0.A0X     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            com.whatsapp.jid.Jid r3 = r2.A18     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.4uZ r11 = X.C627336j.A02(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.String r4 = r13.A03     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.String r3 = "first"
            boolean r3 = r3.equals(r4)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 != 0) goto L_0x101d
            java.lang.String r3 = "inner"
            boolean r3 = r3.equals(r4)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 != 0) goto L_0x101d
        L_0x1013:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.String r3 = "DecryptionCallbackV2/FMessage="
            X.C18260x0.A1R(r4, r3, r5)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x1089
        L_0x101d:
            X.34x r3 = r12.A00(r13, r11)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 == 0) goto L_0x105d
            boolean r4 = r3.A1n()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r4 == 0) goto L_0x105d
            com.whatsapp.wamsys.JniBridge r11 = r12.A05     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            byte[] r12 = r3.A1a     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r4 = 3
            java.lang.Object r3 = X.AnonymousClass0x9.A0r(r11)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.Object r4 = com.whatsapp.wamsys.JniBridge.jvidispatchOOO(r4, r3, r12)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            com.facebook.simplejni.NativeHolder r4 = (com.facebook.simplejni.NativeHolder) r4     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r4 == 0) goto L_0x104b
            X.2Ig r3 = new X.2Ig     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3.<init>(r4)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2Ih r3 = r11.WcmBotMessageSecretAPICreateWithMessageSecret(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 != 0) goto L_0x104e
            java.lang.String r3 = "MessageSecretMessageDecryptionManager/getBotMessageSecretForFirstOrInnerBotMessage/botMessageSecret is null"
        L_0x1047:
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x1013
        L_0x104b:
            java.lang.String r3 = "MessageSecretMessageDecryptionManager/getBotMessageSecretForFirstOrInnerBotMessage/messageSecret is null"
            goto L_0x1047
        L_0x104e:
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            com.facebook.simplejni.NativeHolder r11 = r3.A00     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3 = 79
            long r3 = (long) r3     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.Object r3 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r8, r3, r11)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            byte[] r3 = (byte[]) r3     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x1061
        L_0x105d:
            byte[] r3 = r12.A01(r13, r11)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x1061:
            if (r3 == 0) goto L_0x1013
            r5.A1a = r3     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x1013
        L_0x1066:
            java.lang.String r3 = "last"
            boolean r3 = r4.equals(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 == 0) goto L_0x0fef
            X.21Q r4 = X.AnonymousClass21Q.LAST     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x0ff1
        L_0x1071:
            java.lang.String r3 = "first"
            boolean r3 = r4.equals(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 == 0) goto L_0x0fef
            X.21Q r4 = X.AnonymousClass21Q.FIRST     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x0ff1
        L_0x107d:
            java.lang.String r3 = "inner"
            boolean r3 = r4.equals(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 == 0) goto L_0x0fef
            X.21Q r4 = X.AnonymousClass21Q.INNER     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x0ff1
        L_0x1089:
            if (r10 == 0) goto L_0x10a1
            int r3 = r10.bitField0_     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x10a1
            X.2z0 r4 = X.AnonymousClass3ST.A00(r2)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2z0 r3 = r2.A0Q     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            boolean r3 = r4.equals(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 != 0) goto L_0x10a1
            X.2z0 r3 = r2.A0Q     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r5.A0f = r3     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x10a1:
            X.34x r4 = r5.A0w()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r4 == 0) goto L_0x10ac
            X.36F r3 = r0.A0I     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3.A0Z(r4)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x10ac:
            boolean r3 = r5 instanceof X.C30791n7     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 == 0) goto L_0x10cd
            r10 = r5
            X.1n7 r10 = (X.C30791n7) r10     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.5Qb r4 = r0.A06     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2oU r3 = r0.A0B     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            A00(r4, r3, r7, r10)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x10ba:
            X.99n r3 = r0.A0f     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            boolean r3 = r3.A02()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 != 0) goto L_0x114d
            X.9a7 r4 = r0.A0e     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            boolean r3 = r4.A02()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 != 0) goto L_0x114d
            X.34w r11 = r2.A0C     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x10e5
        L_0x10cd:
            boolean r3 = r5 instanceof X.C30261mA     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 == 0) goto L_0x10ba
            X.2z0 r4 = r5.A1J     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            boolean r3 = r4.A02     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 == 0) goto L_0x10ba
            X.4uZ r4 = r4.A00     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            boolean r3 = r4 instanceof X.C27981fH     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 == 0) goto L_0x10ba
            X.311 r3 = r0.A0J     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.1fH r4 = (X.C27981fH) r4     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3.A05(r4)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x10ba
        L_0x10e5:
            if (r11 == 0) goto L_0x114d
            monitor-enter(r11)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            int r7 = r11.A03     // Catch:{ all -> 0x12a9 }
            r3 = 2
            if (r7 == r3) goto L_0x10f6
            r3 = 20
            if (r7 == r3) goto L_0x10f6
            r3 = 200(0xc8, float:2.8E-43)
            if (r7 == r3) goto L_0x10f6
            goto L_0x114c
        L_0x10f6:
            monitor-exit(r11)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.String r3 = "DecryptionCallbackV2/PAY: received payment message with payments not enabled: "
            r7.append(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2z0 r3 = X.AnonymousClass3ST.A00(r2)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r7.append(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.AnonymousClass001.A1L(r7)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.34w r3 = r2.A0C     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.String r3 = r3.A0K     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r7.append(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.String r3 = "; getting server props"
            X.C18260x0.A1L(r7, r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.33S r3 = r0.A0Z     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3.A05(r8)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r4.A01()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2sr r4 = r0.A03     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.34w r3 = r2.A0C     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            com.whatsapp.jid.UserJid r3 = r3.A0D     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            boolean r3 = r4.A0a(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 == 0) goto L_0x114d
            X.33l r7 = r0.A0c     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2sH r3 = r0.A0A     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            long r3 = r3.A0H()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            long r10 = X.AnonymousClass0x7.A0B()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            long r3 = r3 + r10
            r7.A0F(r8, r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.3Wi r10 = r0.A02     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.1iW r7 = r0.A0b     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.util.Objects.requireNonNull(r7)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r4 = 26
            X.3Zn r3 = new X.3Zn     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3.<init>(r7, r4)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r10.A0S(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x114d
        L_0x114c:
            monitor-exit(r11)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x114d:
            X.34w r3 = r5.A0P     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 == 0) goto L_0x1165
            X.36F r7 = r0.A0I     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.C626936e.A06(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.34w r10 = r5.A0P     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            int r4 = r10.A03     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3 = 5
            if (r4 != r3) goto L_0x1172
            X.7oG r4 = r7.A09     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.String r3 = "verifyPaymentAcceptedRequest type future"
        L_0x1162:
            r4.A05(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x1165:
            boolean r3 = r5 instanceof X.C30291mD     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 == 0) goto L_0x131c
            r3 = r5
            X.1mD r3 = (X.C30291mD) r3     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.String r4 = r3.A00     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2nO r11 = r0.A0H     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            monitor-enter(r11)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x11d7
        L_0x1172:
            boolean r3 = X.AnonymousClass36S.A06(r10)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 == 0) goto L_0x117e
            X.7oG r4 = r7.A09     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.String r3 = "verifyPaymentAcceptedRequest empty transaction"
            goto L_0x1162
        L_0x117e:
            X.34w r10 = r5.A0P     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.String r3 = r10.A0M     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r4 = 0
            X.34w r11 = X.AnonymousClass36F.A05(r7, r3, r4)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r11 == 0) goto L_0x11d2
            com.whatsapp.jid.UserJid r3 = r5.A0o()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            boolean r3 = r11.A0R(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 == 0) goto L_0x11d2
            monitor-enter(r11)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            com.whatsapp.jid.UserJid r7 = r10.A0E     // Catch:{ all -> 0x12a9 }
            if (r7 == 0) goto L_0x11a6
            com.whatsapp.jid.UserJid r3 = r11.A0E     // Catch:{ all -> 0x12a9 }
            boolean r3 = r7.equals(r3)     // Catch:{ all -> 0x12a9 }
            if (r3 != 0) goto L_0x11a6
            java.lang.String r3 = "Pay: PaymentTransactionInfoData canBeAcceptedWithTransaction: sender mismatch"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x12a9 }
            goto L_0x11d1
        L_0x11a6:
            java.lang.String r7 = r11.A0I     // Catch:{ all -> 0x12a9 }
            if (r7 == 0) goto L_0x11cc
            java.lang.String r3 = r10.A0I     // Catch:{ all -> 0x12a9 }
            boolean r3 = r7.equals(r3)     // Catch:{ all -> 0x12a9 }
            if (r3 == 0) goto L_0x11cc
            X.39Q r7 = r11.A08     // Catch:{ all -> 0x12a9 }
            if (r7 == 0) goto L_0x11cc
            X.39Q r3 = r10.A08     // Catch:{ all -> 0x12a9 }
            boolean r3 = r7.equals(r3)     // Catch:{ all -> 0x12a9 }
            if (r3 == 0) goto L_0x11cc
            monitor-exit(r11)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.34w r7 = r5.A0P     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.3Wi r4 = r0.A02     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.3Zy r3 = new X.3Zy     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3.<init>(r0, r6, r7)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r4.A0S(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x1165
        L_0x11cc:
            java.lang.String r3 = "PAY: PaymentTransactionInfoData canBeAcceptedWithTransaction: amount mismatch"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x12a9 }
        L_0x11d1:
            monitor-exit(r11)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x11d2:
            X.34w r3 = r5.A0P     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3.A0M = r4     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x1165
        L_0x11d7:
            X.C162457s7.A0J(r4, r6)     // Catch:{ all -> 0x12a9 }
            X.9U4 r3 = r11.A05     // Catch:{ all -> 0x12a9 }
            X.36F r10 = r3.A0A()     // Catch:{ all -> 0x12a9 }
            X.C162457s7.A0D(r10)     // Catch:{ all -> 0x12a9 }
            r3 = 0
            X.34w r7 = X.AnonymousClass36F.A05(r10, r4, r3)     // Catch:{ all -> 0x12a9 }
            if (r7 == 0) goto L_0x1284
            com.whatsapp.jid.UserJid r3 = r5.A0o()     // Catch:{ all -> 0x12a9 }
            boolean r3 = r7.A0R(r3)     // Catch:{ all -> 0x12a9 }
            if (r3 == 0) goto L_0x1284
            X.8qC r3 = r11.A06     // Catch:{ all -> 0x12a9 }
            X.3Lv r3 = X.AnonymousClass0x9.A0M(r3)     // Catch:{ all -> 0x12a9 }
            X.34x r13 = r3.A0E(r7)     // Catch:{ all -> 0x12a9 }
            if (r13 == 0) goto L_0x124f
            int r12 = r7.A02     // Catch:{ all -> 0x12a9 }
            boolean r3 = r11.A01(r7, r5)     // Catch:{ all -> 0x12a9 }
            if (r3 == 0) goto L_0x1284
            X.2sH r3 = r11.A01     // Catch:{ all -> 0x12a9 }
            long r3 = r3.A0H()     // Catch:{ all -> 0x12a9 }
            r7.A06 = r3     // Catch:{ all -> 0x12a9 }
            r13.A0P = r7     // Catch:{ all -> 0x12a9 }
            X.2z0 r3 = r13.A1J     // Catch:{ all -> 0x12a9 }
            X.C626936e.A06(r7)     // Catch:{ all -> 0x12a9 }
            r25 = 0
            r24 = r8
            r20 = r10
            r21 = r7
            r22 = r3
            r23 = r12
            boolean r3 = r20.A0g(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x12a9 }
            if (r3 == 0) goto L_0x1284
            java.lang.String r4 = "CoreMessageStore"
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x12a9 }
            java.lang.String r3 = "msgStore/markPaymentRequestMessageResponded request message id: "
            r10.append(r3)     // Catch:{ all -> 0x12a9 }
            java.lang.String r3 = r7.A0L     // Catch:{ all -> 0x12a9 }
            java.lang.String r3 = X.AnonymousClass000.A0X(r3, r10)     // Catch:{ all -> 0x12a9 }
            java.lang.String r3 = X.C160757oG.A01(r4, r3)     // Catch:{ all -> 0x12a9 }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x12a9 }
            X.2hU r4 = r11.A03     // Catch:{ all -> 0x12a9 }
            r3 = 16
            r4.A00(r13, r3)     // Catch:{ all -> 0x12a9 }
            X.3Lu r3 = r11.A02     // Catch:{ all -> 0x12a9 }
            r3.A0K(r13)     // Catch:{ all -> 0x12a9 }
            goto L_0x1281
        L_0x124f:
            boolean r3 = r11.A01(r7, r5)     // Catch:{ all -> 0x12a9 }
            if (r3 == 0) goto L_0x1284
            X.2sH r3 = r11.A01     // Catch:{ all -> 0x12a9 }
            long r3 = r3.A0H()     // Catch:{ all -> 0x12a9 }
            r7.A06 = r3     // Catch:{ all -> 0x12a9 }
            boolean r3 = r10.A0d(r7)     // Catch:{ all -> 0x12a9 }
            if (r3 == 0) goto L_0x1284
            java.lang.String r4 = "CoreMessageStore"
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x12a9 }
            java.lang.String r3 = "msgStore/markPaymentRequestMessageResponded request message id: "
            r10.append(r3)     // Catch:{ all -> 0x12a9 }
            java.lang.String r3 = r7.A0L     // Catch:{ all -> 0x12a9 }
            java.lang.String r3 = X.AnonymousClass000.A0X(r3, r10)     // Catch:{ all -> 0x12a9 }
            java.lang.String r3 = X.C160757oG.A01(r4, r3)     // Catch:{ all -> 0x12a9 }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x12a9 }
            X.9Ti r3 = r11.A04     // Catch:{ all -> 0x12a9 }
            r3.A02(r7)     // Catch:{ all -> 0x12a9 }
        L_0x1281:
            monitor-exit(r11)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x131c
        L_0x1284:
            monitor-exit(r11)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            int r3 = r5.A0C     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 <= 0) goto L_0x129f
            X.2qz r4 = r0.A0l     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2z0 r3 = r5.A1J     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.34x r3 = r4.A05(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 == 0) goto L_0x129f
            java.util.ArrayList r4 = X.AnonymousClass002.A0I(r6)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r4.add(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.3Lv r3 = r0.A0G     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3.A0k(r4, r8)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x129f:
            int r3 = r1.bitField0_     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3 = r3 & 2
            if (r3 != 0) goto L_0x147b
            if (r18 == 0) goto L_0x147b
            goto L_0x143e
        L_0x12a9:
            r3 = move-exception
            monitor-exit(r11)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x12b7
        L_0x12ac:
            X.248 r3 = new X.248     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3.<init>(r8)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x12b7
        L_0x12b2:
            X.248 r3 = new X.248     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3.<init>(r6)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x12b7:
            throw r3     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x12b8:
            r13 = 2
            X.2z0 r11 = X.AnonymousClass3ST.A00(r2)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            long r3 = r2.A16     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.1mJ r5 = new X.1mJ     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r10 = r5
            r12 = r24
            r14 = r3
            r10.<init>(r11, r12, r13, r14)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r2.A02(r5)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            int r4 = r1.bitField1_     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3 = r4 & 16
            if (r3 != 0) goto L_0x1318
            r3 = r4 & 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x1318
            r3 = r4 & 128(0x80, float:1.794E-43)
            r7 = 67
            if (r3 != 0) goto L_0x131a
            r3 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 & r4
            r7 = 79
            if (r3 != 0) goto L_0x131a
            r3 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x12e9
            r7 = 74
            goto L_0x131a
        L_0x12e9:
            r3 = 4194304(0x400000, float:5.877472E-39)
            r3 = r3 & r4
            boolean r3 = X.AnonymousClass000.A1S(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r7 = 80
            if (r3 != 0) goto L_0x131a
            r3 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r3 & r4
            r7 = 81
            if (r3 != 0) goto L_0x131a
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            r3 = r3 & r4
            r7 = 82
            if (r3 != 0) goto L_0x131a
            r3 = 134217728(0x8000000, float:3.85186E-34)
            r3 = r3 & r4
            r7 = 84
            if (r3 != 0) goto L_0x131a
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r3 & r4
            r7 = 83
            if (r3 != 0) goto L_0x131a
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r4 = r4 & r3
            if (r4 == 0) goto L_0x131c
            r7 = 85
            goto L_0x131a
        L_0x1318:
            r7 = 56
        L_0x131a:
            r5.A00 = r7     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x131c:
            int r4 = r1.bitField0_     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            r4 = r4 & r3
            boolean r3 = X.AnonymousClass000.A1S(r4)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 == 0) goto L_0x134d
            X.1Dk r3 = r1.messageContextInfo_     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r4 = r3
            if (r3 != 0) goto L_0x132e
            X.1Dk r3 = X.C21851Dk.DEFAULT_INSTANCE     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x132e:
            int r3 = r3.bitField0_     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3 = r3 & 8
            if (r3 == 0) goto L_0x134d
            r3 = r4
            if (r4 != 0) goto L_0x1339
            X.1Dk r3 = X.C21851Dk.DEFAULT_INSTANCE     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x1339:
            X.8Lq r3 = r3.paddingBytes_     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 == 0) goto L_0x134d
            if (r4 != 0) goto L_0x1341
            X.1Dk r4 = X.C21851Dk.DEFAULT_INSTANCE     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x1341:
            X.8Lq r3 = r4.paddingBytes_     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            int r3 = r3.A03()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.Long r3 = X.AnonymousClass0x9.A0m(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r2.A0a = r3     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x134d:
            X.1gS r10 = r0.A0a     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r10 == 0) goto L_0x135d
            X.36Y r7 = r0.A0L     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2hp r4 = r0.A0j     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2Yl r3 = r0.A0k     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            int r3 = X.AnonymousClass29K.A01(r7, r5, r4, r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r10.A00 = r3     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x135d:
            boolean r3 = X.C627636p.A0l(r5)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 != 0) goto L_0x1377
            int r10 = r5.A01     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r10 == 0) goto L_0x139b
            boolean r3 = r5 instanceof X.C30571mf     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 != 0) goto L_0x1377
            boolean r3 = r5 instanceof X.C30551md     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 != 0) goto L_0x1377
            boolean r3 = r5 instanceof X.C30561me     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 != 0) goto L_0x1377
            boolean r3 = r5 instanceof X.C30581mg     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 == 0) goto L_0x139b
        L_0x1377:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.String r3 = "DecryptionCallbackV2/edit/revoked key="
            X.C624134x.A0S(r5, r3, r4)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.String r3 = " edit="
            r4.append(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            int r3 = r5.A01     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r4.append(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.String r3 = " msgType="
            r4.append(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            byte r3 = r5.A1I     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.C18260x0.A1F(r4, r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2dP r3 = r0.A0V     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3.A00(r5, r2)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x1443
        L_0x139b:
            byte r7 = r5.A1I     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3 = 95
            if (r7 != r3) goto L_0x13c0
            java.lang.String r3 = "DecryptionCallbackV2/unsupported message"
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.util.ArrayList r4 = X.AnonymousClass002.A0I(r6)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r4.add(r5)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.3Lv r3 = r0.A0G     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3.A0k(r4, r6)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3 = 69
            r0.A01(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r18 == 0) goto L_0x147b
            X.33Y r3 = r0.A0Y     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3.A07(r2)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x1443
        L_0x13c0:
            if (r10 == 0) goto L_0x13eb
            r3 = 2
            if (r10 == r3) goto L_0x13eb
            if (r10 == r6) goto L_0x13eb
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.String r3 = "DecryptionCallbackV2/invalid-edit-version edit="
            r4.append(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r4.append(r10)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.String r3 = ", type="
            r4.append(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r4.append(r7)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.String r3 = ", id="
            java.lang.String r3 = X.AnonymousClass2z0.A07(r5, r3, r4)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.C18260x0.A1K(r4, r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3 = 19
            r0.A01(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x147b
        L_0x13eb:
            X.1b7 r10 = r0.A0O     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.36Y r7 = r0.A0L     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2hp r4 = r0.A0j     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2Yl r3 = r0.A0k     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            int r3 = X.AnonymousClass29K.A01(r7, r5, r4, r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r10.A0A = r3     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2rx r4 = r0.A09     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            com.whatsapp.jid.UserJid r3 = r2.A19     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2qS r3 = r4.A01(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 == 0) goto L_0x143b
            X.3ZC r4 = r3.A01()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x140b:
            X.3ZC r3 = r2.A0T     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            boolean r3 = X.C57642ty.A01(r4, r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            if (r3 == 0) goto L_0x1418
            r3 = 4096(0x1000, float:5.74E-42)
            r5.A1B(r3)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x1418:
            boolean r3 = r9.A08     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r5.A1G = r3     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2dP r3 = r0.A0V     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3.A00(r5, r2)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            int r4 = r9.A03     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3 = -1
            if (r4 == r3) goto L_0x1443
            X.3Lv r7 = r0.A0G     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.35K r4 = new X.35K     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r4.<init>(r9)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            int r3 = r5.A0G     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r4.A01 = r3     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            X.2i3 r4 = r4.A02()     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3 = r16
            r7.A0P(r3, r4)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x1443
        L_0x143b:
            X.3ZC r4 = r9.A05     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x140b
        L_0x143e:
            X.33Y r3 = r0.A0Y     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            r3.A07(r2)     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
        L_0x1443:
            r0.A00 = r8     // Catch:{ 24W -> 0x1471, 248 -> 0x1446 }
            goto L_0x147b
        L_0x1446:
            r4 = move-exception
            r2.A12 = r6     // Catch:{ Exception -> 0x1611 }
            r3 = 9
            r2.A04 = r3     // Catch:{ Exception -> 0x1611 }
            int r2 = r4.failureReason     // Catch:{ Exception -> 0x1611 }
            if (r2 == 0) goto L_0x145c
            if (r2 != r6) goto L_0x1455
            r2 = 0
            goto L_0x1478
        L_0x1455:
            java.lang.String r1 = "Invalid failure reason"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A0c(r1)     // Catch:{ Exception -> 0x1611 }
            throw r1     // Catch:{ Exception -> 0x1611 }
        L_0x145c:
            r2 = 35
            goto L_0x1478
        L_0x145f:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r2 = "DecryptionCallbackV2/handlePlaintext: ignoring "
            r3.append(r2)     // Catch:{ Exception -> 0x1611 }
            r2 = r17
            X.AnonymousClass000.A1A(r2, r3)     // Catch:{ Exception -> 0x1611 }
            X.AnonymousClass0x2.A18(r3)     // Catch:{ Exception -> 0x1611 }
            goto L_0x147b
        L_0x1471:
            r2 = move-exception
            java.lang.Integer r2 = r2.e2eFailureReason     // Catch:{ Exception -> 0x1611 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x1611 }
        L_0x1478:
            r0.A01(r2)     // Catch:{ Exception -> 0x1611 }
        L_0x147b:
            int r2 = r1.bitField0_     // Catch:{ Exception -> 0x1611 }
            r2 = r2 & 2
            if (r2 == 0) goto L_0x1575
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r2 = "DecryptionCallbackV2/axolotl received sender key distribution message; message.key="
            r3.append(r2)     // Catch:{ Exception -> 0x1611 }
            X.2z0 r2 = r17.B9a()     // Catch:{ Exception -> 0x1611 }
            X.C18260x0.A0o(r2, r3)     // Catch:{ Exception -> 0x1611 }
            X.1BQ r4 = r1.senderKeyDistributionMessage_     // Catch:{ Exception -> 0x1611 }
            if (r4 != 0) goto L_0x1497
            X.1BQ r4 = X.AnonymousClass1BQ.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x1611 }
        L_0x1497:
            int r3 = r4.bitField0_     // Catch:{ Exception -> 0x1611 }
            r2 = r3 & 1
            if (r2 == 0) goto L_0x1558
            r2 = r3 & 2
            if (r2 == 0) goto L_0x1558
            X.4uZ r3 = r0.A0S     // Catch:{ Exception -> 0x1611 }
            boolean r2 = X.C627336j.A0K(r3)     // Catch:{ Exception -> 0x1611 }
            if (r2 == 0) goto L_0x14bd
            java.lang.String r3 = r3.getRawString()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r2 = r4.groupId_     // Catch:{ Exception -> 0x1611 }
            boolean r2 = r3.equals(r2)     // Catch:{ Exception -> 0x1611 }
            if (r2 != 0) goto L_0x14bd
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r2 = "DecryptionCallbackV2/group id on message and group id in ciphertext do not match; message.key="
            goto L_0x155e
        L_0x14bd:
            java.lang.String r3 = r4.groupId_     // Catch:{ Exception -> 0x1611 }
            X.2ov r2 = r0.A0D     // Catch:{ Exception -> 0x1611 }
            X.2oh r7 = new X.2oh     // Catch:{ Exception -> 0x1611 }
            r7.<init>(r2, r3)     // Catch:{ Exception -> 0x1611 }
            X.33n r3 = r0.A0E     // Catch:{ Exception -> 0x1611 }
            X.8Lq r2 = r4.axolotlSenderKeyDistributionMessage_     // Catch:{ Exception -> 0x1611 }
            byte[] r5 = r2.A07()     // Catch:{ Exception -> 0x1611 }
            X.3fe r8 = X.C614730x.A01(r3, r7)     // Catch:{ Exception -> 0x1611 }
            X.35n r3 = r3.A00     // Catch:{ all -> 0x154e }
            java.lang.String r4 = "axolotl"
            int r2 = r5.length     // Catch:{ 23u -> 0x1526, 24X -> 0x151f, Exception -> 0x1518 }
            if (r2 == 0) goto L_0x1510
            X.3es r6 = new X.3es     // Catch:{ 23u -> 0x1526, 24X -> 0x151f, Exception -> 0x1518 }
            r6.<init>(r5)     // Catch:{ 23u -> 0x1526, 24X -> 0x151f, Exception -> 0x1518 }
            X.2fm r2 = r3.A04     // Catch:{ 23u -> 0x1526, 24X -> 0x151f, Exception -> 0x1518 }
            boolean r2 = r2.A03()     // Catch:{ 23u -> 0x1526, 24X -> 0x151f, Exception -> 0x1518 }
            if (r2 == 0) goto L_0x14fe
            X.2qP r2 = r3.A02     // Catch:{ 23u -> 0x1526, 24X -> 0x151f, Exception -> 0x1518 }
            X.2fd r2 = r2.A02     // Catch:{ 23u -> 0x1526, 24X -> 0x151f, Exception -> 0x1518 }
            X.2ei r5 = new X.2ei     // Catch:{ 23u -> 0x1526, 24X -> 0x151f, Exception -> 0x1518 }
            r5.<init>(r2)     // Catch:{ 23u -> 0x1526, 24X -> 0x151f, Exception -> 0x1518 }
            X.2fX r3 = X.AnonymousClass31S.A02(r7)     // Catch:{ 23u -> 0x1526, 24X -> 0x151f, Exception -> 0x1518 }
            java.lang.Object r2 = X.AnonymousClass324.A00     // Catch:{ 23u -> 0x1526, 24X -> 0x151f, Exception -> 0x1518 }
            monitor-enter(r2)     // Catch:{ 23u -> 0x1526, 24X -> 0x151f, Exception -> 0x1518 }
            r5.A01(r3, r6)     // Catch:{ all -> 0x14fb }
            monitor-exit(r2)     // Catch:{ all -> 0x14fb }
            goto L_0x150e
        L_0x14fb:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x14fb }
            goto L_0x1517
        L_0x14fe:
            X.2qP r2 = r3.A02     // Catch:{ 23u -> 0x1526, 24X -> 0x151f, Exception -> 0x1518 }
            X.2fd r2 = r2.A02     // Catch:{ 23u -> 0x1526, 24X -> 0x151f, Exception -> 0x1518 }
            X.2ei r3 = new X.2ei     // Catch:{ 23u -> 0x1526, 24X -> 0x151f, Exception -> 0x1518 }
            r3.<init>(r2)     // Catch:{ 23u -> 0x1526, 24X -> 0x151f, Exception -> 0x1518 }
            X.2fX r2 = X.AnonymousClass31S.A02(r7)     // Catch:{ 23u -> 0x1526, 24X -> 0x151f, Exception -> 0x1518 }
            r3.A01(r2, r6)     // Catch:{ 23u -> 0x1526, 24X -> 0x151f, Exception -> 0x1518 }
        L_0x150e:
            r4 = 0
            goto L_0x152c
        L_0x1510:
            java.lang.String r2 = "Data is empty"
            X.24X r3 = new X.24X     // Catch:{ 23u -> 0x1526, 24X -> 0x151f, Exception -> 0x1518 }
            r3.<init>((java.lang.String) r2)     // Catch:{ 23u -> 0x1526, 24X -> 0x151f, Exception -> 0x1518 }
        L_0x1517:
            throw r3     // Catch:{ 23u -> 0x1526, 24X -> 0x151f, Exception -> 0x1518 }
        L_0x1518:
            r2 = move-exception
            com.whatsapp.util.Log.w(r4, r2)     // Catch:{ all -> 0x154e }
            r4 = -1000(0xfffffffffffffc18, float:NaN)
            goto L_0x152c
        L_0x151f:
            r2 = move-exception
            com.whatsapp.util.Log.w(r4, r2)     // Catch:{ all -> 0x154e }
            r4 = -1005(0xfffffffffffffc13, float:NaN)
            goto L_0x152c
        L_0x1526:
            r2 = move-exception
            com.whatsapp.util.Log.w(r4, r2)     // Catch:{ all -> 0x154e }
            r4 = -1007(0xfffffffffffffc11, float:NaN)
        L_0x152c:
            r8.close()     // Catch:{ Exception -> 0x1611 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r2 = "DecryptionCallbackV2/processSenderKeyDistributionMessage/status/"
            X.C18260x0.A0y(r2, r3, r4)     // Catch:{ Exception -> 0x1611 }
            r2 = -1005(0xfffffffffffffc13, float:NaN)
            if (r4 != r2) goto L_0x1543
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r2 = "DecryptionCallbackV2/axolotl received invalid sender key distribution message; message.key="
            goto L_0x155e
        L_0x1543:
            r2 = -1007(0xfffffffffffffc11, float:NaN)
            if (r4 != r2) goto L_0x1568
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r2 = "DecryptionCallbackV2/axolotl received legacy sender key distribution message; message.key="
            goto L_0x155e
        L_0x154e:
            r2 = move-exception
            r8.close()     // Catch:{ all -> 0x1553 }
            goto L_0x1557
        L_0x1553:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ Exception -> 0x1611 }
        L_0x1557:
            throw r2     // Catch:{ Exception -> 0x1611 }
        L_0x1558:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r2 = "DecryptionCallbackV2/axolotl received incomplete sender key distribution message; message.key="
        L_0x155e:
            r3.append(r2)     // Catch:{ Exception -> 0x1611 }
            X.2z0 r2 = r17.B9a()     // Catch:{ Exception -> 0x1611 }
            X.C18270x1.A17(r2, r3)     // Catch:{ Exception -> 0x1611 }
        L_0x1568:
            if (r18 == 0) goto L_0x1575
            boolean r2 = r0.A00     // Catch:{ Exception -> 0x1611 }
            if (r2 == 0) goto L_0x1575
            X.33Y r3 = r0.A0Y     // Catch:{ Exception -> 0x1611 }
            r2 = r17
            r3.A07(r2)     // Catch:{ Exception -> 0x1611 }
        L_0x1575:
            com.whatsapp.jid.Jid r4 = r0.A0T     // Catch:{ Exception -> 0x1611 }
            com.whatsapp.jid.DeviceJid r3 = com.whatsapp.jid.DeviceJid.of(r4)     // Catch:{ Exception -> 0x1611 }
            if (r3 != 0) goto L_0x1588
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r1 = "DecryptionCallbackV2/processIcdcData sender is not a userJid jid="
            X.C18260x0.A1Q(r2, r1, r4)     // Catch:{ Exception -> 0x1611 }
            goto L_0x162c
        L_0x1588:
            if (r19 == 0) goto L_0x159c
            r2 = r19
            int r2 = r2.bitField0_     // Catch:{ Exception -> 0x1611 }
            r2 = r2 & 1
            if (r2 == 0) goto L_0x159c
            java.lang.String r1 = "DecryptionCallbackV2/processIcdcData in contextInfo"
            com.whatsapp.util.Log.d((java.lang.String) r1)     // Catch:{ Exception -> 0x1611 }
            r1 = r19
            X.1Dp r4 = r1.deviceListMetadata_     // Catch:{ Exception -> 0x1611 }
            goto L_0x15ee
        L_0x159c:
            int r4 = r1.bitField0_     // Catch:{ Exception -> 0x1611 }
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r4 = r4 & r2
            boolean r2 = X.AnonymousClass000.A1S(r4)     // Catch:{ Exception -> 0x1611 }
            if (r2 == 0) goto L_0x15fa
            X.1C1 r2 = r1.deviceSentMessage_     // Catch:{ Exception -> 0x1611 }
            r5 = r2
            if (r2 != 0) goto L_0x15ae
            X.1C1 r2 = X.AnonymousClass1C1.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x1611 }
        L_0x15ae:
            X.1EU r2 = r2.message_     // Catch:{ Exception -> 0x1611 }
            if (r2 != 0) goto L_0x15b4
            X.1EU r2 = X.AnonymousClass1EU.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x1611 }
        L_0x15b4:
            int r4 = r2.bitField0_     // Catch:{ Exception -> 0x1611 }
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r4 = r4 & r2
            boolean r2 = X.AnonymousClass000.A1S(r4)     // Catch:{ Exception -> 0x1611 }
            if (r2 == 0) goto L_0x15fa
            if (r5 != 0) goto L_0x15c3
            X.1C1 r5 = X.AnonymousClass1C1.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x1611 }
        L_0x15c3:
            X.1EU r2 = r5.message_     // Catch:{ Exception -> 0x1611 }
            if (r2 != 0) goto L_0x15c9
            X.1EU r2 = X.AnonymousClass1EU.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x1611 }
        L_0x15c9:
            X.1Dk r2 = r2.messageContextInfo_     // Catch:{ Exception -> 0x1611 }
            if (r2 != 0) goto L_0x15cf
            X.1Dk r2 = X.C21851Dk.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x1611 }
        L_0x15cf:
            int r2 = r2.bitField0_     // Catch:{ Exception -> 0x1611 }
            r2 = r2 & 1
            if (r2 == 0) goto L_0x15fa
            java.lang.String r2 = "DecryptionCallbackV2/processIcdcData in deviceSentMessage!"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ Exception -> 0x1611 }
            X.1C1 r1 = r1.deviceSentMessage_     // Catch:{ Exception -> 0x1611 }
            if (r1 != 0) goto L_0x15e0
            X.1C1 r1 = X.AnonymousClass1C1.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x1611 }
        L_0x15e0:
            X.1EU r1 = r1.message_     // Catch:{ Exception -> 0x1611 }
            if (r1 != 0) goto L_0x15e6
            X.1EU r1 = X.AnonymousClass1EU.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x1611 }
        L_0x15e6:
            X.1Dk r1 = r1.messageContextInfo_     // Catch:{ Exception -> 0x1611 }
            if (r1 != 0) goto L_0x15ec
            X.1Dk r1 = X.C21851Dk.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x1611 }
        L_0x15ec:
            X.1Dp r4 = r1.deviceListMetadata_     // Catch:{ Exception -> 0x1611 }
        L_0x15ee:
            if (r4 != 0) goto L_0x15f2
            X.1Dp r4 = X.C21901Dp.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x1611 }
        L_0x15f2:
            X.4FS r2 = r0.A0m     // Catch:{ Exception -> 0x1611 }
            r1 = 9
            X.C70353aM.A00(r2, r0, r3, r4, r1)     // Catch:{ Exception -> 0x1611 }
            goto L_0x162d
        L_0x15fa:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1611 }
            java.lang.String r1 = "DecryptionCallbackV2/processIcdcData no icdc data, sender="
            r2.append(r1)     // Catch:{ Exception -> 0x1611 }
            r2.append(r3)     // Catch:{ Exception -> 0x1611 }
            java.lang.String r1 = "; chatJid="
            r2.append(r1)     // Catch:{ Exception -> 0x1611 }
            X.4uZ r1 = r0.A0S     // Catch:{ Exception -> 0x1611 }
            X.C18270x1.A17(r1, r2)     // Catch:{ Exception -> 0x1611 }
            goto L_0x162e
        L_0x1611:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "DecryptionCallbackV2/handlePlaintext Error processing e2e message; message.key="
            r1 = r17
            X.AnonymousClass0x2.A17(r1, r2, r3)
            X.C18280x3.A1C(r3, r4)
            boolean r1 = r4 instanceof android.database.sqlite.SQLiteFullException
            if (r1 != 0) goto L_0x162f
            boolean r1 = r4 instanceof android.database.sqlite.SQLiteDatabaseCorruptException
            if (r1 != 0) goto L_0x162f
            r3 = 34
            goto L_0x0046
        L_0x162c:
            return
        L_0x162d:
            return
        L_0x162e:
            return
        L_0x162f:
            throw r4
        L_0x1630:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "DecryptionCallbackV2/handlePlaintext axolotl derived plaintext does not represent valid protocol buffer; message.key="
            r1 = r17
            X.AnonymousClass0x2.A17(r1, r2, r3)
            java.lang.String r1 = r3.toString()
            com.whatsapp.util.Log.w(r1, r4)
            r1 = 11
            r0.A01(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3G6.BF5(byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r5 == 67) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(int r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DecryptionCallbackV2/e2e failure, reason= "
            X.C18260x0.A0x(r0, r1, r5)
            X.4FY r3 = r4.A0h
            r3.Bjw()
            boolean r0 = r3.BIs()
            if (r0 != 0) goto L_0x002b
            r0 = 34
            if (r5 == r0) goto L_0x0086
            r0 = 66
            if (r5 == r0) goto L_0x0021
            r0 = 67
            r2 = 5
            if (r5 != r0) goto L_0x0022
        L_0x0021:
            r2 = 6
        L_0x0022:
            X.36E r1 = r4.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.A0Q(r3, r0, r2)
        L_0x002b:
            X.1b7 r1 = r4.A0O
            X.1gS r0 = r4.A0a
            X.C615231c.A01(r1, r0, r5)
            boolean r0 = r4.A0q
            if (r0 == 0) goto L_0x004d
            r0 = 18
            if (r5 != r0) goto L_0x005d
            X.1VX r2 = r4.A0N
            r1 = 3280(0xcd0, float:4.596E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            X.33Y r2 = r4.A0Y
            if (r0 == 0) goto L_0x0055
            r0 = 491(0x1eb, float:6.88E-43)
            r2.A08(r3, r0)
        L_0x004d:
            X.36E r1 = r4.A04
            java.lang.Integer r0 = r4.A0p
            r1.A0R(r3, r0, r5)
            return
        L_0x0055:
            java.lang.String r1 = "unknown-tags"
            r0 = 0
            r2.A09(r3, r1, r0)
            goto L_0x004d
        L_0x005d:
            boolean r0 = r3.BIs()
            if (r0 != 0) goto L_0x0080
            X.1VX r2 = r4.A0N
            r1 = 3280(0xcd0, float:4.596E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0080
            X.33Y r2 = r4.A0Y
            r1 = 34
            r0 = 491(0x1eb, float:6.88E-43)
            if (r5 != r1) goto L_0x0079
            r0 = 500(0x1f4, float:7.0E-43)
        L_0x0079:
            r2.A08(r3, r0)
        L_0x007c:
            r0 = 0
            r4.A00 = r0
            goto L_0x004d
        L_0x0080:
            X.33Y r0 = r4.A0Y
            r0.A07(r3)
            goto L_0x007c
        L_0x0086:
            r2 = 10
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3G6.A01(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (r1.buttons_.isEmpty() != false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(X.AnonymousClass1EU r8, X.AnonymousClass3ST r9) {
        /*
            r7 = this;
            X.20I[] r6 = X.AnonymousClass20I.values()
            int r3 = r6.length
            r5 = 0
            r2 = 0
        L_0x0007:
            r4 = 1
            if (r2 >= r3) goto L_0x002a
            r1 = r6[r2]
            X.8mX r0 = r1.hasMessage
            java.lang.Object r0 = r0.apply(r8)
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r0 == 0) goto L_0x0027
            X.8mX r0 = r1.getMessage
            java.lang.Object r0 = r0.apply(r8)
            X.1EU r0 = (X.AnonymousClass1EU) r0
            boolean r0 = r7.A03(r0, r9)
            if (r0 == 0) goto L_0x0027
            return r4
        L_0x0027:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x002a:
            int r0 = r8.bitField1_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x004e
            X.215 r1 = r9.A0S
            X.215 r0 = X.AnonymousClass215.BUTTON
            if (r1 == r0) goto L_0x004e
            X.1Df r0 = r8.buttonsMessage_
            r1 = r0
            if (r0 != 0) goto L_0x003d
            X.1Df r0 = X.C21801Df.DEFAULT_INSTANCE
        L_0x003d:
            X.8ya r0 = r0.buttons_
            if (r0 == 0) goto L_0x004e
            if (r1 != 0) goto L_0x0045
            X.1Df r1 = X.C21801Df.DEFAULT_INSTANCE
        L_0x0045:
            X.8ya r0 = r1.buttons_
            boolean r0 = r0.isEmpty()
            r3 = 1
            if (r0 == 0) goto L_0x004f
        L_0x004e:
            r3 = 0
        L_0x004f:
            int r2 = r8.bitField0_
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0083
            X.215 r1 = r9.A0S
            X.215 r0 = X.AnonymousClass215.LIST
            if (r1 == r0) goto L_0x0083
        L_0x005c:
            boolean r0 = r8.A0M()
            if (r0 != 0) goto L_0x0066
            r0 = r2 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0081
        L_0x0066:
            X.215 r1 = r9.A0S
            X.215 r0 = X.AnonymousClass215.BIZ
            if (r1 != r0) goto L_0x0078
            r1 = 32
            int r0 = r9.A03
            r0 = r0 & 32
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            if (r0 != 0) goto L_0x0081
        L_0x0078:
            r0 = 1
        L_0x0079:
            if (r3 != 0) goto L_0x007f
            if (r4 != 0) goto L_0x007f
            if (r0 == 0) goto L_0x0080
        L_0x007f:
            r5 = 1
        L_0x0080:
            return r5
        L_0x0081:
            r0 = 0
            goto L_0x0079
        L_0x0083:
            r4 = 0
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3G6.A03(X.1EU, X.3ST):boolean");
    }

    public AnonymousClass3G6(C55682qk r6, C69263Wi r7, C56972sr r8, AnonymousClass36E r9, C49712gy r10, C104205Qb r11, C52192l2 r12, C64773Ex r13, C56422rx r14, C56612sH r15, C54292oU r16, C57162tC r17, C54562ov r18, C621133n r19, C56982ss r20, C66543Lv r21, C53622nO r22, AnonymousClass36F r23, AnonymousClass311 r24, AnonymousClass33Z r25, AnonymousClass36Y r26, AnonymousClass2GF r27, AnonymousClass1VX r28, C25811b7 r29, C66383Le r30, AnonymousClass33A r31, C53202mi r32, C383727h r33, C47532dP r34, C54202oL r35, C54892pS r36, AnonymousClass33Y r37, AnonymousClass33S r38, C55892r5 r39, C29251iW r40, C620933l r41, C29271iY r42, C195989a7 r43, C1907099n r44, AnonymousClass28T r45, AnonymousClass4FY r46, C50342i1 r47, C50222hp r48, C45042Yl r49, C55832qz r50, AnonymousClass4FS r51, C53322mu r52, C183538qC r53, Integer num, boolean z, boolean z2) {
        this.A0D = r18;
        this.A0p = num;
        AnonymousClass4FY r1 = r46;
        this.A0h = r1;
        this.A0O = r29;
        this.A0q = z;
        this.A00 = z2;
        this.A0A = r15;
        this.A0N = r28;
        this.A02 = r7;
        this.A01 = r6;
        this.A03 = r8;
        this.A0B = r16;
        this.A0m = r51;
        this.A0F = r20;
        this.A0Z = r38;
        this.A0Y = r37;
        this.A05 = r10;
        this.A0U = r33;
        this.A08 = r13;
        this.A0L = r26;
        this.A04 = r9;
        this.A0G = r21;
        this.A0l = r50;
        this.A0W = r35;
        this.A0E = r19;
        this.A0n = r52;
        this.A0c = r41;
        this.A06 = r11;
        this.A09 = r14;
        this.A0Q = r31;
        this.A0K = r25;
        this.A0V = r34;
        this.A0o = r53;
        this.A0f = r44;
        this.A0J = r24;
        this.A0M = r27;
        this.A0b = r40;
        this.A0I = r23;
        this.A0g = r45;
        this.A0P = r30;
        this.A0H = r22;
        this.A0e = r43;
        this.A0d = r42;
        this.A0C = r17;
        this.A0i = r47;
        this.A07 = r12;
        this.A0j = r48;
        this.A0X = r36;
        this.A0k = r49;
        this.A0a = (AnonymousClass1gS) r39.A01(0, r1.B9D());
        this.A0S = r1.BC1();
        this.A0T = r1.BCm();
        this.A0R = r32;
    }
}
