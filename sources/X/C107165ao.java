package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.Interpolator;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5ao  reason: invalid class name and case insensitive filesystem */
public class C107165ao {
    public static final Interpolator A00 = C05030Rp.A00(0.85f, 0.0f, 0.15f, 1.0f);
    public static final Interpolator A01 = C05030Rp.A00(0.83f, 0.0f, 0.17f, 1.0f);
    public static final C148127Ha A02 = new C148127Ha(false, false);
    public static final String[] A03 = {"👍"};

    public static C117015rF A00(C117015rF r11) {
        C117015rF r2 = r11;
        String str = r11.A05;
        if (TextUtils.isEmpty(str)) {
            return r2;
        }
        C626936e.A06(str);
        if (C106825aE.A01(str)) {
            return r2;
        }
        return new C117015rF(r11.A03, r11.A04, C157857j0.A00, r11.A01, r11.A02, r11.A00);
    }

    public static String A01(Context context, C620733j r2, int i) {
        if (i > 999) {
            return context.getString(R.string.f11nameremoved);
        }
        return r2.A0M().format((long) i);
    }

    public static String A02(String str) {
        C626936e.A06(str);
        return C106655Zv.A01(C107425bI.A07(new C106655Zv(str).A00));
    }

    public static String A03(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        C626936e.A06(str);
        if (!C106825aE.A01(str)) {
            return C157857j0.A00;
        }
        return str;
    }

    public static List A04(AnonymousClass4FP r8, int i, boolean z) {
        long longValue;
        Iterator B4K = r8.B4K();
        LinkedHashMap A0r = C18320x8.A0r();
        LinkedHashMap A0r2 = C18320x8.A0r();
        while (B4K.hasNext()) {
            AnonymousClass1Hp r6 = (AnonymousClass1Hp) B4K.next();
            String str = r6.A02;
            String A022 = A02(str);
            if (z && r6.A01) {
                A0r2.put(A022, str);
            }
            Number A0p = AnonymousClass0x9.A0p(A022, A0r);
            if (A0p == null) {
                longValue = 0;
            } else {
                longValue = A0p.longValue();
            }
            AnonymousClass0x2.A1J(A022, A0r, longValue + r6.A00);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        if (A0r2.size() > 0) {
            Iterator A0q = AnonymousClass000.A0q(A0r2);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                A0s.add(A0w.getValue());
                A0r.remove(A0w.getKey());
                i--;
            }
        }
        int min = Math.min(i, A0r.size());
        ArrayList A0J = AnonymousClass002.A0J(A0r.entrySet());
        C86614Ku.A1U(A0J, 50);
        for (int i2 = 0; i2 < min; i2++) {
            A0s.add(((Map.Entry) A0J.get(i2)).getKey());
        }
        return A0s;
    }
}
