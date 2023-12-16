package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.4rH  reason: invalid class name */
public final class AnonymousClass4rH extends C47722di {
    public final AnonymousClass33p A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass66R A02 = C154517dI.A01(new AnonymousClass8WR(this));
    public final AnonymousClass66R A03 = C154517dI.A01(new C119895xi(this));
    public final AnonymousClass66R A04 = C154517dI.A01(new AnonymousClass8WS(this));
    public final AnonymousClass66R A05 = C154517dI.A01(new AnonymousClass8WT(this));
    public final AnonymousClass66R A06 = C154517dI.A01(new AnonymousClass8WU(this));

    public void A04() {
        this.A02.getValue();
        this.A05.getValue();
        this.A06.getValue();
        this.A04.getValue();
    }

    public final Set A05() {
        List A012 = AnonymousClass2AB.A01(C56952sp.A08(this.A01, 3919), ",");
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            Integer A062 = C829745q.A06(AnonymousClass2AB.A00(AnonymousClass001.A0m(it)));
            if (A062 != null) {
                A0s.add(A062);
            }
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it2 = A0s.iterator();
        while (it2.hasNext()) {
            int A052 = C18280x3.A05(it2);
            AnonymousClass59L[] values = AnonymousClass59L.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                AnonymousClass59L r1 = values[i];
                if (r1.type == A052) {
                    Byte valueOf = Byte.valueOf(r1.androidWaType);
                    if (valueOf != null) {
                        A0s2.add(valueOf);
                    }
                } else {
                    i++;
                }
            }
        }
        return C73723fy.A0P(A0s2);
    }

    public final boolean A06(byte b) {
        if (b != 67 && b != 66) {
            return ((Set) this.A02.getValue()).contains(Byte.valueOf(b));
        }
        if (((Set) this.A02.getValue()).contains(Byte.valueOf(b)) || this.A01.A0X(6191)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A07(X.C624134x r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.C30481mW
            r2 = 1
            if (r0 != 0) goto L_0x0029
            boolean r0 = r4 instanceof X.AnonymousClass1n2
            if (r0 != 0) goto L_0x0029
            boolean r0 = r4 instanceof X.C30441mS
            if (r0 != 0) goto L_0x0029
            boolean r0 = r4 instanceof X.C30721mu
            if (r0 == 0) goto L_0x002d
            byte r0 = r4.A1I
            boolean r0 = r3.A06(r0)
            if (r0 == 0) goto L_0x005c
            X.1mu r4 = (X.C30721mu) r4
            boolean r0 = r4.A25()
            if (r0 == 0) goto L_0x002a
            X.66R r0 = r3.A05
        L_0x0023:
            boolean r0 = X.C18270x1.A1V(r0)
        L_0x0027:
            if (r0 == 0) goto L_0x005c
        L_0x0029:
            return r2
        L_0x002a:
            X.66R r0 = r3.A04
            goto L_0x0023
        L_0x002d:
            boolean r0 = r4 instanceof X.AnonymousClass1nE
            if (r0 == 0) goto L_0x003c
            byte r0 = r4.A1I
            boolean r0 = r3.A06(r0)
            if (r0 == 0) goto L_0x005c
            X.66R r0 = r3.A06
            goto L_0x0023
        L_0x003c:
            boolean r0 = r4 instanceof X.C30451mT
            if (r0 != 0) goto L_0x004b
            boolean r0 = r4 instanceof X.C30591mh
            if (r0 != 0) goto L_0x004b
            byte r0 = r4.A1I
            boolean r2 = r3.A06(r0)
            return r2
        L_0x004b:
            byte r0 = r4.A1I
            boolean r0 = r3.A06(r0)
            if (r0 != 0) goto L_0x0029
            X.1VX r1 = r3.A01
            r0 = 6191(0x182f, float:8.675E-42)
            boolean r0 = r1.A0X(r0)
            goto L_0x0027
        L_0x005c:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4rH.A07(X.34x):boolean");
    }

    public final boolean A08(Collection collection) {
        AnonymousClass59L r4;
        if (!this.A01.A0X(6442)) {
            return false;
        }
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C624134x A0T = C18300x5.A0T(it);
            C162457s7.A0J(A0T, 0);
            byte b = A0T.A1I;
            if (b != 0) {
                if (b != 2) {
                    AnonymousClass59L[] values = AnonymousClass59L.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            r4 = null;
                            break;
                        }
                        r4 = values[i];
                        if (r4.androidWaType == b) {
                            break;
                        }
                        i++;
                    }
                } else if (!(A0T instanceof C30721mu) || !((C30721mu) A0T).A25()) {
                    r4 = AnonymousClass59L.AUDIO;
                } else {
                    r4 = AnonymousClass59L.PTT;
                }
            } else if (!(A0T instanceof C30481mW) || ((C30481mW) A0T).A07 == null) {
                r4 = AnonymousClass59L.TEXT;
            } else {
                r4 = AnonymousClass59L.URL;
            }
            if (!C73723fy.A0U((Iterable) this.A03.getValue(), r4)) {
            }
        }
        return true;
        return false;
    }

    public AnonymousClass4rH(AnonymousClass33p r2, AnonymousClass1VX r3) {
        C18260x0.A0Q(r3, r2);
        this.A01 = r3;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (r4.A01.A0X(6111) == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        if (r4.A01.A0X(6506) == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r4.A01.A0X(5876) == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r4 = this;
            java.util.Set r1 = r4.A05()
            X.66R r0 = r4.A02
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.containsAll(r1)
            if (r0 == 0) goto L_0x0054
            X.66R r0 = r4.A05
            boolean r0 = X.C18270x1.A1V(r0)
            if (r0 != 0) goto L_0x0025
            X.1VX r1 = r4.A01
            r0 = 5876(0x16f4, float:8.234E-42)
            boolean r0 = r1.A0X(r0)
            r3 = 1
            if (r0 != 0) goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            X.66R r0 = r4.A06
            boolean r0 = X.C18270x1.A1V(r0)
            if (r0 != 0) goto L_0x0039
            X.1VX r1 = r4.A01
            r0 = 6111(0x17df, float:8.563E-42)
            boolean r0 = r1.A0X(r0)
            r2 = 1
            if (r0 != 0) goto L_0x003a
        L_0x0039:
            r2 = 0
        L_0x003a:
            X.66R r0 = r4.A04
            boolean r0 = X.C18270x1.A1V(r0)
            if (r0 != 0) goto L_0x004d
            X.1VX r1 = r4.A01
            r0 = 6506(0x196a, float:9.117E-42)
            boolean r1 = r1.A0X(r0)
            r0 = 1
            if (r1 != 0) goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            if (r3 != 0) goto L_0x0054
            if (r2 != 0) goto L_0x0054
            if (r0 == 0) goto L_0x005a
        L_0x0054:
            X.33p r1 = r4.A00
            r0 = 1
            r1.A1o(r0)
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4rH.A03():void");
    }
}
