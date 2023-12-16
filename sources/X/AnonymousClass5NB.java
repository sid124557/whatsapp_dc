package X;

import java.util.Map;

/* renamed from: X.5NB  reason: invalid class name */
public final class AnonymousClass5NB {
    public final AnonymousClass1VX A00;
    public final C104815Sl A01;

    public final void A00(Integer num, String str, short s) {
        if (num != null) {
            String A0P = AnonymousClass000.A0P(num, str, AnonymousClass001.A0o());
            C104815Sl r1 = this.A01;
            int intValue = num.intValue();
            C162457s7.A0J(A0P, 0);
            Map map = r1.A03;
            AnonymousClass316 r0 = (AnonymousClass316) map.get(A0P);
            if (r0 != null) {
                r0.A07(intValue, s);
                map.remove(A0P);
            }
        }
    }

    public AnonymousClass5NB(AnonymousClass1VX r1, C104815Sl r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
