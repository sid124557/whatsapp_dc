package X;

import android.content.Context;
import android.graphics.Rect;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;

/* renamed from: X.7nj  reason: invalid class name and case insensitive filesystem */
public final class C160497nj {
    public static final C160247nJ A00(C152987aU r13, C186448vK r14, C180488l9 r15, Object obj, long j) {
        C162457s7.A0J(r14, 2);
        Context context = r13.A02;
        C159567m6.A01("Reducer.reduceTree");
        ArrayList A0s = AnonymousClass001.A0s();
        C186448vK r9 = null;
        RenderTreeNode A00 = C161037ot.A00(new Rect(0, 0, r14.getWidth(), r14.getHeight()), r14, (RenderTreeNode) null, C161037ot.A00);
        A0s.add(A00);
        C161037ot.A01(context, r14, A00, A0s, 0, 0);
        RenderTreeNode[] renderTreeNodeArr = (RenderTreeNode[]) A0s.toArray(new RenderTreeNode[0]);
        C159567m6.A00();
        if (C1454976c.A00) {
            r9 = r14;
        }
        return new C160247nJ(r13.A03().A01, r15, new C151847Wn(A00, r9, renderTreeNodeArr, j), obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r1 != null) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C160247nJ A02(android.content.Context r6, X.C160247nJ r7, X.C158047jL r8, java.lang.Object r9, int r10, long r11) {
        /*
            r5 = this;
            java.lang.String r0 = "RC Create Tree"
            X.C159567m6.A01(r0)
            if (r7 == 0) goto L_0x0025
            X.8l9 r4 = r8.A00
            X.C162457s7.A0C(r4)
            X.7Wn r3 = r7.A02
            X.8l9 r0 = r7.A01
            if (r4 != r0) goto L_0x0027
            boolean r0 = X.C151847Wn.A00(r3, r11)
            if (r0 == 0) goto L_0x0027
            X.7Fd r2 = r7.A00
            java.lang.Object r1 = r8.A01
            X.7nJ r0 = new X.7nJ
            r0.<init>(r2, r4, r3, r1)
        L_0x0021:
            X.C159567m6.A00()
            return r0
        L_0x0025:
            r1 = 0
            goto L_0x002b
        L_0x0027:
            X.7Fd r1 = r7.A00
            if (r1 == 0) goto L_0x0025
        L_0x002b:
            X.7jG r0 = new X.7jG
            r0.<init>(r1)
            X.7aU r2 = new X.7aU
            r2.<init>(r6, r0, r9, r10)
            X.8l9 r1 = r8.A00
            X.C162457s7.A0C(r1)
            java.lang.Object r0 = r8.A01
            X.7nJ r0 = X.C152987aU.A00(r2, r1, r0, r11)
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160497nj.A02(android.content.Context, X.7nJ, X.7jL, java.lang.Object, int, long):X.7nJ");
    }

    public final C160247nJ A01(Context context, C160247nJ r3, C158047jL r4, Object obj, int i, int i2, int i3) {
        return A02(context, r3, r4, obj, i, C153917cG.A00(i2, i3));
    }
}
