package X;

import android.util.Pair;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.List;

/* renamed from: X.34I  reason: invalid class name */
public class AnonymousClass34I {
    public static final InetSocketAddress A00;
    public static final InetSocketAddress A01;

    static {
        try {
            A00 = new InetSocketAddress(InetAddress.getByAddress(new byte[]{8, 8, 8, 8}), 53);
            A01 = new InetSocketAddress(InetAddress.getByAddress(new byte[]{8, 8, 4, 4}), 53);
        } catch (UnknownHostException e) {
            throw new Error(e);
        }
    }

    public static Pair A00(byte[] bArr, int i) {
        int length;
        int i2;
        if (i < 0 || i >= (length = bArr.length)) {
            throw new UnknownHostException("offset is outside of the data array");
        }
        CharsetDecoder newDecoder = Charset.forName("UTF8").newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        newDecoder.onMalformedInput(codingErrorAction);
        newDecoder.onUnmappableCharacter(codingErrorAction);
        StringBuilder A0o = AnonymousClass001.A0o();
        while (true) {
            byte b = bArr[i];
            int i3 = i + 1;
            if (((b >> 6) & 3) == 3) {
                int i4 = (b & 63) << 8;
                if (i3 < length) {
                    i2 = i4 + bArr[i3];
                } else {
                    throw new UnknownHostException("offset is outside of the data array, when getting a pointer");
                }
            } else if (b == 0) {
                i2 = -1;
                break;
            } else {
                i = i3 + b;
                if (i < length) {
                    try {
                        AnonymousClass000.A1B(newDecoder.decode(ByteBuffer.wrap(bArr, i3, b)), A0o);
                        A0o.append(".");
                    } catch (CharacterCodingException unused) {
                        throw new UnknownHostException("failed to parse canonical name");
                    }
                } else {
                    throw new UnknownHostException("failed to parse canonical name");
                }
            }
        }
        return C18290x4.A0K(A0o, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A01(java.lang.String r19, int r20) {
        /*
            java.lang.String r14 = " ms timeout"
            java.lang.String r15 = " with "
            java.lang.String r17 = "timed out while querying "
            java.lang.String r16 = "querying "
            java.lang.String r5 = " for "
            r1 = 2
            r18 = r20
            r0 = r18
            if (r0 >= r1) goto L_0x01aa
            java.lang.String r7 = "\\."
            r3 = r19
            java.lang.String[] r0 = r3.split(r7)
            r6 = 1
            X.7Mn[] r8 = new X.C149457Mn[r6]
            r4 = 0
            X.32d r2 = X.C617632d.A01(r0)
            int r0 = r2.A00
            int r1 = r0 + 4
            X.7Mn r0 = new X.7Mn
            r0.<init>(r2, r1, r6, r6)
            r8[r4] = r0
            X.362 r10 = X.AnonymousClass362.A01(r8)
            byte[] r12 = r10.A05()
            r4 = 512(0x200, float:7.175E-43)
            byte[] r9 = new byte[r4]
            java.net.DatagramPacket r11 = new java.net.DatagramPacket
            r11.<init>(r9, r4)
            java.lang.String[] r0 = r3.split(r7)
            r8 = 1
            X.7Mn[] r7 = new X.C149457Mn[r6]
            r13 = 0
            X.32d r6 = X.C617632d.A01(r0)
            r2 = 28
            int r0 = r6.A00
            int r1 = r0 + 4
            X.7Mn r0 = new X.7Mn
            r0.<init>(r6, r1, r2, r8)
            r7[r13] = r0
            X.362 r8 = X.AnonymousClass362.A01(r7)
            byte[] r6 = r8.A05()
            byte[] r7 = new byte[r4]
            java.net.DatagramPacket r2 = new java.net.DatagramPacket
            r2.<init>(r7, r4)
            java.net.DatagramSocket r4 = new java.net.DatagramSocket     // Catch:{ IOException -> 0x0187 }
            r4.<init>()     // Catch:{ IOException -> 0x0187 }
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0l(r16)     // Catch:{ InterruptedIOException -> 0x00a4 }
            java.net.InetSocketAddress r1 = A00     // Catch:{ InterruptedIOException -> 0x00a4 }
            r13.append(r1)     // Catch:{ InterruptedIOException -> 0x00a4 }
            X.AnonymousClass001.A1K(r5, r3, r15, r13)     // Catch:{ InterruptedIOException -> 0x00a4 }
            r0 = 20000(0x4e20, float:2.8026E-41)
            r13.append(r0)     // Catch:{ InterruptedIOException -> 0x00a4 }
            X.C18260x0.A1L(r13, r14)     // Catch:{ InterruptedIOException -> 0x00a4 }
            r4.connect(r1)     // Catch:{ InterruptedIOException -> 0x00a4 }
            r0 = 10000(0x2710, float:1.4013E-41)
            r4.setSoTimeout(r0)     // Catch:{ InterruptedIOException -> 0x00a4 }
            int r1 = r12.length     // Catch:{ InterruptedIOException -> 0x00a4 }
            java.net.DatagramPacket r0 = new java.net.DatagramPacket     // Catch:{ InterruptedIOException -> 0x00a4 }
            r0.<init>(r12, r1)     // Catch:{ InterruptedIOException -> 0x00a4 }
            r4.send(r0)     // Catch:{ InterruptedIOException -> 0x00a4 }
            X.C626936e.A06(r6)     // Catch:{ InterruptedIOException -> 0x00a4 }
            int r1 = r6.length     // Catch:{ InterruptedIOException -> 0x00a4 }
            java.net.DatagramPacket r0 = new java.net.DatagramPacket     // Catch:{ InterruptedIOException -> 0x00a4 }
            r0.<init>(r6, r1)     // Catch:{ InterruptedIOException -> 0x00a4 }
            r4.send(r0)     // Catch:{ InterruptedIOException -> 0x00a4 }
            r4.receive(r2)     // Catch:{ InterruptedIOException -> 0x00a4 }
            r4.receive(r11)     // Catch:{ InterruptedIOException -> 0x00a4 }
            goto L_0x00f2
        L_0x00a4:
            r1 = move-exception
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0l(r17)     // Catch:{ all -> 0x017d }
            java.net.InetSocketAddress r0 = A00     // Catch:{ all -> 0x017d }
            r13.append(r0)     // Catch:{ all -> 0x017d }
            java.lang.String r0 = X.AnonymousClass000.A0V(r5, r3, r13)     // Catch:{ all -> 0x017d }
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x017d }
            r4.disconnect()     // Catch:{ AssertionError -> 0x017b }
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0l(r16)     // Catch:{ InterruptedIOException -> 0x0159 }
            java.net.InetSocketAddress r1 = A01     // Catch:{ InterruptedIOException -> 0x0159 }
            r13.append(r1)     // Catch:{ InterruptedIOException -> 0x0159 }
            X.AnonymousClass001.A1K(r5, r3, r15, r13)     // Catch:{ InterruptedIOException -> 0x0159 }
            r0 = 20000(0x4e20, float:2.8026E-41)
            r13.append(r0)     // Catch:{ InterruptedIOException -> 0x0159 }
            X.C18260x0.A1L(r13, r14)     // Catch:{ InterruptedIOException -> 0x0159 }
            r4.connect(r1)     // Catch:{ InterruptedIOException -> 0x0159 }
            r0 = 10000(0x2710, float:1.4013E-41)
            r4.setSoTimeout(r0)     // Catch:{ InterruptedIOException -> 0x0159 }
            X.C626936e.A06(r12)     // Catch:{ InterruptedIOException -> 0x0159 }
            int r1 = r12.length     // Catch:{ InterruptedIOException -> 0x0159 }
            java.net.DatagramPacket r0 = new java.net.DatagramPacket     // Catch:{ InterruptedIOException -> 0x0159 }
            r0.<init>(r12, r1)     // Catch:{ InterruptedIOException -> 0x0159 }
            r4.send(r0)     // Catch:{ InterruptedIOException -> 0x0159 }
            X.C626936e.A06(r6)     // Catch:{ InterruptedIOException -> 0x0159 }
            int r1 = r6.length     // Catch:{ InterruptedIOException -> 0x0159 }
            java.net.DatagramPacket r0 = new java.net.DatagramPacket     // Catch:{ InterruptedIOException -> 0x0159 }
            r0.<init>(r6, r1)     // Catch:{ InterruptedIOException -> 0x0159 }
            r4.send(r0)     // Catch:{ InterruptedIOException -> 0x0159 }
            r4.receive(r2)     // Catch:{ InterruptedIOException -> 0x0159 }
            r4.receive(r11)     // Catch:{ InterruptedIOException -> 0x0159 }
        L_0x00f2:
            r4.close()     // Catch:{ IOException -> 0x0187 }
            X.362 r6 = X.AnonymousClass362.A00(r9)
            X.362 r5 = X.AnonymousClass362.A00(r7)
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            X.5LG r0 = r10.A01
            short r1 = r0.A01
            X.5LG r0 = r6.A01
            short r2 = r0.A01
            if (r2 != r1) goto L_0x0143
            r14 = r9
            r11 = r6
        L_0x010d:
            r12 = r3
            r13 = r4
            r15 = r18
            A02(r10, r11, r12, r13, r14, r15)
        L_0x0114:
            X.C626936e.A06(r8)
            X.5LG r0 = r8.A01
            short r1 = r0.A01
            if (r2 == r1) goto L_0x0125
            X.5LG r0 = r5.A01
            short r0 = r0.A01
            if (r0 != r1) goto L_0x012d
            r9 = r7
            r6 = r5
        L_0x0125:
            r1 = r8
            r2 = r6
            r5 = r9
            r6 = r18
            A02(r1, r2, r3, r4, r5, r6)
        L_0x012d:
            boolean r0 = r4.isEmpty()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r0 != 0) goto L_0x014c
            java.lang.String r0 = "resolved "
            X.C18260x0.A19(r0, r1, r4)
            java.lang.String r0 = " addresses using backup DNS for "
            X.C18260x0.A0s(r0, r3, r1)
            return r4
        L_0x0143:
            X.5LG r0 = r5.A01
            short r0 = r0.A01
            if (r0 != r1) goto L_0x0114
            r14 = r7
            r11 = r5
            goto L_0x010d
        L_0x014c:
            java.lang.String r0 = "no addresses found for "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r3, r1)
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            r0.<init>(r1)
            throw r0
        L_0x0159:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r17)     // Catch:{ all -> 0x017d }
            java.net.InetSocketAddress r0 = A01     // Catch:{ all -> 0x017d }
            r1.append(r0)     // Catch:{ all -> 0x017d }
            java.lang.String r0 = X.AnonymousClass000.A0V(r5, r3, r1)     // Catch:{ all -> 0x017d }
            com.whatsapp.util.Log.i(r0, r2)     // Catch:{ all -> 0x017d }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "timeout while trying to resolve "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r3, r1)     // Catch:{ all -> 0x017d }
            java.net.UnknownHostException r0 = new java.net.UnknownHostException     // Catch:{ all -> 0x017d }
            r0.<init>(r1)     // Catch:{ all -> 0x017d }
            throw r0     // Catch:{ all -> 0x017d }
        L_0x017b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x017d }
        L_0x017d:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0182 }
            goto L_0x0186
        L_0x0182:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0187 }
        L_0x0186:
            throw r1     // Catch:{ IOException -> 0x0187 }
        L_0x0187:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "unexpected IOException "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " while trying to resolve "
            X.C18260x0.A0v(r0, r3, r1, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ioexception while trying to resolve "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r3, r1)
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            r0.<init>(r1)
            throw r0
        L_0x01aa:
            java.lang.String r1 = "failed to resolve cnames"
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass34I.A01(java.lang.String, int):java.util.List");
    }

    public static void A02(AnonymousClass362 r15, AnonymousClass362 r16, String str, List list, byte[] bArr, int i) {
        short length;
        AnonymousClass362 r12 = r16;
        AnonymousClass5LG r2 = r12.A01;
        String str2 = str;
        if (r2.A01 != r15.A01.A01) {
            throw new UnknownHostException(AnonymousClass000.A0V("received response with unexpected id while trying to resolve ", str2, AnonymousClass001.A0o()));
        } else if (!r2.A0A) {
            throw new UnknownHostException(AnonymousClass000.A0V("did not receive response from server while trying to resolve ", str2, AnonymousClass001.A0o()));
        } else if (r2.A0B) {
            throw new UnknownHostException(AnonymousClass000.A0V("received truncated response while trying to resolve ", str2, AnonymousClass001.A0o()));
        } else if (r2.A06 == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            C149857Oe r9 = null;
            int i2 = 0;
            while (true) {
                C149857Oe[] r1 = r12.A02;
                List list2 = list;
                if (i2 < r1.length) {
                    C149857Oe r14 = r1[i2];
                    if (r14.A03 == 1) {
                        if (r14.A04 == 5) {
                            r9 = r14;
                        } else if (r14.A04 != 1 && r14.A04 != 28) {
                            throw new UnknownHostException(AnonymousClass000.A0V("unexpected type returned while trying to resolve ", str2, AnonymousClass001.A0o()));
                        } else if (r14.A04 == 1 && ((short) r14.A05.length) != 4) {
                            throw new UnknownHostException(AnonymousClass000.A0T("unexpected record length returned while trying to resolve ", str2));
                        } else if (r14.A04 != 28 || (length = (short) r14.A05.length) == 16) {
                            C617632d r13 = r14.A02;
                            StringBuilder A0o = AnonymousClass001.A0o();
                            for (String append : r13.A02) {
                                A0o.append(append);
                                A0o.append('.');
                            }
                            short s = r13.A01;
                            if (s != 0) {
                                for (String append2 : C617632d.A00(r12.A00, s).A02) {
                                    A0o.append(append2);
                                    A0o.append('.');
                                }
                            }
                            if (A0o.length() > 0) {
                                A0o.setLength(A0o.length() - 1);
                            }
                            list2.add(new AnonymousClass2YB(InetAddress.getByAddress(A0o.toString(), r14.A05), C18290x4.A0A(r14.A01) + currentTimeMillis));
                            list2.get(AnonymousClass002.A04(list2, 1));
                        } else {
                            throw new UnknownHostException(AnonymousClass000.A0Y(" ", AnonymousClass000.A0m("unexpected record length returned while trying to resolve ", str2), length));
                        }
                        i2++;
                    } else {
                        throw new UnknownHostException(AnonymousClass000.A0V("unexpected class returned while trying to resolve ", str2, AnonymousClass001.A0o()));
                    }
                } else if (list2.isEmpty() && r9 != null) {
                    Pair A002 = A00(r9.A05, 0);
                    StringBuilder sb = (StringBuilder) A002.first;
                    int A03 = C18290x4.A03(A002);
                    if (A03 != -1) {
                        sb.append((CharSequence) A00(bArr, A03).first);
                    }
                    String obj = sb.toString();
                    if (!obj.equals(str2)) {
                        list2.addAll(A01(obj, i + 1));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        } else {
            throw new UnknownHostException(AnonymousClass000.A0V("error code was set in response while trying to resolve ", str2, AnonymousClass001.A0o()));
        }
    }
}
