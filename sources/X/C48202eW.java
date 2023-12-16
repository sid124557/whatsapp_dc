package X;

/* renamed from: X.2eW  reason: invalid class name and case insensitive filesystem */
public class C48202eW {
    public int A00 = 3;

    public String toString() {
        int i = this.A00;
        if (i == 1) {
            return "available";
        }
        if (i == 3) {
            return "un-available";
        }
        return "available-waiting-timeout";
    }
}
