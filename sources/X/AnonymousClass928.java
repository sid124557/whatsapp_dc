package X;

/* renamed from: X.928  reason: invalid class name */
public class AnonymousClass928 implements C182668on {
    public final int A00;

    public AnonymousClass928(int i) {
        this.A00 = i;
    }

    public final void BGm(C179468jC r5) {
        AnonymousClass5TK r2;
        int i;
        int i2;
        int i3 = this.A00;
        AnonymousClass4LC r0 = ((C171438Hb) r5).A00;
        switch (i3) {
            case 0:
                r2 = r0.A0G;
                i = r0.A0D;
                i2 = 1;
                break;
            case 1:
                r2 = r0.A0G;
                i = r0.A0B;
                i2 = 2;
                break;
            case 2:
                r2 = r0.A0G;
                i = r0.A0C;
                i2 = 3;
                break;
            default:
                AnonymousClass5TK r3 = r0.A0G;
                if (!r3.A03) {
                    C150537Re r22 = r3.A0A;
                    r22.A00(4);
                    r3.A04 = true;
                    r22.A00.A07.A01(r3.A07);
                    r3.A02 = r3.A06;
                    return;
                }
                return;
        }
        r2.A01(i2, i);
    }
}
