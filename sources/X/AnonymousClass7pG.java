package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.EOFException;
import java.io.InputStream;

/* renamed from: X.7pG  reason: invalid class name */
public class AnonymousClass7pG {
    public static final C148257Hr A00 = new C148257Hr(30, 72);
    public static final C148257Hr A01 = new C148257Hr(48, 96);
    public static final byte[] A02 = {69, 120, 105, 102, 0};
    public static final byte[] A03 = {74, 70, 73, 70, 0};
    public static final byte[] A04 = {74, 70, 88, 88, 0};
    public static final int[] A05 = {0, 208, 209, 210, 211, 212, 213, 214, 215};

    public static boolean A01(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        if (length >= length2) {
            int i = 0;
            while (i < length2) {
                if (bArr[i] == bArr2[i]) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    public static void A00(InputStream inputStream, int i) {
        byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
        while (i > 0) {
            int min = Math.min(Math.min(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, i), EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
            int i2 = 0;
            while (i2 < min) {
                int read = inputStream.read(bArr, i2, min - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            if (i2 != -1) {
                i -= 1024;
            } else {
                throw new EOFException(AnonymousClass000.A0Y("Unexpected EOF skipping ", AnonymousClass001.A0o(), i));
            }
        }
    }
}
