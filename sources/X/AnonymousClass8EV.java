package X;

/* renamed from: X.8EV  reason: invalid class name */
public class AnonymousClass8EV implements C184048rA {
    public final /* synthetic */ AnonymousClass5Y9 A00;
    public final /* synthetic */ C148917Kf A01;
    public final /* synthetic */ String A02;

    public AnonymousClass8EV(AnonymousClass5Y9 r1, C148917Kf r2, String str) {
        this.A02 = str;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BTH(String str, int i) {
        if (this.A02.equals(str)) {
            C148917Kf r3 = this.A01;
            AnonymousClass39B r1 = r3.A02.A01;
            if (r1.A00) {
                r1.A00 = true;
                r3.A00.A05.A0b(r3.A01, -1);
            }
            this.A00.A0P.remove(this);
        }
    }

    public void BTI(AnonymousClass7PB r5, String str) {
        if (this.A02.equals(str)) {
            C148917Kf r3 = this.A01;
            AnonymousClass39B r1 = r3.A02.A01;
            if (r1.A00) {
                r1.A00 = false;
                r3.A00.A05.A0b(r3.A01, -1);
            }
            this.A00.A0P.remove(this);
        }
    }
}
