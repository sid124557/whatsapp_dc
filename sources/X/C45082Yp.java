package X;

/* renamed from: X.2Yp  reason: invalid class name and case insensitive filesystem */
public class C45082Yp {
    public final C49712gy A00;
    public final AnonymousClass2M5 A01;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        if (r2.A0Y(r1, r0) == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0093, code lost:
        r2 = r12.A00;
        r1 = r13.A1J;
        r4 = X.C18300x5.A0i(r1.A00);
        r5 = r1.A01;
        X.C162457s7.A0C(r5);
        r2.A02(new com.whatsapp.jobqueue.job.SendEngagedReceiptJob(r4, r5, r6, r7, r13.A0K, r13.A1O));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ae, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C624134x r13, java.lang.String r14, java.lang.String r15) {
        /*
            r12 = this;
            r7 = r15
            X.C18260x0.A0P(r13, r15)
            X.2M5 r3 = r12.A01
            X.1VX r2 = r3.A01
            r0 = 2849(0xb21, float:3.992E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 == 0) goto L_0x00b2
            X.33p r0 = r3.A00
            boolean r4 = r0.A2G()
        L_0x0018:
            r3 = 524288(0x80000, float:7.34684E-40)
            int r0 = r13.A0A
            r0 = r0 & r3
            boolean r3 = X.AnonymousClass000.A1U(r0, r3)
            r0 = 2848(0xb20, float:3.991E-42)
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 != 0) goto L_0x00af
            if (r4 == 0) goto L_0x00af
            if (r3 == 0) goto L_0x00af
            r6 = r14
            int r0 = r14.hashCode()
            switch(r0) {
                case -1435389390: goto L_0x004b;
                case -1423499950: goto L_0x0056;
                case -903583990: goto L_0x0061;
                case -862592005: goto L_0x006d;
                case 1080570930: goto L_0x0078;
                case 2139281359: goto L_0x0083;
                default: goto L_0x0035;
            }
        L_0x0035:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ROI source "
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = " disabled"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
        L_0x0047:
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        L_0x004b:
            java.lang.String r0 = "media-image"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0035
            r0 = 3527(0xdc7, float:4.942E-42)
            goto L_0x008d
        L_0x0056:
            java.lang.String r0 = "media-video"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0035
            r0 = 3529(0xdc9, float:4.945E-42)
            goto L_0x008d
        L_0x0061:
            java.lang.String r0 = "quick-reply"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0035
            r0 = 3524(0xdc4, float:4.938E-42)
            goto L_0x008d
        L_0x006d:
            java.lang.String r0 = "cta-call"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0035
            r0 = 3526(0xdc6, float:4.941E-42)
            goto L_0x008d
        L_0x0078:
            java.lang.String r0 = "cta-url"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0035
            r0 = 3525(0xdc5, float:4.94E-42)
            goto L_0x008d
        L_0x0083:
            java.lang.String r0 = "media-doc"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0035
            r0 = 3528(0xdc8, float:4.944E-42)
        L_0x008d:
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 == 0) goto L_0x0035
            X.2gy r2 = r12.A00
            X.2z0 r1 = r13.A1J
            X.4uZ r0 = r1.A00
            java.lang.String r4 = X.C18300x5.A0i(r0)
            java.lang.String r5 = r1.A01
            X.C162457s7.A0C(r5)
            long r8 = r13.A0K
            long r10 = r13.A1O
            com.whatsapp.jobqueue.job.SendEngagedReceiptJob r3 = new com.whatsapp.jobqueue.job.SendEngagedReceiptJob
            r3.<init>(r4, r5, r6, r7, r8, r10)
            r2.A02(r3)
            return
        L_0x00af:
            java.lang.String r0 = "ROI receipt disabled"
            goto L_0x0047
        L_0x00b2:
            r4 = 1
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45082Yp.A00(X.34x, java.lang.String, java.lang.String):void");
    }

    public C45082Yp(C49712gy r1, AnonymousClass2M5 r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
