package X;

import android.text.TextUtils;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.jid.Jid;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.zip.InflaterInputStream;

/* renamed from: X.3Tl  reason: invalid class name and case insensitive filesystem */
public class C68513Tl implements AnonymousClass4DS {
    public byte[] A00;
    public final C55682qk A01;
    public final AnonymousClass1VX A02;
    public final C43932Ua A03;
    public final C41992Mj A04;

    public static void A00(InputStream inputStream, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int read = inputStream.read(bArr, i, length - i);
            if (read != -1) {
                i += read;
            } else {
                throw AnonymousClass002.A0C("ran out of bytes while reading into buffer");
            }
        }
    }

    public final int A02(InputStream inputStream, int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 248) {
            return inputStream.read();
        }
        if (i == 249) {
            return (inputStream.read() << 8) + inputStream.read();
        }
        throw new AnonymousClass24Y(AnonymousClass000.A0Y("invalid list size in readListSize: token ", AnonymousClass001.A0o(), i), BJX());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        throw new X.AnonymousClass24Y("invalid token index in getToken()", BJX());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c0, code lost:
        r0 = new byte[r3];
        A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c9, code lost:
        return X.C18320x8.A0h(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010c, code lost:
        throw new X.AnonymousClass24Y("invalid token index in getToken()", BJX());
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[ExcHandler: ArrayIndexOutOfBoundsException | NullPointerException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:9:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[ExcHandler: ArrayIndexOutOfBoundsException | NullPointerException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:45:0x00d8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A05(java.io.InputStream r5, int r6) {
        /*
            r4 = this;
            r0 = -1
            if (r6 == r0) goto L_0x0117
            r0 = 2
            if (r6 <= r0) goto L_0x003c
            r0 = 236(0xec, float:3.31E-43)
            if (r6 >= r0) goto L_0x0040
            r3 = 0
            java.lang.String[] r0 = X.C39402Bv.A00     // Catch:{ ArrayIndexOutOfBoundsException -> 0x001d }
            r2 = r0[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x001d }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0030, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0030 }
            java.lang.String r0 = "Token was null for singlebyte idx: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r6)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0030, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0030 }
            X.C626936e.A07(r2, r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0030, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0030 }
            return r2
        L_0x001d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0030, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0030 }
            java.lang.String r0 = "Fail while trying to access WapDict, dictNum="
            r1.append(r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0030, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0030 }
            r1.append(r3)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0030, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0030 }
            java.lang.String r0 = ", dictIdx="
            X.C18260x0.A0x(r0, r1, r6)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0030, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0030 }
            throw r2     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0030, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0030 }
        L_0x0030:
            java.lang.String r2 = "invalid token index in getToken()"
            java.lang.String r1 = r4.BJX()
            X.24Y r0 = new X.24Y
            r0.<init>(r2, r1)
            throw r0
        L_0x003c:
            if (r6 != 0) goto L_0x004a
            r2 = 0
            return r2
        L_0x0040:
            r0 = 247(0xf7, float:3.46E-43)
            if (r6 == r0) goto L_0x010d
            switch(r6) {
                case 236: goto L_0x00cc;
                case 237: goto L_0x00cc;
                case 238: goto L_0x00cc;
                case 239: goto L_0x00cc;
                default: goto L_0x0047;
            }
        L_0x0047:
            switch(r6) {
                case 250: goto L_0x0057;
                case 251: goto L_0x0082;
                case 252: goto L_0x008b;
                case 253: goto L_0x00ac;
                case 254: goto L_0x0090;
                case 255: goto L_0x0082;
                default: goto L_0x004a;
            }
        L_0x004a:
            java.lang.String r2 = "readString couldn't match token"
            java.lang.String r1 = r4.BJX()
            X.24Y r0 = new X.24Y
            r0.<init>(r2, r1)
            throw r0
        L_0x0057:
            java.lang.String r0 = "Unexpected ReadString for token JID_PAIR"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            int r0 = r5.read()
            java.lang.String r1 = r4.A05(r5, r0)
            int r0 = r5.read()
            java.lang.String r2 = r4.A05(r5, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0081
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r1)
            java.lang.String r0 = ""
            r1.append(r0)
            r0 = 64
            java.lang.String r2 = X.AnonymousClass0x2.A0e(r2, r1, r0)
        L_0x0081:
            return r2
        L_0x0082:
            byte[] r0 = A01(r5, r6)
            java.lang.String r2 = X.C18320x8.A0h(r0)     // Catch:{ UnsupportedEncodingException -> 0x00ca }
            return r2
        L_0x008b:
            int r3 = r5.read()
            goto L_0x00c0
        L_0x0090:
            int r0 = r5.read()
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r5.read()
            int r2 = r5.read()
            int r3 = r5.read()
            int r1 = r1 << 24
            int r0 = r0 << 16
            r1 = r1 | r0
            int r0 = r2 << 8
            r1 = r1 | r0
            r3 = r3 | r1
            goto L_0x00c0
        L_0x00ac:
            int r0 = r5.read()
            r2 = r0 & 15
            int r0 = r5.read()
            int r1 = r5.read()
            int r3 = r2 << 16
            int r0 = r0 << 8
            int r3 = r3 + r0
            int r3 = r3 + r1
        L_0x00c0:
            byte[] r0 = new byte[r3]
            A00(r5, r0)
            java.lang.String r2 = X.C18320x8.A0h(r0)     // Catch:{ UnsupportedEncodingException -> 0x00ca }
            return r2
        L_0x00ca:
            r2 = 0
            return r2
        L_0x00cc:
            int r3 = r5.read()
            java.lang.String[][] r1 = X.C39402Bv.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00ee }
            int r0 = r6 + -236
            r0 = r1[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00ee }
            r2 = r0[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00ee }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0101, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0101 }
            java.lang.String r0 = "Token was null for doublebyte dictNum="
            r1.append(r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0101, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0101 }
            r1.append(r6)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0101, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0101 }
            java.lang.String r0 = ", dictIdx="
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0101, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0101 }
            X.C626936e.A07(r2, r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0101, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0101 }
            return r2
        L_0x00ee:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0101, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0101 }
            java.lang.String r0 = "Fail while trying to access WapDict, dictNum="
            r1.append(r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0101, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0101 }
            r1.append(r6)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0101, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0101 }
            java.lang.String r0 = ", dictIdx="
            X.C18260x0.A0x(r0, r1, r3)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0101, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0101 }
            throw r2     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0101, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0101 }
        L_0x0101:
            java.lang.String r2 = "invalid token index in getToken()"
            java.lang.String r1 = r4.BJX()
            X.24Y r0 = new X.24Y
            r0.<init>(r2, r1)
            throw r0
        L_0x010d:
            java.lang.String r0 = "Unexpected ReadString for token JID_4"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r2 = r4.A04(r5)
            return r2
        L_0x0117:
            java.lang.String r2 = "-1 token in readString"
            java.lang.String r1 = r4.BJX()
            X.24Y r0 = new X.24Y
            r0.<init>(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68513Tl.A05(java.io.InputStream, int):java.lang.String");
    }

    public final void A06(Jid jid, String str) {
        C55682qk r3 = this.A01;
        if (r3 != null && !jid.isProtocolCompliant()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Jid: '");
            A0o.append(jid);
            A0o.append("' key: '");
            if (str == null) {
                str = "";
            }
            A0o.append(str);
            r3.A0A("invalid jid!", true, AnonymousClass000.A0X("'", A0o));
        }
    }

    public String BJX() {
        byte[] bArr = this.A00;
        if (bArr == null) {
            return "null";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("size = ");
        int length = bArr.length;
        A0o.append(length);
        A0o.append('<');
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                AnonymousClass001.A1M(A0o);
            }
            A0o.append(bArr[i] & 255);
            if (((long) A0o.length()) >= 262144) {
                break;
            }
        }
        if (((long) A0o.length()) < 262144) {
            A0o.append('>');
        } else {
            A0o.append("...");
        }
        return A0o.toString();
    }

    public AnonymousClass36K BLZ() {
        byte[] A022;
        int length;
        ByteArrayOutputStream byteArrayOutputStream;
        C41992Mj r7 = this.A04;
        C626936e.A07(r7, "frameInputStream is null");
        do {
            try {
                C59202wW r1 = r7.A00;
                byte[] bArr = new byte[3];
                r1.A00(bArr);
                byte[] bArr2 = new byte[AnonymousClass36A.A00(bArr)];
                r1.A00(bArr2);
                C43362Rv r0 = r7.A01;
                A022 = r0.A03.A02(new byte[0], bArr2, r0.A00.getAndIncrement());
                length = A022.length;
            } catch (AnonymousClass24D e) {
                throw new C36791zt(e);
            }
        } while (length == 0);
        if (length != 1) {
            byte b = A022[0];
            if ((b & 2) != 0) {
                byte[] bArr3 = {b};
                InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(A022, 1, length - 1));
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream(DefaultCrypto.BUFFER_SIZE);
                    byteArrayOutputStream.write(bArr3);
                    byte[] bArr4 = new byte[DefaultCrypto.BUFFER_SIZE];
                    for (int read = inflaterInputStream.read(bArr4); read >= 0; read = inflaterInputStream.read(bArr4)) {
                        byteArrayOutputStream.write(bArr4, 0, read);
                    }
                    inflaterInputStream.close();
                    byteArrayOutputStream.close();
                    A022 = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    inflaterInputStream.close();
                } catch (Throwable th) {
                    try {
                        inflaterInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            this.A00 = A022;
            ByteArrayInputStream A0d = AnonymousClass0x9.A0d(A022);
            if ((((byte) A0d.read()) & 1) == 0) {
                return A03(A0d);
            }
            throw AnonymousClass24Y.A01("server to client stanza fragmentation not supported");
        }
        throw AnonymousClass24Y.A01("header only frame received");
        throw th;
    }

    public C68513Tl(C55682qk r1, AnonymousClass1VX r2, C43932Ua r3, C41992Mj r4) {
        this.A02 = r2;
        this.A01 = r1;
        this.A04 = r4;
        this.A03 = r3;
    }

    public static byte[] A01(InputStream inputStream, int i) {
        int i2;
        int read = inputStream.read();
        boolean A1S = AnonymousClass000.A1S(read & 128);
        int i3 = read & 127;
        byte[] bArr = new byte[i3];
        A00(inputStream, bArr);
        int i4 = (i3 * 2) - (A1S ? 1 : 0);
        byte[] bArr2 = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = (1 - (i5 % 2)) * 4;
            int i7 = (bArr[i5 / 2] & (15 << i6)) >> i6;
            if (i == 251) {
                switch (i7) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        break;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        i2 = (i7 - 10) + 65;
                        continue;
                    default:
                        throw AnonymousClass24Y.A01(AnonymousClass000.A0Y("bad hex ", AnonymousClass001.A0o(), i7));
                }
            } else if (i == 255) {
                switch (i7) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        break;
                    case 10:
                    case 11:
                        i2 = (i7 - 10) + 45;
                        continue;
                    case 12:
                        i2 = 58;
                        continue;
                    default:
                        throw AnonymousClass24Y.A01(AnonymousClass000.A0Y("bad nibble ", AnonymousClass001.A0o(), i7));
                }
            } else {
                throw AnonymousClass24Y.A01(AnonymousClass000.A0Y("bad packed type ", AnonymousClass001.A0o(), i));
            }
            i2 = i7 + 48;
            bArr2[i5] = (byte) i2;
        }
        return bArr2;
    }

    public final AnonymousClass36K A03(InputStream inputStream) {
        AnonymousClass39V[] r4;
        String str;
        AnonymousClass39V r1;
        String A0Y;
        byte[] A012;
        int read;
        int A022 = A02(inputStream, inputStream.read());
        int read2 = inputStream.read();
        if (read2 == 2) {
            return null;
        }
        String A05 = A05(inputStream, read2);
        if (A022 == 0 || A05 == null) {
            throw new AnonymousClass24Y("nextTree sees 0 list or null tag", BJX());
        }
        int i = A022 - 2;
        int i2 = A022 % 2;
        int i3 = (i + i2) / 2;
        if (i3 == 0) {
            r4 = null;
        } else {
            r4 = new AnonymousClass39V[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                String A052 = A05(inputStream, inputStream.read());
                int read3 = inputStream.read();
                if (read3 == 244) {
                    String A053 = A05(inputStream, inputStream.read());
                    int read4 = (inputStream.read() << 8) + inputStream.read();
                    int read5 = (inputStream.read() << 8) + inputStream.read();
                    if (inputStream.read() == 0) {
                        StringBuilder A0j = C18320x8.A0j(read5);
                        A0j.append("-");
                        C626936e.A05(A053);
                        A0j.append(A053);
                        if (read4 == 0) {
                            A0Y = "";
                        } else {
                            A0Y = AnonymousClass000.A0Y(":", AnonymousClass001.A0o(), read4);
                        }
                        A0j.append(A0Y);
                        str = AnonymousClass0x2.A0e("interop", A0j, '@');
                        Jid A013 = AnonymousClass32W.A01(str);
                        A06(A013, A052);
                        r1 = new AnonymousClass39V(A013, A052);
                    } else {
                        throw AnonymousClass24Y.A01("Nonzero domain received for JID_INTEROP tuple");
                    }
                } else if (read3 == 247) {
                    str = A04(inputStream);
                    Jid A014 = AnonymousClass32W.A01(str);
                    A06(A014, A052);
                    r1 = new AnonymousClass39V(A014, A052);
                } else if (read3 != 250) {
                    r1 = new AnonymousClass39V(A052, A05(inputStream, read3));
                } else {
                    String A054 = A05(inputStream, inputStream.read());
                    str = A05(inputStream, inputStream.read());
                    if (!TextUtils.isEmpty(A054)) {
                        StringBuilder A0l = AnonymousClass000.A0l(A054);
                        A0l.append("");
                        str = AnonymousClass0x2.A0e(str, A0l, '@');
                    }
                    try {
                        Jid A015 = AnonymousClass32W.A01(str);
                        A06(A015, A052);
                        r1 = new AnonymousClass39V(A015, A052);
                    } catch (AnonymousClass24P unused) {
                        r1 = new AnonymousClass39V(A052, str);
                    }
                }
                r4[i4] = r1;
            }
        }
        if (i2 == 1) {
            return AnonymousClass36K.A0I(A05, r4);
        }
        int read6 = inputStream.read();
        if (read6 == 0 || read6 == 248 || read6 == 249) {
            int A023 = A02(inputStream, read6);
            AnonymousClass36K[] r2 = new AnonymousClass36K[A023];
            for (int i5 = 0; i5 < A023; i5++) {
                r2[i5] = A03(inputStream);
            }
            return AnonymousClass36K.A0J(A05, r4, r2);
        }
        if (read6 == 252) {
            read = inputStream.read();
        } else if (read6 == 253) {
            read = ((inputStream.read() & 15) << 16) + (inputStream.read() << 8) + inputStream.read();
        } else if (read6 == 254) {
            read = inputStream.read() | ((inputStream.read() & 127) << 24) | (inputStream.read() << 16) | (inputStream.read() << 8);
        } else if (read6 != 255 && read6 != 251) {
            return new AnonymousClass36K(A05, A05(inputStream, read6), r4);
        } else {
            A012 = A01(inputStream, read6);
            return new AnonymousClass36K(A05, A012, r4);
        }
        A012 = new byte[read];
        A00(inputStream, A012);
        return new AnonymousClass36K(A05, A012, r4);
    }

    public final String A04(InputStream inputStream) {
        String str;
        String A0Y;
        int read = inputStream.read() & 255;
        int read2 = inputStream.read() & 255;
        String A05 = A05(inputStream, inputStream.read());
        boolean z = false;
        boolean A1T = AnonymousClass000.A1T(read & 1);
        if ((read & 128) != 0) {
            z = true;
        }
        if (AnonymousClass000.A1U(read2, 99) != z) {
            AnonymousClass1VX r2 = this.A02;
            if (r2 == null || !r2.A0Y(C58422vE.A02, 6671)) {
                C55682qk r22 = this.A01;
                StringBuilder A0o = AnonymousClass001.A0o();
                if (r22 != null) {
                    A0o.append("jid read; isHosted: ");
                    A0o.append(z);
                    r22.A0A("invalid-hosted-flag", false, AnonymousClass000.A0X("; proceeding since no validation", A0o));
                } else {
                    AnonymousClass001.A1K("Hosted flag mismatch on jid; user=", A05, "; device=", A0o);
                    A0o.append(read2);
                    A0o.append("; flag=");
                    A0o.append(z);
                    C18260x0.A1K(A0o, "; not reporting and proceeding");
                }
            } else {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                AnonymousClass001.A1K("Hosted flag mismatch on jid; user=", A05, "; device=", A0o2);
                A0o2.append(read2);
                throw AnonymousClass24Y.A01(AnonymousClass000.A0b("; flag=", A0o2, z));
            }
        }
        if (z) {
            if (A1T) {
                str = "hosted";
            } else {
                str = "hosted.lid";
            }
        } else if (A1T) {
            str = "s.whatsapp.net";
        } else {
            str = "lid";
        }
        if (TextUtils.isEmpty(A05)) {
            return str;
        }
        StringBuilder A0l = AnonymousClass000.A0l(A05);
        if (read2 == 0) {
            A0Y = "";
        } else {
            A0Y = AnonymousClass000.A0Y(":", AnonymousClass001.A0o(), read2);
        }
        A0l.append(A0Y);
        return AnonymousClass0x2.A0e(str, A0l, '@');
    }
}
