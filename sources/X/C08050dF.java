package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* renamed from: X.0dF  reason: invalid class name and case insensitive filesystem */
public final class C08050dF implements C16940uH {
    public final ContentInfo.Builder A00;

    public AnonymousClass0Tq Ay9() {
        return new AnonymousClass0Tq(new C08070dH(this.A00.build()));
    }

    public void BmH(int i) {
        this.A00.setFlags(i);
    }

    public void BmW(Uri uri) {
        this.A00.setLinkUri(uri);
    }

    public void setExtras(Bundle bundle) {
        this.A00.setExtras(bundle);
    }

    public C08050dF(ClipData clipData, int i) {
        this.A00 = new ContentInfo.Builder(clipData, i);
    }
}
