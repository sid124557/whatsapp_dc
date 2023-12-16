package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9Sm  reason: invalid class name and case insensitive filesystem */
public class C194339Sm {
    public double A00;
    public int A01;
    public AnonymousClass9KQ A02;
    public boolean A03;
    public final int A04;
    public final AnonymousClass9QN A05;
    public final C202879mj A06;
    public final C192529Kl A07;
    public final AnonymousClass32L A08;
    public final Map A09 = AnonymousClass001.A0t();
    public final Map A0A = AnonymousClass001.A0t();

    public synchronized boolean A00() {
        return this.A08.A02;
    }

    public synchronized String toString() {
        StringBuilder A0o;
        A0o = AnonymousClass001.A0o();
        A0o.append("ExternalLoadRequest{, operationId='");
        A0o.append(this.A08.A01);
        A0o.append('\'');
        A0o.append(", mAssetIdToResultMap=");
        A0o.append(this.A0A);
        A0o.append(", mOverallProgress=");
        A0o.append(this.A00);
        A0o.append(", isPrefetch=");
        A0o.append(A00());
        A0o.append(", mFirstException=");
        A0o.append(this.A02);
        A0o.append(", mFinished=");
        A0o.append(this.A03);
        A0o.append(", mAssetLoadsCompleted=");
        A0o.append(this.A01);
        return AnonymousClass000.A0d(A0o);
    }

    public C194339Sm(AnonymousClass9QN r5, C202879mj r6, C192529Kl r7, AnonymousClass32L r8, List list) {
        this.A06 = r6;
        this.A05 = r5;
        this.A07 = r7;
        this.A08 = r8;
        this.A04 = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((C195349Xk) it.next()).A02.A0A;
            if (!this.A0A.containsKey(str)) {
                this.A0A.put(str, (Object) null);
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Id already present: ");
                throw AnonymousClass000.A0F(str, A0o);
            }
        }
    }
}
