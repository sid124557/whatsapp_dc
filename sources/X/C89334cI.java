package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;

/* renamed from: X.4cI  reason: invalid class name and case insensitive filesystem */
public final class C89334cI extends ListItemWithLeftIcon {
    public C1224664m A00;
    public AnonymousClass5QY A01;
    public AnonymousClass1R1 A02;
    public boolean A03;
    public final C89644eZ A04;

    public C89334cI(Context context) {
        super(context, (AttributeSet) null);
        A03();
        this.A04 = (C89644eZ) C111095hX.A03(context, C89644eZ.class);
        C18310x6.A15(this);
        setIcon(R.drawable.vec_ic_media_visibility);
        C89364cO.A01(context, this, R.string.f11nameremoved);
    }

    public final void setChatSettingsStore$community_consumerBeta(AnonymousClass1R1 r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setMediaVisibilityInfoUpdateHelperFactory$community_consumerBeta(C1224664m r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final C89644eZ getActivity() {
        return this.A04;
    }

    public final AnonymousClass1R1 getChatSettingsStore$community_consumerBeta() {
        AnonymousClass1R1 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("chatSettingsStore");
    }

    public final C1224664m getMediaVisibilityInfoUpdateHelperFactory$community_consumerBeta() {
        C1224664m r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("mediaVisibilityInfoUpdateHelperFactory");
    }
}
