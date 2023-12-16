package X;

import com.whatsapp.util.Log;

/* renamed from: X.4VH  reason: invalid class name */
public final class AnonymousClass4VH extends C05550Ty {
    public final C06270Wx A00;
    public final AnonymousClass5TN A01;
    public final C56612sH A02;
    public final AnonymousClass33p A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass107 A05;

    public AnonymousClass4VH(C69263Wi r27, AnonymousClass5TN r28, C56612sH r29, AnonymousClass33p r30, AnonymousClass1VX r31, C95814uZ r32, AnonymousClass1R1 r33, boolean z, boolean z2) {
        int i;
        C56612sH r3 = r29;
        C162457s7.A0J(r3, 1);
        C69263Wi r5 = r27;
        AnonymousClass33p r1 = r30;
        AnonymousClass1VX r0 = r31;
        AnonymousClass1R1 r2 = r33;
        C18260x0.A0e(r0, r1, r5, r2);
        this.A02 = r3;
        this.A04 = r0;
        this.A03 = r1;
        AnonymousClass5TN r34 = r28;
        this.A01 = r34;
        int i2 = 0;
        AnonymousClass107 A0O = AnonymousClass4L0.A0O(new C106025Xi(0, 0, false, true, false, false, false, false));
        this.A05 = A0O;
        C06270Wx A012 = C05110Rz.A01(C05110Rz.A00(new AnonymousClass921(this, 0), A0O));
        this.A00 = A012;
        C106025Xi r12 = (C106025Xi) A0O.A07();
        boolean z3 = r34.A03;
        boolean z4 = r34.A02;
        C95814uZ r02 = r32;
        if (r32 != null && z2 && z4 && (i = AnonymousClass1R1.A00(r02, r2).A02) != 0 && i == 1) {
            i2 = 1;
        }
        C162457s7.A0H(r12);
        boolean z5 = r12.A07;
        boolean z6 = r12.A04;
        int i3 = r12.A01;
        boolean z7 = z5;
        boolean z8 = z6;
        boolean z9 = z3;
        A0O.A0H(new C106025Xi(i2, i3, z7, z8, z9, z4, z, r12.A06));
        A012.A0E(AnonymousClass4L0.A0G(new C175458Yl(r5, C117625sE.A00(this, 15)), 222));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        if (r15 == 1) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(int r15) {
        /*
            r14 = this;
            r0 = 1
            r7 = r15
            if (r15 == r0) goto L_0x003f
            r0 = 2
            if (r15 == r0) goto L_0x0038
            r0 = 1
            if (r15 != r0) goto L_0x001a
        L_0x000a:
            X.33p r1 = r14.A03
            java.lang.String r0 = "wa-shared-prefs/setPushToVideoNuxShown"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r1)
            java.lang.String r0 = "push_to_video_nux_shown"
            X.C18270x1.A0f(r1, r0)
        L_0x001a:
            X.107 r1 = r14.A05
            java.lang.Object r0 = X.C86634Kw.A0v(r1)
            X.5Xi r0 = (X.C106025Xi) r0
            r8 = 1
            boolean r9 = r0.A04
            boolean r10 = r0.A03
            boolean r11 = r0.A02
            int r6 = r0.A00
            boolean r12 = r0.A05
            boolean r13 = r0.A06
            X.5Xi r5 = new X.5Xi
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.A0H(r5)
        L_0x0037:
            return
        L_0x0038:
            X.5TN r0 = r14.A01
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x001a
            return
        L_0x003f:
            X.107 r0 = r14.A05
            java.lang.Object r1 = r0.A07()
            X.5Xi r1 = (X.C106025Xi) r1
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0037
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0037
            X.33p r5 = r14.A03
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r5)
            java.lang.String r6 = "registration_initialized_time"
            long r3 = X.AnonymousClass0x2.A0B(r0, r6)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0037
            long r3 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r5)
            long r0 = X.AnonymousClass0x2.A0B(r0, r6)
            long r3 = r3 - r0
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0037
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r5)
            java.lang.String r0 = "push_to_video_nux_shown"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 != 0) goto L_0x0037
            X.1VX r0 = r14.A04
            boolean r0 = X.C100375Ar.A00(r5, r0)
            if (r0 != 0) goto L_0x0037
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VH.A0F(int):void");
    }

    public final void A0D() {
        AnonymousClass107 r2 = this.A05;
        C106025Xi r1 = (C106025Xi) C86634Kw.A0v(r2);
        if (r1.A07) {
            r2.A0H(new C106025Xi(r1.A00, r1.A01, false, r1.A04, r1.A03, r1.A02, r1.A05, r1.A06));
        }
    }

    public final void A0E(int i) {
        AnonymousClass107 r3 = this.A05;
        C106025Xi r1 = (C106025Xi) C86634Kw.A0v(r3);
        int i2 = r1.A00;
        int i3 = i;
        if (i == i2) {
            return;
        }
        if (!this.A01.A06) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("|conversation/viewmodel/ConversationEntryActionButtonViewModel/setRecorderMode called despite canToggleRecorderMode=false;\n             |  prevRecorderMode=");
            A0o.append(i2);
            Log.e(C830345w.A09(AnonymousClass000.A0Y(";\n             |  nextRecorderMode=", A0o, i)));
            return;
        }
        r3.A0H(new C106025Xi(i3, r1.A01, r1.A07, r1.A04, r1.A03, r1.A02, r1.A05, r1.A06));
    }

    public final void A0G(boolean z) {
        AnonymousClass107 r1 = this.A05;
        boolean z2 = z;
        if (((C106025Xi) C86634Kw.A0v(r1)).A04 != z) {
            C106025Xi r0 = (C106025Xi) C86634Kw.A0v(r1);
            r1.A0H(new C106025Xi(r0.A00, r0.A01, r0.A07, z2, r0.A03, r0.A02, r0.A05, r0.A06));
            if (!z) {
                A0D();
            }
        }
    }

    public final void A0H(boolean z) {
        boolean z2;
        AnonymousClass107 r3 = this.A05;
        C106025Xi r4 = (C106025Xi) C86634Kw.A0v(r3);
        boolean z3 = r4.A06;
        boolean z4 = z;
        if (z == z3) {
            return;
        }
        if (this.A01.A00 == 2) {
            if (z) {
                z2 = false;
            } else {
                z2 = ((C106025Xi) r3.A07()).A07;
            }
            r3.A0H(new C106025Xi(r4.A00, r4.A01, z2, r4.A04, r4.A03, r4.A02, r4.A05, z4));
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("|conversation/viewmodel/ConversationEntryActionButtonViewModel/isRecorderModeMenuVisible set despite isRecorderModeMenuEnabled=false;\n             |  prevIsRecorderModeMenuVisible=");
        A0o.append(z3);
        Log.e(C830345w.A09(AnonymousClass000.A0b(";\n             |  nextIsRecorderModeMenuVisible=", A0o, z)));
    }
}
