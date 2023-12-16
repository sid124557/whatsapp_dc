package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.components.ViewOnceDownloadProgressView;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.4oA  reason: invalid class name and case insensitive filesystem */
public class C93224oA extends C92994nh {
    public final ViewGroup A00;
    public final ViewGroup A01;
    public final FrameLayout A02;
    public final TextView A03;
    public final TextView A04;
    public final WaTextView A05 = AnonymousClass0x7.A0L(this, R.id.view_once_file_size);
    public final WaTextView A06 = AnonymousClass0x7.A0L(this, R.id.view_once_media_type_large);
    public final ViewOnceDownloadProgressView A07;

    public final void A2D(C30471mV r10, int i) {
        String A032;
        FrameLayout frameLayout = this.A02;
        String valueOf = String.valueOf(frameLayout.getContentDescription());
        C620733j r5 = this.A0M;
        long j = r10.A00;
        if (j <= 0) {
            A032 = "";
        } else {
            A032 = AnonymousClass35V.A03(r5, j);
        }
        String A0F = C87094Nz.A0F(this, r10);
        frameLayout.setContentDescription(AnonymousClass5VS.A01(this.A0M, i == 2 ? new String[]{valueOf, A0F} : new String[]{valueOf, A032, A0F}));
    }

    public C93224oA(Context context, AnonymousClass677 r7, C30471mV r8) {
        super(context, r7, r8);
        FrameLayout A0L = C86654Ky.A0L(this, R.id.view_once_media_container_large);
        this.A02 = A0L;
        this.A07 = (ViewOnceDownloadProgressView) C06560Yg.A02(this, R.id.view_once_download_large);
        this.A00 = C86644Kx.A0I(A0L, R.id.date_wrapper);
        this.A03 = C18300x5.A0G(A0L, R.id.date);
        View view = this.A01;
        this.A01 = C86644Kx.A0I(view, R.id.date_wrapper);
        this.A04 = C18300x5.A0G(view, R.id.date);
        A0L.setForeground(getInnerFrameForegroundDrawable());
        A29();
    }

    private void setTransitionNames(C30471mV r1) {
        C87094Nz.A0f(this, r1);
    }

    public void A1N() {
        C89654ea r1;
        C30471mV fMessage = getFMessage();
        AnonymousClass4DU r2 = (AnonymousClass4DU) fMessage;
        if (r2.BEM() == 2) {
            C624134x r22 = (C624134x) r2;
            AnonymousClass3ZH A032 = C627636p.A03(this.A1H, r22);
            if (A032 != null) {
                boolean z = r22 instanceof AnonymousClass1n3;
                int i = R.string.f11nameremoved;
                int i2 = R.string.f11nameremoved;
                if (z) {
                    i = R.string.f11nameremoved;
                    i2 = R.string.f11nameremoved;
                }
                C19340zH A002 = AnonymousClass5V0.A00(getContext());
                A002.A0U(i);
                Resources resources = getResources();
                Object[] objArr = new Object[1];
                C18290x4.A1K(this.A0v, A032, objArr);
                A002.A0g(resources.getString(i2, objArr));
                C19340zH.A06(A002);
                A002.A0i(true);
                C18280x3.A0q(A002);
            }
        } else if (this.A02 != null && !C87094Nz.A0l(this)) {
        } else {
            if (!fMessage.A21()) {
                Log.w("conversation/row/viewOnce/no file");
                if (!A27() && (r1 = (C89654ea) C86614Ku.A0A(this)) != null) {
                    this.A0T.A01(r1);
                    return;
                }
                return;
            }
            AnonymousClass5P1 r12 = new AnonymousClass5P1(getContext());
            r12.A0A = true;
            AnonymousClass5P1.A00(r12, fMessage.A1J);
            r12.A01 = 3;
            C86614Ku.A14(r12.A01(), this);
            postDelayed(new C71333bw(this, 25, fMessage), 220);
        }
    }

    public void A28() {
        super.A28();
        A1i(getFMessage());
    }

    public void A29() {
        super.A29();
        int BEM = ((AnonymousClass4DU) getFMessage()).BEM();
        if (BEM == 0) {
            this.A01.setVisibility(8);
            C30471mV fMessage = getFMessage();
            int A002 = C627636p.A00(fMessage);
            C87094Nz.A0f(this, fMessage);
            C93014nj.A00(this.A07, fMessage, A002, false);
            A2C(this.A02, A002, false);
            A2D(fMessage, A002);
            A1i(fMessage);
        } else if (BEM == 1) {
            this.A02.setVisibility(8);
            A28();
            WaTextView waTextView = this.A03;
            C18300x5.A13(C86654Ky.A0B(this, waTextView, R.string.f11nameremoved), waTextView, getMediaTypeDescriptionString());
        } else if (BEM == 2) {
            this.A01.setVisibility(8);
            C30471mV fMessage2 = getFMessage();
            C87094Nz.A0f(this, fMessage2);
            C93014nj.A00(this.A07, fMessage2, 2, false);
            A2C(this.A02, 2, false);
            A2D(fMessage2, 2);
            A1i(fMessage2);
        }
    }

    public void A2C(View view, int i, boolean z) {
        String A032;
        super.A2C(view, i, z);
        if (i == 2) {
            this.A05.setVisibility(8);
            return;
        }
        C30471mV fMessage = getFMessage();
        WaTextView waTextView = this.A05;
        C620733j r5 = this.A0M;
        long j = fMessage.A00;
        if (j <= 0) {
            A032 = "";
        } else {
            A032 = AnonymousClass35V.A03(r5, j);
        }
        waTextView.setText(A032);
        waTextView.setVisibility(0);
    }

    public TextView getDateView() {
        if (((AnonymousClass4DU) getFMessage()).BEM() == 0) {
            return this.A03;
        }
        return this.A04;
    }

    public ViewGroup getDateWrapper() {
        if (((AnonymousClass4DU) getFMessage()).BEM() == 0) {
            return this.A00;
        }
        return this.A01;
    }

    public Set getInnerFrameLayouts() {
        Set innerFrameLayouts = super.getInnerFrameLayouts();
        innerFrameLayouts.add(this.A02);
        return innerFrameLayouts;
    }
}
