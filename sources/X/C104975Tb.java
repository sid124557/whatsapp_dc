package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5Tb  reason: invalid class name and case insensitive filesystem */
public final class C104975Tb {
    public final C56972sr A00;
    public final C48372en A01;
    public final AnonymousClass1VX A02;
    public final List A03;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r5.A02.A0X(451) == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(X.C108985dt r6, com.whatsapp.jid.UserJid r7) {
        /*
            r5 = this;
            r3 = 0
            X.C162457s7.A0J(r7, r3)
            X.2sr r2 = r5.A00
            boolean r0 = r2.A0a(r7)
            if (r0 == 0) goto L_0x0017
            X.1VX r1 = r5.A02
            r0 = 451(0x1c3, float:6.32E-43)
            boolean r1 = r1.A0X(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r4 = 1
            if (r0 != 0) goto L_0x0052
            boolean r0 = r2.A0a(r7)
            if (r0 != 0) goto L_0x0053
            X.1VX r1 = r5.A02
            r0 = 582(0x246, float:8.16E-43)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0053
            X.2en r1 = r5.A01
            int r0 = r1.A00()
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 <= 0) goto L_0x0052
            if (r6 == 0) goto L_0x0052
            boolean r0 = r6.A0X
            if (r0 == 0) goto L_0x0052
            int r0 = r1.A00()
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 <= 0) goto L_0x0052
            java.util.List r2 = r6.A0R
            java.lang.String r1 = "collections"
            X.7xt r0 = new X.7xt
            r0.<init>(r1)
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0053
        L_0x0052:
            return r4
        L_0x0053:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C104975Tb.A02(X.5dt, com.whatsapp.jid.UserJid):boolean");
    }

    public final boolean A03(C108985dt r4, String str, boolean z) {
        if (!z) {
            return false;
        }
        C48372en r1 = this.A01;
        if ((r1.A00() & 128) <= 0 || r4 == null || !r4.A0X) {
            return false;
        }
        if ((r1.A00() & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) > 0) {
            return r4.A0R.contains(new C165947xt(str));
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r0 == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(X.C108985dt r3) {
        /*
            r2 = this;
            X.1VX r1 = r2.A02
            r0 = 1678(0x68e, float:2.351E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0013
            r0 = 1096(0x448, float:1.536E-42)
            boolean r0 = r1.A0X(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            java.lang.String r0 = "search"
            boolean r0 = r2.A03(r3, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C104975Tb.A00(X.5dt):boolean");
    }

    public final boolean A01(C108985dt r3) {
        return A03(r3, "variants", this.A02.A0X(3837));
    }

    public C104975Tb(C56972sr r4, C48372en r5, AnonymousClass1VX r6) {
        C18260x0.A0V(r4, r6, r5);
        this.A00 = r4;
        this.A02 = r6;
        this.A01 = r5;
        List A012 = AnonymousClass2AB.A01(C56952sp.A08(r6, 1846), ",");
        ArrayList A0c = C73783g4.A0c(A012);
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            AnonymousClass0x7.A1D(C175728Zm.A0I(AnonymousClass001.A0m(it)), A0c);
        }
        this.A03 = A0c;
    }
}
