package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.3bc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71133bc implements Runnable {
    public final /* synthetic */ C166587yw A00;
    public final /* synthetic */ C53952nw A01;
    public final /* synthetic */ AnonymousClass1jU A02;
    public final /* synthetic */ Boolean A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ Long A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;

    public final void run() {
        AnonymousClass1jU r11 = this.A02;
        C166587yw r13 = this.A00;
        String str = this.A07;
        C53952nw r12 = this.A01;
        String str2 = this.A08;
        String str3 = this.A09;
        String str4 = this.A0A;
        Long l = this.A06;
        Integer num = this.A05;
        Boolean bool = this.A03;
        Integer num2 = this.A04;
        Context context = r11.A03.A00;
        Intent A072 = C18320x8.A07();
        A072.setClassName(context.getPackageName(), "com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity");
        A072.putExtra("extra_bank_account", r13);
        A072.putExtra("extra_india_upi_pin_op", str);
        A072.putExtra("extra_fds_manager_id", r12.A05);
        String str5 = r11.A01;
        if (str5 == null) {
            throw C18270x1.A0S("observerId");
        }
        A072.putExtra("extra_fcs_observer_id", str5);
        A072.putExtra("extra_seq_number", str2);
        A072.putExtra("extra_payee_name", str3);
        A072.putExtra("extra_receiver_vpa", str4);
        A072.putExtra("extra_payment_preset_amount", l);
        A072.putExtra("extra_payment_offset", num);
        A072.putExtra("is_asynchronous", bool);
        A072.putExtra(C373621y.ERROR_CODE.key, num2);
        C18280x3.A0n(context, A072);
    }

    public /* synthetic */ C71133bc(C166587yw r1, C53952nw r2, AnonymousClass1jU r3, Boolean bool, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A07 = str;
        this.A01 = r2;
        this.A08 = str2;
        this.A09 = str3;
        this.A0A = str4;
        this.A06 = l;
        this.A05 = num;
        this.A03 = bool;
        this.A04 = num2;
    }
}
