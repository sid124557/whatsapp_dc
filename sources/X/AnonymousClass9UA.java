package X;

import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9UA  reason: invalid class name */
public class AnonymousClass9UA {
    static {
        new AnonymousClass9T4(1280, 720);
        new AnonymousClass9T4(1920, 1080);
    }

    public static List A00(Size[] sizeArr) {
        int length;
        if (sizeArr == null || (length = sizeArr.length) == 0) {
            return Collections.emptyList();
        }
        ArrayList A0I = AnonymousClass002.A0I(length);
        int i = 0;
        do {
            A0I.add(new AnonymousClass9T4(sizeArr[i].getWidth(), sizeArr[i].getHeight()));
            i++;
        } while (i < length);
        return Collections.unmodifiableList(A0I);
    }
}
