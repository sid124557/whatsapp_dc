package X;

import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.854  reason: invalid class name */
public abstract class AnonymousClass854 implements C177908ge {
    public File A00(AnonymousClass7JI r5, int i) {
        HashMap A0t = AnonymousClass001.A0t();
        if (r5 != null) {
            A0t.putAll(r5.A01);
        }
        C158107jR r3 = ((C126276Nf) this).A00;
        Pair A00 = C154747dg.A00(i);
        if (TextUtils.isEmpty((CharSequence) null) || 0 >= C154747dg.A00.length) {
            return r3.A01(AnonymousClass0x9.A0C(A00.first, A00.second));
        }
        throw AnonymousClass001.A0g("contains");
    }
}
