package X;

import java.util.Objects;

/* renamed from: X.4Ia  reason: invalid class name and case insensitive filesystem */
public class C85894Ia implements AnonymousClass4EV {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public void BRX(C625435m r12, C56902sk r13) {
        int i = this.A03;
        boolean A1T = AnonymousClass000.A1T(r12.A01);
        C56902sk r4 = r13;
        if (i != 0) {
            if (!A1T) {
                Object obj = this.A01;
                AnonymousClass4FS r1 = ((AnonymousClass301) this.A00).A0S;
                Objects.requireNonNull(obj);
                C69963Zi.A01(r1, obj, 26);
                return;
            }
            ((AnonymousClass301) this.A00).A0S.BkM(new C71593cM((Object) this, (Object) r4, this.A02, this.A01, 30));
        } else if (A1T) {
            ((C65193Go) this.A00).A15.BkM(new C71593cM((Object) this, this.A02, (Object) r13, this.A01, 11));
        }
    }

    public C85894Ia(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = obj3;
        this.A01 = obj2;
    }

    public /* synthetic */ void BRU(long j) {
    }

    public /* synthetic */ void BRW(boolean z) {
    }
}
