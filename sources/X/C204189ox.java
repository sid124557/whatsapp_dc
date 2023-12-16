package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.util.Log;

/* renamed from: X.9ox  reason: invalid class name and case insensitive filesystem */
public class C204189ox implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public final int A06;

    public C204189ox(Context context, C624034w r2, C194599Tr r3, C202509m8 r4, C624134x r5, String str, int i) {
        this.A06 = i;
        this.A00 = r3;
        this.A05 = str;
        this.A01 = context;
        this.A02 = r2;
        this.A03 = r5;
        this.A04 = r4;
    }

    public final void onClick(View view) {
        boolean z;
        int i = this.A06;
        C194599Tr r6 = (C194599Tr) this.A00;
        String str = this.A05;
        Context context = (Context) this.A01;
        C624034w r5 = (C624034w) this.A02;
        C624134x r8 = (C624134x) this.A03;
        C202509m8 r7 = (C202509m8) this.A04;
        Integer A0f = AnonymousClass001.A0f();
        if (i != 0) {
            if (str == null) {
                Log.d("Pay: logEvent/screen name is null");
            } else {
                C203499no A062 = AnonymousClass9U4.A06(r6.A0A);
                if (A062 != null) {
                    A062.BKB(A0f, 42, str, (String) null);
                }
            }
            z = true;
        } else {
            if (str == null) {
                Log.d("Pay: logEvent/screen name is null");
            } else {
                C203499no A063 = AnonymousClass9U4.A06(r6.A0A);
                if (A063 != null) {
                    A063.BKB(A0f, 41, str, (String) null);
                }
            }
            z = false;
        }
        r6.A01(context, r5, new C196809bm(context, r5, r6, r7, r8, str, z), z);
    }
}
