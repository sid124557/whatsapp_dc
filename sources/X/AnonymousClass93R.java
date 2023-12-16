package X;

import java.security.Signature;

/* renamed from: X.93R  reason: invalid class name */
public class AnonymousClass93R implements C183648qO {
    public Object A00;
    public final int A01;

    public AnonymousClass93R(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public Signature B15(String str) {
        if (this.A01 == 0) {
            return Signature.getInstance(str, ((C173558Qq) ((C173958Sk) this.A00).A02).A00);
        }
        try {
            return Signature.getInstance(str, ((C173558Qq) ((C174008Sp) this.A00).bcHelper).A00);
        } catch (Exception unused) {
            return Signature.getInstance(str);
        }
    }
}
