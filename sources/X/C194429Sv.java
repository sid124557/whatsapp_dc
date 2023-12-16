package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.9Sv  reason: invalid class name and case insensitive filesystem */
public class C194429Sv {
    public double A00;
    public double A01;
    public double A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public long A0O;
    public long A0P;
    public long A0Q;
    public AnonymousClass9T4 A0R;
    public AnonymousClass9T4 A0S;
    public AnonymousClass9T4 A0T;
    public AnonymousClass9T4 A0U;
    public AnonymousClass9T4 A0V;
    public String A0W;
    public HashMap A0X = AnonymousClass001.A0t();
    public List A0Y;
    public List A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public boolean A19;
    public boolean A1A;
    public boolean A1B;
    public boolean A1C;
    public boolean A1D;
    public boolean A1E;
    public boolean A1F;
    public boolean A1G;
    public boolean A1H;
    public boolean A1I;
    public boolean A1J;
    public boolean A1K;
    public boolean A1L;
    public boolean A1M;
    public boolean A1N;
    public boolean A1O;
    public boolean A1P;
    public boolean A1Q;
    public boolean A1R;
    public boolean A1S;
    public boolean A1T;
    public boolean A1U;
    public boolean A1V;
    public boolean A1W;
    public boolean A1X;
    public boolean A1Y;
    public boolean A1Z;
    public boolean A1a;
    public boolean A1b;
    public boolean A1c;
    public boolean A1d;
    public boolean A1e;
    public boolean A1f;
    public float[] A1g;
    public int[] A1h;
    public int[] A1i;

    public AnonymousClass9SE A00() {
        if (!this.A1J || !this.A1b) {
            return new AnonymousClass9SE(this);
        }
        throw AnonymousClass001.A0e("Unable to build setting modifications, video stabilization will not work correctly if optical stabilization is also enabled, please enable one at a time only.");
    }

    public void A01(AnonymousClass9Mx r5, Object obj) {
        int i = r5.A00;
        switch (i) {
            case 2:
                this.A17 = AnonymousClass001.A1Z(obj);
                this.A18 = true;
                return;
            case 3:
                this.A1b = AnonymousClass001.A1Z(obj);
                this.A1c = true;
                return;
            case 4:
                this.A1J = AnonymousClass001.A1Z(obj);
                this.A1K = true;
                return;
            case 5:
                this.A0y = AnonymousClass001.A1Z(obj);
                this.A0z = true;
                return;
            case 6:
                this.A0d = AnonymousClass001.A1Z(obj);
                this.A0e = true;
                return;
            case 8:
                this.A1U = AnonymousClass001.A1Z(obj);
                this.A1V = true;
                return;
            case 9:
                this.A0C = AnonymousClass001.A0K(obj);
                this.A0x = true;
                return;
            case 10:
                this.A0B = AnonymousClass001.A0K(obj);
                this.A0v = true;
                return;
            case 11:
                this.A06 = AnonymousClass001.A0K(obj);
                this.A0a = true;
                return;
            case 12:
                this.A08 = AnonymousClass001.A0K(obj);
                this.A0o = true;
                return;
            case 13:
                this.A0A = AnonymousClass001.A0K(obj);
                this.A0r = true;
                return;
            case 14:
                this.A0E = AnonymousClass001.A0K(obj);
                this.A1E = true;
                return;
            case 15:
                this.A0F = AnonymousClass001.A0K(obj);
                this.A1F = true;
                return;
            case 17:
                this.A0H = AnonymousClass001.A0K(obj);
                this.A1M = true;
                return;
            case 18:
                this.A0I = AnonymousClass001.A0K(obj);
                this.A1O = true;
                return;
            case 19:
                this.A0J = AnonymousClass001.A0K(obj);
                this.A1Q = true;
                return;
            case 21:
                this.A0G = AnonymousClass001.A0K(obj);
                this.A1L = true;
                return;
            case 22:
                this.A0D = AnonymousClass001.A0K(obj);
                this.A1D = true;
                return;
            case 23:
                this.A0K = AnonymousClass001.A0K(obj);
                this.A1W = true;
                return;
            case 24:
                this.A0M = AnonymousClass001.A0K(obj);
                this.A1d = true;
                return;
            case 25:
                this.A0N = AnonymousClass001.A0K(obj);
                this.A1f = true;
                return;
            case 26:
                this.A05 = AnonymousClass001.A05(obj);
                this.A1X = true;
                return;
            case 27:
                this.A0P = C18310x6.A0B(obj);
                this.A14 = true;
                return;
            case 30:
                this.A00 = ((Number) obj).doubleValue();
                this.A10 = true;
                return;
            case 31:
                this.A02 = ((Number) obj).doubleValue();
                this.A12 = true;
                return;
            case 32:
                this.A01 = ((Number) obj).doubleValue();
                this.A11 = true;
                return;
            case 33:
                this.A0T = (AnonymousClass9T4) obj;
                this.A1R = true;
                return;
            case 34:
                this.A0S = (AnonymousClass9T4) obj;
                this.A1N = true;
                return;
            case 35:
                this.A0U = (AnonymousClass9T4) obj;
                this.A1a = true;
                return;
            case 36:
                this.A0R = (AnonymousClass9T4) obj;
                this.A1G = true;
                return;
            case 37:
                this.A0Y = AnonymousClass9UT.A00((List) obj);
                this.A0w = true;
                return;
            case 38:
                this.A0Z = AnonymousClass9UT.A00((List) obj);
                this.A1I = true;
                return;
            case 39:
                int[] iArr = (int[]) obj;
                if (iArr != null && iArr.length == 2) {
                    this.A1i = new int[]{iArr[0], iArr[1]};
                    this.A1P = true;
                    return;
                }
                return;
            case 42:
                this.A0W = (String) obj;
                this.A13 = true;
                return;
            case 44:
                this.A0s = AnonymousClass001.A1Z(obj);
                this.A0t = true;
                return;
            case 45:
                this.A0f = AnonymousClass001.A1Z(obj);
                this.A0g = true;
                return;
            case 46:
                this.A0O = C18310x6.A0B(obj);
                this.A0u = true;
                return;
            case 47:
                this.A09 = AnonymousClass001.A0K(obj);
                this.A0p = true;
                return;
            case 48:
                this.A03 = AnonymousClass001.A05(obj);
                this.A0b = true;
                return;
            case 49:
                float[] fArr = (float[]) obj;
                if (fArr == null || fArr.length == 4) {
                    this.A1g = fArr;
                    this.A0l = true;
                    return;
                }
                throw AnonymousClass001.A0c("Color Correction Gains invalid length");
            case 50:
                this.A07 = AnonymousClass001.A0K(obj);
                this.A0m = true;
                return;
            case 51:
                int[] iArr2 = (int[]) obj;
                if (iArr2 == null || iArr2.length == 18) {
                    this.A1h = iArr2;
                    this.A0n = true;
                    return;
                }
                throw AnonymousClass001.A0c("Color Correction Transform invalid length");
            case AnonymousClass1ES.REVOKE_MESSAGE_TIMESTAMP_FIELD_NUMBER:
                this.A0q = true;
                return;
            case 53:
                this.A0h = AnonymousClass001.A1Z(obj);
                this.A0i = true;
                return;
            case 54:
                this.A04 = AnonymousClass001.A05(obj);
                this.A1H = true;
                return;
            case 55:
                this.A0X = (HashMap) obj;
                this.A0c = true;
                return;
            case 56:
                this.A0j = AnonymousClass001.A1Z(obj);
                this.A0k = true;
                return;
            case AnonymousClass1ES.IS_GROUP_HISTORY_MESSAGE_FIELD_NUMBER:
                this.A19 = AnonymousClass001.A1Z(obj);
                this.A1A = true;
                return;
            case 58:
                this.A0V = (AnonymousClass9T4) obj;
                this.A1e = true;
                return;
            case 59:
                this.A0L = AnonymousClass001.A0K(obj);
                this.A1Z = true;
                return;
            case AnonymousClass1EU.POLL_CREATION_MESSAGE_V2_FIELD_NUMBER:
                this.A1S = AnonymousClass001.A1Z(obj);
                this.A1T = true;
                return;
            case 61:
                this.A1B = AnonymousClass001.A1Z(obj);
                this.A1C = true;
                return;
            case 62:
                this.A0Q = C18310x6.A0B(obj);
                this.A1Y = true;
                return;
            case 63:
                this.A15 = AnonymousClass001.A1Z(obj);
                this.A16 = true;
                return;
            default:
                throw C1899593h.A0Y("Invalid Settings key: ", AnonymousClass001.A0o(), i);
        }
    }
}
