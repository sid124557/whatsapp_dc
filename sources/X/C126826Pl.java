package X;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* renamed from: X.6Pl  reason: invalid class name and case insensitive filesystem */
public final class C126826Pl extends C1691088a {
    public int A00;
    public int A01;
    public C157677ih A02;
    public byte[] A03;

    public C126826Pl() {
        super(false);
    }

    public Uri BE6() {
        C157677ih r0 = this.A02;
        if (r0 != null) {
            return r0.A04;
        }
        return null;
    }

    public void close() {
        if (this.A03 != null) {
            this.A03 = null;
            A00();
        }
        this.A02 = null;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.A00;
        int i4 = this.A01;
        int i5 = i3 - i4;
        if (i5 == 0) {
            return -1;
        }
        int min = Math.min(i2, i5);
        System.arraycopy(this.A03, i4, bArr, i, min);
        this.A01 += min;
        A02(min);
        return min;
    }

    public long Bfx(C157677ih r7) {
        byte[] bArr;
        int length;
        A01();
        this.A02 = r7;
        this.A01 = (int) r7.A03;
        Uri uri = r7.A04;
        String scheme = uri.getScheme();
        if ("data".equals(scheme)) {
            String[] A0j = AnonymousClass6CA.A0j(uri.getSchemeSpecificPart(), ",");
            if (A0j.length == 2) {
                String str = A0j[1];
                if (A0j[0].contains(";base64")) {
                    try {
                        bArr = Base64.decode(str, 0);
                        this.A03 = bArr;
                    } catch (IllegalArgumentException e) {
                        throw new AnonymousClass6u7(AnonymousClass000.A0V("Error while parsing Base64 encoded string: ", str, AnonymousClass001.A0o()), e);
                    }
                } else {
                    bArr = URLDecoder.decode(str, AnonymousClass79T.A01.name()).getBytes(AnonymousClass79T.A05);
                    this.A03 = bArr;
                }
                long j = r7.A02;
                if (j != -1) {
                    length = ((int) j) + this.A01;
                } else {
                    length = bArr.length;
                }
                this.A00 = length;
                if (length > bArr.length || this.A01 > length) {
                    this.A03 = null;
                    throw new C140556tw();
                }
                A03(r7);
                return ((long) this.A00) - ((long) this.A01);
            }
            throw AnonymousClass6u7.A01(AnonymousClass000.A0P(uri, "Unexpected URI format: ", AnonymousClass001.A0o()));
        }
        throw AnonymousClass6u7.A01(AnonymousClass000.A0V("Unsupported scheme: ", scheme, AnonymousClass001.A0o()));
    }
}
