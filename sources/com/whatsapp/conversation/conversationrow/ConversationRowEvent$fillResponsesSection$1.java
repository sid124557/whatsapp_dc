package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C18300x5;
import X.C22671Pc;
import X.C30461mU;
import X.C56972sr;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C624134x;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import X.C95814uZ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowEvent$fillResponsesSection$1", f = "ConversationRowEvent.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationRowEvent$fillResponsesSection$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C30461mU $eventMessage;
    public final /* synthetic */ List $facePileMessages;
    public int label;
    public final /* synthetic */ C22671Pc this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowEvent$fillResponsesSection$1$1", f = "ConversationRowEvent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.conversationrow.ConversationRowEvent$fillResponsesSection$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object A09(java.lang.Object r9) {
            /*
                r8 = this;
                int r0 = r8.label
                if (r0 != 0) goto L_0x00b9
                X.C57682u2.A01(r9)
                java.util.ArrayList r0 = r5
                java.util.Iterator r7 = r0.iterator()
                r6 = 0
                r1 = 0
            L_0x000f:
                boolean r0 = r7.hasNext()
                if (r0 == 0) goto L_0x0036
                int r5 = r1 + 1
                X.3ZH r4 = X.C18310x6.A0R(r7)
                X.1Pc r0 = r3
                com.whatsapp.contact.FacepileView r0 = r0.A0F
                com.whatsapp.WaImageView r3 = r0.A00(r1)
                if (r3 == 0) goto L_0x0034
                X.1Pc r2 = r3
                X.5Uq r1 = r2.A0G
                X.3Ez r0 = new X.3Ez
                r0.<init>(r2, r4)
                r1.A05(r3, r0, r4, r6)
                r3.setVisibility(r6)
            L_0x0034:
                r1 = r5
                goto L_0x000f
            L_0x0036:
                java.util.ArrayList r3 = r5
                boolean r0 = r3.isEmpty()
                r2 = 8
                r7 = 1
                if (r0 == 0) goto L_0x0070
                X.1Pc r0 = r3
                android.widget.LinearLayout r0 = r0.A08
            L_0x0045:
                r0.setVisibility(r2)
            L_0x0048:
                X.1mU r0 = r2
                java.util.List r1 = r0.A1v()
                r0 = 0
                if (r1 == 0) goto L_0x009a
                java.util.ArrayList r4 = X.AnonymousClass001.A0s()
                java.util.Iterator r3 = r1.iterator()
            L_0x0059:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0096
                java.lang.Object r2 = r3.next()
                r0 = r2
                X.1mi r0 = (X.C30601mi) r0
                X.21m r1 = r0.A01
                X.21m r0 = X.C372421m.GOING
                if (r1 != r0) goto L_0x0059
                r4.add(r2)
                goto L_0x0059
            L_0x0070:
                int r0 = r3.size()
                r1 = 2
                if (r0 != r7) goto L_0x008f
                X.1Pc r0 = r3
                com.whatsapp.contact.FacepileView r0 = r0.A0F
                com.whatsapp.WaImageView r0 = r0.A00(r7)
                if (r0 == 0) goto L_0x0084
                r0.setVisibility(r2)
            L_0x0084:
                X.1Pc r0 = r3
                com.whatsapp.contact.FacepileView r0 = r0.A0F
                com.whatsapp.WaImageView r0 = r0.A00(r1)
                if (r0 != 0) goto L_0x0045
                goto L_0x0048
            L_0x008f:
                int r0 = r3.size()
                if (r0 != r1) goto L_0x0048
                goto L_0x0084
            L_0x0096:
                int r0 = r4.size()
            L_0x009a:
                int r5 = r0 + 1
                X.1Pc r0 = r3
                com.whatsapp.WaTextView r4 = r0.A0E
                android.content.res.Resources r3 = X.C18290x4.A0G(r0)
                r2 = 2131755107(0x7f100063, float:1.9141084E38)
                java.lang.Object[] r1 = new java.lang.Object[r7]
                java.lang.Integer r0 = X.AnonymousClass0x9.A0k(r5)
                r1[r6] = r0
                java.lang.String r0 = r3.getQuantityString(r2, r5, r1)
                r4.setText(r0)
                X.2wD r0 = X.C59022wD.A00
                return r0
            L_0x00b9:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.ConversationRowEvent$fillResponsesSection$1.AnonymousClass1.A09(java.lang.Object):java.lang.Object");
        }

        public final C84814Du A0A(Object obj, C84814Du r6) {
            return new AnonymousClass1(r3, r22, A0s, r6);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A00(obj2, obj, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowEvent$fillResponsesSection$1(C22671Pc r2, C30461mU r3, List list, C84814Du r5) {
        super(r5, 2);
        this.$facePileMessages = list;
        this.this$0 = r2;
        this.$eventMessage = r3;
    }

    public final Object A09(Object obj) {
        Object A0A;
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            final ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = this.$facePileMessages.iterator();
            while (it.hasNext()) {
                C624134x A0T = C18300x5.A0T(it);
                C22671Pc r2 = this.this$0;
                if (A0T.A1J.A02) {
                    A0A = C56972sr.A01(r2.A0Z);
                } else {
                    C95814uZ A0n = A0T.A0n();
                    if (A0n != null) {
                        A0A = r2.A0t.A0A(A0n);
                    }
                }
                if (A0A != null) {
                    A0s.add(A0A);
                }
            }
            C73853gB mainDispatcher = this.this$0.getMainDispatcher();
            final C22671Pc r3 = this.this$0;
            final C30461mU r22 = this.$eventMessage;
            AnonymousClass1 r0 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            if (C616131n.A00(this, mainDispatcher, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new ConversationRowEvent$fillResponsesSection$1(this.this$0, this.$eventMessage, this.$facePileMessages, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
