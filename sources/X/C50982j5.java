package X;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.Set;

/* renamed from: X.2j5  reason: invalid class name and case insensitive filesystem */
public class C50982j5 {
    public final Context A00;

    public void A02() {
        C627536m.A0G(AnonymousClass002.A0A(this.A00.getFilesDir(), "migration/import/sandbox"), (Set) null);
    }

    public C50982j5(Context context) {
        this.A00 = context;
    }

    public File A00(String str) {
        if (!TextUtils.isEmpty(str)) {
            File A01 = A01(str);
            C18270x1.A0x(A01);
            if (A01.getParentFile() != null) {
                A01.getParentFile().mkdirs();
            }
            return A01;
        }
        throw AnonymousClass001.A0c("Filename is not specified.");
    }

    public File A01(String str) {
        if (!TextUtils.isEmpty(str)) {
            File A0A = AnonymousClass002.A0A(this.A00.getFilesDir(), "migration/import/sandbox");
            File A0A2 = AnonymousClass002.A0A(A0A, str);
            if (A0A2.getCanonicalPath().startsWith(A0A.getCanonicalPath())) {
                return A0A2;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Invalid file name: ");
            A0o.append(str);
            throw AnonymousClass002.A0C(AnonymousClass000.A0X(", sandbox escaping attempt.", A0o));
        }
        throw AnonymousClass001.A0c("Filename is not specified.");
    }
}
