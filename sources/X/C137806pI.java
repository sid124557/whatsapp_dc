package X;

import java.util.HashSet;
import java.util.List;

/* renamed from: X.6pI  reason: invalid class name and case insensitive filesystem */
public class C137806pI extends C34041u8 implements C85094Ex {
    public final AnonymousClass33p A00;
    public final C49252gE A01;
    public final C162157rM A02;
    public final boolean A03;
    public volatile int A04;
    public volatile int A05;
    public volatile List A06 = AnonymousClass002.A0I(0);
    public volatile List A07 = AnonymousClass002.A0I(0);

    public Void A0G(Void... voidArr) {
        C162157rM r3 = this.A02;
        List A08 = r3.A0C.A08(0);
        this.A05 = A08.size();
        C183538qC r1 = r3.A0F;
        this.A04 = ((C56552sB) r1.get()).A03().size();
        if (this.A03) {
            this.A06 = ((C27841el) r1.get()).A0D();
            this.A07 = A08;
        }
        return super.A08(voidArr);
    }

    public void BXY(C50612iT r5) {
        C162157rM r3 = this.A02;
        HashSet hashSet = r3.A0I;
        String str = r5.A0G;
        hashSet.remove(str);
        if (r3.A04 != null) {
            for (int i = 0; i < r3.A04.size(); i++) {
                if (((C50612iT) r3.A04.get(i)).A0G.equals(str)) {
                    r3.A04.set(i, r5);
                    r3.A04((String) null, r3.A04);
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BXZ(java.util.List r7) {
        /*
            r6 = this;
            int r0 = r6.A04
            boolean r3 = X.AnonymousClass001.A1W(r0)
            int r0 = r6.A05
            boolean r2 = X.AnonymousClass001.A1W(r0)
            X.7rM r5 = r6.A02
            r5.A05 = r3
            r5.A06 = r2
            X.2gE r1 = r6.A01
            int r0 = r7.size()
            r1.A00(r0)
            if (r3 == 0) goto L_0x0036
            java.lang.String r0 = "recents"
        L_0x001f:
            X.C162157rM.A00(r5, r0, r7)
        L_0x0022:
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x0035
            java.util.List r2 = r6.A06
            java.util.List r0 = r6.A07
            X.5pX r1 = r5.A00
            if (r1 == 0) goto L_0x0035
            java.util.List r0 = r5.A01(r2, r0)
            r1.A03(r0)
        L_0x0035:
            return
        L_0x0036:
            if (r2 == 0) goto L_0x003b
            java.lang.String r0 = "starred"
            goto L_0x001f
        L_0x003b:
            int r0 = r7.size()
            r4 = 0
            if (r0 <= 0) goto L_0x0063
            java.util.Iterator r3 = r7.iterator()
        L_0x0046:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0063
            java.lang.Object r2 = r3.next()
            X.2iT r2 = (X.C50612iT) r2
            boolean r1 = r2.A0S
            X.8qC r0 = r5.A0F
            java.lang.Object r0 = r0.get()
            X.1el r0 = (X.C27841el) r0
            boolean r0 = r0.A0E
            if (r1 != r0) goto L_0x0046
            java.lang.String r0 = r2.A0G
            goto L_0x001f
        L_0x0063:
            X.C162157rM.A00(r5, r4, r7)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137806pI.BXZ(java.util.List):void");
    }

    public void BXa() {
        this.A02.A02 = null;
    }

    public void BXb(String str) {
        C162157rM r2 = this.A02;
        r2.A0I.remove(str);
        if (r2.A04 != null) {
            for (int i = 0; i < r2.A04.size(); i++) {
                if (((C50612iT) r2.A04.get(i)).A0G.equals(str)) {
                    r2.A04.remove(i);
                    r2.A04((String) null, r2.A04);
                    return;
                }
            }
        }
    }

    public C137806pI(AnonymousClass33p r3, C56932sn r4, C49252gE r5, C162157rM r6, boolean z) {
        super(r4);
        this.A02 = r6;
        this.A00 = r3;
        this.A01 = r5;
        this.A00 = this;
        this.A03 = z;
    }
}
