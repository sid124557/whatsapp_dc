package X;

import android.util.Log;

/* renamed from: X.3XO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3XO implements C84174Bi {
    public final /* synthetic */ String A00;

    public final void BRw(boolean z, Object obj, Object obj2, Object obj3) {
        String str = this.A00;
        String str2 = (String) obj;
        if (z) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Bloks: CacheShards evicted ");
            A0o.append(str);
            Log.d("Whatsapp", AnonymousClass000.A0V(" :: ", str2, A0o));
        }
    }

    public /* synthetic */ AnonymousClass3XO(String str) {
        this.A00 = str;
    }
}
