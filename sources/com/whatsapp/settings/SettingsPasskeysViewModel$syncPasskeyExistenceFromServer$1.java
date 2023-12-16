package com.whatsapp.settings;

import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass218;
import X.AnonymousClass33p;
import X.AnonymousClass4GR;
import X.C100555Bj;
import X.C18270x1;
import X.C18290x4;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C97704z6;
import X.C97714z7;
import com.whatsapp.registration.passkeys.PasskeyServerApiImpl;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.settings.SettingsPasskeysViewModel$syncPasskeyExistenceFromServer$1", f = "SettingsPasskeysViewModel.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
public final class SettingsPasskeysViewModel$syncPasskeyExistenceFromServer$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ SettingsPasskeysViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsPasskeysViewModel$syncPasskeyExistenceFromServer$1(SettingsPasskeysViewModel settingsPasskeysViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = settingsPasskeysViewModel;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            PasskeyServerApiImpl passkeyServerApiImpl = this.this$0.A04;
            this.label = 1;
            obj = passkeyServerApiImpl.A04(this);
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        C100555Bj r4 = (C100555Bj) obj;
        if (r4 instanceof C97714z7) {
            AnonymousClass08M r0 = this.this$0.A00;
            Object obj2 = ((C97714z7) r4).A00;
            if (obj2 != null) {
                r0.A0H(obj2);
                AnonymousClass33p r02 = this.this$0.A01;
                C18270x1.A0l(C18270x1.A03(r02), "reg_passkey_exists", AnonymousClass001.A1Z(obj2));
            } else {
                throw C18290x4.A0Y();
            }
        } else if (r4 instanceof C97704z6) {
            Log.e("SettingsPasskeysViewModel/syncPasskeyExistenceFromServer/error", (Throwable) ((C97704z6) r4).A00);
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new SettingsPasskeysViewModel$syncPasskeyExistenceFromServer$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new SettingsPasskeysViewModel$syncPasskeyExistenceFromServer$1(this.this$0, (C84814Du) obj2));
    }
}
