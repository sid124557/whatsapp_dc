package X;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.settings.SettingsRowIconText;

/* renamed from: X.2TZ  reason: invalid class name */
public class AnonymousClass2TZ {
    public final LottieAnimationView A00;
    public final LottieAnimationView A01;
    public final TextEmojiLabel A02;
    public final TextEmojiLabel A03;
    public final TextEmojiLabel A04;
    public final TextEmojiLabel A05;
    public final WaImageView A06;
    public final SettingsRowIconText A07;
    public final SettingsRowIconText A08;

    public AnonymousClass2TZ(View view) {
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) view.findViewById(R.id.verify_identity_status_title);
        this.A05 = textEmojiLabel;
        this.A04 = (TextEmojiLabel) view.findViewById(R.id.verify_identity_status_subtitle);
        this.A03 = (TextEmojiLabel) view.findViewById(R.id.verify_identity_coex_subtitle);
        textEmojiLabel.setText(R.string.f11nameremoved);
        this.A06 = (WaImageView) view.findViewById(R.id.verify_identity_tip_icon);
        this.A01 = (LottieAnimationView) view.findViewById(R.id.aiv_success_icon_animation);
        this.A00 = (LottieAnimationView) view.findViewById(R.id.aiv_spinner_animation);
        this.A08 = (SettingsRowIconText) view.findViewById(R.id.scan_qr_code);
        this.A07 = (SettingsRowIconText) view.findViewById(R.id.compare_number);
        this.A02 = (TextEmojiLabel) view.findViewById(R.id.aiv_learn_more);
    }
}
