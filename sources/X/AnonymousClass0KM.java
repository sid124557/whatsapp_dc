package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.view.inputmethod.InputContentInfoCompat;

/* renamed from: X.0KM  reason: invalid class name */
public final class AnonymousClass0KM {
    public final C16940uH A00;

    public static AnonymousClass0Tq A00(Bundle bundle, InputContentInfoCompat inputContentInfoCompat) {
        AnonymousClass0KM r2 = new AnonymousClass0KM(new ClipData(inputContentInfoCompat.mImpl.getDescription(), new ClipData.Item(inputContentInfoCompat.mImpl.getContentUri())), 2);
        Uri linkUri = inputContentInfoCompat.mImpl.getLinkUri();
        C16940uH r0 = r2.A00;
        r0.BmW(linkUri);
        r0.setExtras(bundle);
        return r0.Ay9();
    }

    public AnonymousClass0KM(ClipData clipData, int i) {
        C16940uH r0;
        if (Build.VERSION.SDK_INT >= 31) {
            r0 = new C08050dF(clipData, i);
        } else {
            r0 = new C08060dG(clipData, i);
        }
        this.A00 = r0;
    }
}
