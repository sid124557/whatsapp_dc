package com.whatsapp.graphapi;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.AnonymousClass5ZI;
import X.AnonymousClass7T4;
import X.C149517Mt;
import X.C156437gc;
import X.C18310x6;
import X.C18320x8;
import X.C55682qk;
import X.C57682u2;
import X.C58172up;
import X.C59022wD;
import X.C59722xN;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.util.Log;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONException;

@DebugMetadata(c = "com.whatsapp.graphapi.GraphApiACSNetworkRequestKt$executeHttpsConnectionRequest$result$1", f = "GraphApiACSNetworkRequestKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GraphApiACSNetworkRequestKt$executeHttpsConnectionRequest$result$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ GraphApiACSNetworkRequestKt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GraphApiACSNetworkRequestKt$executeHttpsConnectionRequest$result$1(GraphApiACSNetworkRequestKt graphApiACSNetworkRequestKt, C84814Du r3) {
        super(r3, 2);
        this.this$0 = graphApiACSNetworkRequestKt;
    }

    public final Object A09(Object obj) {
        String str;
        int i;
        if (this.label == 0) {
            C57682u2.A01(obj);
            C149517Mt r3 = new C149517Mt();
            GraphApiACSNetworkRequestKt graphApiACSNetworkRequestKt = this.this$0;
            try {
                C59722xN r6 = graphApiACSNetworkRequestKt.A05;
                int A0E = graphApiACSNetworkRequestKt.A0E();
                C156437gc A01 = r6.A01(graphApiACSNetworkRequestKt, graphApiACSNetworkRequestKt.A06(), C58172up.A0K, graphApiACSNetworkRequestKt.A0F(), graphApiACSNetworkRequestKt.A0G(), A0E, graphApiACSNetworkRequestKt.A0C());
                new Integer(A01.A01);
                AnonymousClass5ZI r0 = graphApiACSNetworkRequestKt.A06;
                if (r0 != null) {
                    r0.A06();
                }
                graphApiACSNetworkRequestKt.A0B(r3, A01);
                if (r0 != null) {
                    r0.A05();
                    return r3;
                }
            } catch (JSONException e) {
                str = C18310x6.A0n(e);
                graphApiACSNetworkRequestKt.A0L(str);
                C55682qk.A05(graphApiACSNetworkRequestKt.A02, "GraphApiACSNetworkRequestKt/executeHttpsConnectionRequest: Error while generating or parsing the JSON: ", e);
                Log.e("GraphApiACSNetworkRequestKt/executeHttpsConnectionRequest: Error while generating or parsing the JSON", e);
                r3.A00 = 2;
                i = 7;
                r3.A01 = new AnonymousClass7T4((Integer) null, str, i);
                return r3;
            } catch (IOException e2) {
                str = C18310x6.A0n(e2);
                graphApiACSNetworkRequestKt.A0L(str);
                if (!C18320x8.A1T(graphApiACSNetworkRequestKt.A07)) {
                    Log.e("GraphApiACSNetworkRequestKt/executeHttpsConnectionRequest failed", e2);
                    r3.A00 = 1;
                    i = 8;
                    r3.A01 = new AnonymousClass7T4((Integer) null, str, i);
                    return r3;
                }
                Log.d("GraphApiACSNetworkRequestKt/executeHttpsConnectionRequest: Request cancelled");
                return r3;
            } catch (Exception e3) {
                str = C18310x6.A0n(e3);
                graphApiACSNetworkRequestKt.A0L(str);
                C55682qk.A05(graphApiACSNetworkRequestKt.A02, "GraphApiACSNetworkRequestKt/executeHttpsConnectionRequest: Error while generating or parsing the JSON: ", e3);
                Log.e("GraphApiACSNetworkRequestKt/executeHttpsConnectionRequest: generic error - ", e3);
                r3.A00 = 3;
                i = 6;
                r3.A01 = new AnonymousClass7T4((Integer) null, str, i);
                return r3;
            }
            return r3;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new GraphApiACSNetworkRequestKt$executeHttpsConnectionRequest$result$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new GraphApiACSNetworkRequestKt$executeHttpsConnectionRequest$result$1(this.this$0, (C84814Du) obj2).A09(C59022wD.A00);
    }
}
