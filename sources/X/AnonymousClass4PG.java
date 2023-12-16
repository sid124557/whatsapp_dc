package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;

/* renamed from: X.4PG  reason: invalid class name */
public final class AnonymousClass4PG extends FrameLayout implements C15910sA, AnonymousClass4GJ {
    public C103745Og A00;
    public C116855qy A01;
    public boolean A02;
    public final AnonymousClass08A A03;

    public final void setViewModel(C103745Og r2) {
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

    public AnonymousClass08A getLifecycle() {
        return this.A03;
    }

    public final C103745Og getViewModel() {
        C103745Og r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C86604Kt.A0j();
    }

    public AnonymousClass4PG(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            AnonymousClass4FS A0g = C86604Kt.A0g(A002);
            this.A00 = new C103745Og(C86634Kw.A0g(A002), A002.A00.AMs(), (AnonymousClass1R1) A002.A56.get(), A0g);
        }
        this.A03 = new AnonymousClass08A(this);
        View.inflate(context, R.layout.f8nameremoved, this);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A03.A05(AnonymousClass0GC.RESUMED);
        C18300x5.A0G(this, R.id.auto_muted_text).setText(R.string.f11nameremoved);
        C18280x3.A0p(C06560Yg.A02(this, R.id.unmute_cta), this, 43);
        C18280x3.A0p(C06560Yg.A02(this, R.id.ok_cta), this, 44);
        C86604Kt.A1N(this, getViewModel().A02, new C121145zk(this), 2);
        C86604Kt.A1N(this, getViewModel().A01, new C121155zl(this), 3);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A03.A05(AnonymousClass0GC.DESTROYED);
        C103745Og viewModel = getViewModel();
        viewModel.A04.A07(viewModel.A03);
    }
}
