package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5or  reason: invalid class name and case insensitive filesystem */
public class C115555or implements C1230366u {
    public String A00 = "";
    public final C54292oU A01;

    public C115555or(C54292oU r2) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
    }

    public void Bmq(String str) {
        C162457s7.A0J(str, 0);
        this.A00 = str;
    }

    public /* synthetic */ List B4E() {
        if (this instanceof AnonymousClass50U) {
            return C86604Kt.A0s(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass50Y) {
            return C86604Kt.A0s(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof C982150a) {
            return C86604Kt.A0s(this.A01, R.string.f11nameremoved);
        }
        if (!(this instanceof AnonymousClass50Z)) {
            return C72023d3.A00;
        }
        String[] strArr = new String[2];
        C54292oU r2 = this.A01;
        strArr[0] = C54292oU.A04(r2, R.string.f11nameremoved);
        return AnonymousClass0x9.A19(C54292oU.A04(r2, R.string.f11nameremoved), strArr, 1);
    }

    public String B8w() {
        if (this instanceof AnonymousClass50U) {
            return "chat_wallpaper";
        }
        if (this instanceof AnonymousClass50W) {
            return "transfer_chats";
        }
        if (this instanceof AnonymousClass50Y) {
            return "chat_theme";
        }
        if (this instanceof AnonymousClass50T) {
            return "media_visibility";
        }
        if (this instanceof C982150a) {
            return "keep_chats_archived";
        }
        if (this instanceof AnonymousClass50X) {
            return "instant_video_messages";
        }
        if (this instanceof AnonymousClass50S) {
            return "font_size";
        }
        if (this instanceof AnonymousClass50Z) {
            return "enter_is_send";
        }
        if (this instanceof AnonymousClass50R) {
            AnonymousClass50R r1 = (AnonymousClass50R) this;
            if (r1 instanceof AnonymousClass50Q) {
                return "export_chat";
            }
            if (r1 instanceof AnonymousClass50P) {
                return "delete_all_chats";
            }
            if (r1 instanceof AnonymousClass50O) {
                return "clear_all_chats";
            }
            if (r1 instanceof AnonymousClass50N) {
                return "archive_all_chats";
            }
            return "chat_history";
        } else if (this instanceof AnonymousClass50V) {
            return "chat_backup";
        } else {
            return "chat";
        }
    }

    public String BAV() {
        if ((this instanceof AnonymousClass50U) || (this instanceof AnonymousClass50W) || (this instanceof AnonymousClass50Y) || (this instanceof AnonymousClass50T) || (this instanceof C982150a) || (this instanceof AnonymousClass50X) || (this instanceof AnonymousClass50S) || (this instanceof AnonymousClass50Z)) {
            return "chat";
        }
        if (this instanceof AnonymousClass50R) {
            AnonymousClass50R r1 = (AnonymousClass50R) this;
            if ((r1 instanceof AnonymousClass50Q) || (r1 instanceof AnonymousClass50P) || (r1 instanceof AnonymousClass50O) || (r1 instanceof AnonymousClass50N)) {
                return "chat_history";
            }
            return "chat";
        } else if (!(this instanceof AnonymousClass50V)) {
            return "";
        } else {
            return "chat";
        }
    }

    public String BAX() {
        return this.A00;
    }

    public String BBg() {
        if (this instanceof AnonymousClass50U) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass50W) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass50Y) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass50T) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof C982150a) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass50X) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass50S) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass50Z) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass50R) {
            AnonymousClass50R r1 = (AnonymousClass50R) this;
            if (r1 instanceof AnonymousClass50Q) {
                return C54292oU.A04(r1.A01, R.string.f11nameremoved);
            }
            if (r1 instanceof AnonymousClass50P) {
                return C54292oU.A04(r1.A01, R.string.f11nameremoved);
            }
            if (r1 instanceof AnonymousClass50O) {
                return C54292oU.A04(r1.A01, R.string.f11nameremoved);
            }
            boolean z = r1 instanceof AnonymousClass50N;
            C54292oU r12 = r1.A01;
            if (z) {
                return C54292oU.A04(r12, R.string.f11nameremoved);
            }
            return C54292oU.A04(r12, R.string.f11nameremoved);
        }
        boolean z2 = this instanceof AnonymousClass50V;
        C54292oU r13 = this.A01;
        if (z2) {
            return C54292oU.A04(r13, R.string.f11nameremoved);
        }
        return C54292oU.A04(r13, R.string.f11nameremoved);
    }

    public int BDm() {
        return 3;
    }

    public View BEI(View view) {
        int i;
        if (this instanceof AnonymousClass50U) {
            C162457s7.A0J(view, 0);
            i = R.id.wallpaper_preference;
        } else if (this instanceof AnonymousClass50W) {
            C162457s7.A0J(view, 0);
            i = R.id.chat_transfer_preference;
        } else if (this instanceof AnonymousClass50Y) {
            C162457s7.A0J(view, 0);
            i = R.id.settings_theme;
        } else if (this instanceof AnonymousClass50T) {
            C162457s7.A0J(view, 0);
            i = R.id.media_visibility_preference;
        } else if (this instanceof C982150a) {
            C162457s7.A0J(view, 0);
            i = R.id.chat_settings_notify_new_message_switch_view;
        } else if (this instanceof AnonymousClass50X) {
            C162457s7.A0J(view, 0);
            i = R.id.instant_video_messages_preference_stub;
        } else if (this instanceof AnonymousClass50S) {
            C162457s7.A0J(view, 0);
            i = R.id.font_size_preference;
        } else if (this instanceof AnonymousClass50Z) {
            C162457s7.A0J(view, 0);
            i = R.id.enter_key_preference_switch;
        } else if (this instanceof AnonymousClass50R) {
            C162457s7.A0J(view, 0);
            i = R.id.chat_history_preference;
        } else if (this instanceof AnonymousClass50V) {
            C162457s7.A0J(view, 0);
            i = R.id.chat_backup_preference;
        } else {
            C162457s7.A0J(view, 0);
            i = R.id.settings_chat;
        }
        return view.findViewById(i);
    }

    public /* synthetic */ boolean BIp() {
        return false;
    }

    public /* synthetic */ boolean BJM() {
        C56972sr r0;
        if (this instanceof AnonymousClass50Q) {
            AnonymousClass50Q r2 = (AnonymousClass50Q) this;
            if (r2.A01.A08(C66663Mh.A0J)) {
                r0 = r2.A00;
            }
            return false;
        } else if (this instanceof AnonymousClass50W) {
            AnonymousClass50W r22 = (AnonymousClass50W) this;
            if (C107385bE.A02() && r22.A01.A0X(2870)) {
                r0 = r22.A00;
            }
            return false;
        } else if (this instanceof C982150a) {
            C982150a r1 = (C982150a) this;
            if (r1.A01.A28()) {
                r0 = r1.A00;
            }
            return false;
        } else if (this instanceof AnonymousClass50X) {
            return AnonymousClass5V9.A01(((AnonymousClass50X) this).A00);
        } else {
            if (this instanceof AnonymousClass50Z) {
                return C86664Kz.A1W(((AnonymousClass50Z) this).A00);
            }
            if (this instanceof AnonymousClass50V) {
                return C86664Kz.A1W(((AnonymousClass50V) this).A00);
            }
            return true;
        }
        if (r0.A0Y()) {
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean Bo5() {
        if ((this instanceof AnonymousClass50T) || (this instanceof C982150a) || (this instanceof AnonymousClass50X) || (this instanceof AnonymousClass50Z)) {
            return false;
        }
        return true;
    }

    public Drawable getIcon() {
        return AnonymousClass0RP.A00(this.A01.A00, R.drawable.ic_settings_chats);
    }
}
