package X;

import android.content.Context;

/* renamed from: X.84p  reason: invalid class name and case insensitive filesystem */
public final class C1682284p implements C185318tS {
    public final String A00;
    public final /* synthetic */ C1443171b A01;
    public final /* synthetic */ AnonymousClass4GR A02;

    public /* bridge */ /* synthetic */ Object Axn(Context context, Object obj, Object obj2, Object obj3) {
        C162457s7.A0J(obj, 1);
        return this.A02.invoke(this.A01, obj);
    }

    public C1682284p(C1443171b r3, AnonymousClass7V9 r4, AnonymousClass4GR r5) {
        this.A02 = r5;
        this.A01 = r3;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("binder:");
        this.A00 = AnonymousClass000.A0R(Integer.valueOf(r4.A00.size()), A0o);
    }

    public String B6x() {
        return this.A00;
    }

    public /* bridge */ /* synthetic */ boolean Bob(Object obj, Object obj2, Object obj3, Object obj4) {
        if (obj == null) {
            if (obj2 == null) {
                return false;
            }
            return true;
        } else if (obj2 != null) {
            return !C153937cI.A00(obj, obj2);
        } else {
            return true;
        }
    }

    public /* bridge */ /* synthetic */ void BrF(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        C180518lC r6 = (C180518lC) obj4;
        C162457s7.A0J(r6, 4);
        r6.Beq();
    }
}
