package X;

import com.whatsapp.R;

/* renamed from: X.8FZ  reason: invalid class name */
public class AnonymousClass8FZ implements C185658u2 {
    public final int A00;
    public final String A01;
    public final boolean A02;

    public int hashCode() {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1L(objArr, 0);
        AnonymousClass000.A1M(objArr, this.A00);
        AnonymousClass001.A1S(objArr, this.A02);
        return C18310x6.A08(this.A01, objArr, 3);
    }

    public /* synthetic */ C117005rE B58() {
        return null;
    }

    public int B8k() {
        return 0;
    }

    public C95814uZ B8o() {
        return null;
    }

    public /* synthetic */ int BCW() {
        return -1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass8FZ)) {
            return false;
        }
        AnonymousClass8FZ r4 = (AnonymousClass8FZ) obj;
        if (this.A00 == r4.A00 && this.A02 == r4.A02 && AnonymousClass75J.A00(this.A01, r4.A01)) {
            return true;
        }
        return false;
    }

    public AnonymousClass8FZ(String str) {
        this.A00 = R.string.f11nameremoved;
        this.A01 = str;
        this.A02 = true;
    }

    public AnonymousClass8FZ(int i) {
        this.A00 = i;
        this.A01 = "";
        this.A02 = false;
    }
}
