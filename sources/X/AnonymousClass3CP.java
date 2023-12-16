package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3CP  reason: invalid class name */
public final class AnonymousClass3CP implements C184998st {
    public boolean A00;
    public final ViewGroup A01;
    public final C56972sr A02;
    public final C50382i5 A03;
    public final C53602nM A04;
    public final C55262q4 A05;
    public final AnonymousClass33p A06;
    public final AnonymousClass1VX A07;
    public final AnonymousClass4FV A08;
    public final C627736r A09;
    public final C106715a2 A0A;
    public final AnonymousClass66R A0B = C154517dI.A01(new C76793sM(this));

    public AnonymousClass3CP(ViewGroup viewGroup, C56972sr r3, C50382i5 r4, C53602nM r5, C55262q4 r6, AnonymousClass33p r7, AnonymousClass1VX r8, AnonymousClass4FV r9, C627736r r10, C106715a2 r11) {
        C18260x0.A0b(r8, r6, r5, 3);
        C18260x0.A0g(r11, r3, r4, r9, r7);
        this.A01 = viewGroup;
        this.A09 = r10;
        this.A07 = r8;
        this.A05 = r6;
        this.A04 = r5;
        this.A0A = r11;
        this.A02 = r3;
        this.A03 = r4;
        this.A08 = r9;
        this.A06 = r7;
    }

    public final void A00() {
        C183538qC r4 = this.A06.A01;
        if (C18300x5.A0B(r4).getBoolean("username_ever_set", false)) {
            C55262q4 r2 = this.A05;
            if (!r2.A01().getBoolean("username_is_set_triggered", false)) {
                C18270x1.A0f(C55262q4.A00(r2), "username_is_set_triggered");
            }
        }
        if (C18300x5.A0B(r4).getBoolean("username_chats_ever_existed", false)) {
            C55262q4 r22 = this.A05;
            if (!r22.A01().getBoolean("username_chats_exist_triggered", false)) {
                C18270x1.A0f(C55262q4.A00(r22), "username_chats_exist_triggered");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r3.A05.A01().getBoolean("username_is_set_triggered", false) != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(int r4) {
        /*
            r3 = this;
            X.33p r0 = r3.A06
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "username_ever_set"
            r2 = 0
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x0020
            X.2q4 r0 = r3.A05
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = "username_is_set_triggered"
            boolean r0 = r1.getBoolean(r0, r2)
            r2 = 1
            if (r0 == 0) goto L_0x0021
        L_0x0020:
            r2 = 2
        L_0x0021:
            X.1Xn r1 = new X.1Xn
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A01 = r0
            X.4FV r0 = r3.A08
            r0.BhD(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CP.A01(int):void");
    }

    public void BFb() {
        if (this.A00) {
            ((View) this.A0B.getValue()).setVisibility(8);
        }
    }

    public boolean Bo4() {
        if (!this.A02.A0Y() || !this.A07.A0Y(C58422vE.A02, 5735)) {
            return false;
        }
        C183538qC r3 = this.A06.A01;
        if (C18300x5.A0B(r3).getBoolean("username_ever_set", false) && !this.A05.A01().getBoolean("username_is_set_triggered", false)) {
            return true;
        }
        if (!C18300x5.A0B(r3).getBoolean("username_chats_ever_existed", false) || this.A05.A01().getBoolean("username_chats_exist_triggered", false)) {
            return false;
        }
        return true;
    }

    public void BrS() {
        boolean Bo4 = Bo4();
        boolean z = this.A00;
        if (Bo4) {
            if (!z) {
                this.A01.addView((View) this.A0B.getValue());
                this.A00 = true;
            }
            ((View) this.A0B.getValue()).setVisibility(0);
            A01(1);
        } else if (z) {
            BFb();
        }
    }
}
