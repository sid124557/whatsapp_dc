package X;

/* renamed from: X.7TZ  reason: invalid class name */
public class AnonymousClass7TZ {
    public double A00 = Double.NaN;
    public double A01 = Double.NaN;
    public long A02 = 0;
    public final C29401il A03;

    public double A00() {
        AnonymousClass30O r0 = this.A03.A00;
        double A002 = r0.A00();
        String bool = Boolean.toString(r0.A01());
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("voip/call/battery_monitor percent = ");
        A0o.append(A002);
        C18260x0.A0s(", charging = ", bool, A0o);
        return A002;
    }

    public AnonymousClass7TZ(C29401il r3) {
        this.A03 = r3;
    }
}
