package X;

import android.content.SharedPreferences;
import java.util.Map;

/* renamed from: X.3SG  reason: invalid class name */
public final class AnonymousClass3SG implements C85174Ff {
    public final C51932kc A00;
    public final C54612p0 A01;

    public void BMZ(String str) {
        C162457s7.A0J(str, 0);
        C18270x1.A0j(C18270x1.A04(this.A00.A01), "pref_avatar_art_revision", str);
    }

    public void BN6(String str) {
        SharedPreferences.Editor remove;
        AnonymousClass66R r1 = this.A00.A01;
        boolean A1W = C18280x3.A1W(C18310x6.A0F(r1), "pref_avatar_user_local_deletion");
        SharedPreferences.Editor remove2 = C18270x1.A04(r1).remove("pref_has_avatar_config").remove("pref_has_dismissed_sticker_upsell").remove("pref_avatar_profile_photo_poses");
        if (A1W) {
            remove = remove2.remove("pref_avatar_sticker_onboarding_shown");
        } else {
            remove = remove2.remove("pref_avatar_sticker_onboarding_shown").remove("pref_avatar_user_local_deletion");
        }
        C18270x1.A0g(remove.remove("pref_avatar_user_remote_deletion").remove("pref_avatar_notice_consent_accepted").remove("pref_avatar_preview_cache_url").remove("pref_avatar_art_revision").remove("pref_avatar_sticker_search_dictionary_revision").remove("pref_avatar_sticker_search_dictionary_state").remove("pref_avatar_sticker_search_dictionary_filters"), "pref_avatar_sticker_search_dictionary_country_code");
    }

    public void BN7() {
        AnonymousClass66R r2 = this.A00.A01;
        if (C18280x3.A1W(C18310x6.A0F(r2), "pref_avatar_user_local_deletion")) {
            this.A01.A01();
            C18270x1.A0n(C18310x6.A0F(r2), "pref_avatar_user_local_deletion");
        }
    }

    public void BNA(boolean z, boolean z2) {
        AnonymousClass66R r3 = this.A00.A01;
        C18270x1.A0l(C18270x1.A04(r3), "pref_has_avatar_config", true);
        C18270x1.A0j(C18270x1.A04(r3), "pref_avatar_profile_photo_poses", (String) null);
        C18270x1.A0j(C18270x1.A04(r3), "pref_avatar_preview_cache_url", (String) null);
    }

    public AnonymousClass3SG(C51932kc r1, C54612p0 r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BN8(String str) {
        if (C162457s7.A0P(str, "will_delete")) {
            C18270x1.A0l(C18270x1.A04(this.A00.A01), "pref_avatar_user_local_deletion", true);
        }
    }

    public void BN9(String str, Map map) {
        C51932kc r0;
        boolean z;
        if (C162457s7.A0P(str, "notice_screen_shown")) {
            r0 = this.A00;
            z = false;
        } else if (C162457s7.A0P(str, "user_confirmation_success")) {
            r0 = this.A00;
            z = true;
        } else {
            return;
        }
        C18270x1.A0l(C18270x1.A04(r0.A01), "pref_avatar_notice_consent_accepted", z);
    }
}
