package X;

import androidx.fragment.app.DialogFragment;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4cw  reason: invalid class name and case insensitive filesystem */
public abstract class C89434cw extends AnonymousClass1FB {
    public final Map A00 = C18320x8.A0r();

    public final void A79(DialogFragment dialogFragment, C158397ju r5, String str) {
        C08310eF r0;
        C162457s7.A0J(dialogFragment, 0);
        Map map = this.A00;
        AnonymousClass3Z6 r02 = (AnonymousClass3Z6) map.get(str);
        if (r02 == null || (r0 = (C08310eF) r02.first) == null || !r0.A16()) {
            map.put(str, AnonymousClass3Z6.A02(dialogFragment, r5));
            A6V(dialogFragment, str);
        }
    }

    public final void A7A(DialogFragment dialogFragment, String str) {
        A79(dialogFragment, new C158397ju(false, true), str);
    }

    public final void A7B(C142136wh r8) {
        boolean z;
        C162457s7.A0J(r8, 0);
        Map map = this.A00;
        Iterator A0q = AnonymousClass000.A0q(C73813g7.A0D(map));
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            Object key = A0w.getKey();
            AnonymousClass3Z6 r0 = (AnonymousClass3Z6) A0w.getValue();
            DialogFragment dialogFragment = (DialogFragment) r0.first;
            C158397ju r2 = (C158397ju) r0.second;
            if (dialogFragment.A16()) {
                int ordinal = r8.ordinal();
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        z = r2.A01;
                    }
                    dialogFragment.A1L();
                } else {
                    z = r2.A00;
                }
                if (!z) {
                }
                dialogFragment.A1L();
            }
            if (!r2.A01) {
                map.remove(key);
            }
        }
    }

    public final void A7C(String str) {
        A6c(str);
        this.A00.remove(str);
    }
}
