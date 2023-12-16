package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.5aQ  reason: invalid class name and case insensitive filesystem */
public final class C106945aQ {
    public final C56972sr A00;
    public final C57162tC A01;
    public final C56662sM A02;

    public static int A00(C55502qS r1) {
        if (r1 == null) {
            return 1;
        }
        if (r1.A02()) {
            return 3;
        }
        if (!r1.A03()) {
            return 1;
        }
        return 2;
    }

    public static SpannableString A01(Context context, C108745dU r3, C160617ny r4, C620733j r5, BigDecimal bigDecimal, Date date) {
        if (bigDecimal == null || r4 == null) {
            return AnonymousClass4L0.A0A(context.getString(R.string.f11nameremoved));
        }
        String A04 = r4.A04(r5, bigDecimal, true);
        if (r3 == null || !r3.A00(date)) {
            return AnonymousClass4L0.A0A(A04);
        }
        return A02(A04, r4.A04(r5, r3.A01, true));
    }

    public boolean A04(UserJid userJid) {
        PhoneUserJid A04;
        if (userJid instanceof PhoneUserJid) {
            String str = userJid.user;
            if (str == null || !str.startsWith(String.valueOf(91))) {
                return false;
            }
            return true;
        }
        if (userJid instanceof C27981fH) {
            A04 = this.A02.A02((C27981fH) userJid);
            if (A04 == null) {
                return true;
            }
        } else if (!(userJid instanceof AnonymousClass1fY) && !(userJid instanceof AnonymousClass1fX)) {
            return false;
        } else {
            A04 = C56972sr.A04(this.A00);
        }
        return A04(A04);
    }

    public C106945aQ(C56972sr r1, C57162tC r2, C56662sM r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public static SpannableString A02(String str, String str2) {
        SpannableString A0A = AnonymousClass4L0.A0A(AnonymousClass000.A0V("  ", str, AnonymousClass000.A0l(str2)));
        A0A.setSpan(new StrikethroughSpan(), str2.length() + 1, A0A.length(), 33);
        return A0A;
    }

    public static boolean A03(Locale locale) {
        String upperCase = locale.getCountry().toUpperCase();
        String country = Locale.UK.getCountry();
        String country2 = Locale.US.getCountry();
        if (upperCase.equalsIgnoreCase(country) || upperCase.equalsIgnoreCase(country2)) {
            return true;
        }
        return false;
    }
}
