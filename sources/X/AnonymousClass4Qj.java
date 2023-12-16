package X;

import android.content.Context;
import android.widget.LinearLayout;

/* renamed from: X.4Qj  reason: invalid class name */
public final class AnonymousClass4Qj extends LinearLayout implements C15910sA, AnonymousClass4GJ {
    public AnonymousClass4V1 A00;
    public C116855qy A01;
    public boolean A02;
    public final AnonymousClass08A A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4Qj(Context context) {
        super(context);
        C162457s7.A0J(context, 1);
        if (!this.A02) {
            this.A02 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            AnonymousClass4FS A0g = C86604Kt.A0g(A002);
            C621033m A09 = A002.AgO();
            C29431io A0g2 = C86634Kw.A0g(A002);
            C620433g A0W = C86634Kw.A0W(A002);
            this.A00 = new AnonymousClass4V1(C86614Ku.A0K(A002), A09, A0W, A0g2, (C56382rt) A002.AU4.get(), A0g, C72343dZ.A00(A002.A3R));
        }
        this.A03 = new AnonymousClass08A(this);
    }

    public final void setViewModel(AnonymousClass4V1 r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass0O9 getLifecycle() {
        return this.A03;
    }

    public final AnonymousClass4V1 getViewModel() {
        AnonymousClass4V1 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C86604Kt.A0j();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A03.A05(AnonymousClass0GC.RESUMED);
        C86624Kv.A10(this, -1, -2);
        setOrientation(1);
        C86604Kt.A1N(this, getViewModel().A0B, C1001359q.A00(this, 9), 63);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A03.A05(AnonymousClass0GC.DESTROYED);
    }
}
