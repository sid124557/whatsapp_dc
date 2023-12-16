package X;

import android.webkit.MimeTypeMap;

/* renamed from: X.726  reason: invalid class name */
public final class AnonymousClass726 {
    public static final String A00(String str, String str2) {
        String fileExtensionFromUrl;
        int A0D;
        C162457s7.A0J(str2, 1);
        if (!(str == null || (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str)) == null)) {
            if (fileExtensionFromUrl.length() == 0 && (A0D = C175728Zm.A0D(str, '.', str.length() - 1)) >= 0) {
                fileExtensionFromUrl = AnonymousClass6C9.A0c(A0D, str);
                C162457s7.A0D(fileExtensionFromUrl);
            }
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        return str2;
    }
}
