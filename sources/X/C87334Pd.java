package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.info.views.ChatInfoMediaCardV2;

/* renamed from: X.4Pd  reason: invalid class name and case insensitive filesystem */
public final class C87334Pd extends FrameLayout implements AnonymousClass4GJ {
    public C1224564l A00;
    public AnonymousClass5R5 A01;
    public C1223363z A02;
    public C22411Nc A03;
    public C116855qy A04;
    public boolean A05;
    public final FrameLayout A06;
    public final C89654ea A07;
    public final ChatInfoMediaCardV2 A08;

    public final void setGroupChatInfoViewModelFactory$community_consumerBeta(C1223363z r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setMediaCardUpdateHelperFactory$community_consumerBeta(C1224564l r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A04;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final C89654ea getActivity() {
        return this.A07;
    }

    public final C1223363z getGroupChatInfoViewModelFactory$community_consumerBeta() {
        C1223363z r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("groupChatInfoViewModelFactory");
    }

    public final C1224564l getMediaCardUpdateHelperFactory$community_consumerBeta() {
        C1224564l r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("mediaCardUpdateHelperFactory");
    }

    public C87334Pd(Context context) {
        super(context);
        if (!this.A05) {
            this.A05 = true;
            C88834as r1 = ((C88864av) ((C111685iW) generatedComponent())).A0I;
            this.A00 = (C1224564l) r1.A34.get();
            this.A02 = (C1223363z) r1.A3e.get();
        }
        this.A07 = C111095hX.A05(context);
        View inflate = View.inflate(context, R.layout.f8nameremoved, this);
        C162457s7.A0K(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) inflate;
        this.A06 = frameLayout;
        this.A08 = (ChatInfoMediaCardV2) C18280x3.A0E(frameLayout, R.id.media_card_view);
        C86624Kv.A10(this, -1, -2);
        ChatInfoMediaCardV2 chatInfoMediaCardV2 = this.A08;
        chatInfoMediaCardV2.setTitleTextColor(AnonymousClass0Y8.A04(getContext(), R.color.f5nameremoved));
        chatInfoMediaCardV2.setSeeMoreColor(C86624Kv.A02(this, R.color.f5nameremoved));
    }
}
