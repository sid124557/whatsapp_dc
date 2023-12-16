package X;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* renamed from: X.5nq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C114935nq implements C182748ov {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C95814uZ A02;
    public final /* synthetic */ C106195Xz A03;
    public final /* synthetic */ boolean A04;

    public final void BZw(SpannableStringBuilder spannableStringBuilder, AnonymousClass3ZM r19, int i, int i2) {
        C106195Xz r2 = this.A03;
        Context context = this.A01;
        int i3 = this.A00;
        C95814uZ r14 = this.A02;
        boolean z = this.A04;
        C56972sr r8 = r2.A00;
        C56982ss r11 = r2.A07;
        C183538qC r15 = r2.A09;
        int i4 = i2;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        spannableStringBuilder2.setSpan(new C22101En(context, r8, r2.A02, r2.A03, r11, r2.A08, r19, r14, r15, i3), i, i4, 33);
        if (z) {
            context.getApplicationContext();
            spannableStringBuilder2.setSpan(new AnonymousClass4N1(), i + 1, i4, 33);
        }
    }

    public /* synthetic */ C114935nq(Context context, C95814uZ r2, C106195Xz r3, int i, boolean z) {
        this.A03 = r3;
        this.A01 = context;
        this.A00 = i;
        this.A02 = r2;
        this.A04 = z;
    }
}
