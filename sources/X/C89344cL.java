package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.community.communityInfo.viewModels.CAGInfoChatLockViewModel;

/* renamed from: X.4cL  reason: invalid class name and case insensitive filesystem */
public final class C89344cL extends ListItemWithLeftIcon {
    public C1224464k A00;
    public AnonymousClass5XG A01;
    public AnonymousClass48D A02;
    public boolean A03;
    public final C89654ea A04;
    public final AnonymousClass66R A05 = C154517dI.A01(new C119305wl(this));

    public C89344cL(Context context) {
        super(context, (AttributeSet) null);
        A03();
        this.A04 = C111095hX.A05(context);
        setIcon(R.drawable.ic_chat_lock);
        C89364cO.A01(context, this, R.string.f11nameremoved);
        setDescription((int) R.string.f11nameremoved);
        C18310x6.A15(this);
    }

    public final void setChatLockInfoViewUpdateHelperFactory$community_consumerBeta(C1224464k r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setParticipantsViewModelFactory$community_consumerBeta(AnonymousClass48D r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    private final CAGInfoChatLockViewModel getCagInfoChatLockViewModel() {
        return (CAGInfoChatLockViewModel) this.A05.getValue();
    }

    public final C89654ea getActivity() {
        return this.A04;
    }

    public final C1224464k getChatLockInfoViewUpdateHelperFactory$community_consumerBeta() {
        C1224464k r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("chatLockInfoViewUpdateHelperFactory");
    }

    public final AnonymousClass48D getParticipantsViewModelFactory$community_consumerBeta() {
        AnonymousClass48D r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("participantsViewModelFactory");
    }

    public final void A08(C27991fJ r7) {
        C1224464k chatLockInfoViewUpdateHelperFactory$community_consumerBeta = getChatLockInfoViewUpdateHelperFactory$community_consumerBeta();
        C89654ea r4 = this.A04;
        AnonymousClass5XG B0I = chatLockInfoViewUpdateHelperFactory$community_consumerBeta.B0I(r4, this, r7);
        this.A01 = B0I;
        B0I.A00();
        AnonymousClass66R A012 = C154517dI.A01(new C120715z2(this, r7));
        CAGInfoChatLockViewModel cagInfoChatLockViewModel = getCagInfoChatLockViewModel();
        AnonymousClass10x r2 = (AnonymousClass10x) A012.getValue();
        C162457s7.A0J(r2, 1);
        cagInfoChatLockViewModel.A01 = r7;
        cagInfoChatLockViewModel.A00 = r2;
        cagInfoChatLockViewModel.A03.A06(cagInfoChatLockViewModel.A04.getValue());
        AnonymousClass6C6.A03(r2.A0H, cagInfoChatLockViewModel.A02, new C1214260m(cagInfoChatLockViewModel), 135);
        AnonymousClass6C6.A02(r4, getCagInfoChatLockViewModel().A02, new C1214360n(this), 136);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CAGInfoChatLockViewModel cagInfoChatLockViewModel = getCagInfoChatLockViewModel();
        AnonymousClass10x r0 = cagInfoChatLockViewModel.A00;
        if (r0 != null) {
            cagInfoChatLockViewModel.A02.A0I(r0.A0H);
        }
        cagInfoChatLockViewModel.A03.A07(cagInfoChatLockViewModel.A04.getValue());
    }
}
