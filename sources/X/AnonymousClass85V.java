package X;

import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Trace;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.85V  reason: invalid class name */
public class AnonymousClass85V implements C180608lL {
    public C151307Uf B2y(Uri uri) {
        int i;
        String str;
        String str2;
        Trace.beginSection("ImageMetadataExtractor.extract");
        if (uri.getPath() != null) {
            File A0a = C18310x6.A0a(uri);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(A0a.getPath(), options);
            int i2 = options.outHeight;
            int i3 = options.outWidth;
            try {
                i = 0;
                int attributeInt = new ExifInterface(A0a.getPath()).getAttributeInt("Orientation", 0);
                if (attributeInt == 3) {
                    i = 180;
                } else if (attributeInt == 6) {
                    i = 90;
                } else if (attributeInt == 8) {
                    i = 270;
                }
            } catch (IOException unused) {
                i = 0;
            }
            try {
                str = new ExifInterface(A0a.getPath()).getAttribute("Copyright");
            } catch (IOException e) {
                C162477s9.A0A("ImageMetadataExtractor", AnonymousClass000.A0a("Failed to fetch ExifInterface.TAG_COPYRIGHT: ", AnonymousClass001.A0o(), e), e);
                str = null;
            }
            try {
                str2 = new ExifInterface(A0a.getPath()).getAttribute("Model");
            } catch (IOException e2) {
                Object[] A0M = AnonymousClass002.A0M();
                C18280x3.A19(e2.getMessage(), e2, A0M);
                C162477s9.A0E("ImageMetadataExtractor", "Failed to fetch ExifInterface.TAG_MODEL: %s", A0M);
                str2 = null;
            }
            int i4 = i3;
            C151307Uf r6 = new C151307Uf((C165967xv) null, str, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "PHOTO", (HashMap) null, i4, i2, i, 0, 0, -1, -1, -1, A0a.length(), false);
            Trace.endSection();
            return r6;
        }
        Trace.endSection();
        throw AnonymousClass002.A0C("uri.getPath() is null");
    }
}
