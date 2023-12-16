package X;

import java.security.Signature;

/* renamed from: X.93P  reason: invalid class name */
public class AnonymousClass93P implements C183648qO {
    public Object A00;
    public String A01;
    public final int A02;

    public AnonymousClass93P(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public Signature B15(String str) {
        String str2 = this.A01;
        if (str2 != null) {
            return Signature.getInstance(str, str2);
        }
        return Signature.getInstance(str);
    }
}
