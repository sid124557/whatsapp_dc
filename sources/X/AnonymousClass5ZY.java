package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5ZY  reason: invalid class name */
public class AnonymousClass5ZY {
    public static AnonymousClass3XA A00(Context context, Intent intent, C69263Wi r18, C105405Uu r19, C105145Tt r20, AnonymousClass5Y9 r21, UserJid userJid, String str, boolean z) {
        Boolean bool;
        AnonymousClass3XA r5 = new AnonymousClass3XA();
        UserJid userJid2 = userJid;
        String str2 = str;
        Context context2 = context;
        Intent intent2 = intent;
        boolean z2 = z;
        if (r19.A08(userJid2, str2) == null) {
            AnonymousClass5Y9 r6 = r21;
            if (r6.A09(new AnonymousClass7PB((C52332lJ) null, userJid2, C86624Kv.A0X(context2.getResources(), R.dimen.f6nameremoved), C86624Kv.A0X(context2.getResources(), R.dimen.f6nameremoved), str2, r20.A02, false))) {
                r6.A0P.add(new C111845im(context2, intent2, r18, r5, r6, userJid2, str2, z2));
                return r5;
            }
            bool = Boolean.FALSE;
        } else {
            A01(context2, intent2, userJid2, (Integer) null, (Integer) null, str2, 6, z2);
            bool = Boolean.TRUE;
        }
        r5.AwB(bool);
        return r5;
    }

    public static void A01(Context context, Intent intent, UserJid userJid, Integer num, Integer num2, String str, int i, boolean z) {
        Bundle A02;
        Activity A01 = C621633u.A01(context, C009707r.class);
        if (A01 != null) {
            intent.putExtra("product", str);
            intent.putExtra("disable_report", z);
            AnonymousClass0x2.A0u(intent, userJid, "jid");
            if (num2 != null) {
                intent.putExtra("thumb_height", num2);
            }
            if (num != null) {
                intent.putExtra("thumb_width", num);
            }
            intent.putExtra("view_product_origin", i);
            if (!C105465Va.A00) {
                A02 = null;
            } else {
                A02 = C05880Vi.A01(A01, new AnonymousClass0PJ[0]).A02();
            }
            C05680Um.A02(A01, intent, A02, 0);
        }
    }

    public static void A02(Context context, View view, AnonymousClass5T7 r18, C105405Uu r19, AnonymousClass5X1 r20, C30771mz r21, C33141sV r22, int i, boolean z, boolean z2, boolean z3) {
        C30771mz r6 = r21;
        String str = r6.A06;
        UserJid userJid = r6.A01;
        C626936e.A06(userJid);
        C105405Uu r4 = r19;
        C109015dw A08 = r4.A08((UserJid) null, str);
        Context context2 = context;
        AnonymousClass5T7 r3 = r18;
        AnonymousClass5X1 r5 = r20;
        int i2 = i;
        boolean z4 = z2;
        boolean z5 = z3;
        if (A08 == null) {
            View view2 = view;
            C33141sV r7 = r22;
            C116375qB r0 = new C116375qB(context2, view2, r3, r4, r5, r6, r7, i2, z4, z5);
            if (z) {
                r7.A0A(view2, r6, r0);
            } else {
                r7.A09(view2, r6, r0);
            }
        } else {
            A03(context2, r3, r5, userJid, (Integer) null, (Integer) null, A08.A0F, i2, z4, z5, false);
        }
    }

    public static void A03(Context context, AnonymousClass5T7 r4, AnonymousClass5X1 r5, UserJid userJid, Integer num, Integer num2, String str, int i, boolean z, boolean z2, boolean z3) {
        if (z2) {
            A01(context, C18320x8.A07().setClassName(context.getPackageName(), "com.whatsapp.biz.product.view.activity.ProductDetailActivity"), userJid, num, num2, str, i, z);
            return;
        }
        r4.A02(userJid).A03(new C172168Jw(context, r4, r5, userJid, num, num2, str, i, z, z3));
    }
}
