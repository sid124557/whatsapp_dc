package X;

import android.view.View;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.9cn  reason: invalid class name and case insensitive filesystem */
public class C197239cn implements C203139nB {
    public final /* synthetic */ C195319Xg A00;
    public final /* synthetic */ AnonymousClass39Q A01;
    public final /* synthetic */ C166587yw A02;
    public final /* synthetic */ AnonymousClass3QO A03;
    public final /* synthetic */ PinBottomSheetDialogFragment A04;
    public final /* synthetic */ BrazilPaymentActivity A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public C197239cn(C195319Xg r1, AnonymousClass39Q r2, C166587yw r3, AnonymousClass3QO r4, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, BrazilPaymentActivity brazilPaymentActivity, String str, String str2) {
        this.A05 = brazilPaymentActivity;
        this.A04 = pinBottomSheetDialogFragment;
        this.A01 = r2;
        this.A02 = r3;
        this.A07 = str;
        this.A00 = r1;
        this.A06 = str2;
        this.A03 = r4;
    }

    public void BPT(String str) {
        this.A04.A1b();
        BrazilPaymentActivity brazilPaymentActivity = this.A05;
        int intValue = this.A01.A00.scaleByPowerOfTen(3).intValue();
        C85204Fi r3 = AnonymousClass1S3.A04;
        C60042xu r2 = new C60042xu();
        r2.A01 = (long) intValue;
        r2.A00 = 1000;
        r2.A02 = r3;
        AnonymousClass39L A012 = r2.A01();
        AnonymousClass9VE A7G = brazilPaymentActivity.A7G(this.A00, this.A02, A012, this.A07, "payment_pin", brazilPaymentActivity.A0e);
        C196989cH r32 = new C196989cH(this);
        A7G.A0Q.BkM(new C198969fm(A7G));
        C67993Rl A013 = A7G.A0H.A01("FB", "PIN");
        String str2 = str;
        if (A013 != null) {
            C193849Qh r5 = new C193849Qh(A013);
            A7G.A0F.A00(new AnonymousClass9UP(r32, A7G, r5, (Object) null, 1), r5, str);
            return;
        }
        A7G.A0G.A00(new C204869q3(r32, A7G, r32.A00.A05.A0O.A00("get-provider-key"), str2, 1), "FB");
    }

    public void BTk(View view) {
        BrazilPaymentActivity brazilPaymentActivity = this.A05;
        AnonymousClass9NB r3 = new AnonymousClass9NB(brazilPaymentActivity);
        C18270x1.A0w(new AnonymousClass9GP(r3, brazilPaymentActivity.A0P), brazilPaymentActivity.A04);
    }
}
