package X;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.Pair;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.5a2  reason: invalid class name and case insensitive filesystem */
public class C106715a2 {
    public final Context A00;
    public final C69263Wi A01;
    public final C85244Fm A02;
    public final AnonymousClass5O2 A03;
    public final C620633i A04;
    public final AnonymousClass33p A05;
    public final C114635nM A06;
    public final C106685Zz A07;
    public final C101775Gb A08;
    public final C1907099n A09;
    public final AnonymousClass9U4 A0A;
    public final C106625Zs A0B;

    public SpannableString A04(Context context, String str, Runnable[] runnableArr, String[] strArr, String[] strArr2) {
        Context context2 = context;
        C106625Zs r0 = this.A0B;
        if (context == null) {
            context2 = this.A00;
        }
        return r0.A02(context2, str, runnableArr, strArr, strArr2);
    }

    public SpannableString A03(Context context, String str) {
        if (context == null) {
            context = this.A00;
        }
        return C106625Zs.A00(context, str);
    }

    public SpannableStringBuilder A06(Context context, Runnable runnable, String str, String str2, int i) {
        if (context == null) {
            context = this.A00;
        }
        return C106625Zs.A01(context, runnable, str, str2, i);
    }

    public void A07(Context context, Spannable spannable) {
        Context context2;
        try {
            Linkify.addLinks(spannable, 10);
            this.A07.A06(spannable);
            A02(spannable, this.A05.A0Z());
            AnonymousClass9U4 r1 = this.A0A;
            C1907099n r0 = this.A09;
            A00(spannable, r0, r1);
            A01(spannable, r0, r1);
        } catch (Exception unused) {
        }
        List<URLSpan> A0C = C107635bd.A0C(spannable);
        if (A0C != null && !A0C.isEmpty()) {
            for (URLSpan uRLSpan : A0C) {
                String url = uRLSpan.getURL();
                if (context != null) {
                    context2 = context;
                } else {
                    context2 = this.A00;
                }
                spannable.setSpan(new C88944b3(context2, this.A02, this.A01, this.A04, url), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), spannable.getSpanFlags(uRLSpan));
            }
            for (Object removeSpan : A0C) {
                spannable.removeSpan(removeSpan);
            }
        }
    }

    public C106715a2(C69263Wi r2, C85244Fm r3, AnonymousClass5O2 r4, C620633i r5, C54292oU r6, AnonymousClass33p r7, C114635nM r8, C106685Zz r9, C101775Gb r10, C1907099n r11, AnonymousClass9U4 r12, C106625Zs r13) {
        this.A00 = r6.A00;
        this.A01 = r2;
        this.A07 = r9;
        this.A02 = r3;
        this.A06 = r8;
        this.A03 = r4;
        this.A0B = r13;
        this.A04 = r5;
        this.A0A = r12;
        this.A05 = r7;
        this.A08 = r10;
        this.A09 = r11;
    }

    public static void A00(Spannable spannable, C1907099n r6, AnonymousClass9U4 r7) {
        Pattern BAw;
        if (r6.A02() && (BAw = r7.A0G().BAw()) != null) {
            Matcher matcher = BAw.matcher(spannable);
            while (matcher.find()) {
                Pair A002 = C106335Yo.A00(C18290x4.A0K(Integer.valueOf(matcher.start()), matcher.end()), C106335Yo.A01, spannable);
                int A032 = C18280x3.A03(A002);
                int A033 = C18290x4.A03(A002);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("wapay://pay/");
                C86644Kx.A0t(spannable, AnonymousClass000.A0R(spannable.subSequence(A032, A033), A0o), A032, A033);
            }
        }
    }

    public static void A01(Spannable spannable, C1907099n r5, AnonymousClass9U4 r6) {
        Pattern BAz;
        if (r5.A02() && (BAz = r6.A0G().BAz()) != null) {
            Matcher matcher = BAz.matcher(spannable);
            while (matcher.find()) {
                Pair A002 = C106335Yo.A00(C18290x4.A0K(Integer.valueOf(matcher.start()), matcher.end()), C106335Yo.A01, spannable);
                int A032 = C18280x3.A03(A002);
                int A033 = C18290x4.A03(A002);
                C86644Kx.A0t(spannable, spannable.subSequence(A032, A033).toString(), A032, A033);
            }
        }
    }

    public static void A02(Spannable spannable, String str) {
        C162167rN A002 = C162167rN.A00();
        Iterator it = new C172518Lm(C142756xi.A04, A002, spannable, A002.A0G(Integer.parseInt(str))).iterator();
        while (it.hasNext()) {
            AnonymousClass5S2 r0 = (AnonymousClass5S2) it.next();
            int i = r0.A00;
            Pair A0K = C18290x4.A0K(Integer.valueOf(i), i + r0.A02.length());
            if (!C106335Yo.A01(A0K, spannable)) {
                A0K = C106335Yo.A00(A0K, C106335Yo.A02, spannable);
                if (!C106335Yo.A01(A0K, spannable)) {
                }
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("tel:");
            spannable.setSpan(new URLSpan(AnonymousClass000.A0R(spannable.subSequence(C18280x3.A03(A0K), C18290x4.A03(A0K)), A0o)), C18280x3.A03(A0K), C18290x4.A03(A0K), 33);
        }
    }

    public SpannableStringBuilder A05(Context context, Runnable runnable, String str, String str2) {
        return A06(context, runnable, str, str2, AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved));
    }
}
