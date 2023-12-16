package X;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9qM  reason: invalid class name and case insensitive filesystem */
public class C205059qM implements C15930sC {
    public Object A00;
    public Object A01;
    public final int A02;

    public C205059qM(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BOf(Object obj) {
        Runnable runnable;
        switch (this.A02) {
            case 0:
                AnonymousClass9TY r7 = (AnonymousClass9TY) this.A00;
                Context context = (Context) this.A01;
                int i = (AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(r7.A01), "payments_merchant_upsell_start_cool_off_timestamp") > -1 ? 1 : (AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(r7.A01), "payments_merchant_upsell_start_cool_off_timestamp") == -1 ? 0 : -1));
                long currentTimeMillis = System.currentTimeMillis();
                if (i == 0) {
                    currentTimeMillis += TimeUnit.DAYS.toMillis(30);
                }
                C620933l r9 = r7.A04;
                C86604Kt.A15(r9.A03(), "payment_smb_upsell_view_count", C18280x3.A02(r9.A03(), "payment_smb_upsell_view_count") + 1);
                r7.A01.A1f("payments_merchant_upsell_start_cool_off_timestamp", currentTimeMillis);
                r7.A05.BKB(AnonymousClass001.A0f(), 36, "merchant_upsell_prompt", "chat");
                r7.A02.A00(context, "merchant_upsell_prompt");
                return;
            case 1:
                AnonymousClass957 r5 = (AnonymousClass957) this.A01;
                HashMap A0t = AnonymousClass001.A0t();
                for (C181748nG r1 : (List) obj) {
                    if (r1 instanceof AnonymousClass8EZ) {
                        C109015dw r12 = ((AnonymousClass8EZ) r1).A00;
                        List list = r12.A07;
                        if (!list.isEmpty()) {
                            A0t.put(r12.A0F, C18290x4.A0k(list));
                        }
                    }
                }
                r5.A03.putAll(A0t);
                r5.A05();
                return;
            case 2:
                AnonymousClass9TK r3 = (AnonymousClass9TK) this.A00;
                DialogFragment dialogFragment = (DialogFragment) this.A01;
                int A0K = AnonymousClass001.A0K(obj);
                if (A0K == 1) {
                    Log.i("Start pay flow event received");
                    dialogFragment.A1K();
                    runnable = r3.A06;
                } else if (A0K != 2) {
                    if (A0K == 3) {
                        Log.i("Dismiss event received");
                    } else if (A0K != 4) {
                        Log.i("None event received");
                        return;
                    }
                    dialogFragment.A1K();
                    return;
                } else {
                    Log.i("Invite sent event received");
                    dialogFragment.A1K();
                    runnable = r3.A05;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                AnonymousClass95C r52 = (AnonymousClass95C) this.A01;
                HashMap A0t2 = AnonymousClass001.A0t();
                for (C181748nG r13 : (List) obj) {
                    if (r13 instanceof AnonymousClass8EZ) {
                        C109015dw r14 = ((AnonymousClass8EZ) r13).A00;
                        List list2 = r14.A07;
                        if (!list2.isEmpty()) {
                            A0t2.put(r14.A0F, C18290x4.A0k(list2));
                        }
                    }
                }
                int i2 = 0;
                while (true) {
                    List list3 = r52.A0C;
                    if (i2 < list3.size()) {
                        AnonymousClass9NY r2 = (AnonymousClass9NY) list3.get(i2);
                        if (r2 instanceof AnonymousClass9E1) {
                            AnonymousClass9E1 r22 = (AnonymousClass9E1) r2;
                            String A002 = r22.A01.A00();
                            if (A0t2.containsKey(A002)) {
                                r22.A00 = (C108815db) A0t2.get(A002);
                                r52.A06(i2);
                            }
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
        }
    }
}
