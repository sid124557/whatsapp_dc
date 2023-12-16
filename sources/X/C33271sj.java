package X;

import com.whatsapp.contact.picker.PhoneContactsSelector;
import java.util.List;

/* renamed from: X.1sj  reason: invalid class name and case insensitive filesystem */
public final class C33271sj extends AnonymousClass5ZM {
    public final C64773Ex A00;
    public final PhoneContactsSelector A01;
    public final List A02;
    public final List A03;

    public C33271sj(C64773Ex r2, PhoneContactsSelector phoneContactsSelector, List list, List list2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A01 = phoneContactsSelector;
        this.A03 = list;
        this.A02 = list2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r3 == null) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r11) {
        /*
            r10 = this;
            X.3Ex r0 = r10.A00
            X.1vC r0 = r0.A05
            X.33M r5 = X.AnonymousClass33M.A00()
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            X.4GK r6 = X.C18630y0.A03(r0)
            r0 = r6
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00b3 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = X.C58142um.A0A     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = "LID_CONTACTS"
            android.database.Cursor r3 = X.C56862sg.A01(r2, r1, r0)     // Catch:{ all -> 0x00b3 }
            r2 = 0
        L_0x001e:
            boolean r0 = r3.moveToNext()     // Catch:{ IllegalStateException -> 0x002e }
            if (r0 == 0) goto L_0x0036
            int r2 = r2 + 1
            X.3ZH r0 = X.AnonymousClass25S.A00(r3)     // Catch:{ IllegalStateException -> 0x002e }
            r4.add(r0)     // Catch:{ IllegalStateException -> 0x002e }
            goto L_0x001e
        L_0x002e:
            r1 = move-exception
            java.lang.String r0 = "contactmanagerdb/getLidContactsList/"
            X.C34461vC.A05(r1, r0, r4, r2)     // Catch:{ all -> 0x00a7 }
            if (r3 == 0) goto L_0x0039
        L_0x0036:
            r3.close()     // Catch:{ all -> 0x00b3 }
        L_0x0039:
            java.lang.StringBuilder r1 = X.C18280x3.A0f(r6)
            java.lang.String r0 = "retrieved "
            X.C18260x0.A19(r0, r1, r4)
            java.lang.String r0 = " LID contacts | time: "
            X.AnonymousClass33M.A04(r5, r0, r1)
            java.util.ArrayList r9 = X.C73783g4.A0c(r4)
            java.util.Iterator r5 = r4.iterator()
        L_0x0050:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x006d
            X.3ZH r0 = X.C18310x6.A0R(r5)
            java.lang.String r4 = r0.A0J()
            long r2 = r0.A0F()
            java.lang.String r1 = r0.A0R
            X.5Qc r0 = new X.5Qc
            r0.<init>(r4, r2, r1)
            r9.add(r0)
            goto L_0x0050
        L_0x006d:
            java.util.List r0 = r10.A02
            r0.addAll(r9)
            java.util.List r0 = r10.A03
            java.util.Iterator r8 = r0.iterator()
        L_0x0078:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r7 = r8.next()
            X.5Qc r7 = (X.C104215Qc) r7
            java.util.Iterator r6 = r9.iterator()
        L_0x0088:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0078
            java.lang.Object r5 = r6.next()
            X.5Qc r5 = (X.C104215Qc) r5
            long r3 = r5.A04
            long r1 = r7.A04
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0088
            r0 = 1
            r5.A03 = r0
            goto L_0x0088
        L_0x00a0:
            com.whatsapp.contact.picker.PhoneContactsSelector r0 = r10.A01
            r0.A75()
            r0 = 0
            return r0
        L_0x00a7:
            r1 = move-exception
            if (r3 == 0) goto L_0x00b2
            r3.close()     // Catch:{ all -> 0x00ae }
            goto L_0x00b2
        L_0x00ae:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00b3 }
        L_0x00b2:
            throw r1     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x00b8 }
            throw r1
        L_0x00b8:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33271sj.A08(java.lang.Object[]):java.lang.Object");
    }
}
