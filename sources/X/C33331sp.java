package X;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1sp  reason: invalid class name and case insensitive filesystem */
public class C33331sp extends AnonymousClass5ZM {
    public final WeakReference A00;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass7IR r1 = ((AnonymousClass7IR[]) objArr)[0];
        if (r1 != null) {
            File file = r1.A01;
            int i = r1.A00;
            if (file != null) {
                List A01 = AnonymousClass31P.A01(file);
                if (i == -1) {
                    return A01;
                }
                ArrayList A0I = AnonymousClass002.A0I(i);
                C380325f.A00(A01, A0I, i);
                return A0I;
            }
        }
        return Collections.emptyList();
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C15790rw r0 = (C15790rw) this.A00.get();
        if (r0 != null) {
            r0.AwB(obj);
        }
    }

    public C33331sp(C15790rw r2) {
        this.A00 = AnonymousClass0x9.A14(r2);
    }
}
