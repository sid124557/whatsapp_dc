package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.Me;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.33j  reason: invalid class name and case insensitive filesystem */
public class C620733j {
    public static final boolean A0B = AnonymousClass001.A1Y(Build.VERSION.SDK_INT, 26);
    public Context A00;
    public C102805Ki A01;
    public DateFormat A02;
    public DateFormat A03;
    public Locale A04;
    public Locale A05;
    public boolean A06;
    public final C54292oU A07;
    public final C54412og A08;
    public final Object A09 = AnonymousClass002.A0D();
    public final Set A0A = AnonymousClass002.A0K();

    public String A0G(TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0) {
            return A0B(resourceId);
        }
        return null;
    }

    public String[] A0V(int[] iArr) {
        int length = iArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = A0B(iArr[i]);
        }
        return strArr;
    }

    public static Locale A02(C620733j r0) {
        return A01(r0.A00);
    }

    public final C102805Ki A05() {
        C102805Ki r0;
        synchronized (this.A09) {
            if (this.A01 == null) {
                AnonymousClass33M A012 = AnonymousClass33M.A01("WhatsAppLocale/setDerivedFieldsUnderLock/fieldCreationTimer");
                this.A01 = new C102805Ki(this.A00, this.A04);
                A012.A07();
            }
            r0 = this.A01;
        }
        return r0;
    }

    public String A0C(int i) {
        return this.A00.getResources().getString(i);
    }

    public void A0P() {
        if (this.A06) {
            Locale.setDefault(this.A04);
            A0R();
        }
    }

    public final void A0Q() {
        synchronized (this.A09) {
            this.A01 = null;
        }
        this.A03 = null;
        this.A02 = null;
        C107505bQ.A00 = null;
        C107505bQ.A01 = null;
        C107505bQ.A02 = null;
    }

    public final void A0R() {
        Context baseContext;
        Context baseContext2;
        if (!AnonymousClass001.A0M(this.A00).locale.equals(this.A04)) {
            if (A0B) {
                Context context = this.A07.A00;
                while ((context instanceof ContextWrapper) && (baseContext2 = ((ContextWrapper) context).getBaseContext()) != null) {
                    context = baseContext2;
                }
                this.A00 = context;
                Resources resources = context.getResources();
                Configuration configuration = resources.getConfiguration();
                configuration.locale = this.A04;
                resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            } else {
                Configuration configuration2 = new Configuration();
                configuration2.setLocale(this.A04);
                Context context2 = this.A07.A00;
                while ((context2 instanceof ContextWrapper) && (baseContext = ((ContextWrapper) context2).getBaseContext()) != null) {
                    context2 = baseContext;
                }
                this.A00 = context2.createConfigurationContext(configuration2);
            }
            A0Q();
        }
    }

    public C620733j(C54292oU r3, C54412og r4) {
        Context baseContext;
        this.A07 = r3;
        this.A08 = r4;
        Context context = r3.A00;
        while ((context instanceof ContextWrapper) && (baseContext = ((ContextWrapper) context).getBaseContext()) != null) {
            context = baseContext;
        }
        this.A00 = context;
        Locale A002 = AnonymousClass75D.A00(AnonymousClass001.A0M(context));
        this.A05 = A002;
        this.A04 = A002;
        C107505bQ.A00 = null;
        C107505bQ.A01 = null;
        C107505bQ.A02 = null;
    }

    public static Uri.Builder A00(Uri.Builder builder, Me me, C620733j r4) {
        return builder.appendQueryParameter("lg", r4.A07()).appendQueryParameter("lc", r4.A06()).appendQueryParameter("cc", C106675Zy.A00(me.cc)).appendQueryParameter("platform", "android");
    }

    public static Locale A01(Context context) {
        return AnonymousClass75D.A00(AnonymousClass001.A0M(context));
    }

    public static void A03(C620733j r0, String str, Object[] objArr, int i) {
        objArr[i] = r0.A0H(str);
    }

    public static boolean A04(C620733j r0) {
        return !r0.A05().A06;
    }

    public String A06() {
        String country = A02(this).getCountry();
        if (country != null && C18280x3.A1X(country, C162307rf.A03)) {
            return country;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("verifynumber/requestcode/invalid-country '");
        A0o.append(country);
        C18260x0.A1L(A0o, "'");
        return "ZZ";
    }

    public String A07() {
        String language = A02(this).getLanguage();
        if (language != null && C18280x3.A1X(language, C162307rf.A02)) {
            return language;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("verifynumber/requestcode/invalid-language '");
        A0o.append(language);
        C18260x0.A1L(A0o, "'");
        return "zz";
    }

    public String A08() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(A07());
        A0o.append("_");
        return AnonymousClass000.A0X(A06(), A0o);
    }

    public String A09() {
        String str = "ZZ";
        if (!A06().equalsIgnoreCase(str)) {
            return A08();
        }
        String A072 = A07();
        boolean A032 = C107385bE.A03();
        HashMap hashMap = AnonymousClass79V.A04;
        if (A032) {
            str = (String) hashMap.getOrDefault(A072, str);
        } else {
            String A0e = C18320x8.A0e(A072, hashMap);
            if (A0e != null) {
                str = A0e;
            }
        }
        return AnonymousClass000.A0V("_", str, AnonymousClass000.A0l(A072));
    }

    public String A0A(int i) {
        AnonymousClass5Q5 r0 = A05().A02.A00;
        if (r0 != null) {
            return C106635Zt.A01(r0, i);
        }
        Log.e("CldrResources/getString: CLDR data not loaded");
        return "";
    }

    public String A0B(int i) {
        AnonymousClass5Q5 r2;
        String A002;
        C102805Ki A052 = A05();
        if (!A052.A07 && (r2 = A052.A03.A00) != null && i >= R.string.f11nameremoved && i <= R.string.f11nameremoved) {
            int i2 = (i - R.string.f11nameremoved) + 411;
            if (!(Integer.valueOf(i2) == null || (A002 = r2.A00(i2)) == null)) {
                return A002;
            }
        }
        return this.A00.getResources().getString(i);
    }

    public String A0D(int i, Object... objArr) {
        return String.format(A02(this), A0A(i), objArr);
    }

    public String A0E(int i, Object... objArr) {
        return String.format(A02(this), A0B(i), objArr);
    }

    public String A0F(long j, int i) {
        String A012;
        C102805Ki A052 = A05();
        if (A052.A07) {
            int i2 = 2;
            if (j == 1) {
                i2 = 1;
            }
            return this.A00.getResources().getQuantityString(i, i2);
        }
        C106375Ys r4 = A052.A03;
        Long valueOf = Long.valueOf(j);
        AnonymousClass5Q5 r2 = r4.A00;
        if (r2 != null && i >= R.plurals.f9nameremoved && i <= R.plurals.f9nameremoved) {
            int i3 = i - R.plurals.f9nameremoved;
            if (!(Integer.valueOf(i3) == null || (A012 = r2.A01(r4.A01, valueOf, i3)) == null)) {
                return A012;
            }
        }
        return this.A00.getResources().getQuantityString(i, (int) j);
    }

    public String A0H(String str) {
        AnonymousClass0XH r1 = A05().A01;
        C15770ru r0 = r1.A00;
        if (str == null) {
            return null;
        }
        return r1.A03(r0, str).toString();
    }

    public String A0I(String str) {
        AnonymousClass0XH r1 = A05().A01;
        C15770ru r0 = AnonymousClass0K7.A04;
        if (str == null) {
            return null;
        }
        return r1.A03(r0, str).toString();
    }

    public String A0J(String str, Object[] objArr, int i) {
        String str2;
        Locale A022 = A02(this);
        C102805Ki A052 = A05();
        int i2 = 1;
        if (A052.A07) {
            if (!str.equals("1")) {
                i2 = 2;
            }
            str2 = this.A00.getResources().getQuantityString(i, i2);
        } else {
            C106375Ys r3 = A052.A03;
            AnonymousClass5Q5 r2 = r3.A00;
            str2 = null;
            if (r2 != null) {
                int i3 = i - R.plurals.f9nameremoved;
                if (Integer.valueOf(i3) != null) {
                    str2 = r2.A01(r3.A01, str, i3);
                }
            }
            if (str2 == null) {
                try {
                    i2 = (int) Double.parseDouble(str);
                } catch (NumberFormatException unused) {
                }
                str2 = this.A00.getResources().getQuantityString(i, i2);
            }
        }
        return String.format(A022, str2, objArr);
    }

    public String A0K(Object[] objArr, int i, long j) {
        return String.format(A02(this), A05().A02.A02(Long.valueOf(j), i), objArr);
    }

    public String A0L(Object[] objArr, int i, long j) {
        return String.format(A02(this), A0F(j, i), objArr);
    }

    public NumberFormat A0M() {
        return (NumberFormat) A05().A04.clone();
    }

    public NumberFormat A0N() {
        return (NumberFormat) A05().A05.clone();
    }

    public Locale A0O() {
        return A02(this);
    }

    public void A0S(String str) {
        String str2;
        Locale locale;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("whatsapplocale/saveandapplylanguage/language to save: ");
        if (TextUtils.isEmpty(str)) {
            str2 = "device default";
        } else {
            str2 = str;
        }
        C18260x0.A1L(A0o, str2);
        if (TextUtils.isEmpty(str) || this.A05.toLanguageTag().equals(str)) {
            C18270x1.A0g(C54412og.A00(this.A08), "forced_language");
            this.A06 = false;
            locale = this.A05;
        } else {
            C18270x1.A0j(C54412og.A00(this.A08), "forced_language", str);
            this.A06 = true;
            locale = Locale.forLanguageTag(str);
        }
        this.A04 = locale;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("whatsapplocale/saveandapplylanguage/setting language ");
        C18260x0.A1L(A0o2, locale.getDisplayLanguage(Locale.US));
        Locale.setDefault(this.A04);
        A0R();
        for (C182358oH BVk : this.A0A) {
            BVk.BVk();
        }
    }

    public boolean A0T() {
        return A04(this);
    }

    public boolean A0U() {
        return A05().A06;
    }
}
