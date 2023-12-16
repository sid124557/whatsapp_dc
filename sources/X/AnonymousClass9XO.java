package X;

import android.os.Handler;
import android.util.Log;

/* renamed from: X.9XO  reason: invalid class name */
public class AnonymousClass9XO implements Handler.Callback {
    public final /* synthetic */ AnonymousClass9VK A00;

    public AnonymousClass9XO(AnonymousClass9VK r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r7) {
        /*
            r6 = this;
            X.9VK r0 = r6.A00
            X.9Sw r1 = r0.A05
            java.util.List r0 = r1.A00
            boolean r0 = r0.isEmpty()
            r5 = 1
            if (r0 != 0) goto L_0x0015
            java.util.List r4 = r1.A00
            int r0 = r7.what
            r3 = 0
            switch(r0) {
                case 0: goto L_0x008a;
                case 1: goto L_0x0073;
                case 2: goto L_0x0067;
                case 3: goto L_0x005b;
                case 4: goto L_0x0044;
                case 5: goto L_0x002d;
                case 6: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            return r5
        L_0x0016:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x0015
            r4.get(r3)
            int r2 = r7.arg1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Time to complete capture: "
            A00(r0, r1, r2)
            int r3 = r3 + 1
            goto L_0x0016
        L_0x002d:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x0015
            r4.get(r3)
            int r2 = r7.arg1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Time for first preview frame: "
            A00(r0, r1, r2)
            int r3 = r3 + 1
            goto L_0x002d
        L_0x0044:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x0015
            r4.get(r3)
            int r2 = r7.arg1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Time for first surface texture update: "
            A00(r0, r1, r2)
            int r3 = r3 + 1
            goto L_0x0044
        L_0x005b:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x0015
            r4.get(r3)
            int r3 = r3 + 1
            goto L_0x005b
        L_0x0067:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x0015
            r4.get(r3)
            int r3 = r3 + 1
            goto L_0x0067
        L_0x0073:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x0015
            r4.get(r3)
            int r2 = r7.arg1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Time to switch camera: "
            A00(r0, r1, r2)
            int r3 = r3 + 1
            goto L_0x0073
        L_0x008a:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x0015
            r4.get(r3)
            int r2 = r7.arg1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Time to take photo: "
            A00(r0, r1, r2)
            int r3 = r3 + 1
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9XO.handleMessage(android.os.Message):boolean");
    }

    public static void A00(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        sb.append("ms");
        Log.d("Camera1Performance", sb.toString());
    }
}
