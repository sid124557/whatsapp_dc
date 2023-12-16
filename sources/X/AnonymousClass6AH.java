package X;

import com.whatsapp.gallery.MediaGalleryActivity;

/* renamed from: X.6AH  reason: invalid class name */
public class AnonymousClass6AH implements AnonymousClass64F {
    public Object A00;
    public final int A01;

    public AnonymousClass6AH(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BQn() {
        switch (this.A01) {
            case 0:
                ((C1230666y) this.A00).B3M();
                return;
            case 1:
                ((C113245l7) this.A00).A2z.B3M();
                return;
            case 2:
                MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) this.A00;
                AnonymousClass5QO r0 = mediaGalleryActivity.A0I;
                if (r0 != null) {
                    r0.A04.clear();
                }
                AnonymousClass0R2 r02 = mediaGalleryActivity.A06;
                if (r02 != null) {
                    r02.A05();
                    return;
                }
                return;
            default:
                C08310eF r1 = ((C08310eF) this.A00).A0E;
                if (r1 instanceof AnonymousClass64F) {
                    ((AnonymousClass64F) r1).BQn();
                    return;
                }
                return;
        }
    }
}
