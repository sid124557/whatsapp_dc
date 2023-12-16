package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.7Tx  reason: invalid class name and case insensitive filesystem */
public class C151227Tx {
    public File A00;
    public File A01;
    public final C142396x8 A02;
    public final C142406x9 A03;
    public final String A04;

    public File A01(Context context) {
        File file;
        File file2 = this.A01;
        if (file2 == null || !file2.exists() || (file = this.A00) == null || !file.exists()) {
            return null;
        }
        if (C107405bG.A0D(context)) {
            return this.A00;
        }
        return this.A01;
    }

    public C151227Tx(C142396x8 r1, C142406x9 r2, String str) {
        this.A04 = str;
        this.A02 = r1;
        this.A03 = r2;
    }
}
