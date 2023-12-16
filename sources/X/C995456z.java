package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.56z  reason: invalid class name and case insensitive filesystem */
public final class C995456z extends WDSButton {
    public AnonymousClass5R0 A00;
    public boolean A01;

    public C995456z(Context context) {
        super(context, (AttributeSet) null);
        A03();
        setVariant(C142006wU.OUTLINE);
        setText(R.string.f11nameremoved);
        setIcon((int) R.drawable.ic_invite_link);
    }

    public final void setGroupInviteClickUtils(AnonymousClass5R0 r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setupOnClick(C95814uZ r7, C89654ea r8, C95084sb r9) {
        C18260x0.A0O(r7, r8);
        setOnClickListener(new AnonymousClass549(r8, this, r9, r7, 3));
    }

    public final AnonymousClass5R0 getGroupInviteClickUtils() {
        AnonymousClass5R0 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("groupInviteClickUtils");
    }
}
