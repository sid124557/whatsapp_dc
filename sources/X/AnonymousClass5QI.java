package X;

/* renamed from: X.5QI  reason: invalid class name */
public class AnonymousClass5QI {
    public long A00;
    public C56612sH A01;
    public AnonymousClass33p A02;
    public boolean A03 = false;

    public void A00() {
        if (this.A03) {
            long currentTimeMillis = System.currentTimeMillis() - this.A00;
            long A0B = AnonymousClass0x2.A0B(AnonymousClass0x2.A0F(this.A02), "language_selector_time_spent");
            C18270x1.A03(this.A02).putLong("language_selector_time_spent", A0B + currentTimeMillis).commit();
        }
        this.A03 = false;
    }
}
