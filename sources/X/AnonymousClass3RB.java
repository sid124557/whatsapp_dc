package X;

import android.os.CancellationSignal;
import android.util.JsonReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3RB  reason: invalid class name */
public class AnonymousClass3RB implements AnonymousClass4DD {
    public int A00;
    public int A01 = 0;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public File A07;
    public boolean A08;
    public final CancellationSignal A09;
    public final AnonymousClass310 A0A;
    public final C56612sH A0B;
    public final C57162tC A0C;
    public final AnonymousClass1VX A0D;
    public final C53222mk A0E;
    public final C50982j5 A0F;
    public final C56022rI A0G;
    public final AnonymousClass2UI A0H;
    public final C28901hx A0I;
    public final C55112po A0J;
    public final C384527p A0K;
    public final InputStream A0L;
    public final OutputStream A0M;

    public final void A00(long j) {
        JsonReader A0D2;
        C36811zv r1;
        File A002 = this.A0F.A00("manifest.json");
        Long l = null;
        AnonymousClass36H.A03(this.A09, (C84134Bd) null, A002, this.A0L, A01(), j);
        FileInputStream A0g = AnonymousClass0x9.A0g(A002);
        try {
            A0D2 = C18300x5.A0D(A0g);
            A0D2.beginObject();
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayList = null;
            while (A0D2.hasNext()) {
                String nextName = A0D2.nextName();
                if ("attemptID".equals(nextName)) {
                    str = A0D2.nextString();
                } else if ("donorInfo".equals(nextName)) {
                    A0D2.beginObject();
                    while (A0D2.hasNext()) {
                        String nextName2 = A0D2.nextName();
                        if ("deviceName".equals(nextName2)) {
                            str2 = A0D2.nextString();
                        } else if ("appVersion".equals(nextName2)) {
                            str3 = A0D2.nextString();
                        } else if ("osVersion".equals(nextName2)) {
                            str4 = A0D2.nextString();
                        } else if ("buildType".equals(nextName2)) {
                            num = Integer.valueOf(A0D2.nextInt());
                        } else if ("yearClass2016".equals(nextName2)) {
                            l = Long.valueOf(A0D2.nextLong());
                        } else {
                            A0D2.skipValue();
                        }
                    }
                    A0D2.endObject();
                } else if ("loggingEvents".equals(nextName)) {
                    arrayList = AnonymousClass001.A0s();
                    A0D2.beginArray();
                    while (A0D2.hasNext()) {
                        C25991bP r2 = new C25991bP();
                        A0D2.beginObject();
                        while (A0D2.hasNext()) {
                            String nextName3 = A0D2.nextName();
                            if ("eventTypeCode".equals(nextName3)) {
                                r2.A09 = Integer.valueOf(A0D2.nextInt());
                            } else if ("duration".equals(nextName3)) {
                                r2.A0B = Long.valueOf(A0D2.nextLong());
                            } else if ("progress".equals(nextName3)) {
                                r2.A0I = Long.valueOf(A0D2.nextLong());
                            } else if ("exportedDbSize".equals(nextName3)) {
                                r2.A00 = Double.valueOf(A0D2.nextDouble());
                            } else if ("waDbSize".equals(nextName3)) {
                                r2.A02 = Double.valueOf(A0D2.nextDouble());
                            } else {
                                A0D2.skipValue();
                            }
                        }
                        A0D2.endObject();
                        arrayList.add(r2);
                    }
                    A0D2.endArray();
                } else {
                    A0D2.skipValue();
                }
            }
            A0D2.endObject();
            if (str == null) {
                r1 = new C36811zv(201, "Invalid metadata file: attemptId is missing.");
            } else if (str2 == null) {
                r1 = new C36811zv(201, "Invalid metadata file: donorDeviceName is missing.");
            } else if (str3 == null) {
                r1 = new C36811zv(201, "Invalid metadata file: donorAppVersion is missing.");
            } else if (str4 == null) {
                r1 = new C36811zv(201, "Invalid metadata file: donorOsVersion is missing.");
            } else if (num == null) {
                r1 = new C36811zv(201, "Invalid metadata file: donorAppBuild is missing.");
            } else if (l == null) {
                r1 = new C36811zv(201, "Invalid metadata file: donorYearClass is missing.");
            } else if (arrayList != null) {
                int intValue = num.intValue();
                long longValue = l.longValue();
                A0D2.close();
                A0g.close();
                C18270x1.A0j(AnonymousClass0x2.A0E(this.A0G.A02), "/export/logging/attemptId", str);
                C55112po r4 = this.A0J;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C25991bP r3 = (C25991bP) it.next();
                    C56022rI r12 = r4.A04;
                    r3.A0Q = r12.A02();
                    C183538qC r22 = r12.A02;
                    String string = C18300x5.A0B(r22).getString("/export/logging/attemptId", (String) null);
                    if (string == null) {
                        string = C18280x3.A0Y();
                        C18270x1.A0j(AnonymousClass0x2.A0E(r22), "/export/logging/attemptId", string);
                    }
                    r3.A0L = string;
                    r3.A04 = C18290x4.A0Z();
                    r3.A0N = str2;
                    r3.A0M = str3;
                    r3.A0O = str4;
                    r3.A05 = Integer.valueOf(intValue);
                    r3.A0A = Long.valueOf(longValue);
                    r4.A02.BhD(r3);
                }
                return;
            } else {
                r1 = new C36811zv(201, "Invalid metadata file: loggingEvents are missing.");
            }
            throw r1;
        } catch (Throwable th) {
            try {
                A0g.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public byte[] A01() {
        String A002 = this.A0E.A00(AnonymousClass35S.A0L);
        if (A002 != null) {
            return AnonymousClass0x7.A1X(A002);
        }
        throw new C36811zv(105, "Failed to initiate decryption, key is missing.");
    }

    public void cancel() {
        this.A09.cancel();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:83|(5:85|86|(1:96)(1:90)|91|(3:95|224|223))|97|98|225|223|81) */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0390, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0393, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        r1 = new X.C36811zv();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0492, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0493, code lost:
        X.AnonymousClass36H.A04(r8.A0I, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0498, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0220, code lost:
        r2 = new X.C619432w(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:132:0x039b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x02c5 */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0492 A[ExcHandler: 24Z | IOException (r1v1 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:196:0x0481] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r21 = this;
            r8 = r21
            X.2po r0 = r8.A0J
            r20 = r0
            r1 = 9
            r0.A01(r1)
            X.1VX r2 = r8.A0D     // Catch:{ OperationCanceledException -> 0x047c }
            r1 = 6448(0x1930, float:9.036E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ OperationCanceledException -> 0x047c }
            int r1 = r2.A0O(r0, r1)     // Catch:{ OperationCanceledException -> 0x047c }
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ OperationCanceledException -> 0x047c }
            r0.putInt(r1)     // Catch:{ OperationCanceledException -> 0x047c }
            byte[] r3 = r0.array()     // Catch:{ OperationCanceledException -> 0x047c }
            r1 = 0
            r0 = 100
            X.1ge r2 = new X.1ge     // Catch:{ OperationCanceledException -> 0x047c }
            r2.<init>(r3, r1, r0)     // Catch:{ OperationCanceledException -> 0x047c }
            java.io.OutputStream r10 = r8.A0M     // Catch:{ OperationCanceledException -> 0x047c }
            android.os.CancellationSignal r7 = r8.A09     // Catch:{ OperationCanceledException -> 0x047c }
        L_0x002d:
            X.AnonymousClass36H.A02(r7, r2, r10)     // Catch:{ OperationCanceledException -> 0x047c }
        L_0x0030:
            java.io.InputStream r3 = r8.A0L     // Catch:{ OperationCanceledException -> 0x047c }
            X.32w r1 = X.AnonymousClass36H.A00(r7, r3)     // Catch:{ OperationCanceledException -> 0x047c }
            int r2 = r1.A01     // Catch:{ OperationCanceledException -> 0x047c }
            r6 = 250(0xfa, float:3.5E-43)
            if (r2 == r6) goto L_0x0227
            r0 = 251(0xfb, float:3.52E-43)
            if (r2 == r0) goto L_0x044a
            r9 = 1
            switch(r2) {
                case 200: goto L_0x01d6;
                case 201: goto L_0x00bc;
                case 202: goto L_0x0213;
                case 203: goto L_0x0133;
                case 204: goto L_0x0046;
                case 205: goto L_0x0383;
                default: goto L_0x0044;
            }     // Catch:{ OperationCanceledException -> 0x047c }
        L_0x0044:
            goto L_0x0386
        L_0x0046:
            long r0 = r1.A02     // Catch:{ OperationCanceledException -> 0x047c }
            byte[] r4 = r8.A01()     // Catch:{ OperationCanceledException -> 0x047c }
            r7.throwIfCanceled()     // Catch:{ OperationCanceledException -> 0x047c }
            if (r4 == 0) goto L_0x0065
            X.6uL r2 = new X.6uL     // Catch:{ SocketException -> 0x039b }
            r2.<init>(r3, r0)     // Catch:{ SocketException -> 0x039b }
            java.io.ByteArrayOutputStream r1 = X.AnonymousClass0x9.A0e()     // Catch:{ SocketException -> 0x039b }
            r0 = 0
            X.AnonymousClass36H.A05(r0, r2, r1, r4)     // Catch:{ SocketException -> 0x039b }
            java.lang.String r0 = X.C58152un.A0B     // Catch:{ SocketException -> 0x039b }
            java.lang.String r1 = r1.toString(r0)     // Catch:{ SocketException -> 0x039b }
            goto L_0x0073
        L_0x0065:
            int r2 = (int) r0     // Catch:{ SocketException -> 0x039b }
            byte[] r2 = new byte[r2]     // Catch:{ SocketException -> 0x039b }
            int r1 = r3.read(r2)     // Catch:{ SocketException -> 0x039b }
            r0 = -1
            if (r1 == r0) goto L_0x0394
            java.lang.String r1 = X.C18320x8.A0h(r2)     // Catch:{ SocketException -> 0x039b }
        L_0x0073:
            X.2rI r0 = r8.A0G     // Catch:{ OperationCanceledException -> 0x047c }
            boolean r0 = r0.A05()     // Catch:{ OperationCanceledException -> 0x047c }
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = "Media/"
            boolean r0 = r1.contains(r0)     // Catch:{ OperationCanceledException -> 0x047c }
            if (r0 == 0) goto L_0x00b5
            X.310 r0 = r8.A0A     // Catch:{ OperationCanceledException -> 0x047c }
            java.io.File r0 = X.AnonymousClass310.A00(r0)     // Catch:{ OperationCanceledException -> 0x047c }
            java.io.File r13 = X.AnonymousClass002.A0A(r0, r1)     // Catch:{ OperationCanceledException -> 0x047c }
            java.io.File r0 = r13.getParentFile()     // Catch:{ OperationCanceledException -> 0x047c }
            if (r0 == 0) goto L_0x009a
            java.io.File r0 = r13.getParentFile()     // Catch:{ OperationCanceledException -> 0x047c }
            r0.mkdirs()     // Catch:{ OperationCanceledException -> 0x047c }
        L_0x009a:
            X.32w r0 = X.AnonymousClass36H.A00(r7, r3)     // Catch:{ OperationCanceledException -> 0x047c }
            long r0 = r0.A02     // Catch:{ OperationCanceledException -> 0x047c }
            byte[] r15 = r8.A01()     // Catch:{ OperationCanceledException -> 0x047c }
            r4 = 23
            X.4Ji r2 = new X.4Ji     // Catch:{ OperationCanceledException -> 0x047c }
            r2.<init>(r8, r4)     // Catch:{ OperationCanceledException -> 0x047c }
            r11 = r7
            r12 = r2
            r14 = r3
            r16 = r0
            X.AnonymousClass36H.A03(r11, r12, r13, r14, r15, r16)     // Catch:{ OperationCanceledException -> 0x047c }
            goto L_0x0030
        L_0x00b5:
            X.2j5 r0 = r8.A0F     // Catch:{ OperationCanceledException -> 0x047c }
            java.io.File r13 = r0.A00(r1)     // Catch:{ OperationCanceledException -> 0x047c }
            goto L_0x009a
        L_0x00bc:
            long r1 = r1.A02     // Catch:{ OperationCanceledException -> 0x047c }
            int r0 = (int) r1     // Catch:{ OperationCanceledException -> 0x047c }
            byte[] r2 = new byte[r0]     // Catch:{ OperationCanceledException -> 0x047c }
            int r1 = r3.read(r2)     // Catch:{ OperationCanceledException -> 0x047c }
            r0 = -1
            if (r1 == r0) goto L_0x03a2
            X.2UI r3 = r8.A0H     // Catch:{ OperationCanceledException -> 0x047c }
            X.2Wc r1 = r3.A09     // Catch:{ OperationCanceledException -> 0x047c }
            java.io.ByteArrayInputStream r0 = X.AnonymousClass0x9.A0d(r2)     // Catch:{ OperationCanceledException -> 0x047c }
            X.2x6 r2 = r1.A00(r0)     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.String r0 = "fpm/ImportHelper/"
            X.C18260x0.A1P(r1, r0, r2)     // Catch:{ OperationCanceledException -> 0x047c }
            X.2Zs r4 = r2.A00     // Catch:{ OperationCanceledException -> 0x047c }
            X.1im r0 = r3.A02     // Catch:{ OperationCanceledException -> 0x047c }
            int r1 = r0.A04     // Catch:{ OperationCanceledException -> 0x047c }
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)     // Catch:{ OperationCanceledException -> 0x047c }
            if (r0 != 0) goto L_0x0106
            X.1hx r2 = r3.A0E     // Catch:{ OperationCanceledException -> 0x047c }
            r1 = 102(0x66, float:1.43E-43)
            r0 = 0
            r2.A0A(r1, r0)     // Catch:{ OperationCanceledException -> 0x047c }
            X.31C r2 = r3.A06     // Catch:{ 23j -> 0x00fc }
            r0 = 60000(0xea60, float:8.4078E-41)
            long r0 = (long) r0     // Catch:{ 23j -> 0x00fc }
            r2.A08(r0)     // Catch:{ 23j -> 0x00fc }
            goto L_0x0106
        L_0x00fc:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.String r0 = "fpm/ImportHelper/Thread interrupted while waiting for user to connect to the internet, "
            X.C18260x0.A1Q(r1, r0, r2)     // Catch:{ OperationCanceledException -> 0x047c }
        L_0x0106:
            X.2xH r3 = r3.A08     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.String r2 = r4.A02     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.String r1 = r4.A00     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.String r0 = r4.A01     // Catch:{ OperationCanceledException -> 0x047c }
            X.2SN r0 = r3.A01(r7, r2, r1, r0)     // Catch:{ OperationCanceledException -> 0x047c }
            X.2mk r2 = r8.A0E     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.String r1 = "import/metadata/key"
            java.lang.String r0 = r0.A03     // Catch:{ OperationCanceledException -> 0x047c }
            r2.A01(r1, r0)     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.String r0 = "fpm/ReceiverChatTransferTask/key: "
            r1.append(r0)     // Catch:{ OperationCanceledException -> 0x047c }
            byte[] r0 = r8.A01()     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.String r0 = X.C18290x4.A0t(r0)     // Catch:{ OperationCanceledException -> 0x047c }
            X.C18260x0.A1J(r1, r0)     // Catch:{ OperationCanceledException -> 0x047c }
            r0 = 102(0x66, float:1.43E-43)
            goto L_0x0220
        L_0x0133:
            long r0 = r1.A02     // Catch:{ OperationCanceledException -> 0x047c }
            X.2j5 r4 = r8.A0F     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.String r2 = "manifest.json"
            java.io.File r2 = r4.A00(r2)     // Catch:{ OperationCanceledException -> 0x047c }
            r8.A07 = r2     // Catch:{ OperationCanceledException -> 0x047c }
            byte[] r15 = r8.A01()     // Catch:{ OperationCanceledException -> 0x047c }
            r12 = 0
            r11 = r7
            r13 = r2
            r14 = r3
            r16 = r0
            X.AnonymousClass36H.A03(r11, r12, r13, r14, r15, r16)     // Catch:{ OperationCanceledException -> 0x047c }
            java.io.File r0 = r8.A07     // Catch:{ OperationCanceledException -> 0x047c }
            java.io.FileInputStream r9 = X.AnonymousClass0x9.A0g(r0)     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.String r1 = X.C58152un.A0B     // Catch:{ all -> 0x0472 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0472 }
            r0.<init>(r9, r1)     // Catch:{ all -> 0x0472 }
            android.util.JsonReader r6 = new android.util.JsonReader     // Catch:{ all -> 0x0472 }
            r6.<init>(r0)     // Catch:{ all -> 0x0472 }
            r6.beginObject()     // Catch:{ all -> 0x03aa }
            r4 = 0
            r0 = 0
        L_0x0165:
            boolean r2 = r6.hasNext()     // Catch:{ all -> 0x03aa }
            if (r2 == 0) goto L_0x0181
            java.lang.String r3 = r6.nextName()     // Catch:{ all -> 0x03aa }
            java.lang.String r2 = "totalSize"
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x03aa }
            if (r2 == 0) goto L_0x017d
            long r0 = r6.nextLong()     // Catch:{ all -> 0x03aa }
            goto L_0x0165
        L_0x017d:
            r6.skipValue()     // Catch:{ all -> 0x03aa }
            goto L_0x0165
        L_0x0181:
            r6.endObject()     // Catch:{ all -> 0x03aa }
            r6.close()     // Catch:{ all -> 0x0472 }
            r9.close()     // Catch:{ OperationCanceledException -> 0x047c }
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x018f
            goto L_0x01a2
        L_0x018f:
            X.2HC r2 = new X.2HC     // Catch:{ OperationCanceledException -> 0x047c }
            r2.<init>(r0)     // Catch:{ OperationCanceledException -> 0x047c }
            long r1 = r2.A00     // Catch:{ OperationCanceledException -> 0x047c }
            r8.A05 = r1     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.String r0 = "fpm/ReceiverChatTransferTask/Parsed manifest file, totalSizeExpected="
            X.C18260x0.A12(r0, r3, r1)     // Catch:{ OperationCanceledException -> 0x047c }
            goto L_0x01a7
        L_0x01a2:
            java.lang.String r0 = "fpm/ReceiverChatTransferTask/parseFpmManifestInfo/failed to parse"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x047c }
        L_0x01a7:
            long r0 = r8.A05     // Catch:{ OperationCanceledException -> 0x047c }
            double r4 = (double) r0     // Catch:{ OperationCanceledException -> 0x047c }
            long r2 = r8.A02     // Catch:{ OperationCanceledException -> 0x047c }
            long r0 = r8.A03     // Catch:{ OperationCanceledException -> 0x047c }
            r15 = 12
            r6 = r20
            X.4FS r9 = r6.A08     // Catch:{ OperationCanceledException -> 0x047c }
            X.3ah r6 = new X.3ah     // Catch:{ OperationCanceledException -> 0x047c }
            r11 = r6
            r12 = r20
            r13 = r4
            r16 = r2
            r18 = r0
            r11.<init>(r12, r13, r15, r16, r18)     // Catch:{ OperationCanceledException -> 0x047c }
            r9.BkM(r6)     // Catch:{ OperationCanceledException -> 0x047c }
            r1 = 104(0x68, float:1.46E-43)
            X.32w r0 = new X.32w     // Catch:{ OperationCanceledException -> 0x047c }
            r0.<init>(r1)     // Catch:{ OperationCanceledException -> 0x047c }
            X.AnonymousClass36H.A02(r7, r0, r10)     // Catch:{ OperationCanceledException -> 0x047c }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ OperationCanceledException -> 0x047c }
            r8.A04 = r0     // Catch:{ OperationCanceledException -> 0x047c }
            goto L_0x0030
        L_0x01d6:
            long r1 = r1.A02     // Catch:{ OperationCanceledException -> 0x047c }
            int r0 = (int) r1     // Catch:{ OperationCanceledException -> 0x047c }
            byte[] r2 = new byte[r0]     // Catch:{ OperationCanceledException -> 0x047c }
            int r1 = r3.read(r2)     // Catch:{ OperationCanceledException -> 0x047c }
            r0 = -1
            if (r1 == r0) goto L_0x0452
            r1 = 0
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r2, r1, r0)     // Catch:{ OperationCanceledException -> 0x047c }
            int r4 = r0.getInt()     // Catch:{ OperationCanceledException -> 0x047c }
            X.2rI r0 = r8.A0G     // Catch:{ OperationCanceledException -> 0x047c }
            X.8qC r3 = r0.A02     // Catch:{ OperationCanceledException -> 0x047c }
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass0x2.A0E(r3)     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.String r0 = "/export/protocolVersion"
            X.C18270x1.A0h(r1, r0, r4)     // Catch:{ OperationCanceledException -> 0x047c }
            r0 = 3
            boolean r2 = X.C18280x3.A1U(r4, r0)
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass0x2.A0E(r3)     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.String r0 = "/export/usingDbForTransfer"
            X.C18270x1.A0l(r1, r0, r2)     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.String r0 = "fpm/ReceiverChatTransferTask/setProtocolVersion: "
            X.C18260x0.A0w(r0, r1, r4)     // Catch:{ OperationCanceledException -> 0x047c }
            r0 = 101(0x65, float:1.42E-43)
            goto L_0x0220
        L_0x0213:
            boolean r0 = r8.A08     // Catch:{ OperationCanceledException -> 0x047c }
            if (r0 == 0) goto L_0x0219
            goto L_0x03b0
        L_0x0219:
            long r0 = r1.A02     // Catch:{ OperationCanceledException -> 0x047c }
            r8.A00(r0)     // Catch:{ OperationCanceledException -> 0x047c }
            r0 = 103(0x67, float:1.44E-43)
        L_0x0220:
            X.32w r2 = new X.32w     // Catch:{ OperationCanceledException -> 0x047c }
            r2.<init>(r0)     // Catch:{ OperationCanceledException -> 0x047c }
            goto L_0x002d
        L_0x0227:
            int r0 = r8.A01     // Catch:{ OperationCanceledException -> 0x047c }
            int r0 = r0 + 1
            r8.A01 = r0     // Catch:{ OperationCanceledException -> 0x047c }
            java.io.File r2 = r8.A07     // Catch:{ OperationCanceledException -> 0x047c }
            X.2j5 r4 = r8.A0F     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.String r3 = "missing_paths.json"
            java.io.File r19 = r4.A01(r3)     // Catch:{ OperationCanceledException -> 0x047c }
            boolean r0 = r19.exists()     // Catch:{ OperationCanceledException -> 0x047c }
            if (r0 == 0) goto L_0x024a
            long r13 = r19.length()     // Catch:{ OperationCanceledException -> 0x047c }
            r11 = 0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x024a
            r2 = r19
        L_0x024a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.String r0 = "fpm/ReceiverChatTransferTask/getMissingFiles/verification attempt #"
            r1.append(r0)     // Catch:{ OperationCanceledException -> 0x047c }
            int r0 = r8.A01     // Catch:{ OperationCanceledException -> 0x047c }
            r1.append(r0)     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.String r11 = " of "
            r1.append(r11)     // Catch:{ OperationCanceledException -> 0x047c }
            r0 = 5
            X.C18260x0.A1G(r1, r0)     // Catch:{ OperationCanceledException -> 0x047c }
            r0 = 0
            r8.A02 = r0     // Catch:{ OperationCanceledException -> 0x047c }
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()     // Catch:{ OperationCanceledException -> 0x047c }
            java.io.FileInputStream r9 = X.AnonymousClass0x9.A0g(r2)     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.String r2 = X.C58152un.A0B     // Catch:{ all -> 0x0472 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0472 }
            r0.<init>(r9, r2)     // Catch:{ all -> 0x0472 }
            android.util.JsonReader r12 = new android.util.JsonReader     // Catch:{ all -> 0x0472 }
            r12.<init>(r0)     // Catch:{ all -> 0x0472 }
            X.1gX r13 = new X.1gX     // Catch:{ all -> 0x0468 }
            r13.<init>(r12)     // Catch:{ all -> 0x0468 }
        L_0x027e:
            boolean r0 = r13.A01()     // Catch:{ all -> 0x0468 }
            if (r0 == 0) goto L_0x02d2
            long r0 = r8.A02     // Catch:{ all -> 0x0468 }
            r14 = 1
            long r0 = r0 + r14
            r8.A02 = r0     // Catch:{ all -> 0x0468 }
            java.lang.Object r15 = r13.A00()     // Catch:{ all -> 0x0468 }
            X.2wv r15 = (X.C59442wv) r15     // Catch:{ all -> 0x0468 }
            java.lang.String r14 = r15.A01     // Catch:{ all -> 0x0468 }
            if (r14 == 0) goto L_0x02c5
            X.2rI r0 = r8.A0G     // Catch:{ IOException -> 0x02c5 }
            boolean r0 = r0.A05()     // Catch:{ IOException -> 0x02c5 }
            if (r0 == 0) goto L_0x02c0
            java.lang.String r0 = "Media/"
            boolean r0 = r14.contains(r0)     // Catch:{ IOException -> 0x02c5 }
            if (r0 == 0) goto L_0x02c0
            X.310 r0 = r8.A0A     // Catch:{ IOException -> 0x02c5 }
            java.io.File r0 = X.AnonymousClass310.A00(r0)     // Catch:{ IOException -> 0x02c5 }
            java.io.File r1 = X.AnonymousClass002.A0A(r0, r14)     // Catch:{ IOException -> 0x02c5 }
        L_0x02af:
            boolean r0 = r1.exists()     // Catch:{ IOException -> 0x02c5 }
            if (r0 == 0) goto L_0x02c5
            long r17 = r1.length()     // Catch:{ IOException -> 0x02c5 }
            long r0 = r15.A00     // Catch:{ IOException -> 0x02c5 }
            int r16 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r16 != 0) goto L_0x02c5
            goto L_0x027e
        L_0x02c0:
            java.io.File r1 = r4.A01(r14)     // Catch:{ IOException -> 0x02c5 }
            goto L_0x02af
        L_0x02c5:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0468 }
            java.lang.String r0 = "fpm/ReceiverChatTransferTask/unable to verify file, path: "
            X.C18260x0.A0t(r0, r14, r1)     // Catch:{ all -> 0x0468 }
            r5.add(r15)     // Catch:{ all -> 0x0468 }
            goto L_0x027e
        L_0x02d2:
            r12.close()     // Catch:{ all -> 0x0472 }
            r9.close()     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.String r0 = "fpm/ReceiverChatTransferTask/getMissingFiles/missing "
            X.C18260x0.A19(r0, r9, r5)     // Catch:{ OperationCanceledException -> 0x047c }
            r9.append(r11)     // Catch:{ OperationCanceledException -> 0x047c }
            long r0 = r8.A02     // Catch:{ OperationCanceledException -> 0x047c }
            r9.append(r0)     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.String r0 = " total files"
            X.C18260x0.A1L(r9, r0)     // Catch:{ OperationCanceledException -> 0x047c }
            int r0 = r5.size()     // Catch:{ OperationCanceledException -> 0x047c }
            if (r0 == 0) goto L_0x034b
            int r1 = r8.A01     // Catch:{ OperationCanceledException -> 0x047c }
            r0 = 5
            if (r1 >= r0) goto L_0x034b
            X.C18270x1.A0x(r19)     // Catch:{ OperationCanceledException -> 0x047c }
            java.io.File r4 = r4.A00(r3)     // Catch:{ OperationCanceledException -> 0x047c }
            java.io.FileOutputStream r3 = X.AnonymousClass0x9.A0h(r4)     // Catch:{ OperationCanceledException -> 0x047c }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0463 }
            r0.<init>(r3, r2)     // Catch:{ all -> 0x0463 }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ all -> 0x0463 }
            r2.<init>(r0)     // Catch:{ all -> 0x0463 }
            r2.beginObject()     // Catch:{ all -> 0x0459 }
            java.lang.String r0 = "relativePaths"
            r2.name(r0)     // Catch:{ all -> 0x0459 }
            r2.beginArray()     // Catch:{ all -> 0x0459 }
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x0459 }
        L_0x031e:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0459 }
            if (r0 == 0) goto L_0x032e
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0459 }
            X.2wv r0 = (X.C59442wv) r0     // Catch:{ all -> 0x0459 }
            r0.A00(r2)     // Catch:{ all -> 0x0459 }
            goto L_0x031e
        L_0x032e:
            r2.endArray()     // Catch:{ all -> 0x0459 }
            android.util.JsonWriter r0 = r2.endObject()     // Catch:{ all -> 0x0459 }
            r0.flush()     // Catch:{ all -> 0x0459 }
            r2.close()     // Catch:{ all -> 0x0463 }
            r3.close()     // Catch:{ OperationCanceledException -> 0x047c }
            byte[] r1 = r8.A01()     // Catch:{ OperationCanceledException -> 0x047c }
            r0 = 104(0x68, float:1.46E-43)
            X.1gf r2 = new X.1gf     // Catch:{ OperationCanceledException -> 0x047c }
            r2.<init>(r4, r1, r0)     // Catch:{ OperationCanceledException -> 0x047c }
            goto L_0x002d
        L_0x034b:
            long r2 = r8.A02     // Catch:{ OperationCanceledException -> 0x047c }
            int r0 = r5.size()     // Catch:{ OperationCanceledException -> 0x047c }
            long r0 = (long) r0     // Catch:{ OperationCanceledException -> 0x047c }
            long r2 = r2 - r0
            r8.A03 = r2     // Catch:{ OperationCanceledException -> 0x047c }
            int r0 = r5.size()     // Catch:{ OperationCanceledException -> 0x047c }
            if (r0 != 0) goto L_0x0380
            java.lang.String r0 = "fpm/ReceiverChatTransferTask/transfer complete because all files received"
        L_0x035d:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x047c }
            long r2 = r8.A06     // Catch:{ OperationCanceledException -> 0x047c }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ OperationCanceledException -> 0x047c }
            long r4 = r8.A04     // Catch:{ OperationCanceledException -> 0x047c }
            long r0 = r0 - r4
            X.AnonymousClass36H.A01(r2, r0)     // Catch:{ OperationCanceledException -> 0x047c }
            X.32w r0 = new X.32w     // Catch:{ OperationCanceledException -> 0x047c }
            r0.<init>(r6)     // Catch:{ OperationCanceledException -> 0x047c }
            X.AnonymousClass36H.A02(r7, r0, r10)     // Catch:{ OperationCanceledException -> 0x047c }
            r0 = 1
            r8.A08 = r0     // Catch:{ OperationCanceledException -> 0x047c }
            r0 = 102(0x66, float:1.43E-43)
            X.32w r2 = new X.32w     // Catch:{ OperationCanceledException -> 0x047c }
            r2.<init>(r0)     // Catch:{ OperationCanceledException -> 0x047c }
            goto L_0x002d
        L_0x0380:
            java.lang.String r0 = "fpm/ReceiverChatTransferTask/transfer complete because maximum retry attempts reached"
            goto L_0x035d
        L_0x0383:
            java.lang.String r0 = "fpm/ReceiverChatTransferTask/Received file data response message without an associated metadata message"
            goto L_0x0390
        L_0x0386:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ OperationCanceledException -> 0x047c }
            java.lang.String r0 = "fpm/ReceiverChatTransferTask/Received invalid message with type: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r2)     // Catch:{ OperationCanceledException -> 0x047c }
        L_0x0390:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x047c }
            return
        L_0x0394:
            java.lang.String r0 = "No bytes to read"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ SocketException -> 0x039b }
            throw r0     // Catch:{ SocketException -> 0x039b }
        L_0x039b:
            X.1zv r1 = new X.1zv     // Catch:{ OperationCanceledException -> 0x047c }
            r1.<init>()     // Catch:{ OperationCanceledException -> 0x047c }
            goto L_0x0458
        L_0x03a2:
            java.lang.String r0 = "No bytes to read"
            java.io.IOException r1 = X.AnonymousClass002.A0C(r0)     // Catch:{ OperationCanceledException -> 0x047c }
            goto L_0x0458
        L_0x03aa:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x046d }
            goto L_0x0471
        L_0x03b0:
            long r0 = r1.A02     // Catch:{ IOException -> 0x03b6 }
            r8.A00(r0)     // Catch:{ IOException -> 0x03b6 }
            goto L_0x03bc
        L_0x03b6:
            r1 = move-exception
            java.lang.String r0 = "fpm/ReceiverChatTransferTask/Unable to process logging metadata due to stream closing"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ OperationCanceledException -> 0x047c }
        L_0x03bc:
            long r0 = r8.A06     // Catch:{ OperationCanceledException -> 0x047c }
            double r5 = (double) r0     // Catch:{ OperationCanceledException -> 0x047c }
            long r3 = r8.A02     // Catch:{ OperationCanceledException -> 0x047c }
            long r1 = r8.A03     // Catch:{ OperationCanceledException -> 0x047c }
            r15 = 13
            r0 = r20
            X.4FS r10 = r0.A08     // Catch:{ OperationCanceledException -> 0x047c }
            X.3ah r0 = new X.3ah     // Catch:{ OperationCanceledException -> 0x047c }
            r11 = r0
            r12 = r20
            r13 = r5
            r16 = r3
            r18 = r1
            r11.<init>(r12, r13, r15, r16, r18)     // Catch:{ OperationCanceledException -> 0x047c }
            r10.BkM(r0)     // Catch:{ OperationCanceledException -> 0x047c }
            X.2UI r5 = r8.A0H     // Catch:{ OperationCanceledException -> 0x047c }
            X.2rI r0 = r8.A0G     // Catch:{ OperationCanceledException -> 0x047c }
            boolean r3 = r0.A05()     // Catch:{ OperationCanceledException -> 0x047c }
            X.2Wb r2 = r5.A07     // Catch:{ OperationCanceledException -> 0x047c }
            monitor-enter(r2)     // Catch:{ OperationCanceledException -> 0x047c }
            java.util.Map r0 = r2.A00     // Catch:{ all -> 0x0447 }
            r0.clear()     // Catch:{ all -> 0x0447 }
            monitor-exit(r2)     // Catch:{ all -> 0x0447 }
            X.2q5 r0 = r5.A04     // Catch:{ OperationCanceledException -> 0x047c }
            X.2xb r0 = r0.A01()     // Catch:{ OperationCanceledException -> 0x047c }
            int r1 = r0.A00     // Catch:{ OperationCanceledException -> 0x047c }
            r0 = 2
            if (r1 == r0) goto L_0x0400
            if (r1 == r9) goto L_0x0400
            X.1hx r2 = r5.A0E     // Catch:{ OperationCanceledException -> 0x047c }
            r1 = 302(0x12e, float:4.23E-43)
            r0 = 0
            r2.A0A(r1, r0)     // Catch:{ OperationCanceledException -> 0x047c }
            goto L_0x0405
        L_0x0400:
            java.lang.String r0 = "fpm/ImportHelper/prepareForImport/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x047c }
        L_0x0405:
            X.2po r1 = r5.A0F     // Catch:{ OperationCanceledException -> 0x047c }
            r0 = 14
            r1.A01(r0)     // Catch:{ OperationCanceledException -> 0x047c }
            if (r3 == 0) goto L_0x040f
            goto L_0x042f
        L_0x040f:
            X.1hn r1 = r5.A0A     // Catch:{ OperationCanceledException -> 0x047c }
            r0 = 0
            r1.A08(r0, r9)     // Catch:{ OperationCanceledException -> 0x047c }
            X.36D r2 = r5.A0B     // Catch:{ OperationCanceledException -> 0x047c }
            X.2j5 r1 = r5.A0C     // Catch:{ OperationCanceledException -> 0x047c }
            X.3R0 r0 = new X.3R0     // Catch:{ OperationCanceledException -> 0x047c }
            r0.<init>(r1)     // Catch:{ OperationCanceledException -> 0x047c }
            r2.A0H(r7, r0)     // Catch:{ OperationCanceledException -> 0x047c }
            X.1hx r0 = r5.A0E     // Catch:{ OperationCanceledException -> 0x047c }
            r0.A09()     // Catch:{ OperationCanceledException -> 0x047c }
            X.2iS r0 = r5.A0H     // Catch:{ OperationCanceledException -> 0x047c }
            r0.A00()     // Catch:{ OperationCanceledException -> 0x047c }
            r0.A01()     // Catch:{ OperationCanceledException -> 0x047c }
            goto L_0x0434
        L_0x042f:
            X.1qI r0 = r5.A0D     // Catch:{ OperationCanceledException -> 0x047c }
            r0.A00()     // Catch:{ OperationCanceledException -> 0x047c }
        L_0x0434:
            X.4FS r4 = r5.A0J     // Catch:{ OperationCanceledException -> 0x047c }
            X.2LT r3 = r5.A0G     // Catch:{ OperationCanceledException -> 0x047c }
            X.3R7 r2 = new X.3R7     // Catch:{ OperationCanceledException -> 0x047c }
            r2.<init>(r5)     // Catch:{ OperationCanceledException -> 0x047c }
            r1 = 0
            X.3R9 r0 = new X.3R9     // Catch:{ OperationCanceledException -> 0x047c }
            r0.<init>(r2, r3, r4, r1)     // Catch:{ OperationCanceledException -> 0x047c }
            r0.A00()     // Catch:{ OperationCanceledException -> 0x047c }
            return
        L_0x0447:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0447 }
            goto L_0x0458
        L_0x044a:
            int r0 = r1.A00     // Catch:{ OperationCanceledException -> 0x047c }
            X.24Z r1 = new X.24Z     // Catch:{ OperationCanceledException -> 0x047c }
            r1.<init>(r0)     // Catch:{ OperationCanceledException -> 0x047c }
            goto L_0x0458
        L_0x0452:
            java.lang.String r0 = "No bytes to read"
            java.io.IOException r1 = X.AnonymousClass002.A0C(r0)     // Catch:{ OperationCanceledException -> 0x047c }
        L_0x0458:
            throw r1     // Catch:{ OperationCanceledException -> 0x047c }
        L_0x0459:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x045e }
            goto L_0x0462
        L_0x045e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0463 }
        L_0x0462:
            throw r1     // Catch:{ all -> 0x0463 }
        L_0x0463:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0477 }
            goto L_0x047b
        L_0x0468:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x046d }
            goto L_0x0471
        L_0x046d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0472 }
        L_0x0471:
            throw r1     // Catch:{ all -> 0x0472 }
        L_0x0472:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0477 }
            goto L_0x047b
        L_0x0477:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ OperationCanceledException -> 0x047c }
        L_0x047b:
            throw r1     // Catch:{ OperationCanceledException -> 0x047c }
        L_0x047c:
            r4 = 2
            r3 = 251(0xfb, float:3.52E-43)
            r0 = 0
            X.32w r2 = new X.32w     // Catch:{ 24Z | IOException -> 0x0492, 24Z | IOException -> 0x0492 }
            r2.<init>((int) r3, (long) r0, (int) r4)     // Catch:{ 24Z | IOException -> 0x0492, 24Z | IOException -> 0x0492 }
            java.io.OutputStream r1 = r8.A0M     // Catch:{ 24Z | IOException -> 0x0492, 24Z | IOException -> 0x0492 }
            r0 = 0
            X.AnonymousClass36H.A02(r0, r2, r1)     // Catch:{ 24Z | IOException -> 0x0492, 24Z | IOException -> 0x0492 }
            java.lang.String r0 = "fpm/ReceiverChatTransferTask/cancel successful"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 24Z | IOException -> 0x0492, 24Z | IOException -> 0x0492 }
            return
        L_0x0492:
            r1 = move-exception
            X.1hx r0 = r8.A0I
            X.AnonymousClass36H.A04(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3RB.run():void");
    }

    public AnonymousClass3RB(AnonymousClass310 r2, C56612sH r3, C57162tC r4, AnonymousClass1VX r5, C53222mk r6, C50982j5 r7, C56022rI r8, AnonymousClass2UI r9, C28901hx r10, C55112po r11, C384527p r12, InputStream inputStream, OutputStream outputStream) {
        this.A0B = r3;
        this.A0D = r5;
        this.A0A = r2;
        this.A0L = inputStream;
        this.A0M = outputStream;
        this.A0H = r9;
        this.A0J = r11;
        this.A0F = r7;
        this.A0I = r10;
        this.A0K = r12;
        this.A0E = r6;
        this.A0G = r8;
        this.A0C = r4;
        this.A09 = new CancellationSignal();
    }
}
