package X;

import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.gallery.views.GalleryPartialPermissionBanner;
import com.whatsapp.util.Log;

/* renamed from: X.67T  reason: invalid class name */
public class AnonymousClass67T extends ClickableSpan {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass67T(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public void onClick(View view) {
        if (this.A02 != 0) {
            AnonymousClass0x9.A1K(this.A01);
            return;
        }
        Log.d("GalleryPartialPermissionBanner/manageSettingsClickableSpan Click");
        AnonymousClass4GP r0 = ((GalleryPartialPermissionBanner) this.A01).A01;
        if (r0 != null) {
            r0.invoke();
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        if (this.A02 != 0) {
            super.updateDrawState(textPaint);
            return;
        }
        C162457s7.A0J(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setColor(C06400Xn.A00((Resources.Theme) null, ((View) this.A00).getResources(), R.color.f5nameremoved));
    }
}
