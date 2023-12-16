package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.profile.SettingsRowPhotoOrInitialText;
import com.whatsapp.settings.SettingsRowIconText;
import com.whatsapp.settings.SettingsRowNoticeView;

/* renamed from: X.0z7  reason: invalid class name and case insensitive filesystem */
public abstract class C19270z7 extends LinearLayout implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public void A00() {
        if (this instanceof SettingsRowNoticeView) {
            SettingsRowNoticeView settingsRowNoticeView = (SettingsRowNoticeView) this;
            if (!settingsRowNoticeView.A02) {
                settingsRowNoticeView.A02 = true;
                settingsRowNoticeView.A04 = C64333Db.A2t(((C88864av) ((C111685iW) settingsRowNoticeView.generatedComponent())).A0K);
            }
        } else if (this instanceof SettingsRowPhotoOrInitialText) {
            SettingsRowPhotoOrInitialText settingsRowPhotoOrInitialText = (SettingsRowPhotoOrInitialText) this;
            if (!settingsRowPhotoOrInitialText.A00) {
                settingsRowPhotoOrInitialText.A00 = true;
                settingsRowPhotoOrInitialText.A04 = C64333Db.A2t(((C88864av) ((C111685iW) settingsRowPhotoOrInitialText.generatedComponent())).A0K);
            }
        } else if (!this.A01) {
            this.A01 = true;
            ((SettingsRowIconText) this).A04 = C64333Db.A2t(((C88864av) ((C111685iW) generatedComponent())).A0K);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = new C116855qy(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C19270z7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
