package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import com.whatsapp.settings.SettingsRowPrivacyLinearLayout;

/* renamed from: X.6Cv  reason: invalid class name and case insensitive filesystem */
public class C124526Cv extends Drawable {
    public final Paint A00 = C86604Kt.A0B();
    public final /* synthetic */ SettingsRowPrivacyLinearLayout A01;

    public C124526Cv(SettingsRowPrivacyLinearLayout settingsRowPrivacyLinearLayout) {
        this.A01 = settingsRowPrivacyLinearLayout;
    }

    public void draw(Canvas canvas) {
        SettingsRowPrivacyLinearLayout settingsRowPrivacyLinearLayout = this.A01;
        if (settingsRowPrivacyLinearLayout.A00 > 0.0f) {
            int A04 = AnonymousClass0Y8.A04(settingsRowPrivacyLinearLayout.getContext(), AnonymousClass5Yj.A02(settingsRowPrivacyLinearLayout.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
            int i = (A04 & 16777215) | (((int) (((float) (A04 >> 24)) * settingsRowPrivacyLinearLayout.A00)) << 24);
            Paint paint = this.A00;
            paint.setColor(i);
            canvas.drawRect(getBounds(), paint);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
