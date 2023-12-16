package X;

import android.os.Build;
import androidx.work.OverwritingInputMerger;

/* renamed from: X.0Aw  reason: invalid class name */
public final class AnonymousClass0Aw extends C04770Qp {
    public /* bridge */ /* synthetic */ AnonymousClass0NS A01() {
        if (!this.A02 || Build.VERSION.SDK_INT < 23 || !this.A00.A0A.A00()) {
            return new C01460Ay(this);
        }
        throw AnonymousClass001.A0c("Cannot set backoff criteria on an idle mode job");
    }

    public AnonymousClass0Aw(Class cls) {
        super(cls);
        this.A00.A0F = OverwritingInputMerger.class.getName();
    }
}
