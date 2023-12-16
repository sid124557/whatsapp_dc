package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.whatsapp.settings.SettingsRowPrivacyLinearLayout;

/* renamed from: X.6F0  reason: invalid class name */
public class AnonymousClass6F0 extends Animation {
    public final /* synthetic */ SettingsRowPrivacyLinearLayout A00;

    public AnonymousClass6F0(SettingsRowPrivacyLinearLayout settingsRowPrivacyLinearLayout) {
        this.A00 = settingsRowPrivacyLinearLayout;
    }

    public void applyTransformation(float f, Transformation transformation) {
        SettingsRowPrivacyLinearLayout settingsRowPrivacyLinearLayout = this.A00;
        settingsRowPrivacyLinearLayout.A00 = 1.0f - f;
        settingsRowPrivacyLinearLayout.invalidate();
    }
}
