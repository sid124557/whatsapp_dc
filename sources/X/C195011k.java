package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.11k  reason: invalid class name and case insensitive filesystem */
public final class C195011k extends AnonymousClass09G {
    public C184288rY A00;
    public C105365Uq A01;
    public final AnonymousClass5UX A02;
    public final C114015mM A03;
    public final AnonymousClass4GR A04;

    public void A0D(RecyclerView recyclerView) {
        C162457s7.A0J(recyclerView, 0);
        this.A01.A00();
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        return new C196912e(C18300x5.A0F(C18280x3.A0D(viewGroup), viewGroup, i), this.A00, this.A01, this.A04);
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r9, int i) {
        C196912e r92 = (C196912e) r9;
        C162457s7.A0J(r92, 0);
        Object A0K = A0K(i);
        C162457s7.A0D(A0K);
        C52832m7 r7 = (C52832m7) A0K;
        C162457s7.A0J(r7, 0);
        AnonymousClass66R r5 = r92.A04;
        C18280x3.A0G(r5).setText(r7.A03);
        C105365Uq r6 = r92.A01;
        AnonymousClass3ZH r3 = r7.A02;
        AnonymousClass66R r4 = r92.A02;
        r6.A05((ImageView) C18300x5.A0d(r4), r92.A00, r3, true);
        AnonymousClass66R r32 = r92.A03;
        ((CompoundButton) C18300x5.A0d(r32)).setChecked(r7.A01);
        C18290x4.A1I((View) C18300x5.A0d(r32), r7, r92, 1);
        View view = r92.A0H;
        C18290x4.A1I(view, r7, r92, 2);
        boolean z = r7.A00;
        view.setEnabled(z);
        ((View) C18300x5.A0d(r32)).setEnabled(z);
        C107215at.A05((View) C18300x5.A0d(r4), z);
        C107215at.A05((View) C18300x5.A0d(r5), z);
        C107215at.A05((View) C18300x5.A0d(r32), z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C195011k(Context context, AnonymousClass5UX r3, C114015mM r4, AnonymousClass4GR r5) {
        super((AnonymousClass0O4) C194611b.A00);
        C18260x0.A0S(r3, r4);
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r4.A06(context, "adhoc-participant-bottom-sheet");
        this.A00 = new AnonymousClass3Ey(r3);
    }

    public int getItemViewType(int i) {
        return R.layout.f8nameremoved;
    }
}
