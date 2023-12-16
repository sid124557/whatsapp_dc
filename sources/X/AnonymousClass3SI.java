package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;

/* renamed from: X.3SI  reason: invalid class name */
public final class AnonymousClass3SI implements C85174Ff {
    public boolean A00;
    public final C55862r2 A01;
    public final AnonymousClass4C1 A02;

    public void BN6(String str) {
        C162457s7.A0J(str, 0);
        if (str.equals(PublicKeyCredentialControllerUtility.JSON_KEY_USER)) {
            this.A01.A03((Boolean) null, 8);
        }
    }

    public /* synthetic */ void BMZ(String str) {
    }

    public void BN7() {
        boolean A012 = ((C49652gs) this.A02.get()).A01();
        C55862r2 r2 = this.A01;
        r2.A04((Integer) null, (String) null, 5, A012);
        if (this.A00) {
            this.A00 = false;
            r2.A03((Boolean) null, 21);
        }
    }

    public void BN9(String str, Map map) {
        C55862r2 r1;
        int i;
        String str2;
        if (str != null) {
            switch (str.hashCode()) {
                case -1147774587:
                    if (str.equals("notice_screen_shown")) {
                        this.A00 = true;
                        r1 = this.A01;
                        i = 20;
                        break;
                    }
                    break;
                case 871004653:
                    if (str.equals("user_confirmation_success")) {
                        this.A00 = false;
                        r1 = this.A01;
                        i = 23;
                        break;
                    }
                    break;
                case 1038955126:
                    str2 = "editor_navigation_failed";
                    break;
                case 1161655571:
                    str2 = "user_confirmation_failed";
                    break;
                case 1182156104:
                    if (str.equals("notice_screen_next_click")) {
                        r1 = this.A01;
                        i = 22;
                        break;
                    }
                    break;
            }
            if (str.equals(str2)) {
                this.A00 = true;
                r1 = this.A01;
                i = 24;
                r1.A03((Boolean) null, i);
                return;
            }
        }
        C18260x0.A0r("AvatarEditorLoggingEvents/onAvatarNoticeEvent received unhandled event = ", str, AnonymousClass001.A0o());
    }

    public void BNA(boolean z, boolean z2) {
        C55862r2 r2 = this.A01;
        int i = 7;
        if (z) {
            i = 3;
        }
        r2.A03(Boolean.valueOf(z2), i);
    }

    public AnonymousClass3SI(C55862r2 r1, AnonymousClass4C1 r2) {
        C18260x0.A0Q(r1, r2);
        this.A01 = r1;
        this.A02 = r2;
    }

    public void BN8(String str) {
        if (C162457s7.A0P(str, "will_delete")) {
            this.A01.A03((Boolean) null, 25);
        } else {
            C18260x0.A0r("AvatarEditorLoggingEvents/onAvatarEditorEvent received unhandled event = ", str, AnonymousClass001.A0o());
        }
    }
}
