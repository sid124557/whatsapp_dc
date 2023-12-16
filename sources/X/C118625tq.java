package X;

import com.whatsapp.registration.passkeys.PasskeyFacade;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.passkeys.PasskeyFacade", f = "PasskeyFacade.kt", i = {0}, l = {156}, m = "checkPasskeyExists", n = {"this"}, s = {"L$0"})
/* renamed from: X.5tq  reason: invalid class name and case insensitive filesystem */
public final class C118625tq extends C75013pU {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PasskeyFacade this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118625tq(PasskeyFacade passkeyFacade, C84814Du r2) {
        super(r2);
        this.this$0 = passkeyFacade;
    }

    public final Object A09(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A02(this);
    }
}
