package X;

/* renamed from: X.0AB  reason: invalid class name */
public class AnonymousClass0AB extends C08750f0 {
    public AnonymousClass0A7 A00;

    public void Bef(C10560i8 r3) {
        AnonymousClass0A7 r1 = this.A00;
        int i = r1.A01 - 1;
        r1.A01 = i;
        if (i == 0) {
            r1.A04 = false;
            r1.A0H();
        }
        r3.A0C(this);
    }

    public void Bei(C10560i8 r3) {
        AnonymousClass0A7 r1 = this.A00;
        if (!r1.A04) {
            r1.A0J();
            r1.A04 = true;
        }
    }

    public AnonymousClass0AB(AnonymousClass0A7 r1) {
        this.A00 = r1;
    }
}
