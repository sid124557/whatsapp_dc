package X;

import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;

/* renamed from: X.7fy  reason: invalid class name and case insensitive filesystem */
public class C156067fy {
    public C146777Bo A00;
    public String A01;

    public static AnonymousClass7QF A00(String str) {
        C146767Bn r0;
        try {
            C158977kt.A00();
            AnonymousClass8D3 r02 = new AnonymousClass8D3(new JsonReader(new StringReader(str)));
            r02.BLY();
            C146777Bo A002 = AnonymousClass73K.A00(r02);
            if (A002 != null && (r0 = A002.A00) != null) {
                return r0.A00;
            }
            throw AnonymousClass001.A0c("Encountered empty BloksResponse. Could not parse embedded payload");
        } catch (IOException unused) {
            throw AnonymousClass001.A0c("Could not parse embedded payload");
        }
    }
}
