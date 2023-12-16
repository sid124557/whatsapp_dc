package X;

import java.security.Provider;
import java.security.Security;

/* renamed from: X.8Qq  reason: invalid class name and case insensitive filesystem */
public class C173558Qq implements C180128kX {
    public static volatile Provider A01;
    public final Provider A00;

    public C173558Qq() {
        Provider provider;
        synchronized (C173558Qq.class) {
            provider = Security.getProvider("SC");
            if (!(provider instanceof AnonymousClass8SV)) {
                if (A01 != null) {
                    provider = A01;
                } else {
                    A01 = new AnonymousClass8SV();
                    provider = A01;
                }
            }
        }
        this.A00 = provider;
    }
}
