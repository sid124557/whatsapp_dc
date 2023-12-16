package X;

/* renamed from: X.2jE  reason: invalid class name and case insensitive filesystem */
public class C51072jE {
    public final C54412og A00;

    public int A00() {
        int i = this.A00.A01.getInt("registration_state", 0);
        C18260x0.A0w("registrationmanager/getRegistrationState ", AnonymousClass001.A0o(), i);
        return i;
    }

    public void A01(int i) {
        C18270x1.A0h(C54412og.A00(this.A00), "registration_state", i);
        C18260x0.A0w("registrationmanager/setRegistrationState ", AnonymousClass001.A0o(), i);
    }

    public C51072jE(C54412og r1) {
        this.A00 = r1;
    }

    public boolean A02() {
        return AnonymousClass000.A1U(A00(), 3);
    }
}
