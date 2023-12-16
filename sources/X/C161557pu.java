package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.7pu  reason: invalid class name and case insensitive filesystem */
public class C161557pu implements ThreadFactory {
    public String A00;
    public final int A01;

    public C161557pu(String str, int i) {
        this.A01 = i;
        if (i != 0) {
            this.A00 = str;
        } else {
            this.A00 = str;
        }
    }

    public Thread newThread(Runnable runnable) {
        int i = this.A01;
        String str = this.A00;
        if (i != 0) {
            return new Thread(runnable, str);
        }
        return new C173798Rs(runnable, str);
    }
}
