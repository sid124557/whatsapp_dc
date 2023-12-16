package X;

import com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines;
import com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines$downloadPslAndStart$2$1$onSuccess$1;

/* renamed from: X.3M3  reason: invalid class name */
public final class AnonymousClass3M3 implements C85034Er {
    public final /* synthetic */ C54052o6 A00;
    public final /* synthetic */ PhoenixExtensionFlowManagerWithCoroutines A01;
    public final /* synthetic */ C53832nk A02;
    public final /* synthetic */ AnonymousClass4B3 A03;
    public final /* synthetic */ AnonymousClass4DQ A04;

    public AnonymousClass3M3(C54052o6 r1, PhoenixExtensionFlowManagerWithCoroutines phoenixExtensionFlowManagerWithCoroutines, C53832nk r3, AnonymousClass4B3 r4, AnonymousClass4DQ r5) {
        this.A01 = phoenixExtensionFlowManagerWithCoroutines;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }

    public void BLr() {
        PhoenixExtensionFlowManagerWithCoroutines phoenixExtensionFlowManagerWithCoroutines = this.A01;
        C23641Ub r3 = phoenixExtensionFlowManagerWithCoroutines.A0N;
        String str = this.A00.A05;
        r3.A06(str.hashCode(), 105);
        phoenixExtensionFlowManagerWithCoroutines.A09(this.A04, "Download aborted", str);
    }

    public /* bridge */ /* synthetic */ void BSD(Integer num) {
        PhoenixExtensionFlowManagerWithCoroutines phoenixExtensionFlowManagerWithCoroutines = this.A01;
        C23641Ub r3 = phoenixExtensionFlowManagerWithCoroutines.A0N;
        String str = this.A00.A05;
        r3.A06(str.hashCode(), 3);
        phoenixExtensionFlowManagerWithCoroutines.A09(this.A04, "Download failed", str);
    }

    public /* bridge */ /* synthetic */ void Be9(Integer num) {
        PhoenixExtensionFlowManagerWithCoroutines phoenixExtensionFlowManagerWithCoroutines = this.A01;
        C23641Ub r3 = phoenixExtensionFlowManagerWithCoroutines.A0N;
        String str = this.A00.A05;
        r3.A06(str.hashCode(), 3);
        phoenixExtensionFlowManagerWithCoroutines.A09(this.A04, "Download timed out", str);
    }

    public void onSuccess() {
        PhoenixExtensionFlowManagerWithCoroutines phoenixExtensionFlowManagerWithCoroutines = this.A01;
        C616131n.A02((C85494Gl) null, new PhoenixExtensionFlowManagerWithCoroutines$downloadPslAndStart$2$1$onSuccess$1(this.A00, phoenixExtensionFlowManagerWithCoroutines, this.A02, this.A03, this.A04, (C84814Du) null), phoenixExtensionFlowManagerWithCoroutines.A0W, (AnonymousClass20D) null, 3);
    }
}
