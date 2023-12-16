package X;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.7TN  reason: invalid class name */
public final class AnonymousClass7TN {
    public int A00;
    public long A01;
    public Uri A02;
    public Map A03 = Collections.emptyMap();

    public C157677ih A00() {
        Uri uri = this.A02;
        if (uri != null) {
            return new C157677ih(uri, (String) null, this.A03, (byte[]) null, 1, this.A00, 0, this.A01, -1);
        }
        throw AnonymousClass001.A0e(String.valueOf("The uri must be set."));
    }
}
