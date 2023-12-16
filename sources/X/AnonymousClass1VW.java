package X;

import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1VW  reason: invalid class name */
public class AnonymousClass1VW extends C56952sp {
    public static SharedPreferences A03;
    public final AnonymousClass1VX A00;
    public final C60152y5 A01;
    public final ConcurrentHashMap A02 = new ConcurrentHashMap(0);

    public synchronized SharedPreferences A0Z() {
        SharedPreferences sharedPreferences;
        sharedPreferences = A03;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A03("ab-prechatd-props");
            A03 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public AnonymousClass1VW(AnonymousClass1VX r9, C28811ho r10, C60152y5 r11, AnonymousClass4FS r12, C183538qC r13) {
        super(r10, r11, r12, r13, "ab-prechatd-props");
        this.A00 = r9;
        this.A01 = r11;
    }
}
