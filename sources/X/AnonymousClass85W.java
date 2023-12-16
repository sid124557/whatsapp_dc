package X;

import android.content.Context;
import android.net.Uri;
import android.os.Trace;

/* renamed from: X.85W  reason: invalid class name */
public class AnonymousClass85W implements C180608lL {
    public C180608lL A00;

    public C151307Uf B2y(Uri uri) {
        Trace.beginSection("DefaultVideoMetadataExtractor.extract");
        C151307Uf B2y = this.A00.B2y(uri);
        Trace.endSection();
        return B2y;
    }

    public AnonymousClass85W(Context context) {
        this.A00 = new AnonymousClass85X(context, false);
    }
}
