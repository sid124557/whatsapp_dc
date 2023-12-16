package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;

/* renamed from: X.2Xp  reason: invalid class name and case insensitive filesystem */
public class C44822Xp {
    public HashSet A00;
    public final C54292oU A01;

    public HashSet A00() {
        ObjectInputStream objectInputStream;
        HashSet hashSet = this.A00;
        if (hashSet != null) {
            return hashSet;
        }
        File A0A = AnonymousClass002.A0A(C54292oU.A03(this.A01), "invalid_numbers");
        if (A0A.exists() && A0A.canRead()) {
            try {
                FileInputStream A0g = AnonymousClass0x9.A0g(A0A);
                try {
                    objectInputStream = new ObjectInputStream(A0g);
                    this.A00 = (HashSet) objectInputStream.readObject();
                    objectInputStream.close();
                    A0g.close();
                } catch (Throwable th) {
                    A0g.close();
                    throw th;
                }
            } catch (IOException | ClassNotFoundException | IllegalArgumentException e) {
                Log.e(e);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        HashSet hashSet2 = this.A00;
        if (hashSet2 != null) {
            return hashSet2;
        }
        HashSet A0K = AnonymousClass002.A0K();
        this.A00 = A0K;
        return A0K;
        throw th;
    }

    public C44822Xp(C54292oU r1) {
        this.A01 = r1;
    }
}
