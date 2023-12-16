package X;

import android.os.Bundle;
import com.whatsapp.bonsai.waitlist.BonsaiWaitlistJoinBottomSheet;
import com.whatsapp.bonsai.waitlist.BonsaiWaitlistJoinFromDiscoveryBottomSheet;
import com.whatsapp.bonsai.waitlist.BonsaiWaitlistJoinFromInvokeBottomSheet;
import com.whatsapp.bonsai.waitlist.BonsaiWaitlistRequestedBottomSheet;
import com.whatsapp.util.Log;

/* renamed from: X.408  reason: invalid class name */
public final class AnonymousClass408 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C89654ea $dialogActivity;
    public final /* synthetic */ Integer $entryPoint;
    public final /* synthetic */ AnonymousClass49M $tosAcceptedCallback;
    public final /* synthetic */ C996357k $tosType;
    public final /* synthetic */ C50192hm this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass408(C89654ea r2, AnonymousClass49M r3, C50192hm r4, C996357k r5, Integer num) {
        super(0);
        this.this$0 = r4;
        this.$dialogActivity = r2;
        this.$entryPoint = num;
        this.$tosType = r5;
        this.$tosAcceptedCallback = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        BonsaiWaitlistJoinBottomSheet bonsaiWaitlistJoinFromInvokeBottomSheet;
        int ordinal = this.this$0.A04.A01().ordinal();
        if (ordinal == 0) {
            C50192hm r2 = this.this$0;
            C89654ea r6 = this.$dialogActivity;
            Integer num = this.$entryPoint;
            C996357k r3 = this.$tosType;
            AnonymousClass400 r1 = new AnonymousClass400(this.$tosAcceptedCallback, r2, r3, num);
            Log.d("bonsaionboarding/open/can request waitlist");
            C79983xV r4 = new C79983xV(r2, r1);
            int A02 = C18320x8.A02(r3, 1);
            if (A02 == 0) {
                bonsaiWaitlistJoinFromInvokeBottomSheet = new BonsaiWaitlistJoinFromInvokeBottomSheet();
            } else if (A02 == 1) {
                bonsaiWaitlistJoinFromInvokeBottomSheet = new BonsaiWaitlistJoinFromDiscoveryBottomSheet();
            } else {
                throw C73153f1.A00();
            }
            if (num != null) {
                Bundle A08 = AnonymousClass002.A08();
                A08.putInt("bonsaiWaitlistDialogEntryPoint", num.intValue());
                bonsaiWaitlistJoinFromInvokeBottomSheet.A0u(A08);
            }
            bonsaiWaitlistJoinFromInvokeBottomSheet.A04 = r4;
            r6.Boo(bonsaiWaitlistJoinFromInvokeBottomSheet);
        } else if (ordinal == 1) {
            C89654ea r12 = this.$dialogActivity;
            Log.d("bonsaionboarding/open/in waitlist");
            r12.Boo(new BonsaiWaitlistRequestedBottomSheet());
        } else if (ordinal == 2) {
            C50192hm r32 = this.this$0;
            Integer num2 = this.$entryPoint;
            r32.A01(this.$tosAcceptedCallback, this.$tosType, num2);
        }
        return C59022wD.A00;
    }
}
