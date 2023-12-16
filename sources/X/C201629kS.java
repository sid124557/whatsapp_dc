package X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.security.auth.Destroyable;

/* renamed from: X.9kS  reason: invalid class name and case insensitive filesystem */
public class C201629kS implements Destroyable {
    public final AtomicBoolean A00 = C18280x3.A0l();
    public final byte[] A01;
    public final byte[] A02;

    public void destroy() {
        if (this.A00.compareAndSet(false, true)) {
            Arrays.fill(this.A01, (byte) 0);
            Arrays.fill(this.A02, (byte) 0);
        }
    }

    public C201629kS(byte[] bArr, byte[] bArr2) {
        this.A02 = bArr;
        this.A01 = bArr2;
    }
}
