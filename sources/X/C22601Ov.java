package X;

import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.1Ov  reason: invalid class name and case insensitive filesystem */
public class C22601Ov extends C56822sc {
    public final C56972sr A00;
    public final AnonymousClass33E A01;
    public final C64663Ek A02;
    public final AnonymousClass314 A03;
    public final C622334f A04;
    public final C56612sH A05;
    public final AnonymousClass33p A06;
    public final C28871hu A07;
    public final C56922sm A08;
    public final C56982ss A09;

    public List A0D() {
        Cursor A0E;
        if (this.A00.A0Y()) {
            C626936e.A0D(false, "unarchive-chats-setting-handler/Companion should not create Unarchive Chats Setting mutation");
            return Collections.emptyList();
        }
        Log.i("unarchive-chats-setting-handler/onUnarchiveChatsSettingChanged");
        ArrayList A0s = AnonymousClass001.A0s();
        HashSet A15 = AnonymousClass0x9.A15(this.A03.A06());
        C623934v r0 = this.A00;
        ArrayList A0s2 = AnonymousClass001.A0s();
        AnonymousClass4GK A012 = C18630y0.A01(r0);
        try {
            C56862sg r4 = ((AnonymousClass3H0) A012).A03;
            String[] A1a = AnonymousClass0x7.A1a("archive", 0);
            C18280x3.A1Q(A1a, 0, 1);
            A0E = r4.A0E("SELECT chat_jid FROM syncd_mutations WHERE mutation_name = ? AND are_dependencies_missing = ?", "syncd_mutations.SELECT_CHAT_JIDS_BY_MUTATION_NAME_AND_DEPENDENCY", A1a);
            int columnIndexOrThrow = A0E.getColumnIndexOrThrow("chat_jid");
            while (A0E.moveToNext()) {
                C95814uZ A0K = AnonymousClass0x2.A0K(A0E, columnIndexOrThrow);
                C626936e.A06(A0K);
                A0s2.add(A0K);
            }
            A0E.close();
            A012.close();
            ListIterator listIterator = A0s2.listIterator();
            AnonymousClass33p r42 = this.A06;
            if (C18280x3.A1W(AnonymousClass0x2.A0F(r42), "notify_new_message_for_archived_chats")) {
                while (listIterator.hasNext()) {
                    if (!A15.contains(listIterator.next())) {
                        listIterator.remove();
                    }
                }
                Iterator it = A0s2.iterator();
                while (it.hasNext()) {
                    C95814uZ A0P = C18300x5.A0P(it);
                    this.A02.A07(1);
                    C56612sH r6 = this.A05;
                    A0s.add(new AnonymousClass1SY(A0P, r6.A0H(), false));
                    A0s.add(new AnonymousClass1SW(this.A01.A04(A0P, false), A0P, r6.A0H(), true));
                }
            } else {
                while (listIterator.hasNext()) {
                    if (A15.contains(listIterator.next())) {
                        listIterator.remove();
                    }
                }
                Iterator it2 = A0s2.iterator();
                while (it2.hasNext()) {
                    C95814uZ A0P2 = C18300x5.A0P(it2);
                    A0s.add(new AnonymousClass1SW(this.A01.A04(A0P2, false), A0P2, this.A05.A0H(), false));
                }
            }
            ArrayList A0J = AnonymousClass002.A0J(A0s);
            A0J.add(new AnonymousClass1SJ((AnonymousClass33J) null, (String) null, this.A05.A0H(), C18280x3.A1W(AnonymousClass0x2.A0F(r42), "notify_new_message_for_archived_chats")));
            return A0J;
        } catch (Throwable th) {
            try {
                A012.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public final void A0E(C95814uZ r4, boolean z) {
        AnonymousClass31A A002 = C56982ss.A00(this.A09, r4);
        if (A002 == null) {
            Log.d("UnarchiveChatsSettingHandler/setArchivedState chat info is null");
        } else if (A002.A0i != z) {
            C18260x0.A1E("UnarchiveChatsSettingsHAndler/setArchive -", AnonymousClass001.A0o(), z);
            A002.A0i = z;
            this.A08.A0G(A002);
            this.A07.A08();
        }
    }

    public C22601Ov(C56972sr r1, AnonymousClass33E r2, C64663Ek r3, AnonymousClass314 r4, C622334f r5, C56612sH r6, AnonymousClass33p r7, C28871hu r8, C56922sm r9, C56982ss r10, C623934v r11) {
        super(r11);
        this.A05 = r6;
        this.A08 = r9;
        this.A00 = r1;
        this.A09 = r10;
        this.A04 = r5;
        this.A07 = r8;
        this.A01 = r2;
        this.A02 = r3;
        this.A06 = r7;
        this.A03 = r4;
    }
}
