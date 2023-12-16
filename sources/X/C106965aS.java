package X;

import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.5aS  reason: invalid class name and case insensitive filesystem */
public class C106965aS {
    public static final int A07;
    public static final String A08;
    public static final byte[] A09 = {0, 10};
    public C174288Tr A00;
    public MappedByteBuffer A01;
    public Map A02;
    public final C72173dI A03;
    public volatile File A04;
    public volatile String A05 = "unknown";
    public volatile boolean A06;

    static {
        Locale locale = Locale.US;
        Object[] A0L = AnonymousClass002.A0L();
        C18280x3.A1S(A0L, C18280x3.A07() % 10000000);
        String format = String.format(locale, "%07d", A0L);
        A08 = format;
        A07 = format.getBytes().length + 1;
    }

    public static /* synthetic */ void A01(C106965aS r10, String str) {
        if (r10.A06) {
            byte[] bytes = str.getBytes();
            int length = bytes.length;
            C626936e.A0D(AnonymousClass001.A1Y(length, 100), "Log entry too large");
            if (((long) (length + 1 + r10.A01.position())) >= 1024) {
                MappedByteBuffer mappedByteBuffer = r10.A01;
                int i = A07;
                mappedByteBuffer.position(i);
                MappedByteBuffer mappedByteBuffer2 = r10.A01;
                byte[] bArr = A09;
                mappedByteBuffer2.put(bArr);
                int i2 = i + r10.A00.byteSize;
                r10.A01.position(i2);
                r10.A01.put(bArr);
                Iterator it = r10.A00.iterator();
                while (it.hasNext()) {
                    byte[] bArr2 = (byte[]) it.next();
                    r10.A01.position(i2 - 1);
                    r10.A01.put((byte) 10);
                    MappedByteBuffer mappedByteBuffer3 = r10.A01;
                    int length2 = bArr2.length;
                    mappedByteBuffer3.position((mappedByteBuffer3.position() - 1) - length2);
                    r10.A01.put(bArr2);
                    i2 -= length2 + 1;
                }
                r10.A01.position(i + r10.A00.byteSize + 2);
            }
            MappedByteBuffer mappedByteBuffer4 = r10.A01;
            mappedByteBuffer4.position((mappedByteBuffer4.position() - 2) + length);
            r10.A01.put((byte) 10);
            r10.A01.put(A09);
            MappedByteBuffer mappedByteBuffer5 = r10.A01;
            mappedByteBuffer5.position(((mappedByteBuffer5.position() - 2) - 1) - length);
            r10.A01.put(bytes);
            MappedByteBuffer mappedByteBuffer6 = r10.A01;
            mappedByteBuffer6.position(mappedByteBuffer6.position() + 1 + 2);
            r10.A00.add(bytes);
        }
    }

    public Map A02() {
        BufferedReader bufferedReader;
        if (!this.A06) {
            Log.d("UiNavigationPersistenceManager/uitombstone not initialized");
            return new AnonymousClass05C();
        }
        if (this.A02 == null) {
            AnonymousClass05C r5 = new AnonymousClass05C(5);
            for (int i = 0; i < 5; i++) {
                String valueOf = String.valueOf(i);
                if (valueOf.equals(this.A05)) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("UiNavigationPersistenceManager/createAppSessionTombStoneMap ignore fileInUse:");
                    C18260x0.A1J(A0o, this.A05);
                } else {
                    File A0A = AnonymousClass002.A0A(this.A04, valueOf);
                    if (A0A.exists()) {
                        try {
                            bufferedReader = new BufferedReader(new FileReader(A0A));
                            String readLine = bufferedReader.readLine();
                            C18260x0.A0q("UiNavigationPersistenceManager/uitombstone/sessionid:", readLine, AnonymousClass001.A0o());
                            r5.put(readLine, A0A);
                            bufferedReader.close();
                        } catch (IOException unused) {
                            C18260x0.A0w("UiNavigationPersistenceManager/uitombstone/failed to read:", AnonymousClass001.A0o(), i);
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    } else {
                        continue;
                    }
                }
            }
            this.A02 = r5;
            C18260x0.A1P(AnonymousClass001.A0o(), "UiNavigationPersistenceManager/getAppSessionTombstoneMap: ", r5);
        }
        return this.A02;
        throw th;
    }

    public C106965aS(AnonymousClass4FS r3) {
        this.A03 = new C72173dI(r3, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x010c, code lost:
        if (r8.isEmpty() != false) goto L_0x010e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass5IU A00(java.io.File r16) {
        /*
            java.util.LinkedList r8 = X.AnonymousClass0x9.A18()
            r3 = r16
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x0037 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0037 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0037 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0037 }
            r2.readLine()     // Catch:{ all -> 0x002d }
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x002d }
        L_0x0017:
            if (r1 == 0) goto L_0x0029
            java.lang.String r0 = "\u0000"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x002d }
            if (r0 != 0) goto L_0x0029
            r8.addFirst(r1)     // Catch:{ all -> 0x002d }
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x002d }
            goto L_0x0017
        L_0x0029:
            r2.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x0040
        L_0x002d:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0032 }
            goto L_0x0036
        L_0x0032:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0037 }
        L_0x0036:
            throw r1     // Catch:{ IOException -> 0x0037 }
        L_0x0037:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "UiNavigationPersistenceManager/uitombstone/failed to parse:"
            X.C18260x0.A1P(r1, r0, r3)
        L_0x0040:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.util.Iterator r16 = r8.iterator()
            r15 = 0
            r4 = 0
            r11 = r4
            r6 = r4
            r3 = r4
            r14 = 0
        L_0x004e:
            boolean r0 = r16.hasNext()
            java.lang.String r2 = "Calling"
            java.lang.String r7 = "App"
            if (r0 == 0) goto L_0x00e8
            java.lang.String r13 = X.AnonymousClass001.A0m(r16)
            r12 = 1
            if (r4 != 0) goto L_0x0068
            java.lang.String r0 = "AppInit End"
            boolean r0 = X.AnonymousClass75J.A00(r13, r0)
            if (r0 == 0) goto L_0x0068
            r15 = 1
        L_0x0068:
            java.lang.String r0 = "Calling End"
            boolean r0 = X.AnonymousClass75J.A00(r13, r0)
            if (r0 == 0) goto L_0x007a
            if (r4 != 0) goto L_0x0079
            boolean r0 = r7.equals(r11)
            if (r0 == 0) goto L_0x0079
            r4 = r11
        L_0x0079:
            r14 = 1
        L_0x007a:
            java.lang.String r0 = "Calling Resume"
            boolean r0 = X.AnonymousClass75J.A00(r13, r0)
            if (r0 == 0) goto L_0x0088
            if (r6 != 0) goto L_0x0088
            java.lang.Boolean r6 = X.C18320x8.A0V(r14)
        L_0x0088:
            if (r4 != 0) goto L_0x00cf
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            r10 = 0
            if (r0 != 0) goto L_0x00c2
            java.lang.String r0 = " backgrounded"
            boolean r0 = r13.endsWith(r0)
            if (r0 != 0) goto L_0x00a9
            java.lang.String r0 = " Resume"
            boolean r0 = r13.endsWith(r0)
            if (r0 != 0) goto L_0x00a9
            java.lang.String r0 = " visible"
            boolean r0 = r13.endsWith(r0)
            if (r0 == 0) goto L_0x00c2
        L_0x00a9:
            java.lang.String r9 = r13.trim()
            java.lang.String r1 = " "
            r0 = 2
            java.lang.String[] r9 = r9.split(r1, r0)
            int r0 = r9.length
            if (r0 <= r12) goto L_0x00c2
            r1 = 0
            r0 = r9[r1]
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00c2
            r10 = r9[r1]
        L_0x00c2:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x00cf
            boolean r0 = r7.equals(r10)
            if (r0 == 0) goto L_0x00d4
            r11 = r10
        L_0x00cf:
            X.C18290x4.A1R(r5, r13)
            goto L_0x004e
        L_0x00d4:
            boolean r0 = r7.equals(r11)
            if (r0 == 0) goto L_0x00e3
            boolean r0 = r2.equals(r10)
            if (r0 != 0) goto L_0x00e1
            r10 = r11
        L_0x00e1:
            r4 = r10
            goto L_0x00cf
        L_0x00e3:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            goto L_0x00e1
        L_0x00e8:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x00f5
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x00f5
            r4 = r11
        L_0x00f5:
            boolean r0 = r7.equals(r11)
            r1 = 2
            if (r0 == 0) goto L_0x0100
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
        L_0x0100:
            java.lang.String r0 = "AppInit"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x012c
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0112
        L_0x010e:
            java.lang.Integer r3 = X.C18290x4.A0a()
        L_0x0112:
            boolean r0 = r7.equals(r4)
            if (r0 == 0) goto L_0x012a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x012a
        L_0x0120:
            java.lang.String r1 = r5.toString()
            X.5IU r0 = new X.5IU
            r0.<init>(r3, r1, r2)
            return r0
        L_0x012a:
            r2 = r4
            goto L_0x0120
        L_0x012c:
            if (r15 == 0) goto L_0x010e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = r7
            goto L_0x0112
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106965aS.A00(java.io.File):X.5IU");
    }

    public void A03(String str, String str2) {
        this.A03.execute(new C71323bv(36, AnonymousClass000.A0V(" ", str2, AnonymousClass000.A0l(str)), this));
    }
}
