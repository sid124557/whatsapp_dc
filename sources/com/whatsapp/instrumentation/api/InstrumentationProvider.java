package com.whatsapp.instrumentation.api;

import X.AnonymousClass2L8;
import X.AnonymousClass2OK;
import X.C18280x3;
import X.C18320x8;
import X.C18530xp;
import X.C34211uP;
import X.C51072jE;
import X.C54742pD;
import X.C60692yy;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.text.TextUtils;

public class InstrumentationProvider extends C18530xp {
    public AnonymousClass2OK A00;
    public AnonymousClass2L8 A01;
    public C60692yy A02;
    public C34211uP A03;
    public C51072jE A04;

    public String getType(Uri uri) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008f, code lost:
        if ((!r5.A06.A0C((com.whatsapp.jid.GroupJid) r1)) == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a6, code lost:
        if (android.text.TextUtils.isEmpty(r5.A03.A0E(r2, false).A01) == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012d, code lost:
        android.os.Binder.restoreCallingIdentity(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0130, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r24, java.lang.String[] r25, java.lang.String r26, java.lang.String[] r27, java.lang.String r28) {
        /*
            r23 = this;
            r0 = r23
            r3 = r24
            X.2pD r20 = r0.A09(r3)
            X.2L8 r2 = r0.A01
            android.content.UriMatcher r0 = r2.A00
            int r1 = r0.match(r3)
            r0 = 1
            if (r1 != r0) goto L_0x0131
            X.8qC r0 = r2.A01
            java.lang.Object r5 = r0.get()
            X.2w7 r5 = (X.C58972w7) r5
            long r7 = android.os.Binder.clearCallingIdentity()
            X.3Ex r0 = r5.A02     // Catch:{ all -> 0x012a }
            java.util.ArrayList r0 = r0.A0E()     // Catch:{ all -> 0x012a }
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x012a }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x012a }
        L_0x002d:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x00e5
            X.3ZH r2 = X.C18310x6.A0R(r6)     // Catch:{ all -> 0x012a }
            if (r2 == 0) goto L_0x002d
            java.lang.Class<X.4uZ> r3 = X.C95814uZ.class
            com.whatsapp.jid.Jid r1 = r2.A0I(r3)     // Catch:{ all -> 0x012a }
            X.4uZ r1 = (X.C95814uZ) r1     // Catch:{ all -> 0x012a }
            if (r1 == 0) goto L_0x00ac
            X.32v r0 = r5.A0E     // Catch:{ all -> 0x012a }
            boolean r0 = r0.A01(r1)     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x00ac
            com.whatsapp.jid.Jid r0 = r2.A0I(r3)     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x00ac
            boolean r0 = r1 instanceof X.C95804uY     // Catch:{ all -> 0x012a }
            if (r0 != 0) goto L_0x00ac
            boolean r0 = X.C155477ey.A00(r1)     // Catch:{ all -> 0x012a }
            if (r0 != 0) goto L_0x00ac
            boolean r0 = r2.A10     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x00ac
            X.4uZ r0 = r2.A0H     // Catch:{ all -> 0x012a }
            boolean r0 = r0 instanceof X.AnonymousClass1fS     // Catch:{ all -> 0x012a }
            if (r0 != 0) goto L_0x00ac
            X.2sr r0 = r5.A01     // Catch:{ all -> 0x012a }
            boolean r0 = X.C56972sr.A08(r0, r2)     // Catch:{ all -> 0x012a }
            if (r0 != 0) goto L_0x00ac
            X.4uZ r1 = r2.A0H     // Catch:{ all -> 0x012a }
            boolean r0 = X.C627336j.A0I(r1)     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x00ac
            boolean r0 = r1 instanceof X.C135216kJ     // Catch:{ all -> 0x012a }
            if (r0 != 0) goto L_0x00ac
            boolean r0 = r2.A0U()     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x0091
            X.4uZ r1 = r2.A0H     // Catch:{ all -> 0x012a }
            boolean r0 = r1 instanceof X.C27991fJ     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x0091
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1     // Catch:{ all -> 0x012a }
            X.2sj r0 = r5.A06     // Catch:{ all -> 0x012a }
            boolean r0 = r0.A0C(r1)     // Catch:{ all -> 0x012a }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00ac
        L_0x0091:
            X.1VX r0 = r5.A07     // Catch:{ all -> 0x012a }
            boolean r0 = X.AnonymousClass5YT.A00(r2, r0)     // Catch:{ all -> 0x012a }
            if (r0 != 0) goto L_0x00ac
            X.5ZU r1 = r5.A03     // Catch:{ all -> 0x012a }
            r0 = 0
            X.7HU r0 = r1.A0E(r2, r0)     // Catch:{ all -> 0x012a }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x012a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x012a }
            if (r0 != 0) goto L_0x00ac
        L_0x00a8:
            r4.add(r2)     // Catch:{ all -> 0x012a }
            goto L_0x002d
        L_0x00ac:
            X.1VX r3 = r5.A07     // Catch:{ all -> 0x012a }
            r1 = 5470(0x155e, float:7.665E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x012a }
            boolean r0 = r3.A0Y(r0, r1)     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x002d
            X.5rC r0 = r5.A00     // Catch:{ all -> 0x012a }
            java.lang.Object r0 = r0.A05()     // Catch:{ all -> 0x012a }
            X.2sS r0 = (X.C56722sS) r0     // Catch:{ all -> 0x012a }
            com.whatsapp.jid.Jid r1 = X.AnonymousClass3ZH.A03(r2)     // Catch:{ all -> 0x012a }
            X.4uZ r1 = (X.C95814uZ) r1     // Catch:{ all -> 0x012a }
            if (r1 == 0) goto L_0x002d
            if (r0 == 0) goto L_0x002d
            X.2m4 r0 = r0.A01     // Catch:{ all -> 0x012a }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x002d
            boolean r0 = X.C155477ey.A00(r1)     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x002d
            X.2ss r0 = r5.A05     // Catch:{ all -> 0x012a }
            java.util.Set r0 = r0.A0F()     // Catch:{ all -> 0x012a }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x002d
            goto L_0x00a8
        L_0x00e5:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x012a }
            java.lang.String r0 = "ContactsUriHandler/query returning cursor; profile_picture_enabled="
            r3.append(r0)     // Catch:{ all -> 0x012a }
            X.2OK r13 = r5.A08     // Catch:{ all -> 0x012a }
            X.1VX r2 = r13.A01     // Catch:{ all -> 0x012a }
            r1 = 5340(0x14dc, float:7.483E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x012a }
            boolean r0 = r2.A0Y(r0, r1)     // Catch:{ all -> 0x012a }
            X.C18260x0.A1U(r3, r0)     // Catch:{ all -> 0x012a }
            X.5rC r0 = r5.A00     // Catch:{ all -> 0x012a }
            java.lang.Object r10 = r0.A05()     // Catch:{ all -> 0x012a }
            X.2sS r10 = (X.C56722sS) r10     // Catch:{ all -> 0x012a }
            X.8vZ r3 = r5.A0F     // Catch:{ all -> 0x012a }
            X.5ZU r11 = r5.A03     // Catch:{ all -> 0x012a }
            X.2ro r12 = r5.A04     // Catch:{ all -> 0x012a }
            X.2L7 r14 = r5.A09     // Catch:{ all -> 0x012a }
            X.2Zk r15 = r5.A0A     // Catch:{ all -> 0x012a }
            X.2Zl r2 = r5.A0B     // Catch:{ all -> 0x012a }
            X.32v r1 = r5.A0E     // Catch:{ all -> 0x012a }
            X.2fH r0 = r5.A0C     // Catch:{ all -> 0x012a }
            X.0xv r9 = new X.0xv     // Catch:{ all -> 0x012a }
            r22 = r25
            r17 = r0
            r18 = r1
            r19 = r3
            r21 = r4
            r16 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x012a }
            android.os.Binder.restoreCallingIdentity(r7)
            return r9
        L_0x012a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x012c }
        L_0x012c:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r7)
            throw r0
        L_0x0131:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Access denied to "
            java.lang.String r1 = X.AnonymousClass000.A0P(r3, r0, r1)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.instrumentation.api.InstrumentationProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public final C54742pD A09(Uri uri) {
        A08();
        if (AnonymousClass2OK.A00(this.A00)) {
            C54742pD A002 = this.A03.A00();
            A002.A00();
            if (this.A04.A02()) {
                synchronized (this.A00) {
                }
                if (Binder.getCallingUid() != Process.myUid()) {
                    C60692yy r2 = this.A02;
                    String A0Z = C18280x3.A0Z(r2.A01(), C60692yy.A00(A002.A01, "auth/token"));
                    String queryParameter = uri.getQueryParameter("authorization_token");
                    if (!TextUtils.isEmpty(A0Z) && A0Z.equals(queryParameter)) {
                        return A002;
                    }
                    throw new SecurityException("Access denied: auth token is missing");
                }
                throw new SecurityException("Access checks is executed outside of binder context.");
            }
            throw new SecurityException("WhatsApp is not active.");
        }
        throw new SecurityException("Feature is disabled.");
    }

    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        A09(uri);
        throw C18320x8.A0m();
    }

    public int delete(Uri uri, String str, String[] strArr) {
        A09(uri);
        throw C18320x8.A0m();
    }

    public Uri insert(Uri uri, ContentValues contentValues, Bundle bundle) {
        A09(uri);
        throw C18320x8.A0m();
    }

    public ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        A09(uri);
        throw C18320x8.A0m();
    }

    public int update(Uri uri, ContentValues contentValues, Bundle bundle) {
        A09(uri);
        throw C18320x8.A0m();
    }

    public int delete(Uri uri, Bundle bundle) {
        A09(uri);
        throw C18320x8.A0m();
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        A09(uri);
        throw C18320x8.A0m();
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        A09(uri);
        throw C18320x8.A0m();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        A09(uri);
        return super.query(uri, strArr, str, strArr2, str2, cancellationSignal);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        A09(uri);
        throw C18320x8.A0m();
    }

    public Cursor query(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        A09(uri);
        return super.query(uri, strArr, bundle, cancellationSignal);
    }
}
