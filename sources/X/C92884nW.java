package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.components.ViewOnceDownloadProgressView;

/* renamed from: X.4nW  reason: invalid class name and case insensitive filesystem */
public class C92884nW extends C93244oC {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public ViewGroup A03;
    public FrameLayout A04;
    public TextView A05;
    public TextView A06;
    public WaTextView A07;
    public WaTextView A08;
    public ViewOnceDownloadProgressView A09;
    public ViewOnceDownloadProgressView A0A;
    public boolean A0B;

    public void A1H() {
        A1t(false);
        A28();
    }

    public void A0v() {
        if (!this.A0B) {
            this.A0B = true;
            C88864av A0C = C87094Nz.A0C(this);
            C64333Db r2 = A0C.A0K;
            C87094Nz.A0W(r2, this);
            C87094Nz.A0X(r2, this);
            C87094Nz.A0Y(r2, this);
            C87094Nz.A0Z(r2, this);
            C87094Nz.A0a(r2, this, C87094Nz.A0D(r2));
            C116985rC A0A2 = C87094Nz.A0A(r2, this);
            C87094Nz.A0R(r2, r2.A00, this);
            C87094Nz.A0M(A0A2, r2, this, r2.A4V);
            C87094Nz.A0S(r2, A0C, this);
            C87094Nz.A0b(r2, this, C87094Nz.A0E(r2));
            C87094Nz.A0I(A0A2, r2, A0C, this, C86604Kt.A0i(r2));
            C87094Nz.A0P(A0A2, r2, this);
        }
    }

    public void A1N() {
        C30711mt r4 = (C30711mt) ((C30471mV) this.A0S);
        if (r4.A00 == 2) {
            AnonymousClass3ZH A032 = C627636p.A03(this.A1H, r4);
            if (A032 != null) {
                C19340zH A002 = AnonymousClass5V0.A00(getContext());
                A002.A0U(R.string.f11nameremoved);
                Resources resources = getResources();
                Object[] objArr = new Object[1];
                C18290x4.A1K(this.A0v, A032, objArr);
                A002.A0g(resources.getString(R.string.f11nameremoved, objArr));
                C19340zH.A06(A002);
                A002.A0i(true);
                C18280x3.A0q(A002);
                return;
            }
            return;
        }
        Context context = getContext();
        AnonymousClass2z0 r3 = r4.A1J;
        Intent A072 = C18320x8.A07();
        A072.setClassName(context.getPackageName(), "com.whatsapp.messaging.ViewOnceViewerActivity");
        C107395bF.A00(A072, r3);
        C86614Ku.A14(A072, this);
        postDelayed(new C71333bw(this, 26, r4), 220);
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, this.A0S);
        super.A1q(r2, z);
        if (z || A1W) {
            A28();
        }
    }

    public final void A28() {
        ViewOnceDownloadProgressView viewOnceDownloadProgressView;
        FrameLayout frameLayout;
        View view;
        ViewOnceDownloadProgressView viewOnceDownloadProgressView2;
        View view2;
        FrameLayout frameLayout2;
        C30711mt r7 = (C30711mt) ((C30471mV) this.A0S);
        int i = r7.A00;
        if (i != 0) {
            if (i == 1) {
                WaTextView waTextView = this.A07;
                if (waTextView != null && (viewOnceDownloadProgressView2 = this.A09) != null && (view2 = this.A00) != null && (frameLayout2 = this.A04) != null) {
                    waTextView.setText(R.string.f11nameremoved);
                    C18320x8.A11(getResources(), waTextView, R.color.f5nameremoved);
                    waTextView.A09();
                    C18300x5.A13(getContext(), waTextView, getViewStateDescription());
                    viewOnceDownloadProgressView2.A00(R.drawable.ic_ephemeral_ring, -1, R.color.f5nameremoved);
                    C86624Kv.A13(view2, frameLayout2);
                    return;
                }
                return;
            } else if (i != 2) {
                return;
            }
        }
        WaTextView waTextView2 = this.A08;
        if (waTextView2 != null && (viewOnceDownloadProgressView = this.A0A) != null && (frameLayout = this.A04) != null && (view = this.A00) != null) {
            getContext();
            waTextView2.setText(C107635bd.A01(getContext().getString(R.string.f11nameremoved)));
            String string = getContext().getString(getViewStateDescription());
            String A0F = C87094Nz.A0F(this, r7);
            C620733j r1 = this.A0M;
            String[] strArr = new String[2];
            AnonymousClass000.A16(string, A0F, strArr);
            frameLayout.setContentDescription(AnonymousClass5VS.A01(r1, strArr));
            A1i(r7);
            viewOnceDownloadProgressView.A00(R.drawable.ic_viewonce_one, R.drawable.ic_ephemeral_ring, AnonymousClass34K.A01(getContext(), R.attr.f3nameremoved));
            AnonymousClass54F.A00(frameLayout, this, 49);
            C93314oJ.A0q(frameLayout, this);
            C86624Kv.A13(frameLayout, view);
        }
    }

    public TextView getDateView() {
        if (((C30711mt) ((C30471mV) this.A0S)).A00 == 0) {
            return this.A06;
        }
        return this.A05;
    }

    public ViewGroup getDateWrapper() {
        if (((C30711mt) ((C30471mV) this.A0S)).A00 == 0) {
            return this.A03;
        }
        return this.A02;
    }

    public C30711mt getFMessage() {
        return (C30711mt) ((C30471mV) this.A0S);
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public int getViewStateDescription() {
        int i = ((C30711mt) ((C30471mV) this.A0S)).A00;
        if (i == 1 || i != 2) {
            return R.string.f11nameremoved;
        }
        return R.string.f11nameremoved;
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof C30711mt);
        super.setFMessage(r2);
    }

    public C92884nW(Context context, AnonymousClass677 r5, C30711mt r6) {
        super(context, r5, r6);
        A0v();
        if (!r6.A1J.A02) {
            this.A01 = C06560Yg.A02(this, R.id.conversation_row_root);
            FrameLayout A0L = C86654Ky.A0L(this, R.id.view_once_media_container_large);
            this.A04 = A0L;
            this.A03 = C86644Kx.A0I(A0L, R.id.date_wrapper);
            this.A06 = C18300x5.A0G(this.A04, R.id.date);
            this.A08 = AnonymousClass0x7.A0L(this, R.id.view_once_media_type_large);
            this.A0A = (ViewOnceDownloadProgressView) C06560Yg.A02(this, R.id.view_once_download_large);
            View A022 = C06560Yg.A02(this, R.id.view_once_media_container_small);
            this.A00 = A022;
            this.A05 = C18300x5.A0G(A022, R.id.date);
            this.A02 = C86644Kx.A0I(this.A00, R.id.date_wrapper);
            this.A07 = AnonymousClass0x7.A0L(this, R.id.view_once_media_type_small);
            this.A09 = (ViewOnceDownloadProgressView) C06560Yg.A02(this, R.id.view_once_download_small);
            C86604Kt.A1B(this, R.id.view_once_file_size);
            this.A04.setForeground(getInnerFrameForegroundDrawable());
            A28();
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f8nameremoved;
    }
}
