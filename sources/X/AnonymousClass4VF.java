package X;

import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import com.whatsapp.countrygating.viewmodel.CountryGatingViewModel;
import com.whatsapp.tosgating.viewmodel.ToSGatingViewModel;

/* renamed from: X.4VF  reason: invalid class name */
public class AnonymousClass4VF extends C05550Ty {
    public AnonymousClass3ZH A00;
    public C95814uZ A01;
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();
    public final C620433g A03;
    public final C54232oO A04;
    public final C29301ib A05;
    public final C56942so A06;
    public final MemberSuggestedGroupsManager A07;
    public final C64773Ex A08;
    public final C56602sG A09;
    public final C29421in A0A;
    public final C49772h4 A0B;
    public final AnonymousClass4UA A0C;
    public final CountryGatingViewModel A0D;
    public final C56982ss A0E;
    public final C66473Lo A0F;
    public final C54442oj A0G;
    public final C56892sj A0H;
    public final AnonymousClass1VX A0I;
    public final C66493Lq A0J;
    public final C47732dj A0K;
    public final C28781hl A0L;
    public final AnonymousClass4AQ A0M;
    public final C50932j0 A0N;
    public final C55702qm A0O;
    public final C29241iV A0P;
    public final C52472lX A0Q;
    public final AnonymousClass5P0 A0R;
    public final C103985Pe A0S;
    public final ToSGatingViewModel A0T;
    public final C56072rN A0U;
    public final C72173dI A0V;
    public final AnonymousClass4UC A0W = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0X = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0Y = AnonymousClass0x9.A0b();

    public void A0C() {
        this.A0A.A07(this.A09);
        this.A05.A07(this.A04);
        this.A0P.A07(this.A0O);
        if (this.A00.A0U()) {
            this.A0N.A01(this.A0M);
            this.A0L.A07(this.A0K);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007b, code lost:
        if (r0.A00.A13 == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0092, code lost:
        if (r11 == 1) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b0, code lost:
        if (r0.A0I.A0X(5747) == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004c, code lost:
        if (r0.A0H.A0C((com.whatsapp.jid.GroupJid) X.AnonymousClass3ZH.A05(r0.A00, X.C27991fJ.class)) != false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D() {
        /*
            r34 = this;
            r0 = r34
            X.3ZH r1 = r0.A00
            X.4uZ r4 = X.AnonymousClass3ZH.A01(r1)
            X.3Lo r1 = r0.A0F
            X.3ZH r1 = r1.A01(r4)
            r0.A00 = r1
            boolean r1 = r1.A0U()
            if (r1 == 0) goto L_0x002e
            X.3ZH r1 = r0.A00
            com.whatsapp.jid.Jid r1 = X.AnonymousClass3ZH.A04(r1)
            if (r1 != 0) goto L_0x002e
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "conversation"
            r2.append(r1)
            X.3ZH r1 = r0.A00
            X.4uZ r1 = r1.A0H
            X.C18260x0.A0m(r1, r2)
        L_0x002e:
            X.1fJ r3 = X.AnonymousClass34R.A01(r4)
            X.3ZH r1 = r0.A00
            boolean r1 = r1.A0U()
            r2 = 1
            if (r1 == 0) goto L_0x004e
            X.2sj r6 = r0.A0H
            X.3ZH r5 = r0.A00
            java.lang.Class<X.1fJ> r1 = X.C27991fJ.class
            com.whatsapp.jid.Jid r1 = X.AnonymousClass3ZH.A05(r5, r1)
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            boolean r1 = r6.A0C(r1)
            r14 = 1
            if (r1 == 0) goto L_0x004f
        L_0x004e:
            r14 = 0
        L_0x004f:
            X.2lX r6 = r0.A0Q
            X.3ZH r1 = r0.A00
            boolean r20 = r6.A01(r1)
            X.3Lq r5 = r0.A0J
            X.3ZH r1 = r0.A00
            int r11 = r5.A02(r1)
            X.3ZH r1 = r0.A00
            boolean r21 = r6.A00(r1)
            X.2ss r1 = r0.A0E
            int r10 = r1.A06(r3)
            if (r3 == 0) goto L_0x007d
            X.2sj r1 = r0.A0H
            boolean r1 = r1.A0D(r3)
            if (r1 == 0) goto L_0x007d
            X.3ZH r1 = r0.A00
            boolean r1 = r1.A13
            r28 = 1
            if (r1 != 0) goto L_0x007f
        L_0x007d:
            r28 = 0
        L_0x007f:
            X.2rN r1 = r0.A0U
            boolean r1 = r1.A01()
            if (r1 == 0) goto L_0x0094
            if (r3 == 0) goto L_0x0094
            r1 = 3
            if (r10 != r1) goto L_0x0094
            if (r20 != 0) goto L_0x0094
            if (r21 != 0) goto L_0x0094
            r18 = 1
            if (r11 != r2) goto L_0x0096
        L_0x0094:
            r18 = 0
        L_0x0096:
            X.3ZH r1 = r0.A00
            boolean r1 = r1.A0R()
            if (r1 == 0) goto L_0x00b2
            X.3ZH r1 = r0.A00
            com.whatsapp.jid.Jid r1 = X.AnonymousClass3ZH.A03(r1)
            if (r1 == 0) goto L_0x00b2
            X.1VX r2 = r0.A0I
            r1 = 5747(0x1673, float:8.053E-42)
            boolean r1 = r2.A0X(r1)
            r30 = 1
            if (r1 != 0) goto L_0x00b4
        L_0x00b2:
            r30 = 0
        L_0x00b4:
            if (r18 != 0) goto L_0x00fd
            if (r28 != 0) goto L_0x00fd
            boolean r1 = X.C627336j.A0L(r4)
            if (r1 != 0) goto L_0x00fd
            if (r30 != 0) goto L_0x00fd
            X.08M r3 = r0.A02
            X.3ZH r6 = r0.A00
            r5 = 0
            boolean r15 = r6.A0j
            com.whatsapp.countrygating.viewmodel.CountryGatingViewModel r2 = r0.A0D
            X.4uZ r1 = r0.A01
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass32Y.A03(r1)
            boolean r16 = r2.A0D(r4)
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r2 = r0.A0T
            boolean r17 = r2.A0D(r4)
            boolean r19 = r0.A0F()
            boolean r22 = r0.A0E()
            X.5Pe r2 = r0.A0S
            boolean r0 = r1 instanceof X.C95804uY
            if (r0 == 0) goto L_0x00fb
            X.4uY r1 = (X.C95804uY) r1
        L_0x00e9:
            boolean r23 = r2.A01(r1)
            r12 = 0
            X.5R9 r4 = new X.5R9
            r8 = r5
            r9 = r5
            r7 = r5
            r13 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r3.A0G(r4)
            return
        L_0x00fb:
            r1 = 0
            goto L_0x00e9
        L_0x00fd:
            X.3dI r2 = r0.A0V
            X.5s6 r1 = new X.5s6
            r22 = r1
            r23 = r0
            r24 = r4
            r25 = r3
            r26 = r10
            r27 = r11
            r29 = r18
            r31 = r14
            r32 = r20
            r33 = r21
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r2.execute(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VF.A0D():void");
    }

    public boolean A0E() {
        AnonymousClass31A A002 = C56982ss.A00(this.A0E, this.A01);
        if (A002 instanceof AnonymousClass1RL) {
            AnonymousClass1RL r1 = (AnonymousClass1RL) A002;
            if (r1.A0K || r1.A07 != C372821q.OWNER) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean A0F() {
        return this.A0R.A00(this.A00, this.A01);
    }

    public AnonymousClass4VF(C620433g r12, C29301ib r13, C56942so r14, MemberSuggestedGroupsManager memberSuggestedGroupsManager, C64773Ex r16, C29421in r17, C49772h4 r18, AnonymousClass4UA r19, CountryGatingViewModel countryGatingViewModel, C56982ss r21, C66473Lo r22, C54442oj r23, C56892sj r24, AnonymousClass3ZH r25, AnonymousClass1VX r26, C66493Lq r27, C28781hl r28, C50932j0 r29, C29241iV r30, C52472lX r31, AnonymousClass5P0 r32, C95814uZ r33, C103985Pe r34, ToSGatingViewModel toSGatingViewModel, C56072rN r36, AnonymousClass4FS r37) {
        AnonymousClass681 A002 = AnonymousClass681.A00(this, 22);
        this.A09 = A002;
        C1233167y r4 = new C1233167y(this, 10);
        this.A04 = r4;
        AnonymousClass687 r3 = new AnonymousClass687(this, 11);
        this.A0O = r3;
        AnonymousClass697 r2 = new AnonymousClass697(this, 6);
        this.A0M = r2;
        AnonymousClass686 r1 = new AnonymousClass686(this, 1);
        this.A0K = r1;
        this.A0I = r26;
        this.A0E = r21;
        this.A08 = r16;
        this.A0U = r36;
        this.A0R = r32;
        C29421in r7 = r17;
        this.A0A = r7;
        this.A0Q = r31;
        this.A05 = r13;
        C28781hl r6 = r28;
        this.A0L = r6;
        this.A06 = r14;
        this.A03 = r12;
        this.A0B = r18;
        this.A0S = r34;
        this.A0G = r23;
        C29241iV r8 = r30;
        this.A0P = r8;
        C50932j0 r9 = r29;
        this.A0N = r9;
        this.A01 = r33;
        this.A0C = r19;
        this.A0D = countryGatingViewModel;
        this.A0T = toSGatingViewModel;
        this.A0F = r22;
        this.A0H = r24;
        this.A0J = r27;
        this.A07 = memberSuggestedGroupsManager;
        AnonymousClass3ZH r10 = r25;
        this.A00 = r10;
        this.A0V = C72173dI.A00(r37);
        r7.A06(A002);
        r13.A06(r4);
        r8.A06(r3);
        if (r10.A0U()) {
            r9.A00(r2);
            r6.A06(r1);
        }
    }
}
