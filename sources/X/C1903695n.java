package X;

import android.os.Handler;

/* renamed from: X.95n  reason: invalid class name and case insensitive filesystem */
public class C1903695n extends AnonymousClass9Yx implements C203649o5 {
    public AnonymousClass9PV A00 = new AnonymousClass9PV();
    public AnonymousClass9ZG A01;
    public boolean A02;
    public final AnonymousClass9MI A03;
    public final AnonymousClass9MJ A04;
    public final C203689o9 A05;
    public final C203679o8 A06;

    public void BZu(C183818qi r4) {
        AnonymousClass9ZG r0;
        Handler handler;
        if (!this.A02 && r4.BDx() == AnonymousClass22N.A0V) {
            AnonymousClass9LE r2 = C203649o5.A00;
            Object obj = Boolean.FALSE;
            Object B5l = this.A00.B5l(r2);
            if (B5l != null) {
                obj = B5l;
            }
            if (AnonymousClass001.A1Z(obj)) {
                AnonymousClass9PV r22 = this.A00;
                if (((AnonymousClass85S) r4).A00 == null && (r0 = r22.A00) != null && (handler = r0.A08) != null) {
                    handler.post(new AnonymousClass9hH(r22, r4));
                    return;
                }
                return;
            }
        }
        if (this.A02) {
            AnonymousClass9ZG r02 = this.A00.A00;
            r02.getClass();
            r02.A03(r4);
        }
    }

    public C1903695n(C203449ni r5) {
        super(r5);
        C203689o9 r0;
        AnonymousClass9MI r3 = new AnonymousClass9MI(this);
        this.A03 = r3;
        AnonymousClass9MJ r2 = new AnonymousClass9MJ(this);
        this.A04 = r2;
        AnonymousClass9LH r1 = C203689o9.A00;
        if (r5.BHH(r1)) {
            r0 = (C203689o9) r5.B5k(r1);
        } else {
            r0 = null;
        }
        this.A05 = r0;
        this.A06 = (C203679o8) r5.B5k(C203679o8.A00);
        AnonymousClass9ZG r12 = (AnonymousClass9ZG) this.A00.B5l(C203569nx.A00);
        this.A01 = r12;
        if (r12 != null) {
            this.A00.A00 = r12;
            r12.A09 = r3;
            r12.A0A = r2;
        }
    }
}
