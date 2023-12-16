package X;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

/* renamed from: X.7kk  reason: invalid class name and case insensitive filesystem */
public abstract class C158907kk {
    public static Hashtable A00(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }

    public String A01(C176618dI r8) {
        StringBuffer stringBuffer;
        if (this instanceof C177118e6) {
            C177118e6 r5 = (C177118e6) this;
            stringBuffer = AnonymousClass6CA.A0X();
            C176538dA[] A0N = r8.A0N();
            boolean z = true;
            for (int length = A0N.length - 1; length >= 0; length--) {
                if (z) {
                    z = false;
                } else {
                    stringBuffer.append(',');
                }
                C161947qs.A05(stringBuffer, r5.A01, A0N[length]);
            }
        } else {
            C177138e8 r52 = (C177138e8) this;
            stringBuffer = AnonymousClass6CA.A0X();
            C176538dA[] A0N2 = r8.A0N();
            boolean z2 = true;
            for (C176538dA A05 : A0N2) {
                if (z2) {
                    z2 = false;
                } else {
                    stringBuffer.append(',');
                }
                C161947qs.A05(stringBuffer, r52.A01, A05);
            }
        }
        return stringBuffer.toString();
    }

    public C176768dX A03(String str) {
        Hashtable hashtable;
        if (this instanceof C177118e6) {
            hashtable = ((C177118e6) this).A00;
        } else {
            hashtable = ((C177138e8) this).A00;
        }
        return C161947qs.A03(str, hashtable);
    }

    public C183618qL A02(String str, C176768dX r8) {
        C176768dX r0;
        int length = str.length();
        if (length != 0) {
            if (str.charAt(0) == '#') {
                try {
                    int i = (length - 1) / 2;
                    byte[] bArr = new byte[i];
                    for (int i2 = 0; i2 != i; i2++) {
                        int i3 = (i2 * 2) + 1;
                        char charAt = str.charAt(i3);
                        char charAt2 = str.charAt(i3 + 1);
                        AnonymousClass6C8.A0u(C161947qs.A00(charAt2), bArr, C161947qs.A00(charAt) << 4, i2);
                    }
                    return C177088e3.A0I(bArr);
                } catch (IOException unused) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("can't recode value for oid ");
                    throw new C144066zx(AnonymousClass000.A0X(r8.A01, A0o));
                }
            } else if (str.charAt(0) == '\\') {
                str = str.substring(1);
            }
        }
        if (this instanceof C177118e6) {
            if (!r8.A0T(C177118e6.A07)) {
                if (!r8.A0T(C177118e6.A05) && !r8.A0T(C177118e6.A0Y) && !r8.A0T(C177118e6.A0B)) {
                    r0 = C177118e6.A0c;
                }
                return new C176858dg(str);
            }
            return new C176898dk(str);
        }
        if (!r8.A0T(C177138e8.A0F) && !r8.A0T(C177138e8.A0A)) {
            if (r8.A0T(C177138e8.A09)) {
                return new C176758dW(str);
            }
            if (!r8.A0T(C177138e8.A05) && !r8.A0T(C177138e8.A0W) && !r8.A0T(C177138e8.A0D)) {
                r0 = C177138e8.A0b;
            }
            return new C176858dg(str);
        }
        return new C176898dk(str);
        if (!r8.A0T(r0)) {
            return new C176868dh(str);
        }
        return new C176858dg(str);
    }
}
