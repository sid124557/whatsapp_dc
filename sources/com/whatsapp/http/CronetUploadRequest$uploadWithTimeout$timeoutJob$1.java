package com.whatsapp.http;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass349;
import X.AnonymousClass4C6;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C616231o;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.util.Log;
import java.net.HttpURLConnection;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.http.CronetUploadRequest$uploadWithTimeout$timeoutJob$1", f = "CronetUploadRequest.kt", i = {0}, l = {119}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class CronetUploadRequest$uploadWithTimeout$timeoutJob$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ HttpURLConnection $connect;
    public final /* synthetic */ long $timeoutMillis;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CronetUploadRequest$uploadWithTimeout$timeoutJob$1(HttpURLConnection httpURLConnection, C84814Du r3, long j) {
        super(r3, 2);
        this.$timeoutMillis = j;
        this.$connect = httpURLConnection;
    }

    public final Object A09(Object obj) {
        AnonymousClass4C6 r2;
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            r2 = (AnonymousClass4C6) this.L$0;
            long j = this.$timeoutMillis;
            this.L$0 = r2;
            this.label = 1;
            if (C616231o.A00(this, j) == r4) {
                return r4;
            }
        } else if (i == 1) {
            r2 = (AnonymousClass4C6) this.L$0;
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        if (AnonymousClass349.A04(r2)) {
            this.$connect.disconnect();
            Log.e("CronetUploadRequestKt/connection request timed out");
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        CronetUploadRequest$uploadWithTimeout$timeoutJob$1 cronetUploadRequest$uploadWithTimeout$timeoutJob$1 = new CronetUploadRequest$uploadWithTimeout$timeoutJob$1(this.$connect, r6, this.$timeoutMillis);
        cronetUploadRequest$uploadWithTimeout$timeoutJob$1.L$0 = obj;
        return cronetUploadRequest$uploadWithTimeout$timeoutJob$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
