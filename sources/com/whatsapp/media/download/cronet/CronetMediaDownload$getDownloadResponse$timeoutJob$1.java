package com.whatsapp.media.download.cronet;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass2OR;
import X.AnonymousClass349;
import X.AnonymousClass4C6;
import X.AnonymousClass4GR;
import X.C18290x4;
import X.C57682u2;
import X.C58422vE;
import X.C59022wD;
import X.C616231o;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.util.Log;
import java.net.HttpURLConnection;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.media.download.cronet.CronetMediaDownload$getDownloadResponse$timeoutJob$1", f = "CronetMediaDownload.kt", i = {0}, l = {78}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class CronetMediaDownload$getDownloadResponse$timeoutJob$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ HttpURLConnection $connect;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass2OR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CronetMediaDownload$getDownloadResponse$timeoutJob$1(AnonymousClass2OR r2, HttpURLConnection httpURLConnection, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$connect = httpURLConnection;
    }

    public final Object A09(Object obj) {
        AnonymousClass4C6 r3;
        long A0A;
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            r3 = (AnonymousClass4C6) this.L$0;
            int A0O = this.this$0.A01.A0O(C58422vE.A02, 4601);
            if (A0O <= 0) {
                A0A = 15000;
            } else {
                A0A = C18290x4.A0A(A0O);
            }
            this.L$0 = r3;
            this.label = 1;
            if (C616231o.A00(this, A0A) == r5) {
                return r5;
            }
        } else if (i == 1) {
            r3 = (AnonymousClass4C6) this.L$0;
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        if (AnonymousClass349.A04(r3)) {
            this.$connect.disconnect();
            Log.e("CronetMediaDownload/connection request timed out");
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        CronetMediaDownload$getDownloadResponse$timeoutJob$1 cronetMediaDownload$getDownloadResponse$timeoutJob$1 = new CronetMediaDownload$getDownloadResponse$timeoutJob$1(this.this$0, this.$connect, r5);
        cronetMediaDownload$getDownloadResponse$timeoutJob$1.L$0 = obj;
        return cronetMediaDownload$getDownloadResponse$timeoutJob$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
