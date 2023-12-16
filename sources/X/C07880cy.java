package X;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.0cy  reason: invalid class name and case insensitive filesystem */
public class C07880cy implements C15740rr {
    public final String A00;
    public final HashMap A01 = AnonymousClass001.A0t();

    public C07880cy(String str) {
        this.A00 = str;
    }

    public File B7d(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) this.A01.get(decode);
        if (file != null) {
            File A0A = AnonymousClass002.A0A(file, decode2);
            try {
                File canonicalFile = A0A.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw AnonymousClass000.A0E(A0A, "Failed to resolve canonical path for ", AnonymousClass001.A0o());
            }
        } else {
            throw AnonymousClass000.A0E(uri, "Unable to find configured root for ", AnonymousClass001.A0o());
        }
    }
}
