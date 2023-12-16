package X;

/* renamed from: X.0Pc  reason: invalid class name */
public final class AnonymousClass0Pc {
    public C10060hK A00;
    public AnonymousClass05G A01 = AnonymousClass05G.A00();
    public Object A02;
    public boolean A03;

    public void A00() {
        this.A02 = null;
        this.A00 = null;
        this.A01.A07((Object) null);
    }

    public void A01(Object obj) {
        this.A03 = true;
        C10060hK r0 = this.A00;
        if (r0 != null && r0.A01(obj)) {
            this.A02 = null;
            this.A00 = null;
            this.A01 = null;
        }
    }

    public void finalize() {
        AnonymousClass05G r1;
        C10060hK r2 = this.A00;
        if (r2 != null && !r2.isDone()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
            r2.A00(new C13930ny(AnonymousClass000.A0R(this.A02, A0o)));
        }
        if (!this.A03 && (r1 = this.A01) != null) {
            r1.A07((Object) null);
        }
    }
}
