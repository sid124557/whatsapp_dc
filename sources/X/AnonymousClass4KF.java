package X;

/* renamed from: X.4KF  reason: invalid class name */
public class AnonymousClass4KF implements AnonymousClass4C1 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public AnonymousClass4KF(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj4;
        this.A03 = obj3;
    }

    public final Object get() {
        if (this.A04 != 0) {
            return new C64393Dh((C54292oU) ((C183538qC) this.A00).get(), (C183538qC) this.A01, (C183538qC) this.A02, (C183538qC) this.A03);
        }
        return new C49692gw((AnonymousClass5ZR) this.A03, (C61072zf) this.A02, AnonymousClass002.A0A(AnonymousClass310.A00((AnonymousClass310) this.A01), ".trash"));
    }
}
