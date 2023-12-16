package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.catalogcategory.view.CategoryThumbnailLoader;

/* renamed from: X.6HV  reason: invalid class name */
public final class AnonymousClass6HV extends AnonymousClass09G {
    public final CategoryThumbnailLoader A00;
    public final AnonymousClass4GQ A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6HV(CategoryThumbnailLoader categoryThumbnailLoader, AnonymousClass4GQ r3) {
        super((AnonymousClass0O4) AnonymousClass6HJ.A00);
        C162457s7.A0J(categoryThumbnailLoader, 1);
        this.A00 = categoryThumbnailLoader;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        if (i == 0) {
            View inflate = C86604Kt.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
            C162457s7.A0D(inflate);
            return new C132986gT(inflate, this.A00, this.A01);
        } else if (i == 1) {
            View inflate2 = C86604Kt.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
            C162457s7.A0D(inflate2);
            return new C133006gV(inflate2);
        } else if (i == 6) {
            View inflate3 = C86604Kt.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
            C162457s7.A0D(inflate3);
            return new C132966gR(inflate3, this.A01);
        } else if (i == 7) {
            View inflate4 = C86604Kt.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
            C162457s7.A0D(inflate4);
            return new C132946gP(inflate4);
        } else {
            throw AnonymousClass000.A0G("Invalid item viewtype: ", AnonymousClass001.A0o(), i);
        }
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r2, int i) {
        C125636Iu r22 = (C125636Iu) r2;
        C162457s7.A0J(r22, 0);
        Object A0K = A0K(i);
        C162457s7.A0D(A0K);
        r22.A07((AnonymousClass7DQ) A0K);
    }

    public int getItemViewType(int i) {
        return ((AnonymousClass7DQ) A0K(i)).A00;
    }
}
