package X;

/* renamed from: X.1nz  reason: invalid class name and case insensitive filesystem */
public final class C31251nz extends C30341mI {
    public int A00;

    public synchronized void A1Z(String str) {
        try {
            this.A00 = Integer.valueOf(str).intValue();
        } catch (NumberFormatException e) {
            C18260x0.A0v("FMessageSystemEphemeralSettingNotApplied/setData cannot convert data to int, data=", str, AnonymousClass001.A0o(), e);
            this.A00 = 0;
        }
        return;
    }

    public C31251nz(AnonymousClass2z0 r2, long j) {
        super(r2, 60, j);
    }
}
