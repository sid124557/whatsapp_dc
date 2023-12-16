package X;

import android.graphics.Rect;
import android.view.View;
import com.whatsapp.AbstractAppShellDelegate;
import com.whatsapp.R;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.934  reason: invalid class name */
public class AnonymousClass934 implements AnonymousClass4C1 {
    public Object A00;
    public final int A01;

    public AnonymousClass934(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object get() {
        float f;
        AnonymousClass8P2 r0;
        switch (this.A01) {
            case 0:
                return ((AbstractAppShellDelegate) this.A00).lambda$onCreate$4();
            case 1:
                return ((AnonymousClass4Pc) this.A00).A0A;
            case 2:
                return Boolean.valueOf(((C104405Qv) this.A00).A04);
            case 4:
                return Float.valueOf(AnonymousClass8P2.A00(((C133316h8) this.A00).A0D) * 0.55f);
            case 5:
                C133316h8 r1 = (C133316h8) this.A00;
                f = AnonymousClass8P2.A00(r1.A0I);
                r0 = r1.A0N;
                break;
            case 6:
                C133316h8 r2 = (C133316h8) this.A00;
                return Float.valueOf(C86664Kz.A01(r2.A02, R.dimen.f6nameremoved) - ((float) ((Rect) r2.A0N.get()).top));
            case 8:
                return Float.valueOf(AnonymousClass8P2.A00(((C133316h8) this.A00).A0D) * 0.45f);
            case 9:
                C133316h8 r12 = (C133316h8) this.A00;
                f = AnonymousClass8P2.A00(r12.A0G);
                r0 = r12.A0M;
                break;
            case 10:
                C133316h8 r22 = (C133316h8) this.A00;
                return Float.valueOf(C86664Kz.A01(r22.A02, R.dimen.f6nameremoved) - ((float) ((Rect) r22.A0M.get()).top));
            case 11:
                return Float.valueOf(((float) ((C133306h7) this.A00).A02) * 0.55f);
            case 12:
                return Float.valueOf(((float) ((C133306h7) this.A00).A02) * 0.45f);
            case 13:
                View view = (View) this.A00;
                return new Rect(view.getLeft(), (int) view.getY(), view.getRight(), view.getBottom());
            case 14:
                MediaGalleryFragmentBase mediaGalleryFragmentBase = (MediaGalleryFragmentBase) this.A00;
                C182348oG r13 = mediaGalleryFragmentBase.A0H;
                if (r13 != null) {
                    return r13.B7o(mediaGalleryFragmentBase.A1K());
                }
                throw C18270x1.A0S("monthYearFormat");
            case 15:
                AnonymousClass7Hk r02 = (AnonymousClass7Hk) this.A00;
                return r02.A00.B18(r02.A01, new LinkedBlockingQueue(), 0, 1, 1, 60);
            case 16:
                return ((AnonymousClass7E4) this.A00).A00.B18("ProcessImageQueue", new LinkedBlockingQueue(), 4, 4, 1, 0);
            case 17:
                return ((AnonymousClass7E4) this.A00).A00.B18("TranscodeQueue", new LinkedBlockingQueue(), 1, 1, 1, 0);
            case 18:
                return ((GoogleMigrateImporterActivity) this.A00).A0Y(R.drawable.vec_ios_to_android_in_progress);
            case 19:
                return ((GoogleMigrateImporterActivity) this.A00).A0Y(R.drawable.vec_ios_to_android_error);
            case 20:
                return ((GoogleMigrateImporterActivity) this.A00).A0Y(R.drawable.vec_ios_to_android_finished);
            default:
                View view2 = (View) this.A00;
                return new Rect(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
        }
        float height = f / ((float) ((Rect) r0.get()).height());
        if (height < 0.0f || height > 1.0f) {
            int i = (height > 0.0f ? 1 : (height == 0.0f ? 0 : -1));
            height = 1.0f;
            if (i < 0) {
                height = 0.0f;
            }
        }
        return Float.valueOf(1.0f - height);
    }
}
