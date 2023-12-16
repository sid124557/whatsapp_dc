package X;

import com.whatsapp.util.Log;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;

/* renamed from: X.5Ua  reason: invalid class name and case insensitive filesystem */
public class C105215Ua {
    public final C56512s6 A00;
    public final C56612sH A01;
    public final C54292oU A02;
    public final AnonymousClass5ZR A03;
    public final C28891hw A04;
    public final C97054xY A05;
    public final C45182Yz A06;

    public C102395Ir A00(C95814uZ r8) {
        AnonymousClass2z0 r1;
        String str;
        DataInputStream dataInputStream;
        C626936e.A07(r8, "Jid cannot be null");
        File A022 = A02(r8);
        if (A022 == null || !A022.exists()) {
            return null;
        }
        File A032 = A03(r8);
        File A042 = A04(r8);
        if (A042 != null && A042.exists()) {
            try {
                dataInputStream = new DataInputStream(new FileInputStream(A042));
                byte[] bArr = new byte[((int) A042.length())];
                dataInputStream.readFully(bArr);
                String[] split = new String(bArr).split(":;:");
                r1 = new AnonymousClass2z0(C18310x6.A0S(split[0]), split[2], Boolean.valueOf(split[1]).booleanValue());
                dataInputStream.close();
            } catch (FileNotFoundException e) {
                e = e;
                str = "draftvoicenotecache/getquotedmessagekey/ ";
            } catch (IOException e2) {
                e = e2;
                str = "draftvoicenotecache/getquotedmessagekey/";
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            return new C102395Ir(r1, A022, A032);
        }
        r1 = null;
        return new C102395Ir(r1, A022, A032);
        throw th;
        Log.e(str, e);
        r1 = null;
        return new C102395Ir(r1, A022, A032);
    }

    public final File A01() {
        File A032 = C627536m.A03(this.A02.A00, "Cached Voice Notes");
        if (A032 == null) {
            Log.e("draftvoicenotecache/getcachedvoicenotefile/problem creating directory ");
        }
        return A032;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (X.C627536m.A0O(r0) == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C95814uZ r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Chat jid cannot be null"
            X.C626936e.A07(r7, r0)
            java.io.File r0 = r6.A02(r7)
            java.io.File r5 = r6.A03(r7)
            r4 = 1
            if (r0 == 0) goto L_0x0017
            boolean r0 = X.C627536m.A0O(r0)
            r3 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "draftvoicenotecache/deletevoicenote/ deleted: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r2 = " jid "
            X.C18260x0.A1P(r1, r2, r7)
            if (r5 == 0) goto L_0x0082
            boolean r0 = X.C627536m.A0O(r5)
            if (r0 == 0) goto L_0x0082
        L_0x0031:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "draftvoicenotecache/deletevoicenote/ deletedVisualization: "
            r1.append(r0)
            r1.append(r4)
            X.C18260x0.A1P(r1, r2, r7)
            java.io.File r1 = r6.A04(r7)
            if (r1 == 0) goto L_0x005b
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x005b
            boolean r0 = r1.delete()
            if (r0 == 0) goto L_0x005b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "draftvoicenotecache/deletevoicenote deleted quoted message file jid "
            X.C18260x0.A1P(r1, r0, r7)
        L_0x005b:
            if (r3 == 0) goto L_0x0084
            X.4xY r0 = r6.A05
            java.util.Iterator r3 = X.C61102zi.A03(r0)
        L_0x0063:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0084
            java.lang.Object r2 = r3.next()
            X.5G7 r2 = (X.AnonymousClass5G7) r2
            X.5l7 r1 = r2.A00
            X.4uZ r0 = r1.A4J
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0063
            X.3Wi r1 = X.C113245l7.A07(r1)
            r0 = 3
            X.C117625sE.A02(r1, r2, r0)
            goto L_0x0063
        L_0x0082:
            r4 = 0
            goto L_0x0031
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105215Ua.A05(X.4uZ):void");
    }

    public C105215Ua(C56512s6 r3, C56612sH r4, C54292oU r5, AnonymousClass5ZR r6, C28891hw r7, C97054xY r8, C45182Yz r9) {
        this.A02 = r5;
        this.A01 = r4;
        this.A06 = r9;
        this.A00 = r3;
        this.A03 = r6;
        this.A04 = r7;
        this.A05 = r8;
        r7.A06(new C1237669r(this, 9));
    }

    public final File A02(C95814uZ r6) {
        File A012 = A01();
        if (A012 == null) {
            return null;
        }
        Locale locale = Locale.US;
        Object[] A0M = AnonymousClass002.A0M();
        C18280x3.A0w(r6, A0M, 0);
        A0M[1] = "opus";
        return AnonymousClass002.A0A(A012, String.format(locale, "%s.%s", A0M));
    }

    public final File A03(C95814uZ r6) {
        File A012 = A01();
        if (A012 == null) {
            return null;
        }
        Locale locale = Locale.US;
        Object[] A0M = AnonymousClass002.A0M();
        C18280x3.A0w(r6, A0M, 0);
        A0M[1] = "viz";
        return AnonymousClass002.A0A(A012, String.format(locale, "%s.%s", A0M));
    }

    public final File A04(C95814uZ r5) {
        File A012 = A01();
        if (A012 == null) {
            Log.i("draftvoicenotecache/getquotedmessagefile/cached voice note directory is null");
            return null;
        }
        Locale locale = Locale.US;
        Object[] A0L = AnonymousClass002.A0L();
        C18280x3.A0w(r5, A0L, 0);
        return AnonymousClass002.A0A(A012, String.format(locale, "%s.txt", A0L));
    }
}
