package X;

/* renamed from: X.8dh  reason: invalid class name and case insensitive filesystem */
public class C176868dh extends C177088e3 implements C183628qM {
    public final byte[] A00;

    public String BDM() {
        byte[] bArr = this.A00;
        int length = bArr.length;
        char[] cArr = new char[length];
        int i = 0;
        int i2 = 0;
        loop0:
        while (true) {
            if (i < length) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    if (i2 >= length) {
                        break;
                    }
                    cArr[i2] = (char) b;
                    i = i3;
                    i2++;
                } else {
                    short s = C1461478v.A01[b & Byte.MAX_VALUE];
                    int i4 = s >>> 8;
                    byte b2 = (byte) s;
                    while (true) {
                        if (b2 >= 0) {
                            if (i3 >= length) {
                                break loop0;
                            }
                            byte b3 = bArr[i3];
                            i4 = (i4 << 6) | (b3 & 63);
                            b2 = C1461478v.A00[b2 + ((b3 & 255) >>> 4)];
                            i3++;
                        } else if (b2 == -2) {
                            break;
                        } else {
                            if (i4 > 65535) {
                                if (i2 >= length - 1) {
                                    break;
                                }
                                int i5 = i2 + 1;
                                cArr[i2] = (char) ((i4 >>> 10) + 55232);
                                i2 = i5 + 1;
                                cArr[i5] = (char) ((i4 & 1023) | 56320);
                            } else if (i2 >= length) {
                                break;
                            } else {
                                cArr[i2] = (char) i4;
                                i2++;
                            }
                            i = i3;
                        }
                    }
                }
            } else if (i2 >= 0) {
                return new String(cArr, 0, i2);
            }
        }
        throw AnonymousClass001.A0c("Invalid UTF-8 input");
    }

    public int hashCode() {
        return C161007oo.A00(this.A00);
    }

    public C176868dh(String str) {
        this.A00 = C162077rB.A04(str.toCharArray());
    }

    public String toString() {
        return BDM();
    }

    public C176868dh(byte[] bArr) {
        this.A00 = bArr;
    }
}
