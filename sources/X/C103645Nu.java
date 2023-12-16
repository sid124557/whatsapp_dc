package X;

/* renamed from: X.5Nu  reason: invalid class name and case insensitive filesystem */
public class C103645Nu {
    public CharSequence A00 = "";
    public Runnable A01;
    public final C69263Wi A02;
    public final AnonymousClass10k A03;

    public void A00(CharSequence charSequence) {
        CharSequence charSequence2 = this.A00;
        C18260x0.A0O(charSequence2, charSequence);
        if (charSequence2.length() <= 20 || charSequence.length() <= 20) {
            Runnable runnable = this.A01;
            if (runnable != null) {
                this.A02.A0R(runnable);
            }
            this.A00 = charSequence;
            C71573cK r3 = new C71573cK(this, 21, charSequence);
            this.A01 = r3;
            this.A02.A0T(r3, (long) 200);
        }
    }

    public C103645Nu(C69263Wi r2, AnonymousClass10k r3) {
        this.A02 = r2;
        this.A03 = r3;
    }
}
