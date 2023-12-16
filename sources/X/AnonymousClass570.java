package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.570  reason: invalid class name */
public final class AnonymousClass570 extends WDSButton implements C182218o3 {
    public C84384Cd A00;
    public AnonymousClass33U A01;
    public AnonymousClass4FS A02;
    public boolean A03;

    public AnonymousClass570(Context context) {
        super(context, (AttributeSet) null);
        A03();
        setVariant(C142006wU.OUTLINE);
        setText(R.string.f11nameremoved);
        setIcon((int) R.drawable.ic_action_add_person);
    }

    public final void setCommunityMembersManager(C84384Cd r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setCommunityWamEventHelper(AnonymousClass33U r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setWaWorkers(AnonymousClass4FS r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final C84384Cd getCommunityMembersManager() {
        C84384Cd r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("communityMembersManager");
    }

    public final AnonymousClass33U getCommunityWamEventHelper() {
        AnonymousClass33U r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("communityWamEventHelper");
    }

    public final AnonymousClass4FS getWaWorkers() {
        AnonymousClass4FS r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waWorkers");
    }

    public List getCTAViews() {
        return C18290x4.A12(this);
    }
}
