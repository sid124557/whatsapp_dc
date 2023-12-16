package X;

import com.whatsapp.jid.UserJid;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.2oK  reason: invalid class name and case insensitive filesystem */
public abstract class C54192oK {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public C95814uZ A05;
    public C95814uZ A06;
    public UserJid A07;
    public UserJid A08;
    public String A09;
    public String A0A = null;
    public String A0B;
    public List A0C;
    public List A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public byte[] A0H;
    public final C55682qk A0I;
    public final C624134x A0J;

    public abstract AnonymousClass1A3 A0D();

    public static String A0B(AnonymousClass1ES r1, int i) {
        if (r1.messageStubParameters_.size() > i) {
            return r1.A0N(i);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: X.1mS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v747, resolved type: X.1nV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: X.1p1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: X.1p1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v139, resolved type: X.1os} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v140, resolved type: X.1os} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v141, resolved type: X.1ox} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v224, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v30, resolved type: X.1p1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v31, resolved type: X.1p1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: X.1p1} */
    /* JADX WARNING: type inference failed for: r5v0, types: [X.34x] */
    /* JADX WARNING: type inference failed for: r5v4, types: [com.whatsapp.jid.Jid] */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.whatsapp.jid.Jid] */
    /* JADX WARNING: type inference failed for: r1v17, types: [com.whatsapp.jid.Jid] */
    /* JADX WARNING: type inference failed for: r1v23, types: [com.whatsapp.jid.Jid] */
    /* JADX WARNING: type inference failed for: r1v50, types: [com.whatsapp.jid.Jid] */
    /* JADX WARNING: type inference failed for: r7v17, types: [X.1mG, X.34x, X.1mr] */
    /* JADX WARNING: type inference failed for: r5v28 */
    /* JADX WARNING: type inference failed for: r5v30 */
    /* JADX WARNING: type inference failed for: r5v36 */
    /* JADX WARNING: Code restructure failed: missing block: B:1021:0x12fb, code lost:
        if (r3 == null) goto L_0x1300;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1022:0x12fd, code lost:
        X.C30341mI.A00(r3, r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1023:0x1300, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x075b, code lost:
        if (r3 == null) goto L_0x075d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0844, code lost:
        if (r3 == null) goto L_0x0846;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:696:0x0d87, code lost:
        if (r1 == 1) goto L_0x0d89;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:964:0x11d1, code lost:
        if (r0 == false) goto L_0x11d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:965:0x11d3, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:982:0x121d, code lost:
        if (r0 == false) goto L_0x11d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:984:0x1223, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:967:0x11d7  */
    /* JADX WARNING: Removed duplicated region for block: B:972:0x11ec  */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C624134x A0E(X.AnonymousClass1ES r15, X.AnonymousClass2z0 r16, long r17) {
        /*
            r14 = this;
            boolean r0 = r14 instanceof X.C30671mp
            r9 = r16
            r10 = r17
            if (r0 == 0) goto L_0x014c
            r5 = r14
            X.1mp r5 = (X.C30671mp) r5
            X.2sH r4 = r5.A08
            X.C626936e.A06(r4)
            X.3Ex r0 = r5.A07
            X.C626936e.A06(r0)
            X.33j r0 = r5.A09
            X.C626936e.A06(r0)
            X.9U4 r0 = r5.A0R
            X.C626936e.A06(r0)
            X.32a r0 = r5.A0A
            X.C626936e.A06(r0)
            X.1EU r7 = r15.message_
            if (r7 != 0) goto L_0x002a
            X.1EU r7 = X.AnonymousClass1EU.DEFAULT_INSTANCE
        L_0x002a:
            X.23Q r1 = r15.A0M()
            X.23Q r0 = X.AnonymousClass23Q.A1F
            r3 = 0
            r2 = 1
            if (r1 != r0) goto L_0x0133
            X.1nS r6 = new X.1nS
            r6.<init>(r9, r10)
        L_0x0039:
            X.2z0 r0 = r6.A1J
            boolean r7 = r0.A02
            if (r7 == 0) goto L_0x004c
            java.lang.Integer r0 = X.AnonymousClass3PY.A01(r15)
            if (r0 == 0) goto L_0x004c
            int r0 = r0.intValue()
            r6.A1G(r0)
        L_0x004c:
            int r0 = r15.bitField1_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x005a
            X.8Lq r0 = r15.messageSecret_
            byte[] r0 = r0.A07()
            r6.A1a = r0
        L_0x005a:
            X.3PL r0 = r5.A05
            r0.A01(r15, r6)
            X.C57342tU.A00(r15, r6)
            X.AnonymousClass3PS.A00(r15, r6)
            int r0 = r15.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0071
            boolean r0 = r15.starred_
            if (r0 == 0) goto L_0x0071
            r6.A1F = r2
        L_0x0071:
            X.3PO r0 = r5.A03
            r0.A01(r15, r6)
            X.3PX r0 = r5.A01
            r0.A01(r15, r6)
            boolean r0 = r6 instanceof X.C30451mT
            if (r0 == 0) goto L_0x0087
            X.1eS r1 = r5.A0U
            r0 = r6
            X.1mT r0 = (X.C30451mT) r0
            r1.A03(r15, r0)
        L_0x0087:
            boolean r0 = r6 instanceof X.C30461mU
            if (r0 == 0) goto L_0x0093
            X.1eR r1 = r5.A0C
            r0 = r6
            X.1mU r0 = (X.C30461mU) r0
            r1.A03(r0, r15)
        L_0x0093:
            X.3PN r0 = r5.A02
            r0.A01(r15, r6)
            int r0 = r15.bitField1_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x00a9
            X.1Az r0 = r15.premiumMessageInfo_
            if (r0 != 0) goto L_0x00a4
            X.1Az r0 = X.C21221Az.DEFAULT_INSTANCE
        L_0x00a4:
            java.lang.String r0 = r0.serverCampaignId_
            r6.A1b(r0)
        L_0x00a9:
            X.AnonymousClass3PW.A00(r15, r6)
            int r0 = r15.bitField1_
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x00b6
            long r0 = r15.newsletterServerId_
            r6.A1M = r0
        L_0x00b6:
            boolean r0 = r6 instanceof X.C30471mV
            if (r0 == 0) goto L_0x011b
            if (r7 != 0) goto L_0x00d5
            boolean r0 = r6 instanceof X.AnonymousClass4DU
            if (r0 != 0) goto L_0x00c8
            boolean r0 = r6 instanceof X.C30721mu
            if (r0 != 0) goto L_0x00c8
            boolean r0 = r6 instanceof X.C31951p9
            if (r0 == 0) goto L_0x00d5
        L_0x00c8:
            java.lang.Integer r0 = X.AnonymousClass3PY.A01(r15)
            if (r0 == 0) goto L_0x00d5
            int r0 = r0.intValue()
            r6.A1G(r0)
        L_0x00d5:
            boolean r0 = r6 instanceof X.AnonymousClass4DU
            if (r0 == 0) goto L_0x00e9
            int r1 = r6.A0D
            r0 = 9
            if (r7 == 0) goto L_0x00e1
            r0 = 8
        L_0x00e1:
            if (r1 != r0) goto L_0x00e9
            r0 = r6
            X.4DU r0 = (X.AnonymousClass4DU) r0
            r0.Bno(r2)
        L_0x00e9:
            r0 = r6
            X.1mV r0 = (X.C30471mV) r0
            X.33C r2 = r0.A01
            if (r2 == 0) goto L_0x0110
            int r1 = r15.bitField0_
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0110
            X.1Aw r0 = r15.mediaData_
            r1 = r0
            if (r0 != 0) goto L_0x00fe
            X.1Aw r0 = X.C21191Aw.DEFAULT_INSTANCE
        L_0x00fe:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0110
            if (r1 != 0) goto L_0x0108
            X.1Aw r1 = X.C21191Aw.DEFAULT_INSTANCE
        L_0x0108:
            java.lang.String r0 = r1.localPath_
            java.io.File r0 = X.AnonymousClass002.A0B(r0)
            r2.A0F = r0
        L_0x0110:
            X.3PP r0 = r5.A0T
            r0.A01(r15, r6)
            X.3PM r0 = r5.A0H
            r0.A00(r3, r15, r6)
        L_0x011a:
            return r6
        L_0x011b:
            boolean r0 = r6 instanceof X.C30391mN
            if (r0 == 0) goto L_0x0110
            r9 = r6
            X.1mN r9 = (X.C30391mN) r9
            long r0 = r9.A01
            r7 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r7
            long r7 = r4.A0H()
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 < 0) goto L_0x0130
            r2 = 0
        L_0x0130:
            r9.A07 = r2
            goto L_0x0110
        L_0x0133:
            X.C18260x0.A0O(r7, r9)     // Catch:{ 24W -> 0x0df2 }
            X.2dX r6 = new X.2dX     // Catch:{ 24W -> 0x0df2 }
            r8 = r7
            r6.<init>(r7, r8, r9, r10)     // Catch:{ 24W -> 0x0df2 }
            r6.A0F = r2     // Catch:{ 24W -> 0x0df2 }
            r6.A0G = r2     // Catch:{ 24W -> 0x0df2 }
            X.2rC r1 = r6.A01()     // Catch:{ 24W -> 0x0df2 }
            X.3Le r0 = r5.A0E     // Catch:{ 24W -> 0x0df2 }
            X.34x r6 = r0.A00(r1)     // Catch:{ 24W -> 0x0df2 }
            goto L_0x0039
        L_0x014c:
            boolean r0 = r14 instanceof X.C36271yy
            if (r0 == 0) goto L_0x0170
            r1 = 0
            X.C18270x1.A10(r9, r1, r15)
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r3 = X.AnonymousClass001.A0n(r0, r1)
            r2 = 0
            if (r3 == 0) goto L_0x016f
            r1 = 1
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            if (r0 == 0) goto L_0x016f
            X.1ns r2 = new X.1ns
            r2.<init>(r9, r10)
            r2.A01 = r3
            r2.A00 = r0
        L_0x016f:
            return r2
        L_0x0170:
            boolean r0 = r14 instanceof X.C36491zK
            if (r0 == 0) goto L_0x017e
            r0 = 0
            X.C162457s7.A0J(r9, r0)
            X.1na r0 = new X.1na
            r0.<init>(r9, r10)
            return r0
        L_0x017e:
            boolean r0 = r14 instanceof X.C36261yx
            if (r0 == 0) goto L_0x01cb
            int r1 = X.C18310x6.A05(r15)
            r0 = 3
            r7 = 0
            if (r1 == r0) goto L_0x0190
            java.lang.String r0 = "ScheduledCallStartWebQuery/restoreFMessage wrong number of parameters"
        L_0x018c:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x018f:
            return r7
        L_0x0190:
            X.1o5 r5 = new X.1o5
            r5.<init>(r9, r10)
            java.lang.String r2 = X.C36551zQ.A09(r15)
            r1 = 1
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r6 = X.AnonymousClass001.A0n(r0, r1)
            r1 = 2
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r4 = X.AnonymousClass001.A0n(r0, r1)
            boolean r0 = X.C107575bX.A0F(r2)
            if (r0 != 0) goto L_0x01c8
            boolean r0 = X.C107575bX.A0F(r6)
            if (r0 != 0) goto L_0x01c8
            boolean r0 = X.C107575bX.A0F(r4)
            if (r0 != 0) goto L_0x01c8
            long r2 = java.lang.Long.parseLong(r2)
            long r0 = java.lang.Long.parseLong(r6)
            r5.A01 = r2
            r5.A00 = r0
            r5.A02 = r4
            return r5
        L_0x01c8:
            java.lang.String r0 = "ScheduledCallStartWebQuery/restoreFMessage one of the parameters is invalid"
            goto L_0x018c
        L_0x01cb:
            boolean r0 = r14 instanceof X.C36451zG
            if (r0 == 0) goto L_0x025e
            r2 = r14
            X.1zG r2 = (X.C36451zG) r2
            X.4G5 r0 = r2.A02
            X.34x r7 = r0.B0j(r9, r10)
            X.1mS r7 = (X.C30441mS) r7
            int r0 = r15.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x01e3
            X.C36481zJ.A0A(r15, r7)
        L_0x01e3:
            r0 = 5
            r7.A1G(r0)
            r7.A0J = r10
            long r0 = r15.revokeMessageTimestamp_
            r7.A00 = r0
            byte r3 = r7.A1I
            r1 = 64
            int r0 = X.C18310x6.A05(r15)
            if (r3 != r1) goto L_0x023c
            r4 = 1
            if (r0 <= r4) goto L_0x0215
            r1 = 0
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r1 = X.AnonymousClass001.A0n(r0, r1)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0209
            r7.A01 = r1
        L_0x0209:
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A06(r15, r4)
            if (r1 == 0) goto L_0x0225
            r0 = r7
            X.1nV r0 = (X.C30961nV) r0
            r0.A1v(r1)
        L_0x0215:
            X.3PL r0 = r2.A00
            r0.A01(r15, r7)
            int r0 = r15.bitField1_
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x018f
            long r0 = r15.newsletterServerId_
            r7.A1M = r0
            return r7
        L_0x0225:
            X.2qk r3 = r2.A0I
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "build="
            r1.append(r0)
            java.lang.String r0 = "beta"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r0 = "RevokedWebQuery/nullAdminJid"
            r3.A0A(r0, r4, r1)
            goto L_0x0215
        L_0x023c:
            if (r0 <= 0) goto L_0x0248
            r1 = 0
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
        L_0x0245:
            r7.A01 = r0
            goto L_0x0215
        L_0x0248:
            X.2Yi r0 = r2.A06
            X.35J r1 = r0.A01
            X.2z0 r0 = r7.A1J
            X.4uZ r0 = r0.A00
            X.2z0 r1 = X.AnonymousClass35J.A01(r0, r1)
            X.1nU r0 = new X.1nU
            r0.<init>((X.C624134x) r7, (X.AnonymousClass2z0) r1, (long) r10)
            X.2z0 r0 = r0.A1J
            java.lang.String r0 = r0.A01
            goto L_0x0245
        L_0x025e:
            boolean r0 = r14 instanceof X.C36251yw
            if (r0 == 0) goto L_0x02b1
            r4 = 0
            int r2 = X.C18300x5.A05(r9, r15, r4)
            int r1 = X.C18310x6.A05(r15)
            r0 = 3
            r6 = 0
            if (r1 != r0) goto L_0x011a
            X.1nx r3 = new X.1nx
            r3.<init>(r9, r10)
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r5 = X.AnonymousClass001.A0n(r0, r4)
            r1 = 1
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r4 = X.AnonymousClass001.A0n(r0, r1)
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r2 = X.AnonymousClass001.A0n(r0, r2)
            boolean r0 = X.C107575bX.A0F(r5)
            if (r0 != 0) goto L_0x011a
            boolean r0 = X.C107575bX.A0F(r4)
            if (r0 != 0) goto L_0x011a
            boolean r0 = X.C107575bX.A0F(r2)
            if (r0 != 0) goto L_0x011a
            X.C162457s7.A0H(r5)
            long r0 = java.lang.Long.parseLong(r5)
            r3.A00 = r0
            X.C162457s7.A0H(r4)
            long r0 = java.lang.Long.parseLong(r4)
            r3.A01 = r0
            X.C18280x3.A12(r2)
            r3.A02 = r2
            return r3
        L_0x02b1:
            boolean r0 = r14 instanceof X.C36241yv
            if (r0 == 0) goto L_0x02d0
            r3 = 0
            X.C18270x1.A10(r9, r3, r15)
            X.1nn r2 = new X.1nn
            r2.<init>(r9, r10)
            int r0 = X.C18310x6.A05(r15)
            if (r0 <= 0) goto L_0x016f
            X.32Y r1 = com.whatsapp.jid.UserJid.Companion
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r3)
            X.AnonymousClass32Y.A0B(r1, r2, r0)
            return r2
        L_0x02d0:
            boolean r0 = r14 instanceof X.C36391zA
            if (r0 == 0) goto L_0x030e
            X.23Q r0 = r15.A0M()
            int r1 = r0.ordinal()
            r0 = 54
            r2 = 40
            if (r1 == r0) goto L_0x02f5
            r0 = 55
            r2 = 41
            if (r1 == r0) goto L_0x02f5
            r0 = 56
            if (r1 == r0) goto L_0x02f3
            java.lang.String r0 = "PaymentWebQuery/restoreFMessage malformed WMI"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 0
        L_0x02f2:
            return r1
        L_0x02f3:
            r2 = 42
        L_0x02f5:
            X.1o9 r1 = new X.1o9
            r1.<init>(r9, r2, r10)
            int r0 = X.C18310x6.A05(r15)
            if (r0 <= 0) goto L_0x02f2
            java.lang.String r0 = X.C36551zQ.A09(r15)
            X.4uZ r0 = X.C18310x6.A0S(r0)
            if (r0 == 0) goto L_0x02f2
            r1.A1J(r0)
            return r1
        L_0x030e:
            boolean r0 = r14 instanceof X.C36231yu
            if (r0 == 0) goto L_0x0373
            X.23Q r0 = r15.A0M()
            int r2 = r0.ordinal()
            r1 = 178(0xb2, float:2.5E-43)
            r3 = 2
            r0 = 179(0xb3, float:2.51E-43)
            if (r2 == r1) goto L_0x036d
            if (r2 == r0) goto L_0x0367
            r0 = 180(0xb4, float:2.52E-43)
            if (r2 != r0) goto L_0x0dff
            X.1oi r2 = new X.1oi
            r2.<init>(r9, r10)
        L_0x032c:
            int r0 = X.C18310x6.A05(r15)
            boolean r0 = X.C18280x3.A1U(r0, r3)
            X.C626936e.A0C(r0)
            r1 = 0
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            int r0 = java.lang.Integer.parseInt(r0)
            r2.A00 = r0
            r1 = 1
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r2.A01 = r0
            int r0 = X.C18310x6.A05(r15)
            if (r0 <= r3) goto L_0x016f
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r3)
            X.4uZ r0 = X.C18310x6.A0S(r0)
            if (r0 == 0) goto L_0x0df9
            r2.A1J(r0)
            return r2
        L_0x0367:
            X.1oh r2 = new X.1oh
            r2.<init>(r9, r10)
            goto L_0x032c
        L_0x036d:
            X.1oj r2 = new X.1oj
            r2.<init>(r9, r10)
            goto L_0x032c
        L_0x0373:
            boolean r0 = r14 instanceof X.C36221yt
            if (r0 == 0) goto L_0x038f
            r2 = 0
            X.C18270x1.A10(r9, r2, r15)
            X.1nf r1 = new X.1nf
            r1.<init>(r9, r10)
            int r0 = X.C18310x6.A05(r15)
            if (r0 <= 0) goto L_0x02f2
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r2)
            r1.A0y = r0
            return r1
        L_0x038f:
            boolean r0 = r14 instanceof X.C36211ys
            if (r0 == 0) goto L_0x039d
            r0 = 0
            X.C162457s7.A0J(r9, r0)
            X.1ne r0 = new X.1ne
            r0.<init>(r9, r10)
            return r0
        L_0x039d:
            boolean r0 = r14 instanceof X.C36201yr
            if (r0 == 0) goto L_0x03c7
            X.C18260x0.A0P(r9, r15)
            X.1oR r5 = new X.1oR
            r5.<init>(r9, r10)
            X.32Y r4 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r15.participant_
            X.AnonymousClass32Y.A0B(r4, r5, r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            int r2 = X.C18310x6.A05(r15)
            r1 = 0
        L_0x03b9:
            if (r1 >= r2) goto L_0x0e06
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            X.AnonymousClass32Y.A0C(r4, r0, r3)
            int r1 = r1 + 1
            goto L_0x03b9
        L_0x03c7:
            boolean r0 = r14 instanceof X.C36191yq
            if (r0 == 0) goto L_0x0405
            X.1o6 r2 = new X.1o6
            r2.<init>(r9, r10)
            int r0 = X.C18310x6.A05(r15)
            r3 = 2
            boolean r0 = X.C18280x3.A1U(r0, r3)
            X.C626936e.A0C(r0)
            r1 = 0
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r2.A02 = r0
            r1 = 1
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            int r0 = java.lang.Integer.parseInt(r0)
            r2.A00 = r0
            int r0 = X.C18310x6.A05(r15)
            if (r0 <= r3) goto L_0x016f
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r3)
            r2.A01 = r0
            return r2
        L_0x0405:
            boolean r0 = r14 instanceof X.C36411zC
            if (r0 == 0) goto L_0x043a
            int r0 = X.C18310x6.A05(r15)
            r4 = 1
            boolean r0 = X.C18280x3.A1U(r0, r4)
            X.C626936e.A0C(r0)
            r1 = 0
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            X.1fJ r3 = X.AnonymousClass34R.A04(r0)
            X.1or r2 = new X.1or
            r2.<init>(r9, r10)
            int r1 = X.C18310x6.A05(r15)
            r0 = 2
            if (r1 < r0) goto L_0x0438
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r4)
        L_0x0432:
            if (r3 == 0) goto L_0x016f
            X.C30341mI.A00(r3, r2, r0)
            return r2
        L_0x0438:
            r0 = 0
            goto L_0x0432
        L_0x043a:
            boolean r0 = r14 instanceof X.C36381z9
            if (r0 == 0) goto L_0x0466
            r0 = 67
            X.1nv r1 = new X.1nv
            r1.<init>(r9, r0, r10)
            X.23Q r0 = r15.A0M()
            int r0 = r0.ordinal()
            switch(r0) {
                case 79: goto L_0x0454;
                case 81: goto L_0x0457;
                case 84: goto L_0x045a;
                case 86: goto L_0x045c;
                case 94: goto L_0x045f;
                case 96: goto L_0x0461;
                case 126: goto L_0x045f;
                case 127: goto L_0x045a;
                case 193: goto L_0x0463;
                default: goto L_0x0450;
            }
        L_0x0450:
            r0 = 0
        L_0x0451:
            r1.A00 = r0
            return r1
        L_0x0454:
            r0 = 9
            goto L_0x0451
        L_0x0457:
            r0 = 10
            goto L_0x0451
        L_0x045a:
            r0 = 7
            goto L_0x0451
        L_0x045c:
            r0 = 8
            goto L_0x0451
        L_0x045f:
            r0 = 5
            goto L_0x0451
        L_0x0461:
            r0 = 6
            goto L_0x0451
        L_0x0463:
            r0 = 17
            goto L_0x0451
        L_0x0466:
            boolean r0 = r14 instanceof X.C35851yI
            if (r0 == 0) goto L_0x0470
            X.1oP r0 = new X.1oP
            r0.<init>(r9, r10)
            return r0
        L_0x0470:
            boolean r0 = r14 instanceof X.C35841yH
            if (r0 == 0) goto L_0x047a
            X.1nj r0 = new X.1nj
            r0.<init>(r9, r10)
            return r0
        L_0x047a:
            boolean r0 = r14 instanceof X.C36181yp
            if (r0 == 0) goto L_0x04a3
            X.1oY r3 = new X.1oY
            r3.<init>(r9, r10)
            int r2 = X.C18310x6.A05(r15)
            r0 = 1
            r1 = 0
            if (r2 != r0) goto L_0x02f2
            java.lang.String r0 = X.C36551zQ.A09(r15)
            java.lang.String r0 = X.C31601oY.A01(r0)
            if (r0 == 0) goto L_0x02f2
            r3.A00 = r0
            java.lang.String r0 = r15.participant_
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A08(r0)
            if (r0 == 0) goto L_0x02f2
            r3.A1J(r0)
            return r3
        L_0x04a3:
            boolean r0 = r14 instanceof X.C36171yo
            if (r0 == 0) goto L_0x04f5
            int r1 = X.C18310x6.A05(r15)
            r0 = 2
            r2 = 0
            if (r1 != r0) goto L_0x016f
            java.lang.String r1 = X.C36551zQ.A09(r15)
            java.lang.String r0 = "on"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x04e9
            r3 = 84
        L_0x04be:
            r1 = 1
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r1 = X.AnonymousClass001.A0n(r0, r1)
            java.lang.String r0 = "admin"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04d6
            java.lang.String r0 = "regular"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x016f
        L_0x04d6:
            java.lang.String r0 = r15.participant_
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A08(r0)
            if (r0 == 0) goto L_0x016f
            X.1oT r2 = new X.1oT
            r2.<init>(r9, r3, r10)
            r2.A00 = r1
            r2.A1J(r0)
            return r2
        L_0x04e9:
            java.lang.String r0 = "off"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x016f
            r3 = 85
            goto L_0x04be
        L_0x04f5:
            boolean r0 = r14 instanceof X.C36161yn
            if (r0 == 0) goto L_0x052a
            r3 = 0
            X.C18270x1.A10(r9, r3, r15)
            int r1 = X.C18310x6.A05(r15)
            r0 = 1
            r2 = 0
            if (r1 != r0) goto L_0x016f
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r1 = X.AnonymousClass001.A0n(r0, r3)
            java.lang.String r0 = "on"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x051e
            r0 = 91
        L_0x0516:
            X.1p1 r2 = X.C31891p1.A02(r9, r0, r10)
            X.AnonymousClass32Y.A0D(r15, r2)
            return r2
        L_0x051e:
            java.lang.String r0 = "off"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x016f
            r0 = 92
            goto L_0x0516
        L_0x052a:
            boolean r0 = r14 instanceof X.C36371z8
            if (r0 == 0) goto L_0x05b2
            r2 = 0
            X.C18270x1.A10(r9, r2, r15)
            int r1 = X.C18310x6.A05(r15)
            r0 = 5
            r5 = 0
            if (r1 < r0) goto L_0x0f5c
            java.lang.String r0 = r15.participant_
            if (r0 == 0) goto L_0x05b0
            com.whatsapp.jid.Jid r3 = X.AnonymousClass32W.A00(r0)
            boolean r0 = r3 instanceof com.whatsapp.jid.UserJid
            if (r0 != 0) goto L_0x0547
            r3 = r5
        L_0x0547:
            X.4uZ r3 = (X.C95814uZ) r3
        L_0x0549:
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r2)
            if (r0 == 0) goto L_0x0f5c
            com.whatsapp.jid.Jid r4 = X.AnonymousClass32W.A00(r0)
            boolean r0 = r4 instanceof com.whatsapp.jid.GroupJid
            if (r0 != 0) goto L_0x055a
            r4 = r5
        L_0x055a:
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            if (r4 == 0) goto L_0x0f5c
            r1 = 1
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r1 = X.AnonymousClass001.A0n(r0, r1)
            java.lang.String r0 = ""
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 != 0) goto L_0x056e
            r5 = r1
        L_0x056e:
            r1 = 3
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            java.lang.String r6 = "true"
            boolean r2 = r0.equals(r6)
            r1 = 4
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            boolean r0 = r0.equals(r6)
            if (r2 == 0) goto L_0x05a2
            X.1oo r2 = new X.1oo
            r2.<init>(r9, r10)
        L_0x058e:
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            r0 = 1
            X.C52662lq.A00(r4, r5, r1, r0)
            java.util.List r0 = r2.A00
            r0.clear()
            r0.addAll(r1)
            r2.A1J(r3)
            return r2
        L_0x05a2:
            if (r0 == 0) goto L_0x05aa
            X.1op r2 = new X.1op
            r2.<init>(r9, r10)
            goto L_0x058e
        L_0x05aa:
            X.1oq r2 = new X.1oq
            r2.<init>(r9, r10)
            goto L_0x058e
        L_0x05b0:
            r3 = r5
            goto L_0x0549
        L_0x05b2:
            boolean r0 = r14 instanceof X.C36441zF
            if (r0 == 0) goto L_0x05dd
            r0 = 95
            X.1oV r2 = new X.1oV
            r2.<init>(r9, r0, r10)
            r0 = 2
            r2.A00 = r0
            java.lang.String r0 = r15.participant_
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A08(r0)
            r1 = 0
            if (r0 == 0) goto L_0x02f2
            r2.A1J(r0)
            int r0 = X.C18310x6.A05(r15)
            if (r0 <= 0) goto L_0x05da
            java.lang.String r0 = X.C36551zQ.A09(r15)
            X.1fJ r1 = X.AnonymousClass34R.A04(r0)
        L_0x05da:
            r2.A01 = r1
            return r2
        L_0x05dd:
            boolean r0 = r14 instanceof X.C36151ym
            if (r0 == 0) goto L_0x05f6
            int r1 = X.C18310x6.A05(r15)
            r3 = 0
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            X.C626936e.A0C(r0)
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r2 = X.AnonymousClass001.A0n(r0, r3)
            goto L_0x0e09
        L_0x05f6:
            boolean r0 = r14 instanceof X.C36501zL
            if (r0 == 0) goto L_0x0623
            r1 = 0
            X.C18270x1.A10(r9, r1, r15)
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r2 = X.AnonymousClass001.A0n(r0, r1)
            java.lang.String r0 = "on"
            boolean r0 = X.C162457s7.A0P(r2, r0)
            if (r0 == 0) goto L_0x0617
            r0 = 140(0x8c, float:1.96E-43)
        L_0x060f:
            X.1p1 r0 = X.C31891p1.A02(r9, r0, r10)
            X.AnonymousClass32Y.A0D(r15, r0)
            return r0
        L_0x0617:
            java.lang.String r0 = "off"
            boolean r0 = X.C162457s7.A0P(r2, r0)
            if (r0 == 0) goto L_0x0e48
            r0 = 141(0x8d, float:1.98E-43)
            goto L_0x060f
        L_0x0623:
            boolean r0 = r14 instanceof X.C36141yl
            if (r0 == 0) goto L_0x0658
            int r0 = X.C18310x6.A05(r15)
            boolean r0 = X.AnonymousClass001.A1T(r0)
            X.C626936e.A0C(r0)
            r1 = 0
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r1 = X.AnonymousClass001.A0n(r0, r1)
            java.lang.String r0 = "on"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x064c
            r0 = 53
        L_0x0644:
            X.1p1 r0 = X.C31891p1.A02(r9, r0, r10)
            X.C36481zJ.A0A(r15, r0)
            return r0
        L_0x064c:
            java.lang.String r0 = "off"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0e56
            r0 = 54
            goto L_0x0644
        L_0x0658:
            boolean r0 = r14 instanceof X.C36591zU
            if (r0 == 0) goto L_0x0685
            r1 = 0
            X.C18270x1.A10(r9, r1, r15)
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r2 = X.AnonymousClass001.A0n(r0, r1)
            java.lang.String r0 = "on"
            boolean r0 = X.C162457s7.A0P(r2, r0)
            if (r0 == 0) goto L_0x0679
            r0 = 150(0x96, float:2.1E-43)
        L_0x0671:
            X.1p1 r0 = X.C31891p1.A02(r9, r0, r10)
            X.AnonymousClass32Y.A0D(r15, r0)
            return r0
        L_0x0679:
            java.lang.String r0 = "off"
            boolean r0 = X.C162457s7.A0P(r2, r0)
            if (r0 == 0) goto L_0x0e5c
            r0 = 151(0x97, float:2.12E-43)
            goto L_0x0671
        L_0x0685:
            boolean r0 = r14 instanceof X.C36571zS
            if (r0 == 0) goto L_0x06ba
            int r0 = X.C18310x6.A05(r15)
            boolean r0 = X.AnonymousClass001.A1T(r0)
            X.C626936e.A0C(r0)
            r1 = 0
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r1 = X.AnonymousClass001.A0n(r0, r1)
            java.lang.String r0 = "on"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x06ae
            r0 = 31
        L_0x06a6:
            X.1p1 r0 = X.C31891p1.A02(r9, r0, r10)
            X.C36481zJ.A0A(r15, r0)
            return r0
        L_0x06ae:
            java.lang.String r0 = "off"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0e6a
            r0 = 32
            goto L_0x06a6
        L_0x06ba:
            boolean r0 = r14 instanceof X.C36581zT
            if (r0 == 0) goto L_0x06e7
            r1 = 0
            X.C18270x1.A10(r9, r1, r15)
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r2 = X.AnonymousClass001.A0n(r0, r1)
            java.lang.String r0 = "on"
            boolean r0 = X.C162457s7.A0P(r2, r0)
            if (r0 == 0) goto L_0x06db
            r0 = 137(0x89, float:1.92E-43)
        L_0x06d3:
            X.1p1 r0 = X.C31891p1.A02(r9, r0, r10)
            X.AnonymousClass32Y.A0D(r15, r0)
            return r0
        L_0x06db:
            java.lang.String r0 = "off"
            boolean r0 = X.C162457s7.A0P(r2, r0)
            if (r0 == 0) goto L_0x0e71
            r0 = 138(0x8a, float:1.93E-43)
            goto L_0x06d3
        L_0x06e7:
            boolean r0 = r14 instanceof X.C35831yG
            if (r0 == 0) goto L_0x06f2
            r0 = 33
            X.1p1 r0 = X.C31891p1.A02(r9, r0, r10)
            return r0
        L_0x06f2:
            boolean r0 = r14 instanceof X.C36461zH
            if (r0 == 0) goto L_0x0725
            X.1mJ r2 = new X.1mJ
            r2.<init>(r9, r10)
            int r0 = r15.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0704
            X.C36481zJ.A0A(r15, r2)
        L_0x0704:
            int r1 = r15.bitField0_
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0714
            X.8Lq r0 = r15.futureproofData_
            byte[] r0 = r0.A07()
            r2.A1j(r0)
        L_0x0714:
            int r0 = X.C18310x6.A05(r15)
            if (r0 <= 0) goto L_0x016f
            java.lang.String r0 = X.C36551zQ.A09(r15)
            int r0 = java.lang.Integer.parseInt(r0)
            r2.A01 = r0
            return r2
        L_0x0725:
            boolean r0 = r14 instanceof X.C36131yk
            if (r0 == 0) goto L_0x0747
            X.1nz r2 = new X.1nz
            r2.<init>(r9, r10)
            int r0 = X.C18310x6.A05(r15)
            boolean r0 = X.AnonymousClass001.A1W(r0)
            X.C626936e.A0C(r0)
            r1 = 0
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            int r0 = java.lang.Integer.parseInt(r0)
            r2.A00 = r0
            return r2
        L_0x0747:
            boolean r0 = r14 instanceof X.C36121yj
            if (r0 == 0) goto L_0x076a
            X.1ni r2 = new X.1ni
            r2.<init>(r9, r10)
            int r1 = X.C18310x6.A05(r15)
            r0 = 1
            if (r1 <= r0) goto L_0x0768
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass32Y.A06(r15, r0)
            if (r3 != 0) goto L_0x0764
        L_0x075d:
            X.4uZ r0 = r9.A00
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
        L_0x0761:
            X.C626936e.A0C(r0)
        L_0x0764:
            r2.A1J(r3)
            return r2
        L_0x0768:
            r3 = 0
            goto L_0x075d
        L_0x076a:
            boolean r0 = r14 instanceof X.C36111yi
            if (r0 == 0) goto L_0x077c
            X.1ng r1 = new X.1ng
            r1.<init>(r9, r10)
            r0 = 0
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A06(r15, r0)
            r1.A1J(r0)
            return r1
        L_0x077c:
            boolean r0 = r14 instanceof X.C36101yh
            if (r0 == 0) goto L_0x07a8
            X.1o3 r2 = new X.1o3
            r2.<init>(r9, r10)
            r0 = 0
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A06(r15, r0)
            r2.A1J(r0)
            r1 = 1
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            int r0 = java.lang.Integer.parseInt(r0)
            r2.A00 = r0
            r1 = 2
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            int r0 = java.lang.Integer.parseInt(r0)
            r2.A01 = r0
            return r2
        L_0x07a8:
            boolean r0 = r14 instanceof X.C36091yg
            if (r0 == 0) goto L_0x07cc
            r0 = 81
            X.1p1 r3 = X.C31891p1.A02(r9, r0, r10)
            java.lang.String r0 = r15.participant_
            X.32Y r2 = com.whatsapp.jid.UserJid.Companion
            X.AnonymousClass32Y.A0B(r2, r3, r0)
            X.8ya r0 = r15.messageStubParameters_
            java.util.ArrayList r4 = X.AnonymousClass000.A0p(r0)
            r1 = 0
        L_0x07c0:
            int r0 = X.C18310x6.A05(r15)
            if (r1 >= r0) goto L_0x0fcb
            A0C(r2, r15, r4, r1)
            int r1 = r1 + 1
            goto L_0x07c0
        L_0x07cc:
            boolean r0 = r14 instanceof X.C36081yf
            if (r0 == 0) goto L_0x07fd
            r0 = 82
            X.1p1 r3 = X.C31891p1.A02(r9, r0, r10)
            java.lang.String r0 = r15.participant_
            X.32Y r2 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r0 = r2.A0E(r0)
            X.C626936e.A06(r0)
            r3.A1J(r0)
            X.8ya r0 = r15.messageStubParameters_
            java.util.ArrayList r4 = X.AnonymousClass000.A0p(r0)
            r1 = 0
        L_0x07eb:
            int r0 = X.C18310x6.A05(r15)
            if (r1 >= r0) goto L_0x0fcb
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            X.AnonymousClass32Y.A0C(r2, r0, r4)
            int r1 = r1 + 1
            goto L_0x07eb
        L_0x07fd:
            boolean r0 = r14 instanceof X.C36071ye
            if (r0 == 0) goto L_0x0812
            X.1o2 r7 = new X.1o2
            r7.<init>(r9, r10)
            X.23Q r2 = r15.A0M()
            X.23Q r0 = X.AnonymousClass23Q.A05
            r1 = 1
            if (r2 != r0) goto L_0x0e7f
            r7.A01 = r1
            return r7
        L_0x0812:
            boolean r0 = r14 instanceof X.C36061yd
            if (r0 == 0) goto L_0x0854
            int r0 = X.C18310x6.A05(r15)
            r4 = 1
            boolean r0 = X.AnonymousClass001.A1W(r0)
            X.C626936e.A0C(r0)
            r1 = 0
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            int r3 = java.lang.Integer.parseInt(r0)
            X.4uZ r1 = r9.A00
            boolean r0 = r1 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x084c
            X.1oX r2 = new X.1oX
            r2.<init>(r9, r10)
            r2.A00 = r3
        L_0x083a:
            int r0 = X.C18310x6.A05(r15)
            if (r0 <= r4) goto L_0x084a
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass32Y.A06(r15, r4)
            if (r3 != 0) goto L_0x0764
        L_0x0846:
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            goto L_0x0761
        L_0x084a:
            r3 = 0
            goto L_0x0846
        L_0x084c:
            X.1nr r2 = new X.1nr
            r2.<init>(r9, r10)
            r2.A00 = r3
            goto L_0x083a
        L_0x0854:
            boolean r0 = r14 instanceof X.C36361z7
            if (r0 == 0) goto L_0x0891
            r4 = r14
            X.1z7 r4 = (X.C36361z7) r4
            X.1nq r2 = new X.1nq
            r2.<init>(r9, r10)
            int r0 = X.C18310x6.A05(r15)
            r3 = 1
            boolean r0 = X.AnonymousClass001.A1W(r0)
            X.C626936e.A0C(r0)
            r1 = 0
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            int r0 = java.lang.Integer.parseInt(r0)
            r2.A00 = r0
            int r0 = X.C18310x6.A05(r15)
            if (r0 <= r3) goto L_0x0e98
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A06(r15, r3)
            if (r1 == 0) goto L_0x0e98
            X.2sr r0 = r4.A00
            boolean r0 = r0.A0a(r1)
            if (r0 != 0) goto L_0x0e98
            r0 = 2
            r2.A00 = r0
            return r2
        L_0x0891:
            boolean r0 = r14 instanceof X.C36541zP
            if (r0 == 0) goto L_0x08c0
            r0 = r14
            X.1zP r0 = (X.C36541zP) r0
            r2 = 0
            X.C18270x1.A10(r9, r2, r15)
            boolean r0 = r0 instanceof X.C36531zO
            if (r0 == 0) goto L_0x08b9
            r0 = 27
            X.1p1 r1 = X.C31891p1.A02(r9, r0, r10)
        L_0x08a6:
            X.AnonymousClass32Y.A0D(r15, r1)
            int r0 = X.C18310x6.A05(r15)
            if (r0 <= 0) goto L_0x02f2
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r2)
        L_0x08b5:
            r1.A1Z(r0)
            return r1
        L_0x08b9:
            r0 = 131(0x83, float:1.84E-43)
            X.1p1 r1 = X.C31891p1.A02(r9, r0, r10)
            goto L_0x08a6
        L_0x08c0:
            boolean r0 = r14 instanceof X.C36051yc
            if (r0 == 0) goto L_0x08f0
            X.1mr r7 = new X.1mr
            r7.<init>(r9, r10)
            int r0 = r15.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x08d2
            X.C36481zJ.A0A(r15, r7)
        L_0x08d2:
            X.23Q r2 = r15.A0M()
            int r0 = r2.ordinal()
            switch(r0) {
                case 40: goto L_0x0d7b;
                case 41: goto L_0x0d7d;
                case 45: goto L_0x0d7f;
                case 46: goto L_0x0d81;
                case 169: goto L_0x0d7b;
                case 170: goto L_0x0d7d;
                default: goto L_0x08dd;
            }
        L_0x08dd:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "unexpected missed stub type "
            r1.append(r0)
            java.lang.String r0 = r2.name()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r1)
            throw r0
        L_0x08f0:
            boolean r0 = r14 instanceof X.C36041yb
            if (r0 == 0) goto L_0x0916
            r0 = 69
            X.1o1 r4 = new X.1o1
            r4.<init>(r9, r0, r10)
            X.23Q r0 = r15.A0M()
            int r3 = r0.ordinal()
            r2 = 2
            r1 = 129(0x81, float:1.81E-43)
            r0 = 128(0x80, float:1.794E-43)
            if (r3 == r0) goto L_0x0913
            r2 = 3
            r0 = 194(0xc2, float:2.72E-43)
            if (r3 == r1) goto L_0x0913
            r2 = 4
            if (r3 == r0) goto L_0x0913
            r2 = 1
        L_0x0913:
            r4.A00 = r2
            return r4
        L_0x0916:
            boolean r0 = r14 instanceof X.C36031ya
            if (r0 == 0) goto L_0x0932
            r0 = 61
            X.1o1 r1 = new X.1o1
            r1.<init>(r9, r0, r10)
            X.23Q r0 = r15.A0M()
            int r0 = r0.ordinal()
            switch(r0) {
                case 76: goto L_0x0eda;
                case 77: goto L_0x0edd;
                case 78: goto L_0x0ed7;
                case 79: goto L_0x092c;
                case 80: goto L_0x0ea2;
                case 81: goto L_0x092c;
                case 82: goto L_0x0ea4;
                case 83: goto L_0x0ee9;
                case 84: goto L_0x092c;
                case 85: goto L_0x0ea6;
                case 86: goto L_0x092c;
                case 87: goto L_0x0ea8;
                case 88: goto L_0x0efb;
                case 89: goto L_0x0ef8;
                case 90: goto L_0x0ef5;
                case 91: goto L_0x0ef2;
                case 92: goto L_0x0ee3;
                case 93: goto L_0x0ee0;
                case 94: goto L_0x092c;
                case 95: goto L_0x0eaa;
                case 96: goto L_0x092c;
                case 97: goto L_0x0eac;
                case 98: goto L_0x0ee6;
                case 99: goto L_0x092c;
                case 100: goto L_0x092c;
                case 101: goto L_0x0eec;
                case 102: goto L_0x0efe;
                case 103: goto L_0x0eef;
                case 104: goto L_0x0ec2;
                case 105: goto L_0x0ece;
                case 106: goto L_0x0ec8;
                case 107: goto L_0x0ec5;
                case 108: goto L_0x0ebf;
                case 109: goto L_0x0eb6;
                case 110: goto L_0x0eb0;
                case 111: goto L_0x0eae;
                case 112: goto L_0x0ed4;
                case 113: goto L_0x0ecb;
                case 114: goto L_0x0ebc;
                case 115: goto L_0x0eb3;
                case 116: goto L_0x0ed1;
                case 117: goto L_0x0eb9;
                default: goto L_0x092c;
            }
        L_0x092c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0932:
            boolean r0 = r14 instanceof X.C36021yZ
            if (r0 == 0) goto L_0x0989
            X.23Q r0 = r15.A0M()
            int r0 = r0.ordinal()
            switch(r0) {
                case 4: goto L_0x096b;
                case 5: goto L_0x0965;
                case 6: goto L_0x0968;
                case 7: goto L_0x0962;
                case 8: goto L_0x095f;
                case 16: goto L_0x0971;
                case 17: goto L_0x0974;
                case 18: goto L_0x096e;
                case 60: goto L_0x0980;
                case 61: goto L_0x097a;
                case 64: goto L_0x0986;
                case 65: goto L_0x0983;
                case 99: goto L_0x097d;
                case 100: goto L_0x0977;
                default: goto L_0x0941;
            }
        L_0x0941:
            r3 = 0
        L_0x0942:
            r1 = 1
            boolean r0 = X.AnonymousClass000.A1S(r3)
            X.C626936e.A0C(r0)
            X.1nu r2 = new X.1nu
            r2.<init>(r9, r3, r10)
            int r0 = X.C18310x6.A05(r15)
            if (r0 != r1) goto L_0x016f
            r1 = 0
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            r2.A00 = r0
            return r2
        L_0x095f:
            r3 = 23
            goto L_0x0942
        L_0x0962:
            r3 = 22
            goto L_0x0942
        L_0x0965:
            r3 = 25
            goto L_0x0942
        L_0x0968:
            r3 = 24
            goto L_0x0942
        L_0x096b:
            r3 = 26
            goto L_0x0942
        L_0x096e:
            r3 = 34
            goto L_0x0942
        L_0x0971:
            r3 = 35
            goto L_0x0942
        L_0x0974:
            r3 = 36
            goto L_0x0942
        L_0x0977:
            r3 = 47
            goto L_0x0942
        L_0x097a:
            r3 = 48
            goto L_0x0942
        L_0x097d:
            r3 = 46
            goto L_0x0942
        L_0x0980:
            r3 = 49
            goto L_0x0942
        L_0x0983:
            r3 = 50
            goto L_0x0942
        L_0x0986:
            r3 = 55
            goto L_0x0942
        L_0x0989:
            boolean r0 = r14 instanceof X.C36011yY
            if (r0 == 0) goto L_0x09ae
            X.23Q r0 = r15.A0M()
            int r3 = r0.ordinal()
            r2 = 1
            r0 = 75
            if (r3 == r0) goto L_0x09ab
            r0 = 118(0x76, float:1.65E-43)
            r1 = 63
            if (r3 == r0) goto L_0x09a2
            r1 = 0
            r2 = 0
        L_0x09a2:
            X.C626936e.A0C(r2)
            X.1mI r0 = new X.1mI
            r0.<init>(r9, r1, r10)
            return r0
        L_0x09ab:
            r1 = 62
            goto L_0x09a2
        L_0x09ae:
            boolean r0 = r14 instanceof X.C36001yX
            if (r0 == 0) goto L_0x09c7
            X.C18260x0.A0P(r9, r15)
            X.23Q r2 = r15.A0M()
            X.23Q r0 = X.AnonymousClass23Q.BIZ_BOT_1P_MESSAGING_ENABLED
            r1 = 155(0x9b, float:2.17E-43)
            if (r2 != r0) goto L_0x09c1
            r1 = 147(0x93, float:2.06E-43)
        L_0x09c1:
            X.1np r0 = new X.1np
            r0.<init>(r9, r1, r10)
            return r0
        L_0x09c7:
            boolean r0 = r14 instanceof X.C35991yW
            if (r0 == 0) goto L_0x09e9
            X.1ny r2 = new X.1ny
            r2.<init>(r9, r10)
            int r0 = X.C18310x6.A05(r15)
            boolean r0 = X.AnonymousClass001.A1T(r0)
            X.C626936e.A0C(r0)
            r1 = 0
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r2.A00 = r0
            return r2
        L_0x09e9:
            boolean r0 = r14 instanceof X.C35981yV
            if (r0 == 0) goto L_0x0a0e
            r0 = 18
            X.1mI r2 = new X.1mI
            r2.<init>(r9, r0, r10)
            java.lang.String r0 = X.C36551zQ.A09(r15)
            X.4uZ r1 = X.C18310x6.A0S(r0)
            if (r1 == 0) goto L_0x016f
            X.4uZ r0 = r9.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x016f
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A03(r1)
            r2.A1J(r0)
            return r2
        L_0x0a0e:
            boolean r0 = r14 instanceof X.C35971yU
            if (r0 == 0) goto L_0x0a32
            r0 = 15
            X.1p1 r3 = X.C31891p1.A02(r9, r0, r10)
            java.lang.String r0 = r15.participant_
            X.32Y r2 = com.whatsapp.jid.UserJid.Companion
            X.AnonymousClass32Y.A0B(r2, r3, r0)
            X.8ya r0 = r15.messageStubParameters_
            java.util.ArrayList r4 = X.AnonymousClass000.A0p(r0)
            r1 = 0
        L_0x0a26:
            int r0 = X.C18310x6.A05(r15)
            if (r1 >= r0) goto L_0x0fcb
            A0C(r2, r15, r4, r1)
            int r1 = r1 + 1
            goto L_0x0a26
        L_0x0a32:
            boolean r0 = r14 instanceof X.C35961yT
            if (r0 == 0) goto L_0x0a63
            r0 = 16
            X.1p1 r3 = X.C31891p1.A02(r9, r0, r10)
            java.lang.String r0 = r15.participant_
            X.32Y r2 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r0 = r2.A0E(r0)
            X.C626936e.A06(r0)
            r3.A1J(r0)
            X.8ya r0 = r15.messageStubParameters_
            java.util.ArrayList r4 = X.AnonymousClass000.A0p(r0)
            r1 = 0
        L_0x0a51:
            int r0 = X.C18310x6.A05(r15)
            if (r1 >= r0) goto L_0x0fcb
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            X.AnonymousClass32Y.A0C(r2, r0, r4)
            int r1 = r1 + 1
            goto L_0x0a51
        L_0x0a63:
            boolean r0 = r14 instanceof X.C35951yS
            if (r0 == 0) goto L_0x0a86
            X.1oZ r2 = new X.1oZ
            r2.<init>(r9, r10)
            java.lang.String r0 = X.C36551zQ.A09(r15)
            r2.A1y(r0)
            int r0 = X.C18310x6.A05(r15)
            r1 = 1
            if (r0 <= r1) goto L_0x0a82
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            r2.A01 = r0
        L_0x0a82:
            X.C36481zJ.A0A(r15, r2)
            return r2
        L_0x0a86:
            boolean r0 = r14 instanceof X.C35941yR
            if (r0 == 0) goto L_0x0aca
            java.lang.String r0 = r15.participant_
            X.32Y r3 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r2 = r3.A0E(r0)
            r1 = 7
            r0 = 14
            if (r2 != 0) goto L_0x0a98
            r0 = 7
        L_0x0a98:
            X.1p1 r7 = X.C31891p1.A02(r9, r0, r10)
            r2 = 0
            if (r0 != r1) goto L_0x0ac4
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r2)
            X.AnonymousClass32Y.A0B(r3, r7, r0)
            r2 = 1
        L_0x0aa9:
            int r0 = X.C18310x6.A05(r15)
            if (r0 <= r2) goto L_0x018f
            int r0 = X.C18310x6.A05(r15)
            int r0 = r0 - r2
            java.util.ArrayList r1 = X.AnonymousClass002.A0I(r0)
        L_0x0ab8:
            int r0 = X.C18310x6.A05(r15)
            if (r2 >= r0) goto L_0x0f09
            A0C(r3, r15, r1, r2)
            int r2 = r2 + 1
            goto L_0x0ab8
        L_0x0ac4:
            java.lang.String r0 = r15.participant_
            X.AnonymousClass32Y.A0B(r3, r7, r0)
            goto L_0x0aa9
        L_0x0aca:
            boolean r0 = r14 instanceof X.C36351z6
            if (r0 == 0) goto L_0x0b03
            r4 = r14
            X.1z6 r4 = (X.C36351z6) r4
            r0 = 10
            X.1o8 r3 = new X.1o8
            r3.<init>(r9, r0, r10)
            X.2qk r0 = r4.A0I
            r3.A03 = r0
            java.lang.String r0 = r15.participant_
            X.32Y r1 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r0 = r1.A0E(r0)
            r2 = 0
            if (r0 == 0) goto L_0x016f
            r3.A01 = r0
            java.lang.String r0 = X.C36551zQ.A09(r15)
            com.whatsapp.jid.UserJid r1 = r1.A0E(r0)
            boolean r0 = r1 instanceof X.C27981fH
            if (r0 == 0) goto L_0x0f0c
            X.2sM r0 = r4.A00
            com.whatsapp.jid.PhoneUserJid r1 = X.C56662sM.A00(r0, r1)
            if (r1 != 0) goto L_0x0f0f
            java.lang.String r0 = "GroupParticipantChangedNumberWebQuery/restoreFMessage/LID -> PN mapping unknown"
        L_0x0aff:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r2
        L_0x0b03:
            boolean r0 = r14 instanceof X.C36341z5
            if (r0 == 0) goto L_0x0b1a
            r4 = r14
            X.1z5 r4 = (X.C36341z5) r4
            r0 = 9
            X.1p1 r5 = X.C31891p1.A02(r9, r0, r10)
            java.lang.String r0 = r15.participant_
            X.32Y r3 = com.whatsapp.jid.UserJid.Companion
            X.AnonymousClass32Y.A0B(r3, r5, r0)
            r6 = 0
            goto L_0x0f13
        L_0x0b1a:
            boolean r0 = r14 instanceof X.C35931yQ
            if (r0 == 0) goto L_0x0b36
            int r0 = X.C18310x6.A05(r15)
            r3 = 0
            r1 = 1
            if (r0 != r1) goto L_0x0f5d
            r0 = 5
            X.1p1 r7 = X.C31891p1.A02(r9, r0, r10)
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A06(r15, r3)
            X.C626936e.A06(r0)
            r7.A1J(r0)
            return r7
        L_0x0b36:
            boolean r0 = r14 instanceof X.C35921yP
            if (r0 == 0) goto L_0x0b60
            r0 = 52
            X.1p1 r3 = X.C31891p1.A02(r9, r0, r10)
            java.lang.String r0 = r15.participant_
            X.32Y r2 = com.whatsapp.jid.UserJid.Companion
            X.AnonymousClass32Y.A0B(r2, r3, r0)
            X.8ya r0 = r15.messageStubParameters_
            java.util.ArrayList r4 = X.AnonymousClass000.A0p(r0)
            r1 = 0
        L_0x0b4e:
            int r0 = X.C18310x6.A05(r15)
            if (r1 >= r0) goto L_0x0fcb
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            X.AnonymousClass32Y.A0C(r2, r0, r4)
            int r1 = r1 + 1
            goto L_0x0b4e
        L_0x0b60:
            boolean r0 = r14 instanceof X.C36551zQ
            if (r0 == 0) goto L_0x0c2e
            r3 = r14
            X.1zQ r3 = (X.C36551zQ) r3
            boolean r0 = r3 instanceof X.C27451dq
            if (r0 == 0) goto L_0x0b9f
            r0 = 0
            X.C162457s7.A0J(r9, r0)
            X.1ox r2 = new X.1ox
            r2.<init>(r9, r10)
        L_0x0b74:
            java.lang.String r0 = r15.participant_
            X.4uZ r0 = X.C18310x6.A0S(r0)
            r2.A1J(r0)
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            boolean r0 = r3 instanceof X.C27471ds
            if (r0 == 0) goto L_0x0f8a
            java.util.HashSet r6 = X.AnonymousClass002.A0K()
            int r4 = X.C18310x6.A05(r15)
            r1 = 3
        L_0x0b8e:
            if (r1 >= r4) goto L_0x0fa5
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            X.C162457s7.A0D(r0)
            r6.add(r0)
            int r1 = r1 + 1
            goto L_0x0b8e
        L_0x0b9f:
            boolean r0 = r3 instanceof X.C27471ds
            if (r0 == 0) goto L_0x0be4
            r6 = r3
            X.1ds r6 = (X.C27471ds) r6
            r1 = 0
            int r7 = X.C18300x5.A05(r9, r15, r1)
            X.1ox r2 = new X.1ox
            r2.<init>(r9, r10)
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r1 = X.AnonymousClass001.A0n(r0, r1)
            r5 = 1
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r5)
            X.1fJ r1 = X.AnonymousClass34R.A04(r1)
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            if (r1 == 0) goto L_0x0bdb
            X.C52662lq.A00(r1, r0, r4, r7)
            X.2zh r0 = r6.A01
            X.1fJ r1 = r0.A02(r1)
            if (r1 == 0) goto L_0x0bdb
            X.2ss r0 = r6.A00
            java.lang.String r0 = r0.A0D(r1)
            X.C52662lq.A00(r1, r0, r4, r5)
        L_0x0bdb:
            java.util.List r0 = r2.A00
            r0.clear()
            r0.addAll(r4)
            goto L_0x0b74
        L_0x0be4:
            boolean r0 = r3 instanceof X.C27461dr
            if (r0 == 0) goto L_0x0c0d
            java.lang.String r4 = X.C36551zQ.A09(r15)
            int r0 = X.C18310x6.A05(r15)
            r1 = 1
            if (r0 <= r1) goto L_0x0c0b
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r1 = X.AnonymousClass001.A0n(r0, r1)
        L_0x0bf9:
            X.1os r2 = new X.1os
            r2.<init>(r9, r10)
            X.32V r0 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r0 = r0.A03(r4)
            if (r0 == 0) goto L_0x0b74
            X.C30341mI.A00(r0, r2, r1)
            goto L_0x0b74
        L_0x0c0b:
            r1 = 0
            goto L_0x0bf9
        L_0x0c0d:
            boolean r0 = r3 instanceof X.C27441dp
            if (r0 == 0) goto L_0x0c19
            r0 = 20
            X.1p1 r2 = X.C31891p1.A02(r9, r0, r10)
            goto L_0x0b74
        L_0x0c19:
            boolean r0 = r3 instanceof X.C27431do
            if (r0 == 0) goto L_0x0c25
            r0 = 79
            X.1p1 r2 = X.C31891p1.A02(r9, r0, r10)
            goto L_0x0b74
        L_0x0c25:
            r0 = 90
            X.1oU r2 = new X.1oU
            r2.<init>(r9, r0, r10)
            goto L_0x0b74
        L_0x0c2e:
            boolean r0 = r14 instanceof X.C35911yO
            if (r0 == 0) goto L_0x0c58
            r0 = 51
            X.1p1 r3 = X.C31891p1.A02(r9, r0, r10)
            java.lang.String r0 = r15.participant_
            X.32Y r2 = com.whatsapp.jid.UserJid.Companion
            X.AnonymousClass32Y.A0B(r2, r3, r0)
            X.8ya r0 = r15.messageStubParameters_
            java.util.ArrayList r4 = X.AnonymousClass000.A0p(r0)
            r1 = 0
        L_0x0c46:
            int r0 = X.C18310x6.A05(r15)
            if (r1 >= r0) goto L_0x0fcb
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            X.AnonymousClass32Y.A0C(r2, r0, r4)
            int r1 = r1 + 1
            goto L_0x0c46
        L_0x0c58:
            boolean r0 = r14 instanceof X.C35901yN
            if (r0 == 0) goto L_0x0c66
            r0 = 21
            X.1p1 r0 = X.C31891p1.A02(r9, r0, r10)
            X.C36481zJ.A0A(r15, r0)
            return r0
        L_0x0c66:
            boolean r0 = r14 instanceof X.C36331z4
            if (r0 == 0) goto L_0x0c8b
            int r0 = X.C18310x6.A05(r15)
            boolean r0 = X.AnonymousClass001.A1T(r0)
            X.C626936e.A0C(r0)
            r1 = 0
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            boolean r1 = java.lang.Boolean.parseBoolean(r0)
            r0 = 74
            if (r1 == 0) goto L_0x0c86
            r0 = 73
        L_0x0c86:
            X.1p1 r0 = X.C31891p1.A02(r9, r0, r10)
            return r0
        L_0x0c8b:
            boolean r0 = r14 instanceof X.C35891yM
            if (r0 == 0) goto L_0x0cf2
            X.1o7 r1 = new X.1o7
            r1.<init>(r9, r10)
            X.C36481zJ.A0A(r15, r1)
            r3 = 0
            r1.A1Z(r3)
            r4 = 0
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r2 = X.AnonymousClass001.A0n(r0, r4)
            java.lang.String r0 = "remove"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0cee
            r1.A1x(r3)
        L_0x0cae:
            int r2 = r15.bitField0_
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x02f2
            X.1CV r3 = r15.photoChange_
            if (r3 != 0) goto L_0x0cbb
            X.1CV r3 = X.AnonymousClass1CV.DEFAULT_INSTANCE
        L_0x0cbb:
            com.whatsapp.data.ProfilePhotoChange r2 = new com.whatsapp.data.ProfilePhotoChange
            r2.<init>()
            int r0 = r3.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0ccf
            X.8Lq r0 = r3.newPhoto_
            byte[] r0 = r0.A07()
            r2.newPhoto = r0
            r4 = 1
        L_0x0ccf:
            int r0 = r3.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0cde
            X.8Lq r0 = r3.oldPhoto_
            byte[] r0 = r0.A07()
            r2.oldPhoto = r0
            r4 = 1
        L_0x0cde:
            int r0 = r3.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0ceb
            int r0 = r3.newPhotoId_
            r2.newPhotoId = r0
        L_0x0ce8:
            r1.A00 = r2
            return r1
        L_0x0ceb:
            if (r4 == 0) goto L_0x02f2
            goto L_0x0ce8
        L_0x0cee:
            r1.A1x(r2)
            goto L_0x0cae
        L_0x0cf2:
            boolean r0 = r14 instanceof X.C35881yL
            if (r0 == 0) goto L_0x0d00
            r0 = 17
            X.1p1 r0 = X.C31891p1.A02(r9, r0, r10)
            X.C36481zJ.A0A(r15, r0)
            return r0
        L_0x0d00:
            boolean r0 = r14 instanceof X.C35871yK
            if (r0 == 0) goto L_0x0d19
            r0 = 11
            X.1p1 r1 = X.C31891p1.A02(r9, r0, r10)
            X.C36481zJ.A0A(r15, r1)
            int r0 = X.C18310x6.A05(r15)
            if (r0 <= 0) goto L_0x02f2
            java.lang.String r0 = X.C36551zQ.A09(r15)
            goto L_0x08b5
        L_0x0d19:
            boolean r0 = r14 instanceof X.C36321z3
            if (r0 == 0) goto L_0x0d3f
            r5 = r14
            X.1z3 r5 = (X.C36321z3) r5
            int r0 = X.C18310x6.A05(r15)
            r4 = 0
            r3 = 1
            if (r0 != r3) goto L_0x0fce
            r0 = 4
            X.1p1 r6 = X.C31891p1.A02(r9, r0, r10)
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A06(r15, r4)
            r6.A1J(r0)
            X.2sr r0 = r5.A00
            boolean r0 = X.C56972sr.A0A(r0, r6)
            if (r0 == 0) goto L_0x011a
            r6.A00 = r3
            return r6
        L_0x0d3f:
            boolean r0 = r14 instanceof X.C36311z2
            if (r0 == 0) goto L_0x0dab
            r5 = r14
            X.1z2 r5 = (X.C36311z2) r5
            r0 = 28
            X.1o8 r4 = new X.1o8
            r4.<init>(r9, r0, r10)
            X.2qk r0 = r5.A0I
            r4.A03 = r0
            java.lang.String r0 = X.C36551zQ.A09(r15)
            X.32Y r3 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r0 = r3.A0E(r0)
            r2 = 0
            if (r0 == 0) goto L_0x016f
            r4.A01 = r0
            r1 = 1
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            com.whatsapp.jid.UserJid r1 = r3.A0E(r0)
            boolean r0 = r1 instanceof X.C27981fH
            if (r0 == 0) goto L_0x100e
            X.2sM r0 = r5.A00
            com.whatsapp.jid.PhoneUserJid r1 = X.C56662sM.A00(r0, r1)
            if (r1 != 0) goto L_0x1011
            java.lang.String r0 = "ContactChangedNumberWebQuery/restoreFMessage/LID -> PN mapping unknown"
            goto L_0x0aff
        L_0x0d7b:
            r1 = 0
            goto L_0x0d82
        L_0x0d7d:
            r1 = 1
            goto L_0x0d82
        L_0x0d7f:
            r1 = 2
            goto L_0x0d82
        L_0x0d81:
            r1 = 3
        L_0x0d82:
            r0 = 3
            r13 = 1
            if (r1 == r0) goto L_0x0d89
            r12 = 0
            if (r1 != r13) goto L_0x0d8a
        L_0x0d89:
            r12 = 1
        L_0x0d8a:
            r8 = 0
            r9 = 2
            r10 = 0
            X.3ZF r2 = X.AnonymousClass3ZF.A00(r7, r8, r9, r10, r12, r13)
            if (r2 == 0) goto L_0x018f
            X.23Q r1 = r15.A0M()
            X.23Q r0 = X.AnonymousClass23Q.A2n
            if (r1 == r0) goto L_0x0da0
            X.23Q r0 = X.AnonymousClass23Q.A2o
            if (r1 != r0) goto L_0x0da3
        L_0x0da0:
            r2.A0E(r9)
        L_0x0da3:
            java.util.List r0 = java.util.Collections.singletonList(r2)
            r7.A1x(r0)
            return r7
        L_0x0dab:
            boolean r0 = r14 instanceof X.C35861yJ
            if (r0 == 0) goto L_0x1015
            r5 = 0
            int r4 = X.C18300x5.A05(r9, r15, r5)
            X.1ou r2 = new X.1ou
            r2.<init>(r9, r10)
            java.lang.String r0 = r15.participant_
            r3 = 0
            if (r0 == 0) goto L_0x0df0
            com.whatsapp.jid.Jid r1 = X.AnonymousClass32W.A00(r0)
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 != 0) goto L_0x0dc7
            r1 = r3
        L_0x0dc7:
            X.4uZ r1 = (X.C95814uZ) r1
        L_0x0dc9:
            r2.A1J(r1)
            int r0 = X.C18310x6.A05(r15)
            if (r0 < r4) goto L_0x016f
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r5)
            if (r0 == 0) goto L_0x0de5
            com.whatsapp.jid.Jid r1 = X.AnonymousClass32W.A00(r0)
            boolean r0 = r1 instanceof X.C27991fJ
            if (r0 == 0) goto L_0x0de3
            r3 = r1
        L_0x0de3:
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
        L_0x0de5:
            r1 = 1
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            r2.A20(r3, r0)
            return r2
        L_0x0df0:
            r1 = r3
            goto L_0x0dc9
        L_0x0df2:
            r1 = move-exception
            java.lang.String r0 = "FMessageWebQuery/restoreFMessage - failed to build FMessage from WMI."
            com.whatsapp.util.Log.e(r0, r1)
            return r3
        L_0x0df9:
            java.lang.String r0 = "Invalid Sender JID"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r2
        L_0x0dff:
            java.lang.String r0 = "Invalid stub type."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0e06:
            r5.A01 = r3
            return r5
        L_0x0e09:
            r1 = 1
            X.8ya r0 = r15.messageStubParameters_     // Catch:{ NumberFormatException -> 0x0e15 }
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)     // Catch:{ NumberFormatException -> 0x0e15 }
            int r3 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0e15 }
            goto L_0x0e1a
        L_0x0e15:
            java.lang.String r0 = "Failed to parse number group size threshold."
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0e1a:
            java.lang.String r0 = "on"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0e2e
            if (r3 <= 0) goto L_0x0e3a
            X.1oS r0 = new X.1oS
            r0.<init>(r9, r3, r10)
        L_0x0e2a:
            X.C36481zJ.A0A(r15, r0)
            return r0
        L_0x0e2e:
            java.lang.String r0 = "off"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0e41
            r0 = 30
            goto L_0x0e3c
        L_0x0e3a:
            r0 = 29
        L_0x0e3c:
            X.1p1 r0 = X.C31891p1.A02(r9, r0, r10)
            goto L_0x0e2a
        L_0x0e41:
            java.lang.String r0 = "GroupChangeRestrict/restoreFMessage/invalid value of restrictModeEnabledValue parameter."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0e48:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupChangeReportToAdminEnabledWebQuery/restoreFMessage/invalid value of allow parameter: "
            r1.append(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0I(r2, r1)
            throw r0
        L_0x0e56:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0e5c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GROUP_CHANGE_RECENT_HISTORY_SHARING/restoreFMessage/invalid value of allow parameter: "
            r1.append(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0I(r2, r1)
            throw r0
        L_0x0e6a:
            java.lang.String r0 = "GroupChangeAnnounceQuery/restoreFMessage/invalid value of groupAnnouncementsEnabled parameter."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0e71:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupChangeAllowNonAdminSubgroupCreationWebQuery/restoreFMessage/invalid value of allow parameter: "
            r1.append(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0I(r2, r1)
            throw r0
        L_0x0e7f:
            int r0 = X.C18310x6.A05(r15)
            if (r0 == r1) goto L_0x0e8c
            java.lang.String r0 = "ChatAssignmentWebQuery/restoreFMessage  wrong parameter size"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r7 = 0
            return r7
        L_0x0e8c:
            r1 = 0
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            r7.A01 = r1
            r7.A00 = r0
            return r7
        L_0x0e98:
            r2.A00 = r3
            X.4uZ r0 = r9.A00
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            X.C626936e.A0C(r0)
            return r2
        L_0x0ea2:
            r0 = 1
            goto L_0x0f00
        L_0x0ea4:
            r0 = 2
            goto L_0x0f00
        L_0x0ea6:
            r0 = 3
            goto L_0x0f00
        L_0x0ea8:
            r0 = 4
            goto L_0x0f00
        L_0x0eaa:
            r0 = 5
            goto L_0x0f00
        L_0x0eac:
            r0 = 6
            goto L_0x0f00
        L_0x0eae:
            r0 = 7
            goto L_0x0f00
        L_0x0eb0:
            r0 = 8
            goto L_0x0f00
        L_0x0eb3:
            r0 = 9
            goto L_0x0f00
        L_0x0eb6:
            r0 = 10
            goto L_0x0f00
        L_0x0eb9:
            r0 = 11
            goto L_0x0f00
        L_0x0ebc:
            r0 = 12
            goto L_0x0f00
        L_0x0ebf:
            r0 = 13
            goto L_0x0f00
        L_0x0ec2:
            r0 = 14
            goto L_0x0f00
        L_0x0ec5:
            r0 = 15
            goto L_0x0f00
        L_0x0ec8:
            r0 = 16
            goto L_0x0f00
        L_0x0ecb:
            r0 = 17
            goto L_0x0f00
        L_0x0ece:
            r0 = 18
            goto L_0x0f00
        L_0x0ed1:
            r0 = 19
            goto L_0x0f00
        L_0x0ed4:
            r0 = 20
            goto L_0x0f00
        L_0x0ed7:
            r0 = 21
            goto L_0x0f00
        L_0x0eda:
            r0 = 22
            goto L_0x0f00
        L_0x0edd:
            r0 = 23
            goto L_0x0f00
        L_0x0ee0:
            r0 = 24
            goto L_0x0f00
        L_0x0ee3:
            r0 = 25
            goto L_0x0f00
        L_0x0ee6:
            r0 = 26
            goto L_0x0f00
        L_0x0ee9:
            r0 = 27
            goto L_0x0f00
        L_0x0eec:
            r0 = 28
            goto L_0x0f00
        L_0x0eef:
            r0 = 29
            goto L_0x0f00
        L_0x0ef2:
            r0 = 30
            goto L_0x0f00
        L_0x0ef5:
            r0 = 31
            goto L_0x0f00
        L_0x0ef8:
            r0 = 32
            goto L_0x0f00
        L_0x0efb:
            r0 = 33
            goto L_0x0f00
        L_0x0efe:
            r0 = 34
        L_0x0f00:
            r1.A00 = r0
            java.lang.String r0 = X.C36551zQ.A09(r15)
            r1.A01 = r0
            return r1
        L_0x0f09:
            r7.A01 = r1
            return r7
        L_0x0f0c:
            if (r1 != 0) goto L_0x0f0f
            return r2
        L_0x0f0f:
            r3.A1w(r1)
            return r3
        L_0x0f13:
            X.8ya r0 = r15.messageStubParameters_     // Catch:{ NumberFormatException -> 0x0f1e }
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r6)     // Catch:{ NumberFormatException -> 0x0f1e }
            int r6 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0f1e }
            goto L_0x0f23
        L_0x0f1e:
            java.lang.String r0 = "Failed to parse number of broadcast participants."
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0f23:
            int r0 = X.C18310x6.A05(r15)
            r1 = 1
            if (r0 <= r1) goto L_0x0f33
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            r5.A1Z(r0)
        L_0x0f33:
            int r0 = X.C18310x6.A05(r15)
            r2 = 2
            int r0 = r0 - r2
            if (r0 != r6) goto L_0x0f50
            int r0 = X.C18310x6.A05(r15)
            int r0 = r0 - r2
            java.util.ArrayList r1 = X.AnonymousClass002.A0I(r0)
        L_0x0f44:
            int r0 = X.C18310x6.A05(r15)
            if (r2 >= r0) goto L_0x0f58
            A0C(r3, r15, r1, r2)
            int r2 = r2 + 1
            goto L_0x0f44
        L_0x0f50:
            com.whatsapp.jid.UserJid r0 = r4.A00
            if (r0 == 0) goto L_0x0f5c
            java.util.List r1 = java.util.Collections.nCopies(r6, r0)
        L_0x0f58:
            r5.A1h(r1)
            return r5
        L_0x0f5c:
            return r5
        L_0x0f5d:
            int r0 = X.C18310x6.A05(r15)
            if (r0 > r1) goto L_0x0f64
            r1 = 0
        L_0x0f64:
            X.C626936e.A0C(r1)
            r0 = 13
            X.1p1 r7 = X.C31891p1.A02(r9, r0, r10)
            X.8ya r0 = r15.messageStubParameters_
            java.util.ArrayList r2 = X.AnonymousClass000.A0p(r0)
        L_0x0f73:
            int r0 = X.C18310x6.A05(r15)
            if (r3 >= r0) goto L_0x0f87
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r1 = X.AnonymousClass001.A0n(r0, r3)
            X.32Y r0 = com.whatsapp.jid.UserJid.Companion
            X.AnonymousClass32Y.A0C(r0, r1, r2)
            int r3 = r3 + 1
            goto L_0x0f73
        L_0x0f87:
            r7.A01 = r2
            return r7
        L_0x0f8a:
            boolean r0 = r3 instanceof X.C27461dr
            java.util.HashSet r6 = X.AnonymousClass002.A0K()
            if (r0 != 0) goto L_0x0fa5
            r1 = 0
        L_0x0f93:
            int r0 = X.C18310x6.A05(r15)
            if (r1 >= r0) goto L_0x0fa5
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            r6.add(r0)
            int r1 = r1 + 1
            goto L_0x0f93
        L_0x0fa5:
            java.util.Iterator r4 = r6.iterator()
        L_0x0fa9:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0fc8
            java.lang.String r0 = X.AnonymousClass001.A0m(r4)
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A08(r0)
            if (r1 == 0) goto L_0x0fa9
            X.2sr r0 = r3.A00
            boolean r0 = r0.A0a(r1)
            if (r0 == 0) goto L_0x0fc4
            r0 = 1
            r2.A00 = r0
        L_0x0fc4:
            r5.add(r1)
            goto L_0x0fa9
        L_0x0fc8:
            r2.A01 = r5
            return r2
        L_0x0fcb:
            r3.A01 = r4
            return r3
        L_0x0fce:
            int r1 = X.C18310x6.A05(r15)
            r0 = 0
            if (r1 <= r3) goto L_0x0fd6
            r0 = 1
        L_0x0fd6:
            X.C626936e.A0B(r0)
            r0 = 12
            X.1p1 r6 = X.C31891p1.A02(r9, r0, r10)
            X.8ya r0 = r15.messageStubParameters_
            java.util.ArrayList r2 = X.AnonymousClass000.A0p(r0)
            int r0 = r15.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0fee
            X.C36481zJ.A0A(r15, r6)
        L_0x0fee:
            int r0 = X.C18310x6.A05(r15)
            if (r4 >= r0) goto L_0x100b
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A06(r15, r4)
            X.C626936e.A06(r1)
            X.2sr r0 = r5.A00
            boolean r0 = r0.A0a(r1)
            if (r0 == 0) goto L_0x1005
            r6.A00 = r3
        L_0x1005:
            r2.add(r1)
            int r4 = r4 + 1
            goto L_0x0fee
        L_0x100b:
            r6.A01 = r2
            return r6
        L_0x100e:
            if (r1 != 0) goto L_0x1011
            return r2
        L_0x1011:
            r4.A1w(r1)
            return r4
        L_0x1015:
            boolean r0 = r14 instanceof X.C36561zR
            if (r0 == 0) goto L_0x1037
            r1 = r14
            X.1zR r1 = (X.C36561zR) r1
            X.C18260x0.A0P(r9, r15)
            r0 = 152(0x98, float:2.13E-43)
            X.1p1 r2 = X.C31891p1.A02(r9, r0, r10)
            X.AnonymousClass32Y.A0D(r15, r2)
            X.2ss r1 = r1.A00
            X.4uZ r0 = r9.A00
            java.lang.String r0 = r1.A0D(r0)
            if (r0 != 0) goto L_0x1034
            java.lang.String r0 = ""
        L_0x1034:
            r2.A0y = r0
            return r2
        L_0x1037:
            boolean r0 = r14 instanceof X.C36511zM
            if (r0 == 0) goto L_0x10a3
            r0 = 0
            X.C18270x1.A10(r9, r0, r15)
            java.lang.String r7 = A0B(r15, r0)
            r4 = 1
            java.lang.String r6 = A0B(r15, r4)
            java.lang.String r0 = "created"
            boolean r1 = X.C162457s7.A0P(r7, r0)
            java.lang.String r8 = ""
            X.4uZ r0 = r9.A00
            X.1fJ r3 = X.AnonymousClass34R.A03(r0)
            if (r1 == 0) goto L_0x107c
            if (r6 == 0) goto L_0x105b
            r8 = r6
        L_0x105b:
            X.32Y r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r15.participant_
            com.whatsapp.jid.UserJid r2 = r1.A0E(r0)
            X.1oK r5 = new X.1oK
            r5.<init>((X.AnonymousClass2z0) r9, (long) r10)
            if (r3 == 0) goto L_0x1078
            java.util.List r1 = r5.A00
            X.C162457s7.A0D(r1)
            X.45A r0 = X.AnonymousClass45A.A00
            X.C73743g0.A0Z(r1, r0, r4)
            r0 = 2
            X.C52662lq.A01(r3, r8, r1, r0)
        L_0x1078:
            r5.A1J(r2)
            return r5
        L_0x107c:
            if (r6 != 0) goto L_0x107f
            r6 = r8
        L_0x107f:
            X.32Y r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r15.participant_
            com.whatsapp.jid.UserJid r2 = r1.A0E(r0)
            X.1oJ r5 = new X.1oJ
            r5.<init>((X.AnonymousClass2z0) r9, (long) r10)
            if (r3 == 0) goto L_0x109c
            java.util.List r1 = r5.A00
            X.C162457s7.A0D(r1)
            X.459 r0 = X.AnonymousClass459.A00
            X.C73743g0.A0Z(r1, r0, r4)
            r0 = 2
            X.C52662lq.A01(r3, r6, r1, r0)
        L_0x109c:
            r5.A1J(r2)
            r5.A1Z(r7)
            return r5
        L_0x10a3:
            boolean r0 = r14 instanceof X.C36431zE
            if (r0 == 0) goto L_0x1121
            r3 = r14
            X.1zE r3 = (X.C36431zE) r3
            r0 = 0
            int r4 = X.C18300x5.A05(r9, r15, r0)
            X.34R r1 = X.C27991fJ.A01
            java.lang.String r0 = A0B(r15, r0)
            X.1fJ r8 = r1.A07(r0)
            r0 = 1
            java.lang.String r2 = A0B(r15, r0)
            r6 = 2
            java.lang.String r7 = A0B(r15, r4)
            X.4uZ r5 = r9.A00
            boolean r0 = r5 instanceof X.C28011fL
            r4 = 0
            if (r0 == 0) goto L_0x111f
            r1 = r5
            X.1fL r1 = (X.C28011fL) r1
            if (r1 == 0) goto L_0x111f
            X.2sj r0 = r3.A01
            X.33k r0 = X.C56892sj.A01(r0, r1)
            java.util.ArrayList r0 = r0.A0D()
            java.util.Iterator r3 = r0.iterator()
        L_0x10dd:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x111d
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.2zG r0 = (X.C60842zG) r0
            int r0 = r0.A01
            if (r0 != r6) goto L_0x10dd
        L_0x10ee:
            X.2zG r1 = (X.C60842zG) r1
        L_0x10f0:
            boolean r0 = r5 instanceof X.C27991fJ
            if (r0 == 0) goto L_0x111b
            com.whatsapp.jid.GroupJid r5 = (com.whatsapp.jid.GroupJid) r5
        L_0x10f6:
            if (r1 == 0) goto L_0x10fa
            com.whatsapp.jid.UserJid r4 = r1.A03
        L_0x10fa:
            X.1oL r3 = new X.1oL
            r3.<init>((X.AnonymousClass2z0) r9, (long) r10)
            if (r8 == 0) goto L_0x1104
            X.C30341mI.A00(r8, r3, r2)
        L_0x1104:
            if (r5 == 0) goto L_0x1114
            java.util.List r2 = r3.A00
            X.C162457s7.A0D(r2)
            X.458 r1 = X.AnonymousClass458.A00
            r0 = 1
            X.C73743g0.A0Z(r2, r1, r0)
            X.C52662lq.A01(r5, r7, r2, r6)
        L_0x1114:
            r3.A1J(r4)
            r3.A1Z(r7)
            return r3
        L_0x111b:
            r5 = r4
            goto L_0x10f6
        L_0x111d:
            r1 = r4
            goto L_0x10ee
        L_0x111f:
            r1 = r4
            goto L_0x10f0
        L_0x1121:
            boolean r0 = r14 instanceof X.C36301z1
            if (r0 == 0) goto L_0x117f
            r3 = r14
            X.1z1 r3 = (X.C36301z1) r3
            int r1 = X.C18310x6.A05(r15)
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            X.C626936e.A0B(r0)
            r1 = 0
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            X.1fJ r5 = X.AnonymousClass34R.A04(r0)
            r1 = 1
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r2 = X.AnonymousClass001.A0n(r0, r1)
            X.2sd r1 = r3.A01
            r4 = 0
            java.lang.String r0 = r15.participant_
            com.whatsapp.jid.UserJid r6 = X.AnonymousClass32Y.A08(r0)
            X.4uZ r0 = r9.A00
            com.whatsapp.jid.GroupJid r0 = X.AnonymousClass32V.A01(r0)
            X.2z0 r0 = X.C56832sd.A00(r0, r1)
            X.1ou r3 = new X.1ou
            r3.<init>(r0, r10)
            r3.A04 = r4
            r3.A20(r5, r2)
            if (r5 == 0) goto L_0x117b
            r2 = 4
            java.util.List r0 = r3.A1z(r2)
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x1176
            java.lang.String r1 = "FMessageSystemParentGroupNameChanged/setOldParentInfo/old parent info should only be set once"
            r0 = 0
            X.C626936e.A0D(r0, r1)
        L_0x1176:
            java.util.List r0 = r3.A00
            X.C52662lq.A01(r5, r4, r0, r2)
        L_0x117b:
            r3.A1J(r6)
            return r3
        L_0x117f:
            boolean r0 = r14 instanceof X.C36471zI
            if (r0 == 0) goto L_0x122c
            r5 = r14
            X.1zI r5 = (X.C36471zI) r5
            r4 = 0
            int r2 = X.C18300x5.A05(r9, r15, r4)
            X.23Q r1 = r15.A0M()
            boolean r3 = r5 instanceof X.AnonymousClass1O3
            if (r3 == 0) goto L_0x1225
            r0 = r5
            X.1O3 r0 = (X.AnonymousClass1O3) r0
            X.23Q r0 = r0.A00
        L_0x1198:
            r6 = 0
            if (r1 != r0) goto L_0x1200
            int r0 = X.C18310x6.A05(r15)
            if (r0 < r2) goto L_0x1200
            X.4uZ r1 = r9.A00
            boolean r0 = r1 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x1200
            if (r1 == 0) goto L_0x1200
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r4)
            if (r0 == 0) goto L_0x11fe
            com.whatsapp.jid.Jid r2 = X.AnonymousClass32W.A00(r0)
            boolean r0 = r2 instanceof com.whatsapp.jid.GroupJid
            if (r0 != 0) goto L_0x11ba
            r2 = r6
        L_0x11ba:
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
        L_0x11bc:
            r1 = 1
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r7 = X.AnonymousClass001.A0n(r0, r1)
            if (r7 != 0) goto L_0x11c7
            java.lang.String r7 = ""
        L_0x11c7:
            java.lang.String r0 = r15.participant_
            if (r0 == 0) goto L_0x11d5
            com.whatsapp.jid.Jid r1 = X.AnonymousClass32W.A00(r0)
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 != 0) goto L_0x1223
        L_0x11d3:
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
        L_0x11d5:
            if (r3 == 0) goto L_0x11ec
            X.1O3 r5 = (X.AnonymousClass1O3) r5
            X.2sd r3 = r5.A01
            r0 = 0
            X.1od r1 = new X.1od
            r1.<init>(r9, r10)
            r1.A04 = r0
            if (r2 == 0) goto L_0x11e8
            X.C30341mI.A00(r2, r1, r7)
        L_0x11e8:
            r3.A0A(r6, r1, r4)
            return r1
        L_0x11ec:
            X.1O2 r5 = (X.AnonymousClass1O2) r5
            X.2sd r3 = r5.A01
            r0 = 0
            X.1oa r1 = new X.1oa
            r1.<init>(r9, r10)
            r1.A04 = r0
            if (r2 == 0) goto L_0x11e8
            X.C30341mI.A00(r2, r1, r7)
            goto L_0x11e8
        L_0x11fe:
            r2 = r6
            goto L_0x11bc
        L_0x1200:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r3 == 0) goto L_0x1220
            java.lang.String r0 = "SUBGROUP_UNLINKED_FROM_PARENT"
        L_0x1208:
            r1.append(r0)
            java.lang.String r0 = "/invalid wmi"
            X.C18260x0.A1K(r1, r0)
            r2 = 0
            java.lang.String r7 = ""
            java.lang.String r0 = r15.participant_
            if (r0 == 0) goto L_0x11d5
            com.whatsapp.jid.Jid r1 = X.AnonymousClass32W.A00(r0)
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 != 0) goto L_0x1223
            goto L_0x11d3
        L_0x1220:
            java.lang.String r0 = "SUBGROUP_LINKED_TO_PARENT"
            goto L_0x1208
        L_0x1223:
            r6 = r1
            goto L_0x11d3
        L_0x1225:
            r0 = r5
            X.1O2 r0 = (X.AnonymousClass1O2) r0
            X.23Q r0 = r0.A00
            goto L_0x1198
        L_0x122c:
            boolean r0 = r14 instanceof X.C36421zD
            if (r0 == 0) goto L_0x1282
            r3 = r14
            X.1zD r3 = (X.C36421zD) r3
            int r0 = X.C18310x6.A05(r15)
            r1 = 0
            if (r0 <= 0) goto L_0x1280
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            X.1fJ r6 = X.AnonymousClass34R.A04(r0)
        L_0x1244:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            X.23Q r1 = r15.A0M()
            X.23Q r0 = X.AnonymousClass23Q.A1L
            r2 = 2
            if (r1 != r0) goto L_0x126f
            r5 = 2
        L_0x1252:
            X.2sd r4 = r3.A03
            java.lang.String r0 = r15.participant_
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass32Y.A08(r0)
            r2 = 0
            r0 = 75
            X.1oV r1 = new X.1oV
            r1.<init>(r9, r0, r10)
            r1.A04 = r2
            r1.A02 = r7
            r1.A00 = r5
            r1.A01 = r6
            r0 = 0
            r4.A0A(r3, r1, r0)
            return r1
        L_0x126f:
            X.23Q r0 = X.AnonymousClass23Q.A1V
            boolean r1 = X.AnonymousClass000.A1Y(r1, r0)
            java.lang.String r0 = "MessageStubeType was not COMMUNITY_UNLINK_PARENT_GROUP"
            X.C626936e.A0D(r1, r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r5 = 0
            goto L_0x1252
        L_0x1280:
            r6 = 0
            goto L_0x1244
        L_0x1282:
            boolean r0 = r14 instanceof X.C36401zB
            if (r0 == 0) goto L_0x1301
            r2 = 0
            X.C18270x1.A10(r9, r2, r15)
            int r0 = X.C18310x6.A05(r15)
            r4 = 0
            if (r0 <= 0) goto L_0x12ca
            X.34R r1 = X.C27991fJ.A01
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r2)
            X.1fJ r3 = r1.A07(r0)
        L_0x129d:
            int r0 = X.C18310x6.A05(r15)
            r1 = 1
            if (r0 <= r1) goto L_0x12aa
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r4 = X.AnonymousClass001.A0n(r0, r1)
        L_0x12aa:
            X.23Q r2 = r15.A0M()
            if (r2 == 0) goto L_0x12b7
            int r0 = r2.ordinal()
            switch(r0) {
                case 142: goto L_0x12f6;
                case 163: goto L_0x12f0;
                case 164: goto L_0x12ea;
                case 165: goto L_0x12e4;
                case 166: goto L_0x12de;
                case 167: goto L_0x12d8;
                case 168: goto L_0x12d2;
                case 185: goto L_0x12cc;
                default: goto L_0x12b7;
            }
        L_0x12b7:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageStubType "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " is not supported"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0I(r0, r1)
            throw r0
        L_0x12ca:
            r3 = r4
            goto L_0x129d
        L_0x12cc:
            X.1oF r0 = new X.1oF
            r0.<init>((X.AnonymousClass2z0) r9, (long) r10)
            goto L_0x12fb
        L_0x12d2:
            X.1oI r0 = new X.1oI
            r0.<init>((X.AnonymousClass2z0) r9, (long) r10)
            goto L_0x12fb
        L_0x12d8:
            X.1oA r0 = new X.1oA
            r0.<init>(r9, r10)
            goto L_0x12fb
        L_0x12de:
            X.1oC r0 = new X.1oC
            r0.<init>(r9, r10)
            goto L_0x12fb
        L_0x12e4:
            X.1oB r0 = new X.1oB
            r0.<init>(r9, r10)
            goto L_0x12fb
        L_0x12ea:
            X.1oH r0 = new X.1oH
            r0.<init>((X.AnonymousClass2z0) r9, (long) r10)
            goto L_0x12fb
        L_0x12f0:
            X.1oG r0 = new X.1oG
            r0.<init>((X.AnonymousClass2z0) r9, (long) r10)
            goto L_0x12fb
        L_0x12f6:
            X.1oE r0 = new X.1oE
            r0.<init>((X.AnonymousClass2z0) r9, (long) r10)
        L_0x12fb:
            if (r3 == 0) goto L_0x1300
            X.C30341mI.A00(r3, r0, r4)
        L_0x1300:
            return r0
        L_0x1301:
            boolean r0 = r14 instanceof X.C36291z0
            if (r0 == 0) goto L_0x1324
            int r0 = X.C18310x6.A05(r15)
            if (r0 <= 0) goto L_0x1322
            java.lang.String r3 = X.C36551zQ.A09(r15)
        L_0x130f:
            java.lang.String r0 = r15.participant_
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A08(r0)
            r1 = 87
            X.1oU r0 = new X.1oU
            r0.<init>(r9, r1, r10)
            r0.A00 = r3
            r0.A1J(r2)
            return r0
        L_0x1322:
            r3 = 0
            goto L_0x130f
        L_0x1324:
            boolean r0 = r14 instanceof X.C36281yz
            if (r0 == 0) goto L_0x1342
            r0 = 11
            X.1p1 r2 = X.C31891p1.A02(r9, r0, r10)
            int r0 = X.C18310x6.A05(r15)
            r1 = 1
            if (r0 <= r1) goto L_0x133e
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            r2.A1Z(r0)
        L_0x133e:
            X.C36481zJ.A0A(r15, r2)
            return r2
        L_0x1342:
            boolean r0 = r14 instanceof X.C36481zJ
            if (r0 == 0) goto L_0x1444
            r4 = r14
            X.1zJ r4 = (X.C36481zJ) r4
            X.2ss r7 = r4.A00
            java.util.HashSet r3 = X.AnonymousClass002.A0K()
            int r6 = X.C18310x6.A05(r15)
            r5 = 0
        L_0x1354:
            if (r5 >= r6) goto L_0x137f
            X.8ya r0 = r15.messageStubParameters_     // Catch:{ 24P -> 0x1373 }
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r5)     // Catch:{ 24P -> 0x1373 }
            X.1fJ r2 = X.AnonymousClass34R.A05(r0)     // Catch:{ 24P -> 0x1373 }
            X.31A r1 = X.C56982ss.A00(r7, r2)
            if (r1 == 0) goto L_0x1376
            java.lang.String r0 = r1.A07()
            if (r0 == 0) goto L_0x1376
            java.lang.String r0 = r1.A07()
        L_0x1370:
            X.C52882mC.A00(r2, r0, r3)
        L_0x1373:
            int r5 = r5 + 2
            goto L_0x1354
        L_0x1376:
            int r1 = r5 + 1
            X.8ya r0 = r15.messageStubParameters_
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            goto L_0x1370
        L_0x137f:
            X.4uZ r0 = r9.A00
            X.1fJ r1 = X.AnonymousClass34R.A01(r0)
            boolean r0 = r4 instanceof X.AnonymousClass1Nx
            if (r0 == 0) goto L_0x13b5
            X.1Nx r4 = (X.AnonymousClass1Nx) r4
            r0 = 0
            X.C18260x0.A0Z(r9, r15, r3, r0)
            boolean r0 = r4 instanceof X.AnonymousClass1O8
            if (r0 == 0) goto L_0x13af
            X.1on r2 = new X.1on
            r2.<init>(r9, r10)
        L_0x1398:
            java.lang.String r0 = r15.participant_
            r4 = 0
            if (r0 == 0) goto L_0x13a8
            com.whatsapp.jid.Jid r1 = X.AnonymousClass32W.A00(r0)
            boolean r0 = r1 instanceof X.C95814uZ
            if (r0 == 0) goto L_0x13a6
            r4 = r1
        L_0x13a6:
            X.4uZ r4 = (X.C95814uZ) r4
        L_0x13a8:
            r2.A1J(r4)
            r2.A21(r3)
            return r2
        L_0x13af:
            X.1om r2 = new X.1om
            r2.<init>(r9, r10)
            goto L_0x1398
        L_0x13b5:
            boolean r0 = r4 instanceof X.AnonymousClass1O6
            if (r0 == 0) goto L_0x13f4
            X.1O6 r4 = (X.AnonymousClass1O6) r4
            r0 = 2
            X.C18260x0.A0a(r15, r3, r1, r0)
            boolean r0 = r4 instanceof X.AnonymousClass1O5
            if (r0 == 0) goto L_0x13ee
            X.1ol r2 = new X.1ol
            r2.<init>(r9, r10)
        L_0x13c8:
            java.lang.String r0 = r15.participant_
            r6 = 0
            if (r0 == 0) goto L_0x13d8
            com.whatsapp.jid.Jid r5 = X.AnonymousClass32W.A00(r0)
            boolean r0 = r5 instanceof X.C95814uZ
            if (r0 == 0) goto L_0x13d6
            r6 = r5
        L_0x13d6:
            X.4uZ r6 = (X.C95814uZ) r6
        L_0x13d8:
            r2.A1J(r6)
            X.2zh r0 = r4.A01
            X.1fJ r5 = r0.A02(r1)
            if (r5 == 0) goto L_0x13ea
            java.util.List r4 = r2.A00
            r1 = 0
            r0 = 1
            X.C52662lq.A01(r5, r1, r4, r0)
        L_0x13ea:
            r2.A21(r3)
            return r2
        L_0x13ee:
            X.1ok r2 = new X.1ok
            r2.<init>(r9, r10)
            goto L_0x13c8
        L_0x13f4:
            boolean r0 = r4 instanceof X.AnonymousClass1O1
            if (r0 == 0) goto L_0x1409
            r0 = 89
            X.1oW r2 = new X.1oW
            r2.<init>(r9, r0, r10)
            X.C36481zJ.A0A(r15, r2)
            int r0 = X.C36481zJ.A09(r4, r1, r2, r3)
            r2.A00 = r0
            return r2
        L_0x1409:
            boolean r0 = r4 instanceof X.AnonymousClass1O0
            if (r0 == 0) goto L_0x141e
            r0 = 88
            X.1oW r2 = new X.1oW
            r2.<init>(r9, r0, r10)
            X.C36481zJ.A0A(r15, r2)
            int r0 = X.C36481zJ.A09(r4, r1, r2, r3)
            r2.A00 = r0
            return r2
        L_0x141e:
            boolean r0 = r4 instanceof X.AnonymousClass1Nz
            if (r0 == 0) goto L_0x1433
            r0 = 78
            X.1oW r2 = new X.1oW
            r2.<init>(r9, r0, r10)
            X.C36481zJ.A0A(r15, r2)
            int r0 = X.C36481zJ.A09(r4, r1, r2, r3)
            r2.A00 = r0
            return r2
        L_0x1433:
            r0 = 77
            X.1oW r2 = new X.1oW
            r2.<init>(r9, r0, r10)
            X.C36481zJ.A0A(r15, r2)
            int r0 = X.C36481zJ.A09(r4, r1, r2, r3)
            r2.A00 = r0
            return r2
        L_0x1444:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54192oK.A0E(X.1ES, X.2z0, long):X.34x");
    }

    public C54192oK(C55682qk r2, C624134x r3) {
        this.A0I = r2;
        this.A0J = r3;
    }

    public static void A0C(AnonymousClass32Y r1, AnonymousClass1ES r2, AbstractCollection abstractCollection, int i) {
        UserJid A0E2 = r1.A0E(r2.A0N(i));
        if (A0E2 != null) {
            abstractCollection.add(A0E2);
        }
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[id: ");
        A0o.append(this.A09);
        A0o.append(" jid: ");
        return AnonymousClass000.A0S(this.A06, A0o);
    }
}
