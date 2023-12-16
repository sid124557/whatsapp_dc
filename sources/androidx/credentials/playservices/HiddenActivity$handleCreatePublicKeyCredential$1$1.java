package androidx.credentials.playservices;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass4GQ;
import X.C162457s7;
import X.C59022wD;
import X.C829045j;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;

public final class HiddenActivity$handleCreatePublicKeyCredential$1$1 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ int $requestCode;
    public final /* synthetic */ HiddenActivity this$0;

    public final void invoke(PendingIntent pendingIntent) {
        C162457s7.A0J(pendingIntent, 0);
        try {
            HiddenActivity hiddenActivity = this.this$0;
            hiddenActivity.mWaitingForActivityResult = true;
            hiddenActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), this.$requestCode, (Intent) null, 0, 0, 0, (Bundle) null);
        } catch (IntentSender.SendIntentException e) {
            HiddenActivity hiddenActivity2 = this.this$0;
            ResultReceiver resultReceiver = hiddenActivity2.resultReceiver;
            C162457s7.A0H(resultReceiver);
            hiddenActivity2.setupFailure(resultReceiver, CredentialProviderBaseController.CREATE_UNKNOWN, AnonymousClass000.A0a("During public key credential, found IntentSender failure on public key creation: ", AnonymousClass001.A0o(), e));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HiddenActivity$handleCreatePublicKeyCredential$1$1(HiddenActivity hiddenActivity, int i) {
        super(1);
        this.this$0 = hiddenActivity;
        this.$requestCode = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PendingIntent) obj);
        return C59022wD.A00;
    }
}
