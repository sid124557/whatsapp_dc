package X;

import android.database.Cursor;
import android.database.SQLException;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1Ra  reason: invalid class name and case insensitive filesystem */
public class C23031Ra extends AnonymousClass31D {
    public final C623334p A00;

    public boolean A0T(C44342Vr r15) {
        Cursor A0E;
        this.A01.A0A("jid-store-migration-pending", false, (String) null);
        C623334p r7 = this.A00;
        C72303dV r6 = r7.A01;
        r6.A05();
        File file = r6.A05;
        long length = file.length();
        C18260x0.A12("JidStore/populateJidTable/start/db size=", AnonymousClass001.A0o(), length);
        AnonymousClass33M A01 = AnonymousClass33M.A01("JidStore/populate");
        try {
            C85284Fq A04 = r6.A04();
            try {
                C69833Yo Axl = A04.Axl();
                try {
                    C56862sg r10 = ((AnonymousClass3H0) A04).A03;
                    A0E = r10.A0E("SELECT DISTINCT key_remote_jid FROM chat_list", "GET_DISTINCT_JID_FROM_CHAT_LIST_SQL", new String[0]);
                    r7.A0E(A0E);
                    if (A0E != null) {
                        A0E.close();
                    }
                    A0E = r10.A0E("SELECT DISTINCT key_remote_jid FROM messages", "GET_DISTINCT_JID_FROM_MESSAGES_SQL", new String[0]);
                    r7.A0E(A0E);
                    if (A0E != null) {
                        A0E.close();
                    }
                    A0E = r10.A0E("SELECT DISTINCT remote_resource FROM messages", "GET_DISTINCT_JID_FROM_MESSAGES_REMOTE_RESOURCE_SQL", new String[0]);
                    r7.A0E(A0E);
                    if (A0E != null) {
                        A0E.close();
                    }
                    A0E = r10.A0E("SELECT DISTINCT remote_resource FROM messages WHERE needs_push = 2", "GET_DISTINCT_JIDS_FROM_MESSAGES_BROADCAST_PARTICIPANTS_SQL", new String[0]);
                    r7.A0E(A0E);
                    if (A0E != null) {
                        A0E.close();
                    }
                    A0E = r10.A0E("SELECT DISTINCT mentioned_jids FROM messages WHERE mentioned_jids IS NOT NULL", "GET_DISTINCT_JIDS_FROM_MESSAGES_MENTIONED_SQL", new String[0]);
                    r7.A0E(A0E);
                    if (A0E != null) {
                        A0E.close();
                    }
                    A0E = r10.A0E("SELECT DISTINCT jid FROM group_participants", "GET_DISTINCT_JID_FROM_GROUP_PARTICIPANTS_SQL", new String[0]);
                    r7.A0E(A0E);
                    if (A0E != null) {
                        A0E.close();
                    }
                    A0E = r10.A0E("SELECT DISTINCT jid FROM group_participants_history", "GET_DISTINCT_JIDS_FROM_GROUP_PARTICIPANTS_HISTORY_SQL", new String[0]);
                    r7.A0E(A0E);
                    if (A0E != null) {
                        A0E.close();
                    }
                    r7.A02.A03("jid_ready", 1);
                    Axl.A00();
                    Axl.close();
                    A04.close();
                } catch (Throwable th) {
                    Axl.close();
                    throw th;
                }
            } catch (Throwable th2) {
                A04.close();
                throw th2;
            }
        } catch (SQLException e) {
            Log.e("JidStore/populateJidTable/Error populating jid table", e);
            r7.A00.A0A("JidStore/populateJidTable", true, "JidStore/populateJidTable/error");
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass33M.A03(A01, "JidStore/populateJidTable/time spent=", A0o);
        A0o.append("; count=");
        C18260x0.A1G(A0o, r7.A03.size());
        r6.A05();
        long length2 = file.length();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("JidStore/populateJidTable/end/db size=");
        A0o2.append(length2);
        A0o2.append("; increase=");
        A0o2.append(((double) length2) / ((double) length));
        C18280x3.A14(A0o2);
        return true;
        throw th;
    }

    public C23031Ra(C623334p r3, AnonymousClass2U4 r4) {
        super(r4, "migration_jid_store", Integer.MIN_VALUE);
        C626936e.A06(r3);
        this.A00 = r3;
    }
}
