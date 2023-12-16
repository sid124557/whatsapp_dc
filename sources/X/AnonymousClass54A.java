package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.54A  reason: invalid class name */
public class AnonymousClass54A extends C109665ez {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public AnonymousClass54A(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A05 = i;
        this.A00 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = obj4;
        this.A04 = obj5;
    }

    public void A07(View view) {
        String str;
        Object obj;
        if (this.A05 != 0) {
            AnonymousClass67A A012 = AnonymousClass31N.A01(((C106055Xl) this.A00).A04);
            if (A012 != null) {
                AnonymousClass32K r0 = (AnonymousClass32K) this.A02;
                String str2 = r0.A03;
                String str3 = r0.A02;
                C624134x r2 = (C624134x) this.A03;
                A012.BG8(r2, r2.A1J, (AnonymousClass5NI) this.A01, str2, str3, (Bitmap[]) this.A04, r0.A01);
                return;
            }
            return;
        }
        C30801n8 r8 = (C30801n8) this.A03;
        C54942pX r7 = r8.A02;
        if (r7 == null) {
            if (r8.A1J.A02) {
                obj = C86634Kw.A0V((C56972sr) this.A02).A0H;
            } else {
                obj = this.A04;
            }
            UserJid userJid = (UserJid) obj;
            C626936e.A06(userJid);
            double d = r8.A00;
            double d2 = r8.A01;
            long j = r8.A0K;
            r7 = new C54942pX(userJid);
            r7.A00 = d;
            r7.A01 = d2;
            r7.A05 = j;
        }
        Context context = (Context) this.A00;
        C95814uZ A002 = AnonymousClass2z0.A00(r8);
        boolean A052 = ((C622534h) this.A01).A05(context);
        Intent A003 = A00(A002, r7);
        String packageName = context.getPackageName();
        if (A052) {
            str = "com.whatsapp.location.GroupChatLiveLocationsActivity2";
        } else {
            str = "com.whatsapp.location.GroupChatLiveLocationsActivity";
        }
        A003.setClassName(packageName, str);
        context.startActivity(A003);
    }

    public static Intent A00(Jid jid, C54942pX r10) {
        String rawString = jid.getRawString();
        String rawString2 = r10.A06.getRawString();
        long j = r10.A05;
        double d = r10.A00;
        double d2 = r10.A01;
        Intent intent = new Intent();
        intent.putExtra("jid", rawString);
        intent.putExtra("final_location_jid", rawString2);
        intent.putExtra("final_location_timestamp", j);
        intent.putExtra("final_location_latitude", d);
        intent.putExtra("final_location_longitude", d2);
        return intent;
    }
}
