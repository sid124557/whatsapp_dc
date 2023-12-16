package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4gy  reason: invalid class name and case insensitive filesystem */
public abstract class C90254gy extends C90534hg {
    public final C69263Wi A00;
    public final C64773Ex A01;
    public final C56422rx A02;
    public final AnonymousClass5ZU A03;
    public final C620733j A04;

    public C90254gy(C111095hX r9, C69263Wi r10, C56972sr r11, AnonymousClass5Y9 r12, C152967aS r13, C64773Ex r14, C56422rx r15, AnonymousClass5ZU r16, C620733j r17, AnonymousClass1VX r18, UserJid userJid) {
        super(r9, r11, r12, r13, r18, userJid);
        this.A00 = r10;
        this.A01 = r14;
        this.A03 = r16;
        this.A04 = r17;
        this.A02 = r15;
    }

    public AnonymousClass6J5 A0L(ViewGroup viewGroup, int i) {
        if (i != 2) {
            return super.A0L(viewGroup, i);
        }
        UserJid userJid = this.A07;
        C56972sr r3 = this.A03;
        C111095hX r2 = this.A02;
        C64773Ex r4 = this.A01;
        AnonymousClass5ZU r6 = this.A03;
        return new C90564hj(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), r2, r3, r4, this.A02, r6, userJid);
    }

    public void A0P(int i) {
        int A032;
        int i2;
        List list = this.A00;
        if (list.size() > 0 && (C18300x5.A0c(list) instanceof C132406fE) && (A032 = AnonymousClass002.A03(list)) != -1) {
            C132406fE r2 = (C132406fE) list.get(A032);
            if (i == -1) {
                i2 = 4;
            } else {
                C18260x0.A0z("biz-collection-product-list-adapter/error: ", AnonymousClass001.A0o(), i);
                i2 = 2;
            }
            r2.A00 = i2;
            A06(A032);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r2 = r7.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Q(X.C49722gz r7, java.util.List r8) {
        /*
            r6 = this;
            java.util.List r5 = r6.A00
            r5.clear()
            if (r7 == 0) goto L_0x0011
            X.2gP r2 = r7.A00
            int r1 = r2.A00
            r0 = 1
            if (r1 == r0) goto L_0x003c
            r0 = 2
            if (r1 == r0) goto L_0x003c
        L_0x0011:
            if (r8 == 0) goto L_0x0047
            java.util.Iterator r4 = r8.iterator()
        L_0x0017:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0047
            X.5dw r3 = X.C86664Kz.A12(r4)
            boolean r0 = r6 instanceof X.C90844iP
            if (r0 != 0) goto L_0x0029
            r0 = 0
            X.C162457s7.A0J(r3, r0)
        L_0x0029:
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x0017
            long r1 = r6.A0K(r3)
            X.6fH r0 = new X.6fH
            r0.<init>(r3, r1)
            r5.add(r0)
            goto L_0x0017
        L_0x003c:
            java.lang.String r1 = r7.A03
            X.6fG r0 = new X.6fG
            r0.<init>(r2, r1)
            r5.add(r0)
            goto L_0x0011
        L_0x0047:
            X.6fE r0 = new X.6fE
            r0.<init>()
            r5.add(r0)
            int r0 = X.AnonymousClass002.A03(r5)
            r6.A07(r0)
            r6.A05()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90254gy.A0Q(X.2gz, java.util.List):void");
    }

    public void A0S(Boolean bool) {
        int A032;
        if (bool == null || !bool.booleanValue()) {
            A0M();
        } else {
            A0N();
        }
        List list = this.A00;
        if (list.size() > 0 && (C18300x5.A0c(list) instanceof C132406fE) && (A032 = AnonymousClass002.A03(list)) != -1) {
            ((C132406fE) list.get(A032)).A00 = 5;
        }
    }

    public void A0R(C109015dw r5) {
        if (r5.A01()) {
            int i = 0;
            while (true) {
                List list = this.A00;
                if (i < list.size()) {
                    C147037Co r2 = (C147037Co) list.get(i);
                    if (r2 instanceof C132426fH) {
                        C132426fH r22 = (C132426fH) r2;
                        if (r22.A01.A0F.equals(r5.A0F)) {
                            r22.A01 = r5;
                            r22.A00 = A0K(r5);
                            A06(i);
                            return;
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
