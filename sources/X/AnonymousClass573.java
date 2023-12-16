package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.573  reason: invalid class name */
public final class AnonymousClass573 extends WDSButton implements C182218o3 {
    public C84384Cd A00;
    public AnonymousClass67D A01;
    public AnonymousClass33U A02;
    public AnonymousClass4FS A03;
    public boolean A04;

    public AnonymousClass573(Context context) {
        super(context, (AttributeSet) null);
        A03();
        setText(R.string.f11nameremoved);
        setVariant(C142006wU.OUTLINE);
    }

    public final void setCommunityMembersManager(C84384Cd r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setCommunityNavigator(AnonymousClass67D r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setCommunityWamEventHelper(AnonymousClass33U r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setWaWorkers(AnonymousClass4FS r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final C84384Cd getCommunityMembersManager() {
        C84384Cd r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("communityMembersManager");
    }

    public final AnonymousClass67D getCommunityNavigator() {
        AnonymousClass67D r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("communityNavigator");
    }

    public final AnonymousClass33U getCommunityWamEventHelper() {
        AnonymousClass33U r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("communityWamEventHelper");
    }

    public final AnonymousClass4FS getWaWorkers() {
        AnonymousClass4FS r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waWorkers");
    }

    public List getCTAViews() {
        return C18290x4.A12(this);
    }
}
