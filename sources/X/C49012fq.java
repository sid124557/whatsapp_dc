package X;

import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import java.util.Collections;

/* renamed from: X.2fq  reason: invalid class name and case insensitive filesystem */
public class C49012fq {
    public AnonymousClass8OQ A00;
    public final C56612sH A01;
    public final AnonymousClass1R7 A02;

    public AnonymousClass8OQ A00() {
        AnonymousClass8OQ r0;
        Cursor A012;
        synchronized (this) {
            if (this.A00 == null) {
                AnonymousClass4GK A0B = this.A02.get();
                try {
                    A012 = C56862sg.A01(((AnonymousClass3H0) A0B).A03, C39012Ai.A00, "getDevices/QUERY_DEVICES");
                    int columnIndexOrThrow = A012.getColumnIndexOrThrow("device_id");
                    int columnIndexOrThrow2 = A012.getColumnIndexOrThrow("platform_type");
                    int columnIndexOrThrow3 = A012.getColumnIndexOrThrow("device_os");
                    int columnIndexOrThrow4 = A012.getColumnIndexOrThrow("last_active");
                    int columnIndexOrThrow5 = A012.getColumnIndexOrThrow("login_time");
                    int columnIndexOrThrow6 = A012.getColumnIndexOrThrow("logout_time");
                    int columnIndexOrThrow7 = A012.getColumnIndexOrThrow("adv_key_index");
                    int columnIndexOrThrow8 = A012.getColumnIndexOrThrow("full_sync_required");
                    int columnIndexOrThrow9 = A012.getColumnIndexOrThrow("place_name");
                    int columnIndexOrThrow10 = A012.getColumnIndexOrThrow("nickname");
                    int columnIndexOrThrow11 = A012.getColumnIndexOrThrow("support_bot_user_agent_chat_history");
                    int columnIndexOrThrow12 = A012.getColumnIndexOrThrow("support_cag_reactions_and_polls_history");
                    C160667o6 r5 = new C160667o6();
                    while (A012.moveToNext()) {
                        DeviceJid nullable = DeviceJid.getNullable(A012.getString(columnIndexOrThrow));
                        if (nullable != null) {
                            AnonymousClass23P A002 = AnonymousClass23P.A00(A012.getInt(columnIndexOrThrow2));
                            boolean z = true;
                            boolean A1U = AnonymousClass000.A1U(A012.getInt(columnIndexOrThrow11), 1);
                            if (A012.getInt(columnIndexOrThrow12) != 1) {
                                z = false;
                            }
                            C59732xO r4 = new C59732xO(A1U, z);
                            String string = A012.getString(columnIndexOrThrow3);
                            long j = A012.getLong(columnIndexOrThrow4);
                            long j2 = A012.getLong(columnIndexOrThrow5);
                            long j3 = A012.getLong(columnIndexOrThrow6);
                            r5.put(nullable, new AnonymousClass33G(r4, nullable, A002, string, A012.getString(columnIndexOrThrow9), A012.getString(columnIndexOrThrow10), A012.getInt(columnIndexOrThrow7), j, j2, j3, AnonymousClass000.A1U(1, A012.getInt(columnIndexOrThrow8))));
                        }
                    }
                    this.A00 = r5.build();
                    A012.close();
                    A0B.close();
                } catch (Throwable th) {
                    try {
                        A0B.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            r0 = this.A00;
        }
        return r0;
        throw th;
    }

    public void A01(C129526aS r8) {
        C85284Fq A0C = this.A02.A0C();
        try {
            C69833Yo Axl = A0C.Axl();
            try {
                synchronized (this) {
                    String[] A0O = C627336j.A0O(r8);
                    String join = TextUtils.join(", ", Collections.nCopies(A0O.length, "?"));
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("device_id IN (");
                    A0o.append(join);
                    ((AnonymousClass3H0) A0C).A03.A07("devices", AnonymousClass000.A0e(A0o), "removeDevices/DELETE_DEVICES", A0O);
                    Axl.A00();
                    this.A00 = null;
                }
                Axl.close();
                A0C.close();
            } catch (Throwable th) {
                Axl.close();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                A0C.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public C49012fq(C55682qk r3, C56612sH r4, C54292oU r5, C60972zT r6, C45932ao r7) {
        this.A01 = r4;
        this.A02 = new AnonymousClass1R7(r5.A00, r3, r6, r7);
    }
}
