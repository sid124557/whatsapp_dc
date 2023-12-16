package X;

/* renamed from: X.10q  reason: invalid class name */
public final class AnonymousClass10q extends C05550Ty {
    public final C44532Wk A00;
    public final AnonymousClass9TB A01;
    public final String A02;

    public AnonymousClass10q(C44532Wk r2, String str) {
        AnonymousClass9TB r0;
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A02 = str;
        synchronized (r2) {
            r0 = (AnonymousClass9TB) r2.A00.get(str);
        }
        if (r0 != null) {
            this.A01 = r0;
            return;
        }
        throw AnonymousClass001.A0g("No observer attached to the given FDS Manager ID");
    }

    public void A0C() {
        C44532Wk r2 = this.A00;
        String str = this.A02;
        synchronized (r2) {
            r2.A00.remove(str);
        }
        this.A01.A02();
    }
}
