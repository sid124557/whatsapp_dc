package X;

import android.database.Cursor;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;

/* renamed from: X.9pt  reason: invalid class name and case insensitive filesystem */
public class C204769pt implements C16380sv {
    public Object A00;
    public final int A01;

    public C204769pt(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object apply(Object obj) {
        if (2 - this.A01 != 0) {
            return ((C194909Va) this.A00).A05.A03((Cursor) obj);
        }
        File file = (File) this.A00;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return C627536m.A06(file.getCanonicalPath(), str);
        } catch (IOException unused) {
            return null;
        }
    }
}
