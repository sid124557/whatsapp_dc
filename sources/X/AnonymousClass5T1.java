package X;

import android.content.SharedPreferences;

/* renamed from: X.5T1  reason: invalid class name */
public final class AnonymousClass5T1 {
    public final C56972sr A00;
    public final AnonymousClass33p A01;
    public final AnonymousClass4FV A02;
    public final AnonymousClass5UP A03;
    public final AnonymousClass5Z6 A04;
    public final C102185Hu A05;

    public final void A00(int i) {
        AnonymousClass4FV r2 = this.A02;
        AnonymousClass1Y2 r1 = new AnonymousClass1Y2();
        r1.A01 = 46;
        r1.A00 = Integer.valueOf(i);
        r2.BhD(r1);
    }

    public final void A01(AnonymousClass5RK r5) {
        SharedPreferences.Editor putBoolean;
        if (r5 instanceof C988053h) {
            AnonymousClass33p r0 = this.A01;
            r0.A0z();
            putBoolean = C18270x1.A03(r0).putBoolean("nux_status_banner_ackd_in_updates", true);
        } else if (r5 instanceof C988153i) {
            C18270x1.A0l(C18270x1.A03(this.A01), "nux_updates_banner_ack", true);
            AnonymousClass5Z6 r2 = this.A04;
            AnonymousClass588 r1 = AnonymousClass588.UPDATES;
            C162457s7.A0J(r1, 0);
            putBoolean = C18270x1.A03(r2.A00).putBoolean(AnonymousClass5Z6.A00(r1), true);
        } else if (r5 instanceof C987953g) {
            throw AnonymousClass001.A0e("Archive status banner is not active - it is not allowed to be changed");
        } else {
            return;
        }
        putBoolean.apply();
    }

    public AnonymousClass5T1(C56972sr r2, AnonymousClass33p r3, AnonymousClass4FV r4, AnonymousClass5UP r5, AnonymousClass5Z6 r6, C102185Hu r7) {
        C18260x0.A0d(r2, r3, r5, r4);
        C162457s7.A0J(r6, 6);
        this.A00 = r2;
        this.A01 = r3;
        this.A05 = r7;
        this.A03 = r5;
        this.A02 = r4;
        this.A04 = r6;
    }
}
