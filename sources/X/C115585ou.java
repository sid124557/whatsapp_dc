package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5ou  reason: invalid class name and case insensitive filesystem */
public class C115585ou implements C1230366u {
    public String A00 = "";
    public final C54292oU A01;

    public C115585ou(C54292oU r2) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
    }

    public void Bmq(String str) {
        C162457s7.A0J(str, 0);
        this.A00 = str;
    }

    public /* synthetic */ List B4E() {
        return C72023d3.A00;
    }

    public String B8w() {
        if (this instanceof AnonymousClass518) {
            return "show_reaction_notifications";
        }
        if (this instanceof AnonymousClass517) {
            return "message_popup_notifications";
        }
        if (this instanceof C984650z) {
            return "message_notifications_vibrate";
        }
        if (this instanceof C984550y) {
            return "sounds";
        }
        if (this instanceof AnonymousClass516) {
            return "message_notifications_section";
        }
        if (this instanceof C984450x) {
            return "message_notifications_light";
        }
        if (this instanceof AnonymousClass519) {
            return "message_high_priority_notifications";
        }
        if (this instanceof AnonymousClass515) {
            return "group_show_reaction_notifications";
        }
        if (this instanceof AnonymousClass514) {
            return "group_message_popup_notifications";
        }
        if (this instanceof C984350w) {
            return "group_message_notifications_vibrate";
        }
        if (this instanceof C984250v) {
            return "group_sounds";
        }
        if (this instanceof AnonymousClass513) {
            return "group_message_notifications_section";
        }
        if (this instanceof C984150u) {
            return "group_message_notifications_light";
        }
        if (this instanceof AnonymousClass512) {
            return "group_message_high_priority_notifications";
        }
        if (this instanceof AnonymousClass511) {
            return "conversation_tones";
        }
        if (this instanceof C984050t) {
            return "incoming_call_vibrate";
        }
        if (this instanceof C983950s) {
            return "incoming_call_ringtone";
        }
        if (this instanceof AnonymousClass510) {
            return "call_notifications_section";
        }
        return "notifications";
    }

    public String BAV() {
        if ((this instanceof AnonymousClass518) || (this instanceof AnonymousClass517) || (this instanceof C984650z) || (this instanceof C984550y)) {
            return "message_notifications_section";
        }
        if (this instanceof AnonymousClass516) {
            return "notifications";
        }
        if ((this instanceof C984450x) || (this instanceof AnonymousClass519)) {
            return "message_notifications_section";
        }
        if ((this instanceof AnonymousClass515) || (this instanceof AnonymousClass514) || (this instanceof C984350w) || (this instanceof C984250v)) {
            return "group_message_notifications_section";
        }
        if (this instanceof AnonymousClass513) {
            return "notifications";
        }
        if ((this instanceof C984150u) || (this instanceof AnonymousClass512)) {
            return "group_message_notifications_section";
        }
        if (this instanceof AnonymousClass511) {
            return "notifications";
        }
        if ((this instanceof C984050t) || (this instanceof C983950s)) {
            return "call_notifications_section";
        }
        if (!(this instanceof AnonymousClass510)) {
            return "";
        }
        return "notifications";
    }

    public String BAX() {
        return this.A00;
    }

    public String BBg() {
        if (this instanceof AnonymousClass518) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass517) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof C984650z) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof C984550y) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass516) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof C984450x) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass519) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass515) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass514) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof C984350w) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof C984250v) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass513) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof C984150u) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass512) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof AnonymousClass511) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof C984050t) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof C983950s) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        boolean z = this instanceof AnonymousClass510;
        C54292oU r1 = this.A01;
        if (z) {
            return C54292oU.A04(r1, R.string.f11nameremoved);
        }
        return C54292oU.A04(r1, R.string.f11nameremoved);
    }

    public int BDm() {
        return 4;
    }

    public View BEI(View view) {
        int i;
        if (this instanceof AnonymousClass518) {
            C162457s7.A0J(view, 0);
            i = R.id.reaction_notifications_setting;
        } else if (this instanceof AnonymousClass517) {
            C162457s7.A0J(view, 0);
            i = R.id.popup_notification_setting;
        } else if (this instanceof C984650z) {
            C162457s7.A0J(view, 0);
            i = R.id.vibrate_setting;
        } else if (this instanceof C984550y) {
            C162457s7.A0J(view, 0);
            i = R.id.notification_tone_setting;
        } else if (this instanceof AnonymousClass516) {
            C162457s7.A0J(view, 0);
            i = R.id.message_notifications_section_header;
        } else if (this instanceof C984450x) {
            C162457s7.A0J(view, 0);
            i = R.id.notification_light_setting;
        } else if (this instanceof AnonymousClass519) {
            C162457s7.A0J(view, 0);
            i = R.id.high_priority_notifications_setting;
        } else if (this instanceof AnonymousClass515) {
            C162457s7.A0J(view, 0);
            i = R.id.group_reaction_notifications_setting;
        } else if (this instanceof AnonymousClass514) {
            C162457s7.A0J(view, 0);
            i = R.id.group_popup_notification_setting;
        } else if (this instanceof C984350w) {
            C162457s7.A0J(view, 0);
            i = R.id.group_vibrate_setting;
        } else if (this instanceof C984250v) {
            C162457s7.A0J(view, 0);
            i = R.id.group_notification_tone_setting;
        } else if (this instanceof AnonymousClass513) {
            C162457s7.A0J(view, 0);
            i = R.id.group_message_notifications_section_header;
        } else if (this instanceof C984150u) {
            C162457s7.A0J(view, 0);
            i = R.id.group_notification_light_setting;
        } else if (this instanceof AnonymousClass512) {
            C162457s7.A0J(view, 0);
            i = R.id.group_high_priority_notifications_setting;
        } else if (this instanceof AnonymousClass511) {
            C162457s7.A0J(view, 0);
            i = R.id.conversation_sound_setting;
        } else if (this instanceof C984050t) {
            C162457s7.A0J(view, 0);
            i = R.id.call_vibrate_setting;
        } else if (this instanceof C983950s) {
            C162457s7.A0J(view, 0);
            i = R.id.call_tone_setting;
        } else if (this instanceof AnonymousClass510) {
            C162457s7.A0J(view, 0);
            i = R.id.call_notifications_section_header;
        } else {
            C162457s7.A0J(view, 0);
            i = R.id.settings_notifications;
        }
        return view.findViewById(i);
    }

    public /* synthetic */ boolean BIp() {
        if ((this instanceof AnonymousClass516) || (this instanceof AnonymousClass513) || (this instanceof AnonymousClass510)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean BJM() {
        return true;
    }

    public /* synthetic */ boolean Bo5() {
        if ((this instanceof AnonymousClass518) || (this instanceof AnonymousClass519) || (this instanceof AnonymousClass515) || (this instanceof AnonymousClass512) || (this instanceof AnonymousClass511)) {
            return false;
        }
        return true;
    }

    public Drawable getIcon() {
        return AnonymousClass0RP.A00(this.A01.A00, R.drawable.ic_settings_notification);
    }
}
