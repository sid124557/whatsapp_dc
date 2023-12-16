package X;

/* renamed from: X.5UM  reason: invalid class name */
public class AnonymousClass5UM {
    public long A00 = 0;
    public long A01 = 0;
    public long A02 = 0;
    public long A03 = 0;
    public long A04 = 0;
    public long A05 = 0;
    public long A06 = 0;
    public final C56612sH A07;
    public final AnonymousClass4FV A08;
    public final C186568vZ A09;
    public final boolean A0A;
    public final boolean A0B;

    public final void A03(Integer num, int i, int i2) {
        String str;
        String str2;
        C186568vZ r2 = this.A09;
        if (num.intValue() == 0) {
            str = "api_1";
        } else {
            str = "api_2";
        }
        r2.markerAnnotate(i, "camera_api", str);
        if (i2 == 1) {
            str2 = "camera_core";
        } else {
            str2 = "wa";
        }
        r2.markerAnnotate(i, "camera_type", str2);
    }

    public final void A04(String str, String str2) {
        if (this.A0B) {
            C186568vZ r2 = this.A09;
            if (!r2.BI5(554251647)) {
                r2.markerStart(554251647, "startup_type", str);
                r2.markerAnnotate(554251647, "origin", str2);
            }
        }
    }

    public void A05(short s) {
        if (this.A0B) {
            this.A09.markerEnd(554251647, s);
        }
    }

    public AnonymousClass5UM(C56612sH r3, AnonymousClass1VX r4, AnonymousClass4FV r5, C186568vZ r6) {
        this.A07 = r3;
        this.A08 = r5;
        this.A09 = r6;
        this.A0A = r4.A0X(125);
        this.A0B = r4.A0X(980);
    }

    public final void A00(int i, int i2) {
        String str;
        Integer valueOf = Integer.valueOf(i2);
        if (valueOf == null || (str = valueOf.toString()) == null) {
            str = "";
        }
        this.A09.markerAnnotate(i, "camera_facing", str);
    }

    public final void A01(int i, String str) {
        String A0X = AnonymousClass000.A0X("_end", AnonymousClass000.A0l(str));
        if (this.A0B) {
            this.A09.markerPoint(i, A0X);
        }
    }

    public final void A02(int i, String str) {
        String A0X = AnonymousClass000.A0X("_start", AnonymousClass000.A0l(str));
        if (this.A0B) {
            this.A09.markerPoint(i, A0X);
        }
    }
}
