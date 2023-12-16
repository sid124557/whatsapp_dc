package X;

import android.content.ContentValues;
import android.os.Build;
import java.io.File;

/* renamed from: X.27g  reason: invalid class name and case insensitive filesystem */
public final class C383627g {
    public static final ContentValues A00(File file, String str, String str2) {
        ContentValues A06 = AnonymousClass0x9.A06();
        A06.put("mime_type", str2);
        A06.put("_display_name", file.getName());
        if (Build.VERSION.SDK_INT >= 29) {
            A06.put("relative_path", AnonymousClass000.A0X("/Whatsapp/", AnonymousClass000.A0l(str)));
            return A06;
        }
        A06.put("_data", file.getPath());
        return A06;
    }
}
