package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.6N9  reason: invalid class name */
public final class AnonymousClass6N9 extends C161797qU {
    public final C161797qU A00;

    public void A0F(Context context, AnonymousClass7JD r14, AnonymousClass7ON r15, AnonymousClass7XT r16, C161797qU r17, Object obj, Object obj2, Object obj3, boolean z) {
        C161797qU r1 = r17;
        C18260x0.A0P(context, r1);
        this.A00.A0F(context, r14, r15, r16, ((AnonymousClass6N9) r1).A00, obj, obj2, obj3, z);
        super.A0F(context, r14, r15, r16, r17, obj, obj2, obj3, z);
    }

    public void A0G(Context context, AnonymousClass7JD r8, AnonymousClass7XT r9, Object obj, Object obj2) {
        C162457s7.A0J(context, 0);
        this.A00.A0G(context, r8, r9, obj, obj2);
        super.A0G(context, r8, r9, obj, obj2);
    }

    public void A0H(Context context, AnonymousClass7JD r8, AnonymousClass7XT r9, Object obj, Object obj2) {
        Context context2 = context;
        C162457s7.A0J(context, 0);
        AnonymousClass7JD r2 = r8;
        AnonymousClass7XT r3 = r9;
        Object obj3 = obj;
        Object obj4 = obj2;
        super.A0H(context2, r2, r3, obj3, obj4);
        this.A00.A0H(context2, r2, r3, obj3, obj4);
    }

    public void A0I(Context context, AnonymousClass7JD r8, AnonymousClass7XT r9, Object obj, Object obj2) {
        C162457s7.A0J(context, 0);
        this.A00.A0I(context, r8, r9, obj, obj2);
        super.A0I(context, r8, r9, obj, obj2);
    }

    public void A0J(Context context, AnonymousClass7JD r8, AnonymousClass7XT r9, Object obj, Object obj2) {
        Context context2 = context;
        C162457s7.A0J(context, 0);
        AnonymousClass7JD r2 = r8;
        AnonymousClass7XT r3 = r9;
        Object obj3 = obj;
        Object obj4 = obj2;
        super.A0J(context2, r2, r3, obj3, obj4);
        this.A00.A0J(context2, r2, r3, obj3, obj4);
    }

    public void A0K(C157267i1 r5) {
        C162457s7.A0J(r5, 0);
        C161797qU r3 = this.A00;
        Map map = r3.A02;
        if (map != null && !map.isEmpty()) {
            Map map2 = r3.A02;
            C185318tS r2 = r5.A00;
            if (map2.containsKey(r2.getClass())) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Binder ");
                A0o.append(r2.B6x());
                A0o.append(" already exists in the wrapped ");
                throw AnonymousClass000.A0F(r3.A0E(), A0o);
            }
        }
        super.A0K(r5);
    }

    public void A0L(C157267i1 r5) {
        C162457s7.A0J(r5, 0);
        C161797qU r3 = this.A00;
        Map map = r3.A03;
        if (map != null && !map.isEmpty()) {
            Map map2 = r3.A03;
            C185318tS r2 = r5.A00;
            if (map2.containsKey(r2.getClass())) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Binder ");
                A0o.append(r2.B6x());
                A0o.append(" already exists in the wrapped ");
                throw AnonymousClass000.A0F(r3.A0E(), A0o);
            }
        }
        super.A0L(r5);
    }

    public AnonymousClass6N9(C161797qU r2) {
        super(r2.A04);
        this.A00 = r2;
    }
}
