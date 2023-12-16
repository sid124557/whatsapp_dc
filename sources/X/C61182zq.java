package X;

import android.content.SharedPreferences;

/* renamed from: X.2zq  reason: invalid class name and case insensitive filesystem */
public final class C61182zq {
    public final SharedPreferences A00;
    public final C56612sH A01;
    public final String A02;

    public int A01(C373021s r4, String str) {
        String str2;
        boolean A1Y = AnonymousClass0x2.A1Y(r4, str);
        int ordinal = r4.ordinal();
        if (ordinal == 0) {
            str2 = "impressionCount";
        } else if (ordinal == A1Y) {
            str2 = "primaryActionCount";
        } else if (ordinal != 2) {
            str2 = "dismissActionCount";
        } else {
            str2 = "secondaryActionCount";
        }
        return this.A00.getInt(A00(str, str2), 0);
    }

    public long A02(C373021s r4, String str) {
        String str2;
        boolean A1Y = AnonymousClass0x2.A1Y(r4, str);
        int ordinal = r4.ordinal();
        if (ordinal == 0) {
            str2 = "lastImpressionTime";
        } else if (ordinal == A1Y) {
            str2 = "primaryActionTime";
        } else if (ordinal != 2) {
            str2 = "dismissActionTime";
        } else {
            str2 = "secondaryActionTime";
        }
        return AnonymousClass0x2.A0B(this.A00, A00(str, str2));
    }

    public C61182zq(SharedPreferences sharedPreferences, C56612sH r3, String str) {
        C18260x0.A0V(r3, str, sharedPreferences);
        this.A01 = r3;
        this.A00 = sharedPreferences;
        if (str.length() == 0) {
            throw AnonymousClass001.A0e("surfaceId cannot be empty");
        }
        this.A02 = str;
    }

    public static final String A00(String str, String str2) {
        if (str.length() != 0) {
            return AnonymousClass0x2.A0e(str2, AnonymousClass000.A0l(str), '/');
        }
        throw AnonymousClass001.A0e("promotionId cannot be empty");
    }

    public final String A03(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A02);
        return AnonymousClass0x2.A0e(str, A0o, '/');
    }

    public final void A04(String str, String str2, String str3, String str4) {
        String A002 = A00(str, str2);
        String A003 = A00(str, str3);
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = this.A00;
        SharedPreferences.Editor putLong = sharedPreferences.edit().putInt(A002, C18280x3.A02(sharedPreferences, A002) + 1).putLong(A003, currentTimeMillis);
        if (str4 != null) {
            putLong.putLong(A03(str4), currentTimeMillis);
        }
        putLong.apply();
    }
}
