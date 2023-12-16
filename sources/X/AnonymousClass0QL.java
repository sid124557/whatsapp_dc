package X;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.0QL  reason: invalid class name */
public class AnonymousClass0QL {
    public float A00;
    public float A01;
    public float A02;
    public int A03 = 0;
    public Rect A04;
    public C10550i7 A05;
    public C10530i5 A06;
    public List A07;
    public List A08;
    public Map A09;
    public Map A0A;
    public Map A0B;
    public boolean A0C;
    public final AnonymousClass0MB A0D = new AnonymousClass0MB();
    public final HashSet A0E = AnonymousClass002.A0K();

    public static float A00(AnonymousClass0QL r2) {
        return (float) ((long) (((r2.A00 - r2.A02) / r2.A01) * 1000.0f));
    }

    public C03820Lr A02(String str) {
        int size = this.A08.size();
        for (int i = 0; i < size; i++) {
            C03820Lr r4 = (C03820Lr) this.A08.get(i);
            String str2 = r4.A02;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return r4;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (C04510Oo A002 : this.A07) {
            sb.append(A002.A00("\t"));
        }
        return sb.toString();
    }

    public static void A01(AnonymousClass0QL r0, String str) {
        AnonymousClass0S3.A00(str);
        r0.A0E.add(str);
    }
}
