package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2wm  reason: invalid class name and case insensitive filesystem */
public final class C59352wm {
    public static final List A02 = AnonymousClass8UF.A0o("com.instagram.", "com.oculus.", "com.facebook.");
    public final AnonymousClass1VX A00;
    public final C103335Mm A01;

    public final void A00(AnonymousClass58S r5, String str) {
        C162457s7.A0J(r5, 0);
        if (this.A00.A0Y(C58422vE.A02, 3777) && str != null && str.length() != 0) {
            List list = A02;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (AnonymousClass2AB.A05(str, AnonymousClass001.A0m(it))) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("Cross-app communication detected for operation '");
                        String name = r5.name();
                        A0o.append(name);
                        A0o.append("' and authority '");
                        C18320x8.A1M(A0o, str);
                        C18280x3.A14(A0o);
                        this.A01.A00("CONTENT_RESOLVER", name, C615631i.A00(new Throwable("")), str);
                        return;
                    }
                }
            }
        }
    }

    public C59352wm(AnonymousClass1VX r1, C103335Mm r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
