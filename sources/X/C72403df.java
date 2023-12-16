package X;

import java.util.Arrays;
import javax.security.auth.Destroyable;

/* renamed from: X.3df  reason: invalid class name and case insensitive filesystem */
public class C72403df implements Destroyable {
    public boolean A00;
    public final byte[] A01;

    public void destroy() {
        if (!this.A00) {
            Arrays.fill(this.A01, (byte) 0);
            this.A00 = true;
        }
    }

    public C72403df(byte[] bArr) {
        this.A01 = bArr;
    }

    public boolean isDestroyed() {
        return this.A00;
    }
}
