package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: X.35l  reason: invalid class name and case insensitive filesystem */
public class C625335l {
    public int A00 = -1;
    public int A01;
    public final C36731zn A02 = new C36731zn();

    public static void A05(OutputStream outputStream, int i, long j) {
        outputStream.write((byte) ((int) (j >> i)));
    }

    public static int A00(C36731zn r4, long j) {
        int i = 1;
        if (j != 0) {
            i = 2;
            if (j != 1) {
                r4.write((byte) ((int) j));
                if (-128 <= j && j <= 127) {
                    return 3;
                }
                A05(r4, 8, j);
                if (-32768 <= j && j <= 32767) {
                    return 4;
                }
                A05(r4, 16, j);
                A05(r4, 24, j);
                if (-2147483648L <= j && j <= 2147483647L) {
                    return 5;
                }
                A05(r4, 32, j);
                A05(r4, 40, j);
                A05(r4, 48, j);
                A05(r4, 56, j);
                return 6;
            }
        }
        return i;
    }

    public static int A01(C36731zn r3, long j) {
        if (j < 0 || j > 4294967295L) {
            throw AnonymousClass001.A0c("Value is not an unsigned integer");
        }
        r3.write((byte) ((int) j));
        if (j <= 255) {
            return 1;
        }
        A05(r3, 8, j);
        if (j <= 65535) {
            return 2;
        }
        A05(r3, 16, j);
        A05(r3, 24, j);
        return 4;
    }

    public static long A02(ByteBuffer byteBuffer, int i) {
        long j = 0;
        int i2 = 0;
        do {
            j |= (((long) byteBuffer.get()) & 255) << (i2 * 8);
            i2++;
        } while (i2 < i);
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0098, code lost:
        return new X.AnonymousClass2O5(r1, r11, r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass2O5 A03(java.nio.ByteBuffer r12) {
        /*
            java.lang.String r5 = ", tag: "
            java.lang.String r4 = " at "
            java.lang.String r8 = "%02X "
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ BufferUnderflowException -> 0x00f3 }
            r12.order(r0)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            int r3 = r12.position()     // Catch:{ BufferUnderflowException -> 0x00f3 }
            byte r7 = r12.get()     // Catch:{ BufferUnderflowException -> 0x00f3 }
            r6 = 0
            r9 = 1
            r0 = 3
            r11 = r7 & 3
            if (r11 > r0) goto L_0x00c4
            r0 = r7 & 8
            if (r0 != 0) goto L_0x0023
            long r0 = A02(r12, r9)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            goto L_0x0028
        L_0x0023:
            r0 = 2
            long r0 = A02(r12, r0)     // Catch:{ BufferUnderflowException -> 0x00f3 }
        L_0x0028:
            int r10 = (int) r0     // Catch:{ BufferUnderflowException -> 0x00f3 }
            int r0 = r7 >> 4
            r2 = r0 & 15
            r0 = 10
            if (r2 > r0) goto L_0x0099
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ BufferUnderflowException -> 0x00f3 }
            r12.order(r0)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            switch(r2) {
                case 0: goto L_0x008d;
                case 1: goto L_0x008f;
                case 2: goto L_0x0088;
                case 3: goto L_0x007f;
                case 4: goto L_0x0076;
                case 5: goto L_0x006d;
                case 6: goto L_0x0064;
                case 7: goto L_0x005b;
                case 8: goto L_0x0051;
                case 9: goto L_0x0046;
                case 10: goto L_0x003b;
                default: goto L_0x0039;
            }     // Catch:{ BufferUnderflowException -> 0x00f3 }
        L_0x0039:
            goto L_0x00eb
        L_0x003b:
            r0 = 4
            long r1 = A02(r12, r0)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            int r0 = (int) r1     // Catch:{ BufferUnderflowException -> 0x00f3 }
            java.lang.String r1 = A04(r12, r0)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            goto L_0x0093
        L_0x0046:
            r0 = 2
            long r1 = A02(r12, r0)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            int r0 = (int) r1     // Catch:{ BufferUnderflowException -> 0x00f3 }
            java.lang.String r1 = A04(r12, r0)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            goto L_0x0093
        L_0x0051:
            long r1 = A02(r12, r9)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            int r0 = (int) r1     // Catch:{ BufferUnderflowException -> 0x00f3 }
            java.lang.String r1 = A04(r12, r0)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            goto L_0x0093
        L_0x005b:
            double r0 = r12.getDouble()     // Catch:{ BufferUnderflowException -> 0x00f3 }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            goto L_0x0093
        L_0x0064:
            long r0 = r12.getLong()     // Catch:{ BufferUnderflowException -> 0x00f3 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            goto L_0x0093
        L_0x006d:
            int r0 = r12.getInt()     // Catch:{ BufferUnderflowException -> 0x00f3 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            goto L_0x0093
        L_0x0076:
            short r0 = r12.getShort()     // Catch:{ BufferUnderflowException -> 0x00f3 }
            java.lang.Short r1 = java.lang.Short.valueOf(r0)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            goto L_0x0093
        L_0x007f:
            byte r0 = r12.get()     // Catch:{ BufferUnderflowException -> 0x00f3 }
            java.lang.Byte r1 = java.lang.Byte.valueOf(r0)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            goto L_0x0093
        L_0x0088:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            goto L_0x0093
        L_0x008d:
            r1 = 0
            goto L_0x0093
        L_0x008f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ BufferUnderflowException -> 0x00f3 }
        L_0x0093:
            X.2O5 r0 = new X.2O5     // Catch:{ BufferUnderflowException -> 0x00f3 }
            r0.<init>(r1, r11, r10)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            return r0
        L_0x0099:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x00a4 }
            java.lang.String r0 = "Invalid value type "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r2)     // Catch:{ IllegalArgumentException -> 0x00a4 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00a4 }
        L_0x00a4:
            r2 = move-exception
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ BufferUnderflowException -> 0x00f3 }
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ BufferUnderflowException -> 0x00f3 }
            X.C18310x6.A1T(r0, r7, r6)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            java.lang.String r1 = java.lang.String.format(r1, r8, r0)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            java.lang.StringBuilder r0 = X.C18290x4.A0v(r2)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            r0.append(r4)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            r0.append(r3)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            java.lang.String r0 = X.AnonymousClass000.A0V(r5, r1, r0)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            X.23b r1 = new X.23b     // Catch:{ BufferUnderflowException -> 0x00f3 }
            r1.<init>(r0)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            goto L_0x00f2
        L_0x00c4:
            java.lang.String r0 = "Invalid record type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ IllegalArgumentException -> 0x00cb }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00cb }
        L_0x00cb:
            r2 = move-exception
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ BufferUnderflowException -> 0x00f3 }
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ BufferUnderflowException -> 0x00f3 }
            X.C18310x6.A1T(r0, r7, r6)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            java.lang.String r1 = java.lang.String.format(r1, r8, r0)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            java.lang.StringBuilder r0 = X.C18290x4.A0v(r2)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            r0.append(r4)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            r0.append(r3)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            java.lang.String r0 = X.AnonymousClass000.A0V(r5, r1, r0)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            X.23b r1 = new X.23b     // Catch:{ BufferUnderflowException -> 0x00f3 }
            r1.<init>(r0)     // Catch:{ BufferUnderflowException -> 0x00f3 }
            goto L_0x00f2
        L_0x00eb:
            java.lang.String r0 = "Invalid value type"
            java.lang.Error r1 = new java.lang.Error     // Catch:{ BufferUnderflowException -> 0x00f3 }
            r1.<init>(r0)     // Catch:{ BufferUnderflowException -> 0x00f3 }
        L_0x00f2:
            throw r1     // Catch:{ BufferUnderflowException -> 0x00f3 }
        L_0x00f3:
            java.lang.String r1 = "Incomplete buffer"
            X.23b r0 = new X.23b
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625335l.A03(java.nio.ByteBuffer):X.2O5");
    }

    public static String A04(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        try {
            return C18320x8.A0h(bArr);
        } catch (UnsupportedEncodingException e) {
            throw new C375523b(AnonymousClass000.A0P(e, "UnsupportedEncoding: ", AnonymousClass001.A0o()));
        }
    }

    public void A06() {
        this.A02.reset();
        this.A00 = -1;
        this.A01 = 0;
    }

    public final void A07(Object obj, int i, int i2) {
        int i3;
        int i4;
        long A0B;
        C36731zn r4 = this.A02;
        this.A00 = r4.size();
        r4.write(0);
        int A012 = A01(r4, (long) i2);
        if (A012 == 1) {
            i3 = 0;
        } else if (A012 == 2) {
            i3 = 1;
        } else {
            throw new Error("Id too big to fit in 2 bytes");
        }
        if (obj == null) {
            i4 = 0;
        } else {
            if (obj instanceof Boolean) {
                A0B = C18290x4.A09(AnonymousClass001.A1Z(obj) ? 1 : 0);
            } else if (obj instanceof Long) {
                A0B = C18310x6.A0B(obj);
            } else if (obj instanceof Number) {
                double doubleValue = ((Number) obj).doubleValue();
                long j = (long) doubleValue;
                if (((double) j) == doubleValue) {
                    i4 = A00(r4, j);
                } else {
                    long doubleToRawLongBits = Double.doubleToRawLongBits(doubleValue);
                    r4.write((byte) ((int) doubleToRawLongBits));
                    A05(r4, 8, doubleToRawLongBits);
                    A05(r4, 16, doubleToRawLongBits);
                    A05(r4, 24, doubleToRawLongBits);
                    A05(r4, 32, doubleToRawLongBits);
                    A05(r4, 40, doubleToRawLongBits);
                    A05(r4, 48, doubleToRawLongBits);
                    A05(r4, 56, doubleToRawLongBits);
                    i4 = 7;
                }
            } else if (obj instanceof String) {
                try {
                    byte[] bytes = ((String) obj).getBytes(C58152un.A0B);
                    int length = bytes.length;
                    if (length > 1024) {
                        Locale locale = Locale.US;
                        Object[] objArr = new Object[1];
                        AnonymousClass000.A1P(objArr, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 0);
                        Log.w(String.format(locale, "wam/serialize: string length is limited to %d UTF-8 bytes", objArr));
                    }
                    int min = Math.min(length, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
                    int A013 = A01(r4, (long) min);
                    r4.write(bytes, 0, min);
                    i4 = 8;
                    if (A013 != 1) {
                        i4 = 9;
                        if (A013 != 2) {
                            if (A013 == 4) {
                                i4 = 10;
                            } else {
                                throw new Error("Impossible");
                            }
                        }
                    }
                } catch (UnsupportedEncodingException e) {
                    throw new Error(e);
                }
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A1T(A0o, "Expected class Boolean, Number, or String, got ", obj);
                throw C18310x6.A0d(A0o);
            }
            i4 = A00(r4, A0B);
        }
        r4.A01()[this.A00] = (byte) (i | (i3 << 3) | (i4 << 4));
        this.A01++;
    }
}
