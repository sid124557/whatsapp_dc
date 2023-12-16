package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.9bm  reason: invalid class name and case insensitive filesystem */
public class C196809bm implements C202979mv {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C624034w A01;
    public final /* synthetic */ C194599Tr A02;
    public final /* synthetic */ C202509m8 A03;
    public final /* synthetic */ C624134x A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public C196809bm(Context context, C624034w r2, C194599Tr r3, C202509m8 r4, C624134x r5, String str, boolean z) {
        this.A02 = r3;
        this.A00 = context;
        this.A05 = str;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A06 = z;
    }

    public void BSk() {
        this.A02.A00(this.A00, this.A01);
    }

    public void onSuccess() {
        C85204Fi A012;
        String A07;
        UserJid A032;
        C203719oC A013;
        C194599Tr r3 = this.A02;
        Context context = this.A00;
        String str = this.A05;
        C624034w r7 = this.A01;
        C624134x r2 = this.A04;
        C202509m8 r1 = this.A03;
        if (this.A06) {
            if (r2 == null) {
                A032 = null;
            } else {
                A032 = AnonymousClass32Y.A03(r2.A0n());
            }
            C199999hc r12 = new C199999hc(r3, r1);
            if (r7.A0C != null) {
                C69263Wi r13 = r3.A00;
                if (r13.A0Y()) {
                    r13.A0G(0, R.string.f11nameremoved);
                    AnonymousClass0x7.A1B(new C191899Gw(r3.A01, r3.A03, r3.A05, r7, A032, r3.A09, r3.A0A, r3.A0B, r12, 15), r3.A0D);
                    return;
                }
                return;
            }
            AnonymousClass9SU A0F = r3.A0A.A0F(r7.A0G);
            if (A0F != null && (A013 = A0F.A01(r7.A0I)) != null) {
                r3.A00.A0G(0, R.string.f11nameremoved);
                C202959mt BAl = A013.BAl();
                C626936e.A06(BAl);
                BAl.Bil(C111095hX.A02(context), r7, new AnonymousClass9bT(r7, r3, r12));
                return;
            }
            return;
        }
        C195909Zz r5 = r3.A07;
        Intent B8Q = r5.A0B.A0G().B8Q(context);
        if (B8Q == null) {
            Log.e("No Intent to start send payment to Collect Request");
            return;
        }
        B8Q.putExtra("extra_referral_screen", str);
        if (r7.A0C != null) {
            B8Q.putExtra("extra_request_message_key", r7.A0L);
            B8Q.putExtra("extra_conversation_message_type", 3);
            String str2 = r7.A0K;
            if (str2 != null) {
                B8Q.putExtra("extra_request_id", str2);
            }
            C95814uZ r22 = r7.A0C;
            String str3 = "extra_jid";
            if (C627336j.A0K(r22)) {
                AnonymousClass0x2.A0u(B8Q, r22, str3);
                A07 = C627336j.A07(r7.A0D);
                str3 = "extra_receiver_jid";
            } else {
                A07 = C627336j.A07(r7.A0D);
            }
            B8Q.putExtra(str3, A07);
        }
        if (!TextUtils.isEmpty(r7.A0K)) {
            B8Q.putExtra("extra_transaction_id", r7.A0K);
        }
        B8Q.putExtra("extra_transaction_type", r7.A03);
        AnonymousClass1S4 r0 = r7.A0A;
        if (r0 != null) {
            B8Q.putExtra("extra_payment_handle", C1899693i.A0G(AnonymousClass3QD.A00(), r0.A0L(), "paymentHandle"));
            B8Q.putExtra("extra_incoming_pay_request_id", r7.A0A.A0K());
        }
        AnonymousClass39Q r02 = r7.A08;
        if (!(r02 == null || TextUtils.isEmpty(r02.toString()) || (A012 = r5.A0A.A01()) == null)) {
            B8Q.putExtra("extra_payment_preset_amount", A012.B3U(r5.A06, r7.A08));
        }
        ((C89654ea) C111095hX.A02(context)).A6T(B8Q, false);
    }
}
