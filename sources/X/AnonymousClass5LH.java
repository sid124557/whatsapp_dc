package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;

/* renamed from: X.5LH  reason: invalid class name */
public class AnonymousClass5LH {
    public final int A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final WaImageButton A05;
    public final WaImageButton A06;
    public final WaImageView A07;
    public final AnonymousClass678 A08;
    public final C620733j A09;
    public final AnonymousClass1VX A0A;
    public final boolean A0B;

    public AnonymousClass5LH(View view, AnonymousClass678 r7, C620733j r8, AnonymousClass1VX r9, int i) {
        this.A0A = r9;
        this.A09 = r8;
        this.A00 = i;
        this.A01 = C06560Yg.A02(view, R.id.bottom_actions);
        WaImageView A0L = AnonymousClass0x9.A0L(view, R.id.switch_camera_btn);
        this.A07 = A0L;
        this.A06 = C86664Kz.A10(view, R.id.discard_btn);
        this.A05 = C86664Kz.A10(view, R.id.push_to_video_recorder_close_button);
        this.A04 = C06560Yg.A02(view, R.id.stop_btn);
        View A022 = C06560Yg.A02(view, R.id.ptv_send_btn);
        this.A03 = A022;
        A022.setScaleX(C620733j.A04(r8) ? 1.0f : -1.0f);
        View A023 = C06560Yg.A02(view, R.id.playback_time_display);
        this.A02 = A023;
        this.A08 = r7;
        boolean z = false;
        if (this.A0A.A0X(4660)) {
            if (this.A08.getNumberOfCameras() <= 1 ? false : true) {
                z = true;
            }
        }
        this.A0B = z;
        A0L.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
        A023.setVisibility(8);
        WaImageView waImageView = this.A07;
        C107335b8.A0C(waImageView.getContext(), waImageView, R.drawable.ic_flip_camera, R.color.f5nameremoved);
        C86654Ky.A13(A0L);
    }
}
