package X;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.TypefaceSpan;
import com.whatsapp.R;

/* renamed from: X.5WW  reason: invalid class name */
public class AnonymousClass5WW {
    public static final TypefaceSpan A02 = new TypefaceSpan("monospace");
    public final C54292oU A00;
    public final C620733j A01;

    public Spanned A00(long j, long j2) {
        String string;
        Spannable[] spannableArr;
        SpannableString A0A;
        char c;
        C54292oU r0;
        int i;
        SpannableString A0A2 = AnonymousClass4L0.A0A(this.A01.A0N().format(((double) j) / 100.0d));
        if (A0A2.length() > 0) {
            A0A2.setSpan(A02, 0, A0A2.length() - 1, 33);
        }
        if (j2 < 60000) {
            A0A = AnonymousClass4L0.A0A(String.valueOf(C18290x4.A0B(j2)));
            r0 = this.A00;
            i = R.string.f11nameremoved;
        } else if (j2 < 3600000) {
            A0A = AnonymousClass4L0.A0A(String.valueOf(j2 / 60000));
            r0 = this.A00;
            i = R.string.f11nameremoved;
        } else if (j2 < 43200000) {
            SpannableString A0A3 = AnonymousClass4L0.A0A(String.valueOf(j2 / 3600000));
            A0A = AnonymousClass4L0.A0A(String.valueOf((j2 % 3600000) / 60000));
            string = C54292oU.A00(this.A00).getString(R.string.f11nameremoved);
            spannableArr = new Spannable[3];
            AnonymousClass000.A16(A0A2, A0A3, spannableArr);
            c = 2;
            spannableArr[c] = A0A;
            return C107635bd.A03(string, spannableArr);
        } else {
            string = C54292oU.A00(this.A00).getString(R.string.f11nameremoved);
            spannableArr = new Spannable[]{A0A2};
            return C107635bd.A03(string, spannableArr);
        }
        string = C54292oU.A00(r0).getString(i);
        spannableArr = new Spannable[2];
        spannableArr[0] = A0A2;
        c = 1;
        spannableArr[c] = A0A;
        return C107635bd.A03(string, spannableArr);
    }

    public AnonymousClass5WW(C54292oU r1, C620733j r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
