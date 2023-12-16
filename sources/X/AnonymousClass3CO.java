package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.3CO  reason: invalid class name */
public class AnonymousClass3CO implements C184998st {
    public View A00;
    public final AnonymousClass4Pc A01;
    public final C66663Mh A02;
    public final AnonymousClass2XU A03;

    public void BFb() {
        View view = this.A00;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public boolean Bo4() {
        int i;
        SharedPreferences.Editor A08;
        AnonymousClass2XU r3 = this.A03;
        C66663Mh r2 = this.A02;
        Context context = this.A01.getContext();
        if (r2.A08(C66663Mh.A0u) && context.getPackageManager().getLaunchIntentForPackage("com.whatsapp.w4b") == null) {
            AnonymousClass33p r4 = r3.A00;
            int A002 = C107175ap.A00(System.currentTimeMillis(), AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(r4), "biz_app_cross_sell_banner_notif_time") * 1000);
            C183538qC r32 = r4.A01;
            if (A002 < C18300x5.A0B(r32).getInt("biz_app_cross_sell_banner_expiry_days", 0) && C18300x5.A0B(r32).getInt("biz_app_cross_sell_banner_dismiss_count", 0) < 1 && C18300x5.A0B(r32).getInt("biz_app_cross_sell_banner_click_count", 0) < 1) {
                if (r4.A2P("biz_app_upsell_banner_timestamp", 86400000)) {
                    if (C18300x5.A0B(r32).getInt("biz_app_cross_sell_banner_consecutive_days", 0) >= 2) {
                        C18260x0.A0L(r4, "biz_app_cross_sell_banner_consecutive_days", 0);
                    } else {
                        if (C18300x5.A0B(r32).getInt("biz_app_cross_sell_banner_cool_off_days", 0) >= 5) {
                            A08 = C18320x8.A08(r4, "biz_app_cross_sell_banner_cool_off_days", 0);
                        } else {
                            int i2 = C18300x5.A0B(r32).getInt("biz_app_cross_sell_banner_cool_off_days", 0);
                            if (i2 <= 0 || i2 > 5) {
                                C18260x0.A0L(r4, "biz_app_cross_sell_banner_total_days", C18300x5.A0B(r32).getInt("biz_app_cross_sell_banner_total_days", 0) + 1);
                                A08 = C18320x8.A08(r4, "biz_app_cross_sell_banner_consecutive_days", C18300x5.A0B(r32).getInt("biz_app_cross_sell_banner_consecutive_days", 0) + 1);
                            }
                        }
                        A08.apply();
                        r4.A1Y("biz_app_upsell_banner_timestamp");
                    }
                    A08 = C18320x8.A08(r4, "biz_app_cross_sell_banner_cool_off_days", C18300x5.A0B(r32).getInt("biz_app_cross_sell_banner_cool_off_days", 0) + 1);
                    A08.apply();
                    r4.A1Y("biz_app_upsell_banner_timestamp");
                }
                if (C18300x5.A0B(r32).getInt("biz_app_cross_sell_banner_total_days", 0) >= 4 || ((i = C18300x5.A0B(r32).getInt("biz_app_cross_sell_banner_cool_off_days", 0)) > 0 && i <= 5)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public AnonymousClass3CO(AnonymousClass4Pc r1, C66663Mh r2, AnonymousClass2XU r3) {
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
    }

    public void BrS() {
        if (Bo4() && this.A00 == null) {
            AnonymousClass4Pc r2 = this.A01;
            View A0R = AnonymousClass001.A0R(C18280x3.A0D(r2), r2, R.layout.f8nameremoved);
            this.A00 = A0R;
            r2.addView(A0R);
        }
        View view = this.A00;
        if (view == null) {
            AnonymousClass4Pc r22 = this.A01;
            view = AnonymousClass001.A0R(C18280x3.A0D(r22), r22, R.layout.f8nameremoved);
            this.A00 = view;
        }
        TextEmojiLabel A0K = AnonymousClass0x7.A0K(view, R.id.smb_upsell_chat_banner_description);
        AnonymousClass4Pc r4 = this.A01;
        A0K.A0I(C107575bX.A00(r4.getContext(), new Object[0], R.string.f11nameremoved));
        r4.setBackgroundResource(AnonymousClass5Yj.A02(r4.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        C18320x8.A15(r4, this, 8);
        C18320x8.A15(C06560Yg.A02(view, R.id.close), this, 9);
        view.setVisibility(0);
        this.A03.A00(1);
    }
}
