package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.03w  reason: invalid class name and case insensitive filesystem */
public final class C003503w extends C04520Op {
    public static Intent A00(C06760Zc r2) {
        C162457s7.A0J(r2, 1);
        Intent putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", r2);
        C162457s7.A0D(putExtra);
        return putExtra;
    }

    public /* bridge */ /* synthetic */ Intent A05(Context context, Object obj) {
        return A00((C06760Zc) obj);
    }

    public /* bridge */ /* synthetic */ Object A07(Intent intent, int i) {
        return new C06800Zg(i, intent);
    }
}
