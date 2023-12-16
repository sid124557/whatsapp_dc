package X;

import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.3c1  reason: invalid class name and case insensitive filesystem */
public class C71383c1 implements Runnable {
    public long A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public C71383c1(PhotoView photoView) {
        this.A03 = 1;
        this.A01 = photoView;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.whatsapp.registration.VerifyEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.whatsapp.registration.VerifyEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.3cH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.whatsapp.email.VerifyEmailActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.3Zk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: com.whatsapp.registration.VerifyEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: com.whatsapp.registration.VerifyEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: X.3cH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: com.whatsapp.registration.VerifyEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: com.whatsapp.registration.VerifyEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: X.3cH} */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c9, code lost:
        r0.show();
        r5.A05.A0T(r3, 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ee, code lost:
        if (r0 <= 0) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f0, code lost:
        r5.Bou(X.AnonymousClass002.A0F(r5, X.C107565bW.A0D(r5.A00, r7.toMillis(r0)), X.AnonymousClass002.A0L(), r6, com.whatsapp.R.string.f11nameremoved));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0108, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0109, code lost:
        r5.Bot(com.whatsapp.R.string.f11nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        com.whatsapp.util.Log.w(r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.A03
            switch(r0) {
                case 0: goto L_0x006a;
                case 1: goto L_0x0024;
                case 2: goto L_0x00a5;
                case 3: goto L_0x0057;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r10.A01
            com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver r4 = (com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver) r4
            long r2 = r10.A00
            boolean r1 = r10.A02
            X.2qK r0 = r4.A09
            X.2i6 r2 = r0.A00(r2)
            if (r2 != 0) goto L_0x001b
            java.lang.String r0 = "ScheduleCallBroadcastReceiver/onAdvanceAlert scheduled call not exist"
        L_0x0017:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x001a:
            return
        L_0x001b:
            if (r1 != 0) goto L_0x001a
            r1 = 1
            X.2cP r0 = r4.A04
            r0.A00(r2, r1)
            return
        L_0x0024:
            boolean r0 = r10.A02
            if (r0 != 0) goto L_0x001a
            long r3 = r10.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0036
            long r3 = java.lang.System.currentTimeMillis()
            r10.A00 = r3
        L_0x0036:
            long r0 = X.AnonymousClass0x9.A05(r3)
            float r3 = (float) r0
            r1 = 0
            float r0 = (float) r1
            float r3 = r3 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0110
            r0 = 1
            r10.A02 = r0
            java.lang.Object r1 = r10.A01
            android.view.View r1 = (android.view.View) r1
            r1.invalidate()
            boolean r0 = r10.A02
            if (r0 != 0) goto L_0x001a
            r1.post(r10)
            return
        L_0x0057:
            java.lang.Object r2 = r10.A01
            com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver r2 = (com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver) r2
            long r5 = r10.A00
            boolean r7 = r10.A02
            X.2qK r0 = r2.A09
            X.2i6 r3 = r0.A00(r5)
            if (r3 != 0) goto L_0x0117
            java.lang.String r0 = "ScheduleCallBroadcastReceiver/onScheduleCallStart scheduled call not exist"
            goto L_0x0017
        L_0x006a:
            java.lang.Object r5 = r10.A01
            com.whatsapp.email.VerifyEmailActivity r5 = (com.whatsapp.email.VerifyEmailActivity) r5
            boolean r3 = r10.A02
            long r0 = r10.A00
            r6 = 0
            r2 = 2
            X.C621433s.A00(r5, r2)
            X.33p r2 = r5.A09
            r2.A1y(r3)
            if (r3 == 0) goto L_0x008e
            r0 = 44
            X.3Zk r3 = X.C69983Zk.A00(r5, r0)
            X.043 r0 = X.AnonymousClass36l.A07(r5)
            if (r0 != 0) goto L_0x00c9
            r3.run()
            return
        L_0x008e:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r7.toMillis(r0)
            X.2sH r4 = r5.A06
            long r8 = r4.A0H()
            long r2 = r2 + r8
            r5.A01 = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            com.whatsapp.email.VerifyEmailActivity.A0L(r5, r2)
            goto L_0x00ea
        L_0x00a5:
            java.lang.Object r5 = r10.A01
            com.whatsapp.registration.VerifyEmail r5 = (com.whatsapp.registration.VerifyEmail) r5
            boolean r3 = r10.A02
            long r0 = r10.A00
            r6 = 0
            r2 = 2
            X.C621433s.A00(r5, r2)
            X.33p r2 = r5.A09
            r2.A1y(r3)
            if (r3 == 0) goto L_0x00d4
            r0 = 7
            X.3cH r3 = new X.3cH
            r3.<init>((java.lang.Object) r5, (int) r0)
            X.043 r0 = X.AnonymousClass36l.A07(r5)
            if (r0 != 0) goto L_0x00c9
            r3.run()
            return
        L_0x00c9:
            r0.show()
            X.3Wi r2 = r5.A05
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.A0T(r3, r0)
            return
        L_0x00d4:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r7.toMillis(r0)
            X.2sH r4 = r5.A06
            long r8 = r4.A0H()
            long r2 = r2 + r8
            r5.A01 = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            com.whatsapp.registration.VerifyEmail.A0L(r5, r2)
        L_0x00ea:
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0109
            r4 = 2131888836(0x7f120ac4, float:1.9412319E38)
            java.lang.Object[] r3 = X.AnonymousClass002.A0L()
            X.33j r2 = r5.A00
            long r0 = r7.toMillis(r0)
            java.lang.String r0 = X.C107565bW.A0D(r2, r0)
            java.lang.String r0 = X.AnonymousClass002.A0F(r5, r0, r3, r6, r4)
            r5.Bou(r0)
            return
        L_0x0109:
            r0 = 2131888835(0x7f120ac3, float:1.9412317E38)
            r5.Bot(r0)
            return
        L_0x0110:
            java.lang.String r0 = "left"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0117:
            X.3Wi r0 = r2.A01
            r4 = 2
            X.3c4 r1 = new X.3c4
            r1.<init>(r2, r3, r4, r5, r7)
            r0.A0S(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71383c1.run():void");
    }

    public C71383c1(Object obj, int i, long j, boolean z) {
        this.A03 = i;
        this.A01 = obj;
        this.A02 = z;
        this.A00 = j;
    }
}
