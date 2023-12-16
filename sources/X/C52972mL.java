package X;

import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2mL  reason: invalid class name and case insensitive filesystem */
public class C52972mL {
    public final AnonymousClass2L9 A00;
    public final C60692yy A01;
    public final C34211uP A02;
    public final AnonymousClass2YK A03;

    public final Iterable A00() {
        boolean z;
        C60692yy r6 = this.A01;
        Set A022 = r6.A02();
        if (A022.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass2L9 r2 = this.A00;
        C172878Nf it = r2.A01.iterator();
        while (it.hasNext()) {
            A0s.add(((C183538qC) it.next()).get());
        }
        AnonymousClass8OQ r4 = r2.A00;
        Iterator it2 = A022.iterator();
        while (it2.hasNext()) {
            String A0m = AnonymousClass001.A0m(it2);
            try {
                z = this.A02.A01(A0m).A03;
            } catch (PackageManager.NameNotFoundException unused) {
                z = false;
            }
            if (!z) {
                C18260x0.A0t("InstrumentationChangeDispatcher/verification failed, dropping event for package - ", A0m, AnonymousClass001.A0o());
                r6.A03(A0m);
            } else {
                C183538qC r0 = (C183538qC) r4.get(A0m);
                if (r0 != null) {
                    A0s.add(r0.get());
                }
            }
        }
        return A0s;
    }

    public C52972mL(AnonymousClass2L9 r1, C60692yy r2, C34211uP r3, AnonymousClass2YK r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void A01() {
        for (C56262rh A012 : A00()) {
            A012.A01();
        }
        C60692yy r2 = this.A01;
        Iterator it = r2.A02().iterator();
        while (it.hasNext()) {
            r2.A03(AnonymousClass001.A0m(it));
        }
        AnonymousClass2YK r1 = this.A03;
        r1.A00.A00.revokeUriPermission(Uri.parse("content://com.whatsapp.provider.instrumentation"), 3);
    }
}
