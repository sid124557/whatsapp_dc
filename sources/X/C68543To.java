package X;

import android.text.TextUtils;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.jid.Jid;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;

/* renamed from: X.3To  reason: invalid class name and case insensitive filesystem */
public class C68543To implements C84864Ea {
    public final C55682qk A00;
    public final AnonymousClass1VX A01;
    public final C43932Ua A02;
    public final AnonymousClass2ZC A03;

    public static void A03(OutputStream outputStream, int i) {
        int i2 = 0;
        if (i != 0) {
            if (i < 256) {
                outputStream.write(248);
                A02(outputStream, i);
                return;
            } else if (i < 65536) {
                outputStream.write(249);
                outputStream.write((65280 & i) >> 8);
                i2 = i & 255;
            } else {
                throw AnonymousClass002.A0C(AnonymousClass000.A0Y("list too long; count=", AnonymousClass001.A0o(), i));
            }
        }
        outputStream.write(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a5, code lost:
        if ((r5 % 2) != r9) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a7, code lost:
        r4 = r4 - r9;
        r3[r4] = (byte) (r3[r4] | 15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00af, code lost:
        r10.write(r6);
        r10.write(((r5 & 1) << 7) | r3.length);
        r11 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(java.io.OutputStream r10, byte[] r11, boolean r12) {
        /*
            int r5 = r11.length
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r5 < r0) goto L_0x002c
            r0 = 254(0xfe, float:3.56E-43)
            r10.write(r0)
            r0 = 2130706432(0x7f000000, float:1.7014118E38)
            r0 = r0 & r5
            int r0 = r0 >> 24
            r10.write(r0)
            r0 = 16711680(0xff0000, float:2.3418052E-38)
        L_0x0014:
            r0 = r0 & r5
            int r0 = r0 >> 16
            r10.write(r0)
            r0 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r5
            int r0 = r0 >> 8
            r10.write(r0)
            r0 = r5 & 255(0xff, float:3.57E-43)
            r10.write(r0)
        L_0x0028:
            r10.write(r11)
            return
        L_0x002c:
            r0 = 256(0x100, float:3.59E-43)
            if (r5 < r0) goto L_0x0038
            r0 = 253(0xfd, float:3.55E-43)
            r10.write(r0)
            r0 = 983040(0xf0000, float:1.377532E-39)
            goto L_0x0014
        L_0x0038:
            if (r12 == 0) goto L_0x005f
            r6 = 255(0xff, float:3.57E-43)
            r0 = 128(0x80, float:1.794E-43)
            if (r5 >= r0) goto L_0x005f
            int r0 = r5 + 1
            int r4 = r0 / 2
            byte[] r3 = new byte[r4]
            r8 = 0
        L_0x0047:
            r9 = 1
            if (r8 >= r5) goto L_0x00a3
            byte r0 = r11[r8]
            switch(r0) {
                case 45: goto L_0x0087;
                case 46: goto L_0x0087;
                case 47: goto L_0x004f;
                case 48: goto L_0x0084;
                case 49: goto L_0x0084;
                case 50: goto L_0x0084;
                case 51: goto L_0x0084;
                case 52: goto L_0x0084;
                case 53: goto L_0x0084;
                case 54: goto L_0x0084;
                case 55: goto L_0x0084;
                case 56: goto L_0x0084;
                case 57: goto L_0x0084;
                case 58: goto L_0x008f;
                default: goto L_0x004f;
            }
        L_0x004f:
            r6 = 251(0xfb, float:3.52E-43)
            byte[] r3 = new byte[r4]
            r8 = 0
        L_0x0054:
            r9 = 1
            if (r8 >= r5) goto L_0x00a3
            byte r0 = r11[r8]
            switch(r0) {
                case 48: goto L_0x0068;
                case 49: goto L_0x0068;
                case 50: goto L_0x0068;
                case 51: goto L_0x0068;
                case 52: goto L_0x0068;
                case 53: goto L_0x0068;
                case 54: goto L_0x0068;
                case 55: goto L_0x0068;
                case 56: goto L_0x0068;
                case 57: goto L_0x0068;
                default: goto L_0x005c;
            }
        L_0x005c:
            switch(r0) {
                case 65: goto L_0x006b;
                case 66: goto L_0x006b;
                case 67: goto L_0x006b;
                case 68: goto L_0x006b;
                case 69: goto L_0x006b;
                case 70: goto L_0x006b;
                default: goto L_0x005f;
            }
        L_0x005f:
            r0 = 252(0xfc, float:3.53E-43)
            r10.write(r0)
            A02(r10, r5)
            goto L_0x0028
        L_0x0068:
            int r7 = r0 + -48
            goto L_0x006f
        L_0x006b:
            int r0 = r0 + -65
            int r7 = r0 + 10
        L_0x006f:
            r0 = -1
            if (r7 == r0) goto L_0x005f
            int r2 = r8 / 2
            byte r1 = r3[r2]
            int r0 = r8 % 2
            int r9 = r9 - r0
            int r0 = r9 * 4
            int r7 = r7 << r0
            byte r0 = (byte) r7
            r0 = r0 | r1
            byte r0 = (byte) r0
            r3[r2] = r0
            int r8 = r8 + 1
            goto L_0x0054
        L_0x0084:
            int r7 = r0 + -48
            goto L_0x008b
        L_0x0087:
            int r0 = r0 + -45
            int r7 = r0 + 10
        L_0x008b:
            r0 = -1
            if (r7 != r0) goto L_0x0091
            goto L_0x004f
        L_0x008f:
            r7 = 12
        L_0x0091:
            int r2 = r8 / 2
            byte r1 = r3[r2]
            int r0 = r8 % 2
            int r9 = r9 - r0
            int r0 = r9 * 4
            int r7 = r7 << r0
            byte r0 = (byte) r7
            r0 = r0 | r1
            byte r0 = (byte) r0
            r3[r2] = r0
            int r8 = r8 + 1
            goto L_0x0047
        L_0x00a3:
            int r0 = r5 % 2
            if (r0 != r9) goto L_0x00af
            int r4 = r4 - r9
            byte r0 = r3[r4]
            r0 = r0 | 15
            byte r0 = (byte) r0
            r3[r4] = r0
        L_0x00af:
            r10.write(r6)
            r0 = r5 & 1
            int r1 = r0 << 7
            int r0 = r3.length
            r1 = r1 | r0
            r10.write(r1)
            r11 = r3
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68543To.A05(java.io.OutputStream, byte[], boolean):void");
    }

    public void Bsa(AnonymousClass36K r2) {
        Bsb(r2, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r7.length <= 0) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass36K r10, java.io.OutputStream r11) {
        /*
            X.36K[] r7 = r10.A03
            r9 = 1
            r6 = 0
            if (r7 == 0) goto L_0x000a
            int r0 = r7.length
            r2 = 1
            if (r0 > 0) goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            byte[] r8 = r10.A01
            if (r8 == 0) goto L_0x0023
            int r2 = r2 + 1
            if (r2 <= r9) goto L_0x0023
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "more than one source of inner data for node; countValues="
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r2)
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x0023:
            X.39V[] r5 = r10.A0u()
            if (r5 != 0) goto L_0x005c
            r0 = 0
        L_0x002a:
            int r0 = r0 + 1
            int r0 = r0 + r2
            A03(r11, r0)
            java.lang.String r0 = r10.A00
            A04(r11, r0, r6, r9)
            if (r5 == 0) goto L_0x0060
            int r4 = r5.length
            r3 = 0
        L_0x0039:
            if (r3 >= r4) goto L_0x0060
            r2 = r5[r3]
            java.lang.String r0 = r2.A02
            A04(r11, r0, r6, r6)
            com.whatsapp.jid.Jid r1 = r2.A01
            byte r0 = r2.A00
            if (r9 != r0) goto L_0x0056
            if (r1 == 0) goto L_0x0056
            boolean r0 = r1.isProtocolCompliant()
            if (r0 == 0) goto L_0x0056
            A00(r1, r11)
        L_0x0053:
            int r3 = r3 + 1
            goto L_0x0039
        L_0x0056:
            java.lang.String r0 = r2.A03
            A04(r11, r0, r9, r9)
            goto L_0x0053
        L_0x005c:
            int r0 = r5.length
            int r0 = r0 * 2
            goto L_0x002a
        L_0x0060:
            if (r8 == 0) goto L_0x0066
            A05(r11, r8, r6)
        L_0x0065:
            return
        L_0x0066:
            if (r7 == 0) goto L_0x0065
            int r1 = r7.length
            if (r1 <= 0) goto L_0x0065
            A03(r11, r1)
        L_0x006e:
            r0 = r7[r6]
            A01(r0, r11)
            int r6 = r6 + 1
            if (r6 >= r1) goto L_0x0065
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68543To.A01(X.36K, java.io.OutputStream):void");
    }

    public static void A02(OutputStream outputStream, int i) {
        if (i < 0 || i >= 256) {
            throw AnonymousClass002.A0C(AnonymousClass000.A0Y("value out of range; value=", AnonymousClass001.A0o(), i));
        }
        outputStream.write(i & 255);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0081, code lost:
        if (r10 != null) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(java.io.OutputStream r9, java.lang.String r10, boolean r11, boolean r12) {
        /*
            java.util.Map r0 = X.AnonymousClass2BC.A00
            if (r0 != 0) goto L_0x0055
            java.lang.Class<X.2BC> r8 = X.AnonymousClass2BC.class
            monitor-enter(r8)
            java.util.Map r0 = X.AnonymousClass2BC.A00     // Catch:{ all -> 0x0051 }
            if (r0 != 0) goto L_0x0054
            java.util.HashMap r7 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x0051 }
            r3 = 0
            r2 = 0
        L_0x0011:
            java.lang.String[] r1 = X.C39402Bv.A00     // Catch:{ all -> 0x0051 }
            int r0 = r1.length     // Catch:{ all -> 0x0051 }
            if (r2 >= r0) goto L_0x0029
            r1 = r1[r2]     // Catch:{ all -> 0x0051 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0051 }
            if (r0 != 0) goto L_0x0026
            X.2Os r0 = new X.2Os     // Catch:{ all -> 0x0051 }
            r0.<init>(r3, r2, r3)     // Catch:{ all -> 0x0051 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0051 }
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0029:
            r6 = 0
        L_0x002a:
            java.lang.String[][] r1 = X.C39402Bv.A01     // Catch:{ all -> 0x0051 }
            int r0 = r1.length     // Catch:{ all -> 0x0051 }
            if (r6 >= r0) goto L_0x004e
            r5 = r1[r6]     // Catch:{ all -> 0x0051 }
            r4 = 0
        L_0x0032:
            int r0 = r5.length     // Catch:{ all -> 0x0051 }
            if (r4 >= r0) goto L_0x004b
            r3 = r5[r4]     // Catch:{ all -> 0x0051 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0051 }
            if (r0 != 0) goto L_0x0048
            int r2 = r6 + 236
            r1 = 1
            X.2Os r0 = new X.2Os     // Catch:{ all -> 0x0051 }
            r0.<init>(r2, r4, r1)     // Catch:{ all -> 0x0051 }
            r7.put(r3, r0)     // Catch:{ all -> 0x0051 }
        L_0x0048:
            int r4 = r4 + 1
            goto L_0x0032
        L_0x004b:
            int r6 = r6 + 1
            goto L_0x002a
        L_0x004e:
            X.AnonymousClass2BC.A00 = r7     // Catch:{ all -> 0x0051 }
            goto L_0x0054
        L_0x0051:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0054:
            monitor-exit(r8)
        L_0x0055:
            java.util.Map r0 = X.AnonymousClass2BC.A00
            java.lang.Object r2 = r0.get(r10)
            X.2Os r2 = (X.C42582Os) r2
            if (r2 != 0) goto L_0x008f
            if (r12 == 0) goto L_0x0081
            if (r10 == 0) goto L_0x008a
            r0 = 64
            int r1 = r10.indexOf(r0)
            r0 = 1
            if (r1 >= r0) goto L_0x007c
            com.whatsapp.jid.Jid r1 = X.AnonymousClass34X.A00(r10)
        L_0x0070:
            if (r1 == 0) goto L_0x0083
            boolean r0 = r1.isProtocolCompliant()
            if (r0 == 0) goto L_0x0083
            A00(r1, r9)
            return
        L_0x007c:
            com.whatsapp.jid.Jid r1 = X.AnonymousClass32W.A00(r10)
            goto L_0x0070
        L_0x0081:
            if (r10 == 0) goto L_0x008a
        L_0x0083:
            java.lang.String r0 = X.C58152un.A0B     // Catch:{ UnsupportedEncodingException -> 0x008a }
            byte[] r0 = r10.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x008a }
            goto L_0x008b
        L_0x008a:
            r0 = 0
        L_0x008b:
            A05(r9, r0, r11)
            return
        L_0x008f:
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x009f
            short r1 = r2.A01
            if (r1 < 0) goto L_0x00b3
            r0 = 255(0xff, float:3.57E-43)
            if (r1 > r0) goto L_0x00b3
            byte r0 = (byte) r1
            r9.write(r0)
        L_0x009f:
            short r1 = r2.A00
            if (r1 < 0) goto L_0x00ac
            r0 = 255(0xff, float:3.57E-43)
            if (r1 > r0) goto L_0x00ac
            byte r0 = (byte) r1
            r9.write(r0)
            return
        L_0x00ac:
            java.lang.String r0 = "invalid token"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x00b3:
            java.lang.String r0 = "invalid token"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68543To.A04(java.io.OutputStream, java.lang.String, boolean, boolean):void");
    }

    public void Bsb(AnonymousClass36K r14, int i) {
        DeflaterOutputStream deflaterOutputStream;
        boolean A1S = AnonymousClass000.A1S(i & 1);
        boolean A1S2 = AnonymousClass000.A1S(i & 2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(DefaultCrypto.BUFFER_SIZE);
        if (!A1S2) {
            byteArrayOutputStream.write(0);
        }
        A01(r14, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (A1S2) {
            int length = byteArray.length;
            byte[] bArr = {2};
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(DefaultCrypto.BUFFER_SIZE);
                try {
                    deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream2);
                    byteArrayOutputStream2.write(bArr);
                    deflaterOutputStream.write(byteArray, 0, length);
                    deflaterOutputStream.close();
                    byteArray = byteArrayOutputStream2.toByteArray();
                    deflaterOutputStream.close();
                    byteArrayOutputStream2.close();
                } catch (Throwable th) {
                    byteArrayOutputStream2.close();
                    throw th;
                }
            } catch (IOException e) {
                throw AnonymousClass0x9.A0i(e);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        AnonymousClass2ZC r2 = this.A03;
        int length2 = byteArray.length;
        C43362Rv r0 = r2.A01;
        byte[] A012 = r0.A04.A01(new byte[0], byteArray, length2, r0.A01.getAndIncrement());
        OutputStream outputStream = r2.A00;
        outputStream.write(A012);
        if (A1S) {
            outputStream.flush();
            return;
        }
        return;
        throw th;
    }

    public C68543To(C55682qk r1, AnonymousClass1VX r2, C43932Ua r3, AnonymousClass2ZC r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }

    public static void A00(Jid jid, OutputStream outputStream) {
        if (jid.getAgent() > 0 || jid.getDevice() > 0) {
            outputStream.write(247);
            int i = 0;
            if (C57372tX.A00(jid)) {
                i = 128;
            }
            if (jid instanceof C135136kB) {
                i |= 1;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("FrameTreeNodeWriter.tryWriteJid4: flags for ");
            A0o.append(jid);
            C18260x0.A0w(" --> ", A0o, i);
            A02(outputStream, i);
            A02(outputStream, jid.getDevice());
            A04(outputStream, jid.user, true, false);
        } else if (jid.isProtocolCompliant()) {
            outputStream.write(250);
            if (TextUtils.isEmpty(jid.user)) {
                outputStream.write((byte) 0);
            } else {
                A04(outputStream, jid.user, true, false);
            }
            A04(outputStream, jid.getServer(), false, false);
        } else {
            C18260x0.A1Q(AnonymousClass001.A0o(), "frame-tree-node-writer/writeJid/failed to write jid: ", jid);
            throw AnonymousClass002.A0C("failed to write jid");
        }
    }

    public void BqF() {
        ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
        A0e.write(0);
        A03(A0e, 1);
        A0e.write(2);
        byte[] byteArray = A0e.toByteArray();
        AnonymousClass2ZC r2 = this.A03;
        int length = byteArray.length;
        C43362Rv r0 = r2.A01;
        byte[] A012 = r0.A04.A01(new byte[0], byteArray, length, r0.A01.getAndIncrement());
        OutputStream outputStream = r2.A00;
        outputStream.write(A012);
        outputStream.flush();
    }
}
