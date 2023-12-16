package X;

import java.util.Collection;

/* renamed from: X.5ky  reason: invalid class name and case insensitive filesystem */
public abstract class C113155ky implements C1229266j {
    public final boolean BoM(Collection collection) {
        C162457s7.A0J(collection, 0);
        if (collection.size() != 1) {
            return false;
        }
        return A00(C86654Ky.A0b(collection));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b1, code lost:
        r14 = (com.whatsapp.jid.GroupJid) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x012d, code lost:
        if ((r3 instanceof X.AnonymousClass1nF) != false) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x013d, code lost:
        if (r1.A0X(5174) != false) goto L_0x013f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A00(X.C624134x r20) {
        /*
            r19 = this;
            r3 = r20
            r2 = r19
            boolean r0 = r2 instanceof X.C93814pO
            if (r0 == 0) goto L_0x0044
            X.4pO r2 = (X.C93814pO) r2
            X.2z0 r0 = X.C624134x.A07(r3)
            X.4uZ r0 = r0.A00
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 == 0) goto L_0x0029
            X.4uo r1 = r2.A01
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x0027
            X.1VX r1 = r1.A09
            r0 = 5884(0x16fc, float:8.245E-42)
            boolean r0 = r1.A0X(r0)
            r1 = 1
            if (r0 == 0) goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            return r1
        L_0x0029:
            X.1VX r1 = r2.A00
            r0 = 2890(0xb4a, float:4.05E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0027
            boolean r0 = X.C107385bE.A0A()
            if (r0 == 0) goto L_0x0027
            byte r1 = r3.A1I
            r0 = 2
            if (r1 != r0) goto L_0x0027
            int r0 = r3.A09
            r1 = 1
            if (r0 != r1) goto L_0x0027
            return r1
        L_0x0044:
            boolean r0 = r2 instanceof X.C93834pQ
            if (r0 == 0) goto L_0x0063
            X.4pQ r2 = (X.C93834pQ) r2
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            X.1VX r1 = r2.A02
            r0 = 535(0x217, float:7.5E-43)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0061
            X.5U1 r0 = r2.A03
            boolean r0 = r0.A03(r3)
            r2 = 1
            if (r0 != 0) goto L_0x0062
        L_0x0061:
            r2 = 0
        L_0x0062:
            return r2
        L_0x0063:
            boolean r0 = r2 instanceof X.C93894pW
            if (r0 == 0) goto L_0x01e6
            X.4pW r2 = (X.C93894pW) r2
            r5 = 0
            X.C162457s7.A0J(r3, r5)
            X.2sH r4 = r2.A06
            X.1VX r1 = r2.A09
            X.2sr r0 = r2.A02
            r18 = r0
            X.2ss r13 = r2.A07
            X.3LP r14 = r2.A0A
            X.3Ex r7 = r2.A03
            X.2rN r6 = r2.A0D
            X.5UP r8 = r2.A0B
            X.2fk r9 = r2.A05
            X.5rC r0 = r2.A00
            r17 = r0
            X.3Wa r0 = r2.A0C
            X.2rx r10 = r2.A04
            X.2sj r15 = r2.A08
            X.2z0 r12 = r3.A1J
            X.4uZ r2 = r12.A00
            boolean r11 = X.C57362tW.A00(r14, r2)
            if (r11 != 0) goto L_0x00c6
            boolean r11 = X.C616831v.A00(r1, r2)
            if (r11 != 0) goto L_0x00c6
            com.whatsapp.jid.UserJid r11 = X.AnonymousClass32Y.A03(r2)
            boolean r16 = X.C57172tD.A00(r10, r1, r14, r11)
            if (r16 != 0) goto L_0x00c6
            boolean r0 = X.C615431g.A00(r10, r1, r14, r11, r0)
            if (r0 != 0) goto L_0x00c6
            boolean r0 = X.C627336j.A0K(r2)
            if (r0 == 0) goto L_0x00c7
            r14 = r2
            com.whatsapp.jid.GroupJid r14 = (com.whatsapp.jid.GroupJid) r14
            X.3ZH r0 = r7.A07(r14)
            if (r0 == 0) goto L_0x00c6
            boolean r0 = r6.A04(r0, r14)
            if (r0 != 0) goto L_0x00c6
            boolean r0 = r15.A0C(r14)
            if (r0 != 0) goto L_0x00c7
        L_0x00c6:
            return r5
        L_0x00c7:
            java.lang.Object r6 = r17.A05()
            X.2sS r6 = (X.C56722sS) r6
            if (r6 == 0) goto L_0x00de
            java.util.List r0 = r3.A18
            com.whatsapp.jid.UserJid r0 = r6.A00(r0)
            if (r0 != 0) goto L_0x00c6
            boolean r0 = X.C155477ey.A00(r2)
            if (r0 == 0) goto L_0x00de
            return r5
        L_0x00de:
            boolean r6 = r2 instanceof X.C95804uY
            if (r6 == 0) goto L_0x0151
            X.4uY r2 = (X.C95804uY) r2
            if (r2 == 0) goto L_0x00c6
            X.31A r14 = r13.A0A(r2, r5)
            X.1RL r14 = (X.AnonymousClass1RL) r14
            if (r14 == 0) goto L_0x00c6
            long r11 = X.C56612sH.A04(r4, r3)
            r9 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            boolean r7 = X.AnonymousClass001.A1V(r0)
            boolean r0 = X.C106855aH.A04(r13, r2, r8)
            if (r0 == 0) goto L_0x00c6
            boolean r0 = r14.A0K()
            if (r0 == 0) goto L_0x00c6
            int r2 = r3.A0D
            r0 = 4
            if (r2 != r0) goto L_0x00c6
            X.2mS r2 = r3.A0z()
            r0 = 1
            if (r2 != 0) goto L_0x00c6
            boolean r0 = r3.A1s(r0)
            if (r0 != 0) goto L_0x00c6
            boolean r0 = r3 instanceof X.C30481mW
            if (r0 != 0) goto L_0x012f
            boolean r0 = r3 instanceof X.AnonymousClass1n2
            if (r0 != 0) goto L_0x012f
            boolean r0 = r3 instanceof X.C31971pB
            if (r0 != 0) goto L_0x012f
            boolean r0 = r3 instanceof X.C31961pA
            if (r0 != 0) goto L_0x012f
            boolean r0 = r3 instanceof X.AnonymousClass1nF
            if (r0 == 0) goto L_0x00c6
        L_0x012f:
            boolean r0 = X.C627636p.A0Y(r3)
            if (r0 != 0) goto L_0x00c6
            if (r7 == 0) goto L_0x00c6
            r0 = 5174(0x1436, float:7.25E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00c6
        L_0x013f:
            long r3 = X.C56612sH.A04(r4, r3)
            r0 = 3272(0xcc8, float:4.585E-42)
            long r1 = X.C56952sp.A04(r1, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x03f3
            if (r6 == 0) goto L_0x00c6
            goto L_0x03f3
        L_0x0151:
            boolean r0 = r13.A0N(r2)
            if (r0 == 0) goto L_0x015f
            r0 = 4090(0xffa, float:5.731E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00c6
        L_0x015f:
            long r7 = r3.A0J
            r13 = -1
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x016f
            r0 = r18
            boolean r0 = r0.A0a(r2)
            if (r0 == 0) goto L_0x00c6
        L_0x016f:
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x00c6
            r0 = 2190(0x88e, float:3.069E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x01b8
            boolean r0 = r3 instanceof X.C30481mW
            if (r0 == 0) goto L_0x01b8
        L_0x017f:
            r0 = 1
            boolean r0 = r3.A1s(r0)
            if (r0 != 0) goto L_0x00c6
            long r12 = X.C56612sH.A04(r4, r3)
            r0 = 2983(0xba7, float:4.18E-42)
            long r7 = X.C56952sp.A04(r1, r0)
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x00c6
            boolean r0 = r2 instanceof X.AnonymousClass1fI
            if (r0 != 0) goto L_0x00c6
            boolean r0 = r10.A03(r11)
            if (r0 != 0) goto L_0x00c6
            X.34n r2 = new X.34n
            r2.<init>((X.C56422rx) r10, (X.C48952fk) r9, (com.whatsapp.jid.UserJid) r11)
            r0 = 5968(0x1750, float:8.363E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x013f
            boolean r0 = r2.A03()
            if (r0 != 0) goto L_0x00c6
            boolean r0 = r2.A05()
            if (r0 == 0) goto L_0x013f
            return r5
        L_0x01b8:
            r0 = 3687(0xe67, float:5.167E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00c6
            boolean r0 = r3 instanceof X.AnonymousClass1n2
            if (r0 != 0) goto L_0x01cc
            boolean r0 = r3 instanceof X.C31971pB
            if (r0 != 0) goto L_0x01cc
            boolean r0 = r3 instanceof X.C31961pA
            if (r0 == 0) goto L_0x01d6
        L_0x01cc:
            r0 = r3
            X.1mV r0 = (X.C30471mV) r0
            boolean r0 = X.C86614Ku.A1Z(r0)
            if (r0 != 0) goto L_0x01d6
            goto L_0x017f
        L_0x01d6:
            boolean r0 = r3 instanceof X.AnonymousClass1nF
            if (r0 == 0) goto L_0x00c6
            r0 = r3
            X.1nF r0 = (X.AnonymousClass1nF) r0
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00c6
            goto L_0x017f
        L_0x01e6:
            boolean r0 = r2 instanceof X.C93884pV
            if (r0 == 0) goto L_0x0216
            X.4pV r2 = (X.C93884pV) r2
            X.2z0 r0 = X.C624134x.A07(r3)
            X.4uZ r5 = r0.A00
            X.1VX r4 = r2.A08
            X.2vE r1 = X.C58422vE.A01
            r0 = 3864(0xf18, float:5.415E-42)
            boolean r0 = r4.A0Y(r1, r0)
            if (r0 == 0) goto L_0x0061
            boolean r0 = r3 instanceof X.C30481mW
            if (r0 == 0) goto L_0x0061
            boolean r0 = X.C627336j.A0K(r5)
            if (r0 == 0) goto L_0x0061
            X.2ss r0 = r2.A05
            com.whatsapp.jid.GroupJid r5 = (com.whatsapp.jid.GroupJid) r5
            int r1 = r0.A06(r5)
            r0 = 3
            r2 = 1
            if (r1 == r0) goto L_0x0062
            goto L_0x0061
        L_0x0216:
            boolean r0 = r2 instanceof X.AnonymousClass4pL
            if (r0 == 0) goto L_0x0225
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            com.whatsapp.jid.UserJid r0 = r3.A0o()
            boolean r2 = r0 instanceof X.C27981fH
            return r2
        L_0x0225:
            boolean r0 = r2 instanceof X.C93824pP
            if (r0 == 0) goto L_0x0243
            X.4pP r2 = (X.C93824pP) r2
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            X.2z0 r0 = r3.A1J
            X.4uZ r1 = r0.A00
            boolean r0 = X.C627336j.A0K(r1)
            if (r0 == 0) goto L_0x03f5
            X.2lX r0 = r2.A03
            boolean r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x03f5
            goto L_0x0061
        L_0x0243:
            boolean r0 = r2 instanceof X.C93854pS
            if (r0 == 0) goto L_0x0286
            X.4pS r2 = (X.C93854pS) r2
            r1 = 0
            X.C162457s7.A0J(r3, r1)
            X.2z0 r0 = r3.A1J
            X.4uZ r4 = r0.A00
            X.2ss r0 = r2.A03
            X.31A r1 = r0.A0A(r4, r1)
            boolean r0 = r1 instanceof X.AnonymousClass1RL
            if (r0 == 0) goto L_0x0061
            X.1RL r1 = (X.AnonymousClass1RL) r1
            if (r1 == 0) goto L_0x0061
            boolean r0 = r4 instanceof X.C95804uY
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = r1.A0G
            if (r0 == 0) goto L_0x0061
            X.2sH r0 = r2.A02
            boolean r0 = X.C106855aH.A03(r0, r3)
            if (r0 == 0) goto L_0x0061
            long r6 = r3.A1M
            r4 = -1
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0061
            boolean r0 = X.C627636p.A0l(r3)
            if (r0 != 0) goto L_0x0061
            X.1VX r1 = r2.A04
            r0 = 5188(0x1444, float:7.27E-42)
            boolean r2 = r1.A0X(r0)
            return r2
        L_0x0286:
            boolean r0 = r2 instanceof X.C93864pT
            if (r0 == 0) goto L_0x02f2
            X.4pT r2 = (X.C93864pT) r2
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            X.3Ex r1 = r2.A02
            X.2z0 r6 = r3.A1J
            X.4uZ r0 = r6.A00
            X.C626936e.A06(r0)
            X.3ZH r0 = r1.A06(r0)
            r5 = 0
            if (r0 == 0) goto L_0x00c6
            X.2qS r0 = r0.A0E
            int r1 = X.C623134n.A00(r0)
            r0 = 1
            if (r1 == r0) goto L_0x00c6
            X.5rC r1 = r2.A00
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x02bb
            r1.A04()
            boolean r0 = X.C57322tS.A00(r3)
            if (r0 == 0) goto L_0x02bb
            return r5
        L_0x02bb:
            r0 = 8388608(0x800000, float:1.17549435E-38)
            boolean r0 = r3.A1s(r0)
            if (r0 != 0) goto L_0x00c6
            X.1VX r1 = r2.A03
            r0 = 690(0x2b2, float:9.67E-43)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00c6
            X.5U1 r4 = r2.A04
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x00c6
            X.8qC r0 = r4.A01
            java.util.Iterator r2 = X.AnonymousClass0x2.A0j(r0)
        L_0x02d9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03e9
            java.lang.Object r0 = r2.next()
            X.66m r0 = (X.C1229566m) r0
            java.lang.Boolean r1 = r0.BIX(r3)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x02d9
            return r5
        L_0x02f2:
            boolean r0 = r2 instanceof X.C93844pR
            if (r0 == 0) goto L_0x0337
            X.4pR r2 = (X.C93844pR) r2
            X.2z0 r1 = X.C624134x.A07(r3)
            X.4uZ r4 = r1.A00
            boolean r0 = X.C627336j.A0K(r4)
            r5 = 0
            if (r0 == 0) goto L_0x00c6
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x030f
            int r1 = r3.A0D
            r0 = 6
            if (r1 == r0) goto L_0x030f
            return r5
        L_0x030f:
            X.2lX r0 = r2.A04
            boolean r0 = r0.A02(r4)
            if (r0 != 0) goto L_0x00c6
            boolean r0 = X.C57322tS.A00(r3)
            if (r0 != 0) goto L_0x00c6
            com.whatsapp.jid.UserJid r1 = X.C66493Lq.A00(r3)
            if (r1 == 0) goto L_0x00c6
            com.whatsapp.jid.UserJid r0 = r3.A0o()
            boolean r0 = X.C627336j.A0L(r0)
            if (r0 != 0) goto L_0x00c6
            X.3LP r0 = r2.A03
            boolean r0 = X.C57362tW.A00(r0, r1)
            if (r0 != 0) goto L_0x00c6
            goto L_0x03f3
        L_0x0337:
            boolean r0 = r2 instanceof X.C93624ou
            if (r0 == 0) goto L_0x0348
            X.4ou r2 = (X.C93624ou) r2
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            X.5Xm r0 = r2.A00
            boolean r2 = r0.A03(r3)
            return r2
        L_0x0348:
            boolean r0 = r2 instanceof X.AnonymousClass4p9
            if (r0 == 0) goto L_0x0359
            X.4p9 r2 = (X.AnonymousClass4p9) r2
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            X.5Xm r0 = r2.A00
            boolean r2 = r0.A02(r3)
            return r2
        L_0x0359:
            boolean r0 = r2 instanceof X.C93804pN
            if (r0 == 0) goto L_0x0372
            X.4pN r2 = (X.C93804pN) r2
            r5 = 0
            X.C162457s7.A0J(r3, r5)
            X.2z0 r4 = r3.A1J
            X.4uZ r1 = r4.A00
            boolean r0 = r1 instanceof X.C95804uY
            if (r0 == 0) goto L_0x0400
            X.2ss r0 = r2.A01
            r0.A0A(r1, r5)
            goto L_0x0061
        L_0x0372:
            boolean r0 = r2 instanceof X.AnonymousClass4pM
            if (r0 == 0) goto L_0x0397
            r4 = 0
            X.C162457s7.A0J(r3, r4)
            boolean r0 = r3 instanceof X.C30471mV
            if (r0 == 0) goto L_0x0061
            X.1mV r3 = (X.C30471mV) r3
            int r2 = X.C627636p.A00(r3)
            r0 = 2
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            X.C86624Kv.A1V(r1, r4)
            r0 = 1
            X.C86624Kv.A1V(r1, r0)
            java.util.Set r0 = X.C73833g9.A06(r1)
            boolean r2 = X.C18300x5.A1X(r0, r2)
            return r2
        L_0x0397:
            X.4pU r2 = (X.C93874pU) r2
            X.2z0 r1 = X.C624134x.A07(r3)
            X.4uZ r4 = r1.A00
            boolean r0 = X.C627336j.A0K(r4)
            r5 = 0
            if (r0 == 0) goto L_0x00c6
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x03b0
            int r1 = r3.A0D
            r0 = 6
            if (r1 == r0) goto L_0x03b0
            return r5
        L_0x03b0:
            X.2lX r0 = r2.A05
            boolean r0 = r0.A02(r4)
            if (r0 != 0) goto L_0x00c6
            com.whatsapp.jid.UserJid r1 = X.C66493Lq.A00(r3)
            if (r1 == 0) goto L_0x00c6
            X.3LP r0 = r2.A04
            boolean r0 = X.C57362tW.A00(r0, r1)
            if (r0 != 0) goto L_0x00c6
            boolean r0 = X.C57322tS.A00(r3)
            if (r0 != 0) goto L_0x00c6
            com.whatsapp.jid.UserJid r0 = r3.A0o()
            boolean r0 = X.C627336j.A0L(r0)
            if (r0 != 0) goto L_0x00c6
            X.3Ex r0 = r2.A02
            X.3ZH r0 = r0.A0A(r1)
            boolean r0 = r0.A0Q()
            if (r0 != 0) goto L_0x00c6
            X.2sr r0 = r2.A01
            boolean r0 = X.C86664Kz.A1W(r0)
            goto L_0x03f1
        L_0x03e9:
            X.67E r0 = X.AnonymousClass5U1.A00(r4, r3)
            boolean r0 = r0.BIY(r3)
        L_0x03f1:
            if (r0 == 0) goto L_0x00c6
        L_0x03f3:
            r5 = 1
            return r5
        L_0x03f5:
            boolean r0 = r1 instanceof X.C135216kJ
            if (r0 != 0) goto L_0x0061
            X.5U1 r0 = r2.A02
            boolean r2 = r0.A04(r3)
            return r2
        L_0x0400:
            boolean r2 = r4.A02
            if (r2 == 0) goto L_0x0427
            boolean r0 = r3.A1o()
            if (r0 != 0) goto L_0x0427
            byte r1 = r3.A1I
            r0 = 10
            if (r1 == r0) goto L_0x0427
            r0 = 90
            if (r1 == r0) goto L_0x0427
            boolean r0 = X.C627636p.A0l(r3)
            if (r0 != 0) goto L_0x0427
            int r1 = r3.A0D
            r0 = 4
            int r0 = X.AnonymousClass358.A00(r1, r0)
            boolean r0 = X.AnonymousClass001.A1U(r0)
            if (r0 != 0) goto L_0x042d
        L_0x0427:
            boolean r0 = r3 instanceof X.C30451mT
            if (r0 == 0) goto L_0x0061
            if (r2 == 0) goto L_0x0061
        L_0x042d:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113155ky.A00(X.34x):boolean");
    }
}
