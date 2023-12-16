package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.backup.google.GoogleDriveRestoreAnimationView;
import com.whatsapp.backup.google.GoogleDriveRestoreAnimationView_GeneratedInjector;

/* renamed from: X.02Z  reason: invalid class name */
public abstract class AnonymousClass02Z extends View implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public C116855qy A01() {
        return new C116855qy(this);
    }

    public final C116855qy A02() {
        C116855qy r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C116855qy A012 = A01();
        this.A00 = A012;
        return A012;
    }

    public void A03() {
        if (!this.A01) {
            this.A01 = true;
            ((GoogleDriveRestoreAnimationView_GeneratedInjector) generatedComponent()).BGS((GoogleDriveRestoreAnimationView) this);
        }
    }

    public AnonymousClass02Z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03();
    }

    public final Object generatedComponent() {
        return A02().generatedComponent();
    }

    public AnonymousClass02Z(Context context) {
        super(context);
        A03();
    }

    public AnonymousClass02Z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03();
    }
}
