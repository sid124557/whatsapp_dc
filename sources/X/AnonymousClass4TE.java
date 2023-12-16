package X;

import android.view.View;
import com.whatsapp.KeyboardPopupLayout;
import java.util.List;

/* renamed from: X.4TE  reason: invalid class name */
public final class AnonymousClass4TE extends AnonymousClass0QA {
    public AnonymousClass4GP A00;
    public AnonymousClass4GP A01;
    public final View A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4TE(View view, int i, boolean z) {
        super(i);
        C162457s7.A0J(view, 1);
        this.A02 = view;
        this.A03 = z;
    }

    public C06020Vx A00(C06020Vx r2, C05820Vc r3) {
        AnonymousClass4GP r0 = this.A01;
        if (r0 != null) {
            r0.invoke();
            this.A01 = null;
        }
        return r2;
    }

    public AnonymousClass0XY A01(AnonymousClass0XY r8, List list) {
        View view = this.A02;
        if (((view instanceof KeyboardPopupLayout) && ((KeyboardPopupLayout) view).A07) || !this.A03) {
            return r8;
        }
        C05640Uh r2 = r8.A00;
        AnonymousClass0XU A0C = r2.A0C(8);
        C162457s7.A0D(A0C);
        AnonymousClass0XU A0C2 = r2.A0C(7);
        C162457s7.A0D(A0C2);
        AnonymousClass0XU A022 = AnonymousClass0XU.A02(AnonymousClass0XU.A00(A0C.A01 - A0C2.A01, A0C.A03 - A0C2.A03, A0C.A02 - A0C2.A02, A0C.A00 - A0C2.A00), AnonymousClass0XU.A04);
        C162457s7.A0D(A022);
        view.setTranslationY((float) (A022.A03 - A022.A00));
        return r8;
    }

    public void A03(C05820Vc r3) {
        View view = this.A02;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        AnonymousClass4GP r0 = this.A00;
        if (r0 != null) {
            r0.invoke();
            this.A00 = null;
        }
    }
}
