package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.privacy.usernotice.UserNoticeModalIconView;

/* renamed from: X.1kS  reason: invalid class name */
public abstract class AnonymousClass1kS extends C89784ev {
    public AnonymousClass1t1 A00;
    public AnonymousClass4FS A01;

    public abstract int getTargetIconSize();

    public void A07(C151227Tx r6) {
        setContentDescription(r6.A04);
        AnonymousClass1t1 r0 = this.A00;
        if (r0 != null) {
            r0.A0D(true);
        }
        if (r6.A01(getContext()) == null) {
            A08(r6);
            return;
        }
        AnonymousClass1t1 r4 = new AnonymousClass1t1(r6, this);
        this.A00 = r4;
        this.A01.BkL(r4, r6.A01(getContext()));
    }

    public void A08(C151227Tx r7) {
        int i;
        if (this instanceof UserNoticeModalIconView) {
            UserNoticeModalIconView userNoticeModalIconView = (UserNoticeModalIconView) this;
            AnonymousClass0YY.A04(AnonymousClass0RP.A00(userNoticeModalIconView.getContext(), R.drawable.user_notice_modal_default_icon_background), userNoticeModalIconView);
            userNoticeModalIconView.A00.setImageResource(R.drawable.user_notice_banner_icon);
            userNoticeModalIconView.A00.setColorFilter(userNoticeModalIconView.getResources().getColor(AnonymousClass5Yj.A02(userNoticeModalIconView.A00.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved)));
            userNoticeModalIconView.A00.setVisibility(0);
            return;
        }
        if (!(r7 instanceof C137376oa)) {
            setColorFilter(getResources().getColor(AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved)));
            i = R.drawable.user_notice_banner_icon;
        } else {
            i = R.drawable.ga_banner;
        }
        setImageResource(i);
    }

    public AnonymousClass1kS(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AnonymousClass1kS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnonymousClass1kS(Context context) {
        super(context);
    }
}
