package X;

import android.util.SparseIntArray;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Zp  reason: invalid class name and case insensitive filesystem */
public class C45332Zp {
    public boolean A00;
    public final C613430h A01;
    public final C183538qC A02;

    public synchronized void A00() {
        if (!this.A00) {
            Iterator A0j = AnonymousClass0x2.A0j(this.A02);
            while (A0j.hasNext()) {
                AnonymousClass4DA r9 = (AnonymousClass4DA) A0j.next();
                C613430h r8 = this.A01;
                int[] B81 = r9.B81();
                List list = r8.A0D;
                int size = list.size();
                list.add(r9);
                int length = B81.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        int i2 = B81[i];
                        SparseIntArray sparseIntArray = r8.A03;
                        if (sparseIntArray.get(i2, -1) == -1) {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            C18260x0.A1T(A0o, "XmppIncomingMessageRouter/registerHandler:", r9);
                            AnonymousClass0x2.A18(A0o);
                            sparseIntArray.put(i2, size);
                            i++;
                        } else {
                            throw AnonymousClass000.A0G("Already have registered handler for recv message type:", AnonymousClass001.A0o(), i2);
                        }
                    }
                }
            }
            this.A00 = true;
        }
    }

    public C45332Zp(C613430h r1, C183538qC r2) {
        this.A02 = r2;
        this.A01 = r1;
    }
}
