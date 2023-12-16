package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.status.playback.widget.AudioVolumeView;
import com.whatsapp.status.playback.widget.StatusPlaybackProgressView;

/* renamed from: X.5LT  reason: invalid class name */
public class AnonymousClass5LT {
    public Button A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final ViewGroup A07;
    public final ViewStub A08;
    public final FrameLayout A09;
    public final ImageView A0A;
    public final ImageView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final AudioVolumeView A0E;
    public final StatusPlaybackProgressView A0F;

    public AnonymousClass5LT(View view) {
        this.A09 = C86654Ky.A0L(view, R.id.root_view);
        this.A0F = (StatusPlaybackProgressView) C06560Yg.A02(view, R.id.playback_progress);
        this.A07 = C86644Kx.A0I(view, R.id.status_container);
        this.A0E = (AudioVolumeView) C06560Yg.A02(view, R.id.volume);
        this.A0A = AnonymousClass0x9.A0E(view, R.id.back);
        this.A0D = C18300x5.A0G(view, R.id.date);
        this.A0C = C18300x5.A0G(view, R.id.cta);
        this.A06 = C06560Yg.A02(view, R.id.title_bar);
        this.A05 = C06560Yg.A02(view, R.id.title_protection);
        this.A01 = C06560Yg.A02(view, R.id.header);
        this.A04 = C06560Yg.A02(view, R.id.status_header);
        this.A03 = C06560Yg.A02(view, R.id.menu);
        this.A02 = C06560Yg.A02(view, R.id.progress);
        this.A0B = AnonymousClass0x9.A0E(view, R.id.profile_picture);
        ViewStub viewStub = (ViewStub) C06560Yg.A02(view, R.id.action_link_button_view_stub);
        this.A08 = viewStub;
        viewStub.setVisibility(8);
    }
}
