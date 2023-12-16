package com.whatsapp.data;

import X.AnonymousClass4GR;
import X.C42292Nn;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.data.OrderRequestMessageManager$getOrderRequestMessageRowId$1", f = "OrderRequestMessageManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OrderRequestMessageManager$getOrderRequestMessageRowId$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $orderId;
    public int label;
    public final /* synthetic */ C42292Nn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderRequestMessageManager$getOrderRequestMessageRowId$1(C42292Nn r2, String str, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$orderId = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            if (r0 != 0) goto L_0x0053
            X.C57682u2.A01(r6)
            X.2Nn r0 = r5.this$0
            X.2k0 r0 = r0.A00
            java.lang.String r1 = r5.$orderId
            X.C626936e.A00()
            X.3dV r0 = r0.A01
            X.4GK r4 = r0.get()
            r0 = 1
            java.lang.String[] r3 = X.C18300x5.A1a(r1, r0)     // Catch:{ all -> 0x0049 }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0049 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = "SELECT message_row_id, order_id, thumbnail, order_title, item_count, status, surface, message, seller_jid, token, currency_code, total_amount_1000, message_version FROM message_order WHERE order_id=?"
            java.lang.String r0 = "GET_ORDER_MESSAGE_BY_ORDER_ID_SQL"
            android.database.Cursor r2 = X.C56862sg.A00(r4, r2, r1, r0, r3)     // Catch:{ all -> 0x0049 }
            r1 = 0
            if (r2 == 0) goto L_0x0043
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "message_row_id"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x003c }
            r2.close()
            return r0
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)
            throw r0
        L_0x0043:
            if (r2 == 0) goto L_0x0048
            r2.close()
        L_0x0048:
            return r1
        L_0x0049:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x004e }
            throw r1
        L_0x004e:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0053:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.data.OrderRequestMessageManager$getOrderRequestMessageRowId$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new OrderRequestMessageManager$getOrderRequestMessageRowId$1(this.this$0, this.$orderId, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
