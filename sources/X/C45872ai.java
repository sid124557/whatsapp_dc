package X;

import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2ai  reason: invalid class name and case insensitive filesystem */
public class C45872ai {
    public final C66663Mh A00;
    public final C55252q3 A01;
    public final C56612sH A02;
    public final JniBridge A03;

    public C45872ai(C66663Mh r1, C55252q3 r2, C56612sH r3, JniBridge jniBridge) {
        this.A02 = r3;
        this.A03 = jniBridge;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final List A00(List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            JniBridge jniBridge = this.A03;
            Object jvidispatchOOO = JniBridge.jvidispatchOOO(1, AnonymousClass0x9.A0r(jniBridge), ((C51502jv) it.next()).A01);
            if (jvidispatchOOO == null) {
                Log.e("wamsys/convertToNativePublicKeyList/public-key-conversion-failed");
                return null;
            }
            A0s.add(jvidispatchOOO);
        }
        return A0s;
    }
}
