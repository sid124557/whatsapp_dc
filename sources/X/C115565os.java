package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5os  reason: invalid class name and case insensitive filesystem */
public class C115565os implements C1230366u {
    public String A00 = "";
    public final C54292oU A01;

    public C115565os(C54292oU r2) {
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
        if (this instanceof C983150k) {
            return "proxy";
        }
        if (this instanceof C982750g) {
            if (((C982750g) this) instanceof C982450d) {
                return "reset_network_usage";
            }
            return "network_usage";
        } else if (this instanceof C983350m) {
            C983350m r1 = (C983350m) this;
            if (r1 instanceof C982350c) {
                return "video_upload_quality";
            }
            if (r1 instanceof C982250b) {
                return "photo_upload_quality";
            }
            return "media_upload_quality_section";
        } else if (this instanceof C982850h) {
            return "media_auto_download_section";
        } else {
            if (this instanceof C982650f) {
                return "manage_storage";
            }
            if (this instanceof C983250l) {
                return "use_less_data_for_calls";
            }
            if (this instanceof C982550e) {
                return "media_download_wifi";
            }
            if (this instanceof C983050j) {
                return "media_download_roaming";
            }
            if (this instanceof C982950i) {
                return "media_download_mobile_data";
            }
            return "storage_and_data";
        }
    }

    public String BAV() {
        if (this instanceof C983150k) {
            return "storage_and_data";
        }
        if (this instanceof C982750g) {
            if (((C982750g) this) instanceof C982450d) {
                return "network_usage";
            }
            return "storage_and_data";
        } else if (this instanceof C983350m) {
            C983350m r1 = (C983350m) this;
            if ((r1 instanceof C982350c) || (r1 instanceof C982250b)) {
                return "media_upload_quality_section";
            }
            return "storage_and_data";
        } else if ((this instanceof C982850h) || (this instanceof C982650f) || (this instanceof C983250l)) {
            return "storage_and_data";
        } else {
            if ((this instanceof C982550e) || (this instanceof C983050j) || (this instanceof C982950i)) {
                return "media_auto_download_section";
            }
            return "";
        }
    }

    public String BAX() {
        return this.A00;
    }

    public String BBg() {
        if (this instanceof C983150k) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof C982750g) {
            C982750g r1 = (C982750g) this;
            boolean z = r1 instanceof C982450d;
            C54292oU r12 = r1.A01;
            if (z) {
                return C54292oU.A04(r12, R.string.f11nameremoved);
            }
            return C54292oU.A04(r12, R.string.f11nameremoved);
        } else if (this instanceof C983350m) {
            C983350m r13 = (C983350m) this;
            if (r13 instanceof C982350c) {
                return C54292oU.A04(r13.A01, R.string.f11nameremoved);
            }
            boolean z2 = r13 instanceof C982250b;
            C54292oU r14 = r13.A01;
            if (z2) {
                return C54292oU.A04(r14, R.string.f11nameremoved);
            }
            return C54292oU.A04(r14, R.string.f11nameremoved);
        } else if (this instanceof C982850h) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        } else {
            if (this instanceof C982650f) {
                return C54292oU.A04(this.A01, R.string.f11nameremoved);
            }
            if (this instanceof C983250l) {
                return C54292oU.A04(this.A01, R.string.f11nameremoved);
            }
            if (this instanceof C982550e) {
                return C54292oU.A04(this.A01, R.string.f11nameremoved);
            }
            if (this instanceof C983050j) {
                return C54292oU.A04(this.A01, R.string.f11nameremoved);
            }
            boolean z3 = this instanceof C982950i;
            C54292oU r15 = this.A01;
            if (z3) {
                return C54292oU.A04(r15, R.string.f11nameremoved);
            }
            return C54292oU.A04(r15, R.string.f11nameremoved);
        }
    }

    public int BDm() {
        return 5;
    }

    public View BEI(View view) {
        int i;
        if (this instanceof C983150k) {
            C162457s7.A0J(view, 0);
            i = R.id.user_proxy_section;
        } else if (this instanceof C982750g) {
            if (((C982750g) this) instanceof C982450d) {
                C162457s7.A0J(view, 0);
                i = R.id.reset_network_usage_row;
            } else {
                C162457s7.A0J(view, 0);
                i = R.id.setting_network_usage;
            }
        } else if (this instanceof C983350m) {
            C983350m r1 = (C983350m) this;
            if (r1 instanceof C982350c) {
                C162457s7.A0J(view, 0);
                i = R.id.setting_video_quality;
            } else if (r1 instanceof C982250b) {
                C162457s7.A0J(view, 0);
                i = R.id.setting_photo_quality;
            } else {
                C162457s7.A0J(view, 0);
                i = R.id.media_quality_section;
            }
        } else if (this instanceof C982850h) {
            C162457s7.A0J(view, 0);
            i = R.id.media_auto_download_title;
        } else if (this instanceof C982650f) {
            C162457s7.A0J(view, 0);
            i = R.id.setting_storage_usage;
        } else if (this instanceof C983250l) {
            C162457s7.A0J(view, 0);
            i = R.id.settings_calls_low_data;
        } else if (this instanceof C982550e) {
            C162457s7.A0J(view, 0);
            i = R.id.setting_autodownload_wifi;
        } else if (this instanceof C983050j) {
            C162457s7.A0J(view, 0);
            i = R.id.setting_autodownload_roaming;
        } else if (this instanceof C982950i) {
            C162457s7.A0J(view, 0);
            i = R.id.setting_autodownload_cellular;
        } else {
            C162457s7.A0J(view, 0);
            i = R.id.settings_data_usage;
        }
        return view.findViewById(i);
    }

    public /* synthetic */ boolean BIp() {
        if (this instanceof C983350m) {
            C983350m r1 = (C983350m) this;
            if ((r1 instanceof C982350c) || (r1 instanceof C982250b)) {
                return false;
            }
            return true;
        } else if (this instanceof C982850h) {
            return true;
        } else {
            return false;
        }
    }

    public /* synthetic */ boolean BJM() {
        if (this instanceof C983150k) {
            AnonymousClass1VX r1 = ((C983150k) this).A00;
            if (r1.A0X(2784) || r1.A0X(3641)) {
                return true;
            }
            return false;
        } else if (this instanceof C983350m) {
            C983350m r12 = (C983350m) this;
            if (r12 instanceof C982350c) {
                return r12.A00.A0X(662);
            }
            boolean z = r12 instanceof C982250b;
            AnonymousClass1VX r13 = r12.A00;
            boolean A0X = r13.A0X(702);
            if (z) {
                if (!A0X || r13.A0X(2653)) {
                    return false;
                }
                return true;
            } else if ((!A0X || r13.A0X(2653)) && !r13.A0X(662)) {
                return false;
            } else {
                return true;
            }
        } else if (this instanceof C983250l) {
            return C86664Kz.A1W(((C983250l) this).A00);
        }
        return true;
    }

    public /* synthetic */ boolean Bo5() {
        if (this instanceof C983250l) {
            return false;
        }
        return true;
    }

    public Drawable getIcon() {
        return AnonymousClass0RP.A00(this.A01.A00, R.drawable.ic_settings_data_usage);
    }
}
