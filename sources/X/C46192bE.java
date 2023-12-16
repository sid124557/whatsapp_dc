package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

/* renamed from: X.2bE  reason: invalid class name and case insensitive filesystem */
public class C46192bE {
    public final C56972sr A00;
    public final C64773Ex A01;
    public final C614530v A02;
    public final C55832qz A03;

    /* JADX INFO: finally extract failed */
    public ArrayList A00(UserJid userJid) {
        Throwable th;
        boolean z;
        UserJid A0o;
        if (userJid == null) {
            return AnonymousClass001.A0s();
        }
        C614530v r1 = this.A02;
        TreeSet treeSet = new TreeSet(Collections.reverseOrder());
        long A05 = r1.A08.A05(userJid);
        AnonymousClass4GK A032 = r1.A0A.get();
        try {
            C56862sg r6 = ((AnonymousClass3H0) A032).A03;
            String l = Long.toString(A05);
            Cursor A0E = r6.A0E("SELECT message_row_id FROM message_vcard WHERE _id IN (SELECT vcard_row_id FROM message_vcard_jid WHERE vcard_jid_row_id = ?)", "GET_VCARDS_BY_JID_SQL", new String[]{l});
            try {
                int columnIndexOrThrow = A0E.getColumnIndexOrThrow("message_row_id");
                while (A0E.moveToNext()) {
                    C18260x0.A0H(A0E, treeSet, columnIndexOrThrow);
                }
                A0E.close();
                Cursor A0E2 = r6.A0E("SELECT message_row_id FROM message_vcard_jid WHERE vcard_jid_row_id = ?", "GET_VCARD_MESSAGE_ROW_ID_BY_JID_ROW_ID", new String[]{l});
                try {
                    int columnIndexOrThrow2 = A0E2.getColumnIndexOrThrow("message_row_id");
                    while (A0E2.moveToNext()) {
                        long j = A0E2.getLong(columnIndexOrThrow2);
                        if (j != 0) {
                            AnonymousClass0x2.A1Q(treeSet, j);
                        }
                    }
                    A0E2.close();
                    A032.close();
                    ArrayList A0J = AnonymousClass002.A0J(treeSet);
                    ArrayList A0s = AnonymousClass001.A0s();
                    Iterator it = A0J.iterator();
                    while (it.hasNext()) {
                        long A022 = C18270x1.A02(it);
                        C624134x A002 = C55122pp.A00(this.A03, A022);
                        AnonymousClass38X r4 = null;
                        if (!(A002 == null || (A0o = A002.A0o()) == null)) {
                            r4 = new AnonymousClass38X(A022, userJid.getRawString(), A0o.getRawString());
                        }
                        if (r4 != null) {
                            A0s.add(r4);
                        }
                    }
                    if (A0s.isEmpty()) {
                        return A0s;
                    }
                    ArrayList A0y = C18290x4.A0y(A0s);
                    HashMap A0t = AnonymousClass001.A0t();
                    Iterator it2 = A0s.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass38X r3 = (AnonymousClass38X) it2.next();
                        UserJid A08 = AnonymousClass32Y.A08(r3.A02);
                        if (A08 != null) {
                            if (A0t.containsKey(A08)) {
                                z = AnonymousClass001.A1Z(C18290x4.A0i(A08, A0t));
                            } else {
                                AnonymousClass3ZH A07 = this.A01.A07(A08);
                                if (A07 == null || (!C56972sr.A08(this.A00, A07) && A07.A0F == null)) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                AnonymousClass000.A1C(A08, A0t, z);
                            }
                            if (z) {
                                A0y.add(r3);
                            }
                        }
                    }
                    return A0y;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } catch (Throwable th3) {
                th = th3;
                if (A0E != null) {
                    A0E.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            try {
                A032.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    public C46192bE(C56972sr r1, C64773Ex r2, C614530v r3, C55832qz r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }
}
