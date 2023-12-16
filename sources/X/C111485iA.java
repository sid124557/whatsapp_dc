package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.mentions.MentionableEntry;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5iA  reason: invalid class name and case insensitive filesystem */
public class C111485iA implements AnonymousClass64L {
    public C94694rl A00;
    public List A01;
    public final Activity A02;
    public final C69263Wi A03;
    public final AnonymousClass5Ul A04;
    public final C64773Ex A05;
    public final AnonymousClass5ZU A06;
    public final AnonymousClass5ZR A07;
    public final AnonymousClass5Y0 A08;
    public final AnonymousClass4FV A09;
    public final C95814uZ A0A;
    public final C988953q A0B;
    public final MentionableEntry A0C;

    public final void A00(List list) {
        String str;
        C94694rl r1;
        List list2 = list;
        if (list == null || list.isEmpty()) {
            this.A03.A0H(R.string.f11nameremoved, 0);
            str = "drag_drop_uri_null_or_empty";
        } else if (!this.A07.A0E()) {
            Activity activity = this.A02;
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.f11nameremoved;
            if (i >= 30) {
                i2 = R.string.f11nameremoved;
                if (i < 33) {
                    i2 = R.string.f11nameremoved;
                }
            }
            RequestPermissionActivity.A0c(activity, R.string.f11nameremoved, i2, 29);
            this.A01 = list;
            str = "missing_storage_permission";
        } else {
            AnonymousClass5Ul r12 = this.A04;
            List singletonList = Collections.singletonList(this.A0A);
            Activity activity2 = this.A02;
            r12.A03(activity2, (AnonymousClass4FU) activity2, new AnonymousClass92Q(this, 0), (C108845de) null, "", singletonList, list2, 9, false, false);
            r1 = this.A00;
            r1.A00 = Boolean.TRUE;
            this.A09.BhD(r1);
        }
        r1 = this.A00;
        r1.A00 = Boolean.FALSE;
        r1.A02 = str;
        this.A09.BhD(r1);
    }

    public boolean BM3(Intent intent, int i, int i2) {
        if (i != 29 || i2 != -1) {
            return false;
        }
        A00(this.A01);
        return true;
    }

    public C111485iA(Context context, C69263Wi r3, AnonymousClass5Ul r4, C64773Ex r5, AnonymousClass5ZU r6, AnonymousClass5ZR r7, AnonymousClass5Y0 r8, AnonymousClass4FV r9, C95814uZ r10, C988953q r11, MentionableEntry mentionableEntry) {
        this.A02 = C111095hX.A02(context);
        this.A04 = r4;
        this.A03 = r3;
        this.A0C = mentionableEntry;
        this.A0A = r10;
        this.A07 = r7;
        this.A0B = r11;
        this.A05 = r5;
        this.A06 = r6;
        this.A08 = r8;
        this.A09 = r9;
    }
}
