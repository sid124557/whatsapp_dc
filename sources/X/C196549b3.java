package X;

import com.whatsapp.util.Log;

/* renamed from: X.9b3  reason: invalid class name and case insensitive filesystem */
public class C196549b3 implements C85034Er {
    public final /* synthetic */ AnonymousClass99N A00;

    public C196549b3(AnonymousClass99N r1) {
        this.A00 = r1;
    }

    public void BLr() {
        Log.e("PAY:PaymentErrorMapAssetManager/triggerBackgroundFetch/onAbort");
    }

    public void BSD(Integer num) {
        Log.e("PAY:PaymentErrorMapAssetManager/triggerBackgroundFetch/onError");
    }

    public void Be9(Integer num) {
        Log.e("PAY:PaymentErrorMapAssetManager/triggerBackgroundFetch/onTimeOut");
    }

    public void onSuccess() {
        AnonymousClass99N r5 = this.A00;
        C620933l r4 = r5.A04;
        C18270x1.A0i(C620933l.A00(r4), "payments_error_map_last_sync_time_millis", r4.A01.A0H());
        StringBuilder A0l = AnonymousClass000.A0l(r5.A03.B65());
        A0l.append("_");
        A0l.append(r5.A01.A07());
        A0l.append("_");
        C18270x1.A0j(C620933l.A00(r4), "error_map_key", AnonymousClass000.A0X("1", A0l));
        Log.d("PAY:PaymentErrorMapAssetManager/triggerBackgroundFetch/Download successful");
    }
}
