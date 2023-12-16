package X;

import android.text.TextUtils;
import java.io.File;
import java.io.IOException;

/* renamed from: X.3DV  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3DV implements C16380sv {
    public final /* synthetic */ File A00;
    public final /* synthetic */ File A01;

    public final Object apply(Object obj) {
        File file = this.A00;
        File file2 = this.A01;
        String str = (String) obj;
        if (!TextUtils.isEmpty(str)) {
            if (file.getName().equals(str)) {
                return file;
            }
            try {
                return C627536m.A06(file2.getCanonicalPath(), str);
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public /* synthetic */ AnonymousClass3DV(File file, File file2) {
        this.A00 = file;
        this.A01 = file2;
    }
}
