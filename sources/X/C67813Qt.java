package X;

import android.util.SparseArray;
import java.util.HashSet;

/* renamed from: X.3Qt  reason: invalid class name and case insensitive filesystem */
public final class C67813Qt implements AnonymousClass4FA {
    public SparseArray A00 = new SparseArray();
    public HashSet A01 = AnonymousClass002.A0K();

    public /* synthetic */ void BRj(C56202rb r1) {
    }

    public /* synthetic */ void Bc2(C56202rb r1) {
    }

    public void Bc3(C56202rb r4) {
        Integer num = r4.A0B;
        if (num != null) {
            HashSet hashSet = this.A01;
            synchronized (hashSet) {
                if (hashSet.remove(num)) {
                    C18260x0.A1P(AnonymousClass001.A0o(), "IncomingStanzaProcessingCache/onStanzaProcessed/removed stanza from processing queue:", r4);
                }
            }
        }
    }

    public /* synthetic */ void Bc4(C56202rb r1) {
    }

    public /* synthetic */ void BRG() {
    }
}
