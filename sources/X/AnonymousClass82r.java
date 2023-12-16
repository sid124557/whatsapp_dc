package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedSet;

/* renamed from: X.82r  reason: invalid class name */
public final class AnonymousClass82r implements C183748qZ {
    public final /* synthetic */ C1678182q A00;
    public final /* synthetic */ AnonymousClass4GP A01;

    public void BdH(Map map) {
        C1678182q r5 = this.A00;
        SortedSet sortedSet = r5.A08;
        sortedSet.clear();
        LinkedHashMap A0r = C18320x8.A0r();
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            int A06 = C18280x3.A06(A0w);
            int i = r5.A05;
            if (i <= r5.A04 && A06 % i == 1) {
                C18270x1.A1N(A0r, A0w);
            }
        }
        ArrayList A0I = AnonymousClass002.A0I(A0r.size());
        Iterator A0q2 = AnonymousClass000.A0q(A0r);
        while (A0q2.hasNext()) {
            C18270x1.A1K(A0I, C18280x3.A06(AnonymousClass001.A0w(A0q2)));
        }
        sortedSet.addAll(A0I);
        LinkedHashMap A0r2 = C18320x8.A0r();
        Iterator A0q3 = AnonymousClass000.A0q(map);
        while (A0q3.hasNext()) {
            Map.Entry A0w2 = AnonymousClass001.A0w(A0q3);
            if (!sortedSet.contains(A0w2.getKey())) {
                C18270x1.A1N(A0r2, A0w2);
            }
        }
        if (!r5.A06.BMR(A0r2)) {
            r5.A00 = SystemClock.uptimeMillis() + C1678182q.A0C;
        }
        AnonymousClass4GP r0 = this.A01;
        if (r0 != null) {
            r0.invoke();
        }
        r5.A09.set(false);
    }

    public AnonymousClass82r(C1678182q r1, AnonymousClass4GP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BSi() {
        C1678182q r1 = this.A00;
        r1.A06.clear();
        r1.A09.set(false);
    }
}
