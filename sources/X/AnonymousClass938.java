package X;

/* renamed from: X.938  reason: invalid class name */
public class AnonymousClass938 implements AnonymousClass4C1 {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass938(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        r2 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        r3 = r3 - r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        return java.lang.Float.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        r3 = r3 * (1.0f - X.AnonymousClass001.A05(r0.get()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        if (r2 < 0.0f) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        r2 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r2 > 1.0f) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get() {
        /*
            r5 = this;
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L_0x007e;
                case 1: goto L_0x0059;
                case 2: goto L_0x003e;
                case 3: goto L_0x0099;
                case 4: goto L_0x0031;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r5.A00
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r5.A01
            X.8P2 r0 = (X.AnonymousClass8P2) r0
            float r4 = X.C86664Kz.A02(r1)
            float r2 = X.AnonymousClass8P2.A00(r0)
            r3 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x002c
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x002c
            float r2 = r2 / r4
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x007c
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x002b
        L_0x0029:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x002b:
            float r3 = r3 - r2
        L_0x002c:
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            return r0
        L_0x0031:
            java.lang.Object r1 = r5.A00
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r5.A01
            X.8P2 r0 = (X.AnonymousClass8P2) r0
            float r3 = X.AnonymousClass4L0.A00(r1)
            goto L_0x004c
        L_0x003e:
            java.lang.Object r1 = r5.A00
            X.6h8 r1 = (X.C133316h8) r1
            java.lang.Object r0 = r5.A01
            android.view.View r0 = (android.view.View) r0
            float r3 = X.AnonymousClass4L0.A00(r0)
            X.8P2 r0 = r1.A0J
        L_0x004c:
            java.lang.Object r0 = r0.get()
            float r1 = X.AnonymousClass001.A05(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            float r3 = r3 * r0
            goto L_0x002c
        L_0x0059:
            java.lang.Object r2 = r5.A00
            X.6h8 r2 = (X.C133316h8) r2
            java.lang.Object r0 = r5.A01
            android.view.View r0 = (android.view.View) r0
            float r1 = X.C86664Kz.A02(r0)
            X.8P2 r0 = r2.A0D
            float r2 = X.AnonymousClass8P2.A00(r0)
            float r2 = r2 / r1
            r3 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0078
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0078
            goto L_0x002b
        L_0x0078:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0029
        L_0x007c:
            r2 = 0
            goto L_0x002b
        L_0x007e:
            java.lang.Object r0 = r5.A00
            X.6h8 r0 = (X.C133316h8) r0
            java.lang.Object r2 = r5.A01
            android.view.View r2 = (android.view.View) r2
            android.content.res.Resources r1 = r0.A02
            r0 = 2131168272(0x7f070c10, float:1.7950841E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r3 = X.C86664Kz.A02(r2)
            float r1 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r0
            float r3 = r3 - r1
            goto L_0x002c
        L_0x0099:
            java.lang.Object r0 = r5.A00
            X.6h8 r0 = (X.C133316h8) r0
            java.lang.Object r2 = r5.A01
            android.view.View r2 = (android.view.View) r2
            android.content.res.Resources r1 = r0.A02
            r0 = 2131168272(0x7f070c10, float:1.7950841E38)
            float r1 = X.C86664Kz.A01(r1, r0)
            int r0 = r2.getTop()
            float r0 = (float) r0
            float r1 = r1 - r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass938.get():java.lang.Object");
    }
}
