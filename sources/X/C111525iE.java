package X;

import android.text.TextUtils;
import java.util.Random;

/* renamed from: X.5iE  reason: invalid class name and case insensitive filesystem */
public class C111525iE implements AnonymousClass8r5 {
    public int A00;
    public String A01;
    public Random A02;
    public final AnonymousClass5IL A03;
    public final C111545iG A04;
    public final AnonymousClass4FV A05;
    public final C105355Up A06;

    public void A01(int i) {
        C95224sp A002 = C95224sp.A00(i);
        A002.A0G = 2;
        A002.A06 = 0;
        A04(A002);
    }

    public void A02(int i, int i2) {
        C95224sp A002 = C95224sp.A00(i);
        A002.A0G = Integer.valueOf(i2);
        A002.A06 = 1;
        A04(A002);
    }

    public void BKM(Integer num, Integer num2, Integer num3, String str, String str2, String str3, int i) {
        Long A0g;
        C94984sP r1 = new C94984sP();
        r1.A09 = this.A01;
        r1.A00 = 0;
        r1.A06 = str;
        if (num == null) {
            A0g = null;
        } else {
            A0g = C18310x6.A0g(num);
        }
        r1.A05 = A0g;
        if (num2 != null) {
            r1.A03 = C18310x6.A0g(num2);
        }
        if (num3 != null) {
            r1.A04 = C18310x6.A0g(num3);
        }
        r1.A08 = str2;
        r1.A07 = str3;
        this.A05.BhD(r1);
    }

    public final void A00() {
        Random random = this.A02;
        if (random == null) {
            random = new Random();
            this.A02 = random;
        }
        String hexString = Long.toHexString(random.nextLong());
        this.A01 = hexString;
        C111545iG r1 = this.A04;
        C162457s7.A0J(hexString, 0);
        r1.A01 = hexString;
    }

    public final void A04(C95224sp r2) {
        r2.A0U = this.A01;
        r2.A0C = Integer.valueOf(this.A00);
        r2.A0J = AnonymousClass0x2.A0T();
        this.A05.BhD(r2);
    }

    public void BJx(Integer num, Integer num2) {
        Long l;
        C94984sP r2 = new C94984sP();
        r2.A00 = AnonymousClass001.A0f();
        r2.A09 = this.A01;
        Long l2 = null;
        if (num != null) {
            l = C18310x6.A0g(num);
        } else {
            l = null;
        }
        r2.A01 = l;
        if (num2 != null) {
            l2 = C18310x6.A0g(num2);
        }
        r2.A02 = l2;
        this.A05.BhD(r2);
    }

    public C111525iE(AnonymousClass5IL r1, C111545iG r2, AnonymousClass4FV r3, C105355Up r4) {
        this.A05 = r3;
        this.A06 = r4;
        this.A03 = r1;
        this.A04 = r2;
    }

    public void A03(int i, Integer num) {
        C95224sp A002 = C95224sp.A00(i);
        A002.A09 = num;
        A04(A002);
    }

    public void A05(Double d, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        if (!TextUtils.isEmpty(str4) && num != null && str3 != null) {
            C95004sS r2 = new C95004sS();
            r2.A08 = str4;
            r2.A04 = AnonymousClass0x9.A0m(i);
            r2.A01 = num;
            r2.A02 = Integer.valueOf(i2);
            r2.A07 = str;
            r2.A09 = str2;
            r2.A0A = str3;
            r2.A06 = str5;
            r2.A05 = str6;
            r2.A00 = d;
            C96204vy r4 = this.A03.A02;
            Long A0m = AnonymousClass0x9.A0m(C18280x3.A02(r4.A01(), "pref_saved_search_session_action_order"));
            r2.A03 = A0m;
            C86604Kt.A15(r4.A01(), "pref_saved_search_session_action_order", A0m.intValue() + 1);
            this.A05.BhD(r2);
        }
    }

    public void A06(Integer num, int i, int i2) {
        C95224sp A002 = C95224sp.A00(i);
        A002.A0D = Integer.valueOf(i2);
        A002.A09 = num;
        A04(A002);
    }

    public void A07(Integer num, int i, int i2) {
        C95224sp A002 = C95224sp.A00(i);
        A002.A0F = Integer.valueOf(i2);
        A002.A09 = num;
        A04(A002);
    }
}
