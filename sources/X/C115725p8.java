package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5p8  reason: invalid class name and case insensitive filesystem */
public class C115725p8 implements C1230366u {
    public String A00 = "";
    public final C56972sr A01;
    public final C54292oU A02;

    public void Bmq(String str) {
        C162457s7.A0J(str, 0);
        this.A00 = str;
    }

    public /* synthetic */ List B4E() {
        return C72023d3.A00;
    }

    public String B8w() {
        if (this instanceof AnonymousClass50H) {
            return "two_fac";
        }
        if (this instanceof AnonymousClass50M) {
            return "share_autoconf_verifier";
        }
        if (this instanceof AnonymousClass50D) {
            return "security_notifications";
        }
        if (this instanceof AnonymousClass50C) {
            return "request_account_info";
        }
        if (this instanceof AnonymousClass50L) {
            return "remove_account";
        }
        if (this instanceof AnonymousClass50K) {
            return "passkeys";
        }
        if (this instanceof AnonymousClass50G) {
            return "log_out";
        }
        if (this instanceof AnonymousClass50J) {
            return "email_verification";
        }
        if (this instanceof AnonymousClass50F) {
            return "delete_account";
        }
        if (this instanceof AnonymousClass50E) {
            return "change_number";
        }
        if (this instanceof AnonymousClass50I) {
            return "add_account";
        }
        return "account";
    }

    public String BAV() {
        if ((this instanceof AnonymousClass50H) || (this instanceof AnonymousClass50M) || (this instanceof AnonymousClass50D) || (this instanceof AnonymousClass50C) || (this instanceof AnonymousClass50L) || (this instanceof AnonymousClass50K) || (this instanceof AnonymousClass50G) || (this instanceof AnonymousClass50J) || (this instanceof AnonymousClass50F) || (this instanceof AnonymousClass50E) || (this instanceof AnonymousClass50I)) {
            return "account";
        }
        return "";
    }

    public String BAX() {
        return this.A00;
    }

    public String BBg() {
        if (this instanceof AnonymousClass50H) {
            return C54292oU.A04(this.A02, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass50M) {
            return C54292oU.A04(this.A02, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass50D) {
            return C54292oU.A04(this.A02, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass50C) {
            return C54292oU.A04(this.A02, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass50L) {
            return C54292oU.A04(this.A02, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass50K) {
            return C54292oU.A04(this.A02, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass50G) {
            return C54292oU.A04(this.A02, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass50J) {
            return C54292oU.A04(this.A02, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass50F) {
            return C54292oU.A04(this.A02, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass50E) {
            return C54292oU.A04(this.A02, R.string.f11nameremoved);
        }
        boolean z = this instanceof AnonymousClass50I;
        C54292oU r1 = this.A02;
        if (z) {
            return C54292oU.A04(r1, R.string.f11nameremoved);
        }
        return C54292oU.A04(r1, R.string.f11nameremoved);
    }

    public int BDm() {
        return 2;
    }

    public View BEI(View view) {
        int i;
        if (this instanceof AnonymousClass50H) {
            C162457s7.A0J(view, 0);
            i = R.id.two_step_verification_preference;
        } else if (this instanceof AnonymousClass50M) {
            C162457s7.A0J(view, 0);
            i = R.id.settings_maac_phase_2_row_layout;
        } else if (this instanceof AnonymousClass50D) {
            C162457s7.A0J(view, 0);
            i = R.id.security_preference;
        } else if (this instanceof AnonymousClass50C) {
            C162457s7.A0J(view, 0);
            i = R.id.request_account_info_preference;
        } else if (this instanceof AnonymousClass50L) {
            C162457s7.A0J(view, 0);
            i = R.id.remove_account;
        } else if (this instanceof AnonymousClass50K) {
            C162457s7.A0J(view, 0);
            i = R.id.passkeys_preference;
        } else if (this instanceof AnonymousClass50G) {
            C162457s7.A0J(view, 0);
            i = R.id.log_out_preference;
        } else if (this instanceof AnonymousClass50J) {
            C162457s7.A0J(view, 0);
            i = R.id.email_verification_preference;
        } else if (this instanceof AnonymousClass50F) {
            C162457s7.A0J(view, 0);
            i = R.id.delete_account_preference;
        } else if (this instanceof AnonymousClass50E) {
            C162457s7.A0J(view, 0);
            i = R.id.change_number_preference;
        } else if (this instanceof AnonymousClass50I) {
            C162457s7.A0J(view, 0);
            i = R.id.add_account;
        } else {
            C162457s7.A0J(view, 0);
            boolean A0Y = this.A01.A0Y();
            i = R.id.settings_account_info;
            if (A0Y) {
                i = R.id.companion_settings_account_info;
            }
        }
        return view.findViewById(i);
    }

    public /* synthetic */ boolean BIp() {
        return false;
    }

    public /* synthetic */ boolean BJM() {
        if (this instanceof AnonymousClass50H) {
            return AnonymousClass000.A1T(this.A01.A0Y() ? 1 : 0);
        }
        if (this instanceof AnonymousClass50M) {
            AnonymousClass50M r0 = (AnonymousClass50M) this;
            return AnonymousClass000.A1S(AnonymousClass36l.A0R(r0.A00, r0.A01) ? 1 : 0);
        } else if (this instanceof AnonymousClass50L) {
            return ((AnonymousClass50L) this).A00.A06();
        } else {
            if (this instanceof AnonymousClass50K) {
                C105265Uf r1 = ((AnonymousClass50K) this).A00;
                if (C107385bE.A06()) {
                    return r1.A04.A0X(5060);
                }
                return false;
            } else if (this instanceof AnonymousClass50G) {
                return AnonymousClass000.A1S(this.A01.A0Y() ? 1 : 0);
            } else {
                if (this instanceof AnonymousClass50J) {
                    return ((AnonymousClass50J) this).A00.A00();
                }
                if (this instanceof AnonymousClass50F) {
                    return AnonymousClass000.A1T(this.A01.A0Y() ? 1 : 0);
                }
                if (this instanceof AnonymousClass50E) {
                    return AnonymousClass000.A1T(this.A01.A0Y() ? 1 : 0);
                }
                if (!(this instanceof AnonymousClass50I)) {
                    return true;
                }
                C614930z r12 = ((AnonymousClass50I) this).A00;
                if (!r12.A07() || r12.A0A.A0C() + 1 >= 2) {
                    return false;
                }
                return true;
            }
        }
    }

    public /* synthetic */ boolean Bo5() {
        return true;
    }

    public Drawable getIcon() {
        return AnonymousClass0RP.A00(this.A02.A00, R.drawable.ic_settings_account);
    }

    public C115725p8(C56972sr r2, C54292oU r3) {
        C18260x0.A0Q(r2, r3);
        this.A01 = r2;
        this.A02 = r3;
    }
}
