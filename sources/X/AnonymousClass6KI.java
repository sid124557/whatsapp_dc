package X;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* renamed from: X.6KI  reason: invalid class name */
public final class AnonymousClass6KI extends C1675681o implements C185788uF {
    public int A00;
    public C161387pX A01;
    public byte[] A02;

    public AnonymousClass6KI() {
        super(false);
    }

    public Uri BE6() {
        C161387pX r0 = this.A01;
        if (r0 != null) {
            return r0.A04;
        }
        return null;
    }

    public void close() {
        if (this.A02 != null) {
            this.A02 = null;
            A00();
        }
        this.A01 = null;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        byte[] bArr2 = this.A02;
        int length = bArr2.length;
        int i3 = this.A00;
        int i4 = length - i3;
        if (i4 == 0) {
            return -1;
        }
        int min = Math.min(i2, i4);
        System.arraycopy(bArr2, i3, bArr, i, min);
        this.A00 += min;
        A02(min);
        return min;
    }

    public long Bfw(C161387pX r6) {
        A01();
        this.A01 = r6;
        Uri uri = r6.A04;
        String scheme = uri.getScheme();
        if ("data".equals(scheme)) {
            String[] split = uri.getSchemeSpecificPart().split(",");
            if (split.length <= 2) {
                String str = split[1];
                if (split[0].contains(";base64")) {
                    try {
                        this.A02 = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e) {
                        throw new C140626uD(AnonymousClass000.A0V("Error while parsing Base64 encoded string: ", str, AnonymousClass001.A0o()), e);
                    }
                } else {
                    this.A02 = URLDecoder.decode(str, "US-ASCII").getBytes();
                }
                A03(r6);
                return (long) this.A02.length;
            }
            throw C140626uD.A00(AnonymousClass000.A0P(uri, "Unexpected URI format: ", AnonymousClass001.A0o()));
        }
        throw C140626uD.A00(AnonymousClass000.A0V("Unsupported scheme: ", scheme, AnonymousClass001.A0o()));
    }
}
