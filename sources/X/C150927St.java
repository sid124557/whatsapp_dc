package X;

/* renamed from: X.7St  reason: invalid class name and case insensitive filesystem */
public class C150927St {
    public final C141466vc A00;
    public final Integer A01;
    public final Integer A02;

    public C150927St(C141466vc r1, Integer num, Integer num2) {
        this.A01 = num;
        this.A02 = num2;
        this.A00 = r1;
    }

    public String toString() {
        String obj;
        StringBuilder A0p = AnonymousClass001.A0p();
        Integer num = this.A01;
        String str = "";
        if (num == null) {
            obj = str;
        } else {
            obj = num.toString();
        }
        C18290x4.A1R(A0p, obj);
        Integer num2 = this.A02;
        if (num2 != null) {
            str = num2.toString();
        }
        return AnonymousClass000.A0W(str, A0p);
    }
}
