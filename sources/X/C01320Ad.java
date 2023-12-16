package X;

import android.util.Pair;

/* renamed from: X.0Ad  reason: invalid class name and case insensitive filesystem */
public final class C01320Ad extends C13370n4 {
    public final AnonymousClass4GR A00;
    public final C85424Ge A01;
    public final C85424Ge A02;

    public boolean A05(Pair pair) {
        C162457s7.A0J(pair, 1);
        C85424Ge r0 = this.A01;
        Object obj = pair.first;
        AnonymousClass2A9.A00(obj, r0);
        C85424Ge r02 = this.A02;
        Object obj2 = pair.second;
        AnonymousClass2A9.A00(obj2, r02);
        return AnonymousClass001.A1Z(this.A00.invoke(obj, obj2));
    }

    public C01320Ad(AnonymousClass4GR r2, C85424Ge r3, C85424Ge r4) {
        super(C57982uW.A00(Pair.class));
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ boolean A04(Object obj, Object obj2) {
        return A05((Pair) obj2);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return this.A00.toString();
    }
}
