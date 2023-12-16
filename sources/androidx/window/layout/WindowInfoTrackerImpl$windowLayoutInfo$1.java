package androidx.window.layout;

import X.AnonymousClass001;
import X.AnonymousClass0P8;
import X.AnonymousClass4GR;
import X.AnonymousClass4Gm;
import X.AnonymousClass8P9;
import X.C08910fJ;
import X.C14090oc;
import X.C17950wV;
import X.C18010wb;
import X.C57682u2;
import X.C57732u7;
import X.C59022wD;
import X.C73883gE;
import X.C75003pT;
import X.C84814Du;
import android.app.Activity;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
public final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ Activity $activity;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C08910fJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerImpl$windowLayoutInfo$1(Activity activity, C08910fJ r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r3;
        this.$activity = activity;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this.$activity, this.this$0, r5);
        windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$1;
    }

    public static final void A00(AnonymousClass0P8 r0, AnonymousClass4Gm r1) {
        r1.BrD(r0);
    }

    public final Object A09(Object obj) {
        Object A05 = C73883gE.A05();
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass4Gm r4 = (AnonymousClass4Gm) this.L$0;
            C17950wV r3 = new C17950wV(r4, 7);
            this.this$0.A00.Bie(this.$activity, r3, new C18010wb(1));
            C14090oc r0 = new C14090oc(r3, this.this$0);
            this.label = 1;
            if (C57732u7.A00(this, r0, r4) == A05) {
                return A05;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    /* renamed from: A0B */
    public final Object invoke(C84814Du r3, AnonymousClass4Gm r4) {
        return ((AnonymousClass8P9) A0A(r4, r3)).A09(C59022wD.A00);
    }
}
