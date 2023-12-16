package X;

import com.whatsapp.R;
import com.whatsapp.inappsupport.ui.SupportVideoActivity;
import com.whatsapp.videoplayback.ExoPlaybackControlView;

/* renamed from: X.3XC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3XC implements C183328pr {
    public final /* synthetic */ SupportVideoActivity A00;
    public final /* synthetic */ String A01;

    public final void BSK(String str, boolean z, String str2) {
        String str3;
        SupportVideoActivity supportVideoActivity = this.A00;
        String str4 = this.A01;
        C162457s7.A0J(str4, 1);
        ExoPlaybackControlView exoPlaybackControlView = supportVideoActivity.A07;
        if (exoPlaybackControlView == null) {
            throw C18270x1.A0S("exoPlayerControlView");
        }
        exoPlaybackControlView.setPlayControlVisibility(8);
        ExoPlaybackControlView exoPlaybackControlView2 = supportVideoActivity.A07;
        if (exoPlaybackControlView2 == null) {
            throw C18270x1.A0S("exoPlayerControlView");
        }
        exoPlaybackControlView2.A04();
        boolean A0F = supportVideoActivity.A07.A0F();
        C19340zH A002 = AnonymousClass5V0.A00(supportVideoActivity);
        if (!A0F) {
            A002.A0A(R.string.f11nameremoved);
            A002.A0R(false);
            A002.setPositiveButton(R.string.f11nameremoved, new C1891190b(supportVideoActivity, 35));
            C18300x5.A0H(A002).show();
            str3 = "NETWORK_ERROR";
        } else {
            A002.A0B(R.string.f11nameremoved);
            A002.A0A(R.string.f11nameremoved);
            A002.A0R(false);
            A002.setPositiveButton(R.string.f11nameremoved, new C1891190b(supportVideoActivity, 36));
            C18300x5.A0H(A002).show();
            str3 = "DOWNLOAD_FAILED";
        }
        C54322oX r4 = supportVideoActivity.A05;
        if (r4 != null) {
            String str5 = supportVideoActivity.A0A;
            String str6 = supportVideoActivity.A0B;
            C25441aW r1 = new C25441aW();
            r1.A01 = C18290x4.A0b();
            r1.A07 = str4;
            r1.A05 = str3;
            r1.A04 = str5;
            r1.A06 = str6;
            r4.A00.BhA(r1);
            return;
        }
        throw C18270x1.A0S("supportLogging");
    }

    public /* synthetic */ AnonymousClass3XC(SupportVideoActivity supportVideoActivity, String str) {
        this.A00 = supportVideoActivity;
        this.A01 = str;
    }
}
