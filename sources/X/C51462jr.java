package X;

/* renamed from: X.2jr  reason: invalid class name and case insensitive filesystem */
public class C51462jr {
    public final C44872Xu A00;
    public final C51072jE A01;

    public int A00() {
        int A02 = C18280x3.A02(this.A00.A01.A01, "companion_registration_state");
        C18260x0.A0w("companionregistrationmanager/getregstate ", AnonymousClass001.A0o(), A02);
        return A02;
    }

    public C51462jr(C44872Xu r1, C51072jE r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A01(int i) {
        C18260x0.A0w("companionregistrationmanager/setregstate ", AnonymousClass001.A0o(), i);
        C54412og.A00(this.A00.A01).putInt("companion_registration_state", i).commit();
        if (i == 8) {
            this.A01.A01(3);
        }
    }

    public boolean A02() {
        int A002 = A00();
        if (A002 < 2) {
            return false;
        }
        if (A002 <= 6) {
            return true;
        }
        if (A002 < 10 || A002 > 14) {
            return false;
        }
        return true;
    }
}
