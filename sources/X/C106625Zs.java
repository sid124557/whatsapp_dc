package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;

/* renamed from: X.5Zs  reason: invalid class name and case insensitive filesystem */
public final class C106625Zs {
    public final C184988ss A00;
    public final C69263Wi A01;
    public final C620633i A02;

    public static final SpannableString A00(Context context, String str) {
        C18270x1.A14(context, str);
        SpannableString A0A = AnonymousClass4L0.A0A(AnonymousClass0x9.A0B(str));
        URLSpan[] uRLSpanArr = (URLSpan[]) A0A.getSpans(0, A0A.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                int spanStart = A0A.getSpanStart(uRLSpan);
                int spanEnd = A0A.getSpanEnd(uRLSpan);
                int spanFlags = A0A.getSpanFlags(uRLSpan);
                A0A.removeSpan(uRLSpan);
                A0A.setSpan(new AnonymousClass4N3(context, uRLSpan.getURL()), spanStart, spanEnd, spanFlags);
            }
        }
        return A0A;
    }

    public final SpannableString A02(Context context, String str, Runnable[] runnableArr, String[] strArr, String[] strArr2) {
        Context context2 = context;
        String str2 = str;
        C18270x1.A14(context2, str2);
        SpannableString A0A = AnonymousClass4L0.A0A(AnonymousClass0x9.A0B(str2));
        URLSpan[] uRLSpanArr = (URLSpan[]) A0A.getSpans(0, A0A.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            int length = uRLSpanArr.length;
            for (int i = 0; i < length; i++) {
                URLSpan uRLSpan = uRLSpanArr[i];
                if (C162457s7.A0P(strArr[i], uRLSpan.getURL())) {
                    int spanStart = A0A.getSpanStart(uRLSpan);
                    int spanEnd = A0A.getSpanEnd(uRLSpan);
                    int spanFlags = A0A.getSpanFlags(uRLSpan);
                    Runnable runnable = runnableArr[i];
                    A0A.removeSpan(uRLSpan);
                    C88944b3 r10 = new C88944b3(context2, this.A00, this.A01, this.A02, strArr2[i]);
                    r10.A02 = new C161687qF(runnable, 1);
                    A0A.setSpan(r10, spanStart, spanEnd, spanFlags);
                }
            }
        }
        return A0A;
    }

    public C106625Zs(C184988ss r1, C69263Wi r2, C620633i r3) {
        C18260x0.A0V(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public static final SpannableStringBuilder A01(Context context, Runnable runnable, String str, String str2, int i) {
        C18270x1.A14(context, str);
        C162457s7.A0J(runnable, 5);
        Spanned A0B = AnonymousClass0x9.A0B(str);
        C162457s7.A0D(A0B);
        SpannableStringBuilder A002 = C18330xA.A00(A0B);
        URLSpan[] A1b = C86624Kv.A1b(A0B);
        if (A1b != null) {
            for (URLSpan uRLSpan : A1b) {
                if (C162457s7.A0P(str2, uRLSpan.getURL())) {
                    int spanStart = A002.getSpanStart(uRLSpan);
                    int spanEnd = A002.getSpanEnd(uRLSpan);
                    int spanFlags = A002.getSpanFlags(uRLSpan);
                    A002.removeSpan(uRLSpan);
                    A002.setSpan(new C189008zq(context, runnable, i), spanStart, spanEnd, spanFlags);
                }
            }
        }
        return A002;
    }
}
