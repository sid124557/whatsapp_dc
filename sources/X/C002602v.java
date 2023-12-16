package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.whatsapp.backup.google.GoogleDriveRestoreAnimationView;

/* renamed from: X.02v  reason: invalid class name and case insensitive filesystem */
public class C002602v extends Animation {
    public final GoogleDriveRestoreAnimationView A00;

    public void applyTransformation(float f, Transformation transformation) {
        GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView = this.A00;
        googleDriveRestoreAnimationView.A00 = f;
        googleDriveRestoreAnimationView.invalidate();
    }

    public C002602v(GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView) {
        this.A00 = googleDriveRestoreAnimationView;
    }
}
