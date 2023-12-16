package X;

import java.util.Arrays;
import javax.security.auth.Destroyable;

/* renamed from: X.3dg  reason: invalid class name and case insensitive filesystem */
public class C72413dg implements Destroyable {
    public boolean A00;
    public final byte[] A01;

    public void destroy() {
        if (!this.A00) {
            Arrays.fill(this.A01, (byte) 0);
            this.A00 = true;
        }
    }

    public C72413dg(byte[] bArr) {
        int length = bArr.length;
        if (length == 32) {
            this.A01 = bArr;
            return;
        }
        throw AnonymousClass000.A0G("Wrong length: ", AnonymousClass001.A0o(), length);
    }

    public byte[] A00() {
        return this.A01;
    }

    public boolean isDestroyed() {
        return this.A00;
    }
}
