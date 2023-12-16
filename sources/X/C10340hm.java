package X;

import com.whatsapp.util.Log;

/* renamed from: X.0hm  reason: invalid class name and case insensitive filesystem */
public class C10340hm implements AnonymousClass4EZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass0XM A01;
    public final /* synthetic */ Runnable A02;
    public final /* synthetic */ byte[] A03;
    public final /* synthetic */ byte[] A04;

    public void BdM(AnonymousClass36K r10, String str) {
        AnonymousClass36K A0k = r10.A0k(0);
        C626936e.A06(A0k);
        AnonymousClass36K.A0N(A0k, "crypto");
        String A0p = A0k.A0p("version");
        byte[] A0t = A0k.A0m("code").A0t();
        byte[] A0t2 = A0k.A0m("password").A0t();
        int i = this.A00;
        A00(this.A02, A0p, A0t, A0t2, this.A03, this.A04, i, 0);
    }

    public C10340hm(AnonymousClass0XM r1, Runnable runnable, byte[] bArr, byte[] bArr2, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A03 = bArr;
        this.A04 = bArr2;
        this.A02 = runnable;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.lang.Runnable r16, java.lang.String r17, byte[] r18, byte[] r19, byte[] r20, byte[] r21, int r22, int r23) {
        /*
            r15 = this;
            java.lang.String r2 = ", error_code="
            r7 = r18
            java.util.Arrays.toString(r7)
            r6 = r19
            java.util.Arrays.toString(r6)
            r8 = r20
            java.util.Arrays.toString(r8)
            r14 = r21
            java.util.Arrays.toString(r14)
            r4 = r22
            r3 = r23
            if (r23 != 0) goto L_0x0047
            r5 = r17
            if (r17 == 0) goto L_0x0047
            if (r18 == 0) goto L_0x0047
            if (r19 == 0) goto L_0x0047
            r1 = 1
            X.0XM r0 = r15.A01
            if (r4 == r1) goto L_0x0037
            X.2Vx r4 = r0.A03
            r9 = 0
            r4.A00(r5, r6, r7, r8, r9)
        L_0x0031:
            if (r16 == 0) goto L_0x0036
            r16.run()
        L_0x0036:
            return
        L_0x0037:
            X.2oU r0 = r0.A02
            android.content.Context r9 = r0.A06()
            r10 = r5
            r11 = r7
            r12 = r6
            r13 = r8
            X.C06550Ye.A0E(r9, r10, r11, r12, r13, r14)
            goto L_0x0031
        L_0x0047:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BackupSendMethods/handleCreateCipherKeyResponse failed to create a key, creation_mode= "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.AnonymousClass000.A0Y(r2, r1, r3)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10340hm.A00(java.lang.Runnable, java.lang.String, byte[], byte[], byte[], byte[], int, int):void");
    }

    public void BSN(AnonymousClass36K r15, String str) {
        for (AnonymousClass36K r1 : r15.A0s("error")) {
            if (r1 != null) {
                String A0p = r1.A0p("code");
                String A0p2 = r1.A0p("text");
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("BackupSendMethods/sendGetCipherKey id=");
                A0o.append(str);
                A0o.append(" error=");
                A0o.append(A0p);
                Log.w(AnonymousClass000.A0V(" ", A0p2, A0o));
                if (A0p != null) {
                    int parseInt = Integer.parseInt(A0p);
                    int i = this.A00;
                    A00(this.A02, (String) null, (byte[]) null, (byte[]) null, this.A03, this.A04, i, parseInt);
                }
            }
        }
    }

    public void BQs(String str) {
        Log.e(AnonymousClass000.A0V("BackupSendMethods/sendGetCipherKey/failed to deliver id=", str, AnonymousClass001.A0o()));
    }
}
