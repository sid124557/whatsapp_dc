package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.4nO  reason: invalid class name and case insensitive filesystem */
public final class C92864nO extends C93234oB {
    public AnonymousClass5UY A00;
    public boolean A01;

    public void A0v() {
        if (!this.A01) {
            this.A01 = true;
            C88864av A0C = C87094Nz.A0C(this);
            C64333Db r2 = A0C.A0K;
            C87094Nz.A0W(r2, this);
            C87094Nz.A0X(r2, this);
            C87094Nz.A0Y(r2, this);
            C87094Nz.A0Z(r2, this);
            C87094Nz.A0a(r2, this, C87094Nz.A0D(r2));
            C116985rC A0A = C87094Nz.A0A(r2, this);
            C87094Nz.A0R(r2, r2.A00, this);
            C87094Nz.A0M(A0A, r2, this, r2.A4V);
            C87094Nz.A0S(r2, A0C, this);
            C87094Nz.A0b(r2, this, C87094Nz.A0E(r2));
            C87094Nz.A0I(A0A, r2, A0C, this, C86604Kt.A0i(r2));
            C87094Nz.A0P(A0A, r2, this);
            C87094Nz.A0c(r2, this);
            C87094Nz.A0V(r2, A0C, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92864nO(Context context, C105365Uq r4, AnonymousClass677 r5, AnonymousClass5RC r6, C113895mA r7, C30721mu r8) {
        super(context, r4, r5, r6, r7, r8);
        C18260x0.A0f(context, r8, r4, r6, r7);
        A0v();
        C95884uo r1 = this.A04;
        if (r1.A0A() && !r1.A09.A0X(5884)) {
            this.A00 = AnonymousClass0x2.A0M(this, R.id.audio_transcription_view);
        }
        super.A2B(false, false);
    }
}
