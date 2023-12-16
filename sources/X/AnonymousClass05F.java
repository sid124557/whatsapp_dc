package X;

/* renamed from: X.05F  reason: invalid class name */
public class AnonymousClass05F extends C10080hM {
    public final /* synthetic */ C10060hK A00;

    public AnonymousClass05F(C10060hK r1) {
        this.A00 = r1;
    }

    public String A04() {
        AnonymousClass0Pc r2 = (AnonymousClass0Pc) this.A00.A01.get();
        if (r2 == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("tag=[");
        return AnonymousClass000.A0S(r2.A02, A0o);
    }
}
