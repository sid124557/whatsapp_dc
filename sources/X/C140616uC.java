package X;

import java.io.IOException;

/* renamed from: X.6uC  reason: invalid class name and case insensitive filesystem */
public class C140616uC extends IOException {
    public final int reason;

    public C140616uC(String str, Throwable th, int i) {
        super(str, th);
        this.reason = i;
    }

    public C140616uC() {
        this.reason = 2008;
    }

    public C140616uC(String str, int i) {
        super(str);
        this.reason = i;
    }

    public C140616uC(Throwable th, int i) {
        super(th);
        this.reason = i;
    }
}
