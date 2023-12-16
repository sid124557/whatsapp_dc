package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9cS  reason: invalid class name and case insensitive filesystem */
public class C197059cS implements C202649mM {
    public final /* synthetic */ AnonymousClass97C A00;

    public C197059cS(AnonymousClass97C r1) {
        this.A00 = r1;
    }

    public void BMa(AnonymousClass39R r10, File file) {
        AnonymousClass97C r7 = this.A00;
        List list = r7.A0K;
        synchronized (list) {
            ArrayList A0J = AnonymousClass002.A0J(list);
            Iterator it = A0J.iterator();
            boolean z = false;
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass39R r8 = ((C193959Ra) it.next()).A03;
                if (r8 != null) {
                    String str = r8.A0F;
                    String str2 = r10.A0F;
                    if (str.equals(str2)) {
                        C193959Ra r3 = new C193959Ra(r8);
                        if (file != null) {
                            r3.A00 = true;
                        } else {
                            r3.A00 = false;
                            r3.A01 = true;
                        }
                        AnonymousClass39R r0 = r7.A07;
                        if (r0 != null && str2.equals(r0.A0F)) {
                            z = true;
                        }
                        r3.A02 = z;
                        A0J.set(i, r3);
                        AnonymousClass959 r2 = r7.A08;
                        A0J.size();
                        List list2 = r2.A05;
                        C18280x3.A0s(new AnonymousClass951(list2, A0J), r2, A0J, list2);
                        list.set(i, r3);
                    }
                }
                i++;
            }
        }
    }
}
