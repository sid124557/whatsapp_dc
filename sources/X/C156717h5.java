package X;

import android.text.TextUtils;

/* renamed from: X.7h5  reason: invalid class name and case insensitive filesystem */
public final class C156717h5 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public static C156717h5 A00(String str) {
        C161487pm.A03(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            int length = split.length;
            if (i < length) {
                String trim = split[i].trim();
                if (trim != null) {
                    trim = AnonymousClass0x9.A0z(trim);
                }
                switch (trim.hashCode()) {
                    case 100571:
                        if (!trim.equals("end")) {
                            break;
                        } else {
                            i3 = i;
                            break;
                        }
                    case 3556653:
                        if (!trim.equals("text")) {
                            break;
                        } else {
                            i5 = i;
                            break;
                        }
                    case 109757538:
                        if (!trim.equals("start")) {
                            break;
                        } else {
                            i2 = i;
                            break;
                        }
                    case 109780401:
                        if (!trim.equals("style")) {
                            break;
                        } else {
                            i4 = i;
                            break;
                        }
                }
                i++;
            } else if (i2 == -1 || i3 == -1 || i5 == -1) {
                return null;
            } else {
                return new C156717h5(i2, i3, i4, i5, length);
            }
        }
    }

    public C156717h5(int i, int i2, int i3, int i4, int i5) {
        this.A02 = i;
        this.A00 = i2;
        this.A03 = i3;
        this.A04 = i4;
        this.A01 = i5;
    }
}
