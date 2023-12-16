package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.StickyHeadersRecyclerView;
import com.whatsapp.WaTextView;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import java.text.Format;
import java.util.Date;

/* renamed from: X.5oo  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C115525oo implements C182998pK {
    public final /* synthetic */ WaTextView A00;
    public final /* synthetic */ MediaGalleryFragmentBase A01;
    public final /* synthetic */ C183538qC A02;

    public final void Brc() {
        C06440Xs r1;
        int i;
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A01;
        WaTextView waTextView = this.A00;
        C183538qC r10 = this.A02;
        StickyHeadersRecyclerView stickyHeadersRecyclerView = mediaGalleryFragmentBase.A0C;
        C186058ug r7 = null;
        if (stickyHeadersRecyclerView != null) {
            r1 = stickyHeadersRecyclerView.getLayoutManager();
        } else {
            r1 = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r1;
        if (linearLayoutManager != null && mediaGalleryFragmentBase.A0L != null) {
            int A1H = linearLayoutManager.A1H();
            StickyHeadersRecyclerView stickyHeadersRecyclerView2 = mediaGalleryFragmentBase.A0C;
            if (stickyHeadersRecyclerView2 != null) {
                while (true) {
                    long A0K = ((C88004Wy) stickyHeadersRecyclerView2.A0N).A0K(A1H) & 4294967295L;
                    if (AnonymousClass000.A1T((A0K > 4294967295L ? 1 : (A0K == 4294967295L ? 0 : -1)))) {
                        if (A1H >= stickyHeadersRecyclerView2.A0N.A0G() - 1) {
                            i = stickyHeadersRecyclerView2.A0N.A0G() - ((C185858uM) ((C88004Wy) stickyHeadersRecyclerView2.A0N).A00).B83();
                            break;
                        }
                        A1H++;
                    } else {
                        i = (int) A0K;
                        break;
                    }
                }
            } else {
                i = 0;
            }
            C186308v5 r0 = mediaGalleryFragmentBase.A0L;
            if ((r0 == null || (r7 = r0.B9S(i)) == null) && mediaGalleryFragmentBase.A1L().A0X(5882)) {
                C72173dI r02 = mediaGalleryFragmentBase.A0T;
                if (r02 != null) {
                    r02.execute(new C71433c6(mediaGalleryFragmentBase, waTextView, r10, i, 17));
                    return;
                }
                return;
            }
            C162457s7.A0H(waTextView);
            if (r7 != null) {
                waTextView.setText(((Format) r10.get()).format(new Date(r7.B6l())));
            }
        }
    }

    public /* synthetic */ C115525oo(WaTextView waTextView, MediaGalleryFragmentBase mediaGalleryFragmentBase, C183538qC r3) {
        this.A01 = mediaGalleryFragmentBase;
        this.A00 = waTextView;
        this.A02 = r3;
    }
}
