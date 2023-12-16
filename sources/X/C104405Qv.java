package X;

import android.content.Context;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.5Qv  reason: invalid class name and case insensitive filesystem */
public class C104405Qv {
    public int A00 = 1;
    public int A01 = 1;
    public C186308v5 A02;
    public C106105Xq A03 = new C106105Xq();
    public boolean A04;
    public boolean A05 = false;
    public final Context A06;
    public final C620633i A07;
    public final C48682fI A08;
    public final List A09 = AnonymousClass001.A0s();
    public final Set A0A = AnonymousClass0x9.A17();

    public void A00() {
        List<C188018yB> list = this.A09;
        if (!list.isEmpty()) {
            for (C188018yB B7c : list) {
                File B7c2 = B7c.B7c();
                if (!B7c2.delete()) {
                    C18260x0.A1S(AnonymousClass001.A0o(), "camerastatemanager/cannot-delete-file ", B7c2);
                }
            }
            list.clear();
        }
    }

    public C104405Qv(C620633i r2, C54292oU r3, C48682fI r4) {
        this.A06 = r3.A00;
        this.A08 = r4;
        this.A07 = r2;
    }

    public boolean A01(Collection collection) {
        for (Object next : collection) {
            Iterator it = this.A09.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (next.equals(((C186058ug) it.next()).B3d())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
