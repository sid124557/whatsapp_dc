package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseIntArray;
import com.whatsapp.util.Log;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.5Zt  reason: invalid class name and case insensitive filesystem */
public class C106635Zt {
    public static final SparseIntArray A03;
    public static final C06290Wz A04 = new C06290Wz(1);
    public static final Object A05 = AnonymousClass002.A0D();
    public final AnonymousClass5Q5 A00;
    public final C160177nA A01;
    public final Locale A02;

    public String A02(Object obj, int i) {
        String format;
        AnonymousClass5Q5 r1 = this.A00;
        if (r1 == null) {
            format = "translations/getQuantityString: CLDR data not loaded";
        } else {
            String A012 = r1.A01(this.A01, obj, i);
            if (A012 != null) {
                return A012;
            }
            int i2 = A03.get(i, -1);
            if (i2 != -1) {
                return A02(obj, i2);
            }
            Locale locale = Locale.US;
            Object[] A0L = AnonymousClass002.A0L();
            C18270x1.A1Q(A0L, i);
            format = String.format(locale, "CldrResources/getQuantityString error: could not find CLDR string for id=%d", A0L);
        }
        Log.e(format);
        return "";
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(45);
        A03 = sparseIntArray;
        sparseIntArray.put(2, 5);
        sparseIntArray.put(3, 5);
        sparseIntArray.put(4, 5);
        sparseIntArray.put(243, 241);
        sparseIntArray.put(238, 240);
        sparseIntArray.put(244, 242);
        sparseIntArray.put(239, 242);
        sparseIntArray.put(241, 236);
        sparseIntArray.put(240, 234);
        sparseIntArray.put(242, 237);
        sparseIntArray.put(198, 184);
        sparseIntArray.put(196, 182);
        sparseIntArray.put(200, 186);
        sparseIntArray.put(201, 187);
        sparseIntArray.put(199, 185);
        sparseIntArray.put(195, 181);
        sparseIntArray.put(197, 183);
        sparseIntArray.put(205, 191);
        sparseIntArray.put(203, 189);
        sparseIntArray.put(207, 193);
        sparseIntArray.put(208, 194);
        sparseIntArray.put(206, 192);
        sparseIntArray.put(202, 188);
        sparseIntArray.put(204, 190);
        sparseIntArray.put(261, 249);
        sparseIntArray.put(260, 248);
        sparseIntArray.put(264, 252);
        sparseIntArray.put(257, 245);
        sparseIntArray.put(265, 253);
        sparseIntArray.put(263, 251);
        sparseIntArray.put(262, 250);
        sparseIntArray.put(258, 246);
        sparseIntArray.put(268, 256);
        sparseIntArray.put(267, 255);
        sparseIntArray.put(266, 254);
        sparseIntArray.put(259, 247);
        sparseIntArray.put(296, 297);
        sparseIntArray.put(287, 288);
        sparseIntArray.put(294, 295);
        sparseIntArray.put(275, 277);
        sparseIntArray.put(279, 281);
        sparseIntArray.put(284, 286);
        sparseIntArray.put(290, 292);
        sparseIntArray.put(276, 277);
        sparseIntArray.put(280, 281);
        sparseIntArray.put(285, 286);
        sparseIntArray.put(291, 292);
    }

    public C106635Zt(Context context, Resources resources, Locale locale) {
        AnonymousClass5Q5 r1;
        C160177nA r0;
        C105015Tf r02;
        if (C162307rf.A05(locale) == null || (r1 = A00(context, resources, locale)) == null || (r02 = r1.A00) == null || r02.A02.size() == 0) {
            locale = Locale.US;
            r1 = A00(context, resources, locale);
        }
        this.A00 = r1;
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (country.isEmpty() || (r0 = (C160177nA) C160177nA.A00.get(AnonymousClass000.A0V("_", country, AnonymousClass000.A0l(language)))) == null) {
            Map map = C160177nA.A00;
            r0 = (C160177nA) map.get(language);
            if (r0 == null && (r0 = (C160177nA) map.get("root")) == null) {
                throw AnonymousClass001.A0g("No plural rule found for 'root' locale.");
            }
        }
        this.A01 = r0;
        this.A02 = locale;
    }

    public static AnonymousClass5Q5 A00(Context context, Resources resources, Locale locale) {
        String languageTag = locale.toLanguageTag();
        Object obj = A05;
        synchronized (obj) {
            C06290Wz r2 = A04;
            int A042 = r2.A04(languageTag);
            if (A042 >= 0) {
                AnonymousClass5Q5 r0 = (AnonymousClass5Q5) r2.A02[(A042 << 1) + 1];
                return r0;
            }
            AnonymousClass5Q5 A002 = C106375Ys.A00(context, resources, "cldr_strings", locale, true);
            synchronized (obj) {
                r2.put(languageTag, A002);
            }
            return A002;
        }
    }

    public static String A01(AnonymousClass5Q5 r2, int i) {
        String A002 = r2.A00(i);
        if (A002 != null) {
            return A002;
        }
        int i2 = A03.get(i, -1);
        if (i2 != -1) {
            return A01(r2, i2);
        }
        Locale locale = Locale.US;
        Object[] A0L = AnonymousClass002.A0L();
        C18270x1.A1Q(A0L, i);
        Log.e(String.format(locale, "CldrResources/getString error: could not find CLDR string for id=%d", A0L));
        return "";
    }
}
