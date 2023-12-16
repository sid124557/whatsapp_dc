package X;

import android.content.ContentResolver;
import android.util.Log;
import java.util.HashMap;

/* renamed from: X.8AM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8AM implements C180968lv {
    public final String A00;

    public final Object BuJ() {
        Object obj;
        String str = this.A00;
        ContentResolver contentResolver = C161707qI.A06.getContentResolver();
        boolean z = false;
        Class<C161237pH> cls = C161237pH.class;
        synchronized (cls) {
            C161237pH.A01(contentResolver);
            obj = C161237pH.A00;
        }
        HashMap hashMap = C161237pH.A06;
        boolean z2 = false;
        synchronized (cls) {
            if (hashMap.containsKey(str)) {
                Object obj2 = hashMap.get(str);
                if (obj2 != null) {
                    z2 = obj2;
                }
            } else {
                z2 = null;
            }
        }
        Boolean bool = (Boolean) z2;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            String A002 = C161237pH.A00(contentResolver, str);
            if (A002 != null && !A002.equals("")) {
                if (C18280x3.A1X(A002, C161237pH.A0B)) {
                    bool = Boolean.TRUE;
                    z = true;
                } else if (C18280x3.A1X(A002, C161237pH.A0C)) {
                    bool = Boolean.FALSE;
                } else {
                    StringBuilder A0A = C18330xA.A0A("attempt to read gservices key ");
                    A0A.append(str);
                    A0A.append(" (value \"");
                    A0A.append(A002);
                    Log.w("Gservices", AnonymousClass000.A0X("\") as boolean", A0A));
                }
            }
            synchronized (cls) {
                if (obj == C161237pH.A00) {
                    hashMap.put(str, bool);
                    C161237pH.A01.remove(str);
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public AnonymousClass8AM(String str) {
        this.A00 = str;
    }
}
