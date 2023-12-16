package X;

import com.whatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.3ya  reason: invalid class name and case insensitive filesystem */
public final class C80653ya extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ WeakReference $activityWeakReference;
    public final /* synthetic */ C45992au this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80653ya(C45992au r2, WeakReference weakReference) {
        super(0);
        this.this$0 = r2;
        this.$activityWeakReference = weakReference;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C89654ea r1;
        Object obj = this.$activityWeakReference.get();
        if ((obj instanceof C89654ea) && (r1 = (C89654ea) obj) != null) {
            r1.Bot(R.string.f11nameremoved);
        }
        return C59022wD.A00;
    }
}
