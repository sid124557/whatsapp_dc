package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: X.0dG  reason: invalid class name and case insensitive filesystem */
public final class C08060dG implements C16940uH {
    public int A00;
    public int A01;
    public ClipData A02;
    public Uri A03;
    public Bundle A04;

    public AnonymousClass0Tq Ay9() {
        return new AnonymousClass0Tq(new C08080dI(this));
    }

    public C08060dG(ClipData clipData, int i) {
        this.A02 = clipData;
        this.A01 = i;
    }

    public void BmH(int i) {
        this.A00 = i;
    }

    public void BmW(Uri uri) {
        this.A03 = uri;
    }

    public void setExtras(Bundle bundle) {
        this.A04 = bundle;
    }
}
