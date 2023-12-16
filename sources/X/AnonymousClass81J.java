package X;

import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.81J  reason: invalid class name */
public class AnonymousClass81J implements C187008wI {
    public final /* synthetic */ C161427pc A00;
    public final /* synthetic */ HashMap A01;

    public List B6o(String str, boolean z, boolean z2) {
        int A0D;
        ArrayList A0J = AnonymousClass002.A0J(C187008wI.A00.B6o(str, z, false));
        HashMap hashMap = this.A01;
        if (hashMap != null && !hashMap.isEmpty()) {
            Iterator it = A0J.iterator();
            while (it.hasNext()) {
                String lowerCase = ((C160577nt) it.next()).A02.toLowerCase(Locale.ROOT);
                if (hashMap.containsKey(lowerCase) && ((A0D = AnonymousClass6C8.A0D(lowerCase, hashMap)) == -1 || Build.VERSION.SDK_INT < A0D)) {
                    it.remove();
                }
            }
        }
        if ("video/av01".equals(str)) {
            AnonymousClass91R.A00(this, A0J, 4);
            Object[] A0M = AnonymousClass002.A0M();
            AnonymousClass000.A16("video/av01", A0J, A0M);
            C161157p6.A01("MediaCodecSelector", "%s dec order (hw first) %s", A0M);
        }
        return A0J;
    }

    public AnonymousClass81J(C161427pc r1, HashMap hashMap) {
        this.A00 = r1;
        this.A01 = hashMap;
    }

    public C160577nt BAc() {
        return C187008wI.A00.BAc();
    }
}
