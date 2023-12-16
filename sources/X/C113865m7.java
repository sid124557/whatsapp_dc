package X;

import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5m7  reason: invalid class name and case insensitive filesystem */
public class C113865m7 implements AnonymousClass4FW {
    public final /* synthetic */ AnonymousClass656 A00;
    public final /* synthetic */ AnonymousClass5QO A01;

    public C113865m7(AnonymousClass656 r1, AnonymousClass5QO r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public /* synthetic */ void BNb(C624134x r1, int i) {
    }

    public /* synthetic */ void BWS(C624134x r1, int i) {
    }

    public /* synthetic */ void BWU(C624134x r1, int i) {
    }

    public /* synthetic */ void BWX(C624134x r1, C624134x r2) {
    }

    public void BWg(Collection collection, Map map) {
        AnonymousClass5QO r4 = this.A01;
        if (!r4.A00) {
            Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (r4.A04.remove(C18300x5.A0T(it).A1J) != null) {
                    z = true;
                }
            }
            if (z) {
                C1236269d r0 = (C1236269d) this.A00;
                int i = r0.A01;
                Object obj = r0.A00;
                switch (i) {
                    case 0:
                        AnonymousClass08M r1 = ((MessageSelectionViewModel) obj).A00;
                        C162457s7.A0J(r1, 0);
                        r1.A0H(r1.A07());
                        return;
                    case 1:
                        ((MediaGalleryActivity) obj).A74();
                        return;
                    default:
                        ((StorageUsageGalleryActivity) obj).A76();
                        return;
                }
            }
        }
    }

    public /* synthetic */ void BX5(C95804uY r1, boolean z) {
    }

    public /* synthetic */ void BXI() {
    }

    public /* synthetic */ void BY8(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BY9(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BRi(C624134x r1) {
    }

    public /* synthetic */ void BVB(C95814uZ r1) {
    }

    public /* synthetic */ void BWW(C624134x r1) {
    }

    public /* synthetic */ void BWY(C624134x r1) {
    }

    public /* synthetic */ void BWf(C95814uZ r1) {
    }

    public /* synthetic */ void BWj(Collection collection) {
    }

    public /* synthetic */ void BX3(C95804uY r1) {
    }

    public /* synthetic */ void BX4(C624134x r1) {
    }

    public /* synthetic */ void BX6(C95804uY r1) {
    }

    public /* synthetic */ void BWh(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BWi(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BWe(Collection collection, int i) {
        C381525x.A00(this, collection, i);
    }
}
