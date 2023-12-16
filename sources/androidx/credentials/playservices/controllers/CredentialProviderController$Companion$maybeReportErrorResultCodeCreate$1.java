package androidx.credentials.playservices.controllers;

import X.AnonymousClass4GP;
import X.AnonymousClass4GQ;
import X.C69903Yy;
import X.C829045j;

public final class CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C69903Yy $exception;
    public final /* synthetic */ AnonymousClass4GQ $onError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1(AnonymousClass4GQ r2, C69903Yy r3) {
        super(0);
        this.$onError = r2;
        this.$exception = r3;
    }

    public final void invoke() {
        this.$onError.invoke(this.$exception.element);
    }
}
