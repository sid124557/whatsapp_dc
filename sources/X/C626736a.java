package X;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.36a  reason: invalid class name and case insensitive filesystem */
public final class C626736a {
    public static final boolean A08(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (C18300x5.A0T(it).A0J <= 0) {
                return false;
            }
        }
        return true;
    }

    public static final String A02(C73263fC r1) {
        if (r1 instanceof C34521vI) {
            return "status_already_shared";
        }
        if (r1 instanceof C34531vJ) {
            return "status_already_sharing";
        }
        if (r1 instanceof C34591vP) {
            return "status_cannot_be_shared";
        }
        if (r1 instanceof C34561vM) {
            return "crosspost-text-status-burning-error";
        }
        if (r1 instanceof C34601vQ) {
            return "eligibility-purpose-encryption-validation-error";
        }
        if (r1 instanceof C34611vR) {
            return "eligibility-session-data-validation-error";
        }
        if (r1 instanceof C34551vL) {
            return "crosspost-generic-error";
        }
        if (r1 instanceof C34571vN) {
            return "eligibility-generic-error";
        }
        if (r1 instanceof C34541vK) {
            return "crosspost-linking-error";
        }
        if (r1 instanceof C34581vO) {
            return "eligibility-account-link-error";
        }
        throw C73153f1.A00();
    }

    public static final SpannableStringBuilder A00(Context context, CharSequence charSequence, int i, int i2, boolean z, boolean z2) {
        C18260x0.A0O(context, charSequence);
        SpannableStringBuilder A00 = C18330xA.A00(context.getString(R.string.f11nameremoved));
        A04(A00, charSequence, "%1$s");
        SpannableStringBuilder A002 = C18330xA.A00("");
        if (z) {
            Drawable A003 = AnonymousClass0RP.A00(context, R.drawable.ic_settings_fb);
            if (A003 != null) {
                A002 = AnonymousClass0x7.A0H(context, A003, i, i2);
            }
            return new SpannableStringBuilder();
        }
        A04(A00, A002, "%2$s");
        SpannableStringBuilder A004 = C18330xA.A00("");
        if (z2) {
            Drawable A005 = AnonymousClass0RP.A00(context, R.drawable.ic_settings_ig);
            if (A005 != null) {
                A004 = AnonymousClass0x7.A0H(context, A005, i, i2);
            }
            return new SpannableStringBuilder();
        }
        A04(A00, A004, "%3$s");
        return A00;
    }

    public static final String A01() {
        String A0Y = C18280x3.A0Y();
        C162457s7.A0D(A0Y);
        List A0O = C175728Zm.A0O(A0Y, new char[]{'-'});
        C162457s7.A0J(A0O, 0);
        ArrayList A0J = AnonymousClass002.A0J(A0O);
        A0J.add(2, "waffle");
        return C73723fy.A0A("-", A0J, (AnonymousClass4GQ) null);
    }

    public static final List A03(C55202py r6, List list, List list2) {
        String str;
        C18260x0.A0Q(list2, r6);
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0c = C73783g4.A0c(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C624134x.A0Z(A0c, it);
        }
        Map A00 = r6.A00(A0c);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            List list3 = (List) C18280x3.A0W(A00, C18300x5.A0T(it2).A1L);
            if (list3 != null && !list3.isEmpty()) {
                Iterator it3 = list3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        str = ((C53642nQ) list3.get(0)).A06;
                        break;
                    }
                    C53642nQ r1 = (C53642nQ) it3.next();
                    if (list2.contains(r1.A02)) {
                        str = r1.A06;
                        break;
                    }
                }
            } else {
                str = null;
            }
            A0s.add(str);
        }
        return A0s;
    }

    public static final void A04(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, String str) {
        Matcher matcher = Pattern.compile(Pattern.quote(str)).matcher(spannableStringBuilder);
        if (matcher.find()) {
            spannableStringBuilder.replace(matcher.start(), matcher.end(), charSequence);
        }
    }

    public static final void A05(C69263Wi r6, C29121iJ r7, C183538qC r8, String str, List list, List list2) {
        C55202py r5 = (C55202py) r8.get();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            AnonymousClass223 r3 = (AnonymousClass223) it.next();
            C162457s7.A0J(r3, 1);
            ContentValues A06 = AnonymousClass0x9.A06();
            C18270x1.A0b(A06, "state", 1);
            A06.put("crossposting_session_id", str);
            C56012rH r0 = r5.A01;
            r0.A02();
            r0.A04(r3, list, 1);
            r5.A01(A06, r3, list);
        }
        C69263Wi.A06(r6, r7, list, 37);
    }

    public static final void A06(C69263Wi r1, C29121iJ r2, C183538qC r3, List list, List list2, int i) {
        ((C55202py) r3.get()).A04(list, list2, i);
        C69263Wi.A06(r1, r2, list, 38);
    }

    public static final boolean A07(C624134x r2) {
        AnonymousClass2z0 A07 = C624134x.A07(r2);
        if (!(A07.A00 instanceof C135166kE) || !A07.A02) {
            return false;
        }
        if ((r2 instanceof C30481mW) || (r2 instanceof C31971pB) || (r2 instanceof AnonymousClass1n2) || (r2 instanceof C31961pA) || (r2 instanceof C30721mu)) {
            return true;
        }
        return false;
    }

    public static final boolean A09(Collection collection) {
        if (AnonymousClass0x7.A1T(collection)) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C108845de r2 = C18300x5.A0T(it).A0O;
            if (r2 != null && (r2.A04 || r2.A03)) {
                return true;
            }
        }
        return false;
    }
}
