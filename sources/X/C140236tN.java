package X;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: X.6tN  reason: invalid class name and case insensitive filesystem */
public class C140236tN extends ByteArrayOutputStream {
    public final /* synthetic */ AnonymousClass8KU A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140236tN(AnonymousClass8KU r1, int i) {
        super(i);
        this.A00 = r1;
    }

    public String toString() {
        int i = this.count;
        if (i > 0) {
            int i2 = i - 1;
            if (this.buf[i2] == 13) {
                i = i2;
            }
        }
        try {
            return new String(this.buf, 0, i, this.A00.A04.name());
        } catch (UnsupportedEncodingException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }
}
