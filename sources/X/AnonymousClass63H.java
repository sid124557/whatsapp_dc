package X;

import com.whatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.63H  reason: invalid class name */
public final class AnonymousClass63H extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ int $noticeId;
    public final /* synthetic */ WeakReference $weakActivity;
    public final /* synthetic */ C105325Um this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass63H(C105325Um r2, WeakReference weakReference, int i) {
        super(1);
        this.$weakActivity = weakReference;
        this.this$0 = r2;
        this.$noticeId = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C120765z8 r0;
        boolean A1Z = AnonymousClass001.A1Z(obj);
        C89654ea A0F = C18320x8.A0F(this.$weakActivity);
        if (A1Z) {
            if (A0F != null) {
                C105325Um r3 = this.this$0;
                int i = this.$noticeId;
                WeakReference A14 = AnonymousClass0x9.A14(A0F);
                if (i == C106505Zg.A00(r3.A03)) {
                    r0 = null;
                } else {
                    r0 = new C120765z8(r3, A14);
                }
                r3.A07(A0F, r0, i);
            }
        } else if (A0F != null) {
            A0F.Bot(R.string.f11nameremoved);
        }
        return C59022wD.A00;
    }
}
