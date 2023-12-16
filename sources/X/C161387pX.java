package X;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7pX  reason: invalid class name and case insensitive filesystem */
public final class C161387pX {
    public static final C161387pX A09 = new C161387pX(Uri.parse("www.facebook.com"), new C160487ni(), (String) null, (byte[]) null, 0, 0, 0, -1);
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Uri A04;
    public final C160487ni A05;
    public final String A06;
    public final Map A07;
    public final byte[] A08;

    public C161387pX(Uri uri, long j) {
        this(uri, new C160487ni(), (String) null, (byte[]) null, 0, j, j, -1);
    }

    public void A00(Map map) {
        Map map2 = this.A05.A0N;
        map2.clear();
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            map2.put(A0w.getKey(), A0w.getValue());
        }
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DataSpec[");
        AnonymousClass000.A1B(this.A04, A0o);
        A0o.append(", ");
        A0o.append(Arrays.toString(this.A08));
        A0o.append(", ");
        A0o.append(this.A01);
        A0o.append(", ");
        A0o.append(this.A03);
        A0o.append(", ");
        A0o.append(this.A02);
        A0o.append(", ");
        A0o.append(this.A06);
        A0o.append(", ");
        A0o.append(this.A00);
        A0o.append(", ");
        C160487ni r0 = this.A05;
        AnonymousClass000.A1B(r0, A0o);
        A0o.append(", ");
        return AnonymousClass000.A0W(r0.A0N.toString(), A0o);
    }

    public C161387pX(Uri uri, C160487ni r3, String str, byte[] bArr, int i, long j, long j2, long j3) {
        Map emptyMap = Collections.emptyMap();
        r3.getClass();
        this.A04 = uri;
        this.A08 = bArr;
        this.A07 = AnonymousClass6C9.A0l(emptyMap);
        this.A03 = j2;
        this.A01 = (j - j2) + j2;
        this.A02 = j3;
        this.A06 = str;
        this.A00 = i;
        this.A05 = r3;
    }

    public C161387pX(Uri uri) {
        this(uri, new C160487ni(), (String) null, (byte[]) null, 0, 0, 0, -1);
    }
}
