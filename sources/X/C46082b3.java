package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2b3  reason: invalid class name and case insensitive filesystem */
public class C46082b3 {
    public C50692ic A00;
    public final C50692ic A01;
    public final C50692ic A02 = new C97004xT();
    public final C50692ic[] A03;

    public synchronized C50692ic A00(Context context) {
        C50692ic r0;
        C50692ic r02;
        r0 = this.A00;
        if (r0 == null) {
            if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
                r02 = new C28601hT();
            } else {
                try {
                    Intent A09 = AnonymousClass0x9.A09("android.intent.action.MAIN");
                    A09.addCategory("android.intent.category.HOME");
                    List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(A09, 65536);
                    if (queryIntentActivities != null) {
                        Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String str = it.next().activityInfo.packageName;
                            C18260x0.A0s("badger/homepackage/", str, AnonymousClass001.A0o());
                            C50692ic[] r4 = this.A03;
                            int length = r4.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                C50692ic r1 = r4[i];
                                if (r1.A00(context.getApplicationContext()).contains(str)) {
                                    this.A00 = r1;
                                    break;
                                }
                                i++;
                            }
                            if (this.A00 != null) {
                                break;
                            }
                        }
                    } else {
                        Log.e("badger/nohome");
                    }
                } catch (Exception e) {
                    Log.e(AnonymousClass000.A0a("badger/getbadger ", AnonymousClass001.A0o(), e), e);
                }
                if (this.A00 == null) {
                    Log.i("badger/getbadger/notfound/default");
                    r02 = this.A01;
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("badger/getbadger ");
                C18260x0.A1G(A0o, Arrays.asList(this.A03).indexOf(this.A00));
                r0 = this.A00;
            }
            this.A00 = r02;
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("badger/getbadger ");
            C18260x0.A1G(A0o2, Arrays.asList(this.A03).indexOf(this.A00));
            r0 = this.A00;
        }
        return r0;
    }

    public C46082b3(AnonymousClass1VX r5) {
        AnonymousClass1hN r3 = new AnonymousClass1hN();
        this.A01 = r3;
        this.A03 = new C50692ic[]{new C28561hP(), new C28601hT(), new C28571hQ(), new C28611hU(), new AnonymousClass1hO(), new C28591hS(r5), new C28581hR(r5), new C28621hV(), r3};
    }
}
