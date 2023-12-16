package X;

import java.security.Provider;
import java.security.Signature;

/* renamed from: X.93Q  reason: invalid class name */
public class AnonymousClass93Q implements C183648qO {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass93Q(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public Signature B15(String str) {
        if (this.A02 != 0) {
            Provider provider = (Provider) this.A01;
            if (provider != null) {
                return Signature.getInstance(str, provider);
            }
            return Signature.getInstance(str);
        }
        Provider provider2 = (Provider) this.A01;
        String str2 = ((C173958Sk) this.A00).A00;
        if (provider2 != null) {
            return Signature.getInstance(str2, provider2);
        }
        return Signature.getInstance(str2);
    }
}
