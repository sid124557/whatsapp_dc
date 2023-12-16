package X;

import java.security.PrivilegedAction;
import java.security.Security;

/* renamed from: X.92r  reason: invalid class name and case insensitive filesystem */
public class C1897992r implements PrivilegedAction {
    public String A00;
    public final int A01;

    public C1897992r(String str, int i) {
        this.A01 = i;
        this.A00 = str;
    }

    public Object run() {
        switch (this.A01) {
            case 0:
                try {
                    return Class.forName(this.A00);
                } catch (Exception unused) {
                    return null;
                }
            case 1:
                return Security.getProperty(this.A00);
            default:
                return System.getProperty(this.A00);
        }
    }
}
