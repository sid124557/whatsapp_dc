package X;

/* renamed from: X.9UG  reason: invalid class name */
public class AnonymousClass9UG implements C202369lu {
    public Object A00;
    public final int A01;

    public AnonymousClass9UG(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Be8() {
        switch (this.A01) {
            case 0:
                AnonymousClass9ZW r3 = (AnonymousClass9ZW) this.A00;
                if (!r3.A0H) {
                    return;
                }
                if (r3.A0F == 1 || r3.A0F == 7) {
                    r3.A0F = 0;
                    r3.A0A = Boolean.FALSE;
                    r3.A03 = new C201699ka("Failed to start operation. Operation timed out.");
                    return;
                } else if (r3.A0F == 2 || r3.A0F == 3 || r3.A0F == 4) {
                    r3.A0F = 0;
                    return;
                } else {
                    return;
                }
            case 1:
                C195739Zi r1 = (C195739Zi) this.A00;
                r1.A03 = 0;
                r1.A05 = Boolean.FALSE;
                return;
            default:
                AnonymousClass9ZV r2 = (AnonymousClass9ZV) this.A00;
                r2.A08 = Boolean.FALSE;
                r2.A06 = new C201699ka("Photo capture failed. Still capture timed out.");
                return;
        }
    }
}
