package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4nw  reason: invalid class name and case insensitive filesystem */
public class C93124nw extends C92684n5 {
    public C116985rC A00;
    public C106175Xx A01;
    public C53412n3 A02;
    public C179318ix A03;
    public C43642Sx A04;
    public C149867Of A05;
    public String A06 = "";
    public boolean A07;
    public boolean A08;
    public final ViewStub A09;
    public final ShimmerFrameLayout A0A;
    public final TextEmojiLabel A0B;
    public final C89644eZ A0C;
    public final C104285Qj A0D;
    public final AnonymousClass4UP A0E;
    public final WDSButton A0F;
    public final WDSButton A0G;
    public final WDSButton A0H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93124nw(Context context, AnonymousClass677 r8, C104285Qj r9, C30341mI r10) {
        super(context, r8, r10);
        C162457s7.A0J(context, 1);
        this.A0D = r9;
        Activity A002 = C111095hX.A00(context);
        C162457s7.A0K(A002, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
        C89644eZ r5 = (C89644eZ) A002;
        this.A0C = r5;
        C179318ix fmxViewModelFactory = getFmxViewModelFactory();
        AnonymousClass3ZH r4 = this.A09;
        C118045su r1 = ((AnonymousClass8GY) fmxViewModelFactory).A00;
        AnonymousClass4UP r0 = new AnonymousClass4UP((AnonymousClass7CZ) r1.A04.A09.get(), r4, C64333Db.A8y(r1.A03));
        this.A0E = r0;
        C86604Kt.A1N(r5, r0.A00, new AnonymousClass61D(this), 187);
        WDSButton wDSButton = (WDSButton) C18290x4.A0M(this, R.id.add_btn_fmx);
        this.A0F = wDSButton;
        this.A0G = (WDSButton) C18290x4.A0M(this, R.id.block_btn_fmx);
        WDSButton wDSButton2 = (WDSButton) C18290x4.A0M(this, R.id.safety_tips);
        this.A0H = wDSButton2;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C18290x4.A0M(this, R.id.shimmer);
        this.A0A = shimmerFrameLayout;
        View A022 = C06560Yg.A02(this, R.id.signals);
        C162457s7.A0K(A022, "null cannot be cast to non-null type com.whatsapp.TextEmojiLabel");
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) A022;
        this.A0B = textEmojiLabel;
        this.A09 = (ViewStub) C18290x4.A0M(this, R.id.hint_chat_attribution);
        if (r9.A07) {
            wDSButton2.setIcon((int) R.drawable.ic_safety_tip);
            wDSButton2.setSize(C141606vq.SMALL);
            wDSButton.setText(R.string.f11nameremoved);
        }
        shimmerFrameLayout.A02();
        textEmojiLabel.setVisibility(8);
        this.A06.setText("");
        C109345eT.A00(this.A04, this, 23);
        A25();
    }

    public static final void setupChatAttributionView$lambda$5$lambda$4(C179028iU r0, C93124nw r1, View view) {
        C162457s7.A0J(r1, 1);
        throw AnonymousClass001.A0g("getChatAttributionBottomSheet");
    }

    public final void setCountryPhoneInfo(C106175Xx r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setEntrypointConversionManager(C53412n3 r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setFmxChatAttributionViewUtil(C116985rC r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setFmxViewModelFactory(C179318ix r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setIntegratorManager(C43642Sx r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public final void setInteropImageLoader(C149867Of r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public final void setTrustSignals(String str) {
        C162457s7.A0J(str, 0);
        this.A06 = str;
    }

    public void A26() {
        this.A05.A08(this.A09);
    }

    public final void A27(int i, Integer num) {
        this.A0D.A01(this.A0E, num, i, 0);
    }

    public final C89644eZ getActivity() {
        return this.A0C;
    }

    public final WDSButton getAddBtn() {
        return this.A0F;
    }

    public final WDSButton getBlockBtn() {
        return this.A0G;
    }

    public final ViewStub getChatAttributionHintViewStub() {
        return this.A09;
    }

    public final C106175Xx getCountryPhoneInfo() {
        C106175Xx r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("countryPhoneInfo");
    }

    public final C53412n3 getEntrypointConversionManager() {
        C53412n3 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("entrypointConversionManager");
    }

    public final C116985rC getFmxChatAttributionViewUtil() {
        C116985rC r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("fmxChatAttributionViewUtil");
    }

    public final C179318ix getFmxViewModelFactory() {
        C179318ix r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("fmxViewModelFactory");
    }

    public final C43642Sx getIntegratorManager() {
        C43642Sx r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("integratorManager");
    }

    public final C149867Of getInteropImageLoader() {
        C149867Of r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("interopImageLoader");
    }

    public final WDSButton getSafetyTipsBtn() {
        return this.A0H;
    }

    public final ShimmerFrameLayout getShimmerLayout() {
        return this.A0A;
    }

    public final TextEmojiLabel getSignals() {
        return this.A0B;
    }

    public final String getTrustSignals() {
        return this.A06;
    }

    public final void setCardViewLogged(boolean z) {
        this.A08 = z;
    }

    public final void setContactAdded(boolean z) {
        this.A07 = z;
    }

    public int getLayout() {
        return R.layout.f8nameremoved;
    }
}
