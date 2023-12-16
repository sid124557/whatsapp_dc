package X;

import android.net.Uri;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0gu  reason: invalid class name and case insensitive filesystem */
public class C09880gu implements C187438xD {
    public C185788uF A00;
    public final C185788uF A01;
    public final Map A02;

    public Uri BE6() {
        return null;
    }

    public long Bfw(C161387pX r16) {
        String str;
        C185788uF r0;
        C161387pX r3 = r16;
        Map map = this.A02;
        if (map.size() == 1) {
            Iterator A0v = AnonymousClass001.A0v(map);
            str = null;
            while (A0v.hasNext()) {
                str = AnonymousClass001.A0m(A0v);
            }
        } else {
            str = (String) map.get(r3.A06);
        }
        if (str != null) {
            Uri fromFile = Uri.fromFile(AnonymousClass002.A0B(str));
            long j = r3.A01;
            long j2 = r3.A03;
            long j3 = r3.A02;
            r3 = new C161387pX(fromFile, r3.A05, r3.A06, (byte[]) null, r3.A00, j, j2, j3);
            r0 = new AnonymousClass6KJ();
        } else {
            r0 = this.A01;
        }
        this.A00 = r0;
        return r0.Bfw(r3);
    }

    public void cancel() {
    }

    public void close() {
        C185788uF r0 = this.A00;
        if (r0 != null) {
            r0.close();
            this.A00 = null;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        C185788uF r0 = this.A00;
        if (r0 == null) {
            return -1;
        }
        return r0.read(bArr, i, i2);
    }

    public C09880gu(C185788uF r1, Map map) {
        this.A01 = r1;
        this.A02 = map;
    }

    public void Awq(C184768sU r2) {
        r2.getClass();
        this.A01.Awq(r2);
    }
}
