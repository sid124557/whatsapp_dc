package com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass107;
import X.AnonymousClass3EZ;
import X.AnonymousClass4FS;
import X.AnonymousClass4HI;
import X.AnonymousClass4IE;
import X.C05550Ty;
import X.C117695sL;
import X.C29241iV;
import X.C29281iZ;
import X.C50392i6;
import X.C55422qK;
import X.C55702qm;
import X.C56612sH;
import X.C56892sj;
import X.C56972sr;
import X.C620733j;
import X.C64573Ea;
import X.C64773Ex;
import X.C84354Ca;
import X.C84904Ee;
import X.C95814uZ;
import java.util.ArrayList;
import java.util.Collection;

public class UpcomingActivityViewModel extends C05550Ty {
    public final C56972sr A00;
    public final C64773Ex A01;
    public final C56612sH A02;
    public final C620733j A03;
    public final C56892sj A04;
    public final C55422qK A05;
    public final C55702qm A06;
    public final C29241iV A07;
    public final C84904Ee A08;
    public final C29281iZ A09;
    public final AnonymousClass107 A0A = new AnonymousClass107(AnonymousClass001.A0s());
    public final AnonymousClass4FS A0B;

    public static /* synthetic */ void A00(UpcomingActivityViewModel upcomingActivityViewModel, C95814uZ r11, String str, int i, long j) {
        if (i != 0) {
            AnonymousClass107 r8 = upcomingActivityViewModel.A0A;
            ArrayList A0J = AnonymousClass002.A0J((Collection) r8.A07());
            ArrayList A0s = AnonymousClass001.A0s();
            int i2 = 0;
            for (int i3 = 0; i3 < A0J.size(); i3++) {
                C84354Ca r2 = (C84354Ca) A0J.get(i3);
                if (r2 instanceof AnonymousClass3EZ) {
                    i2 = i3;
                } else {
                    C64573Ea r10 = (C64573Ea) r2;
                    if (r10.A01.A02 != j) {
                        C50392i6 r1 = r10.A01;
                        if (r1.A04.equals(r11)) {
                            if (!r1.A07.equals(str)) {
                            }
                        }
                    }
                    A0s.add(r2);
                    if (i3 - 1 == i2 && (i3 == AnonymousClass0x9.A03(A0J, 1) || (A0J.get(i3 + 1) instanceof AnonymousClass3EZ))) {
                        A0s.add(A0J.get(i2));
                    }
                }
            }
            A0J.removeAll(A0s);
            r8.A0H(A0J);
            return;
        }
        upcomingActivityViewModel.A0B.BkP(new C117695sL((Object) upcomingActivityViewModel, 23));
    }

    public void A0C() {
        this.A09.A07(this.A08);
        this.A07.A07(this.A06);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0080, code lost:
        if (r0.A0D(r4) != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0089, code lost:
        if (r2 < java.lang.System.currentTimeMillis()) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008b, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008c, code lost:
        r3 = new X.AnonymousClass2NE();
        r3.A01 = r8;
        r2 = r5.A00;
        r0 = com.whatsapp.R.drawable.ic_action_call;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0099, code lost:
        if (r2 != 2) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009b, code lost:
        r0 = com.whatsapp.R.drawable.ic_action_videocall;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009e, code lost:
        r3.A00 = r0;
        r3.A02 = r4;
        r1 = new X.C48912fg();
        r1.A01 = r8;
        r1.A00 = r0;
        r1.A02 = r4;
        r6.add(new X.C64573Ea(r1, r5, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        if (X.C107175ap.A05(r7.getTimeInMillis(), r2) == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D() {
        /*
            r13 = this;
            X.2qK r0 = r13.A05
            java.util.List r0 = r0.A04()
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Iterator r12 = r0.iterator()
            r7 = 0
        L_0x000f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r5 = r12.next()
            X.2i6 r5 = (X.C50392i6) r5
            long r2 = r5.A03
            if (r7 == 0) goto L_0x00b7
            long r0 = r7.getTimeInMillis()
            boolean r0 = X.C107175ap.A05(r0, r2)
            if (r0 != 0) goto L_0x005b
        L_0x0029:
            r7.setTimeInMillis(r2)
            X.33j r9 = r13.A03
            java.util.Locale r4 = X.C620733j.A02(r9)
            java.lang.String r1 = "EEEE"
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r0.<init>(r1, r4)
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
            java.lang.String r4 = r0.format(r8)
            java.util.Locale r1 = X.C620733j.A02(r9)
            r0 = 2
            java.text.DateFormat r0 = java.text.DateFormat.getDateInstance(r0, r1)
            java.lang.String r0 = r0.format(r8)
            X.2jc r1 = new X.2jc
            r1.<init>(r4, r0)
            X.3EZ r0 = new X.3EZ
            r0.<init>(r1)
            r6.add(r0)
        L_0x005b:
            X.3Ex r0 = r13.A01
            X.4uZ r1 = r5.A04
            X.3ZH r9 = r0.A0A(r1)
            X.33j r0 = r13.A03
            java.lang.String r8 = X.C107145am.A00(r0, r2)
            X.1fJ r4 = X.AnonymousClass34R.A01(r1)
            X.2sr r1 = r13.A00
            com.whatsapp.jid.UserJid r0 = r5.A05
            boolean r0 = r1.A0a(r0)
            if (r0 != 0) goto L_0x0082
            X.2sj r0 = r13.A04
            X.C626936e.A06(r4)
            boolean r0 = r0.A0D(r4)
            if (r0 == 0) goto L_0x008b
        L_0x0082:
            long r10 = java.lang.System.currentTimeMillis()
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            r4 = 1
            if (r0 >= 0) goto L_0x008c
        L_0x008b:
            r4 = 0
        L_0x008c:
            X.2NE r3 = new X.2NE
            r3.<init>()
            r3.A01 = r8
            int r2 = r5.A00
            r1 = 2
            r0 = 2131231718(0x7f0803e6, float:1.8079525E38)
            if (r2 != r1) goto L_0x009e
            r0 = 2131231803(0x7f08043b, float:1.8079697E38)
        L_0x009e:
            r3.A00 = r0
            r3.A02 = r4
            X.2fg r1 = new X.2fg
            r1.<init>()
            r1.A01 = r8
            r1.A00 = r0
            r1.A02 = r4
            X.3Ea r0 = new X.3Ea
            r0.<init>(r1, r5, r9)
            r6.add(r0)
            goto L_0x000f
        L_0x00b7:
            java.util.Calendar r7 = java.util.Calendar.getInstance()
            goto L_0x0029
        L_0x00bd:
            X.107 r0 = r13.A0A
            r0.A0G(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel.UpcomingActivityViewModel.A0D():void");
    }

    public UpcomingActivityViewModel(C56972sr r5, C64773Ex r6, C56612sH r7, C620733j r8, C56892sj r9, C55422qK r10, C29241iV r11, C29281iZ r12, AnonymousClass4FS r13) {
        AnonymousClass4IE r3 = new AnonymousClass4IE(this, 1);
        this.A08 = r3;
        AnonymousClass4HI r2 = new AnonymousClass4HI(this, 1);
        this.A06 = r2;
        this.A02 = r7;
        this.A00 = r5;
        this.A0B = r13;
        this.A01 = r6;
        this.A03 = r8;
        this.A05 = r10;
        this.A09 = r12;
        this.A04 = r9;
        this.A07 = r11;
        r12.A06(r3);
        r11.A06(r2);
    }
}
