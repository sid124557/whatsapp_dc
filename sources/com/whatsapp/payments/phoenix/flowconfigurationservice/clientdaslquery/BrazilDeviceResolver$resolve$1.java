package com.whatsapp.payments.phoenix.flowconfigurationservice.clientdaslquery;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass349;
import X.AnonymousClass35J;
import X.AnonymousClass4GR;
import X.AnonymousClass9KH;
import X.C133736hr;
import X.C18270x1;
import X.C194929Vc;
import X.C197709dk;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.payments.phoenix.flowconfigurationservice.clientdaslquery.BrazilDeviceResolver$resolve$1", f = "BrazilDeviceResolver.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
public final class BrazilDeviceResolver$resolve$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C133736hr $card;
    public final /* synthetic */ AnonymousClass9KH $field;
    public int label;
    public final /* synthetic */ C197709dk this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazilDeviceResolver$resolve$1(C133736hr r2, C197709dk r3, AnonymousClass9KH r4, C84814Du r5) {
        super(r5, 2);
        this.this$0 = r3;
        this.$card = r2;
        this.$field = r4;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C197709dk r3 = this.this$0;
            C133736hr r2 = this.$card;
            this.label = 1;
            if (AnonymousClass349.A00(this, new BrazilDeviceResolver$buildBindingData$2(r2, r3, (C84814Du) null)) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        C197709dk r5 = this.this$0;
        int ordinal = this.$field.ordinal();
        if (ordinal == 6) {
            String str = r5.A00;
            if (str != null) {
                return str;
            }
            throw C18270x1.A0S("clientReferenceId");
        } else if (ordinal == 7) {
            C194929Vc r1 = r5.A07;
            String str2 = r5.A01;
            if (str2 != null) {
                return r1.A04(str2);
            }
            throw C18270x1.A0S("networkDeviceId");
        } else if (ordinal == 8) {
            String str3 = r5.A01;
            if (str3 == null) {
                throw C18270x1.A0S("networkDeviceId");
            } else if (str3.length() != 0) {
                return str3;
            } else {
                throw AnonymousClass001.A0g("fun resolve networkDeviceId must not be null");
            }
        } else if (ordinal == 9) {
            String str4 = r5.A02;
            if (str4 == null) {
                throw C18270x1.A0S("tokenId");
            } else if (str4.length() == 0) {
                throw AnonymousClass001.A0g("fun resolve : tokenId must not be null");
            } else {
                C194929Vc r22 = r5.A07;
                String str5 = r5.A01;
                if (str5 == null) {
                    throw C18270x1.A0S("networkDeviceId");
                }
                String str6 = r5.A00;
                if (str6 != null) {
                    return r22.A08(str5, str6, str4);
                }
                throw C18270x1.A0S("clientReferenceId");
            }
        } else if (ordinal != 10) {
            return null;
        } else {
            return AnonymousClass35J.A02(r5.A04, r5.A05);
        }
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new BrazilDeviceResolver$resolve$1(this.$card, this.this$0, this.$field, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
