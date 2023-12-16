package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.11l  reason: invalid class name and case insensitive filesystem */
public final class C195111l extends AnonymousClass09G {
    public C184288rY A00;
    public C105365Uq A01;
    public final AnonymousClass5UX A02;
    public final C114015mM A03;
    public final AnonymousClass4GQ A04;

    public void A0D(RecyclerView recyclerView) {
        C162457s7.A0J(recyclerView, 0);
        this.A01.A00();
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        View inflate = C18280x3.A0D(viewGroup).inflate(i, viewGroup, false);
        if (i == R.layout.f8nameremoved) {
            C162457s7.A0H(inflate);
            return new AnonymousClass1N7(inflate, this.A00, this.A01, this.A04);
        } else if (i == R.layout.f8nameremoved) {
            C162457s7.A0H(inflate);
            return new AnonymousClass1N6(inflate);
        } else {
            throw AnonymousClass001.A0e("Unknown view. Expected Participant View or Header View.");
        }
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r8, int i) {
        C197412j r82 = (C197412j) r8;
        C162457s7.A0J(r82, 0);
        Object A0K = A0K(i);
        C162457s7.A0D(A0K);
        if (r82 instanceof AnonymousClass1N7) {
            AnonymousClass1N7 r83 = (AnonymousClass1N7) r82;
            AnonymousClass1N8 r4 = (AnonymousClass1N8) A0K;
            C162457s7.A0J(r4, 0);
            C18280x3.A0G(r83.A03).setText(r4.A02);
            r83.A01.A05((ImageView) C18300x5.A0d(r83.A02), r83.A00, r4.A00, true);
            Integer num = r4.A01;
            AnonymousClass66R r0 = r83.A04;
            AnonymousClass5UY r1 = (AnonymousClass5UY) r0.getValue();
            if (num != null) {
                r1.A06(0);
                ((TextView) C18310x6.A0J(r0)).setText(num.intValue());
            } else {
                r1.A06(8);
            }
            View view = r83.A0H;
            C18290x4.A1I(view, r4, r83, 3);
            view.setEnabled(!r4.A03);
            return;
        }
        C162457s7.A0J((Object) null, 0);
        C162457s7.A0D(((AnonymousClass1N6) r82).A00.getValue());
        throw AnonymousClass001.A0g("getStringRes");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C195111l(Context context, AnonymousClass5UX r3, C114015mM r4, AnonymousClass4GQ r5) {
        super((AnonymousClass0O4) AnonymousClass11c.A00);
        C18260x0.A0S(r3, r4);
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r4.A06(context, "call-messages-bottom-sheet");
        this.A00 = new AnonymousClass3Ey(r3);
    }

    public int getItemViewType(int i) {
        if (A0K(i) instanceof AnonymousClass1N8) {
            return R.layout.f8nameremoved;
        }
        throw C73153f1.A00();
    }
}
