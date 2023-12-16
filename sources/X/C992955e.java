package X;

import java.lang.ref.WeakReference;

/* renamed from: X.55e  reason: invalid class name and case insensitive filesystem */
public class C992955e extends AnonymousClass5ZM {
    public final C29441ip A00;
    public final C64773Ex A01;
    public final C66413Li A02;
    public final AnonymousClass31C A03;
    public final String A04;
    public final WeakReference A05;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        if (!this.A00.A0F()) {
            return AnonymousClass0x9.A0C(AnonymousClass304.A04, (Object) null);
        }
        try {
            this.A03.A08(32000);
            return this.A02.A00(AnonymousClass227.A0D, this.A04);
        } catch (C376223j unused) {
            return AnonymousClass0x9.A0C(AnonymousClass304.A04, (Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r7) {
        /*
            r6 = this;
            android.util.Pair r7 = (android.util.Pair) r7
            java.lang.ref.WeakReference r5 = r6.A05
            java.lang.Object r2 = r5.get()
            X.8u5 r2 = (X.C185688u5) r2
            if (r2 == 0) goto L_0x0016
            r2.BUK()
            if (r7 != 0) goto L_0x0017
            java.lang.String r0 = "handlecontactlesssync/fetchContactUsingNumber/disconnected/"
        L_0x0013:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r0 = r7.first
            X.304 r0 = (X.AnonymousClass304) r0
            int r1 = r0.A00
            r0 = 3
            if (r1 == r0) goto L_0x0053
            r0 = 2
            if (r1 == r0) goto L_0x0053
            if (r1 != 0) goto L_0x002f
            java.lang.String r0 = "handlecontactlesssync/fetchContactUsingNumber/network-unavailable/"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
        L_0x002b:
            r2.BbX(r0)
            return
        L_0x002f:
            r0 = 5
            if (r1 != r0) goto L_0x0039
            java.lang.String r0 = "handlecontactlesssync/fetchContactUsingNumber/rateLimited/try-again-later/"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 2
            goto L_0x002b
        L_0x0039:
            r0 = 4
            if (r1 != r0) goto L_0x0043
            java.lang.String r0 = "handlecontactlesssync/fetchContactUsingNumber/try-again/"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 1
            goto L_0x002b
        L_0x0043:
            r0 = 1
            if (r1 != r0) goto L_0x0049
            java.lang.String r0 = "handlecontactlesssync/fetchContactUsingNumber/existing request ongoing/"
            goto L_0x0013
        L_0x0049:
            r0 = 6
            if (r1 != r0) goto L_0x0016
            java.lang.String r0 = "handlecontactlesssync/fetchContactUsingNumber/exception-occurred/"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 3
            goto L_0x002b
        L_0x0053:
            java.lang.Object r4 = r7.second
            X.2UJ r4 = (X.AnonymousClass2UJ) r4
            r3 = 1
            boolean r1 = X.AnonymousClass000.A1W(r4)
            java.lang.String r0 = "deeplink: user is null"
            X.C626936e.A0D(r1, r0)
            int r1 = r4.A04
            if (r1 != r3) goto L_0x0075
            com.whatsapp.jid.UserJid r1 = r4.A0D
            if (r1 == 0) goto L_0x0073
            X.3Ex r0 = r6.A01
            X.3ZH r0 = r0.A0A(r1)
        L_0x006f:
            r2.BTA(r0)
            return
        L_0x0073:
            r0 = 0
            goto L_0x006f
        L_0x0075:
            r0 = 2
            if (r1 != r0) goto L_0x008a
            java.lang.String r0 = "handlecontactlesssync/fetchContactUsingNumber/user/not-wa/"
        L_0x007a:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x007d:
            java.lang.Object r1 = r5.get()
            X.8u5 r1 = (X.C185688u5) r1
            if (r1 == 0) goto L_0x0016
            r0 = 0
            r1.BTA(r0)
            return
        L_0x008a:
            r0 = 3
            if (r1 != r0) goto L_0x007d
            java.lang.String r0 = "handlecontactlesssync/fetchContactUsingNumber/invalid/"
            goto L_0x007a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C992955e.A0C(java.lang.Object):void");
    }

    public C992955e(C29441ip r2, C64773Ex r3, C185688u5 r4, C66413Li r5, AnonymousClass31C r6, String str) {
        this.A05 = AnonymousClass0x9.A14(r4);
        this.A04 = str;
        this.A03 = r6;
        this.A02 = r5;
        this.A01 = r3;
        this.A00 = r2;
    }
}
