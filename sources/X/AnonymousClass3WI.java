package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3WI  reason: invalid class name */
public final class AnonymousClass3WI implements C84944Ei {
    public final C60152y5 A00;
    public final AnonymousClass66R A01 = C154517dI.A01(new C78413uy(this));

    public AnonymousClass3WI(C60152y5 r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public void BK1(String str) {
        C162457s7.A0J(str, 0);
        Map<String, ?> all = C18310x6.A0F(this.A01).getAll();
        C162457s7.A0D(all);
        Iterator A0q = AnonymousClass000.A0q(all);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            String A0q2 = C18310x6.A0q(A0w);
            Object value = A0w.getValue();
            C162457s7.A0H(A0q2);
            if (!C175738Zn.A0Y(A0q2, "ab_props:sys:", false)) {
                StringBuilder A0l = AnonymousClass000.A0l(str);
                A0l.append("/abprops config code key: ");
                A0l.append(A0q2);
                C18260x0.A1R(A0l, " config value: ", value);
            }
        }
    }

    public /* synthetic */ void BK5(AnonymousClass2P4 r1) {
    }

    public /* synthetic */ void BKL(String str) {
    }
}
