package X;

import android.animation.ValueAnimator;
import android.text.Spannable;
import android.text.style.UnderlineSpan;
import com.whatsapp.mediacomposer.doodle.textentry.TextEntryView;

/* renamed from: X.5ng  reason: invalid class name and case insensitive filesystem */
public class C114835ng implements C182688op {
    public AnonymousClass4vO A00;
    public C182688op A01;
    public final ValueAnimator A02;
    public final C114825nf A03;
    public final C149797Nx A04;
    public final int[] A05;

    public void A00(int i) {
        C149797Nx r1 = this.A04;
        if (r1.A02 != i) {
            r1.A02 = i;
            AnonymousClass4vO r2 = this.A00;
            int i2 = r1.A03.A03;
            r2.A01.setFontStyle(i);
            r2.A01.A0A(i2);
            if (r2 instanceof TextEntryView) {
                TextEntryView textEntryView = (TextEntryView) r2;
                textEntryView.A03.setTypeface(textEntryView.A01.getTypeface());
            }
            this.A03.A02 = i;
        }
    }

    public void A01(CharSequence charSequence) {
        C149797Nx r1 = this.A04;
        r1.A04 = charSequence.toString();
        r1.A00 = this.A00.A01(charSequence);
        Spannable spannable = (Spannable) charSequence;
        for (UnderlineSpan removeSpan : (UnderlineSpan[]) spannable.getSpans(0, charSequence.length(), UnderlineSpan.class)) {
            spannable.removeSpan(removeSpan);
        }
    }

    public void dismiss() {
        this.A01.dismiss();
    }

    public C114835ng(C114825nf r2, AnonymousClass4vO r3, C149797Nx r4, int[] iArr) {
        float[] A0T = AnonymousClass4L0.A0T();
        // fill-array-data instruction
        A0T[0] = 1061997773;
        A0T[1] = 1065353216;
        this.A02 = ValueAnimator.ofFloat(A0T);
        this.A03 = r2;
        this.A00 = r3;
        this.A04 = r4;
        this.A05 = iArr;
    }
}
