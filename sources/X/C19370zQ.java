package X;

import android.graphics.Bitmap;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.0zQ  reason: invalid class name and case insensitive filesystem */
public class C19370zQ extends C04840Qw {
    public AnonymousClass49N A00;
    public final /* synthetic */ C33131sU A01;

    public void A09(boolean z, Object obj, Object obj2, Object obj3) {
        AnonymousClass49N r0;
        synchronized (this) {
            r0 = this.A00;
        }
        if (r0 != null) {
            r0.BRw(z, obj, obj2, obj3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19370zQ(C33131sU r1, int i) {
        super(i);
        this.A01 = r1;
    }

    public /* bridge */ /* synthetic */ int A02(Object obj, Object obj2) {
        C33131sU r0 = this.A01;
        Object obj3 = ((C41282Jq) obj2).A01;
        if (r0 instanceof C22341Mr) {
            return ((Bitmap) obj3).getByteCount() / EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        }
        return 1;
    }
}
