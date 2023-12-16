package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5p9  reason: invalid class name and case insensitive filesystem */
public class C115735p9 implements C1230366u {
    public String A00 = "";
    public final C54292oU A01;
    public final AnonymousClass1VX A02;

    public void Bmq(String str) {
        C162457s7.A0J(str, 0);
        this.A00 = str;
    }

    public /* synthetic */ List B4E() {
        if (this instanceof AnonymousClass51O) {
            return C86604Kt.A0s(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass51N) {
            return C86604Kt.A0s(this.A01, R.string.f11nameremoved);
        }
        return C72023d3.A00;
    }

    public String B8w() {
        if (this instanceof AnonymousClass51G) {
            return "privacy_status";
        }
        if (this instanceof AnonymousClass51M) {
            return "screen_lock";
        }
        if (this instanceof AnonymousClass51K) {
            return "wcs_read_receipts";
        }
        if (this instanceof AnonymousClass51F) {
            return "wcs_profile_photo";
        }
        if ((this instanceof AnonymousClass51J) || (this instanceof AnonymousClass51I)) {
            return "advanced_privacy_relay_calls";
        }
        if (this instanceof AnonymousClass51E) {
            return "live_location";
        }
        if (this instanceof AnonymousClass51D) {
            return "wcs_last_seen";
        }
        if (this instanceof AnonymousClass51C) {
            return "privacy_groups";
        }
        if (this instanceof AnonymousClass51O) {
            return "disappearing_messages_privacy";
        }
        if (this instanceof AnonymousClass51N) {
            return "privacy_chat_lock_unlock_clear";
        }
        if (this instanceof AnonymousClass51L) {
            return "camera_effects";
        }
        if (this instanceof AnonymousClass51H) {
            return "calling_privacy";
        }
        if (this instanceof AnonymousClass51B) {
            return "privacy_blocked";
        }
        if (this instanceof AnonymousClass51A) {
            return "wcs_about_status";
        }
        return "privacy";
    }

    public String BAV() {
        if ((this instanceof AnonymousClass51G) || (this instanceof AnonymousClass51M) || (this instanceof AnonymousClass51K) || (this instanceof AnonymousClass51F) || (this instanceof AnonymousClass51J) || (this instanceof AnonymousClass51I) || (this instanceof AnonymousClass51E) || (this instanceof AnonymousClass51D) || (this instanceof AnonymousClass51C) || (this instanceof AnonymousClass51O) || (this instanceof AnonymousClass51N) || (this instanceof AnonymousClass51L) || (this instanceof AnonymousClass51H) || (this instanceof AnonymousClass51B) || (this instanceof AnonymousClass51A)) {
            return "privacy";
        }
        return "";
    }

    public String BAX() {
        return this.A00;
    }

    public String BBg() {
        if (this instanceof AnonymousClass51G) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass51M) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass51K) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass51F) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass51J) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass51I) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass51E) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass51D) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass51C) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass51O) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass51N) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass51L) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass51H) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass51B) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        boolean z = this instanceof AnonymousClass51A;
        C54292oU r1 = this.A01;
        if (z) {
            return C54292oU.A04(r1, R.string.f11nameremoved);
        }
        return C54292oU.A04(r1, R.string.f11nameremoved);
    }

    public int BDm() {
        return 11;
    }

    public View BEI(View view) {
        int i;
        if (this instanceof AnonymousClass51G) {
            C162457s7.A0J(view, 0);
            i = R.id.status_privacy_preference;
        } else if (this instanceof AnonymousClass51M) {
            C162457s7.A0J(view, 0);
            i = R.id.security_privacy_preference;
        } else if (this instanceof AnonymousClass51K) {
            C162457s7.A0J(view, 0);
            i = R.id.read_receipts_privacy_preference;
        } else if (this instanceof AnonymousClass51F) {
            C162457s7.A0J(view, 0);
            i = R.id.profile_photo_privacy_preference;
        } else if ((this instanceof AnonymousClass51J) || (this instanceof AnonymousClass51I)) {
            C162457s7.A0J(view, 0);
            i = R.id.advanced_privacy_preference;
        } else if (this instanceof AnonymousClass51E) {
            C162457s7.A0J(view, 0);
            i = R.id.live_location_privacy_preference;
        } else if (this instanceof AnonymousClass51D) {
            C162457s7.A0J(view, 0);
            i = R.id.last_seen_privacy_preference;
        } else if (this instanceof AnonymousClass51C) {
            C162457s7.A0J(view, 0);
            i = R.id.group_add_permission_privacy_preference;
        } else if (this instanceof AnonymousClass51O) {
            C162457s7.A0J(view, 0);
            i = R.id.dm_privacy_preference_container;
        } else if (this instanceof AnonymousClass51N) {
            C162457s7.A0J(view, 0);
            i = R.id.chat_lock_privacy_preference;
        } else if (this instanceof AnonymousClass51L) {
            C162457s7.A0J(view, 0);
            i = R.id.camera_effects_privacy_preference;
        } else if (this instanceof AnonymousClass51H) {
            C162457s7.A0J(view, 0);
            i = R.id.calling_privacy_preference;
        } else if (this instanceof AnonymousClass51B) {
            C162457s7.A0J(view, 0);
            i = R.id.block_list_privacy_preference;
        } else if (this instanceof AnonymousClass51A) {
            C162457s7.A0J(view, 0);
            i = R.id.about_privacy_preference;
        } else {
            C162457s7.A0J(view, 0);
            boolean A1b = C86634Kw.A1b(this.A02);
            i = R.id.privacy_preference;
            if (A1b) {
                i = R.id.action_me_tab_privacy;
            }
        }
        return view.findViewById(i);
    }

    public /* synthetic */ boolean BIp() {
        return false;
    }

    public /* synthetic */ boolean BJM() {
        AnonymousClass1VX r1;
        int i;
        if (this instanceof AnonymousClass51M) {
            return ((AnonymousClass51M) this).A00.A06();
        }
        if ((this instanceof AnonymousClass51J) || (this instanceof AnonymousClass51I)) {
            r1 = this.A02;
            i = 3436;
        } else if (this instanceof AnonymousClass51O) {
            return AnonymousClass000.A1S(((AnonymousClass51O) this).A00.A01() ? 1 : 0);
        } else {
            if (this instanceof AnonymousClass51N) {
                r1 = this.A02;
                i = 5854;
            } else if (this instanceof AnonymousClass51L) {
                return ((AnonymousClass51L) this).A00.A00();
            } else {
                if (!(this instanceof AnonymousClass51H)) {
                    return true;
                }
                r1 = this.A02;
                i = 1972;
            }
        }
        return r1.A0X(i);
    }

    public /* synthetic */ boolean Bo5() {
        if (this instanceof AnonymousClass51K) {
            return false;
        }
        return true;
    }

    public Drawable getIcon() {
        return AnonymousClass0RP.A00(this.A01.A00, R.drawable.ic_settings_privacy);
    }

    public C115735p9(C54292oU r2, AnonymousClass1VX r3) {
        C18260x0.A0Q(r3, r2);
        this.A02 = r3;
        this.A01 = r2;
    }
}
