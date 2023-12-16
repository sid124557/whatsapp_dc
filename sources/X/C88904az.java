package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: X.4az  reason: invalid class name and case insensitive filesystem */
public class C88904az extends C88914b0 {
    public final /* synthetic */ AnonymousClass5UU A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88904az(Context context, AnonymousClass5UU r2) {
        super(context);
        this.A00 = r2;
    }

    public void onClick(View view) {
        C009707r r3 = this.A00.A02;
        Intent A06 = C627736r.A06(r3.getApplicationContext());
        A06.putExtra("target_setting", "privacy_groupadd");
        r3.startActivity(A06);
    }
}
