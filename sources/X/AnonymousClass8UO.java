package X;

import com.whatsapp.registration.passkeys.PasskeyServerApiImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.passkeys.PasskeyServerApiImpl", f = "PasskeyServerApiImpl.kt", i = {0}, l = {95}, m = "finishRegister", n = {"this"}, s = {"L$0"})
/* renamed from: X.8UO  reason: invalid class name */
public final class AnonymousClass8UO extends C75013pU {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PasskeyServerApiImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8UO(PasskeyServerApiImpl passkeyServerApiImpl, C84814Du r2) {
        super(r2);
        this.this$0 = passkeyServerApiImpl;
    }

    public final Object A09(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01((String) null, this);
    }
}
